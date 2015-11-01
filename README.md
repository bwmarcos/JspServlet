# JspServlet
Aplicação Utilizando JSP com Banco Oracle


Queries do banco

```sql
DROP TABLE cliente cascade constraints;
DROP TABLE endereco cascade constraints;

CREATE TABLE cliente (
  idCliente   number(10)  PRIMARY KEY,
  nome    varchar(30) not null,
  email     varchar(30) not null,
  sexo    varchar(30) not null,
  dataNasc  date    not null);

CREATE TABLE Endereco (
  idEndereco  number(10)  PRIMARY KEY,
  rua     varchar(60) not null,
  bairro    varchar(60) not null,
  cidade    varchar(60) not null, 
  id_cliente  number(10)  not null,
  FOREIGN KEY(id_cliente) REFERENCES Cliente (idCliente));

desc cliente;
desc endereco;

DROP SEQUENCE seqcli;
DROP SEQUENCE seqend;

CREATE SEQUENCE seqcli;
CREATE SEQUENCE seqend;

select idCliente,
       nome,
       email,
       sexo,
       to_char(datanasc, 'DD/MM/YYYY') as nascimento,
       rua,
       bairro,
       cidade
  from cliente
 inner join endereco
    on idCliente = id_cliente;
```

