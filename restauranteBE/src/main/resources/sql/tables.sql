create table zonas(
    idZona serial primary key,
    nombre varchar(20) not null
);
create table mesas(
    idMesa serial primary key,
    idZona integer,
    numero varchar(3),
    capacidad integer,
    estado varchar(20) default 'LIBRE',
    constraint zonasID foreign key (idZona) references zonas (idZona)
);
alter sequence mesas_idmesa_seq restart with 61;
Create table clientes (
    idCliente serial primary key,
    nombre varchar(20) not null,
    tipoDocumento varchar(10),
    documento varchar(20),
    direccion varchar (50),
    telefono varchar(9),
    email varchar(40)
);
create table reservas(
    idReserva serial primary key,
    idMesa integer not null,
    idCliente integer not null,
    nombreReserva varchar(100) not null,
    fechaReserva Date not null,
    horaReserva time not null,
    fechaRegistro timestamp,
    activo boolean,
    eliminado boolean,
    constraint mesasID foreign key (idMesa) references mesas (idMesa),
    constraint clientesID foreign key (idCliente) references clientes (idCliente)
);
Create table formularios(
    idFormulario serial primary key,
    nombre varchar(45) not null,
    visible boolean default false
);
create table perfiles(
    idPerfil serial primary key,
    nombre varchar(20) not null
);
create table permisos(
    idPermiso serial primary key,
    idPerfil integer not null,
    idFormulario integer not null,
    constraint perfilesID foreign key (idPerfil) references perfiles (idPerfil),
    constraint formulariosID foreign key (idFormulario) references formularios (idFormulario)
);
create table usuarios (
    idUsuario serial primary key,
    idPerfil integer not null,
    idCliente integer,
    nombre varchar (20) not null,
    apPaterno varchar (20) not null,
    apMaterno varchar (20) not null,
    dni varchar (8) not null,
    email varchar (40) not null,
    contrasena varchar(40) not null,
    fechaNacimiento date not null,
    nombreFoto varchar(255),
    eliminado boolean default false,
    numeroMozo integer,
    clave varchar(20),
    constraint perfilesID foreign key (idPerfil) references perfiles (idPerfil),
    constraint usuariosID foreign key (idCliente) references clientes (idCliente)
);
create table ordenes (
    idOrden serial primary key,
    idMesa integer not null,
    idUsuarioAtencion integer not null,
    estado varchar(30) default 'PENDIENTE',
    observacion varchar(255),
    turno varchar(20) not null,
    fechaCreacion timestamp,
    atendidoCocina boolean default false,
    correlativoDiario integer,
    constraint mesasID foreign key (idMesa) references mesas (idMesa),
    constraint usuariosID foreign key (idUsuarioAtencion) references usuarios (idUsuario)
);

create table cambio_mesas (
    idCambioMesa serial primary key,
    idOrden integer not null,
    idMesaAnterior integer not null,
    motivo varchar(255),
    constraint mesasID foreign key (idMesaAnterior) references mesas (idMesa),
    constraint ordenesID foreign key (idOrden) references ordenes (idOrden)
);
create table categoria_menus (
    idCategoriaMenu serial primary key,
    nombre varchar(30) not null,
    cocina boolean default true
);
create table menus (
    idMenu serial primary key,
    idCategoriaMenu integer not null,
    nombre varchar(40) not null,
    precio decimal(8,2) not null,
    descripcion varchar(255) not null,
    visible boolean default true,
    eliminado boolean default false,
    constraint categoriasID foreign key (idCategoriaMenu) references categoria_menus (idCategoriaMenu)
);
create table productos (
    idProducto serial primary key,
    nombre varchar(30) not null,
    descripcion varchar(20) not null
);
alter sequence productos_idproducto_seq restart with 2;
create table ingredientes (
    idIngredientes serial primary key,
    idMenu integer not null,
    idProducto integer not null,
    cantidad decimal(8,2) not null,
    unidades varchar(20),
    constraint menusID foreign key (idMenu) references menus (idMenu),
    constraint productosID foreign key (idProducto) references productos (idProducto)
);
create table combos (
    idCombo serial primary key,
    nombre varchar(50) not null,
    descripcion varchar(255),
    precio decimal(8,2) not null,
    eliminado boolean default false,
    visible boolean default true
);
create table menu_combos (
    idMenuCombo serial primary key,
    idMenu integer not null,
    idCombo integer not null,
    constraint menusID foreign key (idMenu) references menus (idMenu),
    constraint combosID foreign key (idCombo) references combos (idCombo)
);
create table medios_venta (
    idMedioVenta serial primary key,
    medio varchar(10) not null,
    abreviacion varchar (10) not null
);
create table arqueos_caja (
    idArqueoCaja serial primary key,
    idUsuario integer not null,
    fecha date not null,
    turno varchar(10) not null,
    observacion boolean default false,
    descripcion varchar(255),
    constraint usuariosID foreign key (idUsuario) references usuarios (idUsuario)
);
create table medios_arqueo(
    idMedioArqueo serial primary key,
    idArqueoCaja integer not null,
    medio varchar(10) not null,
    abreviacion varchar(10) not null,
    saldoInicial decimal(8,2),
    totalIngresos decimal(8,2),
    descuadre varchar (20) default 'CAJA CUADRADA',
    montoDescuadre decimal(8,2),
    constraint arqueosID foreign key (idArqueoCaja) references arqueos_caja (idArqueoCaja)
);
create table ventas (
    idVenta serial primary key,
    idMedioVenta integer not null,
    idCliente integer not null,
    idArqueoCaja integer,
    fecha timestamp not null,
    ventaDirecta boolean default false,
    numeroTransaccion integer,
    total decimal(8,2) not null,
    turno varchar (10) not null,
    descripcion varchar(255),
    constraint mediosVentaID foreign key (idMedioVenta) references medios_Venta (idMedioVenta),
    constraint clientesID foreign key (idCliente) references clientes (idCliente),
    constraint arqueosCajaID foreign key (idArqueoCaja) references arqueos_caja (idArqueoCaja)
);
create table comprobantes (
    idComprobante serial primary key,
    idVenta integer not null,
    numero serial,
    nombre varchar(20) not null,
    abreviacion varchar(10) not null,
    razonSocial varchar(100),
    rucDni varchar(20),
    constraint ventasID foreign key (idVenta)references ventas (idVenta)
);
create table detalle_ordenes (
    idDetalleOrden serial primary key,
    idOrden integer not null,
    idVenta integer not null,
    idMenu integer,
    idCombo integer,
    nombreMenu varchar(50) not null,
    cantidad integer not null,
    precioUnitario decimal(8,2) not null,
    precioTotal decimal(8,2) not null,
    esCombo boolean default false,
    estado varchar(30) default 'PENDIENTE',
    observacion varchar(255),
    notaCocina varchar(255),
    llevar boolean default false,
    delivery boolean default false,
    atendidoCocina boolean default false,
    constraint ordenesID foreign key (idOrden) references ordenes (idOrden),
    constraint menusID foreign key (idMenu) references menus (idMenu),
    constraint ventasID foreign key (idVenta) references ventas (idVenta),
    constraint combosID foreign key (idCombo) references menu_combos (idMenuCombo)
);
