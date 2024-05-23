-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Tempo de geração: 21/05/2024 às 21:47
-- Versão do servidor: 10.4.32-MariaDB
-- Versão do PHP: 8.1.25

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `projfinal`
--

-- --------------------------------------------------------

--
-- Estrutura para tabela `produto`
--

CREATE TABLE `produto` (
  `idProduto` varchar(10) NOT NULL,
  `categoria` varchar(10) NOT NULL,
  `produto` varchar(100) NOT NULL,
  `tipo` varchar(10) NOT NULL,
  `quantidade` int(10) NOT NULL,
  `vlCompra` float NOT NULL,
  `icms` float NOT NULL,
  `vlVenda` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Despejando dados para a tabela `produto`
--

INSERT INTO `produto` (`idProduto`, `categoria`, `produto`, `tipo`, `quantidade`, `vlCompra`, `icms`, `vlVenda`) VALUES
('1', 'Alvenaria', 'CIMENTO', 'SC', 10, 50, 12, 80),
('2', 'Alvenaria', 'CAL VOTORAN', 'SC', 10, 50, 12, 80),
('2CX', 'Hidráulica', 'CAIXA D\'ÁGUA ETERNIT', 'UN', 10, 500, 12, 1000),
('3', 'Alvenaria', 'TELHA', 'UN', 1000, 10, 12, 30),
('CAB2', 'Elétrica', 'CABO FLEXÍVEL 2,5MM', 'ROLO', 10, 100, 12, 200);

-- --------------------------------------------------------

--
-- Estrutura para tabela `users`
--

CREATE TABLE `users` (
  `cpf` varchar(15) NOT NULL,
  `perfil` varchar(20) NOT NULL,
  `nome` varchar(80) NOT NULL,
  `celular` varchar(20) NOT NULL,
  `email` varchar(50) NOT NULL,
  `senha` varchar(10) NOT NULL,
  `rua` varchar(150) NOT NULL,
  `numero` varchar(7) NOT NULL,
  `complemento` varchar(50) DEFAULT NULL,
  `bairro` varchar(80) NOT NULL,
  `cidade` varchar(80) NOT NULL,
  `estado` varchar(2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Despejando dados para a tabela `users`
--

INSERT INTO `users` (`cpf`, `perfil`, `nome`, `celular`, `email`, `senha`, `rua`, `numero`, `complemento`, `bairro`, `cidade`, `estado`) VALUES
('001.122.233-30', 'Usuário', 'JOÃO MATHEUS DE FREITAS', '(11) 93266-6666', 'jmsantos', '1234567891', 'RUA 22', '15', 'CASA 3', 'VARGINHA', 'SÃO PAULO', 'SP'),
('222.333.111-22', 'Administrador', 'SABRINA REGINA DE SOUZA', '(11) 92233-0011', 'srmartins@gmail.com', '123', 'RUA 3', '30', 'CASA 3', 'NOVA CONQUISTA', 'SÃO PAULO', 'SP'),
('878.444.000-11', 'Usuário', 'MARIA JOSE DA SILVA', '(11) 91000-0000', 'mjfreitas@teste.com', '1234', 'RUA 7', '55', 'CASA B', 'SANTO AMARO', 'SÃO PAULO', 'SP'),
('888.666.000-22', 'Usuário', 'RITA MARIA DA SILVA', '(11) 92222-3333', 'rmteixeir@teste.com', '123456', 'RUA NOVA', '55', '', 'SANTO AMARO', 'SAO PAULO', 'SP'),
('999.111.000-55', 'Administrador', 'JÚLIA RUFINO DE SOUZA', '(11) 92211-0000', 'jrsilva@teste.com', '1234', 'RUA 10', '123', 'APT 112', 'JARDINS', 'SÃO PAULO', 'SP');

--
-- Índices para tabelas despejadas
--

--
-- Índices de tabela `produto`
--
ALTER TABLE `produto`
  ADD UNIQUE KEY `idProduto` (`idProduto`);

--
-- Índices de tabela `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`cpf`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
