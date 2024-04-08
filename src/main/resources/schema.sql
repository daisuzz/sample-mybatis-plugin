CREATE TABLE CUSTOMER
(
    id   LONG PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(255),
    age  INT
);

CREATE TABLE ITEM
(
    id    LONG PRIMARY KEY AUTO_INCREMENT,
    name  VARCHAR(255),
    price INT
);

INSERT INTO CUSTOMER (name, age)
VALUES ('alice', 30),
       ('bob', 40),
       ('chris', 50);

INSERT INTO ITEM (name, price)
VALUES ('shoes', 3000),
       ('book', 1500),
       ('bag', 50000);
