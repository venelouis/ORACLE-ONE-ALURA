alter table respostas add column topico_id bigint not null;
alter table respostas add constraint fk_respostas_topico_id foreign key(topico_id) references topicos(id) on delete cascade;