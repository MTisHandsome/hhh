/*
SQLyog v10.2 
MySQL - 5.6.41 : Database - dschoolcrm
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`dschoolcrm` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `dschoolcrm`;

/*Table structure for table `car` */

DROP TABLE IF EXISTS `car`;

CREATE TABLE `car` (
  `car_id` int(11) NOT NULL AUTO_INCREMENT,
  `car_card` varchar(25) DEFAULT NULL COMMENT '车牌号',
  `car_shape` varchar(25) DEFAULT NULL COMMENT '车型',
  `repair_id` int(11) DEFAULT NULL COMMENT '维修表对应id',
  `school_id` int(11) DEFAULT NULL COMMENT '校区id',
  PRIMARY KEY (`car_id`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8;

/*Data for the table `car` */

insert  into `car`(`car_id`,`car_card`,`car_shape`,`repair_id`,`school_id`) values (12,'豫K8171','发顺丰a',NULL,2),(13,'豫K9659','发顺丰',NULL,3),(14,'1234','大Q吧',NULL,1);

/*Table structure for table `school` */

DROP TABLE IF EXISTS `school`;

CREATE TABLE `school` (
  `school_id` int(11) NOT NULL AUTO_INCREMENT,
  `school_name` varchar(22) DEFAULT NULL,
  PRIMARY KEY (`school_id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

/*Data for the table `school` */

insert  into `school`(`school_id`,`school_name`) values (1,'东区'),(2,'西区'),(3,'南区'),(4,'北区');

/*Table structure for table `score` */

DROP TABLE IF EXISTS `score`;

CREATE TABLE `score` (
  `score_id` int(11) NOT NULL AUTO_INCREMENT,
  `score_schedule` int(11) DEFAULT NULL,
  `score_text` varchar(200) DEFAULT NULL,
  `user_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`score_id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8;

/*Data for the table `score` */

insert  into `score`(`score_id`,`score_schedule`,`score_text`,`user_id`) values (5,NULL,NULL,NULL),(6,NULL,NULL,NULL),(7,NULL,NULL,NULL),(11,2,'45632',43);

/*Table structure for table `sysuser` */

DROP TABLE IF EXISTS `sysuser`;

CREATE TABLE `sysuser` (
  `sys_id` int(11) NOT NULL AUTO_INCREMENT,
  `sys_name` varchar(123) DEFAULT NULL,
  `sys_password` varchar(123) DEFAULT NULL,
  PRIMARY KEY (`sys_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

/*Data for the table `sysuser` */

insert  into `sysuser`(`sys_id`,`sys_name`,`sys_password`) values (1,'admin','admin');

/*Table structure for table `tea` */

DROP TABLE IF EXISTS `tea`;

CREATE TABLE `tea` (
  `tea_id` int(11) NOT NULL AUTO_INCREMENT,
  `tea_name` varchar(12) DEFAULT NULL,
  `tea_sex` varchar(12) DEFAULT NULL,
  `tea_phone` varchar(16) DEFAULT NULL,
  `tea_class` int(11) DEFAULT NULL,
  `tea_year` int(11) DEFAULT NULL,
  `school_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`tea_id`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8;

/*Data for the table `tea` */

insert  into `tea`(`tea_id`,`tea_name`,`tea_sex`,`tea_phone`,`tea_class`,`tea_year`,`school_id`) values (0,'冯啊','男','61332',3,2,1),(2,'z','男','1923065321',3,52,3),(8,'冯','男','14725836910',2,5,4),(11,'冯啊','男','123',3,2,2),(13,'z','男','1923065321',3,5,3);

/*Table structure for table `user` */

DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
  `user_id` int(11) NOT NULL AUTO_INCREMENT,
  `user_name` varchar(123) DEFAULT NULL,
  `user_emal` varchar(123) DEFAULT NULL,
  `user_password` varchar(123) DEFAULT NULL,
  `user_sex` varchar(123) DEFAULT NULL,
  `user_date` varchar(123) DEFAULT NULL,
  `user_schedule` int(11) DEFAULT NULL,
  `tea_userid` int(11) DEFAULT NULL,
  `car_id` int(11) DEFAULT NULL,
  `school_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=46 DEFAULT CHARSET=utf8;

/*Data for the table `user` */

insert  into `user`(`user_id`,`user_name`,`user_emal`,`user_password`,`user_sex`,`user_date`,`user_schedule`,`tea_userid`,`car_id`,`school_id`) values (43,'123123','123','123','女','2019-10-02',1,13,13,3),(44,'','123','123','男','2019-12-09',3,8,13,NULL),(45,'测试','123','123','男','2019-12-09',3,13,13,NULL);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
