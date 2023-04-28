create database new;
create table dateOparations1(
id int not null auto_increment,
name varchar(12),
DOBwithTime datetime,
joiningDate date,
shalary int,
age int,
joiningYear year,
check(age>=20),
primary key(id));

insert into dateOparations1 values(1,'Anita','2001-9-27 07:30:34','2001-9-27',45000,21,'2001');
insert into dateOparations1(name,DOBwithTime,joiningDate,shalary,age,joiningYear) values('Akshata','2001-10-03 07:30:34','2001-9-27',65000,21,'2001');
insert into dateOparations1(name,DOBwithTime,joiningDate,shalary,age,joiningYear) values('Shubhangi','2000-08-21 07:30:34','2001-9-27',55000,22,'2001');
insert into dateOparations1(name,DOBwithTime,joiningDate,shalary,age,joiningYear) values('Savi3','1999-7-03 07:30:34','2001-9-27',85000,24,'2001');
-- violation error
insert into dateOparations1(name,DOBwithTime,joiningDate,shalary,age,joiningYear) values('Savi3','1999-7-03 07:30:34','2001-9-27',85000,19,'2001');

select * from dateOparations1;
select * from dateOparations1 where shalary between 40000 and 50000;
select * from dateOparations1 where age between 20 and 21;

select current_date() as todaysDate;
select current_time() as presentTime;
select current_timestamp() as presentTime;
select current_user() as me;

select * from dateOparations;
-- -----------------------------------------------------------------
create database foreignkey;

create table masterTable(
srNo int not null,
courseName varchar(20),
courseFacultyName varchar(19),
courseId int,
primary key(srNo)
);

insert into masterTable values(1,'java','Omkar',11);
insert into masterTable values(2,'SQL','Shantanu',12);
insert into masterTable values(3,'Web Technology','Shantanu',13);
insert into masterTable values(4,'Advanse java','Omkar',14);
select * from masterTable ;

create table childTable(
srNo_pk int not null,
studentName varchar(20),
teacherId_fk int,
primary key(srNo_pk),
foreign key(teacherId_fk) references masterTable(srNo)
);

insert into childTable values(1,'Akshata',1);
insert into childTable values(2,'Shubhangi',2);
insert into childTable values(3,'Savi3',3);

select * from masterTable left join childTable on teacherId_fk=srNo;

select * from childTable;

