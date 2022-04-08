CREATE EXTENSION IF NOT EXISTS "uuid-ossp";

create table products (
    id serial primary key,
    product_name varchar(100) not null,
    product_code uuid default uuid_generate_v4(),
    product_description varchar,
    store_price float,
    in_stock boolean default(true),
    product_size varchar(2),
    product_color varchar(32),
    product_brand varchar(100),
    product_quantity integer
);

create table customer(
    id serial primary key,
    customer_code uuid default uuid_generate_v4(),
    customer_name varchar(100) not null,
    address varchar(100) not null,
    cpf varchar(11) unique,
    email varchar(100)
);

create table purchase(
    id serial primary key,
    cpf_customer varchar(11),
    total float,
    customer_id integer references customer(id)
);

create table purchase_products(
    id serial primary key,
    purchase_id integer references purchase(id),
    product_id integer references products(id)
);
