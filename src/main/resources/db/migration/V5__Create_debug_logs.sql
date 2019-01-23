DROP TABLE IF EXISTS `debug_logs`;
CREATE TABLE `debug_logs` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `account_id` varchar(255) NOT NULL,
  `appkey` varchar(255) NOT NULL,
  `action` varchar(255) NOT NULL COMMENT '操作行为, login register bind unbing logout等',
  `msg` varchar(255) NOT NULL,
  `ip` varchar(255) NOT NULL,
  `created_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `channel` int(11) NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`),
  KEY `account_id` (`account_id`,`appkey`),
  KEY `action` (`action`),
  KEY `ip` (`ip`),
  KEY `created_at` (`created_at`),
  KEY `appkey` (`appkey`,`channel`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;