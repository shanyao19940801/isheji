/*
Navicat MySQL Data Transfer

Source Server         : aliyu
Source Server Version : 50716
Source Host           : 47.100.211.121:3306
Source Database       : yellow_page

Target Server Type    : MYSQL
Target Server Version : 50716
File Encoding         : 65001

Date: 2018-05-31 17:51:29
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `code` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `mail` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `password` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `staus` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `username` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `loginid` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `count` int(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=22 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
