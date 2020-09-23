USE OpenDuty;

# CREATE TABLES
CREATE TABLE team ( id int auto_increment not null primary key, name varchar(50) unique not null);
CREATE TABLE employee (	id int auto_increment not null primary key, first_name varchar(50) not null, last_name varchar(50) not null, phone varchar(20) not null, team_id int not null, FOREIGN KEY (team_id) REFERENCES team(id));
CREATE TABLE incident (	id int auto_increment not null primary key, type enum("Important", "NonImportant"), created timestamp not null, title varchar(255) not null, description text not null, team_id int not null, FOREIGN KEY (team_id) REFERENCES team(id));
CREATE TABLE schedule (	id int auto_increment not null primary key, start_time timestamp not null, period int not null, team_id int not null, FOREIGN KEY (team_id) REFERENCES team(id));
CREATE TABLE slack_notification ( id int auto_increment not null primary key, team_id int not null, FOREIGN KEY (team_id) REFERENCES team(id));
CREATE TABLE notification (	id int auto_increment not null primary key, team_id int not null, FOREIGN KEY (team_id) REFERENCES team(id));