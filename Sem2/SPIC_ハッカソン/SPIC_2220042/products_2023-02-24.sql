# ************************************************************
# Sequel Ace SQL dump
# 版本號： 20046
#
# https://sequel-ace.com/
# https://github.com/Sequel-Ace/Sequel-Ace
#
# 主機: 127.0.0.1 (MySQL 8.0.32)
# 數據庫: products
# 生成時間: 2023-02-24 05:59:30 +0000
# ************************************************************


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
SET NAMES utf8mb4;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE='NO_AUTO_VALUE_ON_ZERO', SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;


# 轉儲表 brand
# ------------------------------------------------------------

DROP TABLE IF EXISTS `brand`;

CREATE TABLE `brand` (
  `name` varchar(50) DEFAULT NULL,
  `image` varchar(50) DEFAULT NULL,
  `php` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

LOCK TABLES `brand` WRITE;
/*!40000 ALTER TABLE `brand` DISABLE KEYS */;

INSERT INTO `brand` (`name`, `image`, `php`)
VALUES
	('Canon','Canon.png','\r'),
	('Nikon','Nikon.png','\r'),
	('Sony','Sony.png','\r'),
	('Fujifilm','Fujifilm.png','\r'),
	('Leisa','Leica.png','\r');

/*!40000 ALTER TABLE `brand` ENABLE KEYS */;
UNLOCK TABLES;


# 轉儲表 Lens
# ------------------------------------------------------------

DROP TABLE IF EXISTS `Lens`;

CREATE TABLE `Lens` (
  `Lens_id` int unsigned NOT NULL AUTO_INCREMENT,
  `Brand` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `name` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `price` float DEFAULT NULL,
  `image` varchar(100) DEFAULT NULL,
  `remaining` int DEFAULT NULL,
  `photoT` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  PRIMARY KEY (`Lens_id`)
) ENGINE=InnoDB AUTO_INCREMENT=49 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

LOCK TABLES `Lens` WRITE;
/*!40000 ALTER TABLE `Lens` DISABLE KEYS */;

INSERT INTO `Lens` (`Lens_id`, `Brand`, `name`, `price`, `image`, `remaining`, `photoT`)
VALUES
	(1,'Canon','Canon EF-S 10-18mm f/4.5-5.6 IS STM',10000,'Canon_10-18mm_f4.5-5.6_IS_STM_',5,'.jpg'),
	(2,'Canon','Canon EF 85mm f/1.4L IS USM',10000,'Canon_85mm_f1.4_IS_',5,'.jpg'),
	(3,'Canon','Canon RF 24-70mm f/2.8L IS USM',10000,'Canon_24-70mm_f2.8_IS_',5,'.jpg'),
	(4,'Canon','Canon EF 100mm f/2.8L Macro IS USM',10000,'Canon_100mm_f2.8_Macro_',5,'.jpg'),
	(5,'Canon','Canon EF-S 24mm f/2.8 STM',10000,'Canon_24mm_f2.8_stm_',5,'.jpg'),
	(6,'Canon','Canon EF 50mm f/1.8 STM',10000,'Canon_50mm_f_1_8_stm_',5,'.jpg'),
	(7,'Canon','Canon EF 75-300mm f/4-5.6 III',10000,'Canon_75-300mm_f4-5.6_',5,'.jpg'),
	(8,'Canon','Canon EF 70-200mm f/2.8L IS III USM',10000,'Canon_70-200mm_f2.8_IS_',5,'.jpg'),
	(9,'Canon','Canon EF 100-400mm f/4.5-5.6L IS II USM',10000,'Canon_100-400mm_f4.5-5.6_IS_',5,'.jpg'),
	(10,'Nikon','Nikon AF-P DX NIKKOR 10-20MM F/4.5-5.6G VR',10000,'Nikon_10-20mm_f4.5-5.6G_ED_VR_',5,'.jpg'),
	(11,'Nikon','Nikon AF-S NIKKOR 14-24mm f/2.8G ED',10000,'Nikon_14-24mm_f2.8G_',5,'.jpg'),
	(12,'Nikon','Nikon AF-S NIKKOR 24-70mm f/2.8E ED VR',10000,'Nikon_24-70mm_f2.8E_ED_VR_',5,'.jpg'),
	(13,'Nikon','Nikon AF-S DX NIKKOR 35mm f/1.8G',10000,'Nikon_35mm_f1.8G_',5,'.jpg'),
	(14,'Nikon','Nikon AF-S DX NIKKOR 50mm f/1.8G',10000,'Nikon_50mm_f1.8G_',5,'.jpg'),
	(15,'Nikon','Nikon AF-S NIKKOR 70-200mm f/2.8E FL ED VR',10000,'Nikon_70-200mm_f2.8E_ED_VR_',5,'.jpg'),
	(16,'Nikon','Nikon AF-P DX NIKKOR 70-300mm f/4.5-6.3G ED VR',10000,'Nikon_70-300mm_f4.5-6.3G_ED_VR_',5,'.jpg'),
	(17,'Nikon','Nikon AF-S NIKKOR 85mm f/1.4G',10000,'Nikon_85mm_f1.4G_',5,'.jpg'),
	(18,'Nikon','Nikon AF-S NIKKOR 200-500mm f/5.6E ED VR',10000,'Nikon_200-500mm_f5.6E_ED_VR_',5,'.jpg'),
	(19,'Sony','Sony FE 14mm F1.8 GM',10000,'Sony_14mm_f1.8_GM_',5,'.jpg'),
	(20,'Sony','Sony FE 16-35mm F2.8 GM',10000,'Sony_16-35mm_f2.8_GM_',5,'.jpg'),
	(21,'Sony','Sony FE 20mm F1.8 G',10000,'Sony_20mm_f1.8_G_',5,'.jpg'),
	(22,'Sony','Sony FE 24-70mm F2.8 GM II',10000,'Sony_24-70mm_f2.8_G_',5,'.jpg'),
	(23,'Sony','Sony FE 35mm F1.4 GM',10000,'Sony_35mm_f2.4_GM_',5,'.jpg'),
	(24,'Sony','Sony FE 50mm F1.2 GM',10000,'Sony_50mm_f1.2_G_',5,'.jpg'),
	(25,'Sony','Sony FE 70-200mm F2.8 GM OSS II',10000,'Sony_70-200mm_f2.8_GM_OSS_',5,'.jpg'),
	(26,'Sony','Sony FE 85mm F1.4 GM',10000,'Sony_85mm_f1.8_GM_',5,'.jpg'),
	(27,'Sony','Sony FE 200-600mm F5.6-6.3 G OSS',10000,'Sony_200-600mm_f5.6-6.3_G_OSS_',5,'.jpg'),
	(28,'Leica','Leica APO-SUMMICRON-SL 35 f/2 ASPH.',10000,'Leica_APO-Summicron-SL_35mm_f2_ASPH_',5,'.jpg'),
	(29,'Leica','Leica APO-SUMMICRON-SL 50 f/2 ASPH.',10000,'Leica_APO-Summicron-SL_50mm_f2_ASPH_',5,'.jpg'),
	(30,'Leica','Leica APO-SUMMICRON-SL 90 f/2 ASPH.',10000,'Leica_APO-Summicron-SL_90mm_f2_ASPH_',5,'.jpg'),
	(31,'Leica','Leica Elmarit-TL 18mm f/2.8 ASPH',10000,'Leica_Elmarit-TL_18mm_f2.8_ASPH_',5,'.jpg'),
	(32,'Leica','Leica Summilux-TL 35mm F1.4 ASPH',10000,'Leica_Summilux-TL_35mm_f1.4_ASPH_',5,'.jpg'),
	(33,'Leica','Leica Vario-Elmarit-SL 24-70 f/2.8 ASPH',10000,'Leica_Vario-Elmarit-SL_24-70mm_f2.8_ASPH_',5,'.jpg'),
	(34,'Leica','Leica Super-Vario-Elmar-SL 1635/ 3.5-4.5 ASPH',10000,'Leica_Super-Vario-Elmar-SL_16-35mm_f3.5-4.5_ASPH_',5,'.jpg'),
	(35,'Leica','Leica Vario-Elmar-T 18-56mm f/3.5-5.6 ASPH',10000,'Leica_Vario-Elmarit-T18-56mm_f3.5-5.6_ASPH_',5,'.jpg'),
	(36,'Leica','Leica APO-Vario-Elmarit-SL 90-280mm F2.8-4',10000,'Leica_APO-Vario-Elmarit-SL_90-280mm_f2.8-4_Lens_',5,'.jpg'),
	(37,'Fujifilm','Fujifilm XF16-55mmF2.8 R LM WR',10000,'FUJIFILM_16-55mm_f2.8R_LM_WR_',5,'.jpg'),
	(38,'Fujifilm','Fujifilm XF18-120mmF4 LM PZ WR',10000,'FUJIFILM_18-120mm_f4_LM_PZ_WR_',5,'.jpg'),
	(39,'Fujifilm','Fujifilm FUJINON XF27mmF2.8 R WR',10000,'FUJIFILM_27mm_f2.8R_WR_',5,'.jpg'),
	(40,'Fujifilm','Fujifilm FUJINON XF35mmF2 R WR?',10000,'FUJIFILM_35mm_f2R_WR_',5,'.jpg'),
	(41,'Fujifilm','Fujifilm FUJINON XF70-300mm F4-5.6 R LM OIS WR',10000,'FUJIFILM_70-300mm_f4-5.6R_LM_OIS_WR_',5,'.jpg'),
	(42,'Fujifilm','Fujifilm Fujinon XF 150-600mm F5.6-8 R LM OIS WR',10000,'FUJIFILM_150-600mm_f5.6-8R_LM_OIS_WR_',5,'.jpg'),
	(43,'Fujifilm','Fujifilm FUJINON XF56mmF1.2 R',10000,'Fujifilm_XF56mmF1.2_R_',5,'.jpg'),
	(44,'Fujifilm','Fujifilm FUJINON XF23mmF2 R WR',10000,'Fujifilm_XF23mmF2_R_WR_',5,'.jpg'),
	(45,'Fujifilm','Fujifilm Fujinon XF18mmF1.4 R LM WR',10000,'Fujifilm_XF18mmF1.4_R_LM_WR_',5,'.jpg');

/*!40000 ALTER TABLE `Lens` ENABLE KEYS */;
UNLOCK TABLES;


# 轉儲表 order_data
# ------------------------------------------------------------

DROP TABLE IF EXISTS `order_data`;

CREATE TABLE `order_data` (
  `order_id` varchar(20) NOT NULL,
  `client_name` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `client_email` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `Tel` varchar(100) DEFAULT NULL,
  `product_id` int NOT NULL,
  `quantity` int NOT NULL,
  `order_time` datetime NOT NULL ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`order_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

LOCK TABLES `order_data` WRITE;
/*!40000 ALTER TABLE `order_data` DISABLE KEYS */;

INSERT INTO `order_data` (`order_id`, `client_name`, `client_email`, `Tel`, `product_id`, `quantity`, `order_time`)
VALUES
	('4aQCi8HGy2','dawd','Cyrusman1207@gmail.com','',1,1,'2023-02-24 05:14:02'),
	('6Bxn7d1jPi','adwwadawdwa','cyruasdsads@gmail.com','',1,1,'2023-02-24 05:24:01'),
	('QBda7gtsqA','adwwadawdwa','cyruasdsads@gmail.com','',8,1,'2023-02-24 05:52:26'),
	('yGJWMx6PKr','adwwadawdwa','cyrus@gmail.com','8075436898',1,1,'2023-02-24 05:17:05');

/*!40000 ALTER TABLE `order_data` ENABLE KEYS */;
UNLOCK TABLES;


# 轉儲表 staff
# ------------------------------------------------------------

DROP TABLE IF EXISTS `staff`;

CREATE TABLE `staff` (
  `STAFF_id` int unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `email` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `password` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`STAFF_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

LOCK TABLES `staff` WRITE;
/*!40000 ALTER TABLE `staff` DISABLE KEYS */;

INSERT INTO `staff` (`STAFF_id`, `name`, `email`, `password`)
VALUES
	(1,'Cyrus','cyrus@gmail.com','123456'),
	(2,'Test','Test@gmail.com','123456');

/*!40000 ALTER TABLE `staff` ENABLE KEYS */;
UNLOCK TABLES;



/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
