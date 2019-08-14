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

 Date: 14/08/2019 23:33:15
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for node
-- ----------------------------
DROP TABLE IF EXISTS `node`;
CREATE TABLE `node` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(32) NOT NULL,
  `parent_id` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8 COMMENT='节点表';

-- ----------------------------
-- Records of node
-- ----------------------------
BEGIN;
INSERT INTO `node` VALUES (1, '一级节点A', 0);
INSERT INTO `node` VALUES (2, '一级节点B', 0);
INSERT INTO `node` VALUES (3, '一级节点C', 0);
INSERT INTO `node` VALUES (4, '二级节点AA', 1);
INSERT INTO `node` VALUES (5, '二级节点aa', 1);
INSERT INTO `node` VALUES (6, '二级节点BB', 2);
INSERT INTO `node` VALUES (7, '三级级节点AAA', 4);
INSERT INTO `node` VALUES (8, '三级级节点aaa', 4);
INSERT INTO `node` VALUES (9, '三级级节点BBB', 6);
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
