CREATE TABLE categories(
    id bigint generated always as identity primary key,
    name varchar(100) not null unique
);