/*
Navicat MySQL Data Transfer

Source Server         : root
Source Server Version : 50523
Source Host           : localhost:3306
Source Database       : javaee

Target Server Type    : MYSQL
Target Server Version : 50523
File Encoding         : 65001

Date: 2018-11-14 12:39:09
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `lytable`
-- ----------------------------
DROP TABLE IF EXISTS `lytable`;
CREATE TABLE `lytable` (
  `id` int(4) NOT NULL AUTO_INCREMENT,
  `userId` int(4) DEFAULT NULL,
  `date` datetime DEFAULT NULL,
  `title` varchar(20) DEFAULT NULL,
  `content` varchar(500) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `userId-lyId` (`userId`),
  CONSTRAINT `userId-lyId` FOREIGN KEY (`userId`) REFERENCES `usertable` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of lytable
-- ----------------------------
INSERT INTO `lytable` VALUES ('1', '1', '2018-11-10 00:00:00', '古赛昆', null);
INSERT INTO `lytable` VALUES ('2', '1', '2018-11-10 00:00:00', 'Fcc', null);
INSERT INTO `lytable` VALUES ('3', '1', '2018-11-10 00:00:00', 'Fcc', null);
INSERT INTO `lytable` VALUES ('4', '1', '2018-11-10 00:00:00', '古赛昆', null);

-- ----------------------------
-- Table structure for `student`
-- ----------------------------
DROP TABLE IF EXISTS `student`;
CREATE TABLE `student` (
  `id` int(6) NOT NULL AUTO_INCREMENT,
  `name` varchar(8) DEFAULT NULL,
  `gender` int(2) DEFAULT NULL,
  `birthday` varchar(50) DEFAULT NULL,
  `professional` varchar(50) DEFAULT NULL,
  `note` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1610701107 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of student
-- ----------------------------
INSERT INTO `student` VALUES ('1610701106', 'fcc', '1', '软件工程', '2018-11-15', 'Java');

-- ----------------------------
-- Table structure for `usertable`
-- ----------------------------
DROP TABLE IF EXISTS `usertable`;
CREATE TABLE `usertable` (
  `id` int(4) NOT NULL AUTO_INCREMENT,
  `username` varchar(20) DEFAULT NULL,
  `password` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of usertable
-- ----------------------------
INSERT INTO `usertable` VALUES ('1', 'fc', '123');
