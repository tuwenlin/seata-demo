create table "public"."orders"
(
    id               VARCHAR(128) not null,
    product_id       INT          not null,
    count            INT          DEFAULT 1,
    seq              SERIAL,
    add_time         TIMESTAMP(6) DEFAULT CURRENT_TIMESTAMP,
    last_update_time TIMESTAMP(6) DEFAULT CURRENT_TIMESTAMP,
    address          VARCHAR(128),
    primary key (id, seq)
);
CREATE SEQUENCE IF NOT EXISTS "public"."orders_seq" INCREMENT BY 1 MINVALUE 1;

create table "public"."storage"
(
    id         VARCHAR(32) NOT NULL,
    product_id INT         not null,
    total      INT         not null,
    used       INT         not null,
    residue    INT         not null,
    primary key (id, product_id)
);