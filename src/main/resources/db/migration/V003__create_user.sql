create table users(
    id bigint generated always as identity primary key,
    name varchar(100) not null,
    email varchar(100) not null unique,
    password varchar(100) not null,
    role varchar(100) not null
);