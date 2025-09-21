-- phpMyAdmin SQL Dump
-- version 5.2.2
-- https://www.phpmyadmin.net/
--
-- Host: localhost:3306
-- Generation Time: Sep 22, 2025 at 01:15 AM
-- Server version: 8.0.43-cll-lve
-- PHP Version: 8.4.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `eposyan4_db_eposyandu`
--

-- --------------------------------------------------------

--
-- Table structure for table `datakms`
--

CREATE TABLE `datakms` (
  `id` bigint UNSIGNED NOT NULL,
  `nik_ibu` varchar(16) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `nama_ibu` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `nama_ayah` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `nama_anak` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `anak_ke` varchar(5) COLLATE utf8mb4_unicode_ci NOT NULL,
  `jenis_kelamin` varchar(10) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `bulan_penimbangan_0` longtext COLLATE utf8mb4_unicode_ci,
  `bulan_penimbangan_1` longtext COLLATE utf8mb4_unicode_ci,
  `bulan_penimbangan_2` longtext COLLATE utf8mb4_unicode_ci,
  `bulan_penimbangan_3` longtext COLLATE utf8mb4_unicode_ci,
  `bulan_penimbangan_4` longtext COLLATE utf8mb4_unicode_ci,
  `bulan_penimbangan_5` longtext COLLATE utf8mb4_unicode_ci,
  `bulan_penimbangan_6` longtext COLLATE utf8mb4_unicode_ci,
  `bulan_penimbangan_7` longtext COLLATE utf8mb4_unicode_ci,
  `bulan_penimbangan_8` longtext COLLATE utf8mb4_unicode_ci,
  `bulan_penimbangan_9` longtext COLLATE utf8mb4_unicode_ci,
  `bulan_penimbangan_10` longtext COLLATE utf8mb4_unicode_ci,
  `bulan_penimbangan_11` longtext COLLATE utf8mb4_unicode_ci,
  `bulan_penimbangan_12` longtext COLLATE utf8mb4_unicode_ci,
  `bulan_penimbangan_13` longtext COLLATE utf8mb4_unicode_ci,
  `bulan_penimbangan_14` longtext COLLATE utf8mb4_unicode_ci,
  `bulan_penimbangan_15` longtext COLLATE utf8mb4_unicode_ci,
  `bulan_penimbangan_16` longtext COLLATE utf8mb4_unicode_ci,
  `bulan_penimbangan_17` longtext COLLATE utf8mb4_unicode_ci,
  `bulan_penimbangan_18` longtext COLLATE utf8mb4_unicode_ci,
  `bulan_penimbangan_19` longtext COLLATE utf8mb4_unicode_ci,
  `bulan_penimbangan_20` longtext COLLATE utf8mb4_unicode_ci,
  `bulan_penimbangan_21` longtext COLLATE utf8mb4_unicode_ci,
  `bulan_penimbangan_22` longtext COLLATE utf8mb4_unicode_ci,
  `bulan_penimbangan_23` longtext COLLATE utf8mb4_unicode_ci,
  `bulan_penimbangan_24` longtext COLLATE utf8mb4_unicode_ci,
  `bulan_penimbangan_25` longtext COLLATE utf8mb4_unicode_ci,
  `bulan_penimbangan_26` longtext COLLATE utf8mb4_unicode_ci,
  `bulan_penimbangan_27` longtext COLLATE utf8mb4_unicode_ci,
  `bulan_penimbangan_28` longtext COLLATE utf8mb4_unicode_ci,
  `bulan_penimbangan_29` longtext COLLATE utf8mb4_unicode_ci,
  `bulan_penimbangan_30` longtext COLLATE utf8mb4_unicode_ci,
  `bulan_penimbangan_31` longtext COLLATE utf8mb4_unicode_ci,
  `bulan_penimbangan_32` longtext COLLATE utf8mb4_unicode_ci,
  `bulan_penimbangan_33` longtext COLLATE utf8mb4_unicode_ci,
  `bulan_penimbangan_34` longtext COLLATE utf8mb4_unicode_ci,
  `bulan_penimbangan_35` longtext COLLATE utf8mb4_unicode_ci,
  `bulan_penimbangan_36` longtext COLLATE utf8mb4_unicode_ci,
  `bulan_penimbangan_37` longtext COLLATE utf8mb4_unicode_ci,
  `bulan_penimbangan_38` longtext COLLATE utf8mb4_unicode_ci,
  `bulan_penimbangan_39` longtext COLLATE utf8mb4_unicode_ci,
  `bulan_penimbangan_40` longtext COLLATE utf8mb4_unicode_ci,
  `bulan_penimbangan_41` longtext COLLATE utf8mb4_unicode_ci,
  `bulan_penimbangan_42` longtext COLLATE utf8mb4_unicode_ci,
  `bulan_penimbangan_43` longtext COLLATE utf8mb4_unicode_ci,
  `bulan_penimbangan_44` longtext COLLATE utf8mb4_unicode_ci,
  `bulan_penimbangan_45` longtext COLLATE utf8mb4_unicode_ci,
  `bulan_penimbangan_46` longtext COLLATE utf8mb4_unicode_ci,
  `bulan_penimbangan_47` longtext COLLATE utf8mb4_unicode_ci,
  `bulan_penimbangan_48` longtext COLLATE utf8mb4_unicode_ci,
  `bulan_penimbangan_49` longtext COLLATE utf8mb4_unicode_ci,
  `bulan_penimbangan_50` longtext COLLATE utf8mb4_unicode_ci,
  `bulan_penimbangan_51` longtext COLLATE utf8mb4_unicode_ci,
  `bulan_penimbangan_52` longtext COLLATE utf8mb4_unicode_ci,
  `bulan_penimbangan_53` longtext COLLATE utf8mb4_unicode_ci,
  `bulan_penimbangan_54` longtext COLLATE utf8mb4_unicode_ci,
  `bulan_penimbangan_55` longtext COLLATE utf8mb4_unicode_ci,
  `bulan_penimbangan_56` longtext COLLATE utf8mb4_unicode_ci,
  `bulan_penimbangan_57` longtext COLLATE utf8mb4_unicode_ci,
  `bulan_penimbangan_58` longtext COLLATE utf8mb4_unicode_ci,
  `bulan_penimbangan_59` longtext COLLATE utf8mb4_unicode_ci,
  `bulan_penimbangan_60` longtext COLLATE utf8mb4_unicode_ci,
  `bb_0` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `bb_1` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `bb_2` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `bb_3` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `bb_4` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `bb_5` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `bb_6` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `bb_7` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `bb_8` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `bb_9` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `bb_10` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `bb_11` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `bb_12` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `bb_13` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `bb_14` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `bb_15` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `bb_16` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `bb_17` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `bb_18` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `bb_19` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `bb_20` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `bb_21` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `bb_22` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `bb_23` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `bb_24` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `bb_25` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `bb_26` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `bb_27` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `bb_28` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `bb_29` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `bb_30` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `bb_31` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `bb_32` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `bb_33` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `bb_34` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `bb_35` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `bb_36` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `bb_37` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `bb_38` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `bb_39` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `bb_40` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `bb_41` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `bb_42` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `bb_43` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `bb_44` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `bb_45` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `bb_46` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `bb_47` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `bb_48` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `bb_49` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `bb_50` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `bb_51` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `bb_52` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `bb_53` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `bb_54` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `bb_55` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `bb_56` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `bb_57` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `bb_58` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `bb_59` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `bb_60` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `nt_0` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `nt_1` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `nt_2` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `nt_3` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `nt_4` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `nt_5` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `nt_6` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `nt_7` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `nt_8` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `nt_9` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `nt_10` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `nt_11` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `nt_12` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `nt_13` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `nt_14` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `nt_15` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `nt_16` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `nt_17` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `nt_18` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `nt_19` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `nt_20` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `nt_21` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `nt_22` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `nt_23` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `nt_24` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `nt_25` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `nt_26` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `nt_27` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `nt_28` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `nt_29` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `nt_30` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `nt_31` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `nt_32` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `nt_33` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `nt_34` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `nt_35` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `nt_36` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `nt_37` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `nt_38` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `nt_39` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `nt_40` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `nt_41` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `nt_42` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `nt_43` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `nt_44` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `nt_45` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `nt_46` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `nt_47` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `nt_48` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `nt_49` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `nt_50` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `nt_51` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `nt_52` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `nt_53` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `nt_54` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `nt_55` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `nt_56` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `nt_57` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `nt_58` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `nt_59` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `nt_60` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `asi_eksklusif_0` varchar(5) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `asi_eksklusif_1` varchar(5) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `asi_eksklusif_2` varchar(5) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `asi_eksklusif_3` varchar(5) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `asi_eksklusif_4` varchar(5) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `asi_eksklusif_5` varchar(5) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `asi_eksklusif_6` varchar(5) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Dumping data for table `datakms`
--

INSERT INTO `datakms` (`id`, `nik_ibu`, `nama_ibu`, `nama_ayah`, `nama_anak`, `anak_ke`, `jenis_kelamin`, `bulan_penimbangan_0`, `bulan_penimbangan_1`, `bulan_penimbangan_2`, `bulan_penimbangan_3`, `bulan_penimbangan_4`, `bulan_penimbangan_5`, `bulan_penimbangan_6`, `bulan_penimbangan_7`, `bulan_penimbangan_8`, `bulan_penimbangan_9`, `bulan_penimbangan_10`, `bulan_penimbangan_11`, `bulan_penimbangan_12`, `bulan_penimbangan_13`, `bulan_penimbangan_14`, `bulan_penimbangan_15`, `bulan_penimbangan_16`, `bulan_penimbangan_17`, `bulan_penimbangan_18`, `bulan_penimbangan_19`, `bulan_penimbangan_20`, `bulan_penimbangan_21`, `bulan_penimbangan_22`, `bulan_penimbangan_23`, `bulan_penimbangan_24`, `bulan_penimbangan_25`, `bulan_penimbangan_26`, `bulan_penimbangan_27`, `bulan_penimbangan_28`, `bulan_penimbangan_29`, `bulan_penimbangan_30`, `bulan_penimbangan_31`, `bulan_penimbangan_32`, `bulan_penimbangan_33`, `bulan_penimbangan_34`, `bulan_penimbangan_35`, `bulan_penimbangan_36`, `bulan_penimbangan_37`, `bulan_penimbangan_38`, `bulan_penimbangan_39`, `bulan_penimbangan_40`, `bulan_penimbangan_41`, `bulan_penimbangan_42`, `bulan_penimbangan_43`, `bulan_penimbangan_44`, `bulan_penimbangan_45`, `bulan_penimbangan_46`, `bulan_penimbangan_47`, `bulan_penimbangan_48`, `bulan_penimbangan_49`, `bulan_penimbangan_50`, `bulan_penimbangan_51`, `bulan_penimbangan_52`, `bulan_penimbangan_53`, `bulan_penimbangan_54`, `bulan_penimbangan_55`, `bulan_penimbangan_56`, `bulan_penimbangan_57`, `bulan_penimbangan_58`, `bulan_penimbangan_59`, `bulan_penimbangan_60`, `bb_0`, `bb_1`, `bb_2`, `bb_3`, `bb_4`, `bb_5`, `bb_6`, `bb_7`, `bb_8`, `bb_9`, `bb_10`, `bb_11`, `bb_12`, `bb_13`, `bb_14`, `bb_15`, `bb_16`, `bb_17`, `bb_18`, `bb_19`, `bb_20`, `bb_21`, `bb_22`, `bb_23`, `bb_24`, `bb_25`, `bb_26`, `bb_27`, `bb_28`, `bb_29`, `bb_30`, `bb_31`, `bb_32`, `bb_33`, `bb_34`, `bb_35`, `bb_36`, `bb_37`, `bb_38`, `bb_39`, `bb_40`, `bb_41`, `bb_42`, `bb_43`, `bb_44`, `bb_45`, `bb_46`, `bb_47`, `bb_48`, `bb_49`, `bb_50`, `bb_51`, `bb_52`, `bb_53`, `bb_54`, `bb_55`, `bb_56`, `bb_57`, `bb_58`, `bb_59`, `bb_60`, `nt_0`, `nt_1`, `nt_2`, `nt_3`, `nt_4`, `nt_5`, `nt_6`, `nt_7`, `nt_8`, `nt_9`, `nt_10`, `nt_11`, `nt_12`, `nt_13`, `nt_14`, `nt_15`, `nt_16`, `nt_17`, `nt_18`, `nt_19`, `nt_20`, `nt_21`, `nt_22`, `nt_23`, `nt_24`, `nt_25`, `nt_26`, `nt_27`, `nt_28`, `nt_29`, `nt_30`, `nt_31`, `nt_32`, `nt_33`, `nt_34`, `nt_35`, `nt_36`, `nt_37`, `nt_38`, `nt_39`, `nt_40`, `nt_41`, `nt_42`, `nt_43`, `nt_44`, `nt_45`, `nt_46`, `nt_47`, `nt_48`, `nt_49`, `nt_50`, `nt_51`, `nt_52`, `nt_53`, `nt_54`, `nt_55`, `nt_56`, `nt_57`, `nt_58`, `nt_59`, `nt_60`, `asi_eksklusif_0`, `asi_eksklusif_1`, `asi_eksklusif_2`, `asi_eksklusif_3`, `asi_eksklusif_4`, `asi_eksklusif_5`, `asi_eksklusif_6`, `created_at`, `updated_at`) VALUES
(32, '7415074408020002', 'Filna', 'La Unda', 'Nadifa', '1', 'Perempuan', '2024-03-14', '2024-04-08', '2024-05-08', '2024-06-08', '2024-07-08', '2024-08-08', '2024-09-08', '2024-10-08', '2024-11-08', '2024-12-08', '2025-01-14', '2025-02-19', '2025-03-20', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '3.3', '3.7', '4.6', '5.4', '6', '6.5', '6.9', '7.2', '7.5', '7.8', '8.1', '8.4', '8.8', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', NULL, 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', NULL, NULL, 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', NULL, NULL, 'null', 'null', 'null', 'null', 'null', NULL, 'null', '-', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'nu', 'nu', 'nu', 'nu', 'nu', 'nu', 'nu', 'nu', 'nu', 'nu', 'nu', 'nu', 'nu', 'nu', 'nu', 'nu', 'nu', 'nu', 'nu', NULL, 'nu', 'nu', 'nu', 'nu', 'nu', 'nu', 'nu', 'nu', 'nu', NULL, NULL, 'nu', 'nu', 'nu', 'nu', 'nu', 'nu', 'nu', 'nu', NULL, NULL, 'nu', 'nu', 'nu', 'nu', 'nu', NULL, 'nu', 'Ya', 'Ya', 'Ya', 'Ya', 'Ya', 'Ya', 'Ya', '2025-05-09 23:36:57', '2025-06-23 17:48:28'),
(37, '740419410400002', 'Musrida', 'La Ami', 'Muh. Rafa', '1', 'Laki-Laki', '2022-01-22', '2022-02-06', '2022-03-06', '2022-04-06', '2022-05-06', '2022-06-06', '2022-07-06', '2022-08-06', '2022-09-06', '2022-10-06', '2022-11-06', '2022-12-06', '2023-01-07', '2023-02-07', '2023-03-07', '20223-04-07', '2023-05-07', '2023-06-07', '2023-07-07', '2023-08-07', '2023-09-07', '2023-10-07', '2023-11-07', '2023-12-07', '2024-01-08', '2024-02-08', '2024-03-08', '2024-04-08', '2024-05-08', '2024-06-08', '2024-07-08', '2024-08-08', NULL, '2024-10-08', '2024-11-08', '2024-12-08', '2025-01-08', '2025-02-08', '2025-03-08', '2025-04-12', '2025-07-02', '-', NULL, NULL, '-', '-', '-', '-', '-', '-', '-', '-', NULL, NULL, NULL, '-', '-', '-', '-', NULL, '-', '3.1', '5', '6.5', '6.7', '7.3', '7.8', '8.2', '8', '8.3', '8.6', '8.2', '8', '8.4', '8.5', '8.5', '8.9', '8.9', '9', '9.5', '9.2', '9.3', '9', '9.4', '9.6', '9.7', '10', '10.2', '10.2', '10.4', '10.6', '10.8', '10.2', NULL, '10.4', '10.6', '11', '11.5', '11.3', '11.5', '11.3', '14', 'null', NULL, NULL, 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', NULL, NULL, NULL, 'null', 'null', 'null', 'null', NULL, '60', '-', 'N', 'N', 'N', 'N', 'N', 'N', 'T', 'N', 'N', 'T', 'T', 'N', 'N', '-', 'N', 'N', 'nu', 'N', 'T', 'N', 'T', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'T', NULL, 'N', 'N', 'N', 'N', 'N', 'N', 'T', 'nu', 'nu', NULL, NULL, 'nu', 'nu', 'nu', 'nu', 'nu', 'nu', 'nu', 'nu', NULL, NULL, NULL, 'nu', 'nu', 'nu', 'nu', NULL, 'y', 'ya', 'ya', 'Ya', '-', '-', '-', 'ya', '2025-05-24 05:36:00', '2025-07-19 08:01:42'),
(39, '7415074408020002', 'Filna', 'La Unda', 'Bayi Ny. Filna', '2', 'Perempuan', '2025-03-01', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2025-05-28', NULL, NULL, NULL, '2025-05-31', '2.8', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', NULL, '-', '-', '-', '-', '-', '-', '-', '-', '-', NULL, NULL, '-', '-', '-', '-', '-', '-', '-', '-', NULL, NULL, NULL, '-', '-', '-', '-', NULL, '-', 'Ya', '-', '-', '-', '-', '-', '-', '2025-05-27 15:11:23', '2025-06-23 17:35:28'),
(43, '7404066403000001', 'Nurfina', 'Alan', 'Saflan', '1', 'Laki-Laki', '2024-05-29', '2024-07-08', '2024-08-08', '2024-09-08', '2024-10-08', '2024-11-08', '2024-12-08', '2025-01-14', '2025-02-19', '2025-03-20', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '3.2', '4', '4.9', '5.7', '6.4', '6.9', '7.3', '7.6', '7.9', '8.4', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 'Ya', 'Ya', 'Ya', 'Ya', 'Ya', 'Ya', 'Ya', '2025-06-23 15:49:12', '2025-06-23 15:49:12'),
(45, '740419440408001', 'Salma', 'Rahim', 'By. Ny.Salma', '1', 'Perempuan', '2025-03-23', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2.8', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 'Ya', NULL, NULL, NULL, NULL, NULL, NULL, '2025-06-23 15:54:09', '2025-06-23 15:54:09'),
(46, '9271015502930005', 'Nurfida', 'La ungi', 'Andi Muhammad Attala', '1', 'Laki-Laki', '2024-01-01', '2024-02-08', '2024-03-08', '2024-04-08', '2024-05-08', '2024-06-08', '2024-07-08', '2024-08-08', '2024-09-08', '2024-10-08', '2024-11-08', '2024-12-08', '2025-01-14', '2025-02-19', '2025-03-20', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '3.1', '4', '4.2', '4.9', '5.3', '5.5', '5.9', '6.1', '7', '6.8', '7.2', '7.2', '7.8', '8', '8.9', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '-', 'N', 'T', 'N', 'T', 'N', 'N', 'T', 'N', 'T', 'N', 'T', 'N', 'N', 'N', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2025-06-23 16:23:43', '2025-06-23 16:23:43'),
(47, '917101560791004', 'SUNARTI', 'Darson', 'Asma Nadia', '1', 'Perempuan', '2020-06-02', '2020-07-04', '2020-08-04', '2020-09-04', '2020-10-04', '2020-11-04', '2020-12-04', '2021-01-05', '2021-02-05', '2021-03-05', '2021-04-05', '2021-05-05', '2021-06-05', '2021-07-05', '2021-08-05', '2021-09-05', '2021-10-05', '2021-11-05', '2021-12-05', '2022-01-06', '2022-02-06', '2022-03-06', '2022-04-06', '2022-05-06', '2022-06-06', '2022-07-06', '2022-08-06', '2022-09-06', '2022-10-06', '2022-11-06', '2022-12-06', '2023-01-07', '2023-02-07', '2023-03-07', '2023-04-07', '2023-05-07', '2023-06-07', '2023-07-07', '2023-08-07', '2023-09-07', '2023-10-07', '2023-11-07', '2023-12-07', '2024-01-08', '2024-02-08', '2024-03-08', '2024-04-08', '2024-05-08', '2024-06-08', '2024-07-08', '2024-08-08', '2024-09-08', '2024-10-08', '2024-11-08', '2024-12-08', '2025-01-14', '2025-02-19', '2025-03-20', NULL, NULL, NULL, '1.8', '2.6', '3.5', '4.3', '4.9', '5.4', '5.9', '6.5', '6.9', '7.3', '7.6', '7.2', '7.4', '7.7', '8', '8.3', '8.6', '8', '8.4', '8.8', '9', '9.3', '9.6', '9.4', '9.7', '9.7', '9.6', '9.9', '10', '10.2', '10.6', '10.3', '10.5', '10', '9.8', '10', '10.2', '10.3', '10.2', '10.5', '10.7', '10.8', '10.5', '10.1', '10.3', '10.2', '10.6', '10.8', '10.9', '11.1', '11', '11.2', '11.7', '11.5', '11.5', '11.3', '11.2', '11.4', NULL, NULL, NULL, '-', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'T', 'N', 'N', 'N', 'N', 'N', 'T', 'N', 'N', 'T', 'N', 'N', 'T', 'N', 'T', 'T', 'N', 'T', 'N', 'N', 'T', 'N', 'T', 'T', 'N', 'N', 'T', 'T', 'N', 'N', 'N', 'T', 'T', 'N', 'T', 'N', 'N', 'T', 'N', 'T', 'N', 'N', 'T', 'T', 'T', 'T', 'N', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2025-06-23 17:06:50', '2025-06-23 17:06:50'),
(48, '917101560791004', 'SUNARTI', 'Darson', 'By. ny. sunarti', '2', 'Laki-Laki', '2025-03-31', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '3', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '-', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2025-06-23 17:08:15', '2025-06-23 17:08:15'),
(49, '7404195150799000', 'Sahiani', 'Risky Akbar', 'Shanin Rizkiya', '1', 'Perempuan', '2025-02-24', '2025-03-20', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '3.1', '3.9', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '-', 'N', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2025-06-23 17:12:56', '2025-06-23 17:12:56'),
(50, '7404195130595000', 'Ridayani', 'La Ode Tamsil', 'Arshaka Nirendra', '1', 'Laki-Laki', '2025-01-16', '2025-02-19', '2025-03-20', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '3.8', '4.6', '5.5', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '-', 'N', 'N', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2025-06-23 17:14:53', '2025-06-23 17:14:53'),
(51, '7404194107880002', 'Nasra', 'Sutriadin', 'Alsava Azqya Maryam', '3', 'Perempuan', '2025-01-25', '2025-02-19', '2025-03-20', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2.9', '3.7', '4.6', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '-', 'N', 'N', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2025-06-23 17:16:49', '2025-06-23 17:16:49'),
(52, '7404195230497000', 'Farnia', 'Hariono Asadi', 'Muh. Ananta Ahyan', '1', 'Laki-Laki', '2024-09-06', '2024-10-08', '2024-11-08', '2024-12-08', '2025-01-14', '2025-02-19', '2025-03-20', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '3.4', '4.2', '5.1', '5.7', '6', '6.5', '7', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '-', 'N', 'N', 'T', 'T', 'N', 'N', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2025-06-23 17:30:24', '2025-06-23 17:30:24'),
(53, '7404195221203000', 'Elvania', 'Hilyamin', 'Zaena aiyla', '2', 'Perempuan', '2024-06-17', '2024-08-08', '2024-09-08', '2024-10-08', '2024-11-08', '2024-12-08', '2025-01-14', '2025-02-19', '2025-03-20', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '3.3', '4.5', '5.4', '6', '5.4', '5.9', '6.8', '7.8', '8.7', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '-', 'N', 'N', 'T', 'T', 'N', 'N', 'N', 'N', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2025-06-23 17:58:07', '2025-06-23 17:58:07'),
(54, '7404194140791000', 'Lisda Anggraini', 'Indra Ifin', 'Tanisya', '1', 'Perempuan', '2024-10-01', '2024-11-08', '2024-12-08', '2025-01-14', '2025-02-19', '2025-03-20', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2.8', '3.6', '4.5', '5.3', '5.9', '6.5', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '-', 'N', 'N', 'N', 'N', 'N', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2025-06-23 18:09:08', '2025-06-23 18:09:08'),
(55, '7404195120100001', 'Dania', 'Dahri', 'Aprillia Ramadani', '1', 'Perempuan', '2024-04-03', '2024-05-08', '2024-06-08', '2024-07-08', '2024-08-08', '2024-09-08', '2024-10-08', '2024-11-08', '2024-12-08', '2025-01-14', '2025-02-19', '2025-03-20', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '3.5', '4.5', '5.4', '5.9', '6.1', '6.6', '6', '6.4', '6.8', '6.9', '7', '7.4', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '-', 'N', 'N', 'N', 'T', 'N', 'T', 'N', 'N', 'T', 'T', 'N', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2025-06-23 18:17:05', '2025-06-23 18:17:05'),
(56, '7404195717980002', 'Amana', 'Irwan Said', 'Muh. Anata Said', '1', 'Laki-Laki', '2024-07-19', '2024-09-08', '2024-10-08', '2024-11-08', '2024-12-08', '2025-01-14', '2025-02-19', '2025-03-20', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2.9', '3.8', '4.7', '5.5', '6.2', '5.7', '6.5', '7', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '-', 'N', 'N', 'N', 'N', 'T', 'N', 'N', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2025-06-23 18:30:35', '2025-06-23 18:30:35'),
(57, '7404194109980001', 'Wa Ode Isrami', 'Darzin', 'Wa Ode Mikaila', '1', 'Perempuan', '2024-05-27', '2024-07-08', '2024-08-08', '2024-09-08', '2024-10-08', '2024-11-08', '2024-12-08', '2025-01-14', '2025-02-19', '2025-03-20', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2.5', '3.6', '4.5', '5.3', '5.9', '5.4', '5.8', '6.9', '6.2', '07.4', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '-', 'N', 'N', 'N', 'T', 'T', 'N', 'N', 'T', 'N', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2025-06-23 18:36:55', '2025-06-30 22:51:23'),
(60, '7404101804930002', 'Wa Ode Asriana', 'La Ode Armin', 'Wa Ode Keisha Azura Zilvania', '1', 'Perempuan', '2020-10-11', '2020-11-12', '2020-12-14', '2021-01-15', '2022-02-16', '2025-07-20', '2025-07-19', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '1', '2', '2.4', '3', '2.5', '2.7', '5.5', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 'T (Turun)', 'N (Naik)', 'N (Naik)', 'N (Naik)', 'T( Turun)', 'N (Naik)', 'N (Naik)', 'T', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 'Iya', 'Iya', 'Iya', 'Iya', 'Iya', 'Iya', 'Ya', '2025-07-09 11:52:03', '2025-07-19 04:39:49');

-- --------------------------------------------------------

--
-- Table structure for table `migrations`
--

CREATE TABLE `migrations` (
  `id` int UNSIGNED NOT NULL,
  `migration` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
  `batch` int NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Dumping data for table `migrations`
--

INSERT INTO `migrations` (`id`, `migration`, `batch`) VALUES
(1, '2024_10_09_155503_create_jadwalposyandus_table', 1),
(2, '2024_10_13_212734_create_dataorangtuadananaks_table', 2),
(3, '2024_10_14_185350_create_dataanaks_table', 3),
(4, '2024_10_14_191359_create_dataorangtuas_table', 4),
(5, '2024_10_14_191625_create_dataanaks_table', 5),
(6, '2024_10_15_031452_create_dataobstetris_table', 6),
(7, '2024_10_26_230001_create_daftarakunpetugas_table', 7),
(8, '2024_10_26_230727_create_daftarakunibus_table', 8),
(9, '2025_01_26_011353_create_datakms_table', 9),
(10, '2025_01_26_130225_create_datakms_table', 10),
(11, '2014_10_12_000000_create_users_table', 11),
(12, '2025_02_11_092903_create_users_table', 12),
(13, '2025_02_11_093132_create_users_table', 13);

-- --------------------------------------------------------

--
-- Table structure for table `tabel_akun_ibu`
--

CREATE TABLE `tabel_akun_ibu` (
  `id` bigint UNSIGNED NOT NULL,
  `nama` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL,
  `nik_ibu` varchar(16) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `username` varchar(20) COLLATE utf8mb4_unicode_ci NOT NULL,
  `password` varchar(20) COLLATE utf8mb4_unicode_ci NOT NULL,
  `alamat` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `nomor_hp` varchar(12) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `posisi` varchar(20) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Dumping data for table `tabel_akun_ibu`
--

INSERT INTO `tabel_akun_ibu` (`id`, `nama`, `nik_ibu`, `username`, `password`, `alamat`, `nomor_hp`, `posisi`, `created_at`, `updated_at`) VALUES
(1, 'Rismawati', '7404100102920009', 'rismawati', 'rismawati', 'Dusun Teilalo', '082119691582', '', NULL, '2025-03-17 19:54:59'),
(4, 'Irfanti Sartika', '7404101305860004', 'irfanti', 'irfanti', 'Dusun Kaofe', '082131192190', '', '2024-10-27 17:29:06', '2025-03-17 19:55:45'),
(5, 'Dita Meliani', '7404100102920009', 'dita', 'dita', 'Dusun Kaofe', '082112997161', '', NULL, '2025-03-17 19:53:55'),
(7, 'Sukma Wardani', '7404102106860005', 'sukma', 'sukma', 'Dusun Kalipopo', '081312218591', NULL, '2025-02-05 07:55:56', '2025-03-17 19:56:11'),
(8, 'Dian Sarianingsih', '7404102507840015', 'dian', 'dian', 'Dusun Kaofe', '081310193511', NULL, '2025-02-05 11:00:09', '2025-03-17 19:56:54'),
(9, 'Wa Ode Desi Anggraeni', '7404101007860007', 'desi', 'desi', 'Dusun Teilalo', '081361311539', NULL, '2025-02-05 22:47:10', '2025-03-17 19:57:22'),
(10, 'Salma', '7404102102840008', 'salma', 'salma', 'Dusun Kalipopo', '081219217512', NULL, '2025-03-17 19:47:21', '2025-03-17 19:47:21'),
(11, 'Fitriani Saba', '7404102501890010', 'fitriani', 'fitrani', 'Dusun Marawali', '085321797122', NULL, '2025-03-17 19:48:16', '2025-03-17 19:48:16'),
(12, 'Nopiasari', '7404101311900011', 'nopiasari', 'nopiasari', 'Dusun Teilalo', '085213119512', NULL, '2025-03-17 19:49:12', '2025-03-17 19:49:12'),
(13, 'Wa Ode Asriana', '7404101804930002', 'asriana', 'asriana', 'Dusun Kaofe', '085229397592', NULL, '2025-03-17 19:50:44', '2025-03-17 19:50:44'),
(14, 'Filna', '7415074408020002', 'filna', 'filna', 'Marawali', '081322083963', NULL, '2025-04-25 03:08:51', '2025-05-09 19:26:26'),
(17, 'Musrida', '740419410400002', 'musrida', 'musrida', 'Dusun Marawali', '081278908761', NULL, '2025-06-02 03:49:02', '2025-06-02 03:49:02'),
(18, 'Waode Lilis ardila', '740419451290002', 'Lilisardila', 'lilisardila', 'Dusun marawali', '082240163780', NULL, '2025-06-16 03:41:33', '2025-06-16 03:41:33'),
(19, 'Waode Lilis ardila', '740419451290002', 'Lilisardila', 'lilisardila', 'Dusun marawali', '082240163780', NULL, '2025-06-16 03:41:33', '2025-06-16 03:41:33');

-- --------------------------------------------------------

--
-- Table structure for table `tabel_akun_petugas`
--

CREATE TABLE `tabel_akun_petugas` (
  `id` bigint UNSIGNED NOT NULL,
  `nama` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL,
  `username` varchar(20) COLLATE utf8mb4_unicode_ci NOT NULL,
  `password` varchar(20) COLLATE utf8mb4_unicode_ci NOT NULL,
  `alamat` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `nomor_hp` varchar(12) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Dumping data for table `tabel_akun_petugas`
--

INSERT INTO `tabel_akun_petugas` (`id`, `nama`, `username`, `password`, `alamat`, `nomor_hp`, `created_at`, `updated_at`) VALUES
(4, 'Wa Ode Sulastri', 'sulastri', 'sulastri', 'Dusun Kaofe', '081389901232', '2024-10-26 16:55:45', '2025-03-17 19:25:28'),
(9, 'Nur Fitriani', 'fitriani', 'fitriani', 'Dusun Kalipopo', '082187614121', '2025-01-28 04:48:07', '2025-03-17 19:24:46'),
(11, 'Siti Anjani', 'siti', 'siti', 'Dusun Kaofe', '081322083963', '2025-01-28 04:49:28', '2025-03-17 19:24:01'),
(13, 'Sarfina', 'sarfina', 'sarfina', 'Dusun Teilalo', '082245899087', '2025-02-05 07:12:45', '2025-03-17 19:22:59'),
(14, 'Wa Ode Heni', 'heni', 'heni', 'Dusun Kaofe', '082188567890', '2025-02-07 17:21:42', '2025-03-17 19:21:52'),
(15, 'Amalia Lestari', 'amalia', 'amalia', 'Banabungi', '081312918190', '2025-04-08 04:58:20', '2025-05-17 17:59:36'),
(16, 'Linda Mayasari', 'linda', 'linda', 'Marawali', '081342088764', '2025-04-09 10:18:19', '2025-05-17 17:58:34'),
(20, 'Wa Ode Elfianti', 'elfianti', 'elfianti', 'Dusun Marawali', '082218903245', '2025-07-15 18:59:47', '2025-07-15 18:59:47');

-- --------------------------------------------------------

--
-- Table structure for table `tabel_catatan_kesehatan_ibu_hamil`
--

CREATE TABLE `tabel_catatan_kesehatan_ibu_hamil` (
  `id` int NOT NULL,
  `nik_ibu` varchar(16) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `kehamilan_ke` varchar(5) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `nama_pemeriksa_dan_tempat_pelayanan` varchar(50) COLLATE utf8mb4_general_ci NOT NULL,
  `tanggal` varchar(20) COLLATE utf8mb4_general_ci NOT NULL,
  `keluhan` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `uk` varchar(10) COLLATE utf8mb4_general_ci NOT NULL,
  `bb` varchar(10) COLLATE utf8mb4_general_ci NOT NULL,
  `td` varchar(10) COLLATE utf8mb4_general_ci NOT NULL,
  `lila` varchar(10) COLLATE utf8mb4_general_ci NOT NULL,
  `tinggi_fundus` varchar(10) COLLATE utf8mb4_general_ci NOT NULL,
  `letak_janin` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `imunisasi` varchar(30) COLLATE utf8mb4_general_ci NOT NULL,
  `tablet_tambah_darah` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `lab` varchar(50) COLLATE utf8mb4_general_ci NOT NULL,
  `analisa` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `tata_laksana` varchar(50) COLLATE utf8mb4_general_ci NOT NULL,
  `konseling` varchar(50) COLLATE utf8mb4_general_ci NOT NULL,
  `catatan_tambahan` varchar(100) COLLATE utf8mb4_general_ci NOT NULL,
  `updated_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `created_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tabel_catatan_kesehatan_ibu_hamil`
--

INSERT INTO `tabel_catatan_kesehatan_ibu_hamil` (`id`, `nik_ibu`, `kehamilan_ke`, `nama_pemeriksa_dan_tempat_pelayanan`, `tanggal`, `keluhan`, `uk`, `bb`, `td`, `lila`, `tinggi_fundus`, `letak_janin`, `imunisasi`, `tablet_tambah_darah`, `lab`, `analisa`, `tata_laksana`, `konseling`, `catatan_tambahan`, `updated_at`, `created_at`) VALUES
(43, '1740028091234', '7', 'Dwi Wulan, Rumah', '8 Januari 2025', 'Tidak ada', '12', '80', '90', '78', '67', 'ui', 'h', 'b', 'j', 'h', 'j', 'h', 'h', '2025-01-08 21:11:28', '2025-01-08 21:11:28'),
(44, '1740028091234', '7', 'Wahyu, Posyandu', '9 Januari 2025', 'h', 'k', 'k', 'jk', 'k', 'km', 'm', 'k', 'o', 'l', 'kg', 'ggg', 'bn', 'jj', '2025-01-08 15:52:34', '2025-01-08 15:52:34'),
(107, '7404101804930002', '1', 'Wa Ode Heni', '10 Maret 2020', 'TAK', '-', '47,5', '120/70', '-', '18 Cm', 'BALL', '-', '-', '-', '-', '-', '-', 'Istirahat yang cukup, makan sayur, perbanyak minum air', '2025-05-20 08:41:11', '2025-05-20 07:41:11'),
(110, '7404101804930002', '1', 'Wa Ode Heni, Pustu', '20 April 2020', 'TAK', '-', '53,2', '110/80', '-', '23 Cm', 'KEP', '-', '-', '-', '-', '-', '-', 'Perbanyak makan sayur, minum air putih', '2025-03-10 01:09:20', '2025-03-10 00:09:20'),
(111, '7404101804930002', '1', 'Wa Ode Heni, Pustu', '9 Mei 2020', 'Pusing', '-', '53,4', '100/50', '-', '28 Cm', '-', '-', '-', '-', '-', '-', '-', '-', '2025-03-10 01:15:24', '2025-03-10 01:15:24'),
(112, '7404101804930002', '1', 'Wa Ode Heni, Pustu', '19 Mei 2020', 'Ngilu Gigi', '-', '53,4', '102/77', '-', '28 Cm', 'KEP', '-', '-', '-', '-', '-', '-', 'Makan sayur, perbanyak istirahat', '2025-03-10 01:15:24', '2025-03-10 01:15:24'),
(113, '7404101804930002', '1', 'Wa Ode Heni, Pustu', '18 Juni 2020', 'TAK', '-', '56,5', '108/68', '-', '28 Cm', 'KEP', '-', '-', '-', '-', '-', '-', 'Makan sayur', '2025-03-10 01:15:24', '2025-03-10 01:15:24'),
(156, '7415074408020002', '1', 'Wa Ode Heni, Posyandu', '10 Juni 2024', 'TAK', '-', '47,5', '120/70', '-', '18 cm', 'BALL', '1', '-', '-1', '-', '-', '-', 'Istirahat yang cukup, makan sayur, perbanyak minum air putih', '2025-05-12 12:46:13', '2025-05-12 11:46:13'),
(159, '7415074408020002', '5', 'Bidan, puskesmas', '08/05/2025', '-', '6', '1', '1', '19', '65', 'h', 'j', 'j', 'nn', 'n', 'j', 'n', '-', '2025-05-04 14:10:33', '2025-05-04 13:10:33'),
(172, '7415074408020002', '1', 'Wa Ode Heni, Posyandu', '11 Juli 2024', 'Pusing', '-', '53,4', '100/50', '-', '28 Cm', 'KEP', '-', '-', '-', '-', '-', '-', 'Istirahat yang cukup, makan sayur, perbanyak minum air putih', '2025-05-12 12:46:13', '2025-05-12 11:46:13'),
(176, '740419410400002', '1', 'Bidan, Puskesmas', '22/01/2022', '-', '44', '69', '120/90', '28', '2 1/2 jr', 'BALL', '-', '-', '-', '-', '-', '-', 'Istirahat yang cukup, makan sayur, perbanyak minum air', '2025-05-24 05:03:06', '2025-05-24 05:03:06'),
(177, '7404195111980001', '1', 'Bidan, Puskemas', '04/10/2022', '-', '43', '70', '100/80', '28', '2 jr', 'BALL', '-', 'YA', '-', '-', '-', '-', '-', '2025-05-24 05:59:47', '2025-05-24 04:59:47'),
(178, '7404195111980001', '2', 'Bidan, Puskesmas', '31/12/2023', '-', '44', '60', '100/80', '28', '2 jr', 'BALL', '-', 'YA', '--', '-', '-', '-', '-', '2025-05-24 05:59:19', '2025-05-24 05:59:19'),
(179, '740419440408001', '1', 'Bidan, Puskesmas', '23/03/2025', '-', '44', '48', '100/90', '26', '2 1/2 jr', 'BALL', '-', 'YA', '-', '-', '-', '-', '-', '2025-05-24 06:17:28', '2025-05-24 06:17:28'),
(180, '740419510990001', '1', 'Bidan, Puskesmas', '24/04/2021', '-', '44', '33', '100/90', '28', '2 1/2 jr', 'BALL', '-', 'YA', '-', '-', '-', '-', '-', '2025-05-24 06:40:34', '2025-05-24 06:40:34'),
(181, '740419540799001', '1', 'Bidan, Puskesmas', '24/04/2021', '-', '44', '90', '120/90', '32', '3 jr', 'BALL', '-', 'YA', '-', '-', '-', '-', '-', '2025-05-24 06:52:53', '2025-05-24 06:52:53'),
(182, '7404195507970001', '1', 'Bidan, Puskesmas', '16/06/2022', '-', '44', '60', '100/80', '30', '3 jr', 'BALL', '-', 'YA', '-', '-', '-', '-', '-', '2025-05-24 07:03:07', '2025-05-24 07:03:07'),
(188, '7404194109980001', '1', 'Puskesmas, Mayang & Dewi', '20-12-2023', 'Mual-Mual', '18 mg', '58', '100/90', '27', '2 jr', 'ball', 'TT1', 'YA', '-', '-', '-', '-', '-', '2025-06-12 16:22:23', '2025-06-12 15:22:23'),
(189, '7404194109980001', '1', 'Puskemas, Marang % Dewi', '27-1-2024', 'Pusing', '22', '65', '100/80', '30', '2 jr', 'ball', 'TT2', 'YA', '-', '-', '-', '-', '-', '2025-06-12 16:22:23', '2025-06-12 16:22:23'),
(190, '12345678', '1', 'J', 'H', 'J', 'J', 'B', 'H', 'N', 'H', 'U', 'TT1', 'Y', 'NH[0-', '-', 'BALL', '-', '-', '2025-06-13 14:00:10', '2025-06-13 14:00:10'),
(191, '7404194109980001', '1', 'posyandu,mayang', '20-05-2025', 'pusing', '24 mg', '67', '90/100', '32', '2 jr', 'ball', 'TT3', 'YA', '-', '-', '-', '-', '-', '2025-06-16 03:48:41', '2025-06-16 03:48:41'),
(192, '7404194507020001', '4', 'Mayang, Dewi', '22/07/2022', 'Pusing', '30 mg', '60', '120/80', '32', '2jr', 'Ball', 'TT 5', 'Ya', '-', '-', '-', 'Ya', '-', '2025-06-19 11:34:34', '2025-06-19 11:34:34'),
(193, '7404101804930002', '1', 'TEST', 'J', 'J', 'J', 'J', 'J', 'J', 'J', 'J', 'J', 'J', 'J', 'J', 'J', 'J', 'J', '2025-07-08 20:14:06', '2025-07-08 20:14:06'),
(194, '7404101804930002', '1', 'j', 'j', 'j', 'j', 'j', 'j', 'j', 'j', 'j', 'j', 'j', 'j', 'j', 'j', 'j', 'j', '2025-07-09 11:45:06', '2025-07-09 11:45:06'),
(195, '7404101804930002', '1', 'j', 'j', 'j', 'j', 'j', 'j', 'j', 'j', 'j', 'j', 'j', 'j', 'j', 'j', 'j', 'j', '2025-07-15 22:50:51', '2025-07-15 22:50:51');

-- --------------------------------------------------------

--
-- Table structure for table `tabel_chatting`
--

CREATE TABLE `tabel_chatting` (
  `id` int NOT NULL,
  `nomor_hp_pengirim` varchar(12) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `nomor_hp_penerima` varchar(12) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `id_pengirim` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `posisi_pengirim` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `isi_pesan` text COLLATE utf8mb4_general_ci NOT NULL,
  `waktu_kirim` varchar(30) COLLATE utf8mb4_general_ci NOT NULL,
  `created_at` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `updated_at` timestamp NULL DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tabel_chatting`
--

INSERT INTO `tabel_chatting` (`id`, `nomor_hp_pengirim`, `nomor_hp_penerima`, `id_pengirim`, `posisi_pengirim`, `isi_pesan`, `waktu_kirim`, `created_at`, `updated_at`) VALUES
(285, '081119009287', '081322083963', '6', 'admin', 'Hallo', '06-03-2025 / 01:53', '2025-03-05 18:53:26', '2025-03-05 18:53:26'),
(286, '081119009287', '081322083963', '6', 'admin', 'test', '06-03-2025 / 01:54', '2025-03-05 18:54:54', '2025-03-05 18:54:54'),
(287, '081119009287', '081322083963', '6', 'admin', 'test', '06-03-2025 / 01:55', '2025-03-05 18:55:03', '2025-03-05 18:55:03'),
(288, '081119009287', '081322083963', '6', 'admin', 'test', '06-03-2025 / 01:59', '2025-03-05 18:59:56', '2025-03-05 18:59:56'),
(289, '081119009287', '081322083963', '6', 'admin', 'Hallo', '06-03-2025 / 02:04', '2025-03-05 19:04:15', '2025-03-05 19:04:15'),
(290, '081119009287', '081322083963', '6', 'admin', 'test', '06-03-2025 / 02:05', '2025-03-05 19:05:09', '2025-03-05 19:05:09'),
(291, '081119009287', '081322083963', '6', 'admin', 'jl', '06-03-2025 / 02:08', '2025-03-05 19:08:16', '2025-03-05 19:08:16'),
(292, '081119009287', '081322083963', '6', 'admin', 'jl', '06-03-2025 / 02:08', '2025-03-05 19:08:24', '2025-03-05 19:08:24'),
(293, '081119009287', '081322083963', '6', 'admin', 'kjl', '06-03-2025 / 02:08', '2025-03-05 19:08:47', '2025-03-05 19:08:47'),
(294, '081119009287', '081322083963', '6', 'admin', 'jklk', '06-03-2025 / 02:09', '2025-03-05 19:09:28', '2025-03-05 19:09:28'),
(295, '081119009287', '081322083963', '6', 'admin', 'hj', '06-03-2025 / 02:12', '2025-03-05 19:12:20', '2025-03-05 19:12:20'),
(296, '081119009287', '081322083963', '6', 'admin', 'jkl', '06-03-2025 / 02:12', '2025-03-05 19:12:28', '2025-03-05 19:12:28'),
(297, '081119009287', '081322083963', '6', 'admin', 'klj', '06-03-2025 / 02:15', '2025-03-05 19:15:09', '2025-03-05 19:15:09'),
(298, '081119009287', '081322083963', '6', 'admin', 'Hallo', '06-03-2025 / 02:15', '2025-03-05 19:15:19', '2025-03-05 19:15:19'),
(299, '081119009287', '082259594735', '6', 'admin', 'hai', '13-03-2025 / 15:12', '2025-03-13 08:12:02', '2025-03-13 08:12:02'),
(300, '081119009287', '0823', '6', 'admin', 'hai', '13-03-2025 / 15:13', '2025-03-13 08:13:00', '2025-03-13 08:13:00'),
(301, '081119009287', '0823', '6', 'admin', 'hai', '13-03-2025 / 15:14', '2025-03-13 08:14:56', '2025-03-13 08:14:56'),
(302, '081119009287', '081322083963', '6', 'admin', 'hai', '13-03-2025 / 15:18', '2025-03-13 08:18:41', '2025-03-13 08:18:41'),
(343, '082188567890', '081119009287', '', 'ibu posyandu', 'Halo Min', '21-03-2025 / 22:06', '2025-03-21 15:06:15', '2025-03-21 15:06:15'),
(344, '081119009287', '082188567890', '6', 'admin', 'iya, bagaimana Bu?', '21-03-2025 / 22:06', '2025-03-21 15:06:43', '2025-03-21 15:06:43'),
(345, '082188567890', '081119009287', '', 'ibu posyandu', 'ada yang ingin saya tanyakan', '21-03-2025 / 22:06', '2025-03-21 15:06:51', '2025-03-21 15:06:51'),
(346, '081119009287', '082188567890', '6', 'admin', 'apa itu?', '21-03-2025 / 22:07', '2025-03-21 15:07:09', '2025-03-21 15:07:09'),
(347, '082188567890', '081119009287', '', 'ibu posyandu', 'ini bu', '21-03-2025 / 22:07', '2025-03-21 15:07:19', '2025-03-21 15:07:19'),
(348, '081119009287', '082188567890', '6', 'admin', 'apa itu?', '21-03-2025 / 22:07', '2025-03-21 15:07:32', '2025-03-21 15:07:32'),
(366, '082218903245', '081219217512', '', 'ibu posyandu', 'p', '25-04-2025 / 10:13', '2025-04-25 03:13:39', '2025-04-25 03:13:39'),
(367, '081119009287', '082187614121', '6', 'admin', 'hai', '25-04-2025 / 11:57', '2025-04-25 04:57:01', '2025-04-25 04:57:01'),
(376, '082218903245', '082188567890', '', 'ibu posyandu', 'Assalamualaikum Bu', '20-05-2025 / 01:55', '2025-05-19 18:55:17', '2025-05-19 18:55:17'),
(378, '082188567890', '082218903245', '', 'ibu posyandu', 'Waalaikum Salam, Bagaimana Bu?', '20-05-2025 / 02:01', '2025-05-19 19:01:50', '2025-05-19 19:01:50'),
(379, '082218903245', '081119009287', '', 'ibu posyandu', 'Assalamualaikum Bu Bikor', '20-05-2025 / 02:05', '2025-05-19 19:05:53', '2025-05-19 19:05:53'),
(380, '081119009287', '082218903245', '6', 'admin', 'Waalaikum Salam Bu Elfianti, \r\nada yang bisa saya bantu?', '20-05-2025 / 02:06', '2025-05-19 18:08:33', '2025-05-19 19:06:36'),
(381, '082218903245', '081322083963', '', 'ibu posyandu', 'Assalamualaikum Bu Filna', '20-05-2025 / 02:09', '2025-05-19 19:09:06', '2025-05-19 19:09:06'),
(382, '081322083963', '082218903245', '', 'ibu posyandu', 'Waalaikum Salam, Bagaimana Bu?', '20-05-2025 / 02:13', '2025-05-19 19:13:21', '2025-05-19 19:13:21'),
(383, '085229397592', '082218903245', '', 'ibu posyandu', 'Assalamualaikum Bu\nElfianti, saya izin bertanya', '20-05-2025 / 16:29', '2025-05-20 09:29:58', '2025-05-20 09:29:58'),
(384, '082218903245', '085229397592', '', 'ibu posyandu', 'Iya, mau bertanya Apa Bu?', '20-05-2025 / 16:34', '2025-05-20 09:34:13', '2025-05-20 09:34:13'),
(385, '085229397592', '081119009287', '', 'ibu posyandu', 'Assalamualaikum Bu Bikor', '20-05-2025 / 16:41', '2025-05-20 09:41:08', '2025-05-20 09:41:08'),
(386, '081119009287', '085229397592', '6', 'admin', 'Iya, Bagaimana Bu?', '20-05-2025 / 16:41', '2025-05-20 09:41:43', '2025-05-20 09:41:43'),
(387, '085229397592', '081322083963', '', 'ibu posyandu', 'Assalamualaikum Bu Filna,\nApakah hari ini anda pergi ke Posyadu?', '20-05-2025 / 16:43', '2025-05-20 09:43:13', '2025-05-20 09:43:13'),
(388, '081322083963', '085229397592', '', 'ibu posyandu', 'Iya saya pergi sebentar', '20-05-2025 / 16:44', '2025-05-20 09:44:08', '2025-05-20 09:44:08'),
(389, '081119009287', '082218903245', '6', 'admin', 'iya waalaikumussalam', '03-06-2025 / 13:29', '2025-06-03 06:29:57', '2025-06-03 06:29:57'),
(390, '082218903245', '081119009287', '', 'ibu posyandu', 'Hallo', '03-06-2025 / 13:30', '2025-06-03 06:30:26', '2025-06-03 06:30:26'),
(391, '081119009287', '082218903245', '6', 'admin', 'iya', '03-06-2025 / 13:31', '2025-06-03 06:31:04', '2025-06-03 06:31:04'),
(392, '081119009287', '081278908761', '6', 'admin', 'HALO IBU', '13-06-2025 / 21:14', '2025-06-13 14:14:15', '2025-06-13 14:14:15'),
(393, '081278908761', '081119009287', '', 'ibu posyandu', 'Halo juga Bu bidan', '13-06-2025 / 21:14', '2025-06-13 14:14:40', '2025-06-13 14:14:40'),
(394, '082218903245', '081119009287', '', 'ibu posyandu', 'halo bikor', '13-06-2025 / 21:15', '2025-06-13 14:15:44', '2025-06-13 14:15:44'),
(395, '081119009287', '082218903245', '6', 'admin', 'HALO JUGA IBU', '13-06-2025 / 21:16', '2025-06-13 14:16:02', '2025-06-13 14:16:02'),
(396, '085229397592', '081119009287', '', 'ibu posyandu', 'halo', '15-07-2025 / 07:04', '2025-07-15 00:04:18', '2025-07-15 00:04:18');

-- --------------------------------------------------------

--
-- Table structure for table `tabel_data_anak`
--

CREATE TABLE `tabel_data_anak` (
  `id` bigint UNSIGNED NOT NULL,
  `nik_ibu` varchar(16) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `nama` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `jenis_kelamin` varchar(10) COLLATE utf8mb4_unicode_ci NOT NULL,
  `tempat_lahir_anak` varchar(30) COLLATE utf8mb4_unicode_ci NOT NULL,
  `tanggal_lahir_anak` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `tempat_atau_tanggal_lahir` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `anak_ke` varchar(5) COLLATE utf8mb4_unicode_ci NOT NULL,
  `dari` varchar(5) COLLATE utf8mb4_unicode_ci NOT NULL,
  `no_akta_kelahiran` varchar(16) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `no_jkn_bpjs` varchar(14) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Dumping data for table `tabel_data_anak`
--

INSERT INTO `tabel_data_anak` (`id`, `nik_ibu`, `nama`, `jenis_kelamin`, `tempat_lahir_anak`, `tanggal_lahir_anak`, `tempat_atau_tanggal_lahir`, `anak_ke`, `dari`, `no_akta_kelahiran`, `no_jkn_bpjs`, `created_at`, `updated_at`) VALUES
(108, '7415074408020002', 'Nadifa', 'Perempuan', 'Marawali', '2024-03-14', 'Marawali/14 Maret 2020', '1', '1', '0', '0', '2025-04-21 06:24:38', '2025-06-23 17:41:24'),
(109, '7415074408020002', 'Bayi Ny. Filna', 'Perempuan', 'Marawali', '2025-05-12', 'Marawali/1 Maret 2025', '2', '2', '0', '0', '2025-04-21 07:07:08', '2025-05-12 11:51:21'),
(115, '8103044306900001', 'BAYI NY. RIDAYANI', 'Laki-Laki', '', '', 'Marawali/16 Januari 2025', '1', '1', '7415701601257645', '-', '2025-04-23 16:51:42', '2025-04-23 17:18:21'),
(123, '7404197112980002', 'AQIL MAUZAN', 'Laki-Laki', 'Marawali', '2020-09-19', 'Marawali/19-09-2020', '1', '2', '-', '-', '2025-04-24 05:19:13', '2025-05-18 16:12:12'),
(124, '7404196603020002', 'ALZAN ZEA SADIA', 'Laki-Laki', 'Marawali', '2020-10-16', 'Marawali/16-10-2020', '1', '1', '7415705610208513', '-', '2025-04-24 05:27:42', '2025-05-18 15:57:04'),
(125, '7404194301860003', 'LAODE NIZWAN', 'Laki-Laki', 'Marawali', '2020-11-08', 'Marawali/08-11-2020', '1', '2', '-', '-', '2025-04-24 05:48:44', '2025-05-18 15:50:19'),
(213, '7404195305940001', 'Muhammad al-malik', 'Laki-Laki', 'Marawali', '2020-05-18', NULL, '1', '2', '-', '00071910261004', '2025-05-18 10:39:16', '2025-06-10 15:00:13'),
(218, '917101560791004', 'Asma Nadia', 'Perempuan', 'Marawali', '2020-06-02', NULL, '1', '2', '-', '-', '2025-05-18 10:44:36', '2025-05-18 10:44:36'),
(219, '917101560791004', 'By. ny. sunarti', 'Laki-Laki', 'Marawali', '2025-03-31', NULL, '2', '2', '-', '-', '2025-05-18 10:45:54', '2025-05-18 10:45:54'),
(221, '7404196406890001', 'Wa Ode. Riana Sari', 'Perempuan', 'Marawali', '2020-07-13', NULL, '1', '2', '-', '-', '2025-05-18 10:50:58', '2025-05-18 10:50:58'),
(222, '7404196406890001', 'Muhammad Rehan', 'Laki-Laki', 'Marawali', '2022-11-04', NULL, '2', '2', '-', '-', '2025-05-18 10:52:18', '2025-05-18 10:52:18'),
(223, '7404197151298000', 'Muhammad Bilal', 'Laki-Laki', 'Marawali', '2020-07-19', NULL, '1', '1', '-', '-', '2025-05-18 10:59:18', '2025-05-18 13:22:35'),
(224, '7404194512920002', 'Sanum Syanum Ruwaiha', 'Perempuan', 'Marawali', '2020-08-14', NULL, '1', '2', '-', '-', '2025-05-18 11:04:05', '2025-05-18 11:04:05'),
(225, '7404194512920002', 'Ratu Ayzela', 'Perempuan', 'Marawali', '2024-11-16', NULL, '2', '2', '-', '-', '2025-05-18 11:05:05', '2025-05-18 11:05:05'),
(226, '7404195508980001', 'Alisya', 'Perempuan', 'Marawali', '2020-11-25', NULL, '1', '1', '-', '-', '2025-05-18 13:30:53', '2025-05-18 13:30:53'),
(227, '7404194301860003', 'La Ode Muhammad Razan', 'Laki-Laki', 'Marawali', '2022-11-15', NULL, '2', '2', '7415701511226931', '-', '2025-05-18 15:50:19', '2025-05-18 15:50:19'),
(228, '7404197112980002', 'Muh. Nabil Rasyid', 'Laki-Laki', 'Marawali', '2024-01-20', NULL, '2', '2', '-', '-', '2025-05-18 16:12:12', '2025-05-18 16:12:12'),
(229, '740419670440002', 'Aladin', 'Laki-Laki', 'Marawali', '2021-12-07', NULL, '1', '2', '7415700712213186', '-', '2025-05-22 07:42:04', '2025-05-22 07:48:45'),
(230, '740419670440002', 'Ambina Fitria', 'Perempuan', 'Marawali', '2024-04-07', NULL, '2', '2', '-', '-', '2025-05-22 07:46:23', '2025-05-22 07:48:45'),
(231, '7404194107980002', 'Ramaya Idyilla Ahmad', 'Perempuan', 'Baubau', '2022-03-25', NULL, '1', '1', '-', '-', '2025-05-22 08:02:05', '2025-05-22 08:02:05'),
(232, '7404195230497000', 'Muh. Ananta Ahyan', 'Laki-Laki', 'Marawali', '2024-09-06', NULL, '1', '1', '-', '-', '2025-05-22 08:10:51', '2025-05-22 08:10:51'),
(233, '7404194107880002', 'Qaisya Azkayra', 'Perempuan', 'Marawali', '2022-05-29', NULL, '1', '3', '7415076905220002', '-', '2025-05-22 08:17:34', '2025-05-22 08:17:34'),
(234, '7404194107880002', 'Qeisya Azkayla', 'Perempuan', 'Marawali', '2022-05-29', NULL, '2', '3', '7415076905220001', '-', '2025-05-22 08:19:22', '2025-05-22 08:19:22'),
(235, '7404194107880002', 'Alsava Azqya Maryam', 'Perempuan', 'Marawali', '2025-01-25', NULL, '3', '3', '7415706211204786', '-', '2025-05-22 08:21:11', '2025-05-22 08:25:25'),
(236, '7404195507970001', 'Muh. Qoyyim Arrazi', 'Laki-Laki', 'Marawali', '1997-07-15', NULL, '1', '1', '7415701606221323', '-', '2025-05-22 08:31:03', '2025-05-22 08:31:03'),
(237, '740419540799001', 'Amila Anasya', 'Perempuan', 'Marawali', '2021-04-24', NULL, '1', '1', '741507604210001', '-', '2025-05-22 08:39:23', '2025-05-22 08:39:23'),
(239, '740419510990001', 'Tian Anugrah', 'Laki-Laki', 'Marawali', '2021-04-24', NULL, '1', '1', '7415072304210001', '-', '2025-05-22 08:46:16', '2025-05-22 08:46:16'),
(240, '740419440408001', 'By. Ny.Salma', 'Perempuan', 'Marawali', '2025-03-23', NULL, '1', '1', '7415706304258462', '-', '2025-05-22 08:52:45', '2025-05-22 08:52:45'),
(242, '7404195111980001', 'Nur Hanan Mirza', 'Laki-Laki', 'Marawali', '2022-10-28', NULL, '1', '2', '7415709224734015', '-', '2025-05-22 09:01:59', '2025-05-22 09:01:59'),
(243, '7404195111980001', 'Hanum', 'Perempuan', 'Marawali', '2023-12-31', NULL, '2', '2', '7415707112239814', '-', '2025-05-22 09:03:40', '2025-05-22 09:03:40'),
(244, '740419410400002', 'Muh. Rafa', 'Laki-Laki', 'Marawali', '2022-01-22', NULL, '1', '2', '7415702201226485', '-', '2025-05-24 04:45:49', '2025-06-16 03:44:12'),
(245, '7404419500298000', 'Wa Ode Azqiya Ramadani', 'Perempuan', 'Batauga', '2021-04-22', NULL, '1', '2', '741507620420001', '-', '2025-05-27 03:31:29', '2025-06-19 09:49:31'),
(248, '7404195221203000', 'Aisyah Maira', 'Perempuan', 'Marawali', '2022-02-23', NULL, '1', '1', '7415706302228253', '-', '2025-05-27 03:36:04', '2025-05-27 03:36:04'),
(250, '7404194128880001', 'Wa Ode Sabyan Nur Hasrita', 'Perempuan', 'Marawali', '2023-03-12', NULL, '5', '5', '7415075203230002', '-', '2025-05-27 03:58:20', '2025-05-27 03:58:20'),
(251, '7404194504910001', 'Cahaya Nazwa', 'Perempuan', 'Marawali', '2022-07-17', NULL, '1', '1', '7415705707227247', '-', '2025-05-27 04:04:16', '2025-05-27 04:04:16'),
(252, '9171010510820002', 'Radit Febrian', 'Laki-Laki', 'marawali', '2022-12-16', NULL, '1', '1', '7415701612222123', '-', '2025-05-27 04:08:48', '2025-05-27 04:08:48'),
(253, '7404194507920002', 'La Ode Shamil Kahn Mumtaz', 'Laki-Laki', 'Marawali', '2022-12-16', NULL, '1', '1', '7415072511220001', '-', '2025-05-27 04:13:05', '2025-05-27 04:13:05'),
(255, '9207015511980001', 'Wa Ode Kanaya', '-Pilih-', 'Marawali', '2022-08-26', NULL, '1', '1', '741506608225419', '-', '2025-05-27 04:21:10', '2025-05-27 04:21:10'),
(256, '7404194118020002', 'Khaisan Alsando', 'Perempuan', 'Marawali', '2023-06-13', NULL, '1', '1', '7415071306230000', '-', '2025-05-27 04:26:55', '2025-05-27 04:26:55'),
(257, '7404194108000002', 'Anaya Riskiana', 'Perempuan', 'Marawali', '2023-11-10', NULL, '1', '1', '7415075501240000', '-', '2025-05-27 04:30:50', '2025-05-27 04:30:50'),
(258, '7404204509930001', 'Adira', 'Perempuan', 'Marawali', '2023-06-27', NULL, '1', '1', '7415706706239909', '-', '2025-05-27 04:34:40', '2025-05-27 04:34:40'),
(259, '7404197889300002', 'Meidina islamova', 'Perempuan', 'Marawali', '2023-05-09', NULL, '1', '1', '7415704905052358', '-', '2025-05-27 04:38:03', '2025-05-27 04:38:03'),
(260, '7404195717980002', 'Muh. Anata Said', 'Laki-Laki', 'Marawali', '2024-07-19', NULL, '1', '1', '-', '-', '2025-05-27 04:41:58', '2025-05-27 04:41:58'),
(261, '7404194140791000', 'Tanisya', 'Perempuan', 'Marawali', '2024-10-01', NULL, '1', '1', '-', '-', '2025-05-27 04:45:29', '2025-05-27 04:45:29'),
(262, '7404194801030001', 'Yumira Riskiana Hera', 'Perempuan', 'Marawali', '2024-02-14', NULL, '1', 'q', '-', '-', '2025-05-27 04:48:43', '2025-05-27 04:48:43'),
(263, '9271015502930005', 'Andi Muhammad Attala', 'Laki-Laki', 'Marawali', '2024-01-01', NULL, '1', '1', '741570012422602', '00002345678039', '2025-05-27 04:53:25', '2025-05-27 04:53:25'),
(265, '7404195008970001', 'Nur Irfa Mikaira', 'Perempuan', 'Marawali', '2022-03-10', NULL, '2', '3', '7415075002220001', '0000658750872', '2025-05-27 04:57:56', '2025-05-27 04:57:56'),
(266, '7404195008970001', 'Muhammad Nur Firzan', 'Laki-Laki', 'Marawali', '2024-07-11', NULL, '3', '3', '7415701107249952', '-', '2025-05-27 04:59:04', '2025-05-27 04:59:04'),
(267, '7404195130595000', 'Arshaka Nirendra', 'Laki-Laki', 'Marawali', '2025-01-16', NULL, '1', '1', '741570161257645', '0000345178023', '2025-05-27 05:02:35', '2025-05-27 05:02:35'),
(268, '7404194810010001', 'Husniatul Aishwa', 'Perempuan', 'Marawali', '2021-04-12', NULL, '1', '1', '74157504210002', '0000215783229', '2025-05-27 05:31:17', '2025-05-27 05:31:17'),
(269, '740419671299001', 'La Ode Zalfin', 'Laki-Laki', 'Marawali', '2021-11-09', NULL, '1', '1', '7415700911214862', '0000235788965', '2025-05-27 05:35:20', '2025-05-27 05:35:20'),
(270, '7404196612010001', 'La Hasan A', 'Laki-Laki', 'Marawali', '2021-06-13', NULL, '1', '1', '7415701366210003', '0000432179963', '2025-05-27 05:39:29', '2025-05-27 05:39:29'),
(271, '7404195157990001', 'Shanin Rizkiya', 'Perempuan', 'Marawali', '2025-02-24', NULL, '1', '1', '7415702402253365', '-', '2025-05-27 05:44:43', '2025-07-09 17:19:47'),
(272, '7404066403000001', 'Saflan', 'Laki-Laki', 'Marawali', '2024-05-09', NULL, '1', '1', '7415702905244219', '0000526322187', '2025-05-27 05:48:10', '2025-05-27 05:48:10'),
(274, '7404192112060002', 'Narendra', 'Laki-Laki', 'Marawali', '2023-03-20', NULL, '1', '1', '-', '-', '2025-05-27 05:54:56', '2025-05-27 05:54:56'),
(275, '7404194507020001', 'Qiana safika', 'Perempuan', 'Marawali', '2022-07-22', NULL, '4', '4', '-', '-', '2025-05-27 05:58:22', '2025-06-19 11:30:21'),
(277, '7404194109980001', 'Wa Ode Mikaila', 'Perempuan', 'Marawali', '2024-05-27', NULL, '1', '1', '-', '-', '2025-05-27 06:01:25', '2025-05-27 06:01:25'),
(278, '9115044403520001', 'Wa Ode Kharisma', 'Perempuan', 'Marawali', '2022-08-08', NULL, '1', '1', '-', '-', '2025-05-27 06:04:31', '2025-05-27 06:04:31'),
(282, '7404195221203000', 'Zaena aiyla', 'Perempuan', 'Marawali', '2024-06-17', NULL, '2', '2', '741570106244819', '0000563218932', '2025-05-27 06:18:37', '2025-05-27 06:18:37'),
(310, '7404195305940001', 'Inayah Nurul Fatihah', 'Perempuan', 'Marawali', '2022-05-21', NULL, '2', '2', '-', '00071910261004', '2025-06-10 15:00:13', '2025-06-10 15:00:13'),
(317, '7404195810100002', 'HASRUL', 'Laki-Laki', 'Marawali', '2022-03-14', NULL, '1', '1', '7415701403215438', '00032176553841', '2025-06-15 10:27:19', '2025-06-15 10:27:19'),
(318, '7404194302092002', 'Wa Ode Rania Al Syirah', 'Perempuan', 'Marawali', '2021-03-04', NULL, '1', '1', '7415704403215063', '00032547892331', '2025-06-15 10:50:06', '2025-06-15 10:50:06'),
(319, '7404195301090002', 'Shanum Zahra', 'Perempuan', 'Marawali', '2021-01-02', NULL, '1', '1', '7415705408208692', '00032679342521', '2025-06-15 11:04:12', '2025-06-15 11:04:12'),
(321, '7404419500298000', 'AHMAD HANIF', 'Laki-Laki', 'MARAWALI', '2023-02-05', NULL, '2', '2', '7415028456720002', '00002638198321', '2025-06-19 09:49:31', '2025-06-19 09:49:31'),
(322, '7404195120100001', 'Aprillia Ramadani', 'Perempuan', 'Marawali', '2024-04-03', NULL, '1', '1', '741570430424963', '0000674554321', '2025-06-23 18:11:36', '2025-06-23 18:11:36'),
(323, '7404101804930002', 'Wa Ode Keisha Azura Zilvania', 'Perempuan', 'Marawali', '2020-11-10', NULL, '1', '1', '-', '-', '2025-07-08 20:28:37', '2025-07-08 20:28:37');

-- --------------------------------------------------------

--
-- Table structure for table `tabel_data_imunisasi_anak`
--

CREATE TABLE `tabel_data_imunisasi_anak` (
  `id` int NOT NULL,
  `nik_ibu` varchar(16) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `nama_ibu` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `nama_ayah` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `nama_anak` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `anak_ke` varchar(5) COLLATE utf8mb4_general_ci NOT NULL,
  `hepatitis_0` varchar(20) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `hepatitis_1` varchar(20) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `hepatitis_2` varchar(20) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `hepatitis_3` varchar(20) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `hepatitis_4` varchar(20) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `hepatitis_5` varchar(20) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `hepatitis_6` varchar(20) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `hepatitis_7` varchar(20) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `hepatitis_8` varchar(20) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `hepatitis_9` varchar(20) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `hepatitis_10` varchar(20) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `hepatitis_11` varchar(20) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `hepatitis_12` varchar(20) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `bcg_0` varchar(20) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `bcg_1` varchar(20) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `bcg_2` varchar(20) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `bcg_3` varchar(20) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `bcg_4` varchar(20) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `bcg_5` varchar(20) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `bcg_6` varchar(20) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `bcg_7` varchar(20) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `bcg_8` varchar(20) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `bcg_9` varchar(20) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `bcg_10` varchar(20) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `bcg_11` varchar(20) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `bcg_12` varchar(20) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `polio_tetes_0` varchar(20) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `polio_tetes_1` varchar(20) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `polio_tetes_2` varchar(20) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `polio_tetes_3` varchar(20) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `polio_tetes_4` varchar(20) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `polio_tetes_5` varchar(20) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `polio_tetes_6` varchar(20) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `polio_tetes_7` varchar(20) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `polio_tetes_8` varchar(20) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `polio_tetes_9` varchar(20) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `polio_tetes_10` varchar(20) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `polio_tetes_11` varchar(20) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `polio_tetes_12` varchar(20) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `dan_lain_lain_0` varchar(20) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `dan_lain_lain_1` varchar(20) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `dan_lain_lain_2` varchar(20) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `dan_lain_lain_3` varchar(20) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `dan_lain_lain_4` varchar(20) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `dan_lain_lain_5` varchar(20) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `dan_lain_lain_6` varchar(20) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `dan_lain_lain_7` varchar(20) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `dan_lain_lain_8` varchar(20) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `dan_lain_lain_9` varchar(20) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `dan_lain_lain_10` varchar(20) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `dan_lain_lain_11` varchar(20) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `dan_lain_lain_12` varchar(20) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `created_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `updated_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tabel_data_imunisasi_anak`
--

INSERT INTO `tabel_data_imunisasi_anak` (`id`, `nik_ibu`, `nama_ibu`, `nama_ayah`, `nama_anak`, `anak_ke`, `hepatitis_0`, `hepatitis_1`, `hepatitis_2`, `hepatitis_3`, `hepatitis_4`, `hepatitis_5`, `hepatitis_6`, `hepatitis_7`, `hepatitis_8`, `hepatitis_9`, `hepatitis_10`, `hepatitis_11`, `hepatitis_12`, `bcg_0`, `bcg_1`, `bcg_2`, `bcg_3`, `bcg_4`, `bcg_5`, `bcg_6`, `bcg_7`, `bcg_8`, `bcg_9`, `bcg_10`, `bcg_11`, `bcg_12`, `polio_tetes_0`, `polio_tetes_1`, `polio_tetes_2`, `polio_tetes_3`, `polio_tetes_4`, `polio_tetes_5`, `polio_tetes_6`, `polio_tetes_7`, `polio_tetes_8`, `polio_tetes_9`, `polio_tetes_10`, `polio_tetes_11`, `polio_tetes_12`, `dan_lain_lain_0`, `dan_lain_lain_1`, `dan_lain_lain_2`, `dan_lain_lain_3`, `dan_lain_lain_4`, `dan_lain_lain_5`, `dan_lain_lain_6`, `dan_lain_lain_7`, `dan_lain_lain_8`, `dan_lain_lain_9`, `dan_lain_lain_10`, `dan_lain_lain_11`, `dan_lain_lain_12`, `created_at`, `updated_at`) VALUES
(7, '7404101804930002', 'Wa Ode Asriana', '', 'Wa Ode Keisha Azura Zilvania', '1', '23 Juli 2020', '-', '-', '-', '-', 'null', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '17 Oktober 2020', '-', 'null', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '16 November 2020', 'null', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '16 November 2020', 'null', '-', '-', '-', '-', '-', '-', '-', '2025-03-10 01:50:21', '2025-04-24 20:24:47'),
(30, '7404192112060002', 'Darti', 'Onan', 'Narendra', '1', '2023-03-20', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2023-05-05', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2023-05-05', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2025-06-15 14:24:10', '2025-06-15 14:24:10'),
(31, '7404195305940001', 'RISMAWATI', 'La Ode amsal', 'Muhammad al-malik', '1', '2020-05-18', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2020-06-20', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2020-06-20', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2025-06-15 14:31:09', '2025-06-15 14:31:09'),
(32, '7404195305940001', 'RISMAWATI', 'La Ode amsal', 'Inayah Nurul Fatihah', '2', '2022-05-21', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2022-06-20', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2022-06-20', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2025-06-15 14:31:59', '2025-06-15 14:31:59'),
(33, '7404194109980001', 'Wa Ode Isrami', 'Darzin', 'Wa Ode Mikaila', '1', '2024-05-27', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2024-06-29', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2024-06-29', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2025-06-15 14:33:22', '2025-06-15 14:33:22'),
(34, '7404194507020001', 'Sarnawati', 'Abdul Samat', 'Qiana safika', '3', '2022-07-22', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2022-08-27', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2022-07-27', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2025-06-15 14:36:11', '2025-06-15 14:36:11'),
(35, '7404066403000001', 'Nurfina', 'Alan', 'Saflan', '1', '2024-05-29', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2024-06-20', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2024-06-20', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2025-06-15 14:38:11', '2025-06-15 14:38:11'),
(36, '7404195301090002', 'SUFALIN', 'ABDUL UKIS', 'Shanum Zahra', '1', '2021-01-02', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2021-02-05', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2021-02-05', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2025-06-15 14:39:25', '2025-06-15 14:39:25'),
(37, '7404195221203000', 'Elvania', 'Hilyamin', 'Aisyah Maira', '1', '2024-06-17', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2024-08-08', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2024-08-08', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2025-06-15 14:40:16', '2025-06-15 14:42:02'),
(38, '7404195221203000', 'Elvania', 'Hilyamin', 'Zaena aiyla', '2', '0022-02-23', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2022-03-26', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2022-03-26', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2025-06-15 14:43:17', '2025-06-15 14:43:17'),
(39, '917101560791004', 'SUNARTI', 'Darson', 'Asma Nadia', '1', '2020-06-02', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2020-03-05', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2020-03-05', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2025-06-15 14:45:21', '2025-06-15 14:45:21'),
(40, '917101560791004', 'SUNARTI', 'Darson', 'By. ny. sunarti', '2', '2025-03-31', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2025-04-05', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2025-04-05', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2025-06-15 14:46:26', '2025-06-15 14:46:42'),
(41, '7404195810100002', 'ZIANA', 'RASID', 'HASRUL', '1', '2021-03-14', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2021-03-17', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2021-03-17', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2025-06-15 14:47:37', '2025-06-15 14:47:37'),
(42, '740419410400002', 'Musrida', 'La Ami', 'Muh. Rafa', '1', '2022-01-22', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2022-02-25', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '0202-02-25', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2025-06-15 14:55:33', '2025-06-16 15:00:46'),
(43, '7404195111980001', 'Susilawati', 'Risno', 'Nur Hanan Mirza', '1', '2022-10-28', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2022-12-05', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2022-12-05', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2025-06-16 15:02:59', '2025-06-16 15:02:59'),
(44, '7404195111980001', 'Susilawati', 'Risno', 'Hanum', '2', '2023-12-31', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2024-02-08', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2024-02-08', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2025-06-16 15:04:43', '2025-06-16 15:04:43'),
(45, '740419440408001', 'Salma', 'Rahim', 'By. Ny.Salma', '1', '2025-03-23', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2025-05-15', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2025-05-15', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2025-06-16 15:06:29', '2025-06-16 15:06:29'),
(46, '740419510990001', 'Dasniar', 'Resmin', 'Tian Anugrah', '1', '2021-04-24', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2021-05-26', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2021-05-26', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2025-06-16 15:07:47', '2025-06-16 15:07:47'),
(47, '740419540799001', 'Naria', 'Sahadin', 'Amila Anasya', '1', '0221-04-24', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2021-05-26', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2021-05-26', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2025-06-16 15:09:12', '2025-06-16 15:09:12'),
(48, '7404195507970001', 'Isnawati', 'Asrin', 'Muh. Qoyyim Arrazi', '1', '2021-06-16', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2021-07-20', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2021-07-20', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2025-06-16 15:12:03', '2025-06-16 15:12:03'),
(49, '7404194107880002', 'Nasra', 'Sutriadin', 'Qaisya Azkayra', '1', '2022-05-29', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2022-07-05', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2022-07-05', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2025-06-16 15:13:41', '2025-06-16 15:13:41'),
(50, '7404194107880002', 'Nasra', 'Sutriadin', 'Qeisya Azkayla', '2', '2022-05-29', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2022-07-05', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2022-07-05', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2025-06-16 15:15:44', '2025-06-16 15:15:44'),
(51, '7404194107880002', 'Nasra', 'Sutriadin', 'Alsava Azqya Maryam', '3', '2025-01-25', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2025-03-08', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2025-03-08', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2025-06-16 15:17:03', '2025-06-16 15:17:03'),
(52, '7404195230497000', 'Farnia', 'Hariono Asadi', 'Muh. Ananta Ahyan', '1', '2024-09-06', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2024-10-08', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2024-10-08', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2025-06-16 15:18:02', '2025-06-16 15:18:02'),
(53, '7404194107980002', 'Andriani', 'Ahmad', 'Ramaya Idyilla Ahmad', '1', '2022-03-25', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2022-05-05', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2022-05-05', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2025-06-16 15:20:05', '2025-06-16 15:20:05'),
(54, '740419670440002', 'Yusniar', 'Hasaru', 'Aladin', '1', '2021-12-07', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2021-08-12', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2021-08-12', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2025-06-16 15:21:17', '2025-06-16 15:21:17'),
(55, '740419670440002', 'Yusniar', 'Hasaru', 'Ambina Fitria', '2', '2024-04-07', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2024-05-08', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2024-05-08', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2025-06-16 15:22:21', '2025-06-16 15:22:21'),
(56, '7404195508980001', 'NURYANTI', 'HASBIN', 'Alisya', '1', '2020-11-25', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2020-12-27', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2020-12-27', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2025-06-16 15:23:34', '2025-06-16 15:23:34'),
(57, '7404196406890001', 'DARLI', 'LA BAHARUDDIN', 'Wa Ode. Riana Sari', '1', '2020-07-12', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2021-01-15', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2021-01-15', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2025-06-16 15:26:31', '2025-06-16 15:26:31'),
(58, '7404196406890001', 'DARLI', 'LA BAHARUDDIN', 'Muhammad Rehan', '2', '2022-11-04', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2022-12-05', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2022-12-05', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2025-06-16 15:27:29', '2025-06-16 15:27:29'),
(59, '7404197151298000', 'RUFAIDA', 'La Taumi', 'Muhammad Bilal', '1', '2020-07-19', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2020-08-20', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2020-08-20', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2025-06-16 15:28:48', '2025-06-16 15:28:48'),
(60, '7404194512920002', 'Waode Lilis Ardila', 'Akbar', 'Sanum Syanum Ruwaiha', '1', '2020-08-14', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2020-09-15', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2020-09-15', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2025-06-16 15:30:49', '2025-06-16 15:30:49'),
(61, '7404194512920002', 'Waode Lilis Ardila', 'Akbar', 'Ratu Ayzela', '2', '2024-11-16', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2024-12-25', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2024-12-25', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2025-06-16 15:31:56', '2025-06-16 15:31:56'),
(62, '7415074408020002', 'Filna', 'La Unda', 'Nadifa', '1', '2024-03-14', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2024-04-17', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2024-04-17', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2025-06-16 15:33:08', '2025-06-16 15:33:08'),
(63, '7415074408020002', 'Filna', 'La Unda', 'Bayi Ny. Filna', '2', '2025-03-01', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2025-06-16 15:33:47', '2025-06-16 15:33:47'),
(64, '7404194504910001', 'Nafia', 'Aruti', 'Cahaya Nazwa', '1', '2022-07-17', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2022-08-20', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2022-08-20', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2025-06-16 15:40:32', '2025-06-16 15:40:32'),
(65, '9171010510820002', 'Subianti', 'Darwin', 'Radit Febrian', '1', '2022-12-16', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2023-01-08', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2023-01-08', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2025-06-16 15:42:07', '2025-06-16 15:42:07'),
(66, '9207015511980001', 'Nastia', 'La Ode Mazdi', 'Wa Ode Kanaya', '1', '2022-08-26', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2022-09-27', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2022-09-27', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2025-06-16 15:48:14', '2025-06-16 15:48:14'),
(67, '7404194108000002', 'Artianti', 'Farhan Abbas', 'Anaya Riskiana', '1', '2023-11-10', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2023-12-15', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2023-12-15', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2025-06-16 15:55:12', '2025-06-16 15:55:12'),
(68, '7415074408020002', 'Filna', 'La Unda', 'Nadifa', '1', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2025-07-15 19:57:09', '2025-07-15 19:57:09');

-- --------------------------------------------------------

--
-- Table structure for table `tabel_data_obstetri`
--

CREATE TABLE `tabel_data_obstetri` (
  `id` bigint UNSIGNED NOT NULL,
  `nik_ibu` varchar(16) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `kehamilan_ke` varchar(5) COLLATE utf8mb4_unicode_ci NOT NULL,
  `tahun` varchar(4) COLLATE utf8mb4_unicode_ci NOT NULL,
  `lahir_hidup` varchar(10) COLLATE utf8mb4_unicode_ci NOT NULL,
  `lahir_aterm` varchar(10) COLLATE utf8mb4_unicode_ci NOT NULL,
  `lahir_spontan` varchar(10) COLLATE utf8mb4_unicode_ci NOT NULL,
  `berat_lahir_atau_panjang_lahir` varchar(10) COLLATE utf8mb4_unicode_ci NOT NULL,
  `tempat_bersalin_dan_tenakes` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `kondisi_anak_saat_ini` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `komplikasi_kehamilan_atau_persalinan` varchar(30) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Dumping data for table `tabel_data_obstetri`
--

INSERT INTO `tabel_data_obstetri` (`id`, `nik_ibu`, `kehamilan_ke`, `tahun`, `lahir_hidup`, `lahir_aterm`, `lahir_spontan`, `berat_lahir_atau_panjang_lahir`, `tempat_bersalin_dan_tenakes`, `kondisi_anak_saat_ini`, `komplikasi_kehamilan_atau_persalinan`, `created_at`, `updated_at`) VALUES
(47, '7404101804930002', '1', '2020', 'Hidup', 'Aterm', 'Spontan', '2400/50', 'Rumah, Wa Ode Heni', 'Baik', 'Tidak Ada', '2025-03-09 18:26:36', '2025-03-09 18:49:55'),
(48, '7404101311900011', '1', '2021', 'Hidup', 'Aterm', 'Spontan', '2300/51', 'Rumah, Wa Ode Heni', 'Baik', 'Tidak Ada', '2025-03-09 18:28:52', '2025-03-09 19:23:52'),
(49, '7404101311900011', '2', '2023', 'Hidup', 'Aterm', 'Spontan', '2500/50', 'Rumah, Wa Ode Heni', 'Baik', 'Tidak Ada', '2025-03-09 18:30:58', '2025-03-09 19:23:52'),
(50, '7404102501890010', '1', '2021', 'Hidup', 'Aterm', 'Spontan', '2300/52', 'Rumah, Sarfina', 'Baik', 'Tidak Ada', '2025-03-09 18:36:42', '2025-03-09 19:25:00'),
(52, '7404102102840008', '1', '2021', 'Hidup', 'Aterm', 'Spontan', '2000/51', 'Rumah, Wa Ode Elfianti', 'Baik', 'Tidak Ada', '2025-03-09 18:41:24', '2025-03-09 19:26:00'),
(53, '7404102102840008', '2', '2023', 'Hidup', 'Aterm', 'Spontan', '2200/50', 'Rumah, Wa Ode Elfianti', 'Baik', 'Tidak Ada', '2025-03-09 18:41:24', '2025-03-09 19:26:00'),
(54, '7404100102920009', '1', '2021', 'Hidup', 'Aterm', 'Spontan', '2100/51', 'Rumah, Sarfina', 'Baik', 'Tidak Ada', '2025-03-09 18:44:55', '2025-03-09 19:25:39'),
(55, '7404102401880001', '1', '2020', 'Hidup', 'Aterm', 'Spontan', '2200/50', 'Rumah, Sarfina', 'Baik', 'Tidak Ada', '2025-03-09 18:50:34', '2025-03-09 18:50:34'),
(56, '7404102401880001', '2', '2023', 'Hidup', 'Aterm', 'Spontan', '2100/51', 'Rumah, Wa Ode Heni', 'Baik', 'Tidak Ada', '2025-03-09 18:50:34', '2025-03-09 18:50:34'),
(57, '7404101305860004', '1', '2019', 'Hidup', 'Aterm', 'Spontan', '2100/52', 'Rumah, Wa Ode Heni', 'Baik', 'Tidak Ada', '2025-03-09 18:57:23', '2025-03-09 18:57:23'),
(58, '7404101305860004', '2', '2022', 'Hidup', 'Aterm', 'Spontan', '2200/51', 'Rumah, Wa Ode Heni', 'Baik', 'Tidak Ada', '2025-03-09 18:57:23', '2025-03-09 18:57:23'),
(59, '7404102106860005', '1', '2020', 'Hidup', 'Aterm', 'Spontan', '2100/51', 'Rumah,Wa Ode Heni', 'Baik', 'Tidak Ada', '2025-03-09 19:01:37', '2025-03-09 19:01:37'),
(60, '7404102106860005', '2', '2023', 'Hidup', 'Aterm', 'Spontan', '2200/52', 'Rumah, Wa Ode Elfianti', 'Baik', 'Tidak Ada', '2025-03-09 19:01:37', '2025-03-09 19:01:37'),
(61, '7404102507840015', '1', '2021', 'Hidup', 'Aterm', 'Spontan', '2100/52', 'Rumah, Wa Ode Heni', 'Baik', 'Tidak Ada', '2025-03-09 19:05:18', '2025-03-09 19:05:18'),
(62, '7404102507840015', '2', '2023', 'Hidup', 'Aterm', 'Spontan', '2200/51', 'Rumah, Wa Ode Elfianti', 'Baik', 'Tidak Ada', '2025-03-09 19:06:51', '2025-03-09 19:06:51'),
(63, '7404101007860007', '1', '2019', 'Hidup', 'Aterm', 'Spontan', '2300/54', 'Rumah, Wa Ode Heni', 'Baik', 'Tidak Ada', '2025-03-09 19:23:07', '2025-03-09 19:23:07'),
(64, '7404101007860007', '2', '2021', 'Hidup', 'Aterm', 'Spontan', '2200/50', 'Rumah, Wa Ode Heni', 'Baik', 'Tidak Ada', '2025-03-09 19:23:07', '2025-03-09 19:23:07'),
(65, '7404101007860007', '3', '2023', 'Hidup', 'Aterm', 'Spontan', '2100/52', 'Rumah, Wa Ode Heni', 'Baik', 'Tida Ada', '2025-03-09 19:23:07', '2025-03-17 19:26:09'),
(67, '7415074408020002', '1', '2020', 'Hidup', 'Aterm', 'SC', '2.8/49', 'Puskesmas Kadatua, Bidan', 'Sehat', 'Tidak Ada', '2025-04-21 06:43:20', '2025-05-12 11:58:38'),
(68, '7404194404080001', '1', '2024', 'Hidup', 'Aterm', 'Spontan', '2.9/49', 'PUSKESMAS, BIDAN', 'baik', 'Tidak ada', '2025-04-24 06:21:25', '2025-04-24 06:21:25'),
(69, '7404194404080001', '2', '2025', 'Hidup', 'Aterm', 'Spontan', '2.8/49', 'PUSKESMAS, BIDAN', 'BAIK', 'TIDAK ADA', '2025-04-24 06:23:20', '2025-04-24 06:25:04'),
(70, '033', '1', '2024', 'Hidup', 'Aterm', 'Spontan', '2.5/48', 'PUSKESMAS,BIDAN', 'SEHAT', 'TIDAK ADA', '2025-04-24 06:42:58', '2025-04-24 06:42:58'),
(71, '032', '1', '2021', 'Hidup', 'Aterm', 'Spontan', '2.8/48', 'PUSKESMAS,BIDAN', 'SEHAT', 'TIDAK ADA', '2025-04-24 06:44:15', '2025-04-24 06:44:15'),
(72, '030', '1', '2021', 'Hidup', 'Aterm', 'Spontan', '3/49', 'PUSKESMAS, BIDAN', 'SEHAT', 'TIDAK ADA', '2025-04-24 06:45:41', '2025-04-24 06:45:41'),
(73, '028', '1', '2020', 'Hidup', 'Aterm', 'Spontan', '2.7/48', 'PUSKESMAS,BIDAN', 'SEHAT', 'TIDAK ADA', '2025-04-24 06:49:27', '2025-04-24 06:49:27'),
(75, '01', '1', '2020', 'Hidup', 'Aterm', 'Spontan', '2.9/49', 'PUSKESMAS, BIDAN', 'HIDUP', 'TIDAK ADA', '2025-04-24 19:47:33', '2025-04-24 19:47:33'),
(76, '021', '6', '2020', '-Pilih-', '-Pilih-', '-Pilih-', '1.8/49', 'PUSKESMAS, BIDAN', 'HIDUP', 'TIDAK ADA', '2025-04-24 19:56:00', '2025-04-24 19:59:15'),
(77, '021', '7', '2025', 'Hidup', 'Aterm', 'Spontan', '2.8/47', 'PUSKESMAS,BIDA8', 'HIDUP', 'TIDAK ADA', '2025-04-24 19:58:13', '2025-04-24 19:58:13'),
(78, '029', '1', '2020', 'Hidup', 'Aterm', 'Spontan', '3/49', 'PUSKESMAS', 'HIDUP', 'TIDAK ADA', '2025-04-24 20:08:30', '2025-04-24 20:08:30'),
(79, '027', '1', '2020', 'Hidup', 'Aterm', 'Spontan', '2.5/48', 'PUSKESMAS, BID8', 'HIDUP', 'TIDAK ADA', '2025-04-24 20:14:56', '2025-04-24 20:14:56'),
(80, '026', '1', '2020', 'Hidup', 'Aterm', 'Spontan', '3/48', 'PUSKESMAS, BIDAN', 'HIDUP', 'TIDAK ADA', '2025-04-24 20:34:28', '2025-04-24 20:34:28'),
(81, '740419670440002', '1', '2021', 'Hidup', 'Aterm', 'Spontan', '3/49', 'Puskesmas, Dewi', 'Hidup', '-', '2025-05-23 11:50:38', '2025-05-23 11:55:16'),
(82, '740419670440002', '2', '2024', 'Hidup', 'Aterm', 'Spontan', '3/49', 'Puskesmas, Dewi', 'Hidup', '-', '2025-05-23 11:51:20', '2025-05-23 11:56:21'),
(83, '7404194107880002', '1', '2022', 'Hidup', 'Aterm', 'Spontan', '3/50', 'Puskesmas, mayang', 'Hidup', '-', '2025-05-23 11:52:10', '2025-05-23 11:54:43'),
(84, '7404194107880002', '2', '2022', 'Hidup', 'Aterm', 'Spontan', '3.1/50', 'Puskesmas, mayang-', 'Hidup', '-', '2025-05-23 11:53:04', '2025-05-23 11:54:29'),
(85, '7404194107880002', '3', '2025', 'Hidup', 'Aterm', 'Spontan', '2.9/49', 'Puskesmas, mayang', 'Hidup', '-', '2025-05-23 11:54:02', '2025-05-23 11:54:02'),
(86, '7404195230497000', '1', '2024', 'Hidup', 'Aterm', 'Spontan', '3.4/50', 'Puskesmas, Mayang dan Dewi', 'Hidup', '-', '2025-05-23 11:57:32', '2025-05-23 11:57:32'),
(87, '7404195305840001', '1', '2020', 'Hidup', 'Aterm', 'Spontan', '3.5', 'Puskesmas, Mayang', 'Hidup', '-', '2025-05-23 11:58:38', '2025-05-23 11:58:38'),
(88, '740419540799001', '1', '2021', 'Hidup', 'Aterm', 'Spontan', '2.9/48', 'Puskesmas, Heni', 'HIDUP', '-', '2025-05-23 12:00:13', '2025-05-23 12:00:13'),
(89, '7404195507970001', '1', '2022', 'Hidup', 'Aterm', 'Spontan', '3.1/50', 'Puskesmas, Heni', 'Hidup', '-', '2025-05-23 12:01:20', '2025-05-23 12:01:20'),
(90, '740419510990001', '1', '2021', 'Hidup', 'Aterm', 'Spontan', '3/50', 'Puskesmas, Mayang', 'Hidup', '-', '2025-05-23 12:02:23', '2025-05-23 12:02:23'),
(91, '7404196406890001', '1', '2020', 'Hidup', 'Aterm', 'Spontan', '3/50', 'Puskesmas', 'Hidup', '-', '2025-05-23 12:03:07', '2025-05-23 12:03:07'),
(92, '7404196406890001', '2', '2022', 'Hidup', 'Aterm', 'Spontan', '3/49.5', 'Puskesmas', 'Hidup', '-', '2025-05-23 12:03:48', '2025-05-23 12:03:48'),
(93, '7404197151298000', '1', '2020', 'Hidup', '-Pilih-', 'SC', '3/49', 'rumah sakit Siloam Bau bau', 'Hidup', '-', '2025-05-23 12:05:13', '2025-05-23 12:05:13'),
(94, '917101560791004', '1', '2020', 'Mati', 'Aterm', 'SC', '1.8/49', 'Rumah Sakit Palagimata Bau bau', 'Hidup', '-', '2025-05-23 12:07:09', '2025-07-10 02:04:55'),
(95, '917101560791004', '2', '2025', 'Hidup', 'Aterm', 'Spontan', '2.6/47', 'Puskesmas', 'Hidup', '-', '2025-05-23 12:08:28', '2025-05-23 12:08:28'),
(96, '7404195111980001', '1', '2022', 'Hidup', 'Aterm', 'Spontan', '3/49', 'Pusat', 'Hidup', '-', '2025-05-23 12:11:20', '2025-05-23 12:11:20'),
(97, '7404195111980001', '2', '2023', 'Hidup', 'Preterm', 'SC', '3.5/49', 'RS Siloam Baubau', 'Hidup', '-', '2025-05-23 12:12:38', '2025-05-23 12:12:38'),
(98, '740419440408001', '1', '2025', 'Hidup', 'Aterm', 'Spontan', '2.8/49', 'Puskesmas', 'Hidup', '-', '2025-05-23 12:13:38', '2025-05-23 12:13:38'),
(99, '7404194107980002', '1', '2022', 'Hidup', 'Aterm', 'Spontan', '3/49', 'Puskesmas', 'Hidup', '-', '2025-05-23 12:16:04', '2025-05-23 12:16:04'),
(100, '7404196603020002', '1', '2020', 'Hidup', 'Aterm', 'Spontan', '3/49', 'Puskesmas', 'Hidup', '-', '2025-05-23 12:16:58', '2025-05-23 12:16:58'),
(101, '7404195508980001', '1', '2020', 'Hidup', 'Aterm', 'Spontan', '3/49', 'Puskesmas', 'Hidup', '-', '2025-05-23 12:17:53', '2025-05-23 12:17:53'),
(102, '7404195508980001', '1', '2021', 'Hidup', 'Aterm', 'Spontan', '2.9/48,5', 'Puskesmas', 'Hidup', '-', '2025-05-23 12:18:43', '2025-05-23 12:18:43'),
(103, '7404195301090002', '1', '2021', 'Hidup', 'Aterm', 'Spontan', '2.9/48.5', 'Puskesmas', 'Hidup', '-', '2025-05-23 12:21:17', '2025-05-23 12:21:17'),
(104, '7404194302092002', '1', '2021', 'Hidup', 'Aterm', 'Spontan', '3.1/50', 'Puskesmas', 'Hidup', '-', '2025-05-23 12:22:21', '2025-05-23 12:22:37'),
(105, '7404194512920002', '1', '2020', 'Mati', 'Mati', 'Spontan', '2.8/49', 'Puskesmas', 'Mati', '-', '2025-05-23 12:23:36', '2025-07-10 02:29:44'),
(106, '7404194512920002', '2', '2024', 'Hidup', 'Aterm', 'Spontan', '3.4/49.5', 'Puskesmas', 'hidup', '-', '2025-05-23 12:24:16', '2025-05-23 12:24:16'),
(107, '7404195810100002', '1', '2021', 'Hidup', 'Aterm', 'Spontan', '3/48', 'Puskesmas', 'Hidup', '-', '2025-05-23 12:24:56', '2025-05-23 12:24:56'),
(108, '740419410400002', '1', '2022', 'Hidup', 'Aterm', 'Spontan', '3.1/49', 'Puskesmas,', 'Hidup', '-', '2025-05-24 04:48:17', '2025-05-24 04:48:17'),
(109, '7404194107860225', '1', '2023', 'Mati', 'Aterm', 'Spontan', '3/49', 'Puskesmas/Dewi', 'Hidup', '-', '2025-05-27 06:24:33', '2025-05-28 01:30:48'),
(110, '7404419562596000', '1', '2023', 'Mati', 'Aterm', 'Spontan', '2.9/48', 'Puskesmas', 'Hidup', '-', '2025-05-27 06:25:44', '2025-05-28 01:37:30'),
(111, '9115044403520001', '1', '2022', 'Hidup', 'Aterm', 'Spontan', '3.1/50', 'Puskesmas', 'Hidup', '-', '2025-05-27 06:26:34', '2025-05-27 06:26:34'),
(112, '7404194109980001', '1', '2024', 'Hidup', 'Aterm', 'Spontan', '2.8/50', 'Puskesmas', 'Hidup', '-', '2025-05-27 06:27:51', '2025-06-10 12:56:21'),
(113, '7404194507020001', '4', '2022', 'Hidup', 'Aterm', 'Spontan', '2.9/49', 'Puskesmas', 'Hidup', '-', '2025-05-27 06:28:47', '2025-06-14 00:44:29'),
(114, '7404192112060002', '1', '2023', 'Hidup', 'Aterm', 'Spontan', '3.2/50', 'Puskesmas', 'Hidup', '-', '2025-05-27 06:30:04', '2025-05-27 06:30:04'),
(115, '7404195120100001', '1', '2023', 'Hidup', 'Aterm', 'Spontan', '3.5/51', 'Puskesmas', 'Hidup', '-', '2025-05-27 06:31:25', '2025-05-27 06:31:25'),
(116, '7404066403000001', '2', '2024', 'Hidup', 'Aterm', 'Spontan', '3.2/49', 'Puskesmas', 'Hidup', '-', '2025-05-27 06:32:20', '2025-05-27 06:32:20'),
(117, '7404195150799000', '1', '2025', 'Hidup', 'Aterm', 'Spontan', '3.1/48', 'Puskesmas', 'Hidup', '-', '2025-05-27 06:33:08', '2025-05-27 06:33:08'),
(118, '7404196612010001', '1', '2021', 'Hidup', 'Aterm', 'Spontan', '3/49', 'Puskesmas', 'Hidup', '-', '2025-05-27 06:33:57', '2025-05-27 06:33:57'),
(119, '740419671299001', '1', '2021', 'Hidup', 'Aterm', 'Spontan', '3.1/51', 'Puskesmas', 'Hidup', '-', '2025-05-27 06:35:07', '2025-05-27 06:35:07'),
(120, '7404194810010001', '1', '2021', 'Hidup', 'Aterm', 'Spontan', '3/48.5', 'Puskesmas', 'Hidup', '-', '2025-05-27 06:35:55', '2025-05-27 06:35:55'),
(121, '7404195130595000', '1', '2025', 'Hidup', 'Aterm', 'SC', '3.8/50', 'Puskesmas', 'Hidup', '-', '2025-05-27 06:37:41', '2025-05-27 06:37:41'),
(122, '7404195008970001', '2', '2022', 'Hidup', 'Aterm', 'Spontan', '2.9/49', 'Puskesmas', 'Hidup', '-', '2025-05-27 06:38:48', '2025-05-27 06:38:48'),
(123, '7404195008970001', '3', '2024', 'Hidup', 'Aterm', 'Spontan', '3.5/49', 'Puskesmas', 'Hidup', '-', '2025-05-27 06:39:30', '2025-05-27 06:39:30'),
(124, '9271015502930005', '1', '2024', 'Hidup', 'Aterm', 'Spontan', '3.1/50', 'Puskesmas', 'Hidup', '-', '2025-05-27 06:41:36', '2025-05-27 06:41:36'),
(125, '7404194801030001', '1', '2024', 'Hidup', 'Aterm', 'Spontan', '3/49', 'Puskesmas', 'Hidup', '-', '2025-05-27 06:42:33', '2025-05-27 06:42:33'),
(126, '7404194140791000', '1', '2024', 'Hidup', 'Aterm', 'Spontan', '2.8/49', 'Puskesmas', 'Hidup', '-', '2025-05-27 06:43:27', '2025-05-27 06:43:27'),
(127, '7404195717980002', '1', '2024', 'Hidup', 'Aterm', 'Spontan', '2.9/48.7', 'Puskesmas', 'Hidup', '-', '2025-05-27 06:44:39', '2025-05-27 06:44:39'),
(128, '7404197889300002', '1', '2023', 'Hidup', 'Aterm', 'Spontan', '2.6/49', 'Puskesmas', 'Hidup', '-', '2025-05-27 06:45:34', '2025-05-27 06:45:34'),
(129, '7404204509930001', '1', '2023', 'Hidup', 'Preterm', 'SC', '2/43', 'Rumah Sakit Siloam', 'Hidup', '-', '2025-05-27 06:49:21', '2025-05-27 06:49:21'),
(130, '7404194108000002', '1', '2023', 'Hidup', 'Aterm', 'Spontan', '3.2/50', 'Puskesmas', 'Hidup', '-', '2025-05-27 06:54:22', '2025-05-27 06:54:22'),
(131, '7404194118020002', '1', '2023', 'Hidup', 'Aterm', 'Spontan', '3.2/49', 'Puskesmas', 'Hidup', '-', '2025-05-27 06:55:08', '2025-05-27 06:55:08'),
(132, '9207015511980001', '1', '22', 'Hidup', 'Aterm', 'Spontan', '2.9/49', 'Puskesmas', 'Hidup', '-', '2025-05-27 06:55:44', '2025-05-27 06:55:44'),
(133, '7404194507920002', '1', '2022', 'Hidup', 'Aterm', 'Spontan', '3/48', 'Puskesmas', 'Hidup', '-', '2025-05-27 06:56:35', '2025-05-27 06:56:35'),
(134, '9171010510820002', '1', '2022', 'Hidup', 'Aterm', 'Spontan', '3/50', 'Puskesmas', 'Hidup', '-', '2025-05-27 06:57:18', '2025-05-27 06:57:18'),
(135, '7404194504910001', '1', '2022', 'Hidup', 'Aterm', 'Spontan', '3.1/51', 'Puskesmas', 'Hidup', '-', '2025-05-27 06:58:03', '2025-05-27 06:58:03'),
(136, '7404194128880001', '1', '2023', 'Hidup', 'Aterm', 'Spontan', '3.6/50', 'Puskesmas', 'Hidup', '-', '2025-05-27 06:58:53', '2025-05-27 06:58:53'),
(137, '7404419500298000', '1', '2021', 'Hidup', 'Aterm', 'Spontan', '3.3/51', 'Puskesmas', 'Hidup', '+', '2025-05-27 07:03:23', '2025-05-27 07:03:23'),
(138, '7404195221203000', '1', '2022', 'Hidup', 'Aterm', 'Spontan', '3/49', 'Puskesmas', 'Hidup', '-', '2025-05-27 07:04:08', '2025-05-27 07:04:08'),
(139, '7404195221203000', '2', '2024', 'Hidup', 'Aterm', 'Spontan', '3.3/51', 'Puskesmas', 'Hidup', '-', '2025-05-27 07:04:54', '2025-05-27 07:04:54'),
(144, '890', 'h', 'u', 'Hidup', 'Aterm', 'Spontan', 'u', 'j', 'h', 'u', '2025-06-01 17:47:39', '2025-06-01 17:47:39'),
(146, '12345678', '1', '2021', 'Mati', 'Aterm', 'Spontan', '3.1', 'PUSKESMAS, MAYANG & DEWI', 'SEHAT', '-', '2025-06-13 13:52:02', '2025-06-14 00:44:00'),
(147, '7404195305940001', '1', '2020', 'Mati', 'Mati', 'SC', '1.2', 'Rumah sakit', 'Mati', 'Komplikasi kehamilan', '2025-07-10 02:19:48', '2025-07-10 02:19:48');

-- --------------------------------------------------------

--
-- Table structure for table `tabel_data_orangtua`
--

CREATE TABLE `tabel_data_orangtua` (
  `id` bigint UNSIGNED NOT NULL,
  `nama_ibu` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `nik` varchar(16) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `tempat_lahir_ibu` varchar(30) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `tanggal_lahir_ibu` varchar(30) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `tempat_atau_tanggal_lahir_ibu` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `agama_ibu` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `pendidikan_ibu` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `golongan_darah_ibu` varchar(5) COLLATE utf8mb4_unicode_ci NOT NULL,
  `pekerjaan_ibu` varchar(30) COLLATE utf8mb4_unicode_ci NOT NULL,
  `no_jkn_bpjs` varchar(14) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `nama_ayah` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `tempat_lahir_ayah` varchar(30) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `tanggal_lahir_ayah` varchar(30) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `tempat_atau_tanggal_lahir_ayah` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `agama_ayah` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `pendidikan_ayah` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `golongan_darah_ayah` varchar(5) COLLATE utf8mb4_unicode_ci NOT NULL,
  `pekerjaan_ayah` varchar(30) COLLATE utf8mb4_unicode_ci NOT NULL,
  `alamat_rumah` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `kecamatan` varchar(30) COLLATE utf8mb4_unicode_ci NOT NULL,
  `kabupaten_atau_kota` varchar(30) COLLATE utf8mb4_unicode_ci NOT NULL,
  `no_telepon` varchar(12) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Dumping data for table `tabel_data_orangtua`
--

INSERT INTO `tabel_data_orangtua` (`id`, `nama_ibu`, `nik`, `tempat_lahir_ibu`, `tanggal_lahir_ibu`, `tempat_atau_tanggal_lahir_ibu`, `agama_ibu`, `pendidikan_ibu`, `golongan_darah_ibu`, `pekerjaan_ibu`, `no_jkn_bpjs`, `nama_ayah`, `tempat_lahir_ayah`, `tanggal_lahir_ayah`, `tempat_atau_tanggal_lahir_ayah`, `agama_ayah`, `pendidikan_ayah`, `golongan_darah_ayah`, `pekerjaan_ayah`, `alamat_rumah`, `kecamatan`, `kabupaten_atau_kota`, `no_telepon`, `created_at`, `updated_at`) VALUES
(68, 'Filna', '7415074408020002', 'Marawali', '2002-08-04', 'Marawali/4 Agustus 2002', 'Islam', 'SMA/Sederajat', 'O', 'Ibu Rumah Tangga', '-', 'La Unda', 'Kalipopo', '1971-05-10', 'Marawali/10 Oktober 2001', 'Islam', 'SMA/Sederajat', 'O', 'Nelayan', 'Marawali', 'Kadatua', 'Buton Selatan', '0', '2025-04-21 06:24:38', '2025-05-12 13:42:00'),
(78, 'SURATMI', '7404197112980002', 'Kapoa', '1998-12-27', '-', 'Islam', 'SMA/Sederajat', 'A', 'IBU RUMAH TANGGA', '-', 'SUMARNO', 'Banabungi', '1993-12-07', '-', 'Islam', 'SMP/Sederajat', '-', 'NELAYAN', 'Dusun Teilalo', 'KADATUA', 'BUTON SELATAN', '-', '2025-04-24 05:19:13', '2025-05-18 16:12:12'),
(79, 'WAODE YULIANA', '7404196603020002', 'Kaofe', '2002-03-16', '-', 'Islam', 'SMA/Sederajat', 'B', 'IBU RUMAH TANGGA', '-', 'HARIMUDIN', 'Kapoa', '2000-04-17', '-', 'Islam', 'SMA/Sederajat', 'O', 'Pegawai Swasta', 'DUSUN MARAWALI', 'KADATUA', 'BUTON SELATAN', '-', '2025-04-24 05:27:42', '2025-05-18 15:57:04'),
(80, 'NARSIDA', '7404194301860003', 'Waonu', '1986-01-03', '-', 'Islam', 'SMA/Sederajat', 'B', 'IBU RUMAH TANGGA', '-', 'LAODE FIRDAUS', 'Kaofe', '1983-07-18', '-', 'Islam', 'SMA/Sederajat', 'O', 'Nelayan', 'Dusun Teilalo', 'KADATUA', 'BUTON SELATAN', '-', '2025-04-24 05:48:44', '2025-05-18 15:50:19'),
(82, 'NURYANTI', '7404195508980001', 'Kaofe', '1998-08-15', '-', 'Islam', 'SMP/Sederajat', 'O', 'IBU RUMAH TANGGA', '-', 'HASBIN', 'Waonu', '1996-03-28', '-', 'Islam', 'SMA/Sederajat', 'O', 'PEGAWAI SWASTA', 'Dusun Marawali', 'KADATUA', 'BUTON SELATAN', '-', '2025-04-24 05:56:42', '2025-05-18 11:47:16'),
(83, 'SUFALIN', '7404195301090002', 'Kaofe', '2000-09-01', '-', 'Islam', 'SMA/Sederajat', 'AB', 'IBU RUMAH TANGGA', '-', 'ABDUL UKIS', 'Kaofe', '2000-05-22', '-', 'Islam', 'SMA/Sederajat', 'O', 'Wiraswasta', 'DUSUN MARAWALI', 'KADATUA', 'BUTON SELATAN', '-', '2025-04-24 06:02:34', '2025-05-18 11:57:06'),
(84, 'WAODE FITRIANI', '7404194302092002', 'Kaofe', '2000-09-02', '-', 'Islam', 'S-1/Sederajat', 'AB', 'GURU HONORER', '-', 'LAODE ARIFIN', 'Batauga', '1992-05-18', '-', 'Islam', 'S-1/Sederajat', 'O', 'PNS GURU', 'Dusun Marawali', 'KADATUA', 'BUTON SELATAN', '-', '2025-04-24 06:07:02', '2025-05-18 11:36:06'),
(85, 'ZIANA', '7404195810100002', 'Lipu', '2020-01-01', '-', 'Islam', 'SMA/Sederajat', 'AB', 'IBU RUMAH TANGGA', '-', 'RASID', 'Kaofe', '1998-06-19', '-', 'Islam', 'SMA/Sederajat', 'O', 'TNI', 'MARAWALI', 'KADATUA', 'BUTON SELATAN', '-', '2025-04-24 06:10:37', '2025-05-18 11:28:09'),
(86, 'Wa Ode Asriana', '7404101804930002', 'Marawali', '1994-05-07', 'Kanawa/15 April 1987', 'Islam', 'S-1/Sederajat', 'B', 'Honorer', '-', 'La Ode Armin', 'Kalipopo', '1995-12-04', 'Bangun/2 Mei 1986', 'Islam', 'SMA/Sederajat', 'B', 'Honorer', 'Desa Mawali', 'Kadatua', 'Buton Selatan', '081289765490', '2025-04-25 03:20:28', '2025-05-18 13:34:12'),
(105, 'RISMAWATI', '7404195305940001', 'Uwemasi', '1994-05-03', NULL, 'Islam', 'S-1/Sederajat', 'B', 'Ibu Rumah Tangga', '-', 'La Ode amsal', 'Kapoa', '1981-10-17', NULL, 'Islam', 'SMP/Sederajat', 'O', 'Nelayan', 'Dusun Kaofe', 'KADATUA', 'BUSEL', '-', '2025-05-18 10:39:33', '2025-06-10 15:00:13'),
(106, 'SUNARTI', '917101560791004', 'Jayapura', '1994-07-06', NULL, 'Islam', 'SMA/Sederajat', 'O', 'IBU RUMAH TANGGA', '00022372642004', 'Darson', 'Kaofe', '1988-01-27', NULL, 'Islam', 'SMA/Sederajat', 'O', 'Wiraswasta', 'Dusun kaofe', 'Kadatua', 'BUSEL', '-', '2025-05-18 10:44:36', '2025-05-18 10:44:36'),
(107, 'DARLI', '7404196406890001', 'WAONU', '1989-06-14', NULL, 'Islam', 'SMP/Sederajat', 'AB', 'IBU RUMAH TANGGA', '-', 'LA BAHARUDDIN', 'Kaofe', '1987-01-20', NULL, 'Islam', 'SMP/Sederajat', 'O', 'Petani', 'Dusun Kalipopo', 'Kadatua', 'Busel', '-', '2025-05-18 10:50:58', '2025-05-18 10:50:58'),
(108, 'RUFAIDA', '7404197151298000', 'Banabungi', '1998-12-11', NULL, 'Islam', 'SMA/Sederajat', 'O', 'Ibu Rumah Tangga', '-', 'La Taumi', 'Kaofe', '1996-01-07', NULL, 'Islam', 'SMA/Sederajat', 'O', 'Pegawai Swasta', 'Dusun Teilalo', 'Kadatua', 'Busel', '-', '2025-05-18 10:59:18', '2025-05-18 13:22:35'),
(109, 'Waode Lilis Ardila', '7404194512920002', 'Banabungi', '1992-12-05', NULL, 'Islam', 'SMP/Sederajat', 'O', 'IBU Rumah Tangga', '-', 'Akbar', 'Kaofe', '1991-02-08', NULL, 'Islam', 'SMA/Sederajat', 'O', 'Petani', 'Dusun Marawali', 'kadatua', 'BUSEL', '-', '2025-05-18 11:04:05', '2025-05-18 11:04:05'),
(110, 'Yusniar', '740419670440002', 'Kaofe', '2004-02-07', NULL, 'Islam', 'SMA/Sederajat', 'B', 'IRT', '-', 'Hasaru', 'Batauga', '1999-10-07', NULL, 'Islam', 'SMA/Sederajat', 'O', 'Nelayan', 'Dusun Marawali', 'Kadatua', 'Buton Selatan', '081378908789', '2025-05-22 07:42:04', '2025-05-22 07:48:45'),
(111, 'Andriani', '7404194107980002', 'Baubau', '1998-07-01', NULL, 'Islam', 'SMA/Sederajat', 'AB', 'IRT', '-', 'Ahmad', 'Mambulu', '1995-03-07', NULL, 'Islam', 'SMA/Sederajat', 'O', 'Nelayan', 'Dusun Kaofe', 'Kadatua', 'Buton Selatan', '082289091102', '2025-05-22 08:02:05', '2025-05-22 08:02:05'),
(112, 'Farnia', '7404195230497000', 'Kaofe', '1997-04-23', NULL, 'Islam', 'S1/Sederajat', 'AB', 'PNS', '-', 'Hariono Asadi', 'Lapandewa', '1990-05-12', NULL, 'Islam', 'S1/Sederajat', 'O', 'PNS', 'Dusun Teilalo', 'Kadatua', 'Buton Selatan', '081390908765', '2025-05-22 08:10:51', '2025-05-22 08:10:51'),
(113, 'Nasra', '7404194107880002', 'Taliabo', '1988-07-04', NULL, 'Islam', 'SMP/Sederajat', 'A', 'IRT', '-', 'Sutriadin', 'Kapoa', '1979-03-17', NULL, 'Islam', 'SMP/Sederajat', 'O', 'Nelayan', 'Dusun Marawali', 'Kadatua', 'Buton Selatan', '085189876543', '2025-05-22 08:17:34', '2025-05-22 08:17:34'),
(114, 'Isnawati', '7404195507970001', 'Waonu', '1997-07-15', NULL, 'Islam', 'SMA/Sederajat', 'B', 'IRT', '-', 'Asrin', 'Kaofe', '1996-03-21', NULL, 'Islam', 'SMA/Sederajat', 'O', 'Pegawai Swasta', 'Dusun Marawali', 'Kadatua', 'Buton Selatan', '085199076541', '2025-05-22 08:31:03', '2025-05-22 08:31:03'),
(115, 'Naria', '740419540799001', 'Marawali', '1999-07-14', NULL, 'Islam', 'S1/Sederajat', 'AB', 'Honorer', '-', 'Sahadin', 'Banabungi', '1999-01-23', NULL, 'Islam', 'SMA/Sederajat', 'O', 'Wirausaha', 'Dusun Marawali', 'Kadatua', 'Buton Selatan', '082199012987', '2025-05-22 08:39:23', '2025-05-22 08:39:23'),
(116, 'Dasniar', '740419510990001', 'Waonu', '1999-10-15', NULL, 'Islam', 'SMA/Sederajat', 'B', 'IRT', '-', 'Resmin', 'Lipu', '1997-04-21', NULL, 'Islam', 'SMA/Sederajat', 'O', 'Nelayan', 'Dusun Teilalo', 'Kadatua', 'Buton Selatan', '081340715022', '2025-05-22 08:46:16', '2025-05-22 08:46:16'),
(117, 'Salma', '740419440408001', 'Marawali', '2008-04-14', NULL, 'Islam', 'SMP/Sederajat', 'A', 'IRT', '-', 'Rahim', 'Baubau', '2006-10-13', NULL, 'Islam', 'SMP/Sederajat', 'A', 'Nelayan', 'Dusun Marawali', 'Kadatua', 'Buton Selatan', '085123909812', '2025-05-22 08:53:17', '2025-05-22 08:53:17'),
(118, 'Susilawati', '7404195111980001', 'Marawali', '1998-11-10', NULL, 'Islam', 'SMA/Sederajat', 'B', 'IRT', '-', 'Risno', 'Marawali', '1994-03-12', NULL, 'Islam', 'SMA/Sederajat', 'O', 'Nelayan', 'Dusun Teilalo', 'Kadatua', 'Buton Selatan', '085123481765', '2025-05-22 09:01:59', '2025-05-22 09:01:59'),
(119, 'Musrida', '740419410400002', 'Bombana', '2000-04-14', NULL, 'Islam', 'S1/Sederajat', 'A', 'Guru', '-', 'La Ami', 'Banabungi', '2000-08-12', NULL, 'Islam', 'S1/Sederajat', 'O', 'Pegawai Swasta', 'Dusun Marawali', 'Kadatua', 'Buton Selatan', '081278908761', '2025-05-24 04:45:49', '2025-05-24 04:45:49'),
(122, 'Wa Ode Sarli', '7404419500298000', 'Manokwari', '1998-02-05', NULL, 'Islam', 'S-1/Sederajat', 'A', 'Ibu Rumah Tangga', '-', 'La Ode Hamazuli', 'Kapoa', '1992-03-27', NULL, 'Islam', 'S-1/Sederajat', 'O', 'PNS', 'Dusun Kalipopo', 'Kadatua', 'Buton Selatan', '081260789043', '2025-05-27 03:31:33', '2025-05-27 03:31:33'),
(123, 'Elvania', '7404195221203000', 'Marawali', '2003-12-12', NULL, 'Islam', 'SMA/Sederajat', 'B', 'IRT', '-', 'Hilyamin', 'Kapoa', '2000-09-11', NULL, 'Islam', 'SMA/Sederajat', 'O', 'Pegawai Swasta', 'Marawali', 'Kadatua', 'Buton Selatan', '082241678902', '2025-05-27 03:36:04', '2025-05-27 03:36:04'),
(124, 'Hasaria', '7404194128880001', 'Bombana', '1999-08-02', NULL, 'Islam', 'S-1/Sederajat', 'AB', 'Honorer', '-', 'La Ode Tamrin', 'Jayapura', '1986-04-13', NULL, 'Islam', 'S-1/Sederajat', 'O', 'Wiraswasta', 'Kaofe', 'Kadatua', 'Buton Selatan', '081356728031', '2025-05-27 03:41:45', '2025-05-27 03:43:02'),
(125, 'Nafia', '7404194504910001', 'Kendari', '1991-04-05', NULL, 'Islam', 'SMA/Sederajat', 'A', 'IRT', '-', 'Aruti', 'Kaofe', '1990-12-11', NULL, 'Islam', 'SMP/Sederajat', 'O', 'Wiraswasta', 'Dusun Marawali', 'Kadatua', 'Buton Selatan', '082218970345', '2025-05-27 04:04:16', '2025-05-27 04:04:16'),
(126, 'Subianti', '9171010510820002', 'Topa', '2002-08-11', NULL, 'Islam', 'SMA/Sederajat', 'A', 'Ibu Rumah Tangga', '-', 'Darwin', 'Uwemasi', '2001-04-02', NULL, 'Islam', 'SMA/Sederajat', 'O', 'Nelayan', 'Dusun Marawali', 'Kadatua', 'Buton Selatan', '081322578001', '2025-05-27 04:08:48', '2025-05-27 04:08:48'),
(127, 'Alfianita', '7404194507920002', 'Sorong', '2022-09-17', NULL, 'Islam', 'SMA/Sederajat', 'AB', 'Ibu Rumah Tangga', '-', 'Darwin', 'Kaofe', '1999-07-21', NULL, 'Islam', 'S-1/Sederajat', 'B', 'Pegawai', 'Dusun Kaofe', 'Kadatua', 'Buton Selatan', '082150473218', '2025-05-27 04:13:05', '2025-05-27 04:13:05'),
(129, 'Nastia', '9207015511980001', 'Sorong', '1998-11-15', NULL, 'Islam', 'SMA/Sederajat', 'O', 'Ibu Rumah Tangga', '-', 'La Ode Mazdi', 'Kaofe', '1995-10-21', NULL, 'Islam', 'SMA/Sederajat', 'O', 'Nelayan', 'Teilalo', 'Kadatua', 'Buton Selatan', '081360987632', '2025-05-27 04:21:10', '2025-05-27 04:21:10'),
(130, 'Ruslianti', '7404194118020002', 'Marawali', '2000-02-18', NULL, 'Islam', 'SMA/Sederajat', 'O', 'Ibu Rumah Tangga', '-', 'Erwin', 'Waonu', '1998-03-31', NULL, 'Islam', 'SMA/Sederajat', 'O', 'Nelayan', 'Dusun Kaofe', 'Kadatua', 'Buton Selatan', '082150876219', '2025-05-27 04:26:55', '2025-05-27 04:26:55'),
(131, 'Artianti', '7404194108000002', 'Nabire', '2000-08-01', NULL, 'Islam', 'SMA/Sederajat', 'AB', 'Ibu Rumah Tangga', '-', 'Farhan Abbas', 'Uwemasi', '1999-02-21', NULL, 'Islam', 'SMA/Sederajat', 'O', 'Wiraswasta', 'Dusun Kalipopo', 'Kadatua', 'Buton Selatan', '085241708291', '2025-05-27 04:30:50', '2025-05-27 06:53:05'),
(132, 'Wa Ode Fajria', '7404204509930001', 'Taliabo', '1993-09-05', NULL, 'Islam', 'SMA/Sederajat', 'O', 'Ibu Rumah Tangga', '-', 'Zumaidin', 'Marawali', '1995-01-18', NULL, 'Islam', 'SMA/Sederajat', 'O', 'Nelayan', 'Dusun Marawali', 'Kadatua', 'Buton Selatan', '082217654097', '2025-05-27 04:34:40', '2025-05-27 04:34:40'),
(133, 'Kiki Fatmawati', '7404197889300002', 'Marawali', '1993-08-18', NULL, 'Islam', 'SMA/Sederajat', 'B', 'Ibu Rumah Tangga', '-', 'Rusin', 'Uwemasi', '1992-02-14', NULL, 'Islam', 'SMA/Sederajat', 'O', 'Nelayan', 'Dusun Kalipopo', 'Kadatua', 'Buton Selatan', '081340876290', '2025-05-27 04:38:03', '2025-05-27 04:38:03'),
(134, 'Amana', '7404195717980002', 'Marawali', '1998-07-17', NULL, 'Islam', 'SMA/Sederajat', 'B', 'Ibu Rumah Tangga', '-', 'Irwan Said', 'Jayapura', '1996-09-27', NULL, 'Islam', 'SMA/Sederajat', 'AB', 'Nelayan', 'Dusun Marawali', 'Kadatua', 'Buton Selatan', '092165098213', '2025-05-27 04:41:58', '2025-05-27 04:41:58'),
(135, 'Lisda Anggraini', '7404194140791000', 'Ambon', '1991-07-14', NULL, 'Islam', 'SMA/Sederajat', 'B', 'Ibu Rumah Tangga', '-', 'Indra Ifin', 'Kapoa', '1992-08-20', NULL, 'Islam', 'SMA/Sederajat', 'O', 'Nelayan', 'Dusun Kaofe', 'Kadatua', 'Buton Selatan', '085230875431', '2025-05-27 04:45:29', '2025-05-27 04:45:29'),
(136, 'Herni', '7404194801030001', 'Marawali', '2003-10-08', NULL, 'Islam', 'SMA/Sederajat', 'B', 'Ibu Rumah Tangga', '0000947984141', 'Rahim', 'Marawali', '2000-08-11', NULL, 'Islam', 'SMA/Sederajat', 'AB', 'Pegawai Swasta', 'Dusun Kalipopo', 'Kadatua', 'Buton Selatan', '081340872201', '2025-05-27 04:48:43', '2025-05-27 04:48:43'),
(137, 'Nurfida', '9271015502930005', 'Baubau', '1993-02-15', NULL, 'Islam', 'S-1/Sederajat', 'O', 'Pegawai', '00002107678922', 'La ungi', 'Marawali', '1990-05-25', NULL, 'Islam', 'SMA/Sederajat', 'O', 'Nelayan', 'Dusun Marawali', 'kadatua', 'Buton Selatan', '082250862187', '2025-05-27 04:53:38', '2025-05-27 04:53:38'),
(138, 'Farida', '7404195008970001', 'Marawali', '1997-08-15', NULL, 'Islam', 'SMA/Sederajat', 'B', 'Ibu Rumah Tangga', '0000548130119', 'Herman', 'Marawali', '1998-11-20', NULL, 'Islam', 'SMA/Sederajat', 'AB', 'Nelayan', 'Dusun Teilalo', 'Kadatua', 'Buton Selatan', '081325706599', '2025-05-27 04:57:56', '2025-05-27 04:57:56'),
(139, 'Ridayani', '7404195130595000', 'Baubau', '1995-05-13', NULL, 'Islam', 'SMA/Sederajat', 'O', 'Ibu Rumah Tangga', '0000215672109', 'La Ode Tamsil', 'Jayapura', '1993-07-28', NULL, 'Islam', 'SMA/Sederajat', 'O', 'Nelayan', 'Dusun Marawali', 'Kadatua', 'Buton Selatan', '081267508211', '2025-05-27 05:02:35', '2025-05-27 05:02:35'),
(140, 'Nurhaida', '7404194810010001', 'Sampolawa', '2001-10-08', NULL, 'Islam', 'S-1/Sederajat', 'AB', 'Guru Honorer', '0000225498016', 'Haidar', 'Marawali', '2000-08-03', NULL, 'Islam', 'S-1/Sederajat', 'AB', 'Guru Honorer', 'Dusun Marawali', 'Kadatua', 'Buton Selatan', '081351639801', '2025-05-27 05:31:17', '2025-05-27 05:31:17'),
(141, 'Filnawati', '740419671299001', 'Banabungi', '1999-12-17', NULL, 'Islam', 'SMA/Sederajat', 'AB', 'Ibu Rumah Tangga', '0000321673940', 'La Ode Sulfan', 'marawali', '1996-02-13', NULL, 'Islam', 'SMA/Sederajat', 'B', 'Nelayan', 'Dusun Teilalo', 'Kadatua', 'Buton Selatan', '081254237174', '2025-05-27 05:35:20', '2025-05-27 05:35:20'),
(142, 'Wa Ode Niyana', '7404196612010001', 'Kapoa', '2001-12-16', NULL, 'Islam', 'SMA/Sederajat', 'B', 'Ibu Rumah Tangga', '0000513268993', 'Laode Isali', 'Marawali', '2000-05-17', NULL, 'Islam', 'SMA/Sederajat', 'B', 'wiraswasta', 'Dusun Marawali', 'Kadatua', 'Buton Selatan', '081250873321', '2025-05-27 05:39:29', '2025-05-27 05:39:29'),
(143, 'Sahiani', '7404195157990001', 'Marawali', '1999-07-15', NULL, 'Islam', 'S-1/Sederajat', 'AB', 'Honorer', '-', 'Risky Akbar', 'Baubau', '1997-05-22', NULL, '-Pilih-', 'SMA/Sederajat', 'B', 'Wirausaha', 'Dusun Marawali', 'Kadatua', 'Buton Selatan', '082256789921', '2025-05-27 05:44:43', '2025-07-09 17:19:47'),
(144, 'Nurfina', '7404066403000001', 'Batauga', '2000-04-03', NULL, 'Islam', 'SMA/Sederajat', 'A', 'Ibu Rumah Tangga', '0000654321877', 'Alan', 'Banabungi', '1995-03-09', NULL, 'Islam', 'SMA/Sederajat', 'A', 'Nelayan', 'Dusun Marawali', 'Kecamatan Kadatua', 'Buton Selatan', '081322658211', '2025-05-27 05:48:10', '2025-05-27 05:48:10'),
(145, 'Dania', '7404195120100001', 'Kapoa', '2020-01-12', NULL, 'Islam', 'SMA/Sederajat', 'AB', 'Ibu Rumah Tangga', '0000124572884', 'Dahri', 'Uwemasi', '1998-09-21', NULL, 'Islam', 'SMA/Sederajat', 'B', 'Nelayan', 'Dusun Marawali', 'Kadatua', 'Buton Selatan', '081322564021', '2025-05-27 05:51:37', '2025-05-27 05:51:37'),
(146, 'Darti', '7404192112060002', 'Marawali', '2006-12-11', NULL, 'Islam', 'SMP/Sederajat', 'B', 'Ibu Rumah Tangga', '0000495217719', 'Onan', 'Kapoa', '2004-03-12', NULL, 'Islam', 'SMA/Sederajat', 'B', 'Nelayan', 'Dusun Marawali', 'Kadatua', 'Buton Selatan', '085321709321', '2025-05-27 05:54:56', '2025-05-27 05:54:56'),
(148, 'Sarnawati', '7404194507020001', 'Marawali', '2002-07-05', NULL, 'Islam', 'S-1/Sederajat', 'B', 'Pegawai negeri', '0000126680943', 'Abdul Samat', 'Baubau', '2000-04-27', NULL, 'Islam', 'SMA/Sederajat', 'O', 'Wiraswasta', 'Dusun Kaofe', 'Kadatua', 'Buton Selatan', '082256830972', '2025-05-27 05:58:22', '2025-05-27 05:58:22'),
(149, 'Wa Ode Isrami', '7404194109980001', 'Baubau', '1998-09-11', NULL, 'Islam', 'S-1/Sederajat', 'B', 'honorer', '0000317793874', 'Darzin', 'Kapoa', '1996-10-14', NULL, 'Islam', 'S-1/Sederajat', 'B', 'Pegawai sipil', 'Dusun Kalipopo', 'Kadatua', 'Buton Selatan', '081345708321', '2025-05-27 06:01:25', '2025-05-27 06:01:25');

-- --------------------------------------------------------

--
-- Table structure for table `tabel_jadwal_posyandu`
--

CREATE TABLE `tabel_jadwal_posyandu` (
  `id` bigint UNSIGNED NOT NULL,
  `waktu_post` datetime NOT NULL,
  `agenda` text COLLATE utf8mb4_unicode_ci NOT NULL,
  `tanggal` varchar(20) COLLATE utf8mb4_unicode_ci NOT NULL,
  `jam` varchar(100) COLLATE utf8mb4_unicode_ci NOT NULL,
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Dumping data for table `tabel_jadwal_posyandu`
--

INSERT INTO `tabel_jadwal_posyandu` (`id`, `waktu_post`, `agenda`, `tanggal`, `jam`, `created_at`, `updated_at`) VALUES
(255, '2025-06-29 00:00:00', 'pelaksanaan posyandu', '0000-00-00', '08:00', '2025-04-22 05:15:56', '2025-04-22 05:15:56'),
(256, '2025-06-29 00:00:00', 'pelaksanaan posyandu', '0000-00-00', '08:00', '2025-04-22 05:18:12', '2025-04-22 05:18:12'),
(257, '2025-06-29 00:00:00', 'pelaksanaan posyandu', '0000-00-00', '08:00', '2025-04-22 05:19:25', '2025-04-22 05:19:25'),
(258, '2025-06-29 00:00:00', 'pelaksanaan posyandu', '0000-00-00', '08:00', '2025-04-22 05:20:16', '2025-04-22 05:20:16'),
(259, '2025-06-29 00:00:00', 'pelaksanaan posyandu', '0000-00-00', '08:00', '2025-04-22 05:21:14', '2025-04-22 05:21:14'),
(260, '2025-06-29 00:00:00', 'pelaksanaan posyandu', '0000-00-00', '08:00', '2025-04-22 05:22:10', '2025-04-22 05:22:10'),
(261, '2025-06-29 00:00:00', 'pelaksanaan posyandu', '0000-00-00', '08:00', '2025-04-22 05:23:15', '2025-04-22 05:23:15'),
(262, '2025-06-29 00:00:00', 'pelaksanaan posyandu', '0000-00-00', '08;00', '2025-04-22 05:23:56', '2025-04-22 05:23:56'),
(263, '2025-06-29 00:00:00', 'pelaksanaan posyandu', '0000-00-00', '08:00', '2025-04-22 05:24:43', '2025-04-22 05:24:43'),
(264, '2025-06-29 00:00:00', 'pelaksanaan posyandu', '0000-00-00', '08:00', '2025-04-22 05:25:19', '2025-04-22 05:25:19'),
(265, '2025-06-29 00:00:00', 'pelaaksanaan posyandu', '0000-00-00', '08:00', '2025-04-22 05:25:57', '2025-04-22 05:25:57'),
(266, '2025-06-29 00:00:00', 'pelaksanaan posyandu', '0000-00-00', '08:00', '2025-04-22 05:26:32', '2025-04-22 05:26:32'),
(267, '2025-06-29 00:00:00', 'pelaksanaan posyandu', '0000-00-00', '08:00', '2025-04-22 05:27:41', '2025-04-22 05:27:41'),
(268, '2025-06-29 00:00:00', 'pelaksanaan posyandu', '0000-00-00', '08:00', '2025-04-22 05:28:31', '2025-04-22 05:28:31'),
(269, '2025-06-29 00:00:00', 'pelaksanaan posyandu', '0000-00-00', '08:00', '2025-04-22 05:29:07', '2025-04-22 05:29:42'),
(270, '2025-06-29 00:00:00', 'pelaksanaan posyandu', '0000-00-00', '08:00', '2025-04-22 05:30:14', '2025-04-22 05:30:14'),
(271, '2025-06-29 00:00:00', 'pelaksanaan posyandu', '0000-00-00', '08:00', '2025-04-22 05:31:11', '2025-04-22 05:31:11'),
(272, '2025-06-29 00:00:00', 'pelaksanaan posyandu', '0000-00-00', '08:00', '2025-04-22 05:31:43', '2025-04-22 05:31:43'),
(273, '2025-06-29 00:00:00', 'pelaksanaan posyandu', '0000-00-00', '08:00', '2025-04-22 05:32:32', '2025-04-22 05:32:32'),
(274, '2025-06-29 00:00:00', 'pelaksanaan posyandu', '0000-00-00', '08:00', '2025-04-22 05:33:08', '2025-04-22 05:33:08'),
(275, '2025-06-29 00:00:00', 'pelaksanaan posyandu', '0000-00-00', '08:00', '2025-04-22 05:33:50', '2025-04-22 05:33:50'),
(276, '2025-06-29 00:00:00', 'pelaksanaan posyandu', '0000-00-00', '08:00', '2025-04-22 05:34:08', '2025-04-22 05:34:08'),
(277, '2025-06-29 00:00:00', 'pelaksanaan posyandu', '0000-00-00', '08:00', '2025-04-22 05:34:26', '2025-04-22 05:34:26'),
(278, '2025-06-29 00:00:00', 'pelaksanaan posyandu', '0000-00-00', '08:00', '2025-04-22 05:34:45', '2025-04-22 05:34:45'),
(279, '2025-06-29 00:00:00', 'Jadwal Posyandu', '0000-00-00', '09:00', '2025-05-01 16:44:53', '2025-06-12 15:18:09'),
(281, '2025-06-29 00:00:00', 'Pelaksanaan Posyandu', '0000-00-00', '08:00', '2025-05-18 09:31:42', '2025-06-12 15:18:32'),
(282, '2025-06-29 00:00:00', 'Pelaksaan Posyandu', '0000-00-00', '08:00', '2025-05-20 09:45:32', '2025-06-12 15:18:58'),
(283, '2025-06-29 00:00:00', 'Pelaksaan Posyandu', '0000-00-00', '08:00', '2025-05-20 09:46:51', '2025-06-12 15:19:16'),
(284, '2025-06-29 00:00:00', 'Pelaksaan Posyandu', '0000-00-00', '08:00', '2025-05-20 09:47:34', '2025-05-20 09:47:34'),
(285, '2025-06-29 00:00:00', 'Pelaksaan Posyandu', '0000-00-00', '08:00', '2025-05-20 09:48:25', '2025-06-12 15:19:34'),
(286, '2025-06-29 00:00:00', 'Pelaksaan Posyandu', '0000-00-00', '08:00', '2025-05-20 09:49:18', '2025-06-12 15:20:00'),
(288, '2025-06-29 00:00:00', 'kegiatan posyandu', '0000-00-00', '08:00', '2025-06-02 03:46:29', '2025-06-12 15:20:17'),
(289, '2025-06-29 00:00:00', 'Kegiatan Posyandu', '0000-00-00', '08:00', '2025-06-03 09:51:45', '2025-06-12 15:20:42'),
(291, '2025-06-29 00:00:00', 'Kegiatan Posyandu', '0000-00-00', '08:00', '2025-06-03 09:55:07', '2025-06-12 15:21:01'),
(294, '2025-06-29 00:00:00', 'Pelaksanaan Posyandu', '0000-00-00', '08:00', '2025-06-12 03:04:09', '2025-06-12 15:21:20'),
(295, '2025-06-29 00:00:00', 'Pelaksanaan Posyandu', '0000-00-00', '08:00', '2025-06-12 03:05:09', '2025-06-12 15:21:34'),
(297, '2025-06-29 00:00:00', 'Kegiatan Posyandu', '0000-00-00', '08:00', '2025-06-13 02:38:37', '2025-06-13 02:38:37'),
(298, '2025-06-29 00:00:00', 'kegiatan posyandu', '0000-00-00', '08:00', '2025-06-13 13:31:28', '2025-06-13 13:31:28'),
(299, '2025-06-29 00:00:00', 'kegiatan posyandu', '0000-00-00', '08:00', '2025-06-13 13:32:25', '2025-06-13 13:32:25'),
(300, '2025-06-29 00:00:00', 'kegiatan posyandu', '0000-00-00', '08:00', '2025-06-16 03:33:31', '2025-06-16 03:36:12'),
(301, '2025-06-29 00:00:00', 'kegiatan posyandu', '0000-00-00', '08:00', '2025-06-16 03:36:39', '2025-06-16 03:36:39'),
(302, '2025-06-29 00:00:00', 'Kegiatan Posyandu', '0000-00-00', '08:00', '2025-06-24 00:22:13', '2025-06-24 00:22:13'),
(303, '2025-06-29 00:00:00', 'Pelaksanaan Posyandu', '0000-00-00', '08:00', '2025-06-24 00:31:18', '2025-06-24 00:31:18'),
(304, '2025-06-29 00:00:00', 'Pelaksanaan Posyandu', '0000-00-00', '08:00', '2025-06-24 00:37:25', '2025-06-24 00:37:25'),
(305, '2025-06-29 00:00:00', 'Pelaksaan Posyandu', '0000-00-00', '08:00', '2025-06-24 00:38:56', '2025-06-24 00:38:56'),
(306, '2025-06-29 00:00:00', 'Pelaksaan Posyandu', '0000-00-00', '08:00', '2025-06-24 00:42:41', '2025-06-24 00:42:41'),
(307, '2025-06-29 00:00:00', 'Pelaksaan Posyandu', '0000-00-00', '08:00', '2025-06-24 00:58:35', '2025-06-24 00:58:35'),
(308, '2025-06-29 00:00:00', 'Pelaksaan Posyandu', '0000-00-00', '08:00', '2025-06-24 01:00:55', '2025-06-24 01:00:55'),
(309, '2025-06-29 00:00:00', 'Pelaksaan Jadwal Posyandu', '0000-00-00', '08:00', '2025-06-24 01:07:47', '2025-06-24 01:07:47'),
(312, '2025-06-29 00:00:00', 'Pelaksaan Posyandu', '0000-00-00', '08:00', '2025-06-24 04:52:38', '2025-06-24 04:52:38'),
(316, '2025-06-29 00:00:00', 'Pelaksaan Posyandu', '0000-00-00', '08:00', '2025-06-24 05:10:51', '2025-06-24 05:10:51'),
(318, '2025-06-29 00:00:00', 'Pelaksaan Posyandu', '0000-00-00', '08:00', '2025-06-24 05:13:45', '2025-06-24 05:13:45'),
(319, '0000-00-00 00:00:00', 'Test', '0000-00-00', '08:00', '2025-06-29 08:47:29', '2025-06-29 08:47:29'),
(320, '2025-07-01 00:20:10', 'j', '0000-00-00', '08:00', '2025-06-30 17:20:10', '2025-06-30 17:20:10'),
(321, '2025-07-01 00:35:34', 'Pelaksaan Posyandu', '0000-00-00', '08:00', '2025-06-30 17:35:34', '2025-06-30 17:35:34'),
(322, '2025-07-01 05:13:48', 'jk', '17-07-2025', '08:00', '2025-06-30 22:13:48', '2025-06-30 22:13:48'),
(323, '2025-07-09 02:09:43', 'Pelaksanaan Posyandu', '16-07-2025', '08:00', '2025-07-08 19:09:43', '2025-07-08 19:09:43'),
(324, '2025-07-09 02:15:43', 'Pelaksanaan Posyandu', '17-07-2025', '08:00', '2025-07-08 19:15:43', '2025-07-08 19:15:43'),
(325, '2025-07-09 02:18:03', 'Pelaksanaan Posyandu', '15-07-2025', '08:00', '2025-07-08 19:18:03', '2025-07-08 19:18:03'),
(326, '2025-07-09 02:26:42', 'Pelaksaan Posyandu', '25-07-2025', '08:00', '2025-07-08 19:26:42', '2025-07-08 19:26:42'),
(327, '2025-07-09 02:29:21', 'Pelaksanaan Posyandu', '20-07-2025', '08:00', '2025-07-08 19:29:21', '2025-07-08 19:29:21'),
(328, '2025-07-09 02:34:50', 'Pelaksaan Posyandu', '24-07-2025', '08:00', '2025-07-08 19:34:50', '2025-07-08 19:34:50'),
(329, '2025-07-09 02:37:56', 'Pelaksanaan Posyandu', '30-07-2025', '08:00', '2025-07-08 19:37:56', '2025-07-08 19:37:56'),
(330, '2025-07-09 02:40:36', 'Pelaksanaan Posyandu', '26-07-2025', '08:00', '2025-07-08 19:40:36', '2025-07-08 19:40:36'),
(331, '2025-07-09 02:43:24', 'Pelaksaan Posyandu', '20-07-2025', '08:20', '2025-07-08 19:43:24', '2025-07-08 19:43:24'),
(332, '2025-07-09 02:44:16', 'Pelaksaan Posyandu', '20-07-2025', '08:30', '2025-07-08 19:44:16', '2025-07-08 19:44:16'),
(333, '2025-07-09 02:50:06', 'Pelaksaan Posyandu', '30-07-2025', '08:00', '2025-07-08 19:50:06', '2025-07-08 19:50:06'),
(334, '2025-07-09 02:51:32', 'Pelaksanaan Posyandu', '26-07-2025', '08:00', '2025-07-08 19:51:32', '2025-07-08 19:51:32'),
(335, '2025-07-09 02:55:18', 'Pelaksanaan Posyandu', '26-07-2025', '08:30', '2025-07-08 19:55:18', '2025-07-08 19:55:18'),
(336, '2025-07-09 02:59:06', 'Pelaksanaan Posyandu', '26-07-2025', '08:35', '2025-07-08 19:59:06', '2025-07-08 19:59:06'),
(337, '2025-07-09 18:42:39', 'Pelaksaan Posyandu', '23-07-2025', '08:00', '2025-07-09 11:42:39', '2025-07-09 11:42:39'),
(338, '2025-07-09 18:43:09', 'Pelaksaan Posyandu', '26-07-2025', '08:00', '2025-07-09 11:43:09', '2025-07-09 11:43:09'),
(339, '2025-07-15 07:06:06', 'Pelaksanaan Posyandu', '25-07-2025', '08:40', '2025-07-15 00:06:06', '2025-07-15 00:06:06'),
(340, '2025-07-16 04:28:33', 'Pelaksaan Posyandu', '18-07-2025', '08:00', '2025-07-15 21:28:33', '2025-07-15 21:28:33'),
(341, '2025-07-16 05:48:23', 'Pelaksanaan Posyandu', '18-07-2025', '08:00', '2025-07-15 22:48:23', '2025-07-15 22:48:23');

-- --------------------------------------------------------

--
-- Table structure for table `tabel_kesehatan_bayi_baru_lahir`
--

CREATE TABLE `tabel_kesehatan_bayi_baru_lahir` (
  `id` int NOT NULL,
  `nik_ibu` varchar(16) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `nama_ibu` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `nama_ayah` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `nama_anak` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `anak_ke` varchar(5) COLLATE utf8mb4_general_ci NOT NULL,
  `tanggal_kunjungan_1` varchar(20) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `tanggal_kunjungan_2` varchar(20) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `tanggal_kunjungan_3` varchar(20) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `berat_badan_1` varchar(10) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `berat_badan_2` varchar(10) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `berat_badan_3` varchar(10) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `panjang_badan_1` varchar(10) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `panjang_badan_2` varchar(10) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `panjang_badan_3` varchar(10) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `suhu_1` varchar(10) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `suhu_2` varchar(10) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `suhu_3` varchar(10) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `dan_lain_lain_1` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `dan_lain_lain_2` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `dan_lain_lain_3` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `created_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `updated_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tabel_kesehatan_bayi_baru_lahir`
--

INSERT INTO `tabel_kesehatan_bayi_baru_lahir` (`id`, `nik_ibu`, `nama_ibu`, `nama_ayah`, `nama_anak`, `anak_ke`, `tanggal_kunjungan_1`, `tanggal_kunjungan_2`, `tanggal_kunjungan_3`, `berat_badan_1`, `berat_badan_2`, `berat_badan_3`, `panjang_badan_1`, `panjang_badan_2`, `panjang_badan_3`, `suhu_1`, `suhu_2`, `suhu_3`, `dan_lain_lain_1`, `dan_lain_lain_2`, `dan_lain_lain_3`, `created_at`, `updated_at`) VALUES
(13, '7404101804930002', 'Wa Ode Asriana', 'La Ode Armin', 'Wa Ode Keisha Azura Zilvania', '1', '07-05-2020', '10-05-2020', '11-05-2020', '2900', '2900', '2900', '22,5', '22,5', '22,5', 'Normal', '-', '-', 'Normal', '-', '-', '2025-03-10 01:30:25', '2025-05-19 07:31:21'),
(27, '7415074408020002', 'Filna', 'La Unda', 'Nadifa', '1', '12-06-2025', '10-05-2025', '11-05-2025', 'h', 'h', 'h', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', '2025-05-04 05:09:11', '2025-05-09 11:01:20'),
(28, '7415074408020002', 'Filna', 'La Unda', 'Bayi Ny. Filna', '2', '10-05-2025', '-', '-', '2.8', '-', '-', '49', '-', '-', '36.1', '-', '-', '-', '-', '-', '2025-05-09 11:04:09', '2025-07-09 16:31:37'),
(32, '7404194512920002', 'Waode Lilis Ardila', 'Akbar', 'Sanum Syanum Ruwaiha', '1', '14-08-2020', '01-01-1970', '01-01-1970', '29', NULL, NULL, '48.5', NULL, NULL, '36,8', NULL, NULL, '-', NULL, NULL, '2025-05-18 13:09:03', '2025-05-18 13:09:03'),
(33, '7404194512920002', 'Waode Lilis Ardila', 'Akbar', 'Ratu Ayzela', '2', '01-01-1970', '01-01-1970', '01-01-1970', '3.4', NULL, NULL, '49.5', NULL, NULL, '36,7', NULL, NULL, '-', NULL, NULL, '2025-05-18 13:13:00', '2025-05-18 13:13:00'),
(34, '7404197112980002', 'RUFAIDA', 'La Taumi', 'Muhammad Bilal', '1', '01-01-1970', '01-01-1970', '01-01-1970', '3', NULL, NULL, '47', NULL, NULL, '37', NULL, NULL, '-', NULL, NULL, '2025-05-18 13:14:11', '2025-05-18 13:14:11'),
(35, '7404196406890001', 'DARLI', 'LA BAHARUDDIN', 'Wa Ode. Riana Sari', '1', '01-01-1970', '01-01-1970', '01-01-1970', '2.9', NULL, NULL, '50', NULL, NULL, '36,2', NULL, NULL, '-', NULL, NULL, '2025-05-18 13:15:45', '2025-05-18 13:15:45'),
(36, '7404196406890001', 'DARLI', 'LA BAHARUDDIN', 'Muhammad Rehan', '2', '01-01-1970', '01-01-1970', '01-01-1970', '3', NULL, NULL, '49.5', NULL, NULL, '37', NULL, NULL, '-', NULL, NULL, '2025-05-18 13:18:18', '2025-05-18 13:18:18'),
(37, '7404195508980001', 'NURYANTI', 'HASBIN', 'Alisya', '1', '01-01-1970', '01-01-1970', '01-01-1970', '3', NULL, NULL, '49', NULL, NULL, '47', NULL, NULL, '-', NULL, NULL, '2025-05-18 13:32:19', '2025-05-18 13:32:19'),
(38, '7415074408020002', 'Filna', 'La Unda', 'Nadifa', '1', '01-01-1970', '01-01-1970', '01-01-1970', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2025-05-19 17:52:28', '2025-05-19 17:52:28'),
(39, '7415074408020002', 'Filna', 'La Unda', 'Nadifa', '1', '14-03-2024', '18-04-2024', '28-03-2024', '3.3', '3.5', '3.6', '51', '52', '53', '36.4', '36.9', '36', '-', 'n-', '-', '2025-05-19 17:57:05', '2025-07-09 16:29:32'),
(40, '740419670440002', 'Yusniar', 'Hasaru', 'Aladin', '1', '07-12-2021', '01-01-1970', '01-01-1970', '3', '-', '-', '49', '-', '-', '37', '-', '-', '-', '-', '-', '2025-05-22 07:52:41', '2025-05-22 07:52:41'),
(41, '740419670440002', 'Yusniar', 'Hasaru', 'Ambina Fitria', '2', '07-04-2024', '01-01-1970', '01-01-1970', '3', '-', '-', '50', '-', '-', '36', '-', '-', '-', '-', '-', '2025-05-22 07:54:23', '2025-05-22 07:54:23'),
(42, '7404194107980002', 'Andriani', 'Ahmad', 'Ramaya Idyilla Ahmad', '1', '25-03-2022', '01-01-1970', '01-01-1970', '3', '-', '-', '49', '-', '-', '36.8', '-', '-', '-', '-', '-', '2025-05-22 08:04:24', '2025-05-22 08:04:24'),
(43, '7404195230497000', 'Farnia', 'Hariono Asadi', 'Muh. Ananta Ahyan', '1', '09-06-2024', '-', '-', '3.4', '-', '-', '50', '-', '-', '36.9', '-', '-', '-', '-', '-', '2025-05-22 08:12:26', '2025-07-09 16:32:13'),
(44, '7404194107880002', 'Nasra', 'Sutriadin', 'Qaisya Azkayra', '1', '29-05-2022', '01-01-1970', '01-01-1970', '3', '-', '-', '50', '-', '-', '36.7', '-', '-', '-', '-', '-', '2025-05-22 08:22:49', '2025-05-22 08:22:49'),
(45, '7404194107880002', 'Nasra', 'Sutriadin', 'Qeisya Azkayla', '2', '29-05-2022', '01-01-1970', '01-01-1970', '3.1', '-', '-', '50', '-', '-', '36.7', '-', '-', '-', '-', '-', '2025-05-22 08:23:42', '2025-05-22 08:23:42'),
(46, '7404194107880002', 'Nasra', 'Sutriadin', 'Alsava Azqya Maryam', '3', '25-01-2025', '-', '-', '2.9', '-', '-', '49', '-', '-', '36.8', '-', '-', '-', '-', '-', '2025-05-22 08:24:57', '2025-07-09 16:32:41'),
(47, '7404195507970001', 'Isnawati', 'Asrin', 'Muh. Qoyyim Arrazi', '1', '16-06-2022', '01-01-1970', '01-01-1970', '3.1', '-', '-', '50', '-', '-', '36.2', '-', '-', '-', '-', '-', '2025-05-22 08:31:54', '2025-05-22 08:31:54'),
(48, '740419540799001', 'Naria', 'Sahadin', 'Amila Anasya', '1', '24-04-2021', '01-01-1970', '01-01-1970', '2.9', '-', '-', '48', '-', '-', '37', '-', '-', '-', '-', '-', '2025-05-22 08:40:49', '2025-05-22 08:40:49'),
(49, '740419510990001', 'Dasniar', 'Resmin', 'Tian Anugrah', '1', '24-04-2022', '01-01-1970', '01-01-1970', '2.9', '-', '-', '49', '-', '-', '36.8', '-', '-', '-', '-', '-', '2025-05-22 08:48:58', '2025-05-22 08:48:58'),
(50, '740419440408001', 'Salma', 'Rahim', 'By. Ny.Salma', '1', '23-03-2025', '01-01-1970', '01-01-1970', '2.8', '-', '-', '49', '-', '-', '36.1', '-', '-', '-', '-', '-', '2025-05-22 08:54:55', '2025-05-22 08:54:55'),
(51, '7404195111980001', 'Susilawati', 'Risno', 'Nur Hanan Mirza', '1', '28-10-2022', '01-01-1970', '01-01-1970', '3', '-', '-', '49', '-', '-', '36.7', '-', '-', '-', '-', '-', '2025-05-22 09:04:51', '2025-05-22 09:04:51'),
(52, '7404195111980001', 'Susilawati', 'Risno', 'Hanum', '2', '31-12-2023', '01-01-1970', '01-01-1970', '3.5', '-', '-', '49', '-', '-', '36.8', '-', '-', '-', '-', '-', '2025-05-22 09:06:30', '2025-05-22 09:06:30'),
(53, '740419410400002', 'Musrida', 'La Ami', 'Muh. Rafa', '1', '2022-01-22', '2022-01-27', NULL, '3.1', '3.4', '-', '49', '50', '-', '37.8', '36.3', '-', '-', '-', '-', '2025-05-24 04:46:47', '2025-06-17 17:00:37'),
(54, '7404194107860225', 'Ulfa', 'Ahmad', 'Muhammad Aska putra', '4', '01-01-1970', '01-01-1970', '01-01-1970', 'f', 'g', NULL, 'd', 'f', NULL, 'f', 'c', NULL, 'f', 'f', NULL, '2025-05-27 14:42:07', '2025-05-27 14:42:07'),
(55, '7404195305940001', 'RISMAWATI', 'La Ode amsal', 'Muhammad al-malik', '1', '01-01-1970', '01-01-1970', '01-01-1970', '3.5', '4', '-', '52', '52', '-', '36.9', '36.8', '-', '-', '-', '-', '2025-06-10 15:04:45', '2025-06-10 15:08:07'),
(56, '7404195305940001', 'RISMAWATI', 'La Ode amsal', 'Inayah Nurul Fatihah', '2', '21-05-2022', '29-05-2022', '01-01-1970', '3', '3.8', '-', '50', '52', '-', '37', '36.8', '-', '-', '-', '-', '2025-06-10 15:07:03', '2025-06-10 15:07:03'),
(57, '7404194109980001', 'Wa Ode Isrami', 'Darzin', 'Wa Ode Mikaila', '1', '2024-05-27', '2024-06-02', '2024-06-12', '3', '3.2', '3.8', '50', '50.9', '51', '36.2', '36.5', '36.7', '-', '-', '-', '2025-06-10 15:12:14', '2025-06-10 15:32:55'),
(58, '7404195120100001', 'Dania', 'Dahri', 'Aprillia Ramadani', '1', '2024-04-03', '2024-04-07', '2024-04-27', '3.5', '3.9', '4.5', '51', '53', '55', '36.9', '36', '36.2', '-', '-', '-', '2025-06-15 10:10:38', '2025-06-15 10:10:38'),
(59, '7404195810100002', 'ZIANA', 'RASID', 'HASRUL', '1', '2021-03-14', '2021-03-19', '2025-04-05', '3', '3.5', '4.2', '48', '52', '54', '36.5', '36.8', '37', '-', '-', '-', '2025-06-15 10:33:33', '2025-06-15 10:33:33'),
(60, '917101560791004', 'SUNARTI', 'Darson', 'Asma Nadia', '1', '2022-06-02', '2020-06-07', '2020-06-24', '1.8', '2.5', '3', '49', '51', '43', '36.5', '36.9', '36.7', '-', '-', '-', '2025-06-15 10:38:30', '2025-06-15 10:38:30'),
(61, '917101560791004', 'SUNARTI', 'Darson', 'By. ny. sunarti', '2', '2025-03-31', '2025-04-05', '2025-04-21', '3', '3.5', '4.2', '50', '52', '54', '36.7', '36.8', '36.6', '-', '-', '-', '2025-06-15 10:44:41', '2025-06-15 10:44:41'),
(62, '7404195221203000', 'Elvania', 'Hilyamin', 'Aisyah Maira', '1', '2022-02-23', '2022-03-01', NULL, '3', '3.6', '-', '49', '51', '-', '36.7', '36.6', '-', '-', '-', '-', '2025-06-15 10:59:20', '2025-06-15 10:59:20'),
(63, '7404195221203000', 'Elvania', 'Hilyamin', 'Zaena aiyla', '2', '2024-06-17', '2024-06-22', '2024-07-08', '3.3', '3.5', '4', '51', '52', '54', '36.6', '36.7', '36.8', '-', '-', '-', '2025-06-15 11:01:46', '2025-06-15 11:01:46'),
(64, '7404195301090002', 'SUFALIN', 'ABDUL UKIS', 'Shanum Zahra', '1', '2021-01-02', '2021-01-05', '2021-01-10', '2.9', '3.1', '3.8', '48.5', '49', '50', '36.4', '36.6', '36.3', '-', '-', '-', '2025-06-15 11:07:00', '2025-06-15 11:07:00'),
(65, '7404066403000001', 'Nurfina', 'Alan', 'Saflan', '1', '2024-05-29', '2024-06-02', '2024-06-09', '3.2', '3.6', '3.8', '49', '50', '52', '36.7', '36.8', '36.9', '-', '-', '-', '2025-06-15 11:12:00', '2025-06-15 11:12:00'),
(66, '7404194507020001', 'Sarnawati', 'Abdul Samat', 'Qiana safika', '3', '2022-07-22', '2022-07-27', '2022-08-02', '2.9', '3.2', '3.7', '49', '51', '53', '36.4', '36.8', '36.7', '-', '-', '-', '2025-06-15 11:14:50', '2025-06-15 11:14:50'),
(67, '7404192112060002', 'Darti', 'Onan', 'Narendra', '1', '2023-03-20', '2023-03-24', '2023-03-09', '3.2', '3.8', '-4.1', '50', '52', '55', '36.5', '36.8', '36.5', '-', '-', '-', '2025-06-15 14:03:41', '2025-06-15 14:07:15'),
(68, '7404195717980002', 'Amana', 'Irwan Said', 'Muh. Anata Said', '1', '01-01-1970', '01-01-1970', '08-08-2024', '2.9', '3', '3.3', '48.7', '50', '53', '36.2', '36', '36', '-', '-', '-', '2025-07-09 16:23:19', '2025-07-09 16:23:19'),
(69, '7404194140791000', 'Lisda Anggraini', 'Indra Ifin', 'Tanisya', '1', '10-01-2024', '10-07-2024', '01-01-1970', '2.8', '3', '3.2', '49', '52', '52', '36.5', '36.7', '36.2', '-', '-', '-', '2025-07-09 16:26:25', '2025-07-09 16:26:25'),
(70, '7404195130595000', 'Ridayani', 'La Ode Tamsil', 'Arshaka Nirendra', '1', '16-01-2025', '01-01-1970', '-', '3.8', '4', '-', '50', '52', '-', '36.5', '36.8', '-', '-', '-', '-', '2025-07-09 16:34:38', '2025-07-09 16:35:20'),
(71, '7415074408020002', 'Filna', 'La Unda', 'Nadifa', '1', '01-01-1970', '01-01-1970', '01-01-1970', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2025-07-15 19:50:08', '2025-07-15 19:50:08'),
(72, '7415074408020002', 'Filna', 'La Unda', 'Nadifa', '1', '01-01-1970', '01-01-1970', '01-01-1970', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2025-07-15 20:20:09', '2025-07-15 20:20:09'),
(73, '7404194109980001', 'Wa Ode Isrami', 'Darzin', 'Wa Ode Mikaila', '1', '01-01-1970', '01-01-1970', '01-01-1970', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2025-07-15 20:22:27', '2025-07-15 20:22:27');

-- --------------------------------------------------------

--
-- Table structure for table `tabel_kesehatan_ibu_bersalin`
--

CREATE TABLE `tabel_kesehatan_ibu_bersalin` (
  `id` int NOT NULL,
  `nik_ibu` varchar(16) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `tanggal_persalinan` varchar(20) COLLATE utf8mb4_general_ci NOT NULL,
  `pukul` varchar(20) COLLATE utf8mb4_general_ci NOT NULL,
  `umur_kehamilan` varchar(20) COLLATE utf8mb4_general_ci NOT NULL,
  `penolong_persalinan` varchar(30) COLLATE utf8mb4_general_ci NOT NULL,
  `cara_persalinan` varchar(30) COLLATE utf8mb4_general_ci NOT NULL,
  `keadaan_ibu` varchar(50) COLLATE utf8mb4_general_ci NOT NULL,
  `anak_ke` varchar(5) COLLATE utf8mb4_general_ci NOT NULL,
  `berat_lahir` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `panjang_badan` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `lingkar_kepala` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `jenis_kelamin` varchar(15) COLLATE utf8mb4_general_ci NOT NULL,
  `kondisi_bayi_saat_lahir` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `asuhan_bayi_baru_lahir` text COLLATE utf8mb4_general_ci NOT NULL,
  `created_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `updated_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tabel_kesehatan_ibu_bersalin`
--

INSERT INTO `tabel_kesehatan_ibu_bersalin` (`id`, `nik_ibu`, `tanggal_persalinan`, `pukul`, `umur_kehamilan`, `penolong_persalinan`, `cara_persalinan`, `keadaan_ibu`, `anak_ke`, `berat_lahir`, `panjang_badan`, `lingkar_kepala`, `jenis_kelamin`, `kondisi_bayi_saat_lahir`, `asuhan_bayi_baru_lahir`, `created_at`, `updated_at`) VALUES
(23, '7404101804930002', '10/11/2020', '13:32', '43 mg', 'Bidan', 'Persalinan Pervaginam', 'Baik', '1', '3', '49', '34', 'Perempuan', 'Segera menangis', 'Inisiasi menyusu dini (IMD) dalam 1 jam pertama kelahiran bayi', '2025-06-19 08:22:03', '2025-06-19 09:22:03'),
(28, '7415074408020002', '04/05/2025', '10:35', '43 mg', 'Bidan', 'Persalinan Pervaginam', 'Baik', '2', '2.8', '49', '34', 'Perempuan', 'Segera menangis', 'Inisiasi menyusu dini (IMD) dalam 1 jam pertama kelahiran bayi', '2025-06-19 08:14:30', '2025-06-19 09:14:30'),
(31, '7415074408020002', '01/03/2025', '13:20', '44 mg', 'Bidan', 'Persalinan Pervaginam', 'Sehat', '1', '4000', '45', '32', 'Perempuan', 'Segera menangis', 'Inisiasi menyusu dini (IMD) dalam 1 jam pertama kelahiran bayi', '2025-06-19 08:14:40', '2025-06-19 09:14:40'),
(35, '740419410400002', '22/01/2022', '09:00', '44 mg', 'Bidan', 'Persalinan Pervaginam', 'Sehat', '1', '3.1', '49', '35.2', 'Laki-Laki', 'Segera menangis', 'Inisiasi menyusu dini (IMD) dalam 1 jam pertama kelahiran bayi', '2025-06-19 08:27:15', '2025-06-19 09:27:15'),
(36, '7404195111980001', '24/10/2022', '02:00', '43 mg', 'Bidan', 'Persalinan Pervaginam', 'Sehat', '1', '3', '4.9', '36', 'Laki-Laki', 'Segera menangis', 'Inisiasi menyusu dini (IMD) dalam 1 jam pertama kelahiran bayi', '2025-06-19 08:28:25', '2025-06-19 09:28:25'),
(37, '7404195111980001', '31/12/2023', '23:00', '44 mg', 'Dokter Kandungan', 'Operasi Caesar', 'Sehat', '2', '3.5', '49', '34', 'Perempuan', 'Segera menangis', 'Inisiasi menyusu dini (IMD) dalam 1 jam pertama kelahiran bayi', '2025-06-19 08:28:35', '2025-06-19 09:28:35'),
(38, '740419440408001', '23/03/2025', '04:00', '44 mg', 'Bidan', 'Persalinan Pervaginam', 'Sehat', '1', '2.8', '44', '33', 'Perempuan', 'Segera menangis', 'Inisiasi menyusu dini (IMD) dalam 1 jam pertama kelahiran bayiImunisasi Hepatitis B', '2025-06-19 08:23:45', '2025-06-19 09:23:45'),
(39, '740419510990001', '24/04/2021', '01:00', '44 mg', 'Bidan', 'Persalinan Pervaginam', 'Sehat', '1', '3', '50', '35.5', 'Laki-Laki', 'Segera menangis', 'Inisiasi menyusu dini (IMD) dalam 1 jam pertama kelahiran bayi', '2025-06-19 08:23:20', '2025-06-19 09:23:20'),
(40, '740419540799001', '24/04/2021', '20:00', '44 mg', 'Bidan', 'Persalinan Pervaginam', 'Sehat', '1', '2.9', '48', '33.6', 'Perempuan', 'Segera menangis', 'Inisiasi menyusu dini (IMD) dalam 1 jam pertama kelahiran bayi', '2025-06-19 08:23:04', '2025-06-19 09:23:04'),
(41, '7404195507970001', '16/06/2022', '09:00', '44 mg', 'Bidan', 'Persalinan Pervaginam', 'Sehat', '1', '3.1', '50', '36', 'Laki-Laki', 'Segera menangis', 'Inisiasi menyusu dini (IMD) dalam 1 jam pertama kelahiran bayi', '2025-06-19 08:22:44', '2025-06-19 09:22:44'),
(47, '7404194109980001', '27/065/2024', '11:00', '43 mg', 'Bidan', 'Persalinan Pervaginam', 'Sehat', '1', '2.8', '50', '33', 'Perempuan', 'Segera menangis', 'Inisiasi menyusu dini (IMD) dalam 1 jam pertama kelahiran bayi', '2025-06-17 16:47:42', '2025-06-17 16:47:42'),
(48, '7404194507020001', '22/07/2022', '01:00', '43 mg', 'Bidan', 'Persalinan Pervaginam', 'Sehat', '3', '2.9', '49', '32.9', 'Perempuan', 'Segera menangis', 'Inisiasi menyusu dini (IMD) dalam 1 jam pertama kelahiran bayi', '2025-06-17 16:50:40', '2025-06-17 16:50:40'),
(49, '7404192112060002', '20/03/2023', '13:00', '44 mg', 'Bidan', 'Persalinan Pervaginam', 'Sehat', '1', '3.2', '50', '34', 'Laki-laki', 'Segera menangis', 'Inisiasi menyusu dini (IMD) dalam 1 jam pertama kelahiran bayi', '2025-06-17 16:54:49', '2025-06-17 16:54:49'),
(50, '7404195120100001', '28/10/2022', '14:30', '44 mg', 'Dokter Kandungan', 'Operasi Caesar', 'sehat', '1', '3.5', '51', '35', 'Perempuan', 'Segera menangis', 'Inisiasi menyusu dini (IMD) dalam 1 jam pertama kelahiran bayi', '2025-06-18 06:19:23', '2025-06-18 06:19:23'),
(51, '7404066403000001', '29/05/2024', '14:20', '43 mg', 'Bidan', 'Persalinan Pervaginam', 'Sehat', '1', '3.2', '49', '34', 'Laki-laki', 'Segera menangis', 'Inisiasi menyusu dini (IMD) dalam 1 jam pertama kelahiran bayi', '2025-06-18 06:24:55', '2025-06-18 06:24:55'),
(52, '7404195150799000', '24/022025', '14:00', '44 mg', 'Bidan', 'Persalinan Pervaginam', 'sehat', '1', '3.1', '48', '32.5', 'Perempuan', 'Segera menangis', 'Inisiasi menyusu dini (IMD) dalam 1 jam pertama kelahiran bayi', '2025-06-18 06:27:58', '2025-06-18 06:27:58'),
(53, '7404196612010001', '13/06/2021', '03:00', '44 mg', 'Bidan', 'Persalinan Pervaginam', 'sehat', '1', '3', '49', '34', 'Laki-laki', 'Segera menangis', 'Inisiasi menyusu dini (IMD) dalam 1 jam pertama kelahiran bayi', '2025-06-18 06:30:55', '2025-06-18 06:30:55'),
(54, '740419671299001', '09/11/2021', '07:00', '44 mg', 'Bidan', 'Persalinan Pervaginam', 'sehat', '1', '3.1', '51', '34.5', 'Laki-laki', 'Segera menangis', 'Inisiasi menyusu dini (IMD) dalam 1 jam pertama kelahiran bayi', '2025-06-18 06:33:03', '2025-06-18 06:33:03'),
(55, '7404194810010001', '12/04/2021', '20:00', '44 mg', 'Bidan', 'Persalinan Pervaginam', 'Sehat', '1', '3', '48.5', '33', 'Perempuan', 'Segera menangis', 'Inisiasi menyusu dini (IMD) dalam 1 jam pertama kelahiran bayiImunisasi Hepatitis B', '2025-06-19 08:45:59', '2025-06-19 08:45:59'),
(56, '7404195130595000', '16/01/2025', '18:00', '43 mg', 'Dokter Kandungan', 'Operasi Caesar', 'Sehat', '1', '3.8', '50', '35', 'Laki-Laki', 'Menangis beberapa sa', 'Inisiasi menyusu dini (IMD) dalam 1 jam pertama kelahiran bayiImunisasi Hepatitis B', '2025-06-19 08:47:45', '2025-06-19 08:47:45'),
(57, '9271015502930005', '01/01/2024', '19:00', '44 mg', 'Bidan', 'Persalinan Pervaginam', 'Sehat', '1', '3.1', '50', '33', 'Laki-Laki', 'Segera menangis', 'Inisiasi menyusu dini (IMD) dalam 1 jam pertama kelahiran bayiImunisasi Hepatitis B', '2025-06-19 08:50:52', '2025-06-19 08:50:52'),
(58, '7404194801030001', '14/02/2024', '22:00', '43 mg', 'Bidan', 'Persalinan Pervaginam', 'Sehat', '1', '3', '49', '33', 'Perempuan', 'Segera menangis', 'Inisiasi menyusu dini (IMD) dalam 1 jam pertama kelahiran bayiImunisasi Hepatitis B', '2025-06-19 08:52:01', '2025-06-19 08:52:01'),
(59, '7404194140791000', '01/10/2024', '01:30', '43 mg', 'Bidan', 'Persalinan Pervaginam', 'Sehat', '1', '2.8', '49', '33', 'Perempuan', 'Segera menangis', 'Inisiasi menyusu dini (IMD) dalam 1 jam pertama kelahiran bayiImunisasi Hepatitis B', '2025-06-19 08:53:51', '2025-06-19 08:53:51'),
(60, '7404195717980002', '19/07/2024', '13:00', '43 mg', 'Bidan', 'Persalinan Pervaginam', 'Sehat', '1', '2.9', '48.7', '34', 'Laki-Laki', 'Segera menangis', 'Inisiasi menyusu dini (IMD) dalam 1 jam pertama kelahiran bayiImunisasi Hepatitis B', '2025-06-19 08:54:58', '2025-06-19 08:54:58'),
(61, '7404197889300002', '09/05/2023', '16:00', '42 mg', 'Bidan', 'Persalinan Pervaginam', 'Sehat', '1', '2.6', '49', '32.2', 'Perempuan', 'Segera menangis', 'Inisiasi menyusu dini (IMD) dalam 1 jam pertama kelahiran bayiImunisasi Hepatitis B', '2025-06-19 08:56:26', '2025-06-19 08:56:26'),
(62, '7404204509930001', '27/06/2023', '21:00', '41 mg', 'Bidan', 'Persalinan Pervaginam', 'Sehat', '1', '2', '43', '32', 'Perempuan', 'Segera menangis', 'Inisiasi menyusu dini (IMD) dalam 1 jam pertama kelahiran bayiImunisasi Hepatitis B', '2025-06-19 09:00:16', '2025-06-19 09:00:16'),
(63, '7404194108000002', '10/11/2023', '23:00', '43 mg', 'Bidan', 'Persalinan Pervaginam', 'Sehat', '1', '3.2', '50', '34', 'Perempuan', 'Segera menangis', 'Inisiasi menyusu dini (IMD) dalam 1 jam pertama kelahiran bayiImunisasi Hepatitis B', '2025-06-19 09:02:13', '2025-06-19 09:02:13'),
(64, '7404194118020002', '13/06/2023', '16:30', '43 mg', 'Bidan', 'Persalinan Pervaginam', 'Sehat', '1', '3.2', '49', '33', 'Perempuan', 'Segera menangis', 'Inisiasi menyusu dini (IMD) dalam 1 jam pertama kelahiran bayiImunisasi Hepatitis B', '2025-06-19 09:03:17', '2025-06-19 09:03:17'),
(65, '9207015511980001', '26/08/2022', '18:00', '43 mg', 'Bidan', 'Persalinan Pervaginam', 'Sehat', '1', '2.9', '49', '33', 'Perempuan', 'Segera menangis', 'Inisiasi menyusu dini (IMD) dalam 1 jam pertama kelahiran bayiImunisasi Hepatitis B', '2025-06-19 09:07:50', '2025-06-19 09:07:50'),
(66, '7404195008970001', '10/03/2022', '20:00', '43 mg', 'Bidan', 'Persalinan Pervaginam', 'Sehat', '1', '2.9', '49', '34', 'Perempuan', 'Segera menangis', 'Inisiasi menyusu dini (IMD) dalam 1 jam pertama kelahiran bayiImunisasi Hepatitis B', '2025-06-19 09:31:59', '2025-06-19 09:31:59'),
(67, '7404195008970001', '11/07/2024', '01:00', '43 mg', 'Bidan', 'Persalinan Pervaginam', 'Sehat', '2', '3.5', '49', '35', 'Laki-Laki', 'Segera menangis', 'Inisiasi menyusu dini (IMD) dalam 1 jam pertama kelahiran bayiImunisasi Hepatitis B', '2025-06-19 09:33:04', '2025-06-19 09:33:04'),
(68, '7404194507920002', '16/12/2022', '20:00', '44 mg', 'Bidan', 'Persalinan Pervaginam', 'Sehat', '1', '3', '48', '34', 'Laki-Laki', 'Segera menangis', 'Inisiasi menyusu dini (IMD) dalam 1 jam pertama kelahiran bayiImunisasi Hepatitis B', '2025-06-19 09:35:00', '2025-06-19 09:35:00'),
(69, '9171010510820002', '16/12/2022', '23:00', '44 mg', 'Bidan', 'Persalinan Pervaginam', 'Sehat', '1', '3', '50', '34', 'Laki-Laki', 'Segera menangis', 'Inisiasi menyusu dini (IMD) dalam 1 jam pertama kelahiran bayi', '2025-06-19 09:37:36', '2025-06-19 09:37:36'),
(70, '7404194504910001', '17/07/2022', '21:00', '44 mg', 'Bidan', 'Persalinan Pervaginam', 'Sehat', '1', '3.1', '51', '34', 'Perempuan', 'Segera menangis', 'Inisiasi menyusu dini (IMD) dalam 1 jam pertama kelahiran bayiImunisasi Hepatitis B', '2025-06-19 09:39:45', '2025-06-19 09:39:45'),
(71, '7404194128880001', '12/03/2023', '23:00', '44', 'Bidan', 'Operasi Caesar', 'Sehat', '1', '3.6', '50', '34', 'Perempuan', 'Segera menangis', 'Inisiasi menyusu dini (IMD) dalam 1 jam pertama kelahiran bayiImunisasi Hepatitis B', '2025-06-19 09:42:19', '2025-06-19 09:42:19'),
(73, '7404195221203000', '23/02/2022', '21:30', '44 mg', 'Bidan', 'Persalinan Pervaginam', 'Sehat', '1', '3', '49', '34', 'Perempuan', 'Segera menangis', 'Inisiasi menyusu dini (IMD) dalam 1 jam pertama kelahiran bayiImunisasi Hepatitis B', '2025-06-19 09:44:30', '2025-06-19 09:44:30'),
(74, '7404195221203000', '17/06/2024', '15:30', '43 mg', 'Bidan', 'Persalinan Pervaginam', 'Sehat', '2', '3.3', '51', '34', 'Perempuan', 'Segera menangis', 'Inisiasi menyusu dini (IMD) dalam 1 jam pertama kelahiran bayiImunisasi Hepatitis B', '2025-06-19 09:46:08', '2025-06-19 09:46:08'),
(76, '7404419500298000', '22/04/2021', '19:30', '44 mg', 'Bidan', 'Persalinan Pervaginam', 'Sehat', '1', '3.3', '51', '34', 'Perempuan', 'Segera menangis', 'Inisiasi menyusu dini (IMD) dalam 1 jam pertama kelahiran bayiImunisasi Hepatitis B', '2025-06-19 09:50:47', '2025-06-19 09:50:47'),
(77, '7404419500298000', '05/02/2023', '03:30', '44 mg', 'Bidan', 'Persalinan Pervaginam', 'Sehat', '2', '2.9', '48', '34', 'Laki-Laki', 'Segera menangis', 'Inisiasi menyusu dini (IMD) dalam 1 jam pertama kelahiran bayiImunisasi Hepatitis B', '2025-06-19 09:52:03', '2025-06-19 09:52:03'),
(78, '7404194107880002', '29/05/2022', '22:15', '44 mg', 'Bidan', 'Persalinan Pervaginam', 'Sehat', '1', '3', '50', '34', 'Perempuan', 'Segera menangis', 'Inisiasi menyusu dini (IMD) dalam 1 jam pertama kelahiran bayiImunisasi Hepatitis B', '2025-06-19 09:54:50', '2025-06-19 09:54:50'),
(79, '7404194107880002', '29/05/2022', '22:20', '44', 'Bidan', 'Persalinan Pervaginam', 'Sehat', '2', '3.1', '50', '34', 'Perempuan', 'Segera menangis', 'Inisiasi menyusu dini (IMD) dalam 1 jam pertama kelahiran bayiImunisasi Hepatitis B', '2025-06-19 09:55:55', '2025-06-19 09:55:55'),
(80, '7404194107880002', '25/01/2025', '19:00', '43 mg', 'Bidan', 'Persalinan Pervaginam', 'Sehat', '3', '2.9', '49', '34', 'Perempuan', 'Segera menangis', 'Inisiasi menyusu dini (IMD) dalam 1 jam pertama kelahiran bayiImunisasi Hepatitis B', '2025-06-19 09:56:47', '2025-06-19 09:56:47'),
(81, '7404195230497000', '06/09/2024', '22:00', '44 mg', 'Bidan', 'Persalinan Pervaginam', 'Sehat', '1', '3.4', '50', '34', 'Laki-Laki', 'Segera menangis', 'Inisiasi menyusu dini (IMD) dalam 1 jam pertama kelahiran bayiImunisasi Hepatitis B', '2025-06-19 10:17:31', '2025-06-19 10:17:31'),
(82, '7404194107980002', '25/03/2022', '02:00', '44 mg', 'Bidan', 'Persalinan Pervaginam', 'Sehat', '1', '3', '49', '34', 'Perempuan', 'Segera menangis', 'Inisiasi menyusu dini (IMD) dalam 1 jam pertama kelahiran bayiImunisasi Hepatitis B', '2025-06-19 10:19:14', '2025-06-19 10:19:14'),
(83, '740419670440002', '07/12/2021', '18:30', '44 mg', 'Bidan', 'Persalinan Pervaginam', 'Sehat', '1', '3', '49', '34', 'Laki-Laki', 'Segera menangis', 'Inisiasi menyusu dini (IMD) dalam 1 jam pertama kelahiran bayiImunisasi Hepatitis B', '2025-06-19 10:20:17', '2025-06-19 10:20:17'),
(84, '740419670440002', '07/04/2024', '22:30', '44 mg', 'Bidan', 'Persalinan Pervaginam', 'Sehat', '2', '3.2', '50', '33', 'Perempuan', 'Segera menangis', 'Inisiasi menyusu dini (IMD) dalam 1 jam pertama kelahiran bayiImunisasi Hepatitis B', '2025-06-19 10:22:28', '2025-06-19 10:22:28'),
(85, '7404194512920002', '14/08/2020', '16:00', '43 mg', 'Bidan', 'Persalinan Pervaginam', 'Sehat', '1', '2.8', '45.9', '32', 'Perempuan', 'Segera menangis', 'Inisiasi menyusu dini (IMD) dalam 1 jam pertama kelahiran bayiImunisasi Hepatitis B', '2025-06-19 10:23:54', '2025-06-19 10:23:54'),
(87, '7404194512920002', '16/11/2024', '10:00', '44 mg', 'Bidan', 'Persalinan Pervaginam', 'Sehat', '2', '3.4', '49', '34', 'Perempuan', 'Segera menangis', 'Inisiasi menyusu dini (IMD) dalam 1 jam pertama kelahiran bayiImunisasi Hepatitis B', '2025-06-19 10:27:31', '2025-06-19 10:27:31'),
(89, '7404197151298000', '19/07/2020', '03:00', '43 mg', 'Bidan', 'Persalinan Pervaginam', 'Sehat', '1', '3', '49', '34', 'Laki-Laki', 'Segera menangis', 'Inisiasi menyusu dini (IMD) dalam 1 jam pertama kelahiran bayiImunisasi Hepatitis B', '2025-06-19 10:30:44', '2025-06-19 10:30:44'),
(90, '7404196406890001', '13/07/2020', '08:00', '43 mg', 'Bidan', 'Persalinan Pervaginam', 'Sehat', '1', '3', '49', '34', 'Perempuan', 'Segera menangis', 'Inisiasi menyusu dini (IMD) dalam 1 jam pertama kelahiran bayiImunisasi Hepatitis B', '2025-06-19 10:32:17', '2025-06-19 10:32:17'),
(91, '7404196406890001', '04/11/2022', '16:00', '44 mg', 'Bidan', 'Persalinan Pervaginam', 'Sehat', '2', '3', '50', '34', 'Laki-Laki', 'Segera menangis', 'Inisiasi menyusu dini (IMD) dalam 1 jam pertama kelahiran bayiImunisasi Hepatitis B', '2025-06-19 10:33:29', '2025-06-19 10:33:29'),
(92, '917101560791004', '02/06/2020', '11:00', '33 mg', 'Dokter Kandungan', 'Operasi Caesar', 'Sehat', '1', '1.8', '49', '30', 'Perempuan', 'Segera menangis', 'Inisiasi menyusu dini (IMD) dalam 1 jam pertama kelahiran bayiImunisasi Hepatitis B', '2025-06-19 10:43:46', '2025-06-19 10:43:46'),
(93, '917101560791004', '31/03/2025', '17:00', '44 mg', '-Pilih-', 'Persalinan Pervaginam', 'Sehat', '2', '3', '50', '34', 'Laki-Laki', 'Segera menangis', 'Inisiasi menyusu dini (IMD) dalam 1 jam pertama kelahiran bayiImunisasi Hepatitis B', '2025-06-19 10:44:44', '2025-06-19 10:44:44'),
(94, '7404195305940001', '18/05/2020', '09:00', '44 mg', 'Bidan', 'Persalinan Pervaginam', 'Sehat', '1', '3.5', '52', '34', 'Laki-Laki', 'Segera menangis', 'Inisiasi menyusu dini (IMD) dalam 1 jam pertama kelahiran bayiImunisasi Hepatitis B', '2025-06-19 10:49:34', '2025-06-19 10:49:34'),
(95, '7404195305940001', '21/05/2022', '02:00', '43 mg', '-Pilih-', 'Persalinan Pervaginam', 'Sehat', '2', '3', '50', '34', 'Perempuan', 'Segera menangis', 'Inisiasi menyusu dini (IMD) dalam 1 jam pertama kelahiran bayiImunisasi Hepatitis B', '2025-06-19 10:51:01', '2025-06-19 10:51:01'),
(96, '7404195810100002', '14/03/2021', '14:00', '44 mg', 'Bidan', 'Persalinan Pervaginam', 'Sehat', '1', '3', '48', '34', 'Laki-Laki', 'Segera menangis', 'Inisiasi menyusu dini (IMD) dalam 1 jam pertama kelahiran bayiImunisasi Hepatitis B', '2025-06-19 10:52:58', '2025-06-19 10:52:58'),
(97, '7404194302092002', '04/03/2021', '07:00', '43 mg', 'Bidan', 'Persalinan Pervaginam', 'Sehat', '1', '3.1', '50', '34', 'Perempuan', 'Segera menangis', 'Inisiasi menyusu dini (IMD) dalam 1 jam pertama kelahiran bayiImunisasi Hepatitis B', '2025-06-19 10:55:21', '2025-06-19 10:55:21'),
(100, '7404195301090002', '02/01/2021', '18:30', '43 mg', 'Bidan', 'Persalinan Pervaginam', 'Sehat', '1', '2.9', '48.5', '33', 'Perempuan', 'Segera menangis', '', '2025-06-19 10:07:09', '2025-06-19 11:07:09'),
(101, '7404195508980001', '25/11/2020', '21:00', '44 mg', 'Bidan', 'Persalinan Pervaginam', 'Sehat', '1', '3', '49', '34', 'Perempuan', 'Segera menangis', 'Inisiasi menyusu dini (IMD) dalam 1 jam pertama kelahiran bayiImunisasi Hepatitis B', '2025-06-19 11:08:09', '2025-06-19 11:08:09'),
(102, '7404194301860003', '08/11/2020', '09:00', '44 mg', 'Bidan', 'Persalinan Pervaginam', 'Sehat', '1', '3', '50', '34', 'Laki-Laki', 'Segera menangis', '', '2025-06-19 10:10:13', '2025-06-19 11:10:13'),
(103, '7404194301860003', '15/11/2022', '14:00', '44 mg', 'Bidan', 'Persalinan Pervaginam', 'Sehat', '2', '3.2', '51', '34', 'Laki-Laki', 'Segera menangis', 'Inisiasi menyusu dini (IMD) dalam 1 jam pertama kelahiran bayiImunisasi Hepatitis B', '2025-06-19 11:11:03', '2025-06-19 11:11:03'),
(104, '7404196603020002', '16/10/2020', '01:00', '44 mg', 'Bidan', 'Persalinan Pervaginam', 'Sehat', '1', '3', '49', '34', 'Perempuan', 'Segera menangis', 'Inisiasi menyusu dini (IMD) dalam 1 jam pertama kelahiran bayiImunisasi Hepatitis B', '2025-06-19 11:12:31', '2025-06-19 11:12:31'),
(105, '7404197112980002', '19/09/2020', '11:00', '44 mg', 'Bidan', 'Persalinan Pervaginam', 'Sehat', '1', '3', '49', '34', 'Laki-Laki', 'Segera menangis', 'Inisiasi menyusu dini (IMD) dalam 1 jam pertama kelahiran bayiImunisasi Hepatitis B', '2025-06-19 11:13:48', '2025-06-19 11:13:48'),
(106, '7404197112980002', '20/01/2024', '21:30', '44 mg', 'Bidan', 'Persalinan Pervaginam', 'Sehat', '2', '3.3', '50', '34', 'Laki-Laki', 'Segera menangis', 'Inisiasi menyusu dini (IMD) dalam 1 jam pertama kelahiran bayiImunisasi Hepatitis B', '2025-06-19 11:15:09', '2025-06-19 11:15:09');

-- --------------------------------------------------------

--
-- Table structure for table `tabel_kesehatan_ibu_hamil`
--

CREATE TABLE `tabel_kesehatan_ibu_hamil` (
  `id` int NOT NULL,
  `nik_ibu` varchar(16) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `kehamilan_ke` varchar(5) COLLATE utf8mb4_general_ci NOT NULL,
  `hari_pertama_haid_terakhir` varchar(30) COLLATE utf8mb4_general_ci NOT NULL,
  `hari_taksiran_persalinan` varchar(30) COLLATE utf8mb4_general_ci NOT NULL,
  `golongan_darah` varchar(5) COLLATE utf8mb4_general_ci NOT NULL,
  `penggunaan_kontrasepsi_sebelum_hamil` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `riwayat_penyakit_yg_di_derita_ibu` varchar(30) COLLATE utf8mb4_general_ci NOT NULL,
  `riwayat_alergi` varchar(30) COLLATE utf8mb4_general_ci NOT NULL,
  `status_imunisasi_tetanus_terakhir` varchar(30) COLLATE utf8mb4_general_ci NOT NULL,
  `tinggi_badan` varchar(10) COLLATE utf8mb4_general_ci NOT NULL,
  `status_kehamilan` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `created_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `updated_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tabel_kesehatan_ibu_hamil`
--

INSERT INTO `tabel_kesehatan_ibu_hamil` (`id`, `nik_ibu`, `kehamilan_ke`, `hari_pertama_haid_terakhir`, `hari_taksiran_persalinan`, `golongan_darah`, `penggunaan_kontrasepsi_sebelum_hamil`, `riwayat_penyakit_yg_di_derita_ibu`, `riwayat_alergi`, `status_imunisasi_tetanus_terakhir`, `tinggi_badan`, `status_kehamilan`, `created_at`, `updated_at`) VALUES
(34, '7404101804930002', '1', '22 Oktober 2019', '29 Juli 2020', 'B', 'Kondom', 'Tidak Ada', 'Tidak Ada', 'TT5', '1', 'Berakhir', '2025-07-08 19:14:06', '2025-07-08 20:14:06'),
(40, '7415074408020002', '1', '30 Mei 2024', '1 Maret 2025', 'O', 'Suntik KB 3 Bulan', 'Tidak Ada', 'Tidak Ada', 'TT5', '160', 'Berakhir', '2025-05-26 15:30:34', '2025-05-26 16:30:34'),
(41, '7415074408020002', '2', '04/05/2025', '02/06/2025', 'B', 'Pil KB', 'Diabetes', 'Asma', 'T1', '160', '', '2025-05-04 12:57:38', '2025-05-04 13:57:38'),
(48, '7404195111980001', '1', '17/01/2021', '24/10/2022', 'B', 'Kondom', 'Kehamilan Ektopik', 'Tidak Ada', 'TT5', '1', 'Berakhir', '2025-05-24 04:52:41', '2025-05-24 05:52:41'),
(49, '7404195111980001', '2', '20/03/2023', '27/12/2023', 'B', 'Kondom', 'Kehamilan Ektopik', 'Tidak Ada', 'TT5', '1', 'Berakhir', '2025-05-24 04:59:19', '2025-05-24 05:59:19'),
(51, '740419410400002', '1', '12/04/2021', '19/01/2022', 'A', 'Kondom', 'Tidak Ada', 'Tidak Ada', 'TT2', '1', 'Berakhir', '2025-06-17 15:57:07', '2025-06-17 16:57:07'),
(52, '740419440408001', '1', '16/05/2024', '22/02/2025', 'AB', 'Kondom', 'Tidak Ada', 'Tidak Ada', 'TT5', '1', 'Berakhir', '2025-05-24 05:49:08', '2025-05-24 06:49:08'),
(53, '740419510990001', '1', '18/07/2020', '25/04/2021', 'AB', 'Kondom', 'Tidak Ada', 'Tidak Ada', 'TT5', '1', 'Berakhir', '2025-05-24 05:48:31', '2025-05-24 06:48:31'),
(54, '740419540799001', '1', '21/07/2020', '28/04/2021', 'A', 'Kondom', 'Kehamilan Ektopik', 'Tidak Ada', 'TT5', '160', 'Berakhir', '2025-05-26 15:27:38', '2025-05-26 16:27:38'),
(55, '7404195507970001', '1', '07/09/2021', '14/06/2022', 'B', 'Kondom', 'Tidak Ada', 'Tidak Ada', 'TT5', '163', 'Berakhir', '2025-05-26 15:51:24', '2025-05-26 16:51:24'),
(56, '7404194107880002', '1', '20/08/2021', '27/05/2022', 'A', 'Kondom', 'Kehamilan Ektopik', 'Tidak Ada', 'TT5', '159', 'Sedang Berlangsung', '2025-05-26 15:56:29', '2025-05-26 16:56:29'),
(57, '7404194107880002', '2', '20/08/2021', '27/05/2022', 'A', 'Kondom', 'Kehamilan Ektopik', 'Tidak Ada', 'TT5', '159', 'Sedang Berlangsung', '2025-05-26 15:56:13', '2025-05-26 16:56:13'),
(58, '7404194107880002', '3', '20/04/2024', '27/01/2025', 'A', 'Suntik KB 3 Bulan', 'Tidak Ada', 'Tidak Ada', 'TT5', '159', 'Sedang Berlangsung', '2025-05-26 17:01:45', '2025-05-26 17:01:45'),
(59, '7404194512920002', '1', '10/11/2019', '17/08/2020', 'B', 'Kondom', 'Tidak Ada', 'Tidak Ada', 'TT5', '165', 'Sedang Berlangsung', '2025-05-26 17:07:29', '2025-05-26 17:07:29'),
(60, '7404194512920002', '2', '23/02/2024', '27/11/2024', 'B', 'Pil KB', 'Tidak Ada', 'Tidak Ada', 'TT5', '165', 'Sedang Berlangsung', '2025-05-26 17:09:07', '2025-05-26 17:09:07'),
(61, '7404194107860225', '1', '20/01/2022', '27/08/2023', 'B', 'Kondom', 'Kehamilan Ektopik', 'Tidak Ada', 'TT5', '162', 'Berakhir', '2025-05-27 13:52:05', '2025-05-27 14:52:05'),
(62, '7404195221203000', '1', '20/05/2021', '27/02/2022', 'B', 'Kondom', 'Tidak Ada', 'Tidak Ada', 'TT5', '160', 'Sedang Berlangsung', '2025-05-27 08:02:31', '2025-05-27 08:02:31'),
(63, '7404195221203000', '2', '12/09/2023', '21/06/2024', 'B', 'Kondom', 'Tidak Ada', 'Tidak Ada', 'TT5', '160', 'Sedang Berlangsung', '2025-05-27 08:04:17', '2025-05-27 08:04:17'),
(64, '7404419562596000', '2', '01/05/2022', '07/02/2023', 'O', 'Kondom', 'Kehamilan Ektopik', 'Tidak Ada', '-Pilih-', '163', 'Berakhir', '2025-05-27 13:14:33', '2025-05-27 14:14:33'),
(65, '7404419500298000', '1', '18/07/2020', '25/04/2021', 'A', 'Kondom', 'Tidak Ada', 'Tidak Ada', 'TT5', '165', 'Sedang Berlangsung', '2025-05-27 08:09:00', '2025-05-27 08:09:00'),
(66, '7404194128880001', '1', '10/06/2022', '17/03/2023', 'AB', 'Kondom', 'Tidak Ada', 'Tidak Ada', 'TT5', '160', 'Sedang Berlangsung', '2025-05-27 08:10:16', '2025-05-27 08:10:16'),
(67, '7404194504910001', '1', '14/10/2021', '21/07/2022', 'A', 'Kondom', 'Tidak Ada', 'Tidak Ada', 'TT5', '159', 'Sedang Berlangsung', '2025-05-27 08:11:32', '2025-05-27 08:11:32'),
(68, '9171010510820002', '1', '01/03/2022', '07/05/2022', 'A', 'Kondom', 'Tidak Ada', 'Tidak Ada', 'TT5', '158', 'Sedang Berlangsung', '2025-05-27 09:07:54', '2025-05-27 09:07:54'),
(70, '7404194507920002', '1', '03/03/2022', '09/12/2022', 'AB', 'Kondom', 'Tidak Ada', 'Tidak Ada', '-Pilih-', '161', 'Sedang Berlangsung', '2025-05-27 09:09:00', '2025-05-27 09:09:00'),
(71, '9207015511980001', '1', '17/11/2021', '25/08/2022', 'O', 'Kondom', 'Tidak Ada', 'Tidak Ada', 'TT5', '160', 'Sedang Berlangsung', '2025-05-27 09:10:20', '2025-05-27 09:10:20'),
(72, '7404194108000002', '1', '10/02/2023', '17/11/2023', 'AB', 'Kondom', 'Tidak Ada', 'Tidak Ada', 'TT5', '168', 'Sedang Berlangsung', '2025-05-27 09:11:22', '2025-05-27 09:11:22'),
(73, '7404204509930001', '1', '12/11/2022', '19/08/2023', 'O', 'Kondom', 'Tidak Ada', 'Tidak Ada', 'TT5', '157', 'Sedang Berlangsung', '2025-05-27 09:12:41', '2025-05-27 09:12:41'),
(74, '7404197889300002', '1', '03/08/2022', '10/05/2023', 'B', 'Pil KB', 'Tidak Ada', 'Tidak Ada', 'TT5', '162', 'Sedang Berlangsung', '2025-05-27 09:13:55', '2025-05-27 09:13:55'),
(75, '7404195717980002', '1', '09/10/2023', '16/07/2024', 'A', 'Suntik KB 3 Bulan', 'Tidak Ada', 'Tidak Ada', 'TT5', '159', 'Sedang Berlangsung', '2025-05-27 09:15:22', '2025-05-27 09:15:22'),
(76, '7404194140791000', '1', '20/12/2023', '27/09/2024', 'B', 'Kondom', 'Tidak Ada', 'Tidak Ada', 'TT5', '157', 'Sedang Berlangsung', '2025-05-27 09:16:33', '2025-05-27 09:16:33'),
(77, '7404194801030001', '1', '11/05/2023', '18/02/2024', 'B', 'Kondom', 'Kehamilan Ektopik', 'Tidak Ada', 'TT5', '157', 'Sedang Berlangsung', '2025-05-27 08:18:11', '2025-05-27 09:18:11'),
(78, '9271015502930005', '1', '21/03/2023', '28/12/2023', 'O', 'Kondom', 'Tidak Ada', 'Tidak Ada', 'TT5', '160', 'Sedang Berlangsung', '2025-05-27 09:19:27', '2025-05-27 09:19:27'),
(79, '7404195008970001', '1', '15/06/2021', 'B22/03/2022', 'B', 'Kondom', 'Tidak Ada', 'Tidak Ada', 'TT5', '162', 'Sedang Berlangsung', '2025-05-27 09:20:35', '2025-05-27 09:20:35'),
(80, '7404195130595000', '1', '05/04/2024', '13/01/2025', 'O', 'Kondom', 'Tidak Ada', 'Tidak Ada', 'TT5', '161', 'Sedang Berlangsung', '2025-05-27 09:22:00', '2025-05-27 09:22:00'),
(81, '7404194810010001', '1', '08/07/2020', '15/04/2021', 'AB', 'Kondom', 'Tidak Ada', 'Tidak Ada', 'TT5', '158', 'Sedang Berlangsung', '2025-05-27 10:15:59', '2025-05-27 10:15:59'),
(82, '740419671299001', '1', '07/02/2020', '14/11/2021', 'AB', 'Kondom', 'Tidak Ada', 'Tidak Ada', 'TT5', '161', 'Sedang Berlangsung', '2025-05-27 10:18:01', '2025-05-27 10:18:01'),
(83, '7404196612010001', '1', '16/12/2020', '14/06/2021', 'B', 'Kondom', 'Tidak Ada', 'Tidak Ada', 'TT5', '167', 'Sedang Berlangsung', '2025-05-27 10:19:42', '2025-05-27 10:19:42'),
(84, '7404195150799000', '1', '15/05/2024', '22/02/2025', 'AB', 'Kondom', 'Tidak Ada', 'Tidak Ada', 'TT5', '165', 'Sedang Berlangsung', '2025-05-27 10:21:25', '2025-05-27 10:21:25'),
(85, '7404066403000001', '1', '05/08/2023', '12/05/2024', 'A', 'Kondom', 'Tidak Ada', 'Tidak Ada', 'TT5', '170', 'Sedang Berlangsung', '2025-05-27 10:22:32', '2025-05-27 10:22:32'),
(86, '7404195120100001', '1', '20/06/2023', '27/03/2024', 'AB', 'Pil KB', 'Tidak Ada', 'Tidak Ada', 'TT5', '165', 'Berakhir', '2025-06-02 03:20:04', '2025-06-02 04:20:04'),
(87, '7404192112060002', '1', '20/06/2022', '27/03/2023', 'B', 'Pil KB', 'Tidak Ada', 'Tidak Ada', 'TT5', '156', 'Sedang Berlangsung', '2025-05-27 10:25:27', '2025-05-27 10:25:27'),
(88, '7404194507020001', '4', '20/10/2021', '27/07/2022', 'B', 'Pil KB', 'Tidak Ada', 'Tidak Ada', 'TT5', '158', 'Berakhir', '2025-06-19 10:31:10', '2025-06-19 11:31:10'),
(90, '7404194109980001', '1', '23/08/2023', '30/05/2024', 'B', 'Tidak Ada', 'Tidak Ada', 'Tidak Ada', 'TT2', '1', 'Berakhir', '2025-06-12 15:17:53', '2025-06-12 16:17:53'),
(91, '9115044403520001', '1', '25/10/2021', '01/08/2022', 'B', 'Pil KB', 'Tidak Ada', 'Tidak Ada', 'TT5', '161', 'Berakhir', '2025-05-27 13:14:48', '2025-05-27 14:14:48'),
(92, '7404195508980001', '1', '17/02/2020', '26/11/2020', 'B', 'Kondom', 'Tidak Ada', 'Tidak Ada', 'TT5', '158', 'Sedang Berlangsung', '2025-05-27 13:58:00', '2025-05-27 13:58:00'),
(93, '7404195301090002', '1', '24/04/2020', '04/01/2021', 'AB', 'Pil KB', 'Tidak Ada', 'Tidak Ada', 'TT5', '158', 'Sedang Berlangsung', '2025-05-27 13:59:07', '2025-05-27 13:59:07'),
(94, '7404194302092002', '1', '30/06/2020', '07/03/2021', 'AB', 'Pil KB', 'Tidak Ada', 'Tidak Ada', 'TT5', '160', 'Sedang Berlangsung', '2025-05-27 14:00:16', '2025-05-27 14:00:16'),
(95, '7404196406890001', '1', '08/10/2019', '17/04/2020', 'A', '-Pilih-', 'Tidak Ada', 'Tidak Ada', 'TT5', '158', 'Sedang Berlangsung', '2025-05-27 14:02:17', '2025-05-27 14:02:17'),
(96, '7404196406890001', '2', '28/01/2022', '07/11/2022', 'A', 'Pil KB', 'Tidak Ada', 'Tidak Ada', 'TT5', '158', 'Sedang Berlangsung', '2025-05-27 14:03:06', '2025-05-27 14:03:06'),
(97, '917101560791004', '1', '25/08/2019', '04/06/2020', 'O', 'Pil KB', 'Tidak Ada', 'Tidak Ada', 'TT5', '156', 'Sedang Berlangsung', '2025-05-27 14:04:38', '2025-05-27 14:04:38'),
(98, '917101560791004', '2', '26/06/2024', '02/04/2025', 'O', 'Pil KB', 'Tidak Ada', 'Tidak Ada', 'TT5', '156', 'Sedang Berlangsung', '2025-05-27 14:05:53', '2025-05-27 14:05:53'),
(99, '7404197151298000', '1', '17/10/2019', '24/07/2020', 'A', 'Pil KB', 'Tidak Ada', 'Tidak Ada', 'TT5', '161', 'Sedang Berlangsung', '2025-05-27 14:07:08', '2025-05-27 14:07:08'),
(100, '7404195810100002', '1', '09/06/2020', '16/03/2021', 'AB', 'Suntik KB 3 Bulan', 'Tidak Ada', 'Tidak Ada', 'TT5', '160', 'Sedang Berlangsung', '2025-05-27 14:08:06', '2025-05-27 14:08:06'),
(101, '740419670440002', '1', '22/06/2023', '29/03/2024', 'B', 'Pil KB', 'Tidak Ada', 'Tidak Ada', 'TT5', '144', 'Sedang Berlangsung', '2025-05-27 14:09:32', '2025-05-27 14:09:32'),
(102, '7404196603020002', '1', '12/01/2019', '21/10/2020', 'B', 'Pil KB', 'Tidak Ada', 'Tidak Ada', 'TT5', '158', 'Sedang Berlangsung', '2025-05-27 14:10:31', '2025-05-27 14:10:31'),
(103, '7404194107980002', '1', '24/06/2021', '31/03/2022', 'B', 'Pil KB', 'Kehamilan Ektopik', 'Tidak Ada', 'TT5', '165', 'Berakhir', '2025-05-27 13:14:03', '2025-05-27 14:14:03'),
(104, '7404194107980002', '2', '07/07/2024', '07/07/2025', 'AB', 'Pil KB', 'Tidak Ada', 'Tidak Ada', 'TT5', '165', 'Sedang Berlangsung', '2025-05-27 14:12:42', '2025-05-27 14:12:42'),
(105, '7404195230497000', '1', '01/12/2023', '07/09/2024', 'AB', 'Pil KB', 'Kehamilan Ektopik', 'Tidak Ada', 'TT5', '156', 'Sedang Berlangsung', '2025-05-27 13:21:49', '2025-05-27 14:21:49'),
(106, '7404194301860003', '1', '06/02/2020', '12/11/2020', 'B', 'Pil KB', 'Tidak Ada', 'Tidak Ada', 'TT5', '158', 'Sedang Berlangsung', '2025-05-27 14:20:16', '2025-05-27 14:20:16'),
(107, '7404194301860003', '2', '11/02/2022', '18/11/2022', 'B', 'Pil KB', 'Kehamilan Ektopik', 'Tidak Ada', 'TT5', '158', 'Sedang Berlangsung', '2025-05-27 13:21:32', '2025-05-27 14:21:32'),
(108, '7404197112980002', '1', '16/12/2019', '23/09/2020', 'B', 'Pil KB', 'Tidak Ada', 'Tidak Ada', 'TT5', '158', 'Sedang Berlangsung', '2025-05-27 14:23:14', '2025-05-27 14:23:14');

-- --------------------------------------------------------

--
-- Table structure for table `tabel_kesehatan_ibu_nifas`
--

CREATE TABLE `tabel_kesehatan_ibu_nifas` (
  `id` int NOT NULL,
  `nik_ibu` varchar(16) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `nama_anak` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `nifas_ke` varchar(5) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `status_nifas` varchar(20) COLLATE utf8mb4_general_ci NOT NULL,
  `tanggal_kunjungan_1` varchar(20) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `tanggal_kunjungan_2` varchar(20) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `tanggal_kunjungan_3` varchar(20) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `kondisi_ibu_secara_umum_1` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `kondisi_ibu_secara_umum_2` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `kondisi_ibu_secara_umum_3` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `tekanan_darah_1` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `tekanan_darah_2` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `tekanan_darah_3` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `pendarahan_pervaginam_1` varchar(30) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `pendarahan_pervaginam_2` varchar(30) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `pendarahan_pervaginam_3` varchar(30) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `kondisi_perineum_1` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `kondisi_perineum_2` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `kondisi_perineum_3` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `tanda_infeksi_1` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `tanda_infeksi_2` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `tanda_infeksi_3` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `kontraksi_uteri_1` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `kontraksi_uteri_2` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `kontraksi_uteri_3` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `tinggi_fundus_uteri_1` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `tinggi_fundus_uteri_2` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `tinggi_fundus_uteri_3` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `lokhia_1` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `lokhia_2` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `lokhia_3` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `pemeriksaan_jalan_lahir_1` varchar(5) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `pemeriksaan_jalan_lahir_2` varchar(5) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `pemeriksaan_jalan_lahir_3` varchar(5) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `pemeriksaan_payudara_1` varchar(5) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `pemeriksaan_payudara_2` varchar(5) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `pemeriksaan_payudara_3` varchar(5) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `produksi_asi_1` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `produksi_asi_2` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `produksi_asi_3` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `pemberian_kapsul_vitamin_a_1` varchar(5) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `pemberian_kapsul_vitamin_a_2` varchar(5) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `pemberian_kapsul_vitamin_a_3` varchar(5) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `pelayanan_kontrasepsi_1` varchar(5) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `pelayanan_kontrasepsi_2` varchar(5) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `pelayanan_kontrasepsi_3` varchar(5) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `penanganan_resiko_tinggi_1` varchar(30) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `penanganan_resiko_tinggi_2` varchar(30) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `penanganan_resiko_tinggi_3` varchar(30) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `buang_air_besar_1` varchar(5) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `buang_air_besar_2` varchar(5) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `buang_air_besar_3` varchar(5) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `buang_air_kecil_1` varchar(5) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `buang_air_kecil_2` varchar(5) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `buang_air_kecil_3` varchar(5) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `catatan_dokter_1` text COLLATE utf8mb4_general_ci,
  `catatan_dokter_2` text COLLATE utf8mb4_general_ci,
  `catatan_dokter_3` text COLLATE utf8mb4_general_ci,
  `keadaan_ibu` text COLLATE utf8mb4_general_ci,
  `komplikasi_nifas` text COLLATE utf8mb4_general_ci,
  `keadaan_bayi` text COLLATE utf8mb4_general_ci,
  `created_at` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `updated_at` timestamp NULL DEFAULT CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tabel_kesehatan_ibu_nifas`
--

INSERT INTO `tabel_kesehatan_ibu_nifas` (`id`, `nik_ibu`, `nama_anak`, `nifas_ke`, `status_nifas`, `tanggal_kunjungan_1`, `tanggal_kunjungan_2`, `tanggal_kunjungan_3`, `kondisi_ibu_secara_umum_1`, `kondisi_ibu_secara_umum_2`, `kondisi_ibu_secara_umum_3`, `tekanan_darah_1`, `tekanan_darah_2`, `tekanan_darah_3`, `pendarahan_pervaginam_1`, `pendarahan_pervaginam_2`, `pendarahan_pervaginam_3`, `kondisi_perineum_1`, `kondisi_perineum_2`, `kondisi_perineum_3`, `tanda_infeksi_1`, `tanda_infeksi_2`, `tanda_infeksi_3`, `kontraksi_uteri_1`, `kontraksi_uteri_2`, `kontraksi_uteri_3`, `tinggi_fundus_uteri_1`, `tinggi_fundus_uteri_2`, `tinggi_fundus_uteri_3`, `lokhia_1`, `lokhia_2`, `lokhia_3`, `pemeriksaan_jalan_lahir_1`, `pemeriksaan_jalan_lahir_2`, `pemeriksaan_jalan_lahir_3`, `pemeriksaan_payudara_1`, `pemeriksaan_payudara_2`, `pemeriksaan_payudara_3`, `produksi_asi_1`, `produksi_asi_2`, `produksi_asi_3`, `pemberian_kapsul_vitamin_a_1`, `pemberian_kapsul_vitamin_a_2`, `pemberian_kapsul_vitamin_a_3`, `pelayanan_kontrasepsi_1`, `pelayanan_kontrasepsi_2`, `pelayanan_kontrasepsi_3`, `penanganan_resiko_tinggi_1`, `penanganan_resiko_tinggi_2`, `penanganan_resiko_tinggi_3`, `buang_air_besar_1`, `buang_air_besar_2`, `buang_air_besar_3`, `buang_air_kecil_1`, `buang_air_kecil_2`, `buang_air_kecil_3`, `catatan_dokter_1`, `catatan_dokter_2`, `catatan_dokter_3`, `keadaan_ibu`, `komplikasi_nifas`, `keadaan_bayi`, `created_at`, `updated_at`) VALUES
(66, '7404101804930002', 'Wa Ode Keisha Azura Zilvania', '1', 'Sedang Berlangsung', '11-11-2020', '01-01-1970', '08-12-2020', 'Baik', 'Baik', 'Baik', '120/80, 37', '120/70, 37', '130/50, 37', 'Normal', 'Normal', 'Normal', 'dbn', 'dbn', 'dbn', 'TAK', 'TAK', 'TAK', 'Kuat', 'Baik', 'Keras', '3 jr -> ps+', '2.5 jr -> ps+', '2 jr -> ps+', 'Merah', 'Merah', 'Merah', 'Iya', 'Iya', 'Iya', 'Iya', 'Iya', 'Iya', 'Sedik', 'Banya', 'Banya', 'Iya', 'Iya', 'Iya', '-', '-', '-', '-', '-', '-', 'Ya', 'Ya', 'Ya', 'Ya', 'Ya', 'Yay', 'Perbanyak makan sayur dan istirahat yang cukup', 'Perbanyak makan sayur dan minum air putih, serta istirahat yang cukup', 'Perbanyak makan sayur dan minum air putih, serta istirahat yang cukup', 'Sehat', 'Tidak Ada', 'Sehat', '2025-05-20 08:59:20', '2025-05-10 03:44:19'),
(67, '7404101804930002', 'Wa Ode Keisha Azura Zilvania', '12', 'Sedang Berlangsung', NULL, NULL, NULL, '1', '1', '1', '-1', '1', '-', '-1', '1', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', NULL, NULL, NULL, '2025-07-08 19:20:19', '2025-05-10 05:12:54'),
(68, '7404101804930002', 'Wa Ode Keisha Azura Zilvania', '14', 'Sedang Berlangsung', '10-05-2025', '01-01-1970', '01-01-1970', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2025-05-10 05:13:36', '2025-05-10 05:13:36'),
(71, '7404101804930002', 'Wa Ode Keisha Azura Zilvania', '1', 'Sedang Berlangsung', '11-11-2020', '01-01-1970', '08-12-2020', 'Baik', 'Baik', 'Baik', '120/80, 37', '120/70, 37', '130/50, 37', 'Normal', 'Normal', 'Normal', 'dbn', 'dbn', 'dbn', 'TAK', 'TAK', 'TAK', 'Kuat', 'Baik', 'Keras', '3 jr -> ps+', '2.5 jr -> ps+', '2 jr -> ps+', 'Merah', 'Merah', 'Merah', 'Iya', 'Iya', 'Iya', 'Iya', 'Iya', 'Iya', 'Sedik', 'Banya', 'Banya', 'Iya', 'Iya', 'Iya', '-', '-', '-', '-', '-', '-', 'Ya', 'Ya', 'Ya', 'Ya', 'Ya', 'Yay', 'Perbanyak makan sayur dan istirahat yang cukup', 'Perbanyak makan sayur dan minum air putih, serta istirahat yang cukup', 'Perbanyak makan sayur dan minum air putih, serta istirahat yang cukup', 'Sehat', 'Tidak Ada', 'Sehat', '2025-05-20 08:59:20', '2025-05-19 17:21:54'),
(73, '7415074408020002', 'Nadifa', NULL, 'Sedang Berlangsung', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '-Pilih-', '-Pilih-', '-Pilih-', '2025-05-19 17:29:02', '2025-05-19 17:29:02'),
(74, '7415074408020002', 'Nadifa', NULL, 'Sedang Berlangsung', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '-Pilih-', '-Pilih-', '-Pilih-', '2025-05-19 17:44:30', '2025-05-19 17:44:30'),
(75, '7404101804930002', 'Wa Ode Keisha Azura Zilvania', '1', 'Sedang Berlangsung', '11-11-2020', '01-01-1970', '08-12-2020', 'Baik', 'Baik', 'Baik', '120/80, 37', '120/70, 37', '130/50, 37', 'Normal', 'Normal', 'Normal', 'dbn', 'dbn', 'dbn', 'TAK', 'TAK', 'TAK', 'Kuat', 'Baik', 'Keras', '3 jr -> ps+', '2.5 jr -> ps+', '2 jr -> ps+', 'Merah', 'Merah', 'Merah', 'Iya', 'Iya', 'Iya', 'Iya', 'Iya', 'Iya', 'Sedik', 'Banya', 'Banya', 'Iya', 'Iya', 'Iya', '-', '-', '-', '-', '-', '-', 'Ya', 'Ya', 'Ya', 'Ya', 'Ya', 'Yay', 'Perbanyak makan sayur dan istirahat yang cukup', 'Perbanyak makan sayur dan minum air putih, serta istirahat yang cukup', 'Perbanyak makan sayur dan minum air putih, serta istirahat yang cukup', 'Sehat', 'Tidak Ada', 'Sehat', '2025-05-20 08:59:20', '2025-05-19 17:21:54'),
(76, '7404101804930002', 'Wa Ode Keisha Azura Zilvania', '1', 'Sedang Berlangsung', '11-11-2020', '01-01-1970', '08-12-2020', 'Baik', 'Baik', 'Baik', '120/80, 37', '120/70, 37', '130/50, 37', 'Normal', 'Normal', 'Normal', 'dbn', 'dbn', 'dbn', 'TAK', 'TAK', 'TAK', 'Kuat', 'Baik', 'Keras', '3 jr -> ps+', '2.5 jr -> ps+', '2 jr -> ps+', 'Merah', 'Merah', 'Merah', 'Iya', 'Iya', 'Iya', 'Iya', 'Iya', 'Iya', 'Sedik', 'Banya', 'Banya', 'Iya', 'Iya', 'Iya', '-', '-', '-', '-', '-', '-', 'Ya', 'Ya', 'Ya', 'Ya', 'Ya', 'Yay', 'Perbanyak makan sayur dan istirahat yang cukup', 'Perbanyak makan sayur dan minum air putih, serta istirahat yang cukup', 'Perbanyak makan sayur dan minum air putih, serta istirahat yang cukup', 'Sehat', 'Tidak Ada', 'Sehat', '2025-05-20 08:59:20', '2025-05-19 17:21:54'),
(77, '7404101804930002', '--Pilih Nama Anak--', '1', 'Sedang Berlangsung', '20-05-2025', '21-05-2025', '22-05-2025', '1', 'j', 'j', 'j', 'j', 'j', 'j', 'j', 'j', 'j', 'j', 'j', 'j', 'j', 'j', 'j', 'j', 'j', 'j', 'j', 'j', 'j', 'j', 'j', 'j', 'j', 'j', 'j', 'j', 'j', 'j', 'j', 'j', 'j', 'j', 'j', 'j', 'j', 'j', 'j', 'j', 'j', 'j', 'j', 'j', 'j', 'j', 'j', NULL, NULL, NULL, NULL, NULL, NULL, '2025-05-20 10:03:06', '2025-05-20 10:03:06'),
(78, '740419410400002', 'Muh. Rafa', '1', 'Berakhir', '2022-01-25', '2022-02-15', '2025-06-02', 'Normal', 'Normal', 'J', '120/80', '100/90', 'J', 'Normal', 'Normal', 'HH', 'dbn', 'dbn', NULL, 'TAK', 'TAK', NULL, 'Kuat', 'Baik', NULL, '2 1/2 jr -> pst', '2 jr -> pst', NULL, 'Merah', 'Merah', NULL, 'Iya', 'Iya', NULL, 'Iya', 'Iya', NULL, 'Sedik', 'Banya', NULL, 'Iya', 'Iya', NULL, '-', '-', NULL, '-', '-', NULL, 'Ya', 'Ya', NULL, 'Ya', 'Ya', NULL, '-', '-', '-', 'Sehat', 'Tidak Ada', 'Sehat', '2025-06-02 03:44:46', '2025-05-24 05:19:26'),
(79, '740419440408001', 'By. Ny.Salma', '1', 'Sedang Berlangsung', '2025-03-23', '2025-03-29', NULL, 'Baik', 'Baik', '-', '90/100, 36', '90/100, 36', '-', 'YA', 'YA', '-', 'dbn', 'dbn', '-', 'TAK', 'TAK', '-', 'Kuat', 'Keras', '-', '2 1/2 jr -> pst', '1 1/2 jr -> pst', '-', 'Merah', 'Merah', '-', 'IYA', 'IYA', '-', 'IYA', 'IYA', '-', 'Sedik', 'Banya', '-', 'YA', 'YA', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', 'YA', 'YA', '-', 'Istirahat yang cukup', '-', '-', 'Sehat', 'Tidak Ada', 'Sehat', '2025-07-09 20:53:12', '2025-05-27 08:57:34'),
(80, '740419510990001', 'Tian Anugrah', '1', 'Sedang Berlangsung', '2021-04-27', '2021-05-17', NULL, 'Normal', 'Normal', NULL, '100/90, 36', '110/90, 38', NULL, 'Normal', 'Normal', NULL, 'dbn', 'dbn', NULL, 'TAK', 'TAK', NULL, 'Keras', 'Baik', NULL, '2 1/2 jr -> pst', '1 1/2 jr -> pst', NULL, 'Merah', 'Merah', NULL, 'IYA', 'IYA', NULL, 'IYA', 'IYA', NULL, 'Banya', 'Banya', NULL, 'YA', 'YA', NULL, '-', '-', NULL, '-', '-', NULL, 'YA', 'YA', NULL, 'YA', 'YA', NULL, 'Istirahat yang cukup', '-', '-', 'Sehat', 'Tidak Ada', 'Sehat', '2025-07-09 20:54:41', '2025-05-24 06:48:00'),
(81, '740419540799001', 'Amila Anasya', '1', 'Sedang Berlangsung', '2021-04-24', '2021-05-19', NULL, 'Baik', 'Baik', NULL, '120/90, 36', '100/90, 37', NULL, 'Normal', 'Normal', NULL, 'dbn', 'dbn', NULL, 'TAK', 'TAK', NULL, 'Kuat', 'Baik', NULL, '3 jr -> pst', '2 jr -> pst', NULL, 'Merah', 'Merah', NULL, 'IYA', 'IYA', NULL, 'IYA', 'IYA', NULL, 'Sedik', 'Banya', NULL, 'YA', 'YA', NULL, '-', '-', NULL, '-', '-', NULL, 'YA', 'YA', NULL, 'YA', 'YA', NULL, 'Istirahat yang cukup', '-', '-', 'Sehat', 'Tidak Ada', 'Sehat', '2025-07-09 20:56:04', '2025-05-24 06:59:14'),
(82, '7404194109980001', 'Wa Ode Mikaila', '1', 'Sedang Berlangsung', NULL, NULL, NULL, 'Normal', 'Normal', NULL, '110/90, 36', '100/80, 36', NULL, 'dbn', 'dbn', NULL, 'dbn', 'dbn', NULL, 'TAK', 'TAK', NULL, 'Keras', 'Baik', NULL, '2 1/2 jr -> pst', '1 1/2 jr -> pst', NULL, 'Merah', 'Merah', NULL, 'Ya', 'YA', NULL, 'YA', 'YA', NULL, 'sedik', 'Banya', NULL, 'YA', 'YA', NULL, '-', '-', NULL, '-', '-', '-', 'Ya', 'YA', NULL, 'Ya', 'YA', NULL, 'Istirahat yang cukup', 'Makan makanan bergizi dan berserat', NULL, 'Sehat', NULL, 'Sehat', '2025-07-09 15:55:11', '2025-05-27 15:13:39'),
(83, '7404194107860225', 'Muhammad Aska putra', '1', 'Sedang Berlangsung', '27/08/2023', '18/09/2023', NULL, 'Baik', 'Baik', NULL, '100/90, 36', '90/80, 36.', NULL, 'dbn', 'dbn', NULL, 'dbn', 'dbn', NULL, 'TAK', 'TAK', NULL, 'Kuat', 'Keras', NULL, '3 jr -> pst', '2  jr -> pst', NULL, 'Merah', 'merah', NULL, 'YA', 'YA', NULL, 'YA', 'YA', NULL, 'Banya', '-', NULL, 'Ya', 'YA', NULL, '-', '-', NULL, '-', '-', '-', 'YA', 'YA', NULL, 'YA', 'YA', NULL, '-', NULL, NULL, '-Pilih-', '-Pilih-', '-Pilih-', '2025-05-27 15:19:47', '2025-05-27 15:19:47'),
(84, '7404419562596000', 'Ahmad Hanif', '1', 'Sedang Berlangsung', '08/02/2023', '02/03/2023', NULL, 'Baik', 'Baik', NULL, '90/110, 37', '100/90, 36', NULL, 'dbn', 'dbn', NULL, 'dbn', 'dbn', NULL, 'TAK', 'TAK', NULL, 'Keras', 'baik', NULL, '2 1/2 jr -> pst', '1 1/2 jr -> pst', NULL, 'Merah', 'Merah', NULL, 'YA', 'YA', NULL, 'YA', 'Ya', NULL, 'banya', 'Banya', NULL, 'YA', 'Ya', NULL, '-', '-', NULL, '-', '-', '-', 'Ya', 'Ya', NULL, 'Ya', 'YA', NULL, NULL, NULL, NULL, '-Pilih-', '-Pilih-', '-Pilih-', '2025-05-27 15:25:03', '2025-05-27 15:25:03'),
(85, '9115044403520001', 'Wa Ode Kharisma', '1', 'Sedang Berlangsung', '10/08/2022', '02/09/2022', NULL, 'Baik', 'Baik', NULL, '80/100, 36', '100/90, 36', NULL, 'dbn', 'dbn', NULL, 'dbn', 'dbn', NULL, 'TAK', 'TAK', NULL, 'Keras', 'baik', NULL, '2 1/2 jr -> pst', '2 jr -> pst', NULL, 'merah', 'merah', NULL, 'YA', 'YA', NULL, 'YA', 'YA', NULL, 'sedik', 'banya', NULL, 'YA', 'YA', NULL, '-', '-', NULL, '-', '-', '-', 'YA', 'YA', NULL, 'YA', 'YA', NULL, NULL, NULL, NULL, '-Pilih-', '-Pilih-', '-Pilih-', '2025-05-27 15:36:53', '2025-05-27 15:36:53'),
(86, '7404194507020001', 'Qiana safika', '1', 'Sedang Berlangsung', NULL, NULL, NULL, 'Baik', NULL, 'Baik', '100/80, 37', NULL, '110/80, 36', 'dbn', NULL, 'dbn', 'dbn', NULL, 'dbn', 'TAK', NULL, 'TAK', 'Keras', NULL, 'baik', '3 jr -> pst', NULL, '1 jr -> pst', 'merah', NULL, 'merah', 'Ya', NULL, 'Ya', 'Ya', NULL, 'Ya', 'banya', NULL, 'Banya', 'Ya', NULL, 'Ya', '-', NULL, '-', '-', NULL, '-', '-', NULL, 'Ya', 'Ya', NULL, 'YA', 'Istirahat yang cukup', NULL, NULL, 'Sehat', NULL, 'Sehat', '2025-07-09 15:56:15', '2025-05-27 15:43:23'),
(87, '7404192112060002', 'Narendra', '1', 'Sedang Berlangsung', '22/03/2023', '11/04/2023', NULL, 'Baik', 'Baik', NULL, '100/80, 36', '90/100, 36', NULL, 'dbn', 'dbn', NULL, 'dbn', 'dbn', NULL, 'TAK', 'TAK', NULL, 'keras', 'baik', NULL, '2 jr -> pst', '1 1/2 jr -> pst', NULL, 'merah', 'merah', NULL, 'YA', 'Ya', NULL, 'YA', 'Ya', NULL, 'sedik', 'Banya', NULL, 'YA', 'Ya', NULL, '-', '-', NULL, '-', '-', '-', 'Ya', 'Ya', NULL, 'YA', 'Ya', NULL, NULL, NULL, NULL, 'Sehat', 'Tidak Ada', 'Sehat', '2025-05-27 15:48:54', '2025-05-27 15:48:54'),
(88, '7404195120100001', 'Aprillia Ramadani', '1', 'Sedang Berlangsung', '07/04/2023', NULL, '16/05/2023', 'Baik', NULL, 'Baik', '100/90, 36', NULL, '100/80, 37', 'dbn', NULL, 'dbn', 'dbn', NULL, 'dbn', 'TAK', NULL, 'Tak', 'keras', NULL, 'baik', '2 jr -> pst', NULL, '1/2 jr -> pst', 'merah', NULL, 'merah', 'Ya', NULL, 'Ya', 'Y', NULL, 'Ya', 'Sedik', NULL, 'Banya', 'YA', NULL, 'Ya', '-', NULL, '-', '-', NULL, '-', 'Ya', NULL, 'Ya', 'Ya', NULL, 'Ya', NULL, NULL, NULL, 'Sehat', 'Tidak Ada', 'Sehat', '2025-05-27 15:56:31', '2025-05-27 15:56:31'),
(92, '7404101804930002', 'Wa Ode Keisha Azura Zilvania', '1', 'Sedang Berlangsung', '10-07-2025', '01-01-1970', '01-01-1970', '1', NULL, NULL, '1', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2025-07-08 20:30:05', '2025-07-08 20:30:05'),
(93, '7404101804930002', 'Wa Ode Keisha Azura Zilvania', '1', 'Sedang Berlangsung', '10-07-2025', '01-01-1970', '01-01-1970', '1', NULL, NULL, '1', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2025-07-09 11:49:11', '2025-07-09 11:49:11'),
(94, '7404101804930002', 'Wa Ode Keisha Azura Zilvania', '1', 'Sedang Berlangsung', '10-07-2025', '01-01-1970', '01-01-1970', '1', NULL, NULL, '1', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2025-07-09 11:50:08', '2025-07-09 11:50:08'),
(95, '7404066403000001', 'Saflan', '1', 'Sedang Berlangsung', NULL, NULL, NULL, 'Baik', '-', 'Baik', '120/80, 37', '-', '120/90', 'Normal', '-', 'Normal', 'dbn', '-', 'dbn', 'Tak', '-', '-', 'Kuat', '-', 'Keras', '3 jr', '-', '1/2 jr', 'Merah', '-', 'Merah', 'Ya', '-', '-', 'Ya', '-', 'Ya', 'Ya', '-', 'Ya', 'Ya', '-', 'Ya', '-', '-', '-', '-', '-', 'Ya', 'Ya', '-', 'Ya', 'Ya', '-', 'Ya', '-', '-', 'Makan makanan yang berserat', 'Sehat', 'Tidak Ada', 'Sehat', '2025-07-09 19:14:43', '2025-07-09 17:11:34'),
(96, '7404195157990001', 'Shanin Rizkiya', NULL, 'Sedang Berlangsung', NULL, NULL, NULL, 'Baik', 'Baik', 'Baik', '120/90, 37', '120/80, 36', '110/90, 36', 'Normal', 'Normal', 'Normal', 'dbn', 'dbn', 'dbn', 'Tak', 'Tak', 'Tak', 'Kuat', 'Kuat', 'Keras', '2 1/2 jr', '2 jr', '1/2 jr', 'Merah', 'Merah', 'Merah', 'Ya', 'Ya', 'Ya', 'Ya', 'Ya', 'Ya', 'Sedikit', 'Cukup', 'Banyak', 'Ya', 'Ya', NULL, '-', '-', '-', '-', '-', '-', 'Ya', 'Ya', 'Ya', 'Ya', 'Ya', 'Ya', 'Tidak ada', '-', '-', 'Sehat', 'Tidak Ada', 'Sehat', '2025-07-09 19:13:57', '2025-07-09 17:30:53'),
(97, '7404196612010001', 'La Hasan A', NULL, 'Sedang Berlangsung', NULL, NULL, NULL, 'Baik', 'Baik', 'Baik', '130/70', '120/70', '100/90', 'Normal', 'Normal', 'Normal', 'dbn', 'dbn', 'dbn', 'Tak', 'Tak', 'Tak', 'Kuat', 'Keras', 'Baik', '3 jr', '2 jr', '1/2 jr', 'Merah', 'Merah', 'Merah', 'Ya', 'Ya', '-', 'Ya', 'Ya', 'Ya', 'Sedikit', 'Banyak', 'Banyak', 'Ya', 'Ya', 'Ya', '-', '-', '-', '-', '-', '-', '-', 'Ya', 'Ya', 'Ya', 'Ya', 'Ya', 'Istirahat yang cukup', 'Makan makanan bergizi dan berserat', '-', 'Sehat', 'Tidak Ada', 'Sehat', '2025-07-09 19:23:43', '2025-07-09 20:23:29'),
(98, '740419671299001', 'La Ode Zalfin', NULL, 'Sedang Berlangsung', '2021-11-09', '2021-11-14', '2021-12-09', 'Baik', 'Baik', 'Baik', '120/80', '130/70', '120/90', 'Normal', 'Normal', 'Normal', 'dbn', 'dbn', 'dbn', 'Tak', 'Tak', 'Tak', 'Kuat', 'Kuat', 'Baik', '2 1/2 jr', '2 jr', '1 jr', 'Merah', 'Merah', 'Merah', 'Ya', 'Ya', 'Ya', 'Ya', 'Ya', 'Ya', 'Sedikit', 'Sedikit', 'Banyak', 'Ya', 'Ya', 'Ya', '-', '-', 'Ya', '-', '-', '-', '-', 'Ya', 'Ya', 'Ya', 'Ya', 'Ya', '-', '-', '-', 'Sehat', 'Tidak Ada', 'Sehat', '2025-07-09 19:35:37', '2025-07-09 20:30:11'),
(99, '7404194810010001', 'Husniatul Aishwa', NULL, 'Sedang Berlangsung', NULL, NULL, NULL, 'Baik', 'Baik', 'Baik', '130/80', '120/90', '100/90', 'Normal', 'Normal', 'Normal', 'dbn', 'dbn', 'dbn', 'Tak', 'Tak', 'Tak', 'Kuat', 'Keras', 'Baik', '3 jr', '2 jr', '1/2 jr', 'Merah', 'Merah', 'Merah', 'Ya', 'Ya', '-', 'Ya', 'Ya', 'Ya', 'Sedikit', 'Banyak', 'Banyak', 'Ya', 'Ya', 'Ya', '-', '-', 'Ya', '-', '-', '-', '-', 'Ya', 'Ya', 'Ya', 'Ya', 'Ya', 'Istirahat yang cukup', 'Makan makanan yang berserat', '-', 'Sehat', 'Tidak Ada', 'Sehat', '2025-07-09 19:41:57', '2025-07-09 20:40:22'),
(100, '7404195130595000', 'Arshaka Nirendra', '1', 'Sedang Berlangsung', NULL, NULL, NULL, 'Baik', NULL, NULL, '130/80', NULL, NULL, 'Normal', NULL, NULL, 'dbn', NULL, NULL, 'Tak', NULL, NULL, 'Kuat', NULL, NULL, '2 1/2 jr', NULL, NULL, 'Merah', NULL, NULL, 'Ya', NULL, NULL, 'Ya', NULL, NULL, 'Sedikit', NULL, NULL, 'Ya', NULL, NULL, '-', NULL, NULL, '-', NULL, NULL, '-', NULL, NULL, 'Ya', NULL, NULL, 'Istirahat yang cukup', NULL, NULL, 'Sehat', 'Tidak Ada', 'Sehat', '2025-07-09 19:46:28', '2025-07-09 20:46:19'),
(101, '7404195008970001', 'Nur Irfa Mikaira', NULL, 'Sedang Berlangsung', NULL, NULL, NULL, 'Baik', 'Baik', NULL, '120/90', '130/90', NULL, 'Normal', 'Normal', NULL, 'dbn', 'dbn', NULL, 'Tak', 'Tak', NULL, 'Keras', 'Baik', NULL, '2 1/2 jr', '1 jr', NULL, 'Merah', 'Merah', NULL, 'Ya', 'Ya', NULL, 'Ya', 'Ya', NULL, 'Sedikit', 'Banyak', NULL, 'Ya', 'Ya', NULL, '-', NULL, NULL, '-', '-', NULL, '-', 'Ya', NULL, 'Ya', 'Ya', NULL, 'Istirahat yang cukup', NULL, NULL, 'Sehat', 'Tidak Ada', 'Sehat', '2025-07-09 19:54:03', '2025-07-09 20:53:49'),
(102, '7404195008970001', 'Muhammad Nur Firzan', NULL, 'Sedang Berlangsung', '11-07-2024', '08-08-2024', '01-01-1970', 'Baik', 'Baik', NULL, '120/90', '120/80', NULL, 'Normal', 'Normal', NULL, 'dbn', 'dbn', NULL, 'Tak', 'Tak', NULL, 'Keras', 'Baik', NULL, '3 jr', '2 jr', NULL, 'Merah', 'Merah', NULL, 'Ya', 'Ya', NULL, 'Ya', 'Ya', NULL, 'Sedikit', 'Banyak', NULL, 'Ya', 'Ya', NULL, '-', '-', NULL, '-', '-', NULL, '-', 'Ya', NULL, 'Ya', 'Ya', NULL, 'Istirahat yang cukup', 'Makan makanan yang berserat', NULL, NULL, 'Tidak Ada', NULL, '2025-07-09 20:57:51', '2025-07-09 20:57:51'),
(103, '9271015502930005', 'Andi Muhammad Attala', NULL, 'Sedang Berlangsung', '2024-01-01', '2024-01-25', NULL, 'Baik', 'Baik', NULL, '120/89', '110/90', NULL, 'dbn', 'dbn', NULL, 'Normal', 'Normal', NULL, 'dbn', 'dbn', NULL, 'Kuat', 'Baik', NULL, '2 jr', '1/2 jr', NULL, 'Merah', 'Merah', NULL, 'Ya', 'Ya', NULL, 'Ya', 'Ya', NULL, 'Sedikit', 'Banyak', NULL, 'Ya', 'Ya', NULL, '-', '-', NULL, '-', '-', NULL, '-', 'Ya', NULL, 'Ya', 'Ya', NULL, 'Istirahat yang cukup', 'Makan makanan yang berserat', NULL, 'Sehat', 'Tidak Ada', 'Sehat', '2025-07-09 20:07:52', '2025-07-09 21:07:19'),
(104, '7404194801030001', 'Yumira Riskiana Hera', NULL, 'Sedang Berlangsung', '2024-02-14', '2024-03-08', NULL, 'Baik', 'Baik', NULL, '120/90', '100/90', NULL, 'Normal', 'Normal', NULL, 'dbn', 'dbn', NULL, 'Tak', 'Tak', NULL, 'Keras', 'Baik', NULL, '2 1/2 jr', '1 1/2 jr', NULL, 'Merah', 'Merah', NULL, 'Ya', 'Ya', NULL, 'Ya', 'Ya', NULL, 'Sedikit', 'Banyak', NULL, 'Ya', 'Ya', NULL, '-', '-', NULL, '-', '-', NULL, 'Ya', 'Ya', NULL, 'Ya', 'Ya', NULL, 'Istirahat yang cukup', 'Makan makanan yang berserat', NULL, 'Sehat', 'Tidak Ada', 'Sehat', '2025-07-09 20:12:27', '2025-07-09 21:11:52'),
(105, '7404194140791000', '--Pilih Nama Anak--', NULL, 'Sedang Berlangsung', '2024-10-01', '2024-10-24', NULL, 'Baik', 'Baik', NULL, '130/90', '110/90', NULL, 'Normal', 'Normal', NULL, 'dbn', 'dbn', NULL, 'Tak', 'Tak', NULL, 'Keras', 'Baik', NULL, '2 1/2 jr', '1 jr', NULL, 'Merah', 'Merah', NULL, 'Ya', 'Ya', NULL, 'Ya', 'Ya', NULL, 'Banyak', 'Banyak', NULL, 'Ys', 'Ya', NULL, '-', '-', NULL, '-', '-', NULL, 'Ya', 'Ya', NULL, 'Ya', 'Ya', NULL, 'Istirahat yang cukup', NULL, NULL, 'Sehat', 'Tidak Ada', 'Sehat', '2025-07-09 20:17:27', '2025-07-09 21:16:07'),
(106, '7404195717980002', 'Muhammad Ananta Said', NULL, 'Sedang Berlangsung', NULL, NULL, NULL, 'Baik', 'Baik', NULL, '130/80', '120/80', NULL, 'dbn', 'dbn', NULL, 'Normal', 'Normal', NULL, 'Tak', 'Tak', NULL, 'Keras', 'Baik', NULL, '3 jr', '1 1/2 jr', NULL, 'Merah', 'Merah', NULL, 'Ya', 'Ya', NULL, 'Ya', 'Ya', NULL, 'Banyak', 'Banyak', NULL, 'Ya', 'Ya', NULL, '-', '-', NULL, '-', '-', NULL, '-', 'Ya', NULL, 'Ya', 'Ya', NULL, 'Istirahat yang cukup', NULL, NULL, 'Sehat', 'Tidak Ada', 'Sehat', '2025-07-09 20:24:09', '2025-07-09 21:20:10'),
(107, '7404197889300002', 'Meidina islamova', NULL, 'Sedang Berlangsung', '2023-05-09', '2023-06-02', NULL, 'Baik', 'Baik', NULL, '120/80, 36', '110/80. 36', NULL, 'Normal', 'Normal', NULL, 'dbn', 'dbn', NULL, 'Tak', 'Tak', NULL, 'Keras', 'Baik', NULL, '2 1/2 jr', '1 jr', NULL, 'Merah', 'Merah', NULL, 'Ya', 'Ya', NULL, 'Ya', 'Ya', NULL, 'Banyak', 'Banyak', NULL, 'Ya', 'Ya', NULL, '-', '-', NULL, '-', '-', NULL, '-', 'Ya', NULL, 'Ya', 'Ya', NULL, 'Istirahat yang cukup', NULL, NULL, 'Sehat', 'Tidak Ada', 'Sehat', '2025-07-09 20:29:32', '2025-07-09 21:28:48'),
(108, '7404204509930001', 'Adira', NULL, 'Sedang Berlangsung', '2023-06-27', '2023-07-21', NULL, 'Baik', 'Baik', NULL, '120/90', '100/99', NULL, 'Normal', 'Normal', NULL, 'dbn', 'dbn', NULL, 'Tak', 'Tak', NULL, 'Keras', 'Baik', NULL, '2 jr', '1 jr', NULL, 'Merah', 'Merah', NULL, 'Ya', 'Ya', NULL, 'Ya', 'Ya', NULL, 'Banyak', 'Banyak', NULL, 'Ya', 'Ya', NULL, '-', '-', NULL, '-', '-', NULL, '-', 'Ya', NULL, 'Ya', 'Ya', NULL, 'Istirahat yang cukup', NULL, NULL, 'Sehat', 'Tidak Ada', 'Sehat', '2025-07-09 20:35:15', '2025-07-09 21:34:16'),
(109, '7404194108000002', 'Anaya Riskiana', NULL, 'Sedang Berlangsung', '2023-11-10', NULL, NULL, 'Baik', NULL, NULL, '120/80', NULL, NULL, 'Normal', NULL, NULL, 'dbn', NULL, NULL, 'Tak', NULL, NULL, 'Keras', NULL, NULL, '3 jr', NULL, NULL, 'Merah', NULL, NULL, 'Ya', NULL, NULL, 'Ya', NULL, NULL, 'Banyak', NULL, NULL, 'Ya', NULL, NULL, '-', NULL, NULL, '-', NULL, NULL, 'Ya', NULL, NULL, 'Ya', NULL, NULL, 'Istirahat yang cukup', NULL, NULL, 'Sehat', 'Tidak Ada', 'Sehat', '2025-07-09 20:41:45', '2025-07-09 21:41:21'),
(110, '7404194118020002', 'Khaisan Alsando', NULL, 'Sedang Berlangsung', '2023-06-13', NULL, NULL, 'Baik', NULL, NULL, '120/90', NULL, NULL, 'Normal', NULL, NULL, 'dbn', NULL, NULL, 'Tak', NULL, NULL, 'Keras', NULL, NULL, '2 jr', NULL, NULL, 'Merah', NULL, NULL, 'Ya', NULL, NULL, 'Ya', NULL, NULL, 'Sedikit', NULL, NULL, 'Ya', NULL, NULL, '-', NULL, NULL, '-', NULL, NULL, 'Ya', NULL, NULL, 'Ya', NULL, NULL, 'Istirahat yang cukup', NULL, NULL, 'Sehat', 'Tidak Ada', 'Sehat', '2025-07-09 20:44:22', '2025-07-09 21:43:50'),
(111, '9207015511980001', 'Wa Ode Kanaya', NULL, 'Sedang Berlangsung', '2022-08-26', NULL, NULL, 'Baik', NULL, NULL, '130/80', NULL, NULL, 'Normal', NULL, NULL, 'dbn', NULL, NULL, 'Tak', NULL, NULL, 'Kuat', NULL, NULL, '2  1/2 jr', NULL, NULL, 'Merah', NULL, NULL, 'Ya', NULL, NULL, 'Ya', NULL, NULL, 'Sedikit', NULL, NULL, 'Ya', NULL, NULL, '-', NULL, NULL, '-', NULL, NULL, 'Ya', NULL, NULL, 'Ya', NULL, NULL, 'Istirahat yang cukup', NULL, NULL, 'Sehat', 'Tidak Ada', 'Sehat', '2025-07-09 20:46:33', '2025-07-09 21:46:06'),
(112, '7404194109980001', '--Pilih Nama Anak--', NULL, 'Sedang Berlangsung', '01-01-1970', '01-01-1970', '01-01-1970', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2025-07-15 02:29:24', '2025-07-15 02:29:24'),
(113, '7404194109980001', 'Wa Ode Mikaila', NULL, 'Sedang Berlangsung', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '-Pilih-', '-Pilih-', '-Pilih-', '2025-07-15 19:45:53', '2025-07-15 19:45:53'),
(114, '7404101804930002', 'Wa Ode Keisha Azura Zilvania', '5', 'Sedang Berlangsung', '16-07-2025', '01-01-1970', '01-01-1970', '4', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2025-07-15 22:54:18', '2025-07-15 22:54:18');

-- --------------------------------------------------------

--
-- Table structure for table `tabel_matriks_pemantauan_perkembangan_anak`
--

CREATE TABLE `tabel_matriks_pemantauan_perkembangan_anak` (
  `id` int NOT NULL,
  `nik_ibu` varchar(30) COLLATE utf8mb4_general_ci NOT NULL,
  `nama_ibu` varchar(100) COLLATE utf8mb4_general_ci NOT NULL,
  `nama_ayah` varchar(100) COLLATE utf8mb4_general_ci NOT NULL,
  `nama_anak` varchar(100) COLLATE utf8mb4_general_ci NOT NULL,
  `anak_ke` varchar(5) COLLATE utf8mb4_general_ci NOT NULL,
  `tanggal_pemantauan_perkembangan_1` varchar(20) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `tanggal_pemantauan_perkembangan_3` varchar(20) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `tanggal_pemantauan_perkembangan_6` varchar(20) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `tanggal_pemantauan_perkembangan_9` varchar(20) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `tanggal_pemantauan_perkembangan_12` varchar(20) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `tanggal_pemantauan_perkembangan_15` varchar(20) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `tanggal_pemantauan_perkembangan_18` varchar(20) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `tanggal_pemantauan_perkembangan_21` varchar(20) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `tanggal_pemantauan_perkembangan_24` varchar(20) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `tanggal_pemantauan_perkembangan_30` varchar(20) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `tanggal_pemantauan_perkembangan_36` varchar(20) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `tanggal_pemantauan_perkembangan_42` varchar(20) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `tanggal_pemantauan_perkembangan_48` varchar(20) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `tanggal_pemantauan_perkembangan_54` varchar(20) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `tanggal_pemantauan_perkembangan_60` varchar(20) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `tanggal_pemantauan_perkembangan_66` varchar(20) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `tanggal_pemantauan_perkembangan_72` varchar(20) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `hasil_1` varchar(100) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `hasil_3` varchar(100) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `hasil_6` varchar(100) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `hasil_9` varchar(100) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `hasil_12` varchar(100) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `hasil_15` varchar(100) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `hasil_18` varchar(100) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `hasil_21` varchar(100) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `hasil_24` varchar(100) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `hasil_30` varchar(100) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `hasil_36` varchar(100) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `hasil_42` varchar(100) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `hasil_48` varchar(100) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `hasil_54` varchar(100) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `hasil_60` varchar(100) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `hasil_66` varchar(100) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `hasil_72` varchar(100) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `tindakan_1` varchar(100) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `tindakan_3` varchar(100) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `tindakan_6` varchar(100) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `tindakan_9` varchar(100) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `tindakan_12` varchar(100) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `tindakan_15` varchar(100) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `tindakan_18` varchar(100) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `tindakan_21` varchar(100) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `tindakan_24` varchar(100) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `tindakan_30` varchar(100) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `tindakan_36` varchar(100) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `tindakan_42` varchar(100) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `tindakan_48` varchar(100) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `tindakan_54` varchar(100) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `tindakan_60` varchar(100) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `tindakan_66` varchar(100) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `tindakan_72` varchar(100) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `tanggal_pemantauan_selanjutnya_1` varchar(20) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `tanggal_pemantauan_selanjutnya_3` varchar(20) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `tanggal_pemantauan_selanjutnya_6` varchar(20) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `tanggal_pemantauan_selanjutnya_9` varchar(20) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `tanggal_pemantauan_selanjutnya_12` varchar(20) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `tanggal_pemantauan_selanjutnya_15` varchar(20) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `tanggal_pemantauan_selanjutnya_18` varchar(20) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `tanggal_pemantauan_selanjutnya_21` varchar(20) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `tanggal_pemantauan_selanjutnya_24` varchar(20) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `tanggal_pemantauan_selanjutnya_30` varchar(20) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `tanggal_pemantauan_selanjutnya_36` varchar(20) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `tanggal_pemantauan_selanjutnya_42` varchar(20) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `tanggal_pemantauan_selanjutnya_48` varchar(20) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `tanggal_pemantauan_selanjutnya_54` varchar(20) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `tanggal_pemantauan_selanjutnya_60` varchar(20) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `tanggal_pemantauan_selanjutnya_66` varchar(20) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `tanggal_pemantauan_selanjutnya_72` varchar(20) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `created_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `updated_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tabel_matriks_pemantauan_perkembangan_anak`
--

INSERT INTO `tabel_matriks_pemantauan_perkembangan_anak` (`id`, `nik_ibu`, `nama_ibu`, `nama_ayah`, `nama_anak`, `anak_ke`, `tanggal_pemantauan_perkembangan_1`, `tanggal_pemantauan_perkembangan_3`, `tanggal_pemantauan_perkembangan_6`, `tanggal_pemantauan_perkembangan_9`, `tanggal_pemantauan_perkembangan_12`, `tanggal_pemantauan_perkembangan_15`, `tanggal_pemantauan_perkembangan_18`, `tanggal_pemantauan_perkembangan_21`, `tanggal_pemantauan_perkembangan_24`, `tanggal_pemantauan_perkembangan_30`, `tanggal_pemantauan_perkembangan_36`, `tanggal_pemantauan_perkembangan_42`, `tanggal_pemantauan_perkembangan_48`, `tanggal_pemantauan_perkembangan_54`, `tanggal_pemantauan_perkembangan_60`, `tanggal_pemantauan_perkembangan_66`, `tanggal_pemantauan_perkembangan_72`, `hasil_1`, `hasil_3`, `hasil_6`, `hasil_9`, `hasil_12`, `hasil_15`, `hasil_18`, `hasil_21`, `hasil_24`, `hasil_30`, `hasil_36`, `hasil_42`, `hasil_48`, `hasil_54`, `hasil_60`, `hasil_66`, `hasil_72`, `tindakan_1`, `tindakan_3`, `tindakan_6`, `tindakan_9`, `tindakan_12`, `tindakan_15`, `tindakan_18`, `tindakan_21`, `tindakan_24`, `tindakan_30`, `tindakan_36`, `tindakan_42`, `tindakan_48`, `tindakan_54`, `tindakan_60`, `tindakan_66`, `tindakan_72`, `tanggal_pemantauan_selanjutnya_1`, `tanggal_pemantauan_selanjutnya_3`, `tanggal_pemantauan_selanjutnya_6`, `tanggal_pemantauan_selanjutnya_9`, `tanggal_pemantauan_selanjutnya_12`, `tanggal_pemantauan_selanjutnya_15`, `tanggal_pemantauan_selanjutnya_18`, `tanggal_pemantauan_selanjutnya_21`, `tanggal_pemantauan_selanjutnya_24`, `tanggal_pemantauan_selanjutnya_30`, `tanggal_pemantauan_selanjutnya_36`, `tanggal_pemantauan_selanjutnya_42`, `tanggal_pemantauan_selanjutnya_48`, `tanggal_pemantauan_selanjutnya_54`, `tanggal_pemantauan_selanjutnya_60`, `tanggal_pemantauan_selanjutnya_66`, `tanggal_pemantauan_selanjutnya_72`, `created_at`, `updated_at`) VALUES
(2, '1740028091234', 'Dwi Wulan Seni Harta', '', 'Wahyu', 'jk', '27 Januari 2025', '15', '12', 'jh', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'Baik', '1g', 'baik', 'hy', 'b', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'Tidak Ada', '1b', 'baikk', 'j', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', '29 Januari 2025', '1b', 'jk', 'b', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', '2025-01-24 06:20:02', '2025-02-02 07:26:27'),
(4, '1740028091234', 'Dwi Wulan Seni Harta', '', 'Wahyu', 'jk', '12', '13', '14', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 'Baik', 'Sangat Baik', 'Baik', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2025-01-24 12:23:23', '2025-01-24 12:23:23'),
(5, '789', 'Putri1', '', 'Akmal20', '2', '1', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2025-01-24 12:24:40', '2025-01-24 12:24:40'),
(6, '1740028091234', 'Dwi Wulan Seni Harta', '', 'kj', 'jkl', 'N', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2025-01-27 16:35:54', '2025-01-27 16:35:54'),
(7, '1740028091234', 'Dwi Wulan Seni Harta', '', 'Wahyu', 'jk', '2 Februari 2025', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2025-02-02 06:19:58', '2025-02-02 06:19:58'),
(8, '1740028091234', 'Dwi Wulan Seni Harta', 'test', 'Wahyu', 'jk', 'g', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 'h', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 'h', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 'j', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2025-02-02 06:23:22', '2025-04-27 19:41:55'),
(9, '023', 'RUFAIDA', 'LA TAUMI', 'MUHAMMAD BILAL', '1', '1', '1', '1', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2025-04-27 19:40:09', '2025-04-27 19:43:14');

-- --------------------------------------------------------

--
-- Table structure for table `tabel_pemberian_vitamin_dan_obat_cacing`
--

CREATE TABLE `tabel_pemberian_vitamin_dan_obat_cacing` (
  `id` int NOT NULL,
  `nik_ibu` varchar(16) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `nama_ibu` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `nama_ayah` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `nama_anak` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `anak_ke` varchar(5) COLLATE utf8mb4_general_ci NOT NULL,
  `kapsul_biru_1` varchar(20) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `kapsul_merah_1` varchar(20) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `kapsul_merah_2` varchar(20) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `obat_cacing_1` varchar(20) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `kapsul_biru_2` varchar(20) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `kapsul_merah_3` varchar(20) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `kapsul_merah_4` varchar(20) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `obat_cacing_2` varchar(20) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `kapsul_biru_3` varchar(20) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `kapsul_merah_5` varchar(20) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `kapsul_merah_6` varchar(20) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `obat_cacing_3` varchar(20) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `created_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `updated_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tabel_pemberian_vitamin_dan_obat_cacing`
--

INSERT INTO `tabel_pemberian_vitamin_dan_obat_cacing` (`id`, `nik_ibu`, `nama_ibu`, `nama_ayah`, `nama_anak`, `anak_ke`, `kapsul_biru_1`, `kapsul_merah_1`, `kapsul_merah_2`, `obat_cacing_1`, `kapsul_biru_2`, `kapsul_merah_3`, `kapsul_merah_4`, `obat_cacing_2`, `kapsul_biru_3`, `kapsul_merah_5`, `kapsul_merah_6`, `obat_cacing_3`, `created_at`, `updated_at`) VALUES
(8, '7404101804930002', 'Wa Ode Asriana', 'La Ode Armin', 'Wa Ode Keisha Azura Zilvania', '1', '10-02-2021', '11-02-2021', NULL, NULL, '11-02-2021', NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2025-05-04 05:43:19', '2025-05-19 09:32:40'),
(9, '7415074408020002', 'Filna', 'La Unda', 'Nadifa', '1', '2025-02-08', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2025-05-09 22:37:09', '2025-07-09 22:31:43'),
(13, '7404194507020001', 'Sarnawati', 'Abdul Samat', 'Qiana safika', '3', '2023-05-24', NULL, NULL, NULL, NULL, '2024-02-27', '2023-08-28', '2023-08-28', NULL, NULL, NULL, NULL, '2025-05-27 14:55:07', '2025-07-09 22:28:28'),
(15, '740419410400002', 'Musrida', 'La Ami', 'Muh. Rafa', '1', '2022-08-15', NULL, NULL, NULL, NULL, '2023-02-05', '2023-08-05', '2023-02-05', NULL, NULL, NULL, NULL, '2025-06-17 17:18:51', '2025-06-17 17:18:51'),
(16, '7404194810010001', 'Nurhaida', 'Haidar', 'Husniatul Aishwa', '1', '2022-02-20', NULL, NULL, NULL, NULL, '2023-02-22', '2022-08-19', '2022-08-22', NULL, NULL, NULL, NULL, '2025-07-09 22:39:10', '2025-07-09 22:39:10'),
(17, '740419671299001', 'Filnawati', 'La Ode Sulfan', 'La Ode Zalfin', '1', '2022-08-15', NULL, NULL, NULL, NULL, '2023-02-08', '2023-08-23', '2023-02-08', NULL, NULL, NULL, NULL, '2025-07-09 22:45:25', '2025-07-09 22:45:25'),
(18, '7404196612010001', 'Wa Ode Niyana', 'Laode Isali', 'La Hasan A', '1', '2022-05-07', NULL, NULL, NULL, NULL, '2023-02-20', '2022-08-07', '2022-08-07', NULL, NULL, NULL, NULL, '2025-07-09 22:49:09', '2025-07-09 22:49:09'),
(20, '7404066403000001', 'Nurfina', 'Alan', 'Saflan', '1', '2025-02-08', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2025-07-09 22:58:42', '2025-07-09 22:58:42'),
(21, '7404194109980001', 'Wa Ode Isrami', 'Darzin', 'Wa Ode Mikaila', '1', '2025-02-08', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2025-07-09 22:59:48', '2025-07-09 22:59:48'),
(22, '7404192112060002', 'Darti', 'Onan', 'Narendra', '1', '2024-02-07', NULL, NULL, NULL, NULL, '2025-02-08', '2024-08-07', '2024-08-07', NULL, NULL, NULL, NULL, '2025-07-09 23:03:43', '2025-07-09 23:03:43'),
(23, '7404195120100001', 'Dania', 'Dahri', 'Aprillia Ramadani', '1', '2025-01-08', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2025-07-09 23:04:56', '2025-07-09 23:04:56'),
(24, '740419540799001', 'Naria', 'Sahadin', 'Amila Anasya', '1', '2022-02-25', NULL, NULL, NULL, NULL, '2023-08-06', '2022-08-05', '2022-08-05', NULL, NULL, NULL, NULL, '2025-07-09 23:09:19', '2025-07-09 23:09:19'),
(25, '740419510990001', 'Dasniar', 'Resmin', 'Tian Anugrah', '1', '2022-02-05', NULL, NULL, '2022-08-05', NULL, '2023-08-06', '2022-08-05', NULL, NULL, NULL, NULL, NULL, '2025-07-09 23:13:43', '2025-07-09 23:13:43'),
(26, '7415074408020002', 'Filna', 'La Unda', 'Nadifa', '1', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2025-07-15 20:03:03', '2025-07-15 20:03:03');

-- --------------------------------------------------------

--
-- Table structure for table `tabel_pemenuhan_gizi_dan_makan`
--

CREATE TABLE `tabel_pemenuhan_gizi_dan_makan` (
  `id` int NOT NULL,
  `nik_ibu` varchar(30) COLLATE utf8mb4_general_ci NOT NULL,
  `nama_ibu` varchar(100) COLLATE utf8mb4_general_ci NOT NULL,
  `nama_anak` varchar(100) COLLATE utf8mb4_general_ci NOT NULL,
  `anak_ke` varchar(5) COLLATE utf8mb4_general_ci NOT NULL,
  `nol_sampai_enam_bulan_1` varchar(20) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `nol_sampai_enam_bulan_2` varchar(20) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `nol_sampai_enam_bulan_3` varchar(20) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `nol_sampai_enam_bulan_4` varchar(20) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `enam_sampai_sebelas_bulan_1` varchar(20) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `enam_sampai_sebelas_bulan_2` varchar(20) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `enam_sampai_sebelas_bulan_3` varchar(20) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `enam_sampai_sebelas_bulan_4` varchar(20) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `lainnya_1` varchar(20) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `lainnya_2` varchar(20) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `lainnya_3` varchar(20) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `lainnya_4` varchar(20) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `created_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `updated_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tabel_pemenuhan_gizi_dan_makan`
--

INSERT INTO `tabel_pemenuhan_gizi_dan_makan` (`id`, `nik_ibu`, `nama_ibu`, `nama_anak`, `anak_ke`, `nol_sampai_enam_bulan_1`, `nol_sampai_enam_bulan_2`, `nol_sampai_enam_bulan_3`, `nol_sampai_enam_bulan_4`, `enam_sampai_sebelas_bulan_1`, `enam_sampai_sebelas_bulan_2`, `enam_sampai_sebelas_bulan_3`, `enam_sampai_sebelas_bulan_4`, `lainnya_1`, `lainnya_2`, `lainnya_3`, `lainnya_4`, `created_at`, `updated_at`) VALUES
(1, '12345', 'Dahlia', 'Dwiki', '1', 'Y', 'Y', 'Y', 'Y', 'Y', 'Y', 'Y', 'Y', 'Y', 'Y', 'Y', 'Y', '2024-11-27 11:50:42', '2024-11-27 11:50:42'),
(2, '1740028091234', 'Dwi Wulan Seni Harta', 'Syahrul', '2', 'T', 'T', 'T', 'T', 'Y', 'Y', 'T', 'Y', 'Y', 'Y', 'Y', 'Y', '2024-11-27 11:53:24', '2025-01-24 03:02:40');

-- --------------------------------------------------------

--
-- Table structure for table `tabel_tinggibadan_berdasarkanumur`
--

CREATE TABLE `tabel_tinggibadan_berdasarkanumur` (
  `id` bigint NOT NULL,
  `nik_ibu` varchar(16) NOT NULL,
  `nama_ibu` varchar(50) NOT NULL,
  `nama_ayah` varchar(50) NOT NULL,
  `nama_anak` varchar(50) NOT NULL,
  `anak_ke` varchar(5) NOT NULL,
  `jenis_kelamin` varchar(10) NOT NULL,
  `tinggi_badan_0` longtext CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `tinggi_badan_1` longtext CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `tinggi_badan_2` longtext CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `tinggi_badan_3` longtext CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `tinggi_badan_4` longtext CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `tinggi_badan_5` longtext CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `tinggi_badan_6` longtext CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `tinggi_badan_7` longtext CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `tinggi_badan_8` longtext CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `tinggi_badan_9` longtext CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `tinggi_badan_10` longtext CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `tinggi_badan_11` longtext CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `tinggi_badan_12` longtext CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `tinggi_badan_13` longtext CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `tabel_tinggibadan_berdasarkanumur`
--

INSERT INTO `tabel_tinggibadan_berdasarkanumur` (`id`, `nik_ibu`, `nama_ibu`, `nama_ayah`, `nama_anak`, `anak_ke`, `jenis_kelamin`, `tinggi_badan_0`, `tinggi_badan_1`, `tinggi_badan_2`, `tinggi_badan_3`, `tinggi_badan_4`, `tinggi_badan_5`, `tinggi_badan_6`, `tinggi_badan_7`, `tinggi_badan_8`, `tinggi_badan_9`, `tinggi_badan_10`, `tinggi_badan_11`, `tinggi_badan_12`, `tinggi_badan_13`, `created_at`, `updated_at`) VALUES
(1, '7415074408020002', 'Filna', 'La Unda', 'Nadifa', '1', 'Perempuan', '3', '1', '2', '2', '2.1', '3.3', '3.5', '4', '7', '7', '7', '9', '5.5', '4', '2025-08-22 14:27:30', '2025-08-22 14:27:30');

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `id` bigint UNSIGNED NOT NULL,
  `name` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
  `username` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
  `password` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`id`, `name`, `username`, `password`, `created_at`, `updated_at`) VALUES
(1, 'admin', 'admin', '$2a$10$1Y58O3JCUN/e.IIDVimT9OkAKb/ym54wNndjYx7za8IGpRyl9qky6', NULL, NULL);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `datakms`
--
ALTER TABLE `datakms`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `migrations`
--
ALTER TABLE `migrations`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `tabel_akun_ibu`
--
ALTER TABLE `tabel_akun_ibu`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `tabel_akun_petugas`
--
ALTER TABLE `tabel_akun_petugas`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `tabel_catatan_kesehatan_ibu_hamil`
--
ALTER TABLE `tabel_catatan_kesehatan_ibu_hamil`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `tabel_chatting`
--
ALTER TABLE `tabel_chatting`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `tabel_data_anak`
--
ALTER TABLE `tabel_data_anak`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `tabel_data_imunisasi_anak`
--
ALTER TABLE `tabel_data_imunisasi_anak`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `tabel_data_obstetri`
--
ALTER TABLE `tabel_data_obstetri`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `tabel_data_orangtua`
--
ALTER TABLE `tabel_data_orangtua`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `tabel_jadwal_posyandu`
--
ALTER TABLE `tabel_jadwal_posyandu`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `tabel_kesehatan_bayi_baru_lahir`
--
ALTER TABLE `tabel_kesehatan_bayi_baru_lahir`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `tabel_kesehatan_ibu_bersalin`
--
ALTER TABLE `tabel_kesehatan_ibu_bersalin`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `tabel_kesehatan_ibu_hamil`
--
ALTER TABLE `tabel_kesehatan_ibu_hamil`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `tabel_kesehatan_ibu_nifas`
--
ALTER TABLE `tabel_kesehatan_ibu_nifas`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `tabel_matriks_pemantauan_perkembangan_anak`
--
ALTER TABLE `tabel_matriks_pemantauan_perkembangan_anak`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `tabel_pemberian_vitamin_dan_obat_cacing`
--
ALTER TABLE `tabel_pemberian_vitamin_dan_obat_cacing`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `tabel_pemenuhan_gizi_dan_makan`
--
ALTER TABLE `tabel_pemenuhan_gizi_dan_makan`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `tabel_tinggibadan_berdasarkanumur`
--
ALTER TABLE `tabel_tinggibadan_berdasarkanumur`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `datakms`
--
ALTER TABLE `datakms`
  MODIFY `id` bigint UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=66;

--
-- AUTO_INCREMENT for table `migrations`
--
ALTER TABLE `migrations`
  MODIFY `id` int UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;

--
-- AUTO_INCREMENT for table `tabel_akun_ibu`
--
ALTER TABLE `tabel_akun_ibu`
  MODIFY `id` bigint UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=21;

--
-- AUTO_INCREMENT for table `tabel_akun_petugas`
--
ALTER TABLE `tabel_akun_petugas`
  MODIFY `id` bigint UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=23;

--
-- AUTO_INCREMENT for table `tabel_catatan_kesehatan_ibu_hamil`
--
ALTER TABLE `tabel_catatan_kesehatan_ibu_hamil`
  MODIFY `id` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=196;

--
-- AUTO_INCREMENT for table `tabel_chatting`
--
ALTER TABLE `tabel_chatting`
  MODIFY `id` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=397;

--
-- AUTO_INCREMENT for table `tabel_data_anak`
--
ALTER TABLE `tabel_data_anak`
  MODIFY `id` bigint UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=324;

--
-- AUTO_INCREMENT for table `tabel_data_imunisasi_anak`
--
ALTER TABLE `tabel_data_imunisasi_anak`
  MODIFY `id` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=69;

--
-- AUTO_INCREMENT for table `tabel_data_obstetri`
--
ALTER TABLE `tabel_data_obstetri`
  MODIFY `id` bigint UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=148;

--
-- AUTO_INCREMENT for table `tabel_data_orangtua`
--
ALTER TABLE `tabel_data_orangtua`
  MODIFY `id` bigint UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=180;

--
-- AUTO_INCREMENT for table `tabel_jadwal_posyandu`
--
ALTER TABLE `tabel_jadwal_posyandu`
  MODIFY `id` bigint UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=342;

--
-- AUTO_INCREMENT for table `tabel_kesehatan_bayi_baru_lahir`
--
ALTER TABLE `tabel_kesehatan_bayi_baru_lahir`
  MODIFY `id` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=74;

--
-- AUTO_INCREMENT for table `tabel_kesehatan_ibu_bersalin`
--
ALTER TABLE `tabel_kesehatan_ibu_bersalin`
  MODIFY `id` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=107;

--
-- AUTO_INCREMENT for table `tabel_kesehatan_ibu_hamil`
--
ALTER TABLE `tabel_kesehatan_ibu_hamil`
  MODIFY `id` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=113;

--
-- AUTO_INCREMENT for table `tabel_kesehatan_ibu_nifas`
--
ALTER TABLE `tabel_kesehatan_ibu_nifas`
  MODIFY `id` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=115;

--
-- AUTO_INCREMENT for table `tabel_matriks_pemantauan_perkembangan_anak`
--
ALTER TABLE `tabel_matriks_pemantauan_perkembangan_anak`
  MODIFY `id` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;

--
-- AUTO_INCREMENT for table `tabel_pemberian_vitamin_dan_obat_cacing`
--
ALTER TABLE `tabel_pemberian_vitamin_dan_obat_cacing`
  MODIFY `id` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=27;

--
-- AUTO_INCREMENT for table `tabel_pemenuhan_gizi_dan_makan`
--
ALTER TABLE `tabel_pemenuhan_gizi_dan_makan`
  MODIFY `id` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `tabel_tinggibadan_berdasarkanumur`
--
ALTER TABLE `tabel_tinggibadan_berdasarkanumur`
  MODIFY `id` bigint NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `users`
--
ALTER TABLE `users`
  MODIFY `id` bigint UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
