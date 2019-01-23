DROP TABLE IF EXISTS `email_captcha`;
CREATE TABLE `email_captcha` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `appkey` varchar(32) NOT NULL DEFAULT '',
  `channel` int(11) NOT NULL DEFAULT '0',
  `email` varchar(255) NOT NULL,
  `captcha` varchar(255) NOT NULL,
  `created_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `updated_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`),
  KEY `email` (`email`,`appkey`,`channel`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
