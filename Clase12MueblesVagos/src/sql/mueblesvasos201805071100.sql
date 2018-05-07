
--
-- Database: `muebles_vagos_db`
--
CREATE DATABASE IF NOT EXISTS `muebles_vagos_db` DEFAULT CHARACTER SET utf8 COLLATE utf8_bin;
USE `muebles_vagos_db`;

-- --------------------------------------------------------

--
-- Table structure for table `clientes`
--

CREATE TABLE `clientes` (
  `cli_id` int(11) NOT NULL,
  `cli_nombre` varchar(255) COLLATE utf8_bin NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Dumping data for table `clientes`
--

INSERT INTO `clientes` (`cli_id`, `cli_nombre`) VALUES
(1, 'Marcela'),
(2, 'Gimena'),
(3, 'Julieta'),
(4, 'Tomassa');

-- --------------------------------------------------------

--
-- Table structure for table `muebles`
--

CREATE TABLE `muebles` (
  `mue_id` int(11) NOT NULL,
  `mue_origen` text COLLATE utf8_bin NOT NULL,
  `mue_nombre` varchar(255) COLLATE utf8_bin NOT NULL,
  `mue_precio` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Dumping data for table `muebles`
--

INSERT INTO `muebles` (`mue_id`, `mue_origen`, `mue_nombre`, `mue_precio`) VALUES
(1, 'http://barszachmuebles.com.ar/producto/mesa-auxiliar-3/', 'mesa vidrio', 3000),
(2, 'http://www.silleriaagal.com/project/sillones/', 'Silla Mallorca', 2200);

-- --------------------------------------------------------

--
-- Table structure for table `pedidos_online`
--

CREATE TABLE `pedidos_online` (
  `ped_id` int(11) NOT NULL,
  `ped_cli_id` int(11) NOT NULL,
  `ped_mue_id` int(11) NOT NULL,
  `ped_cantidad` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Dumping data for table `pedidos_online`
--

INSERT INTO `pedidos_online` (`ped_id`, `ped_cli_id`, `ped_mue_id`, `ped_cantidad`) VALUES
(1, 4, 2, 22),
(2, 3, 2, 33),
(3, 4, 1, 11);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `clientes`
--
ALTER TABLE `clientes`
  ADD PRIMARY KEY (`cli_id`);

--
-- Indexes for table `muebles`
--
ALTER TABLE `muebles`
  ADD PRIMARY KEY (`mue_id`);

--
-- Indexes for table `pedidos_online`
--
ALTER TABLE `pedidos_online`
  ADD PRIMARY KEY (`ped_id`),
  ADD KEY `pedido_cli_FK` (`ped_cli_id`),
  ADD KEY `pedido_MUE_FK` (`ped_mue_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `clientes`
--
ALTER TABLE `clientes`
  MODIFY `cli_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
--
-- AUTO_INCREMENT for table `muebles`
--
ALTER TABLE `muebles`
  MODIFY `mue_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
--
-- AUTO_INCREMENT for table `pedidos_online`
--
ALTER TABLE `pedidos_online`
  MODIFY `ped_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;
--
-- Constraints for dumped tables
--

--
-- Constraints for table `pedidos_online`
--
ALTER TABLE `pedidos_online`
  ADD CONSTRAINT `pedido_MUE_FK` FOREIGN KEY (`ped_mue_id`) REFERENCES `muebles` (`mue_id`),
  ADD CONSTRAINT `pedido_cli_FK` FOREIGN KEY (`ped_cli_id`) REFERENCES `clientes` (`cli_id`);





select * 
from pedidos_online

SELECT * 
FROM pedidos_online,
     clientes

SELECT * 
FROM pedidos_online,
     clientes
WHERE pedidos_online.ped_cli_id = clientes.cli_id


SELECT * 
FROM pedidos_online,
     clientes,
     muebles
WHERE pedidos_online.ped_cli_id = clientes.cli_id
AND   pedidos_online.ped_mue_id = muebles.mue_id


SELECT * 
FROM pedidos_online po,
     clientes c,
     muebles m
WHERE po.ped_cli_id = c.cli_id
AND   po.ped_mue_id = m.mue_id


SELECT c.cli_nombre Cliente, 
       m.mue_nombre Mueble, 
       m.mue_precio Precio,
       po.ped_cantidad Cantidad
FROM pedidos_online po,
     clientes c,
     muebles m
WHERE po.ped_cli_id = c.cli_id
AND   po.ped_mue_id = m.mue_id


SELECT c.cli_nombre Cliente, 
       m.mue_nombre Mueble, 
       m.mue_precio Precio,
       po.ped_cantidad Cantidad,
       ( po.ped_cantidad * m.mue_precio )  Total
FROM pedidos_online po,
     clientes c,
     muebles m
WHERE po.ped_cli_id = c.cli_id
AND   po.ped_mue_id = m.mue_id

select *
from pedidos_online po,
     muebles m
where po.ped_mue_id = m.mue_id

select m.mue_nombre Mueble,
       SUM( po.ped_cantidad ) Cantidad,
       m.mue_precio Precio,
       ( SUM( po.ped_cantidad ) * m.mue_precio  ) Total
from pedidos_online po,
     muebles m
where po.ped_mue_id = m.mue_id
group by m.mue_id




