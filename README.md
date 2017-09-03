# Web-App

This application will alllow to create, update, delete and list users and departaments.
SpringMVC

Hibernate 4.3.8 Final
MySQL 5.1.10
Eclipse
Java 1.8



SQL:

CREATE TABLE `DEPT_TBL` (
  `dpto_id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) NOT NULL,
  `description` varchar(45) NOT NULL,
  PRIMARY KEY (`dpto_id`)
) ENGINE=InnoDB AUTO_INCREMENT=25 DEFAULT CHARSET=utf8;

dept_tblCREATE TABLE `USER_TBL` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) NOT NULL,
  `email` varchar(45) NOT NULL,
  `address` varchar(45) NOT NULL,
  `telephone` varchar(45) NOT NULL,
  `description` varchar(45) NOT NULL,
   `dpto_id` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  FOREIGN KEY (`dpto_id`) REFERENCES DEPT_TBL(dpto_id)
)ENGINE=InnoDB AUTO_INCREMENT=25 DEFAULT CHARSET=utf8;
