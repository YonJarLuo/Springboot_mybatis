/*
 Navicat Premium Data Transfer

 Source Server         : 本地
 Source Server Type    : MySQL
 Source Server Version : 50726
 Source Host           : localhost:3306
 Source Schema         : myself_database

 Target Server Type    : MySQL
 Target Server Version : 50726
 File Encoding         : 65001

 Date: 14/08/2019 23:30:44
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `u_name` varchar(20) NOT NULL,
  `age` int(12) NOT NULL,
  `u_id` int(10) NOT NULL,
  KEY `id` (`u_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
BEGIN;
INSERT INTO `user` VALUES ('luoyj', 23, 1);
INSERT INTO `user` VALUES ('YonJar', 24, 2);
INSERT INTO `user` VALUES ('达摩', 16, 4);
INSERT INTO `user` VALUES ('百里守约', 15, 5);
INSERT INTO `user` VALUES ('兰陵王', 19, 6);
INSERT INTO `user` VALUES ('韩信', 20, 7);
INSERT INTO `user` VALUES ('南宫寒', 23, 8);
INSERT INTO `user` VALUES ('南宫燕', 24, 9);
INSERT INTO `user` VALUES ('南宫影', 21, 10);
INSERT INTO `user` VALUES ('亚索', 24, 11);
INSERT INTO `user` VALUES ('锐雯', 21, 12);
INSERT INTO `user` VALUES ('瞎子', 22, 13);
INSERT INTO `user` VALUES ('周杰伦', 31, 14);
INSERT INTO `user` VALUES ('泰勒斯威夫特', 29, 15);
INSERT INTO `user` VALUES ('陈粒', 28, 16);
INSERT INTO `user` VALUES ('枯木逢春', 27, 17);
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
