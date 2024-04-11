-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Tempo de geração: 11/04/2024 às 21:00
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
-- Banco de dados: `projcadteste`
--

-- --------------------------------------------------------

--
-- Estrutura para tabela `tipo_users`
--

CREATE TABLE `tipo_users` (
  `idNivel` int(10) UNSIGNED NOT NULL,
  `descricao` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Despejando dados para a tabela `tipo_users`
--

INSERT INTO `tipo_users` (`idNivel`, `descricao`) VALUES
(1, 'Administrador'),
(2, 'Vendedor'),
(3, 'Cliente');

-- --------------------------------------------------------

--
-- Estrutura para tabela `users`
--

CREATE TABLE `users` (
  `nome` varchar(50) NOT NULL,
  `email` varchar(50) NOT NULL,
  `cpf` varchar(15) NOT NULL,
  `celular` varchar(20) NOT NULL,
  `idNivel` int(10) UNSIGNED NOT NULL,
  `login` varchar(20) NOT NULL,
  `senha` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Despejando dados para a tabela `users`
--

INSERT INTO `users` (`nome`, `email`, `cpf`, `celular`, `idNivel`, `login`, `senha`) VALUES
('JOSE MARIA', 'jmaria@teste.com', '868.526.123-00', '(11) 9000-0000', 1, 'jmaria', '123'),
('MARIA JOSE MARTINS', 'mjmartins@yahoo.com', '999.222.000-00', '(11) 93333-6666', 2, 'mjmartins', '1234');

--
-- Índices para tabelas despejadas
--

--
-- Índices de tabela `tipo_users`
--
ALTER TABLE `tipo_users`
  ADD PRIMARY KEY (`idNivel`);

--
-- AUTO_INCREMENT para tabelas despejadas
--

--
-- AUTO_INCREMENT de tabela `tipo_users`
--
ALTER TABLE `tipo_users`
  MODIFY `idNivel` int(10) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
