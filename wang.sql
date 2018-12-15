SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for family
-- ----------------------------
DROP TABLE IF EXISTS `family`;
CREATE TABLE `family` (
  `ID` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '自增ID',
  `RELATION_ID` bigint(20) DEFAULT NULL COMMENT '关联ID',
  `RELATION` varchar(64) DEFAULT NULL COMMENT '关联关系',
  `NAME` varchar(64) NOT NULL COMMENT '名字',
  `GENDER` varchar(64) NOT NULL COMMENT '性别',
  `SENIORITY` int(16) NOT NULL COMMENT '辈分',
  `RANKING` int(16) DEFAULT NULL COMMENT '排行',
  `BORN` varchar(64) DEFAULT NULL COMMENT '出生日期',
  `ELAPSE` varchar(64) DEFAULT NULL COMMENT 'ELAPSE日期',
  `CREATE_TIME` datetime NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of family
-- ----------------------------
INSERT INTO `family` VALUES ('1', '0', 'ROOT', '王其培', 'MEN', '1', '1', null, null, '2018-12-14 19:21:12');
INSERT INTO `family` VALUES ('2', '1', 'SON', '王成功', 'MEN', '2', '1', null, null, '2018-12-14 19:21:42');
INSERT INTO `family` VALUES ('3', '1', 'SON', '王西功', 'MEN', '2', '2', null, null, '2018-12-14 19:21:59');
INSERT INTO `family` VALUES ('4', '1', 'SON', '王占功', 'MEN', '2', '3', null, null, '2018-12-14 19:22:11');
INSERT INTO `family` VALUES ('5', '2', 'SON', '王大会', 'MEN', '3', '1', null, null, '2018-12-14 19:23:24');
INSERT INTO `family` VALUES ('6', '2', 'SON', '王小会', 'MEN', '3', '2', null, null, '2018-12-14 19:23:38');
INSERT INTO `family` VALUES ('7', '3', 'SON', '王俊立', 'MEN', '3', '3', null, null, '2018-12-14 19:24:37');
INSERT INTO `family` VALUES ('8', '4', 'SON', '王正坤', 'MEN', '3', '4', null, null, '2018-12-14 19:24:50');
INSERT INTO `family` VALUES ('9', '3', 'SON', '王正普', 'MEN', '3', '5', null, null, '2018-12-14 19:25:08');
INSERT INTO `family` VALUES ('10', '2', 'SON', '王正虎', 'MEN', '3', '6', null, null, '2018-12-14 19:25:22');
INSERT INTO `family` VALUES ('11', '3', 'SON', '王正武', 'MEN', '3', '7', null, null, '2018-12-14 19:25:42');
INSERT INTO `family` VALUES ('12', '2', 'SON', '王正谦', 'MEN', '3', '8', null, null, '2018-12-14 19:25:58');
INSERT INTO `family` VALUES ('13', '4', 'SON', '王正全', 'MEN', '3', '9', null, null, '2018-12-14 19:26:10');
