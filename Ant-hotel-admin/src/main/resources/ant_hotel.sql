/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 80015
Source Host           : localhost:3306
Source Database       : ant_hotel

Target Server Type    : MYSQL
Target Server Version : 80015
File Encoding         : 65001

Date: 2020-04-30 22:03:41
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for admin
-- ----------------------------
DROP TABLE IF EXISTS `admin`;
CREATE TABLE `admin` (
  `username` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `avatar` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of admin
-- ----------------------------
INSERT INTO `admin` VALUES ('admin', 'e10adc3949ba59abbe56e057f20f883e', 'devhui', 'https://tvax4.sinaimg.cn/large/006nIlf0ly1gam30t0eddj31o01o0h7q.jpg');

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
  `onTime` datetime DEFAULT NULL COMMENT '开始时间'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Records of canteen_record
-- ----------------------------
INSERT INTO `canteen_record` VALUES ('2', '老八', '老八秘制小汉堡 2	腐乳 2	臭豆腐 3	烤鸭の尻 1	', '20', '50', '-30', '2020-03-30 13:09:50');
INSERT INTO `canteen_record` VALUES ('1', 'son', '老八秘制小汉堡 2	腐乳 1	臭豆腐 3	烤鸭の尻 5	', '39', '0', '39', '2020-04-09 21:40:32');
INSERT INTO `canteen_record` VALUES ('1', 'son', '老八秘制小汉堡 2	腐乳 1	臭豆腐 3	烤鸭の尻 5	', '39', '20', '19', '2020-04-17 17:55:22');

-- ----------------------------
-- Table structure for check_in
-- ----------------------------
DROP TABLE IF EXISTS `check_in`;
CREATE TABLE `check_in` (
  `userId` varchar(11) NOT NULL COMMENT '入住id',
  `name` varchar(255) DEFAULT NULL,
  `roomId` varchar(11) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '房间号',
  `phoneNumber` varchar(16) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '房间类型',
  `checkInTime` datetime DEFAULT '0000-00-00 00:00:00' COMMENT '入住时间',
  `updateTime` datetime DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`userId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci ROW_FORMAT=DYNAMIC COMMENT='入住退房登记表';

-- ----------------------------
-- Records of check_in
-- ----------------------------
INSERT INTO `check_in` VALUES ('1', 'son', '37030301101', '123', '2020-04-30 18:20:19', '2020-04-30 18:20:19');

-- ----------------------------
-- Table structure for check_out
-- ----------------------------
DROP TABLE IF EXISTS `check_out`;
CREATE TABLE `check_out` (
  `userId` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '订单编号',
  `name` varchar(255) DEFAULT '' COMMENT '姓名',
  `roomId` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `phoneNumber` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT '' COMMENT '房间类型',
  `cost` decimal(10,2) DEFAULT NULL COMMENT '实收金额',
  `checkOutTime` datetime DEFAULT NULL COMMENT '实际入住时间',
  `updateTime` datetime DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`userId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci ROW_FORMAT=DYNAMIC COMMENT='退订单';

-- ----------------------------
-- Records of check_out
-- ----------------------------
INSERT INTO `check_out` VALUES ('1', 'son', '37030301101', '123', '188.80', '2020-04-30 18:22:26', '2020-04-30 18:22:26');

-- ----------------------------
-- Table structure for coupons
-- ----------------------------
DROP TABLE IF EXISTS `coupons`;
CREATE TABLE `coupons` (
  `couponId` varchar(255) NOT NULL,
  `couponType` varchar(255) DEFAULT NULL COMMENT '餐券编号',
  `couponRate` varchar(255) DEFAULT NULL COMMENT '餐券数值',
  PRIMARY KEY (`couponId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Records of coupons
-- ----------------------------
INSERT INTO `coupons` VALUES ('1', '小', '20');
INSERT INTO `coupons` VALUES ('2', '中', '30');
INSERT INTO `coupons` VALUES ('3', '大', '40');

-- ----------------------------
-- Table structure for fitness_record
-- ----------------------------
DROP TABLE IF EXISTS `fitness_record`;
CREATE TABLE `fitness_record` (
  `userId` varchar(255) NOT NULL COMMENT '用户编号',
  `name` varchar(255) DEFAULT '' COMMENT '姓名',
  `fitness_type` varchar(255) DEFAULT NULL COMMENT '健身方式',
  `onTime` datetime DEFAULT NULL COMMENT '开始时间'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Records of fitness_record
-- ----------------------------
INSERT INTO `fitness_record` VALUES ('1', '大便', '吃饭', '2020-03-30 13:01:37');
INSERT INTO `fitness_record` VALUES ('2', '老八', '摔跤', '2020-03-30 13:01:53');
INSERT INTO `fitness_record` VALUES ('1', 'son', '摔跤', '2020-04-09 21:17:51');
INSERT INTO `fitness_record` VALUES ('1', 'son', '吃饭', '2020-04-17 17:23:12');

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
-- Table structure for hotel_list
-- ----------------------------
DROP TABLE IF EXISTS `hotel_list`;
CREATE TABLE `hotel_list` (
  `hotelId` varchar(255) NOT NULL,
  `hotelName` varchar(255) DEFAULT NULL COMMENT '酒店名字',
  `address` varchar(255) DEFAULT NULL COMMENT '地址',
  `service` varchar(255) DEFAULT NULL COMMENT '服务',
  `baseCost` decimal(10,2) DEFAULT NULL COMMENT '基础消费',
  `score` float(2,1) unsigned zerofill DEFAULT NULL COMMENT '评分',
  PRIMARY KEY (`hotelId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of hotel_list
-- ----------------------------
INSERT INTO `hotel_list` VALUES ('37030301', '蚂蚁酒店一号店', '张店区', '停车场/温泉', '188.00', '4.5');
INSERT INTO `hotel_list` VALUES ('37030302', '蚂蚁酒店理工大店', '张店区', '温泉/餐饮/健身', '88.00', '4.5');
INSERT INTO `hotel_list` VALUES ('37030303', '蚂蚁酒店11号店', '淄川区', '温泉/餐饮/健身', '222.00', '5.0');

-- ----------------------------
-- Table structure for hotel_room_info
-- ----------------------------
DROP TABLE IF EXISTS `hotel_room_info`;
CREATE TABLE `hotel_room_info` (
  `hotelId` varchar(255) DEFAULT NULL COMMENT '酒店Id',
  `roomType` varchar(255) DEFAULT NULL COMMENT '房间类型',
  `roomService` varchar(255) DEFAULT NULL COMMENT '房间服务',
  `roomCount` varchar(255) DEFAULT NULL COMMENT '房间余量',
  `roomPrice` decimal(10,2) DEFAULT NULL COMMENT '房间价格 / 天',
  `hourPrice` decimal(10,2) DEFAULT NULL COMMENT '钟点房 / 小时',
  `id` int(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`id`),
  KEY `hotelId` (`hotelId`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Records of hotel_room_info
-- ----------------------------
INSERT INTO `hotel_room_info` VALUES ('370303011', '标准间', '空调/WIFI/有窗', '4', '188.80', '18.80', '1');
INSERT INTO `hotel_room_info` VALUES ('370303021', '大床房', '空调/WIFI/无窗', '4', '11.00', '11.00', '2');
INSERT INTO `hotel_room_info` VALUES ('370303012', '大床房', '空调/WIFI/无窗', '4', '188.80', '18.80', '6');
INSERT INTO `hotel_room_info` VALUES ('370303031', '标准间', '空调/WIFI/无窗', '4', '11.00', '11.00', '7');

-- ----------------------------
-- Table structure for login
-- ----------------------------
DROP TABLE IF EXISTS `login`;
CREATE TABLE `login` (
  `id` varchar(255) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `role` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of login
-- ----------------------------
INSERT INTO `login` VALUES ('1', 'son', '123', 'user');
INSERT INTO `login` VALUES ('2', 'dad', '123', 'admin');
INSERT INTO `login` VALUES ('3', 'mom', '123', 'operator');
INSERT INTO `login` VALUES ('ogJ985TqPm4fv9g7Hu8P-7PpxN_4', 'test', '123', 'user');

-- ----------------------------
-- Table structure for menu
-- ----------------------------
DROP TABLE IF EXISTS `menu`;
CREATE TABLE `menu` (
  `foodId` varchar(255) NOT NULL COMMENT '食物编号',
  `foodName` varchar(255) DEFAULT NULL COMMENT '食物名字',
  `price` decimal(10,2) DEFAULT NULL COMMENT '食物单价',
  PRIMARY KEY (`foodId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Records of menu
-- ----------------------------
INSERT INTO `menu` VALUES ('1', '老八秘制小汉堡', '2.00');
INSERT INTO `menu` VALUES ('2', '腐乳', '1.00');
INSERT INTO `menu` VALUES ('3', '臭豆腐', '3.00');
INSERT INTO `menu` VALUES ('4', '烤鸭の尻', '5.00');

-- ----------------------------
-- Table structure for off_record
-- ----------------------------
DROP TABLE IF EXISTS `off_record`;
CREATE TABLE `off_record` (
  `userId` varchar(255) NOT NULL COMMENT '用户编号',
  `name` varchar(255) DEFAULT '' COMMENT '姓名',
  `offTime` datetime DEFAULT NULL COMMENT '离屋时间',
  `roomId` varchar(255) NOT NULL COMMENT '房间编号',
  KEY `roomId` (`roomId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Records of off_record
-- ----------------------------
INSERT INTO `off_record` VALUES ('1', 'son', '2020-04-09 21:17:15', '111');
INSERT INTO `off_record` VALUES ('1', 'son', '2020-04-17 17:22:34', '111');

-- ----------------------------
-- Table structure for on_record
-- ----------------------------
DROP TABLE IF EXISTS `on_record`;
CREATE TABLE `on_record` (
  `userId` varchar(255) NOT NULL COMMENT '用户编号',
  `name` varchar(255) DEFAULT '' COMMENT '姓名',
  `onTime` datetime DEFAULT NULL COMMENT '进屋时间',
  `roomId` varchar(255) NOT NULL COMMENT '房间编号',
  KEY `roomId` (`roomId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Records of on_record
-- ----------------------------
INSERT INTO `on_record` VALUES ('1', 'son', '2020-04-09 21:17:12', '111');
INSERT INTO `on_record` VALUES ('1', 'son', '2020-04-17 17:22:25', '111');

-- ----------------------------
-- Table structure for reserve_record
-- ----------------------------
DROP TABLE IF EXISTS `reserve_record`;
CREATE TABLE `reserve_record` (
  `orderId` varchar(255) NOT NULL COMMENT '订单编号',
  `hotelId` varchar(255) NOT NULL COMMENT '酒店Id',
  `openId` varchar(255) NOT NULL,
  `uname` varchar(255) DEFAULT '' COMMENT '姓名',
  `phoneNumber` varchar(255) DEFAULT NULL COMMENT '手机号',
  `roomType` varchar(255) DEFAULT '' COMMENT '房间类型',
  `reserveTime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '预定时间',
  `preFee` float(10,1) NOT NULL COMMENT '定金',
  `status` tinyint(4) DEFAULT NULL COMMENT '0 预定中 1 已住宿 -1 已退房',
  `startTime` timestamp NULL DEFAULT NULL COMMENT '开始时间',
  `endTime` timestamp NULL DEFAULT NULL COMMENT '退房时间\r\n',
  PRIMARY KEY (`orderId`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Records of reserve_record
-- ----------------------------
INSERT INTO `reserve_record` VALUES ('20203191584629977193', '37030301', 'ogcu55T7etzKzhQ3yZFKz1TWuUpk', '2341', '2134234', '标准间', '2020-03-19 00:00:00', '188.8', '0', '2020-03-19 00:00:00', '2020-03-20 00:00:00');
INSERT INTO `reserve_record` VALUES ('20203191584630147372', '37030301', 'ogcu55T7etzKzhQ3yZFKz1TWuUpk', '2341', '2134234', '标准间', '2020-03-19 15:02:27', '189.8', '1', '2020-03-19 00:00:00', '2020-03-20 00:00:00');
INSERT INTO `reserve_record` VALUES ('20203191584630222766', '37030301', 'ogcu55T7etzKzhQ3yZFKz1TWuUpk', '2341', '2134234', '标准间', '2020-03-19 23:03:43', '28.8', '-1', '2020-03-19 00:00:00', '2020-03-20 00:00:00');

-- ----------------------------
-- Table structure for room_info
-- ----------------------------
DROP TABLE IF EXISTS `room_info`;
CREATE TABLE `room_info` (
  `roomId` varchar(255) NOT NULL,
  `roomStatus` varchar(255) DEFAULT NULL COMMENT '房间状态 1 已住宿 -1未住宿 0 预定中',
  PRIMARY KEY (`roomId`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Records of room_info
-- ----------------------------
INSERT INTO `room_info` VALUES ('37030301101', '0');
INSERT INTO `room_info` VALUES ('37030301102', '0');
INSERT INTO `room_info` VALUES ('37030301103', '-1');
INSERT INTO `room_info` VALUES ('37030301104', '-1');
INSERT INTO `room_info` VALUES ('37030301201', '-1');
INSERT INTO `room_info` VALUES ('37030301202', '0');
INSERT INTO `room_info` VALUES ('37030301203', '1');
INSERT INTO `room_info` VALUES ('37030301204', '0');
INSERT INTO `room_info` VALUES ('37030302101', '1');
INSERT INTO `room_info` VALUES ('37030302102', '0');
INSERT INTO `room_info` VALUES ('37030302103', '-1');
INSERT INTO `room_info` VALUES ('37030302104', '-1');
INSERT INTO `room_info` VALUES ('37030303101', '-1');
INSERT INTO `room_info` VALUES ('37030303102', '-1');
INSERT INTO `room_info` VALUES ('37030303103', '-1');
INSERT INTO `room_info` VALUES ('37030303104', '-1');

-- ----------------------------
-- Table structure for room_live_record
-- ----------------------------
DROP TABLE IF EXISTS `room_live_record`;
CREATE TABLE `room_live_record` (
  `userId` varchar(255) NOT NULL,
  `name` varchar(255) DEFAULT '' COMMENT '姓名',
  `signTime` datetime DEFAULT NULL COMMENT '入住时间',
  `leaveTime` datetime DEFAULT NULL COMMENT '退房时间',
  `roomId` varchar(255) DEFAULT '' COMMENT '房间号',
  `cost` decimal(10,2) DEFAULT NULL COMMENT '消费金额',
  PRIMARY KEY (`userId`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Records of room_live_record
-- ----------------------------
INSERT INTO `room_live_record` VALUES ('1', 'son', '2020-04-30 18:20:19', '2020-04-30 18:22:26', '37030301101', '188.80');

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
