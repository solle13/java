-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 24-10-2016 a las 19:16:00
-- Versión del servidor: 10.1.9-MariaDB
-- Versión de PHP: 5.5.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `uni`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `registros`
--

CREATE TABLE `registros` (
  `matricula` int(11) NOT NULL,
  `nombre` varchar(40) NOT NULL,
  `carrera` varchar(20) NOT NULL,
  `prom` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `registros`
--

INSERT INTO `registros` (`matricula`, `nombre`, `carrera`, `prom`) VALUES
(1, 'alumno1', 'Informatica', 9),
(2, 'alumno2', 'Contaduria', 10),
(3, 'alumno1', 'Informatica', 9),
(4, 'alumno2', 'Contaduria', 10),
(5, 'alumno3', 'Informatica', 8),
(6, 'alumno4', 'Contaduria', 7),
(7, 'alumno4', 'Contaduria', 7),
(8, 'alumno4', 'Contaduria', 7),
(9, 'alumno5', 'Administracion', 10),
(10, 'alumno6', 'Contaduria', 8),
(11, 'alumno7', 'Contaduria', 9),
(12, 'alumno8', 'Informatica', 6),
(13, 'alumno9', 'Contaduria', 7),
(14, 'alumno10', 'Informatica', 9),
(15, 'alumno11', 'Administracion', 7),
(16, 'alumno12', 'Administracion', 9),
(17, 'alumno13', 'Administracion', 8);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `registros`
--
ALTER TABLE `registros`
  ADD PRIMARY KEY (`matricula`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `registros`
--
ALTER TABLE `registros`
  MODIFY `matricula` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=18;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
