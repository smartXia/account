DROP TABLE IF EXISTS `accounts`;
CREATE TABLE `accounts` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `appkey` varchar(32) NOT NULL DEFAULT '',
  `channel` int(11) NOT NULL DEFAULT '0',
  `openid` varchar(32) NOT NULL,
  `phone` varchar(20) NOT NULL,
  `email` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL DEFAULT '',
  `deviceid` varchar(255) NOT NULL DEFAULT '' COMMENT '设备id',
  `created_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `updated_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`),
  UNIQUE KEY `openid` (`openid`,`appkey`,`channel`),
  KEY `phone` (`phone`),
  KEY `deviceid` (`deviceid`),
  KEY `email` (`email`),
  KEY `appkey` (`appkey`,`channel`),
  KEY `phone_2` (`phone`),
  KEY `deviceid_2` (`deviceid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;