/*
Navicat MySQL Data Transfer

Source Server         : aliyu
Source Server Version : 50716
Source Host           : 47.100.211.121:3306
Source Database       : yellow_page

Target Server Type    : MYSQL
Target Server Version : 50716
File Encoding         : 65001

Date: 2018-05-31 17:50:38
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for danmaku
-- ----------------------------
DROP TABLE IF EXISTS `danmaku`;
CREATE TABLE `danmaku` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `create_dt` datetime(3) DEFAULT CURRENT_TIMESTAMP(3),
  `modify_dt` datetime(3) DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP(3),
  `content` varchar(255) DEFAULT NULL,
  `danmaku_status` int(11) DEFAULT NULL,
  `image_detail_id` bigint(20) DEFAULT NULL,
  `user_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
