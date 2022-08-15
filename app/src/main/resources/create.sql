drop table if exists tb05_advertencia;
drop table if exists tb06_historico_emprestimo;
drop table if exists tb02_contato;
drop table if exists tb01_leitor;
drop table if exists tb03_situacao_leitor;
drop table if exists tb04_tipo_leitor;

create table tb01_leitor(
    codigo_leitor CHAR(36) PRIMARY KEY DEFAULT (uuid()),
    nome_leitor VARCHAR(100) NOT NULL,
    matricula_leitor CHAR(9),
    codigo_situacao TINYINT,
    codigo_tipo TINYINT,
    data_cadastro DATE NOT NULL,
    data_exclusao DATE,
    data_atualizacao DATETIME
);
create table tb02_contato(
	codigo_contato CHAR(36) PRIMARY KEY DEFAULT (uuid()),
    codigo_leitor CHAR(36) NOT NULL,
    lougradouro VARCHAR(100),
    numero TINYINT,
    bairro VARCHAR(50),
    codigo_postal CHAR(9),
    cidade VARCHAR(100),
    sigla_uf CHAR(2),
    numero_celular CHAR(11)
);
create table tb03_situacao_leitor(
	codigo_situacao TINYINT PRIMARY KEY AUTO_INCREMENT,
    descricao_situacao VARCHAR(50)
);

create table tb04_tipo_leitor(
	codigo_tipo TINYINT PRIMARY KEY AUTO_INCREMENT,
    tipo_leitor VARCHAR(20) NOT NULL,
    tipo_descricao VARCHAR (150) NOT NULL,
    prazo_max_dias TINYINT NOT NULL,
    quantidade_livros TINYINT NOT NULL
);

create table tb05_advertencia(
	codigo_advertencia CHAR(36) PRIMARY KEY DEFAULT (uuid()),
    codigo_leitor CHAR(36) NOT NULL,
    data_advertencia DATE NOT NULL,
    descricao_advertencia VARCHAR(100) NOT NULL
);

create table tb06_historico_emprestimo(
	codigo_livro CHAR(36) NOT NULL,
    codigo_leitor CHAR(36) NOT NULL,
    nome_leitor VARCHAR(100),
    nome_livro VARCHAR(100),
    data_emprestimo DATETIME,
    data_devolucao DATETIME,
    PRIMARY KEY (`codigo_livro`,`codigo_leitor`)
);

ALTER TABLE `tb02_contato` ADD CONSTRAINT `fk_contato_leitor` FOREIGN KEY (`codigo_leitor`) REFERENCES `tb01_leitor` (`codigo_leitor`);
ALTER TABLE `tb01_leitor` ADD CONSTRAINT `fk_leitor_situacao` FOREIGN KEY (`codigo_situacao`) REFERENCES `tb03_situacao_leitor` (`codigo_situacao`);
ALTER TABLE `tb01_leitor` ADD CONSTRAINT `fk_leitor_tipo` FOREIGN KEY (`codigo_tipo`) REFERENCES `tb04_tipo_leitor` (`codigo_tipo`);
ALTER TABLE `tb05_advertencia` ADD CONSTRAINT `fk_advertencia_leitor` FOREIGN KEY (`codigo_leitor`) REFERENCES `tb01_leitor` (`codigo_leitor`);