/*
Navicat MySQL Data Transfer

Source Server         : root
Source Server Version : 50523
Source Host           : localhost:3306
Source Database       : sh

Target Server Type    : MYSQL
Target Server Version : 50523
File Encoding         : 65001

Date: 2018-11-24 22:47:09
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `course`
-- ----------------------------
DROP TABLE IF EXISTS `course`;
CREATE TABLE `course` (
  `course_number` char(3) NOT NULL DEFAULT '',
  `course_name` char(12) DEFAULT NULL,
  `school_year` int(2) DEFAULT NULL,
  `course_time` int(8) DEFAULT NULL,
  `course_credit` int(8) DEFAULT NULL,
  PRIMARY KEY (`course_number`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of course
-- ----------------------------

-- ----------------------------
-- Table structure for `login`
-- ----------------------------
DROP TABLE IF EXISTS `login`;
CREATE TABLE `login` (
  `id` int(4) NOT NULL AUTO_INCREMENT,
  `student_number` char(20) NOT NULL,
  `password` char(20) DEFAULT NULL,
  PRIMARY KEY (`id`,`student_number`),
  KEY `student_number` (`student_number`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of login
-- ----------------------------
INSERT INTO `login` VALUES ('1', '1610701106', '123');

-- ----------------------------
-- Table structure for `professional`
-- ----------------------------
DROP TABLE IF EXISTS `professional`;
CREATE TABLE `professional` (
  `id` int(4) NOT NULL AUTO_INCREMENT,
  `professional_name` char(12) DEFAULT NULL,
  `studnet_number` int(6) DEFAULT NULL,
  `counselor` char(8) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of professional
-- ----------------------------

-- ----------------------------
-- Table structure for `student`
-- ----------------------------
DROP TABLE IF EXISTS `student`;
CREATE TABLE `student` (
  `student_number` char(20) NOT NULL DEFAULT '0',
  `student_name` char(20) DEFAULT NULL,
  `gender` int(2) DEFAULT NULL,
  `birthday` datetime DEFAULT NULL,
  `profiessional_id` int(5) DEFAULT NULL,
  `total_credit` int(5) DEFAULT NULL,
  `note` varchar(500) DEFAULT NULL,
  `photo` blob,
  PRIMARY KEY (`student_number`),
  CONSTRAINT `studentNumber` FOREIGN KEY (`student_number`) REFERENCES `login` (`student_number`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of student
-- ----------------------------

-- ----------------------------
-- Table structure for `student_course`
-- ----------------------------
DROP TABLE IF EXISTS `student_course`;
CREATE TABLE `student_course` (
  `sutdent_number` varchar(6) NOT NULL DEFAULT '',
  `course_number` varchar(6) NOT NULL DEFAULT '',
  PRIMARY KEY (`sutdent_number`,`course_number`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of student_course
-- ----------------------------

-- ----------------------------
-- Table structure for `student_grade`
-- ----------------------------
DROP TABLE IF EXISTS `student_grade`;
CREATE TABLE `student_grade` (
  `student_number` char(6) NOT NULL DEFAULT '',
  `course_number` char(3) DEFAULT NULL,
  `grade` int(4) DEFAULT NULL,
  `credit` int(4) DEFAULT NULL,
  PRIMARY KEY (`student_number`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of student_grade
-- ----------------------------
