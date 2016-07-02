-- MySQL dump 10.12
--
-- Host: localhost    Database: db
-- ------------------------------------------------------
-- Server version	5.2.0-falcon-alpha-community-nt

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
-- Table structure for table `back`
--

DROP TABLE IF EXISTS `back`;
CREATE TABLE `back` (
  `Bid` int(11) NOT NULL AUTO_INCREMENT,
  `Gid` int(6) NOT NULL,
  `Bnumber` int(11) NOT NULL,
  `Bmoney` float(10,2) NOT NULL,
  `Breason` varchar(100) NOT NULL,
  `Eid` int(6) NOT NULL,
  `Bdate` date NOT NULL,
  PRIMARY KEY (`Bid`),
  KEY `FK_Reference_6` (`Gid`),
  CONSTRAINT `FK_Reference_6` FOREIGN KEY (`Gid`) REFERENCES `goods` (`Gid`)
) ENGINE=InnoDB DEFAULT CHARSET=gbk;

--
-- Dumping data for table `back`
--

LOCK TABLES `back` WRITE;
/*!40000 ALTER TABLE `back` DISABLE KEYS */;
INSERT INTO `back` VALUES (1,2,1,5.00,'包装破损',16002,'2016-06-07'),(2,1,1,3.50,'汽水变味',16002,'2016-06-13'),(3,1,10,35.00,'商品过期',16001,'2016-04-05'),(6,1,10,35.00,'vhg',16001,'2015-04-07'),(7,1,10,35.00,'达到',10061,'2014-04-04'),(8,1,10,35.00,'光辉',16001,'2014-05-05'),(9,3,13,100.00,'个体',16001,'2015-05-06'),(10,3,13,100.00,'各位',16001,'2014-05-06'),(11,2,10,111.00,'别人分',16002,'2014-04-05'),(12,3,3,22.00,'确认为',16001,'2014-09-10'),(13,4,12,32.00,'幸福供电所',16001,'2015-05-05'),(14,2,10,12.00,'更好的方法',16001,'2014-05-04'),(15,4,10,750.00,'共同投入法国人',16001,'2014-05-07'),(16,1,11,35.50,'一套房',16002,'2014-05-04'),(17,5,1,150.00,'啊等方式',16002,'2014-12-10'),(18,4,3,42.00,'阿达',16002,'2015-09-05'),(19,5,2,150.00,'速递公司',16002,'2015-07-07'),(20,3,10,100.00,'发的',16002,'2014-05-17'),(21,6,10,31.00,'电视台',16002,'2015-10-12'),(22,5,2,300.00,'问题日上午',16002,'2016-04-05');
/*!40000 ALTER TABLE `back` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `employee`
--

DROP TABLE IF EXISTS `employee`;
CREATE TABLE `employee` (
  `Eid` int(6) NOT NULL,
  `Ename` varchar(20) NOT NULL,
  `sex` varchar(2) NOT NULL,
  `Ephone` varchar(20) NOT NULL,
  `Enumber` varchar(30) NOT NULL,
  `position` varchar(20) NOT NULL,
  `salary` int(10) NOT NULL,
  `password` varchar(30) NOT NULL,
  `age` int(11) NOT NULL,
  PRIMARY KEY (`Eid`),
  UNIQUE KEY `Enumber` (`Enumber`)
) ENGINE=InnoDB DEFAULT CHARSET=gbk;

--
-- Dumping data for table `employee`
--

LOCK TABLES `employee` WRITE;
/*!40000 ALTER TABLE `employee` DISABLE KEYS */;
INSERT INTO `employee` VALUES (16001,'邓文','女','18813266654','1231545665413','经理',7000,'112233',25),(16002,'张三','男','242425','24255454','收银员',3500,'110120',24),(16003,'杨过','男','18845454533','323434343','后勤',4600,'111111',34),(16004,'黄蓉','女','2323232','1232132','收银员',4000,'111222',26),(16005,'郭靖','男','186656564','43434343443','保安',4000,'4343434',34);
/*!40000 ALTER TABLE `employee` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `goods`
--

DROP TABLE IF EXISTS `goods`;
CREATE TABLE `goods` (
  `Gid` int(6) NOT NULL,
  `Gname` varchar(20) NOT NULL,
  `saleprice` float(5,2) NOT NULL,
  `inventory` int(6) NOT NULL,
  `Sid` int(6) NOT NULL,
  PRIMARY KEY (`Gid`),
  KEY `FK_Reference_1` (`Sid`),
  CONSTRAINT `FK_Reference_1` FOREIGN KEY (`Sid`) REFERENCES `supplier` (`Sid`)
) ENGINE=InnoDB DEFAULT CHARSET=gbk;

--
-- Dumping data for table `goods`
--

LOCK TABLES `goods` WRITE;
/*!40000 ALTER TABLE `goods` DISABLE KEYS */;
INSERT INTO `goods` VALUES (1,'可口可乐',3.50,220,1),(2,'排骨面',4.00,100,2),(3,'海飞丝洗发液',20.00,35,3),(4,'格子衬衫',75.00,40,5),(5,'裙子',150.00,40,5),(6,'避孕药',20.00,15,29),(7,'奶粉',150.00,88,30),(8,'豆豉',5.00,50,4),(9,'辣条',5.00,100,20),(23,'qq堂',12.00,35,5);
/*!40000 ALTER TABLE `goods` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `information`
--

DROP TABLE IF EXISTS `information`;
CREATE TABLE `information` (
  `Iid` int(11) NOT NULL AUTO_INCREMENT,
  `Gid` int(6) NOT NULL,
  `Inumber` int(11) NOT NULL,
  `Eid` int(6) DEFAULT NULL,
  `Imoney` float(10,2) NOT NULL,
  `Mid` int(10) DEFAULT NULL,
  `Idate` date DEFAULT NULL,
  PRIMARY KEY (`Iid`),
  KEY `FK_Reference_7` (`Gid`),
  KEY `FK_Reference_8` (`Eid`),
  KEY `f1` (`Mid`),
  CONSTRAINT `FK_Reference_7` FOREIGN KEY (`Gid`) REFERENCES `goods` (`Gid`),
  CONSTRAINT `FK_Reference_8` FOREIGN KEY (`Eid`) REFERENCES `employee` (`Eid`)
) ENGINE=InnoDB DEFAULT CHARSET=gbk;

--
-- Dumping data for table `information`
--

LOCK TABLES `information` WRITE;
/*!40000 ALTER TABLE `information` DISABLE KEYS */;
INSERT INTO `information` VALUES (46,1,10,16002,31.50,2,'2016-06-29'),(47,2,4,16002,18.00,2,'2016-06-29'),(49,3,1,16002,18.00,2,'2016-06-29'),(52,4,1,16002,67.50,2,'2016-06-29'),(53,1,10,16002,31.50,4,'2016-06-29'),(54,4,2,16002,135.00,4,'2016-06-29'),(55,1,10,16002,31.50,3,'2016-06-29'),(57,1,3,16002,9.45,2,'2016-06-29'),(58,3,2,16002,36.00,1,'2016-06-29'),(59,2,3,16002,13.50,1,'2016-06-29'),(60,3,2,16002,36.00,2,'2016-06-29'),(61,1,2,16002,7.00,0,'2016-06-29'),(62,2,3,16002,15.00,0,'2016-06-29'),(63,2,3,16002,13.50,2,'2016-06-29'),(64,2,4,16002,20.00,0,'2016-06-29'),(65,2,1,16002,5.00,0,'2016-06-29'),(66,2,7,16002,35.00,0,'2016-06-29'),(67,3,4,16002,72.00,1,'2016-06-29'),(68,1,6,16002,18.90,3,'2016-06-29'),(69,3,2,16002,40.00,0,'2016-06-29'),(70,1,8,16002,28.00,0,'2016-06-29'),(71,4,1,16002,75.00,0,'2016-06-29'),(72,3,2,16002,36.00,1,'2016-06-29'),(73,1,8,16002,28.00,0,'2016-06-29'),(74,3,2,16002,36.00,1,'2016-06-29'),(75,2,7,16002,35.00,0,'2016-06-29'),(76,3,5,16002,90.00,2,'2016-06-29'),(77,3,4,16002,80.00,0,'2016-06-29'),(78,3,4,16002,72.00,2,'2016-06-29'),(79,1,2,16002,7.00,0,'2016-06-29'),(80,3,2,16002,40.00,0,'2016-06-29'),(81,2,4,16002,20.00,0,'2016-06-29'),(82,1,2,16002,6.30,3,'2016-06-29'),(83,3,4,16002,80.00,0,'2016-06-29'),(84,3,5,16002,100.00,0,'2016-06-29'),(85,4,2,16002,135.00,2,'2016-06-29');
/*!40000 ALTER TABLE `information` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `loss`
--

DROP TABLE IF EXISTS `loss`;
CREATE TABLE `loss` (
  `Lid` int(6) NOT NULL AUTO_INCREMENT,
  `Gid` int(6) NOT NULL,
  `Lnumber` int(11) NOT NULL,
  `Lreason` varchar(100) CHARACTER SET gbk NOT NULL,
  PRIMARY KEY (`Lid`),
  KEY `fk12` (`Gid`),
  CONSTRAINT `fk12` FOREIGN KEY (`Gid`) REFERENCES `goods` (`Gid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `loss`
--

LOCK TABLES `loss` WRITE;
/*!40000 ALTER TABLE `loss` DISABLE KEYS */;
INSERT INTO `loss` VALUES (1,1,12,'wd'),(2,2,2,'dew'),(7,3,23,'阿道夫'),(8,4,23,'吊死扶伤'),(9,2,23,'为单位'),(10,3,12,'12'),(11,4,31,'破损'),(12,4,10,'共同投入法国人'),(13,1,11,'一套房'),(14,5,1,'啊等方式'),(15,4,3,'阿达'),(16,5,2,'速递公司'),(17,3,10,'发的'),(18,6,10,'电视台'),(19,5,2,'问题日上午');
/*!40000 ALTER TABLE `loss` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `member`
--

DROP TABLE IF EXISTS `member`;
CREATE TABLE `member` (
  `Mid` int(10) NOT NULL AUTO_INCREMENT,
  `Mname` varchar(20) NOT NULL,
  `Mnumber` varchar(30) NOT NULL,
  `Mphone` varchar(20) NOT NULL,
  `integral` int(11) DEFAULT NULL,
  `date` date NOT NULL,
  PRIMARY KEY (`Mid`)
) ENGINE=InnoDB DEFAULT CHARSET=gbk;

--
-- Dumping data for table `member`
--

LOCK TABLES `member` WRITE;
/*!40000 ALTER TABLE `member` DISABLE KEYS */;
INSERT INTO `member` VALUES (1,'杨大大','4408821907','18812933241',29,'2016-06-23'),(2,'李先生','4408829876','18812987621',55,'2016-06-25'),(3,'喵喵','4408822176','18887587621',20,'2016-10-25'),(4,'李阳','4238822176','18842587621',13,'2016-10-05'),(5,'15454545','45454545','开始日',NULL,'2016-05-04'),(6,'微蜂窝','456456','45665',0,'2015-05-04'),(7,'额度','14124','321421',0,'2016-04-20'),(8,'收发室','2536','43225',0,'2016-06-07');
/*!40000 ALTER TABLE `member` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ranking`
--

DROP TABLE IF EXISTS `ranking`;
CREATE TABLE `ranking` (
  `Gid` int(6) NOT NULL,
  `Gname` varchar(20) NOT NULL,
  `salenumber` int(10) unsigned zerofill DEFAULT '0000000000',
  PRIMARY KEY (`Gid`),
  CONSTRAINT `FK8` FOREIGN KEY (`Gid`) REFERENCES `goods` (`Gid`)
) ENGINE=InnoDB DEFAULT CHARSET=gbk;

--
-- Dumping data for table `ranking`
--

LOCK TABLES `ranking` WRITE;
/*!40000 ALTER TABLE `ranking` DISABLE KEYS */;
INSERT INTO `ranking` VALUES (1,'可口可乐',0000000149),(2,'排骨面',0000000086),(3,'海飞丝洗发液',0000000038),(4,'格子衬衫',0000000003),(7,'奶粉',0000000000),(8,'豆豉',0000000000),(9,'辣条',0000000000),(23,'qq堂',0000000000);
/*!40000 ALTER TABLE `ranking` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `receipt`
--

DROP TABLE IF EXISTS `receipt`;
CREATE TABLE `receipt` (
  `Rid` int(10) NOT NULL AUTO_INCREMENT,
  `Gname` varchar(20) NOT NULL,
  `Rnumber` int(11) NOT NULL,
  `Rprice` float(10,2) NOT NULL,
  `sum` float(10,2) DEFAULT NULL,
  `Sname` varchar(40) NOT NULL,
  `Rdate` date NOT NULL,
  PRIMARY KEY (`Rid`),
  KEY `FK_Reference_3` (`Gname`)
) ENGINE=InnoDB DEFAULT CHARSET=gbk;

--
-- Dumping data for table `receipt`
--

LOCK TABLES `receipt` WRITE;
/*!40000 ALTER TABLE `receipt` DISABLE KEYS */;
INSERT INTO `receipt` VALUES (6,'老干爹',55,12.00,660.00,'附件是电话','2006-04-12'),(17,'可口可乐',10,30.00,300.00,'3','2016-03-06'),(18,'排骨面',5,50.00,250.00,'10','2016-06-20'),(19,'裙子',5,500.00,2500.00,'100','2016-05-01'),(20,'格子衬衫',5,250.00,1250.00,'50','2016-05-03'),(21,'奶粉',10,500.00,5000.00,'50','2016-05-13'),(22,'奶粉',12,600.00,7200.00,'50','2016-04-03'),(23,'奶粉',16,50.00,800.00,'50','2016-05-20');
/*!40000 ALTER TABLE `receipt` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `supplier`
--

DROP TABLE IF EXISTS `supplier`;
CREATE TABLE `supplier` (
  `Sid` int(6) NOT NULL AUTO_INCREMENT,
  `Sname` varchar(40) NOT NULL,
  `Sphone` varchar(20) NOT NULL,
  `Snumber` varchar(30) NOT NULL,
  `Sadress` varchar(100) NOT NULL,
  PRIMARY KEY (`Sid`),
  UNIQUE KEY `Snumber` (`Snumber`,`Sname`)
) ENGINE=InnoDB DEFAULT CHARSET=gbk;

--
-- Dumping data for table `supplier`
--

LOCK TABLES `supplier` WRITE;
/*!40000 ALTER TABLE `supplier` DISABLE KEYS */;
INSERT INTO `supplier` VALUES (1,'健力宝有限公司','18813299911','4408821910','健力宝大厦'),(2,'康师傅有限公司','18813119911','4408821920','广州大道东'),(3,'海飞丝有限公司','18812119911','4408821930','中山大道东'),(4,'海天有限公司','18812112131','4408821970','番禺大道东'),(5,'优衣库','18812438781','4408821870','广师大道'),(18,'天上人间','1568452','4452588445','广技师'),(20,'老干妈','18813299955','437373','广州'),(29,'杜蕾斯集团','1212323232','43434343','中上达到'),(30,'雅培有限公司','132666','624353','深圳龙岗区');
/*!40000 ALTER TABLE `supplier` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2016-06-30  3:26:08
