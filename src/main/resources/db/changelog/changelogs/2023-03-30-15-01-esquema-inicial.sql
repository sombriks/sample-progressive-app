-- liquibase formatted sql
-- changeset sombriks:2023-03-30-15-01-esquema-inicial.sql

create table tarefas (
    id integer not null auto_increment,
    descricao text not null,
    criado_em timestamp not null default now(),
    atualizado_em timestamp not null default now(),
    primary key (id)
);

-- rollback drop table tarefa;
