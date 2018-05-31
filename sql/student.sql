/*
Navicat MySQL Data Transfer

Source Server         : aliyu
Source Server Version : 50716
Source Host           : 47.100.211.121:3306
Source Database       : yellow_page

Target Server Type    : MYSQL
Target Server Version : 50716
File Encoding         : 65001

Date: 2018-05-31 17:51:19
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for student
-- ----------------------------
DROP TABLE IF EXISTS `student`;
CREATE TABLE `student` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `age` int(11) DEFAULT NULL,
  `name` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
