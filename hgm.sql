CREATE TABLE hgm_user(
id serial PRIMARY KEY,
uname varchar(128),
password varchar(128),
is_active bool DEFAULT false
);

CREATE TABLE hgm_product(
id SERIAL PRIMARY KEY,
name varchar(128),
description varchar(2048),
price numeric(10,2),
stock integer DEFAULT 0
);

CREATE TABLE hgm_order(
id serial PRIMARY KEY,
user_id integer not null references hgm_user(id),
order_date timestamp DEFAULT now(),
total_qty integer,
amount numeric(10,2)
);

CREATE TABLE hgm_order_detail(
id serial PRIMARY KEY,
order_id integer not null references hgm_order(id),
product_id integer not null references hgm_product(id),
price numeric(10,2) not null,
qty integer not null
);

