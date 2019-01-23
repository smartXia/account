CREATE TABLE `app_param` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `appkey` varchar(32) NOT NULL,
  `channel` int(11) NOT NULL,
  `settings` text NOT NULL,
  `created_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `updated_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
