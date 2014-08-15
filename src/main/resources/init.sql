CREATE TABLE IF NOT EXISTS `user` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `enabled` bit(1) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `role` varchar(255) DEFAULT NULL,
  `surname` varchar(255) DEFAULT NULL,
  `username` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
);

CREATE TABLE IF NOT EXISTS `boarder` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `room` int(11) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  `surname` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
);

INSERT INTO `user` ( `id` , `enabled` , `name` , `password` , `role` , `surname` , `username`) VALUES ( NULL , 1,  'sam',  'sam',  'ROLE_USER',  'sam',  'sam');
INSERT INTO `user` ( `id` , `enabled` , `name` , `password` , `role` , `surname` , `username`) VALUES (NULL , 1,  'dam',  'dam',  'ROLE_USER',  'dam',  'dam');

INSERT INTO `boarder` (`id`, `room`, `name`, `surname`) VALUES (NULL , 1, 'Deprés', 'Michel');
INSERT INTO `boarder` (`id`, `room`, `name`, `surname`) VALUES (NULL , 2, 'Croteau', 'André');
INSERT INTO `boarder` (`id`, `room`, `name`, `surname`) VALUES (NULL , 3, 'Duplessis', 'Dominique');
INSERT INTO `boarder` (`id`, `room`, `name`, `surname`) VALUES (NULL , 3, 'Bolduc', 'Auguste');
INSERT INTO `boarder` (`id`, `room`, `name`, `surname`) VALUES (NULL , 3, 'Fouquet', 'Francis');
INSERT INTO `boarder` (`id`, `room`, `name`, `surname`) VALUES (NULL , 3, 'Brodeur', 'Jeanne');