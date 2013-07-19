-- MySQL dump 10.13  Distrib 5.1.63, for debian-linux-gnu (x86_64)
--
-- Host: localhost    Database: ctt
-- ------------------------------------------------------
-- Server version	5.1.63-0ubuntu0.11.10.1

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Current Database: `ctt`
--

CREATE DATABASE /*!32312 IF NOT EXISTS*/ `ctt` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `ctt`;

--
-- Table structure for table `agency`
--

DROP TABLE IF EXISTS `agency`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `agency` (
  `agency_id` varchar(64) NOT NULL,
  `agency_name` varchar(255) NOT NULL,
  `agency_url` varchar(255) NOT NULL,
  `agency_timezone` varchar(128) NOT NULL,
  `agency_lang` varchar(2) DEFAULT NULL,
  `agency_phone` varchar(255) DEFAULT NULL,
  `agency_fare_url` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`agency_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `calendar`
--

DROP TABLE IF EXISTS `calendar`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `calendar` (
  `service_id` varchar(64) NOT NULL DEFAULT '',
  `monday` tinyint(1) NOT NULL,
  `tuesday` tinyint(1) NOT NULL,
  `wednesday` tinyint(1) NOT NULL,
  `thursday` tinyint(1) NOT NULL,
  `friday` tinyint(1) NOT NULL,
  `saturday` tinyint(1) NOT NULL,
  `sunday` tinyint(1) NOT NULL,
  `start_date` varchar(8) NOT NULL,
  `end_date` varchar(8) NOT NULL,
  PRIMARY KEY (`service_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `calendar_dates`
--

DROP TABLE IF EXISTS `calendar_dates`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `calendar_dates` (
  `service_id` varchar(64) NOT NULL,
  `date` varchar(8) NOT NULL,
  `exception_type` tinyint(1) NOT NULL,
  PRIMARY KEY (`service_id`,`date`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `fare_attributes`
--

DROP TABLE IF EXISTS `fare_attributes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `fare_attributes` (
  `fare_id` varchar(64) NOT NULL DEFAULT '',
  `price` decimal(10,2) unsigned NOT NULL,
  `currency_type` varchar(3) NOT NULL,
  `payment_method` tinyint(1) NOT NULL,
  `transfers` tinyint(1) NOT NULL,
  `transfer_domain` int(11) DEFAULT NULL,
  PRIMARY KEY (`fare_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `fare_rules`
--

DROP TABLE IF EXISTS `fare_rules`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `fare_rules` (
  `fair_id` varchar(8) NOT NULL,
  `route_id` varchar(64) DEFAULT NULL,
  `origin_id` varchar(64) DEFAULT NULL,
  `destination_id` varchar(64) DEFAULT NULL,
  `contains_id` varchar(64) DEFAULT NULL,
  PRIMARY KEY (`fair_id`),
  KEY `fare_rules_ibfk_1` (`route_id`),
  KEY `fare_rules_ibfk_2` (`origin_id`),
  KEY `fare_rules_ibfk_3` (`destination_id`),
  KEY `fare_rules_ibfk_4` (`contains_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `feed_info`
--

DROP TABLE IF EXISTS `feed_info`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `feed_info` (
  `feed_publisher_name` varchar(255) NOT NULL,
  `feed_publisher_url` varchar(255) NOT NULL,
  `feed_lang` varchar(2) NOT NULL,
  `feed_start_date` varchar(8) DEFAULT NULL,
  `feed_end_date` varchar(8) DEFAULT NULL,
  `feed_version` varchar(64) NOT NULL DEFAULT '',
  PRIMARY KEY (`feed_publisher_name`,`feed_version`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `frequencies`
--

DROP TABLE IF EXISTS `frequencies`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `frequencies` (
  `trip_id` varchar(64) NOT NULL,
  `start_time` varchar(8) NOT NULL,
  `end_time` varchar(8) NOT NULL,
  `headway_secs` int(10) unsigned NOT NULL,
  `exact_times` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`trip_id`),
  KEY `trip_id` (`trip_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `routes`
--

DROP TABLE IF EXISTS `routes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `routes` (
  `route_id` varchar(64) NOT NULL DEFAULT '',
  `agency_id` varchar(64) DEFAULT NULL,
  `route_short_name` varchar(16) DEFAULT NULL,
  `route_long_name` varchar(255) NOT NULL,
  `route_desc` varchar(255) DEFAULT NULL,
  `route_type` tinyint(1) DEFAULT NULL,
  `route_url` varchar(255) DEFAULT NULL,
  `route_color` varchar(6) DEFAULT NULL,
  `route_text_color` varchar(6) DEFAULT NULL,
  PRIMARY KEY (`route_id`),
  KEY `agency_id` (`agency_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `shapes`
--

DROP TABLE IF EXISTS `shapes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `shapes` (
  `shape_id` varchar(64) NOT NULL,
  `shape_pt_lat` decimal(9,6) NOT NULL,
  `shape_pt_lon` decimal(9,6) NOT NULL,
  `shape_pt_sequence` int(12) unsigned NOT NULL,
  `shape_dist_traveled` decimal(5,2) unsigned DEFAULT NULL,
  PRIMARY KEY (`shape_id`,`shape_pt_lat`,`shape_pt_lon`,`shape_pt_sequence`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `stop_times`
--

DROP TABLE IF EXISTS `stop_times`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `stop_times` (
  `trip_id` varchar(64) NOT NULL,
  `arrival_time` varchar(8) NOT NULL,
  `departure_time` varchar(8) NOT NULL,
  `stop_id` varchar(64) NOT NULL,
  `stop_sequence` int(10) unsigned NOT NULL,
  `stop_headsign` varchar(64) DEFAULT NULL,
  `pickup_type` tinyint(1) DEFAULT NULL,
  `drop_off_type` tinyint(1) DEFAULT NULL,
  `shape_dist_traveled` decimal(5,2) DEFAULT NULL,
  PRIMARY KEY (`trip_id`,`stop_id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `stops`
--

DROP TABLE IF EXISTS `stops`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `stops` (
  `stop_id` varchar(64) NOT NULL,
  `stop_code` varchar(255) DEFAULT NULL,
  `stop_name` varchar(255) NOT NULL,
  `stop_desc` varchar(255) DEFAULT NULL,
  `stop_lat` decimal(9,6) NOT NULL,
  `stop_lon` decimal(9,6) NOT NULL,
  `zone_id` varchar(64) DEFAULT NULL,
  `stop_url` varchar(255) DEFAULT NULL,
  `location_type` tinyint(1) DEFAULT NULL,
  `parent_station` varchar(64) DEFAULT NULL,
  `stop_timezone` varchar(128) DEFAULT NULL,
  `wheelchair_bording` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`stop_id`),
  UNIQUE KEY `stop_code` (`stop_code`),
  KEY `parent_station` (`parent_station`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `transfers`
--

DROP TABLE IF EXISTS `transfers`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `transfers` (
  `from_stop_id` varchar(64) NOT NULL,
  `to_stop_id` varchar(64) NOT NULL,
  `transfer_type` tinyint(1) NOT NULL,
  `min_transfer_time` int(10) unsigned NOT NULL DEFAULT '0',
  PRIMARY KEY (`from_stop_id`,`to_stop_id`,`transfer_type`,`min_transfer_time`),
  KEY `to_stop_id` (`to_stop_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `trips`
--

DROP TABLE IF EXISTS `trips`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `trips` (
  `route_id` varchar(64) NOT NULL,
  `service_id` varchar(64) NOT NULL,
  `trip_id` varchar(64) NOT NULL DEFAULT '',
  `trip_headsign` varchar(64) DEFAULT NULL,
  `trip_short_name` varchar(64) DEFAULT NULL,
  `direction_id` tinyint(1) DEFAULT NULL,
  `block_id` varchar(64) DEFAULT NULL,
  `shape_id` varchar(64) DEFAULT NULL,
  PRIMARY KEY (`trip_id`),
  KEY `route_id` (`route_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2012-09-10 20:07:44
