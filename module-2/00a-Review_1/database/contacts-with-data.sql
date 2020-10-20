--DROP DATABASE contacts;
--CREATE DATABASE contacts;

DROP TABLE IF EXISTS phone;
DROP TABLE IF EXISTS email;
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
        
        constraint chk_address_type check ( address_type IN ('HOME','WORK','BILLING','SHIPPING', 'OTHER') )
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


CREATE TABLE email (
        email_id serial primary key,
        contact_id int not null,
        email varchar(255) not null,
        email_type varchar(10) not null,
        email_type_other varchar(255),
        is_preferred boolean DEFAULT true,
        
        constraint fk_email_contact_id foreign key (contact_id) references contact(contact_id),
        constraint chk_email_type check ( email_type IN ('HOME','WORK','OTHER') ),
        constraint chk_email_type_other check ( (email_type = 'OTHER' AND email_type_other IS NOT NULL) OR (email_type != 'OTHER' AND email_type_other IS NULL) )
);    

-- These INSERTs use the CURRVAL(sequence) function to get the last value used for the sequence
-- without incrementing it.  This allows for the entries to be added using the sequence so it is current
-- the next time it is used.   WARNING: This only works if the order of the INSERTS is maintained.  If the order is 
-- changed, then it will associate the incorrect ids.  CAUTION: This is 1 ways of using sequences in a schema script, but 
-- should only be used when we are sure there are no other users connected to a database that may be INSERTING other records,
-- which may cause CURRVAL() to return their use of the sequence instead of ours.  In this script is is safe to use, because
-- the earlier portion of the schema drops and creates the database when run.  

-- INSERT Dave Warthog
INSERT INTO contact (contact_id, first_name, last_name) 
        VALUES (DEFAULT, 'Dave', 'Warthog');
INSERT INTO address (address_id, street_address_1, street_address_2, city, postal_code, district, address_type)
        VALUES (DEFAULT, '1245 High Street', 'Apt 51', 'Columbus', '43201', 'OH', 'HOME');
INSERT INTO contact_address (contact_id, address_id) 
        VALUES ( CURRVAL('contact_contact_id_seq'), CURRVAL('address_address_id_seq') );
INSERT INTO phone ( phone_id, contact_id, phone_number, phone_type, phone_type_other)
        VALUES ( DEFAULT, CURRVAL('contact_contact_id_seq'), '614-555-1212', 'MOBILE', null);
INSERT INTO email (email_id, contact_id, email, email_type, email_type_other) 
        VALUES ( DEFAULT, CURRVAL('contact_contact_id_seq'), 'warthog@warthogrules.com', 'HOME', null);


-- INSERT Rayboy Jones
INSERT INTO contact (contact_id, first_name, last_name)
        VALUES (DEFAULT, 'Ratboy', 'Jones');
INSERT INTO address (address_id, street_address_1, street_address_2, city, postal_code, district, address_type)
        VALUES (DEFAULT, 'Under the front street bridge', null, 'Columbus', '43201', 'OH', 'HOME');
INSERT INTO contact_address (contact_id, address_id) 
        VALUES ( CURRVAL('contact_contact_id_seq'), CURRVAL('address_address_id_seq') );
        
INSERT INTO address (address_id, street_address_1, street_address_2, city, postal_code, district, address_type)
        VALUES (DEFAULT, 'OSU Tunnels', 'North Oval Entrance', 'Columbus', '43201', 'OH', 'OTHER');
INSERT INTO contact_address (contact_id, address_id) 
        VALUES ( CURRVAL('contact_contact_id_seq'), CURRVAL('address_address_id_seq') );          
INSERT INTO phone ( phone_id, contact_id, phone_number, phone_type, phone_type_other)
        VALUES ( DEFAULT, CURRVAL('contact_contact_id_seq'), '614-555-7892', 'MOBILE', null);
INSERT INTO phone ( phone_id, contact_id, phone_number, phone_type, phone_type_other)
        VALUES ( DEFAULT, CURRVAL('contact_contact_id_seq'), '888-555-8277', 'OTHER', 'Payphone');
INSERT INTO email (email_id, contact_id, email, email_type, email_type_other) 
        VALUES ( DEFAULT, CURRVAL('contact_contact_id_seq'), 'ratboy@aol.com', 'HOME', null);
        
