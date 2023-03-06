
CREATE TABLE IF NOT EXISTS paciente (
id int auto_increment primary key,
nome varchar(16),
sobrenome varchar(48),
rg varchar(10),
data_cadastro DATE,
endereco varchar(200));
