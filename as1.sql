CREATE DATABASE PH49565_DATKC
GO
USE PH49565_DATKC
CREATE TABLE GRADE(
ID INT PRIMARY KEY NOT NULL,
MASV nvarchar(50), 
Tienganh int,
Tinhoc int,
GDTC int,
foreign key(MASV) references STUDENTS(MASV)
)
CREATE TABLE STUDENTS(
MASV nvarchar(50) primary key not null,
Hoten nvarchar(50),
Email nvarchar(50),
SoDT nvarchar(15),
Gioitinh int,
Diachi nvarchar(50),
Hinh nvarchar(50)
)
CREATE TABLE USERS(
usersname nvarchar(50) primary key not null,
passwords nvarchar(50),
roles nvarchar(50)
)
-- insert dữ liệu vào bảng
insert into GRADE (ID,MASV,Tienganh,Tinhoc,GDTC)  values
(001,'PH1',8,9,8),
(002,'PH2',7,9,10),
(003,'PH3',6,8,7),
(004,'PH4',9,6,5),
(005,'PH5',10,9,8)
insert into STUDENTS values
('PH1',N'đạt','datlocanteam@gmail.com','0394621564',0,N'Hà Nội',''),
('PH2',N'hường','dat1locanteam@gmail.com','0384621564',1,N'Hà Nam',''),
('PH3',N'toàn','datlo3canteam@gmail.com','0894621564',0,N'Hà Tây',''),
('PH4',N'ngân','datlocan2team@gmail.com','0794621564',1,N'Hà Nội',''),
('PH5',N'trang','datlocantea156m@gmail.com','03925421564',1,N'Hà Nội','')
insert into USERS values
('datkc','2005','code'),
('huongtn','2612','TA'),
('ngantp','2879','DL'),
('toannv','0211','JP'),
('trangtn','2075','TQ')
--
select * from GRADE
select * from STUDENTS
select * from USERS



