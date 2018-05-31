/*
Navicat MySQL Data Transfer

Source Server         : aliyu
Source Server Version : 50716
Source Host           : 47.100.211.121:3306
Source Database       : yellow_page

Target Server Type    : MYSQL
Target Server Version : 50716
File Encoding         : 65001

Date: 2018-05-31 17:50:54
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for image_list
-- ----------------------------
DROP TABLE IF EXISTS `image_list`;
CREATE TABLE `image_list` (
  `id` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `head_image` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `height` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `title` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `type` int(11) DEFAULT NULL,
  `upload_dt` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `width` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
