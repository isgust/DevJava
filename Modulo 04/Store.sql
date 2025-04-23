--Tabela de Produtos
CREATE TABLE Produtos(
	id SERIAL PRIMARY KEY,
	nome VARCHAR(50) NOT NULL UNIQUE,
	preco DECIMAL(10,2) NOT NULL,
	estoque INTEGER NOT NULL DEFAULT 0,
	data_dadastro TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

--Tabela de Pedidos
CREATE TABLE Pedidos(
	id SERIAL PRIMARY KEY,
	cliente_nome VARCHAR(100) NOT NULL,
	data_pedido TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
	total DECIMAL(10,2) DEFAULT 0
);

--Tabela de itens de pedidos
CREATE TABLE ItensPedido(
	pedido_id INTEGER REFERENCES Pedidos(id),
	produto_id INTEGER REFERENCES Produtos(id),
	quantidade INTEGER NOT NULL DEFAULT 1,
	preco_unitario DECIMAL(10, 2) NOT NULL,
	PRIMARY KEY(pedido_id, produto_id)
);

--Inserir itens
--Produtos
INSERT INTO Produtos(nome, preco, estoque) VALUES('Notebook', 1200.50, 10);
INSERT INTO Produtos(nome, preco, estoque) VALUES('Mouse', 123.99, 30);
INSERT INTO Produtos(nome, preco, estoque) VALUES('Teclado', 200.00, 50);
INSERT INTO Produtos(nome, preco, estoque) VALUES('Monitor', 822.60, 10);

--Pedidos
INSERT INTO Pedidos(cliente_nome) VALUES('Andressa Camile');
INSERT INTO Pedidos(cliente_nome) VALUES('Tatiana Rocha');

--Itens 
INSERT INTO ItensPedido(pedido_id, produto_id, quantidade, preco_unitario) VALUES(1,1,1,1200.50);
INSERT INTO ItensPedido(pedido_id, produto_id, quantidade, preco_unitario) VALUES(1,2,2, 123.99);
INSERT INTO ItensPedido(pedido_id, produto_id, quantidade, preco_unitario) VALUES(2,3,1, 200.00);
INSERT INTO ItensPedido(pedido_id, produto_id, quantidade, preco_unitario) VALUES(2,4,1, 822.60);

--Atualizar o total de pedidos
UPDATE Pedidos SET total =(SELECT SUM(quantidade * preco_unitario) FROM ItensPedido WHERE pedido_id = 1) WHERE id =1;


--Selecionar todos os produtos
SELECT * FROM Produtos;

--Selecionar colunas, nome do cliente e total da tabela pedidos
SELECT id, cliente_nome, total FROM Pedidos;

--Usando Join para listar itens de um pedido especifico(ID=1) com nome do produto
SELECT Pedidos.id AS pedido_id, Produtos.nome AS produto_nome, ItensPedido.quantidade, ItensPedido.preco_unitario
FROM Pedidos 
JOIN ItensPedido ON Pedidos.id = ItensPedido.pedido_id
JOIN Produtos ON ItensPedido.produto_id = Produtos.id
WHERE preco > (SELECT AVG(preco) FROM Produtos);

--UPDATE

-- Atualizar o estoque de um produto (ID = 2)
UPDATE Produtos SET estoque = 45 WHERE id = 2;

-- Atualizar o preço de um produto (Nome = 'Teclado')
UPDATE Produtos SET preco = 89.99 WHERE nome = 'Teclado';


--DELETE

-- Excluir um item de um pedido (Pedido ID = 1, Produto ID = 2)
DELETE FROM ItensPedido WHERE pedido_id = 1 AND produto_id = 2;

-- Excluir um pedido (ID = 2) - Observe que isso pode gerar erro se houver restrições ON DELETE CASCADE não configuradas
DELETE FROM Pedidos WHERE id = 2;

-- Excluir um produto (Nome = 'Monitor')
DELETE FROM ItensPedido
WHERE produto_id = (SELECT id FROM Produtos WHERE nome = 'Monitor');

DELETE FROM Produtos WHERE nome = 'Monitor';

SELECT * FROM Produtos;

