drop table if exists T_ORDERS;
drop table if exists T_ORDER_STATUS;

CREATE TABLE T_ORDER_STATUS (
    ID integer identity primary key,
    STATUS VARCHAR(100) NOT NULL
);

CREATE TABLE T_ORDERS (
    ID integer identity primary key,
    PRODUCT_ID VARCHAR(100) NOT NULL,
    AMOUNT INTEGER NOT NULL,
    ORDER_STATUS_ID INTEGER,
    FOREIGN KEY (ORDER_STATUS_ID) REFERENCES T_ORDER_STATUS(ID),
);
