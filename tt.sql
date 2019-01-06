/*
Navicat MySQL Data Transfer

Source Server         : ll
Source Server Version : 50561
Source Host           : localhost:3306
Source Database       : test

Target Server Type    : MYSQL
Target Server Version : 50561
File Encoding         : 65001

Date: 2019-01-07 02:18:00
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for tt
-- ----------------------------
DROP TABLE IF EXISTS `tt`;
CREATE TABLE `tt` (
  `cno` int(11) DEFAULT NULL,
  `user` varchar(20) DEFAULT NULL,
  `passwd` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tt
-- ----------------------------
INSERT INTO `tt` VALUES ('1', '大明', '123');
INSERT INTO `tt` VALUES ('2', '李大刚', '123456');
