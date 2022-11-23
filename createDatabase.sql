CREATE DATABASE db_projetos;

USE DB_PROJETOS;

CREATE TABLE projetos(
  Nome_Projeto varchar(100) NOT NULL,
  Nome_Professor varchar(50) NOT NULL,
  PRIMARY KEY (Nome_Projeto)
);
CREATE TABLE rubricas (
  Nome_Projeto varchar(100) NOT NULL,
  Capital_Previsto float NOT NULL,
  Capital_Gasto float DEFAULT 0.0,
  Material_Consumo_Previsto float NOT NULL,
  Material_Consumo_Gasto float DEFAULT 0.0,
  Servicos_PF_Previsto float NOT NULL,
  Servicos_PF_Gasto float DEFAULT 0.0,
  Servicos_PJ_Previsto float NOT NULL,
  Servicos_PJ_Gasto float DEFAULT 0.0,
  Diarias_Previsto float NOT NULL,
  Diarias_Gasto float DEFAULT 0.0,
  Passagens_Previsto float NOT NULL,
  Passagens_Gasto float DEFAULT 0.0,
  KEY Nome_Projeto(Nome_Projeto),
  FOREIGN KEY (Nome_Projeto) REFERENCES projetos(Nome_Projeto)
);

CREATE TABLE lista_despesas (
  Nome_Projet varchar(100) NOT NULL,
  Despesas char(100) NOT NULL,
  FOREIGN KEY (Nome_Projeto) REFERENCES projetos(Nome_Projeto)
);
