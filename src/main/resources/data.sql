-- CREATE TABLE cliente (
--                               id INT AUTO_INCREMENT PRIMARY KEY,
--                               nome VARCHAR(250) NOT NULL,
--                               idade INT NULL,
--                               cpf VARCHAR(11) DEFAULT NULL
-- );

INSERT INTO cliente (nome, idade, cpf) VALUES
                                                         ('Bruno', 32, '44444444444'),
                                                         ('Brenna', 21, '11111111111'),
                                                         ('Victor', 26, '22222222222'),
                                                         ('Maria', 74, '33333333333');

INSERT INTO apolice (descricao, premio, cliente_id) VALUES
('Seguro de Carro', 32000.00, 1),
('Seguro de casa', 600000.50, 1),
('Seguro de celular', 2350.00, 2),
('Seguro de notebook', 4000.00, 3);

