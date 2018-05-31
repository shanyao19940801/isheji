/*
Navicat MySQL Data Transfer

Source Server         : aliyu
Source Server Version : 50716
Source Host           : 47.100.211.121:3306
Source Database       : yellow_page

Target Server Type    : MYSQL
Target Server Version : 50716
File Encoding         : 65001

Date: 2018-05-31 17:50:43
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for image_detail
-- ----------------------------
DROP TABLE IF EXISTS `image_detail`;
CREATE TABLE `image_detail` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `height` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `image_list_id` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `url` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `width` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2540 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
