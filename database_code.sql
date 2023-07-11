

use hr;

create table appusers(
	id int not null primary key auto_increment,
    name varchar(255),
    username varchar(255),
    email varchar(255),
    password varchar(255),
    manager_id int,
    FOREIGN KEY (manager_id) REFERENCES appusers(id)
);

create table tasks (
	id int not null primary key auto_increment,
	user_id int,
    task_name varchar(255),
    task_description varchar(255)
);


