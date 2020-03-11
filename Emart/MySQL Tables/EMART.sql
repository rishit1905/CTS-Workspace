create table EMART_USERS(
	UID int primary key auto_increment,
    UNM varchar(30) not null unique,
    PWD varbinary(16000) not null,
    ROLE varchar(30) not null
);

CREATE TABLE CUSTOMERS (
    CSID int primary key auto_increment,
    FNM varchar(150) not null,
    LNM varchar(150) not null,
	UID int references EMART_USERS(UID),
    EML varchar(200) not null,
    MBN char(10) not null
);
    
CREATE TABLE CATEGORIES (
    CTID int primary key auto_increment,
    CTNM varchar(200) not null unique,
    DSCP varchar(1000)
);

CREATE TABLE SUB_CATEGORIES (
    SBID int primary key auto_increment,
    SBNM varchar(200) not null unique,
    CTID int references CATEGORIES(CTID),
    DSCP varchar(1000)
);

CREATE TABLE PRODUCTS (
    PID int primary key auto_increment,
    CTID int references CATEGORIES(CTID),
    SBID int references SUB_CATEGORIES(SBID),
    PNM varchar(200) not null,
    PRICE numeric not null,
    PDESC varchar(600) not null,
    STOCK int not null
);

CREATE TABLE PURCHASE_HISTORY (
	PRID int primary key auto_increment,
    CSID int references CUSTOMERS(CSID),
    SID int references SELLERS(SID),
    TXNID int references TRANSACTIONS(TXNID),
	PID int references PRODUCTS(PID),
    DSID int references DISCOUNTS(DSID),
    QTY int not null,
    PDT date not null
);

create table DISCOUNTS(
	DSID int primary key auto_increment,
    DSCODE char(5) not null unique,
    PRCT numeric not null,
    SDT date not null,
    EDT date not null,
    DSDESC varchar(250)
);

create table TRANSACTIONS(
	TXNID int primary key auto_increment,
    CSID int references CUSTOMERS(CSID),
    SID int references SELLERS(SID),
    TTYPE varchar(12) not null,
    AMT numeric not null,
    TXNDT date not null,
    DSCP varchar(250)
);

CREATE TABLE SELLERS(
	SID int primary key auto_increment,
	SNM varchar(150) not null,
    UID int references EMART_USERS(UID),
    CPNAME varchar(200) not null unique,
	GSTIN char(15) not null unique,
    ABOUTC varchar(500) not null,
    EML varchar(200) not null,
	MBN char(10) not null,
	ADDR varchar(1000) not null
);

show tables;
create database emart;
use emart;
drop table emart_users;
drop database emart;
select * from sellers;
select * from discounts;
select * from products;
select * from emart_users;
select * from transactions;
select * from purchase_history;
select * from customers;
select * from categories;
describe products;
delete from customers where CSID=1;
insert into products values(1,1,1,"Levis Jeans",1700,"Men's dream",10);
insert into products values(2,1,1,"Denim Jeans",1500,"Men's love",12);
insert into categories values(1,"Fashion","Dress your world");
insert into sub_categories values(1,"Men's Fashion",1,"Men Rock");
insert into emart_users values(2,"zero","1234ad","SELLER");
insert into emart_users values(1,"Rishi","1234abcd","CUSTOMER");
insert into discounts values(1,"MO100",0.78,'2020-01-01','2020-02-01',"Dicount");
insert into customers values(1,"Rishi","Fishy",1,"rishabh@gmail.com","8765432109");
insert into purchase_history values(1,1,1,1,1,1,5,'2020-01-01');
insert into transactions values(1,1,1,"CARD",1500,"2020-01-01","Done");
insert into sellers values(1,"zerofashion",2,"Zero Fashion","123ZF123","Turning lives around","zero@gmail.com","7765432190");
update sellers set UID=2 where SID=1;
alter table PRODUCTS add column SID int references SELLERS(SID); 
update PRODUCTS set SID=1 where PID=1;
update PRODUCTS set SID=1 where PID=2;
alter table SELLERS drop column ADDR;

SELECT * FROM Products WHERE CTID in (SELECT CTID FROM Categories WHERE CTNM="Fashion");