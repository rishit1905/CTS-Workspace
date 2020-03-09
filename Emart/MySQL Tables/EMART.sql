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

CREATE TABLE CUSTOMER_CATEGORY (
    CSID int references CUSTOMERS(CSID),
    CTID int references CATEGORIES(CTID),
    PRIMARY KEY(CSID,CTID)
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
drop table purchase_history;
drop database emart;
select * from customers;
describe products;
delete from products where PID=1;
insert into products values(1,1,1,"Levis Jeans",1700,"Men's dream",10);
insert into emart_users values(1,"Rishi","1234abcd","CUSTOMER");
insert into customers values(1,"Rishi","Fishy",1,"rishi@gmail.com","8765432190");

SELECT * FROM Products WHERE CTID in (SELECT CTID FROM Categories WHERE CTNM="Fashion");