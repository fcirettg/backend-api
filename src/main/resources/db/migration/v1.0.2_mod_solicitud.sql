CREATE TABLE IF NOT EXISTS solicitud
(
    folio SERIAL PRIMARY KEY,
    fecha_rec TIMESTAMP WITH TIME ZONE,
    fecha_serv TIMESTAMP WITH TIME ZONE,
    hora time with time zone,
    estado smallint,
    id_afiliado integer NOT NULL,
    cantidad_pet Integer DEFAULT 0 NOT NULL,
    cantidad_papel Integer DEFAULT 0 NOT NULL,
    cantidad_vidrio Integer DEFAULT 0 NOT NULL,
    cantidad_alu Integer DEFAULT 0 NOT NULL,
    CONSTRAINT afiliado_fk FOREIGN KEY (id_afiliado)
        REFERENCES afiliado (id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
);
