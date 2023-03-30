-- liquibase formatted sql
-- changeset sombriks:2023-03-30-15-02-carga-inicial.sql

insert into tarefas
    (descricao)
values
    ('Laundry'),
    ('Cook'),
    ('Clean'),
    ('Shower');

-- rollback delete from tarefas;
