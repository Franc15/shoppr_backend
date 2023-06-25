create table Category (
    id int auto_increment primary key,
    name varchar(100) not null,
    desc text not null,
    created_at timestamp not null,
    modified_at timestamp
);

create table Product (
    id int auto_increment primary key,
    name varchar(100) not null,
    desc text not null,
    category int not null,
    price decimal not null,
    created_at timestamp not null,
    modified_at timestamp,
    foreign key (category) references Category(id)
);
