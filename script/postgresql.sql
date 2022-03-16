create table "public"."orders"
(
    id               VARCHAR(128) not null,
    product_id       SERIAL       not null,
    count            INT          DEFAULT 1,
    pay_amount       DECIMAL(10, 2),
    add_time         TIMESTAMP(6) DEFAULT CURRENT_TIMESTAMP,
    last_update_time TIMESTAMP(6) DEFAULT CURRENT_TIMESTAMP,
    address          VARCHAR(128),
    primary key (id, product_id, count)
);
CREATE SEQUENCE IF NOT EXISTS "public"."orders_seq" INCREMENT BY 1 MINVALUE 1;