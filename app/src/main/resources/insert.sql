insert into tb03_situacao_leitor (descricao_situacao) values
("Matriculado"),
("Transferido"),
("Concluinte"),
("Funcionario");

insert into tb04_tipo_leitor (tipo_leitor, tipo_descricao, prazo_max_dias, quantidade_livros) values
("Aluno", "Aluno devidamente matriculado na UE", 30, 3),
("Concluinte", "Aluno concluinte e deverá realizar empréstimo apenas quando endereço devidamente preenchido", 30, 1),
("Professor", "Professor atuante na UE, não deverá realizar emprestimos além do ano letivo", 30, 6),
("Direção", "Equipe gestora da unidade escolar", 30, 10),
("Terceiros", "Funcionarios sem vinculos empregaticios com a UE, deverá realizar empréstimo apenas quando endereço devidamente preenchido", 20, 1),
("Outros", "Demais funcionarios da UE que não se enquadram em nenhuma categoria mencionada", 30, 3);