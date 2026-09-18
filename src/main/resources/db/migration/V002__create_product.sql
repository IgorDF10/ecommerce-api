create table products (
    id bigint generated always as identity primary key,
    name varchar(100) not null,
    description text,
    price decimal(10, 2) not null,
    inventory bigint not null,
    category_id bigint not null references categories(id),
    active boolean default true not null,
    version bigint default 0 not null
);