-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Nov 13, 2023 at 12:24 AM
-- Server version: 10.4.27-MariaDB
-- PHP Version: 8.2.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `pbo2_2110010455`
--

-- --------------------------------------------------------

--
-- Table structure for table `buka_lelang`
--

CREATE TABLE `buka_lelang` (
  `id_bukalelang` int(11) NOT NULL,
  `id_petani` int(11) NOT NULL,
  `id_komoditas` int(11) NOT NULL,
  `berat_total` int(3) NOT NULL,
  `harga_awal` int(10) NOT NULL,
  `tanggal_buka` varchar(50) NOT NULL,
  `tanggal_habis` varchar(50) NOT NULL,
  `waktu_habis` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `buka_lelang`
--

INSERT INTO `buka_lelang` (`id_bukalelang`, `id_petani`, `id_komoditas`, `berat_total`, `harga_awal`, `tanggal_buka`, `tanggal_habis`, `waktu_habis`) VALUES
(1, 1, 4, 500, 1000000, '2023-10-05', '2023-10-10', '14:00:00');

-- --------------------------------------------------------

--
-- Table structure for table `kabupaten`
--

CREATE TABLE `kabupaten` (
  `id_kabupaten` int(11) NOT NULL,
  `nama_kabupaten` varchar(50) NOT NULL,
  `id_provinsi` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `kabupaten`
--

INSERT INTO `kabupaten` (`id_kabupaten`, `nama_kabupaten`, `id_provinsi`) VALUES
(1, 'Kabupaten Musi Banyuasin', 3),
(2, 'Kabupaten OKU Selatan', 3),
(3, 'Kabupaten Jember', 2),
(4, 'Kabupaten Barito Kuala', 1);

-- --------------------------------------------------------

--
-- Table structure for table `komoditas`
--

CREATE TABLE `komoditas` (
  `id_komoditas` int(11) NOT NULL,
  `nama_komoditas` varchar(30) NOT NULL,
  `rincian_komoditas` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `komoditas`
--

INSERT INTO `komoditas` (`id_komoditas`, `nama_komoditas`, `rincian_komoditas`) VALUES
(1, 'Padi', 'Padi berasal dari Kalimantan Selatan'),
(2, 'Karet', 'Karet berasal dari Sumatera Selatan'),
(3, 'Kopi', 'Kopi berasal dari Sumatera Selatan'),
(4, 'Jagung', 'Jagung berasal dari Jawa Timur');

-- --------------------------------------------------------

--
-- Table structure for table `pembeli`
--

CREATE TABLE `pembeli` (
  `id_pembeli` int(11) NOT NULL,
  `nik` char(16) NOT NULL,
  `jenis_kelamin` varchar(10) NOT NULL,
  `tempat_lahir` varchar(30) NOT NULL,
  `tanggal_lahir` varchar(50) NOT NULL,
  `agama` varchar(30) NOT NULL,
  `pernikahan` varchar(15) NOT NULL,
  `npwp` varchar(30) NOT NULL,
  `alamat` varchar(200) NOT NULL,
  `kode_pos` char(5) NOT NULL,
  `id_kabupaten` int(11) NOT NULL,
  `nomor_hp` varchar(15) NOT NULL,
  `email` varchar(50) NOT NULL,
  `tanggal_registrasi` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `pembeli`
--

INSERT INTO `pembeli` (`id_pembeli`, `nik`, `jenis_kelamin`, `tempat_lahir`, `tanggal_lahir`, `agama`, `pernikahan`, `npwp`, `alamat`, `kode_pos`, `id_kabupaten`, `nomor_hp`, `email`, `tanggal_registrasi`) VALUES
(1, '3550241202930004', 'Laki-Laki', 'Jember', '1993-02-12', 'Islam', 'Menikah', '0861191228475689', 'Jl. Ikan Gurami, Sumbersari', '68122', 3, '088904288154', 'pade21@email.com', '2023-10-04');

-- --------------------------------------------------------

--
-- Table structure for table `petani`
--

CREATE TABLE `petani` (
  `id_petani` int(11) NOT NULL,
  `nik` char(16) NOT NULL,
  `jenis_kelamin` varchar(10) NOT NULL,
  `tempat_lahir` varchar(30) NOT NULL,
  `tanggal_lahir` varchar(50) NOT NULL,
  `agama` varchar(30) NOT NULL,
  `pernikahan` varchar(15) NOT NULL,
  `npwp` varchar(30) NOT NULL,
  `alamat` varchar(200) NOT NULL,
  `kode_pos` char(5) NOT NULL,
  `id_kabupaten` int(11) NOT NULL,
  `nomor_hp` varchar(15) NOT NULL,
  `email` varchar(50) NOT NULL,
  `tanggal_registrasi` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `petani`
--

INSERT INTO `petani` (`id_petani`, `nik`, `jenis_kelamin`, `tempat_lahir`, `tanggal_lahir`, `agama`, `pernikahan`, `npwp`, `alamat`, `kode_pos`, `id_kabupaten`, `nomor_hp`, `email`, `tanggal_registrasi`) VALUES
(1, '3550241708900001', 'Laki-Laki', 'Jember', '1990-08-17', 'Islam', 'Menikah', '0568031523870344', 'Jl. Ir. Soekarno, Sukorambi', '68131', 3, '085662036891', 'jarwo1990@email.com', '2023-10-04');

-- --------------------------------------------------------

--
-- Table structure for table `proses_lelang`
--

CREATE TABLE `proses_lelang` (
  `id_proseslelang` int(11) NOT NULL,
  `id_bukalelang` int(11) NOT NULL,
  `id_petani` int(11) NOT NULL,
  `id_pembeli` int(11) NOT NULL,
  `id_komoditas` int(11) NOT NULL,
  `harga_bid` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `proses_lelang`
--

INSERT INTO `proses_lelang` (`id_proseslelang`, `id_bukalelang`, `id_petani`, `id_pembeli`, `id_komoditas`, `harga_bid`) VALUES
(1, 1, 1, 1, 4, 1100000);

-- --------------------------------------------------------

--
-- Table structure for table `provinsi`
--

CREATE TABLE `provinsi` (
  `id_provinsi` int(11) NOT NULL,
  `nama_provinsi` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `provinsi`
--

INSERT INTO `provinsi` (`id_provinsi`, `nama_provinsi`) VALUES
(1, 'Kalimantan Selatan'),
(2, 'Jawa Timur'),
(3, 'Sumatera Selatan');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `buka_lelang`
--
ALTER TABLE `buka_lelang`
  ADD PRIMARY KEY (`id_bukalelang`),
  ADD KEY `id_petani` (`id_petani`),
  ADD KEY `id_komoditas` (`id_komoditas`);

--
-- Indexes for table `kabupaten`
--
ALTER TABLE `kabupaten`
  ADD PRIMARY KEY (`id_kabupaten`),
  ADD KEY `id_provinsi` (`id_provinsi`);

--
-- Indexes for table `komoditas`
--
ALTER TABLE `komoditas`
  ADD PRIMARY KEY (`id_komoditas`);

--
-- Indexes for table `pembeli`
--
ALTER TABLE `pembeli`
  ADD PRIMARY KEY (`id_pembeli`),
  ADD KEY `id_kabupaten` (`id_kabupaten`);

--
-- Indexes for table `petani`
--
ALTER TABLE `petani`
  ADD PRIMARY KEY (`id_petani`),
  ADD KEY `id_kabupaten` (`id_kabupaten`);

--
-- Indexes for table `proses_lelang`
--
ALTER TABLE `proses_lelang`
  ADD PRIMARY KEY (`id_proseslelang`),
  ADD KEY `id_bukalelang` (`id_bukalelang`),
  ADD KEY `id_petani` (`id_petani`),
  ADD KEY `id_pembeli` (`id_pembeli`),
  ADD KEY `id_komoditas` (`id_komoditas`);

--
-- Indexes for table `provinsi`
--
ALTER TABLE `provinsi`
  ADD PRIMARY KEY (`id_provinsi`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `buka_lelang`
--
ALTER TABLE `buka_lelang`
  MODIFY `id_bukalelang` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `kabupaten`
--
ALTER TABLE `kabupaten`
  MODIFY `id_kabupaten` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `komoditas`
--
ALTER TABLE `komoditas`
  MODIFY `id_komoditas` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `pembeli`
--
ALTER TABLE `pembeli`
  MODIFY `id_pembeli` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `petani`
--
ALTER TABLE `petani`
  MODIFY `id_petani` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `proses_lelang`
--
ALTER TABLE `proses_lelang`
  MODIFY `id_proseslelang` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `provinsi`
--
ALTER TABLE `provinsi`
  MODIFY `id_provinsi` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `buka_lelang`
--
ALTER TABLE `buka_lelang`
  ADD CONSTRAINT `buka_lelang_ibfk_1` FOREIGN KEY (`id_petani`) REFERENCES `petani` (`id_petani`) ON UPDATE CASCADE,
  ADD CONSTRAINT `buka_lelang_ibfk_2` FOREIGN KEY (`id_komoditas`) REFERENCES `komoditas` (`id_komoditas`) ON UPDATE CASCADE;

--
-- Constraints for table `kabupaten`
--
ALTER TABLE `kabupaten`
  ADD CONSTRAINT `kabupaten_ibfk_1` FOREIGN KEY (`id_provinsi`) REFERENCES `provinsi` (`id_provinsi`) ON UPDATE CASCADE;

--
-- Constraints for table `pembeli`
--
ALTER TABLE `pembeli`
  ADD CONSTRAINT `pembeli_ibfk_1` FOREIGN KEY (`id_kabupaten`) REFERENCES `kabupaten` (`id_kabupaten`) ON UPDATE CASCADE;

--
-- Constraints for table `petani`
--
ALTER TABLE `petani`
  ADD CONSTRAINT `petani_ibfk_1` FOREIGN KEY (`id_kabupaten`) REFERENCES `kabupaten` (`id_kabupaten`) ON UPDATE CASCADE;

--
-- Constraints for table `proses_lelang`
--
ALTER TABLE `proses_lelang`
  ADD CONSTRAINT `proses_lelang_ibfk_1` FOREIGN KEY (`id_petani`) REFERENCES `petani` (`id_petani`) ON UPDATE CASCADE,
  ADD CONSTRAINT `proses_lelang_ibfk_2` FOREIGN KEY (`id_komoditas`) REFERENCES `komoditas` (`id_komoditas`) ON UPDATE CASCADE,
  ADD CONSTRAINT `proses_lelang_ibfk_3` FOREIGN KEY (`id_pembeli`) REFERENCES `pembeli` (`id_pembeli`) ON UPDATE CASCADE,
  ADD CONSTRAINT `proses_lelang_ibfk_4` FOREIGN KEY (`id_bukalelang`) REFERENCES `buka_lelang` (`id_bukalelang`) ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