-- INSERT Tall Bobby
INSERT INTO contact (contact_id, first_name, last_name)
        VALUES (DEFAULT, 'Tall', 'Bobby');
INSERT INTO address (address_id, street_address_1, street_address_2, city, postal_code, district, address_type)
        VALUES (DEFAULT, '52A 5th Ave', null, 'Columbus', '43220', 'OH', 'WORK');
INSERT INTO contact_address (contact_id, address_id) 
        VALUES ( CURRVAL('contact_contact_id_seq'), CURRVAL('address_address_id_seq') );
INSERT INTO phone ( phone_id, contact_id, phone_number, phone_type, phone_type_other)
        VALUES ( DEFAULT, CURRVAL('contact_contact_id_seq'), '614-555-5782', 'HOME', null);
INSERT INTO email (email_id, contact_id, email, email_type, email_type_other) 
        VALUES ( DEFAULT, CURRVAL('contact_contact_id_seq'), 'tallguy@bobbyrocks.com', 'WORK', null);
        
        
-- INSERT Jenny Jones
INSERT INTO contact (contact_id, first_name, last_name)
        VALUES (DEFAULT, 'Jenny', 'Jones');
INSERT INTO address (address_id, street_address_1, street_address_2, city, postal_code, district, address_type)
        VALUES (DEFAULT, '18 Main St', null, 'Newcomerstown', '43832', 'OH', 'HOME');
INSERT INTO contact_address (contact_id, address_id) 
        VALUES ( CURRVAL('contact_contact_id_seq'), CURRVAL('address_address_id_seq') );
INSERT INTO phone ( phone_id, contact_id, phone_number, phone_type, phone_type_other)
        VALUES ( DEFAULT, CURRVAL('contact_contact_id_seq'), '740-867-5209',  'MOBILE', null);
INSERT INTO email (email_id, contact_id, email, email_type, email_type_other) 
        VALUES ( DEFAULT, CURRVAL('contact_contact_id_seq'), 'jenny@tutone.org', 'HOME', null); 
        
        
 -- INSERT Jimmy Crooked
INSERT INTO contact (contact_id, first_name, last_name)
        VALUES (DEFAULT, 'Jimmy', 'Crooked');
INSERT INTO address (address_id, street_address_1, street_address_2, city, postal_code, district, address_type)
        VALUES (DEFAULT, '1782 South Ave', null, 'Pittsburgh', '15106', 'PA', 'WORK');
INSERT INTO contact_address (contact_id, address_id) 
        VALUES ( CURRVAL('contact_contact_id_seq'), CURRVAL('address_address_id_seq') );
INSERT INTO phone ( phone_id, contact_id, phone_number, phone_type, phone_type_other)
        VALUES ( DEFAULT, CURRVAL('contact_contact_id_seq'), '412-555-9632', 'WORK', null);
INSERT INTO email (email_id, contact_id, email, email_type, email_type_other) 
        VALUES ( DEFAULT, CURRVAL('contact_contact_id_seq'), 'jimmycrooked@cobras.com', 'WORK', null);   
        
-- INSERT Jung Choi
INSERT INTO contact (contact_id, first_name, last_name)
        VALUES (DEFAULT, 'Jung', 'Choi');
INSERT INTO address (address_id, street_address_1, street_address_2, city, postal_code, district, address_type)
        VALUES (DEFAULT, '85-1 Chebu-dong', null, 'Seoul', '100-093', 'Jongro-gu', 'WORK');
INSERT INTO contact_address (contact_id, address_id) 
        VALUES ( CURRVAL('contact_contact_id_seq'), CURRVAL('address_address_id_seq') );
INSERT INTO phone ( phone_id, contact_id, phone_number, phone_type, phone_type_other)
        VALUES ( DEFAULT, CURRVAL('contact_contact_id_seq'), '+82-2-312-3456', 'WORK', null);
INSERT INTO email (email_id, contact_id, email, email_type, email_type_other) 
        VALUES ( DEFAULT, CURRVAL('contact_contact_id_seq'), 'jung.choi@gmailing.com', 'WORK', null);
INSERT INTO email (email_id, contact_id, email, email_type, email_type_other) 
        VALUES ( DEFAULT, CURRVAL('contact_contact_id_seq'), 'jung.choi@1123.org', 'OTHER', 'Teletext'); 
 
        