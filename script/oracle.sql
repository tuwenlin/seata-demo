-- order
create table orders
(
    id               VARCHAR2(128) NOT NULL,
    product_id       NUMBER(11) NOT NULL,
    count            NUMBER(11),
    seq              NUMBER(11),
    add_time         TIMESTAMP(6) DEFAULT CURRENT_TIMESTAMP,
    last_update_time TIMESTAMP(6) DEFAULT CURRENT_TIMESTAMP,
    address          VARCHAR2(128),
    PRIMARY KEY (id, seq)
);
CREATE SEQUENCE order_seq START WITH 1 INCREMENT BY 1;

create table storage
(
    id         VARCHAR2(32) NOT NULL,
    product_id NUMBER(11) NOT NULL,
    total      NUMBER(11),
    used       NUMBER(11),
    residue    NUMBER(11),
    PRIMARY KEY (id, product_id)
);

