DROP TABLE IF EXISTS `book`;

CREATE TABLE book ( 
    id int(11) NOT NULL AUTO_INCREMENT,
    name varchar(100) NOT NULL,
    PRIMARY KEY (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO book VALUES('1', 'Thinking in Java');
INSERT INTO book VALUES('2', 'Design Pattern');
INSERT INTO book VALUES('3', 'Refactoring');
