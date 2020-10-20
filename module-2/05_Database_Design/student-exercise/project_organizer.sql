--CREATE DATABASE project_organizer;


DROP TABLE IF EXISTS project_employee;
DROP TABLE IF EXISTS project;
DROP TABLE IF EXISTS department_employee;
DROP TABLE IF EXISTS department;
DROP TABLE IF EXISTS employee;
DROP TABLE IF EXISTS job_title;



CREATE TABLE job_title(
        job_number serial primary key,
        job_name VARCHAR(255) not null unique
);



CREATE TABLE employee (
        employee_number serial primary key,
        job_number int not null,
        first_name VARCHAR(255) not null,
        last_name VARCHAR(255) not null,
        gender VARCHAR(50),
        date_of_birth VARCHAR(10) not null,
        date_of_hire VARCHAR(10) not null,
        
        constraint fk_job_number foreign key (job_number) references job_title(job_number)
        
); 

CREATE TABLE department(
        department_number serial primary key,
        department_name VARCHAR(255) not null
);

CREATE TABLE department_employee(
        department_number int,
        employee_number int,
        assignment_date timestamp default now(),
        PRIMARY KEY(department_number, employee_number),
        
        constraint fk_departmentemployee_department_department_number foreign key (department_number) references department(department_number),
        constraint fk_departmentemployee_employee_employee_number foreign key (employee_number) references employee(employee_number)
);

CREATE TABLE project(
        project_number serial primary key,
        project_name VARCHAR(255) not null,
        is_project_started boolean not null default false,
        project_start_date VARCHAR(10),
        is_project_complete boolean not null default false,
        project_completion_date VARCHAR(10),
        
        constraint chk_for_project_start check ( (is_project_started = true AND project_start_date IS NOT NULL) OR ( is_project_started = false AND project_start_date IS NULL) ),
        constraint chk_for_project_complete check ( (is_project_complete = true AND project_completion_date IS NOT NULL) OR ( is_project_complete = false AND project_completion_date IS NULL) )
);


CREATE TABLE project_employee(
        project_number int,
        employee_number int,
        assignment_date timestamp default now(),
        PRIMARY KEY(project_number, employee_number),
        
        constraint fk_projectemployee_project_project_number foreign key (project_number) references project(project_number),
        constraint fk_projectemployee_employee_employee_number foreign key (employee_number) references employee(employee_number)
);


INSERT INTO job_title (job_name) VALUES ('PROJECT MANAGER');
INSERT INTO job_title (job_name) VALUES ('BUSINESS ANALYST');
INSERT INTO job_title (job_name) VALUES ('DATABASE ADMINISTRATOR');
INSERT INTO job_title (job_name) VALUES ('GRAPHIC DESIGNER');
INSERT INTO job_title (job_name) VALUES ('JAVA DEVELOPER');

SELECT * FROM job_title;

INSERT INTO employee (job_number, first_name, last_name, gender, date_of_birth, date_of_hire)
VALUES (5, 'JON', 'HONWARD', 'Male', '04/15/1984', '08/23/2010');

INSERT INTO employee (job_number, first_name, last_name, date_of_birth, date_of_hire)
VALUES (2, 'JORDAN', 'BANSON',  '11/04/1990', '02/13/2015');

INSERT INTO employee (job_number, first_name, last_name, gender, date_of_birth, date_of_hire)
VALUES (1, 'LISA', 'COVFEFE', 'Female', '06/12/1972', '05/02/2005');

INSERT INTO employee (job_number, first_name, last_name, gender, date_of_birth, date_of_hire)
VALUES (4, 'JESSICA', 'WABBIT', 'Female', '11/04/1990', '11/12/2014');

INSERT INTO employee (job_number, first_name, last_name, gender, date_of_birth, date_of_hire)
VALUES (5, 'JOE', 'DISANTO', 'Male', '07/21/1994', '02/13/2015');

INSERT INTO employee (job_number, first_name, last_name, gender, date_of_birth, date_of_hire)
VALUES (3, 'KAREN', 'MIDDLETON', 'Female', '03/04/1971', '06/21/1990');

INSERT INTO employee (job_number, first_name, last_name, gender, date_of_birth, date_of_hire)
VALUES (4, 'COLE', 'RANG', 'Male', '08/21/1983', '10/25/2018');

INSERT INTO employee (job_number, first_name, last_name, date_of_birth, date_of_hire)
VALUES (5, 'CONNOR', 'BLASON', '01/22/1992', '08/29/2012');

SELECT * FROM employee;

INSERT INTO department (department_name)
VALUES ('MARKETING');

INSERT INTO department (department_name)
VALUES ('PMO');

INSERT INTO department (department_name)
VALUES ('DEVELOPMENT');

SELECT * FROM department;

INSERT INTO department_employee(department_number, employee_number)
VALUES (3, 1);

INSERT INTO department_employee(department_number, employee_number)
VALUES (2, 2);

INSERT INTO department_employee(department_number, employee_number)
VALUES (2, 3);

INSERT INTO department_employee(department_number, employee_number)
VALUES (1, 4);

INSERT INTO department_employee(department_number, employee_number)
VALUES (3, 5);

INSERT INTO department_employee(department_number, employee_number)
VALUES (3, 6);

INSERT INTO department_employee(department_number, employee_number)
VALUES (1, 7);

INSERT INTO department_employee(department_number, employee_number)
VALUES (3, 8);

SELECT * FROM department_employee;

INSERT INTO project(project_name, is_project_started, project_start_date, is_project_complete, project_completion_date)
VALUES ('Catering System', true, '10/09/2020', true, '10/11/2020');

INSERT INTO project(project_name, is_project_started, project_start_date)
VALUES ('Martial Arts Student Portal', true, '04/16/2020');

INSERT INTO project(project_name, is_project_started, project_start_date, is_project_complete, project_completion_date)
VALUES ('Spider-Man Costume #1', true, '02/16/2020', true, '04/21/2020');

INSERT INTO project(project_name, is_project_started, project_start_date)
VALUES ('Martial Arts School Check-In System', true, '06/15/2018');

INSERT INTO project(project_name)
VALUES ('SQL Database Capstone');

SELECT * FROM project;

INSERT INTO project_employee(project_number, employee_number)
VALUES (1, 3);

INSERT INTO project_employee(project_number, employee_number)
VALUES (1, 5);

INSERT INTO project_employee(project_number, employee_number)
VALUES (2, 8);

INSERT INTO project_employee(project_number, employee_number)
VALUES (2, 4);

INSERT INTO project_employee(project_number, employee_number)
VALUES (3, 7);

INSERT INTO project_employee(project_number, employee_number)
VALUES (3, 1);

INSERT INTO project_employee(project_number, employee_number)
VALUES (3, 2);

INSERT INTO project_employee(project_number, employee_number)
VALUES (4, 6);

SELECT * FROM project_employee;