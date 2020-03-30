/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 80015
Source Host           : localhost:3306
Source Database       : ant_hotel

Target Server Type    : MYSQL
Target Server Version : 80015
File Encoding         : 65001

Date: 2020-03-30 15:27:26
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for canteen_record
-- ----------------------------
DROP TABLE IF EXISTS `canteen_record`;
CREATE TABLE `canteen_record` (
  `userId` varchar(255) NOT NULL COMMENT '用户编号',
  `name` varchar(255) DEFAULT '' COMMENT '姓名',
  `food` text,
  `totalPrice` int(5) DEFAULT NULL COMMENT '用餐总价',
  `coupon` int(2) DEFAULT NULL COMMENT '用餐券',
  `cost` int(5) DEFAULT NULL COMMENT '实付金额',
  `onTime` varchar(255) DEFAULT NULL COMMENT '开始时间'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Records of canteen_record
-- ----------------------------
INSERT INTO `canteen_record` VALUES ('2', '老八', '老八秘制小汉堡 2	腐乳 2	臭豆腐 3	烤鸭の尻 1	', '20', '50', '-30', '2020-03-30 13:09:50');

-- ----------------------------
-- Table structure for check_in
-- ----------------------------
DROP TABLE IF EXISTS `check_in`;
CREATE TABLE `check_in` (
  `userId` varchar(11) NOT NULL COMMENT '入住id',
  `reserveId` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `roomNumber` varchar(8) NOT NULL COMMENT '房间号',
  `roomType` varchar(16) DEFAULT NULL COMMENT '房间类型',
  `checkInTime` varchar(255) DEFAULT '0000-00-00 00:00:00' COMMENT '入住时间',
  `updateTime` varchar(255) DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`userId`),
  KEY `fk_1` (`reserveId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci ROW_FORMAT=DYNAMIC COMMENT='入住退房登记表';

-- ----------------------------
-- Records of check_in
-- ----------------------------
INSERT INTO `check_in` VALUES ('1', '', '大便', '145', '单人', '2020-03-29 19:41:23', '2020-03-29 19:41:23');
INSERT INTO `check_in` VALUES ('2', '', '老八', '234', '单人', '2020-03-30 12:53:40', '2020-03-30 12:53:40');
INSERT INTO `check_in` VALUES ('3', '', '老九', '421', '双人', '2020-03-30 12:54:18', '2020-03-30 12:54:18');
INSERT INTO `check_in` VALUES ('4', '', '老十', '510', '双人', '2020-03-30 13:49:44', '2020-03-30 13:49:44');

-- ----------------------------
-- Table structure for check_out
-- ----------------------------
DROP TABLE IF EXISTS `check_out`;
CREATE TABLE `check_out` (
  `userId` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '订单编号',
  `name` varchar(255) DEFAULT '' COMMENT '姓名',
  `roomId` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `roomType` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT '' COMMENT '房间类型',
  `checkOutTime` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '实际入住时间',
  `cost` decimal(10,2) DEFAULT NULL COMMENT '实收金额',
  `updateTime` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`userId`),
  KEY `orderId` (`userId`),
  CONSTRAINT `check_out_fk_1` FOREIGN KEY (`userId`) REFERENCES `check_in` (`userId`) ON DELETE CASCADE,
  CONSTRAINT `check_out_ibfk_1` FOREIGN KEY (`userId`) REFERENCES `check_in` (`userId`) ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci ROW_FORMAT=DYNAMIC COMMENT='退订单';

-- ----------------------------
-- Records of check_out
-- ----------------------------
INSERT INTO `check_out` VALUES ('2', '老八', '234', '单人', '2020-03-30 13:42:46', '25.00', '2020-03-30 13:42:46');
INSERT INTO `check_out` VALUES ('3', '老九', '421', '双人', '2020-03-30 15:23:33', '188.88', '2020-03-30 15:23:33');

-- ----------------------------
-- Table structure for coupons
-- ----------------------------
DROP TABLE IF EXISTS `coupons`;
CREATE TABLE `coupons` (
  `couponId` varchar(255) NOT NULL,
  `couponType` varchar(255) DEFAULT NULL COMMENT '餐券编号',
  `couponRate` int(2) DEFAULT NULL COMMENT '餐券数值',
  PRIMARY KEY (`couponId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Records of coupons
-- ----------------------------
INSERT INTO `coupons` VALUES ('1', '小代金券', '10');
INSERT INTO `coupons` VALUES ('2', '中代金券', '50');
INSERT INTO `coupons` VALUES ('3', '大代金券', '100');

-- ----------------------------
-- Table structure for fitness_record
-- ----------------------------
DROP TABLE IF EXISTS `fitness_record`;
CREATE TABLE `fitness_record` (
  `userId` varchar(255) NOT NULL COMMENT '用户编号',
  `name` varchar(255) DEFAULT '' COMMENT '姓名',
  `fitness_type` varchar(255) DEFAULT NULL COMMENT '健身方式',
  `onTime` varchar(255) DEFAULT NULL COMMENT '开始时间'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Records of fitness_record
-- ----------------------------
INSERT INTO `fitness_record` VALUES ('1', '大便', '吃饭', '2020-03-30 13:01:37');
INSERT INTO `fitness_record` VALUES ('2', '老八', '摔跤', '2020-03-30 13:01:53');

-- ----------------------------
-- Table structure for fitness_type
-- ----------------------------
DROP TABLE IF EXISTS `fitness_type`;
CREATE TABLE `fitness_type` (
  `fitnessToolId` varchar(255) NOT NULL,
  `name` varchar(255) DEFAULT '' COMMENT '器材名',
  PRIMARY KEY (`fitnessToolId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Records of fitness_type
-- ----------------------------
INSERT INTO `fitness_type` VALUES ('1', '摔跤');
INSERT INTO `fitness_type` VALUES ('2', '跑步');
INSERT INTO `fitness_type` VALUES ('3', '吃饭');
INSERT INTO `fitness_type` VALUES ('4', '睡觉');

-- ----------------------------
-- Table structure for menu
-- ----------------------------
DROP TABLE IF EXISTS `menu`;
CREATE TABLE `menu` (
  `foodId` varchar(255) NOT NULL COMMENT '食物编号',
  `foodName` varchar(255) DEFAULT NULL COMMENT '食物名字',
  `price` int(3) DEFAULT NULL COMMENT '食物单价',
  PRIMARY KEY (`foodId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Records of menu
-- ----------------------------
INSERT INTO `menu` VALUES ('1', '老八秘制小汉堡', '2');
INSERT INTO `menu` VALUES ('2', '腐乳', '1');
INSERT INTO `menu` VALUES ('3', '臭豆腐', '3');
INSERT INTO `menu` VALUES ('4', '烤鸭の尻', '5');

-- ----------------------------
-- Table structure for off_record
-- ----------------------------
DROP TABLE IF EXISTS `off_record`;
CREATE TABLE `off_record` (
  `userId` varchar(255) NOT NULL COMMENT '用户编号',
  `name` varchar(255) DEFAULT '' COMMENT '姓名',
  `offTime` varchar(255) DEFAULT NULL COMMENT '离屋时间',
  `roomId` varchar(255) NOT NULL COMMENT '房间编号',
  KEY `roomId` (`roomId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Records of off_record
-- ----------------------------
INSERT INTO `off_record` VALUES ('2', '老八', '234', '2020-03-30 13:27:29');
INSERT INTO `off_record` VALUES ('3', '老九', '421', '2020-03-30 13:27:36');

-- ----------------------------
-- Table structure for on_record
-- ----------------------------
DROP TABLE IF EXISTS `on_record`;
CREATE TABLE `on_record` (
  `userId` varchar(255) NOT NULL COMMENT '用户编号',
  `name` varchar(255) DEFAULT '' COMMENT '姓名',
  `onTime` varchar(255) DEFAULT NULL COMMENT '进屋时间',
  `roomId` varchar(255) NOT NULL COMMENT '房间编号',
  KEY `roomId` (`roomId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Records of on_record
-- ----------------------------
INSERT INTO `on_record` VALUES ('2', '老八', '234', '2020-03-30 13:19:43');
INSERT INTO `on_record` VALUES ('3', '老九', '421', '2020-03-30 13:19:59');

-- ----------------------------
-- Table structure for reserve_record
-- ----------------------------
DROP TABLE IF EXISTS `reserve_record`;
CREATE TABLE `reserve_record` (
  `reserveId` int(4) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT '' COMMENT '姓名',
  `phoneNumber` varchar(255) DEFAULT NULL,
  `roomType` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT '' COMMENT '房间类型',
  `reserveTime` varchar(255) DEFAULT NULL COMMENT '预计退房时间',
  PRIMARY KEY (`reserveId`)
) ENGINE=InnoDB AUTO_INCREMENT=132 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Records of reserve_record
-- ----------------------------
INSERT INTO `reserve_record` VALUES ('130', '老10', '1234', '单人', '2020-03-30 12:41:44');
INSERT INTO `reserve_record` VALUES ('131', '老11', '1234', '单人', '2020-03-30 12:42:09');

-- ----------------------------
-- Table structure for room_info
-- ----------------------------
DROP TABLE IF EXISTS `room_info`;
CREATE TABLE `room_info` (
  `roomId` varchar(255) NOT NULL,
  `roomType` varchar(255) DEFAULT NULL COMMENT '房间类型',
  `roomStatus` varchar(255) DEFAULT NULL COMMENT '房间状态 1 已住宿 -1未住宿 0 预定中',
  `roomPrice` decimal(10,2) DEFAULT NULL COMMENT '房间价格 / 天',
  `hourPrice` decimal(10,2) DEFAULT NULL COMMENT '钟点房 / 小时',
  PRIMARY KEY (`roomId`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Records of room_info
-- ----------------------------
INSERT INTO `room_info` VALUES ('123', '单人', '0', '23.00', '2.00');
INSERT INTO `room_info` VALUES ('145', '单人', '0', '24.00', '2.00');
INSERT INTO `room_info` VALUES ('234', '单人', '1', '25.00', '3.00');
INSERT INTO `room_info` VALUES ('245', '双人', '0', '30.00', '4.00');
INSERT INTO `room_info` VALUES ('421', '双人', '1', '188.88', '18.88');
INSERT INTO `room_info` VALUES ('510', '双人', '0', '198.00', '19.80');
INSERT INTO `room_info` VALUES ('511', '双人', '1', '198.00', '19.80');
INSERT INTO `room_info` VALUES ('512', '双人', '1', '198.00', '19.80');
INSERT INTO `room_info` VALUES ('513', '双人', '1', '198.00', '19.80');
INSERT INTO `room_info` VALUES ('514', '双人', '1', '198.00', '19.80');
INSERT INTO `room_info` VALUES ('515', '双人', '1', '198.00', '19.80');

-- ----------------------------
-- Table structure for room_live_record
-- ----------------------------
DROP TABLE IF EXISTS `room_live_record`;
CREATE TABLE `room_live_record` (
  `userId` varchar(255) NOT NULL,
  `name` varchar(255) DEFAULT '' COMMENT '姓名',
  `signTime` varchar(255) DEFAULT NULL COMMENT '入住时间',
  `leaveTime` varchar(255) DEFAULT NULL COMMENT '退房时间',
  `roomId` varchar(255) DEFAULT '' COMMENT '房间号',
  `cost` decimal(10,2) DEFAULT NULL COMMENT '消费金额',
  PRIMARY KEY (`userId`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Records of room_live_record
-- ----------------------------
INSERT INTO `room_live_record` VALUES ('1', '大便', '2020-03-29 19:41:23', '', '145', '0.00');
INSERT INTO `room_live_record` VALUES ('2', '老八', '2020-03-30 12:47:33', '2020-03-30 13:42:46', '234', '25.00');
INSERT INTO `room_live_record` VALUES ('3', '老九', '2020-03-30 12:54:18', '2020-03-30 15:23:33', '421', '188.88');
INSERT INTO `room_live_record` VALUES ('4', '老十', '2020-03-30 13:49:44', '', '510', '0.00');

-- ----------------------------
-- Table structure for user_face_info
-- ----------------------------
DROP TABLE IF EXISTS `user_face_info`;
CREATE TABLE `user_face_info` (
  `userId` varchar(255) NOT NULL,
  `groupId` int(11) DEFAULT NULL,
  `faceId` varchar(31) DEFAULT NULL,
  `name` varchar(63) DEFAULT NULL COMMENT '名字',
  `age` int(3) DEFAULT NULL COMMENT '年纪',
  `email` varchar(255) DEFAULT NULL COMMENT '邮箱地址',
  `gender` smallint(1) DEFAULT NULL COMMENT '性别，1=男，2=女',
  `phoneNumber` varchar(11) DEFAULT NULL,
  `faceFeature` blob,
  `createTime` timestamp NULL DEFAULT NULL,
  `updateTime` timestamp NULL DEFAULT NULL,
  `Fpath` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`userId`) USING BTREE,
  KEY `GROUP_ID` (`groupId`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Records of user_face_info
-- ----------------------------

-- ----------------------------
-- Table structure for user_item
-- ----------------------------
DROP TABLE IF EXISTS `user_item`;
CREATE TABLE `user_item` (
  `userId` varchar(255) NOT NULL COMMENT '用户编号',
  `name` varchar(255) DEFAULT NULL,
  `roomId` varchar(255) DEFAULT NULL,
  `roomCard` tinyint(1) DEFAULT NULL COMMENT '房卡',
  `key` tinyint(1) DEFAULT NULL COMMENT '钥匙',
  `coupon1` int(2) DEFAULT NULL COMMENT '用餐券',
  `coupon2` int(2) DEFAULT NULL COMMENT '用餐券',
  `coupon3` int(2) DEFAULT NULL COMMENT '用餐券',
  PRIMARY KEY (`userId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Records of user_item
-- ----------------------------
INSERT INTO `user_item` VALUES ('1', '大便', '145', '1', '1', '0', '1', '1');
INSERT INTO `user_item` VALUES ('4', '老十', '510', '1', '1', '1', '1', '1');
