--DROP DATABASE contacts;
--CREATE DATABASE contacts;

DROP TABLE IF EXISTS phone;
DROP TABLE IF EXISTS contact_address;
DROP TABLE IF EXISTS contact;
DROP TABLE IF EXISTS address;


CREATE TABLE contact (
        contact_id serial primary key,
        first_name varchar(32) not null,
        last_name varchar(32) not null
);

CREATE TABLE address (
        address_id serial primary key,
        street_address_1 varchar(256) not null,
        street_address_2 varchar(256),
        city varchar(256) not null,
        district varchar(100) not null,
        postal_code varchar(50) not null, 
        address_type varchar(10) not null,
        
        constraint chk_address_type check ( address_type IN ('HOME','WORK','BILLING','SHIPPING') )
);

CREATE TABLE contact_address (
        contact_id int,
        address_id int,
        
        PRIMARY KEY(contact_id, address_id),
        constraint fk_contactaddress_contact_id foreign key (contact_id) references contact(contact_id),
        constraint fk_contactaddress_address_id foreign key (address_id) references address(address_id)
);

CREATE TABLE phone (
        phone_id serial primary key,
        contact_id int not null,
        phone_number varchar(32) not null,
        phone_type varchar(10) not null,
        phone_type_other varchar(255),
        
        constraint fk_phone_contact_id foreign key (contact_id) references contact(contact_id),
        constraint chk_phone_type check ( phone_type IN ('HOME','WORK','MOBILE','OTHER') ),
        constraint chk_phone_type_other check ( (phone_type = 'OTHER' AND phone_type_other IS NOT NULL) OR (phone_type != 'OTHER' AND phone_type_other IS NULL) )
);   
        