DROP TABLE IF EXISTS `login_sessions`;
CREATE TABLE `login_sessions` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `account_id` varchar(255) NOT NULL,
  `selector` varchar(255) NOT NULL,
  `token` text NOT NULL,
  `identifier` varchar(255) NOT NULL,
  `platform` varchar(50) NOT NULL DEFAULT 'default',
  `expired_at` varchar(255) NOT NULL,
  `created_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `updated_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `appkey` varchar(32) NOT NULL,
  `channel` int(11) NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`),
  KEY `account_id` (`account_id`,`appkey`,`channel`),
  KEY `selector` (`selector`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
