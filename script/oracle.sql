-- order
create table orders
(
    id VARCHAR2(128) NOT NULL ,
    product_id NUMBER(11) NOT NULL ,
    count NUMBER(11) ,
    pay_amount NUMBER(10,2),
    add_time TIMESTAMP(6) DEFAULT CURRENT_TIMESTAMP ,
    last_update_time TIMESTAMP(6) DEFAULT CURRENT_TIMESTAMP ,
    address VARCHAR2(128),
    PRIMARY KEY (id,product_id)
);
CREATE SEQUENCE order_seq START WITH 1 INCREMENT BY 1;

