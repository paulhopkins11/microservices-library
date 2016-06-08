CREATE DATABASE books;
Connect books;
CREATE TABLE book (
id MEDIUMINT NOT NULL AUTO_INCREMENT,
title     	varchar(40) NOT NULL,
isbn     	varchar(40) NOT NULL,
description varchar(255),
PRIMARY KEY (id)
);

insert into book (title, isbn, description) values ('Harry Potter', 'ISBN:1234567890', 'Wizarding');

select * from book;