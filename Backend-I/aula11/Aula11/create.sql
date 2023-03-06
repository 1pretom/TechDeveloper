CREATE TABLE IF NOT EXISTS medicamento (
id INT auto_increment PRIMARY KEY,
nome VARCHAR(255) NOT NULL,
laboratorio VARCHAR(200) NOT NULL,
quantidade INT,
preco NUMERIC(12,2)
);