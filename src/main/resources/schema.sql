create database if not exists Bank2;
use Bank2;


create table if not exists khachhang
(
  makhachhang varchar(10),
  tenkhachhang varchar(45),
  chungminhthu int (20),
  ngaysinh date,
  diachi varchar(45),
  primary key (makhachhang)
);

create table  if not exists chucvu
(
	machucvu varchar(10),
	tenchucvu varchar(45),
    primary key (machucvu)
);


create table  if not exists nhanvien
(
	manhanvien varchar(10),
    chungminhthu int (20),
    tennhanvien varchar(20),
    ngaysinh date,
    bacnghe int,
    thamnien int,
    machucvu varchar(10),
    primary key (manhanvien),
    foreign key (machucvu) REFERENCES chucvu (machucvu)
	ON UPDATE CASCADE ON DELETE CASCADE

);

create table  if not exists taikhoan
(

	mataikhoan varchar(10),
    ngaytaotaikhoan date,
    tenloaitaikhoan varchar(20),
    makhachhang varchar(10),
    manhanvientaotaikhoan varchar(10),
    sodu float,

    primary key (mataikhoan),
    foreign key (makhachhang) REFERENCES khachhang (makhachhang)
	ON UPDATE CASCADE ON DELETE CASCADE,
    foreign key (manhanvientaotaikhoan) REFERENCES nhanvien (manhanvien)
	ON UPDATE CASCADE ON DELETE CASCADE

);

create table  if not exists taikhoantindung
(
	mataikhoantindung varchar(10),
    tenloaitaikhoan varchar(20),
    sonohientai float,
    hanmuctoida float,
    primary key (mataikhoantindung),
    foreign key (mataikhoantindung) REFERENCES taikhoan (mataikhoan)
	ON UPDATE CASCADE ON DELETE CASCADE
);

create table  if not exists taikhoantietkiem
(
	mataikhoantietkiem varchar(10),
    tenloaitaikhoan varchar(20),
    laisuathangthang float,
    sodutoithieu float,
    primary key(mataikhoantietkiem),
    foreign key (mataikhoantietkiem) REFERENCES taikhoan (mataikhoan)
	ON UPDATE CASCADE ON DELETE CASCADE
);

create table  if not exists giaodichthe
(
	magiaodich varchar(20),
	mataikhoantietkiem varchar(10),
    mataikhoantindung varchar(10),
    sotiengiaodich float,
    ngaygiaodich datetime,
    manhanvienthuchien  varchar(10),
    loaigiaodich varchar(10),
    primary key (magiaodich),
    foreign key (mataikhoantietkiem) REFERENCES taikhoantietkiem (mataikhoantietkiem)
	ON UPDATE CASCADE ON DELETE CASCADE,
    foreign key (mataikhoantindung) REFERENCES taikhoantindung (mataikhoantindung)
	ON UPDATE CASCADE ON DELETE CASCADE,
	foreign key (manhanvienthuchien) REFERENCES nhanvien(manhanvien)
	ON UPDATE CASCADE ON DELETE CASCADE
);

create table  if not exists giaodichkhachhang
(
	magiaodich varchar(20),
	makhachhang varchar(10),
	mataikhoannhan varchar(10),
    loaigiaodich varchar(10),
    sotiengiaodich float,
    ngaygiaodich datetime,
    manhanvienthuchien  varchar(10),
    primary key (magiaodich),
    foreign key (mataikhoannhan) REFERENCES taikhoan(mataikhoan)
	ON UPDATE CASCADE ON DELETE CASCADE,
    foreign key (makhachhang) REFERENCES khachhang (makhachhang)
	ON UPDATE CASCADE ON DELETE CASCADE,
	foreign key (manhanvienthuchien) REFERENCES nhanvien(manhanvien)
	ON UPDATE CASCADE ON DELETE CASCADE
);
