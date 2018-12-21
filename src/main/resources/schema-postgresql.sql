CREATE TABLE tipo (
    id_tp Bigserial PRIMARY KEY NOT NULL,
    nome varchar(100) NOT NULL,
);

CREATE TABLE receita (
    id BIGINT PRIMARY KEY NOT NULL,
    descricao varchar(100) NOT NULL,
    vencimento date NOT NULL
    valor BIGINT NOT NULL
    id_tipo BIGINT,
    FOREIGN KEY (id_tipo) REFERENCES tipo(id_tp)
);
