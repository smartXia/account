DROP TABLE IF EXISTS `phone_captchas`;
CREATE TABLE `phone_captchas` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `appkey` varchar(32) NOT NULL DEFAULT '',
  `channel` int(11) NOT NULL DEFAULT '0',
  `phone` varchar(255) NOT NULL,
  `captcha` varchar(255) NOT NULL,
  `created_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `updated_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`),
  UNIQUE KEY `appkey` (`appkey`,`channel`,`phone`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
