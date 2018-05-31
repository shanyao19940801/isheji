/*
Navicat MySQL Data Transfer

Source Server         : aliyu
Source Server Version : 50716
Source Host           : 47.100.211.121:3306
Source Database       : yellow_page

Target Server Type    : MYSQL
Target Server Version : 50716
File Encoding         : 65001

Date: 2018-05-31 17:51:12
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for love
-- ----------------------------
DROP TABLE IF EXISTS `love`;
CREATE TABLE `love` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `imageid` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `username` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `create_dt` datetime(3) DEFAULT CURRENT_TIMESTAMP(3),
  `modify_dt` datetime(3) DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP(3),
  `image_list_id` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `is_love` bit(1) DEFAULT NULL,
  `user_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
