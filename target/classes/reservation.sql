CREATE DATABASE reservation;

USE reservation;

CREATE TABLE reservation (
`id` int(1) NOT NULL AUTO_INCREMENT,
`user_id` int(1) NOT NULL,
`party_size` tinyint(1) NOT NULL,
`date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
`restaurant_id` int(1) NOT NULL,
PRIMARY KEY (`id`)
) ENGINE=InnoDB CHARSET=utf8;

INSERT INTO reservation VALUES
(NULL,100,2,NOW(),800),
(NULL,101,3,NOW() + INTERVAL 1 DAY,800),
(NULL,102,5,NOW() + INTERVAL 2 DAY,800);