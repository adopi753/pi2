-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Tempo de geração: 17/04/2024 às 21:35
-- Versão do servidor: 10.4.32-MariaDB
-- Versão do PHP: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `projdefault`
--

-- --------------------------------------------------------

--
-- Estrutura para tabela `categoria`
--

CREATE TABLE `categoria` (
  `idCategoria` int(10) UNSIGNED NOT NULL,
  `descricao` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Despejando dados para a tabela `categoria`
--

INSERT INTO `categoria` (`idCategoria`, `descricao`) VALUES
(1, 'Alvenaria'),
(2, 'Acabamento');

-- --------------------------------------------------------

--
-- Estrutura para tabela `levels`
--

CREATE TABLE `levels` (
  `idNivel` int(10) UNSIGNED NOT NULL,
  `descricao` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Despejando dados para a tabela `levels`
--

INSERT INTO `levels` (`idNivel`, `descricao`) VALUES
(1, 'Administrador'),
(2, 'Usuário');

-- --------------------------------------------------------

--
-- Estrutura para tabela `produto`
--

CREATE TABLE `produto` (
  `idProduto` int(10) UNSIGNED NOT NULL,
  `fk_idCategoria` int(10) UNSIGNED NOT NULL,
  `produto` varchar(100) NOT NULL,
  `tipo` varchar(15) NOT NULL,
  `quantidade` varchar(10) NOT NULL,
  `vlCompra` float NOT NULL,
  `icms` float NOT NULL,
  `vlVenda` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Despejando dados para a tabela `produto`
--

INSERT INTO `produto` (`idProduto`, `fk_idCategoria`, `produto`, `tipo`, `quantidade`, `vlCompra`, `icms`, `vlVenda`) VALUES
(2, 1, 'CIMENTO', 'SC', '10', 50, 12, 80),
(4, 1, 'CAL', 'SC', '10', 20, 12, 40);

-- --------------------------------------------------------

--
-- Estrutura para tabela `users`
--

CREATE TABLE `users` (
  `cpf` varchar(15) NOT NULL,
  `fk_IdNivel` int(10) UNSIGNED NOT NULL,
  `nome` varchar(80) NOT NULL,
  `celular` varchar(20) NOT NULL,
  `email` varchar(50) NOT NULL,
  `senha` varchar(20) NOT NULL,
  `rua` varchar(150) NOT NULL,
  `numero` varchar(10) NOT NULL,
  `complemento` varchar(50) DEFAULT NULL,
  `bairro` varchar(80) NOT NULL,
  `cidade` varchar(80) NOT NULL,
  `estado` varchar(3) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Despejando dados para a tabela `users`
--

INSERT INTO `users` (`cpf`, `fk_IdNivel`, `nome`, `celular`, `email`, `senha`, `rua`, `numero`, `complemento`, `bairro`, `cidade`, `estado`) VALUES
('111.255.333-00', 2, 'SAMIRA RUFINO', '(11) 93366-2222', 'srufino@terra.com', '123456', 'RUA 9', '10', 'N/A', 'BELA VISTA', 'SÃO PAULO', 'SP'),
('222.333.666-00', 2, 'SABRINA OLIVEIRA', '(11) 93322-1111', 'soliveira@gmail.com', '123', 'RUA 10', '15', 'N/A', 'JD. GUANABARA', 'SÃO PAULO', 'SP'),
('555.666.222-33', 2, 'CINTIA MARIA DE SOUZA', '(11) 96666-0000', 'cmteles@hotmail.com', '123456', 'RUA SEBASTIAN CASANOVA', '143', 'A', 'JD. SÃO RAFAEL', 'SÃO PAULO', 'SP'),
('866.666.222-00', 1, 'JULIA MARIA FERNANDA DE SOUZA', '(11) 92222-3333', 'jmfernanda@hotmail.com', '12345', 'RUA 8', '123', 'CASA3', 'CIDADE DUTRA', 'SÃO PAULO', 'SP'),
('868.888.999-63', 1, 'JOSE FERREIRA SOUZA', '(11) 93333-2222', 'jfsantos@yahoo.com', '1234', 'RUA 7', '10', 'CASA1', 'SANTO AMARO', 'SÃO PAULO', 'SP');

--
-- Índices para tabelas despejadas
--

--
-- Índices de tabela `categoria`
--
ALTER TABLE `categoria`
  ADD PRIMARY KEY (`idCategoria`);

--
-- Índices de tabela `levels`
--
ALTER TABLE `levels`
  ADD PRIMARY KEY (`idNivel`);

--
-- Índices de tabela `produto`
--
ALTER TABLE `produto`
  ADD PRIMARY KEY (`idProduto`),
  ADD KEY `produto_ibfk_1` (`fk_idCategoria`);

--
-- Índices de tabela `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`cpf`),
  ADD KEY `users_ibfk_1` (`fk_IdNivel`);

--
-- AUTO_INCREMENT para tabelas despejadas
--

--
-- AUTO_INCREMENT de tabela `categoria`
--
ALTER TABLE `categoria`
  MODIFY `idCategoria` int(10) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de tabela `levels`
--
ALTER TABLE `levels`
  MODIFY `idNivel` int(10) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de tabela `produto`
--
ALTER TABLE `produto`
  MODIFY `idProduto` int(10) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- Restrições para tabelas despejadas
--

--
-- Restrições para tabelas `produto`
--
ALTER TABLE `produto`
  ADD CONSTRAINT `produto_ibfk_1` FOREIGN KEY (`fk_idCategoria`) REFERENCES `categoria` (`idCategoria`);

--
-- Restrições para tabelas `users`
--
ALTER TABLE `users`
  ADD CONSTRAINT `users_ibfk_1` FOREIGN KEY (`fk_IdNivel`) REFERENCES `levels` (`idNivel`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
