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
  `age` int(11) NOT NULL,
  `dateBirth` varchar(255) DEFAULT NULL,
  `mutuel` varchar(255) DEFAULT NULL,
  `personResponsible` varchar(255) DEFAULT NULL,
  `phone` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
);

INSERT INTO `user` ( `id` , `enabled` , `name` , `password` , `role` , `surname` , `username`) VALUES ( NULL , 1,  'sam',  'sam',  'ROLE_USER',  'sam',  'sam');
INSERT INTO `user` ( `id` , `enabled` , `name` , `password` , `role` , `surname` , `username`) VALUES (NULL , 1,  'dam',  'dam',  'ROLE_USER',  'dam',  'dam');

INSERT INTO `boarder` (`id`, `room`, `name`, `surname`, `age`, `dateBirth`, `mutuel`, `personResponsible`, `phone`) VALUES (NULL , 1, 'Deprés', 'Michel', 70, '23/11/1944', 'Chétienne', 'Arridano Allain', '0499 19 89 41');
INSERT INTO `boarder` (`id`, `room`, `name`, `surname`, `age`, `dateBirth`, `mutuel`, `personResponsible`, `phone`) VALUES (NULL , 2, 'Croteau', 'André', 78, '12/08/1936', 'Chétienne', 'Christian Paimboeuf', '0495 62 00 63');
INSERT INTO `boarder` (`id`, `room`, `name`, `surname`, `age`, `dateBirth`, `mutuel`, `personResponsible`, `phone`) VALUES (NULL , 3, 'Duplessis', 'Dominique', 85, '02/12/1929', 'Neutre', 'Medoro Allain', '0498 99 74 37');
INSERT INTO `boarder` (`id`, `room`, `name`, `surname`, `age`, `dateBirth`, `mutuel`, `personResponsible`, `phone`) VALUES (NULL , 4, 'Bolduc', 'Auguste', 74, '08/09/1940', 'Libre', 'Montague Rivard', '0473 39 44 47');
INSERT INTO `boarder` (`id`, `room`, `name`, `surname`, `age`, `dateBirth`, `mutuel`, `personResponsible`, `phone`) VALUES (NULL , 5, 'Fouquet', 'Francis', 83, '15/06/1931', 'Libérale', 'Thiery Morneau', '0497 76 14 16');
INSERT INTO `boarder` (`id`, `room`, `name`, `surname`, `age`, `dateBirth`, `mutuel`, `personResponsible`, `phone`) VALUES (NULL , 6, 'Brodeur', 'Jeanne', 92, '06/04/1922', 'Socialiste', 'Sébastien Chabot', '0491 81 66 03');