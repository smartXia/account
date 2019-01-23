DROP TABLE IF EXISTS `app_accounts`;
CREATE TABLE `app_accounts` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `appkey` char(32) NOT NULL DEFAULT '',
  `channel` int(11) NOT NULL DEFAULT '0',
  `account_id` varchar(32) NOT NULL COMMENT 'accounts表中的openid',
  `openid` varchar(50) NOT NULL COMMENT '第三方应用已有系统的帐号id',
  `created_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `updated_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`),
  UNIQUE KEY `account_id` (`account_id`,`appkey`,`channel`),
  UNIQUE KEY `openid` (`openid`,`appkey`,`channel`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
