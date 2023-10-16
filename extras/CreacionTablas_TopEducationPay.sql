
CREATE TABLE estudiante(
    ID_estudiante serial NOT null,
    nRut int,
    cRut int,
    nombres char[30],
    apellidos char[30],
    fechaNac date,
    tipoColegio int,
    nombreColegio char[30],
    anoEgreso int,
    PRIMARY KEY (ID_estudiante)
);

CREATE TABLE pago(
    ID_pago serial NOT null,
    nombre char[10],
    monto int,
    expira date,
    pagado bool,
    ID_estudiante int,
    PRIMARY KEY (ID_pago),
    FOREIGN KEY (ID_estudiante) REFERENCES estudiante(ID_estudiante)
);

CREATE TABLE promedio(
    ID_promedio serial NOT null,
    nota int,
    ID_estudiante int,
    PRIMARY KEY (ID_promedio),
    FOREIGN KEY (ID_estudiante) REFERENCES estudiante(ID_estudiante)
);