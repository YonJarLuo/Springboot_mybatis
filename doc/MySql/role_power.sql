/*
Navicat MySQL Data Transfer

Source Server         : 本地
Source Server Version : 50719
Source Host           : localhost:3306
Source Database       : myself_db

Target Server Type    : MYSQL
Target Server Version : 50719
File Encoding         : 65001

Date: 2018-07-24 15:39:33
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for role_power
-- ----------------------------
DROP TABLE IF EXISTS `role_power`;
CREATE TABLE `role_power` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `r_id` int(10) NOT NULL,
  `p_id` int(10) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of role_power
-- ----------------------------
INSERT INTO `role_power` VALUES ('1', '1', '1');
INSERT INTO `role_power` VALUES ('2', '1', '2');
INSERT INTO `role_power` VALUES ('3', '1', '3');
INSERT INTO `role_power` VALUES ('4', '1', '4');
INSERT INTO `role_power` VALUES ('5', '2', '1');
INSERT INTO `role_power` VALUES ('6', '2', '4');
