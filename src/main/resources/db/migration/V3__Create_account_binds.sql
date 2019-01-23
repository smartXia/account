DROP TABLE IF EXISTS `account_binds`;
CREATE TABLE `account_binds` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `appkey` varchar(32) NOT NULL DEFAULT '',
  `channel` int(11) NOT NULL DEFAULT '0',
  `account_id` varchar(255) NOT NULL,
  `account_type` varchar(255) NOT NULL COMMENT '账号类型, phone qq weixin weibo',
  `openid` varchar(255) NOT NULL,
  `nickname` varchar(255) NOT NULL,
  `created_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `updated_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`),
  UNIQUE KEY `account_id` (`account_id`,`appkey`,`channel`,`account_type`),
  KEY `account_type` (`account_type`),
  KEY `openid` (`openid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;