/*
SQLyog Ultimate v11.27 (32 bit)
MySQL - 5.1.49-community : Database - qingzhi
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`qingzhi` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `qingzhi`;

/*Table structure for table `qz_article` */

DROP TABLE IF EXISTS `qz_article`;

CREATE TABLE `qz_article` (
  `id` int(222) NOT NULL AUTO_INCREMENT,
  `art_name` varchar(22) DEFAULT NULL,
  `art_duinei` varchar(22) DEFAULT NULL,
  `art_time` varchar(22) DEFAULT NULL,
  `art_site` varchar(22) DEFAULT NULL,
  `art_leirong` varchar(10000) DEFAULT NULL,
  `art_xqrs` varchar(22) DEFAULT NULL,
  `art_yyrs` varchar(12) DEFAULT NULL,
  `art_state` varchar(22) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

/*Data for the table `qz_article` */

insert  into `qz_article`(`id`,`art_name`,`art_duinei`,`art_time`,`art_site`,`art_leirong`,`art_xqrs`,`art_yyrs`,`art_state`) values (1,'关于“益童成长之小小运动员”的工作人员的招募','队外','2019-2-20 9:00 至 2019-','广东省佛山市南海区显纲社区活动中心','为了让小朋友更热衷于运动，了解运动知识，有更好的机会锻炼身体，广东东软学院青年志愿者服务队将于2019年2月20日（星期六）上午9:00-11:00举行“益童成长之小小运动员”活动，为了让活动更好进行，现招募12位工作人员，希望有兴趣，有热情的你们积极报名参与，谢谢!','12','2','正在招募'),(2,'关于“重塑艺术，公益传承国粹”工作人员的招募','队内','2019年2月21日 9：00—11：00','佛山市南海区狮山镇显子岗村','为了让孩子们了解国粹，提高他们对国粹的兴趣，广东东软学院青年志愿者服务队将于2019年2月21日（星期日）佛山市南海区狮山镇显子岗村举行“重塑艺术，公益传承国粹”活动，为了让活动更好进行，现招募11名工作人员，希望有兴趣，有热情的你们积极报名参与，谢谢!','11','2','正在招募'),(3,'关于“保护碧水蓝天 筑梦绿色家园”之与“气”','队内','2019年2月21日（周日）早上8:30-1','罗村中心广场状元居委会','为了引领小朋友了解空气污染、空气的重要性，以及如何保护我们的蓝天，广东东软学院青年志愿者服务队将于2019年2月21日（周日）开展“保护碧水蓝天 筑梦绿色家园”之与“气”肩并肩的活动，现需要招募12名工作人员配合完成此活动。希望有兴趣，有热情的你积极参与报名，谢谢！','10','2','正在招募'),(4,'传承古文化，塑造新人才-武术之咏春” 活动','队外','2019年3月20日（星期六）早上7:30—','佛山南海象岭村委会','为了通过咏春训练提高小朋友注意力及应变思维能力，增加小朋友的自信心和毅力。广东东软学院青年志愿者服务队将于2019年3月20日（星期六）在象岭村委会开展“传承古文化，塑造新人才–武术之咏春”活动，现招募7名工作人员，希望有热情、有兴趣的志愿者积极参与，谢谢！','9','2','完结'),(5,'关于“我的航天梦-我的航天蓝图”活动的工作人','队外','2019年3月21日 早上8：00-12：0','山南社区','为了让小朋友学习和接触航天知识,广东东软学院青年志愿者服务队将于2019年3月21日（星期日）在山南社区开展“我的航天梦-我的航天蓝图”活动，为了让活动更好进行，现需招募18名工作人员，2名摄影师希望有兴趣，有热情的你们积极报名参与，谢谢!','13','2','正在招募'),(6,'关于“爱在手中更美丽”长者手语体验工作坊的工','队外','2019-04-03  15:00-17：0','广东省佛山市南海区小塘老龄人活动中心','通过对塘中社区长者们进行简单的手语教学，让他们学习和熟悉一些手语的知识，丰富他们的文化生活，增添长者们的生活乐趣。广东东软学院青年志愿者服务队将于2019年04月03日（星期三）下午15:00-17:00举行“爱在手中更美丽”长者手语教学活动，为了让活动更好进行，现招募5位工作人员，希望有兴趣，有热情的你们积极报名参与，谢谢!','5','1','完结'),(7,'关于“我与雷锋同行之菠萝义工行”工作人员的招','队外','2019年3月23日 9：00—11：00','菠萝义工服务中心','为了让东软学院的同学们进一步了解雷锋精神和提升自身的志愿者素养以及专业技能，现组织20名志愿者外出参观菠萝义工服务中心，希望有兴趣，有热情的你们积极报名参与，谢谢!','25','3','正在招募');

/*Table structure for table `qz_baoming` */

DROP TABLE IF EXISTS `qz_baoming`;

CREATE TABLE `qz_baoming` (
  `art_id` varchar(222) DEFAULT NULL,
  `user_id` varchar(222) DEFAULT NULL,
  `state` varchar(222) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `qz_baoming` */

insert  into `qz_baoming`(`art_id`,`user_id`,`state`) values ('1','1','录用'),('2','1','未录用'),('3','2','录用'),('3','2','未录用'),('3','1','录用'),('4','1','正在审核'),('3','1','正在审核'),('2','1','正在审核');

/*Table structure for table `qz_liuyan` */

DROP TABLE IF EXISTS `qz_liuyan`;

CREATE TABLE `qz_liuyan` (
  `id` varchar(222) DEFAULT NULL,
  `ly_time` varchar(22) DEFAULT NULL,
  `ly_neirong` varchar(222) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `qz_liuyan` */

insert  into `qz_liuyan`(`id`,`ly_time`,`ly_neirong`) values ('1','2019-02-17','sdfghjhfgty'),(NULL,NULL,NULL);

/*Table structure for table `qz_tuiwen` */

DROP TABLE IF EXISTS `qz_tuiwen`;

CREATE TABLE `qz_tuiwen` (
  `id` int(222) NOT NULL AUTO_INCREMENT,
  `tw_biaoti` varchar(222) DEFAULT NULL,
  `tw_tupian` varchar(22) DEFAULT NULL,
  `tw_lianjie` varchar(111) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

/*Data for the table `qz_tuiwen` */

insert  into `qz_tuiwen`(`id`,`tw_biaoti`,`tw_tupian`,`tw_lianjie`) values (1,'​青志迎新大狂欢，专属好礼免费送','images/01.jpg','https://mp.weixin.qq.com/s/MjMsHG0F7N_4I2LYG9fgRA'),(2,'我们想做一些特别的东西，给可爱的人','images/03.jpg','https://mp.weixin.qq.com/s/DhI67QnGY-tyScWRgsbjWw'),(3,'​青志迎新大狂欢，专属好礼免费送','images/04.jpg','https://mp.weixin.qq.com/s/zDQrfRDCmuyoGzSWTb-HgQ'),(4,'我们想做一些特别的东西，给可爱的人','images/06.jpg','https://mp.weixin.qq.com/s/uFAE5Hyr2Ajs9y3-xZZfhg');

/*Table structure for table `qz_user` */

DROP TABLE IF EXISTS `qz_user`;

CREATE TABLE `qz_user` (
  `id` int(222) NOT NULL AUTO_INCREMENT,
  `qz_name` varchar(22) DEFAULT NULL,
  `qz_passworld` varchar(22) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

/*Data for the table `qz_user` */

insert  into `qz_user`(`id`,`qz_name`,`qz_passworld`) values (1,'1','1'),(2,'2','2'),(3,'3','3');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
