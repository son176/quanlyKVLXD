create database QLKVLXD
go
 use QLKVLXD
 go


 create table NhaCungCap(
	MaNCC nvarchar(10),
	TenNCC nvarchar(50) not null,
	DiaChi nvarchar(200) not null,
	SDT nvarchar(20) not null,
	constraint PK_NhaCungCap primary key (MaNCC),
 );

 create table NhanVien(
	MaNV nvarchar(10),
	TenNV nvarchar(50) not null,
	NgaySinh date null,
	SDT nvarchar(20) not null,
	DiaChi nvarchar(200) not null,
	VaiTro bit not null,
	MatKhau nvarchar(50) not null,
	Hinh nvarchar(50) null,
	constraint PK_NhanVien primary key (MaNV),
 );
 

create table HDNhap(
	MaHDN int IDENTITY(1,1),
	MaNV nvarchar(10) not null,
	MaNCC nvarchar(10) not null,
	TenLaiXe nvarchar(50) null,
	SDTLaiXe nvarchar(20) null,
	NgayNhap date not null,

	constraint PK_HDNhap primary key (MaHDN),
	constraint FK_HDNhap_NhanVien foreign key (MaNV) references NhanVien(MaNV),
	constraint FK_HDNhap_NhaCungCap foreign key (MaNCC) references NhaCungCap(MaNCC)
);

create table KhachHang(
	MaKH nvarchar(10),
	TenKH nvarchar(50) not null,
	SDT nvarchar(20) not null,
	DiaChi nvarchar(200) null,
	constraint PK_KhachHang primary key (MaKH),
);

create table HDXuat(
	MaHDX int IDENTITY(1,1) ,
	MaNV nvarchar(10) not null,
	MaKH nvarchar(10) not null,
	TenLaiXe nvarchar(50) not null,
	SDTLaiXe nvarchar(20) not null,
	NgayXuat date,
	TrangThai bit,

	constraint PK_HDXuat primary key (MaHDX),
	constraint FK_HDXuat_NhanVien foreign key (MaNV) references NhanVien(MaNV),
	constraint FK_HDXuat_KhachHang foreign key (MaKH) references KhachHang(MaKH)
);


create table LoaiHang(
	MaLH nvarchar(10) not null,
	TenLH nvarchar(50) not null,
	constraint PK_LoaiHang primary key (MaLH),
);

create table Kho(
	MaKho nvarchar(10) not null,
	TenKho nvarchar(50) not null,
	MaLH nvarchar(10) not null,
	ViTri nvarchar(200) not null,
	DienTich float not null,
	constraint PK_Kho primary key (MaKho),
	constraint FK_Kho_LoaiHang foreign key (MaLH) references LoaiHang(MaLH),
);

create table KeHang(
	MaKe nvarchar(10) not null,
	TrangThai bit not null,
	MaKho nvarchar(10) not null,
	SucChua float null,
	
	constraint PK_KeHang primary key (MaKe),
	constraint FK_KeHang_Kho foreign key (MaKho) references Kho(MaKho),
);

create table ThuocTinh(
	MaTT int IDENTITY(1,1) not null,
	TenTT nvarchar(50) not null,
	Mota nvarchar (200) null,

	constraint PK_ThuocTinh primary key (MaTT),
);

create table MatHang(
	MaMH nvarchar(10) not null,
	MaLH nvarchar(10) not null,
	MaKe nvarchar(10) not null,
	TenMH nvarchar(50) not null,
	DonGia float not null,
	DonVi nvarchar(10) not null,
	SoLuong float ,
	NgaySanXuat date null,
	Hang nvarchar(50) null,

	constraint PK_MatHang primary key (MaMH),
	constraint FK_MatHang_MaLH foreign key (MaLH) references LoaiHang(MaLH),
	constraint FK_MatHang_KeHang foreign key (MaKe) references KeHang(MaKe),
);

create table ThuocTinhCT(
	MaTTCT int IDENTITY(1,1) not null,
	MaTT int not null,
	MaMH nvarchar(10) not null,
	GiaTri nvarchar(20) null,
	
	constraint PK_ThuocTinhCT primary key (MaTT,MaMH),
	constraint FK_ThuocTinhCT_ThuocTinh foreign key (MaTT) references ThuocTinh(MaTT),
	constraint FK_ThuocTinhCT_MatHang foreign key (MaMH) references MatHang(MaMH),
);



create table HDXuatCT(
	ID int IDENTITY(1,1),
	MaHDX int not null,
	SoLuong float not null,
	MaMH nvarchar(10) not null,
	GhiChu nvarchar(100),
	GiaXuat float not null,

	constraint PK_HDXuatCT primary key (ID),
	constraint FK_HDXuatCT_MaHDX foreign key (MaHDX) references HDXuat(MaHDX),
	constraint FK_HDXuatCT_MatHang foreign key (MaMH) references MatHang(MaMH),
);

create table HDNhapCT(
	ID int IDENTITY(1,1),
	MaHDN int not null,
	MaMH nvarchar(10) not null,
	TenMH nvarchar(50) not null,
	SoLuong float not null,
	DVT nvarchar(10) not null,
	GiaNiemYet float not null,
	GhiChu nvarchar(100) null,

	constraint PK_HDNhapCT primary key (ID),
	constraint FK_HDNhapCT_MaHDN foreign key (MaHDN) references HDNhap(MaHDN),
	constraint FK_HDNhapCT_MatHang foreign key (MaMH) references MatHang(MaMH),
);

create table HangTon(
	MaMH nvarchar(10) not null,
	TenMH nvarchar(50) not null,
	SL float default 0,
	MaKe  nvarchar(10) not null,
	NgayNhap date not null,
	Nam int not null,
	Quy int not null,
	constraint PK_HangTon primary key (MaMH)
);

create table KiemKe(
	MaMH nvarchar(10) not null,
	NgayKiemKe date not null,
	SLKiemKe float,
	SLHong float,

	constraint PK_KiemKe primary key (MaMH,NgayKiemKe),
	constraint FK_KiemKe_MatHang foreign key(MaMH) references MatHang(MaMH)
);


insert into NhaCungCap values (N'NCC01',N'Cty Sắt Hòa Bình',N'Đình Trám - Việt Yên - Bắc Giang',N'0394827482')
insert into NhaCungCap values (N'NCC02',N'Cty VLXD Hòa Bình',N'Lữ - Hiệp Hòa - Bắc Giang',N'0362718491')
insert into NhaCungCap values (N'NCC03',N'Cty Gạch Thượng Lan',N'Thượng Lan - Việt Yên - Bắc Giang',N'0937281947')
insert into NhaCungCap values (N'NCC04',N'Cty Phụ Kiện Hoàng Hôn',N'Nếnh - Việt Yên - Bắc Giang',N'0938271831')
insert into NhaCungCap values (N'NCC05',N'Cty Gạch Sáu Tre',N'Đông Lỗ - HIệp Hòa - Bắc Giang',N'0392817284')


insert into NhanVien values (N'NV01',N'Nguyễn Hồng Sơn','1996-07-11',N'0928371628',N'Hạ Hòa - Phú Thọ',1,N'12345',N'Son.jpg')
insert into NhanVien values (N'NV02',N'Diêm Công Thắng','1998-07-11',N'0391827381',N'Bắc Giang',1,N'12345',N'Thang.jpg')
insert into NhanVien values (N'NV03',N'Nguyễn Đức Cường','1996-05-02',N'0394595923',N'Hải Dương',0,N'12345',N'Cuong.jpg')
insert into NhanVien values (N'NV04',N'Hoàng Hiếu Nam','1996-03-11',N'0928371628',N'Ninh Bình',0,N'12345',N'Nam.jpg')
insert into NhanVien values (N'NV05',N'Phan Đình Tạc','1996-06-01',N'0293748172',N'Thái Bình',0,N'12345',N'Tac.jpg')


insert into KhachHang values (N'KH001',N'Diêm Thị Huyền',N'0927361824',N'Thôn Tam Hợp')
insert into KhachHang values (N'KH002',N'Nguyễn Thị Huyền',N'0827471628',N'Thôn Xuân Minh')
insert into KhachHang values (N'KH003',N'Hoàng Văn Sô',N'0381729412',N'Thôn Ấp Bài')
insert into KhachHang values (N'KH004',N'Nguyễn Đức Liêm',N'09382718471',N'ĐỒng Ích')
insert into KhachHang values (N'KH005',N'Trương Văn Huy',N'0291284',N'Xuân Lạn')

/*insert into HDNhap values (N'NV01',N'NCC03',N'Diêm Công Thắng',N'0972817627','2020-10-10')
insert into HDNhap values (N'NV01',N'NCC02',N'Trương Văn Huy',N'0391827381','2020-10-11')
insert into HDNhap values (N'NV01',N'NCC04',N'Phan Đình Tạc',N'0972817627','2020-10-12')
insert into HDNhap values (N'NV01',N'NCC01',N'Nguyễn Đức Thắng',N'0298174812','2020-10-14')
insert into HDNhap values (N'NV01',N'NCC05',N'Nguyễn Đức Toàn',N'0918274812','2020-10-16')
*/

insert into HDXuat values (N'NV01',N'KH003',N'Diêm Công Thắng',N'0972817627','2020-10-10',1)
insert into HDXuat values (N'NV01',N'KH002',N'Trương Văn Huy',N'0391827381','2020-10-11',1)
insert into HDXuat values (N'NV01',N'KH004',N'Phan Đình Tạc',N'0972817627','2020-10-12',0)
insert into HDXuat values (N'NV01',N'KH001',N'Nguyễn Đức Thắng',N'0298174812','2020-10-14',1)
insert into HDXuat values (N'NV01',N'KH005',N'Nguyễn Đức Toàn',N'0918274812','2020-10-16',1)

insert into LoaiHang values (N'LH01',N'Sắt')
insert into LoaiHang values (N'LH02',N'Cát')
insert into LoaiHang values (N'LH03',N'Gạch')
insert into LoaiHang values (N'LH04',N'Sỏi')
insert into LoaiHang values (N'LH05',N'Phụ kiện')

insert into Kho values (N'K01',N'Kho Sắt',N'LH01',N'Thôn Xuân Minh',90)
insert into Kho values (N'K02',N'Kho Cát',N'LH02',N'Thôn Xuân Minh',360)
insert into Kho values (N'K03',N'Kho Gạch',N'LH03',N'Thôn Xuân Minh',90)
insert into Kho values (N'K04',N'Kho Sỏi',N'LH04',N'Thôn Xuân Minh',360)
insert into Kho values (N'K05',N'Kho Phụ kiện',N'LH05',N'Thôn Xuân Minh',45)

insert into KeHang values (N'KE_SH',0,N'K01',3000)
insert into KeHang values (N'KE_SC',0,N'K01',5000)
insert into KeHang values (N'KE_SP',0,N'K01',1000)
insert into KeHang values (N'KE_CT',0,N'K02',100)
insert into KeHang values (N'KE_CC',0,N'K02',100)
insert into KeHang values (N'KE_CX',0,N'K02',100)
insert into KeHang values (N'KE_CD',0,N'K02',100)
insert into KeHang values (N'KE_GO',0,N'K03',100)
insert into KeHang values (N'KE_GD',0,N'K03',100)
insert into KeHang values (N'KE_SO',0,N'K04',400)
insert into KeHang values (N'KE_PK1',0,N'K05',500)
insert into KeHang values (N'KE_PK2',0,N'K05',500)
insert into KeHang values (N'KE_PK3',0,N'K05',500)
insert into KeHang values (N'KE_PK4',0,N'K05',500)

insert into MatHang values(N'SH01',N'LH01',N'KE_SH',N'Sắt hộp 1.0',50182,N'cây',900,'2020-03-03','Hòa Phát')
insert into MatHang values(N'SH02',N'LH01',N'KE_SH',N'Sắt hộp 1.1',54836,N'cây',900,'2020-03-03','Hòa Phát')
insert into MatHang values(N'SH03',N'LH01',N'KE_SH',N'Sắt hộp 1.4',68364,N'cây',900,'2020-03-03','Hòa Phát')
insert into MatHang values(N'SC01',N'LH01',N'KE_SC',N'Sắt cuộn',13364,N'KG',900,'2020-02-03','Thái Nguyên')
insert into MatHang values(N'SC02',N'LH01',N'KE_SC',N'Sắt cuộn',13364,N'KG',900,'2020-02-03','Đa Hội')
insert into MatHang values(N'SP01',N'LH01',N'KE_SP',N'Sắt phi 10',100000,N'cây',900,'2020-02-03','Thái Nguyên')
insert into MatHang values(N'SP02',N'LH01',N'KE_SP',N'Sắt phi 12',120000,N'cây',900,'2020-02-03','Thái Nguyên')
insert into MatHang values(N'SP03',N'LH01',N'KE_SP',N'Sắt phi 14',135000,N'cây',900,'2020-02-03','Thái Nguyên')
insert into MatHang values(N'SP04',N'LH01',N'KE_SP',N'Sắt phi 16',150000,N'cây',900,'2020-02-03','Thái Nguyên')
insert into MatHang values(N'SP05',N'LH01',N'KE_SP',N'Sắt phi 18',165000,N'cây',900,'2020-02-03','Thái Nguyên')
insert into MatHang values(N'CT01',N'LH02',N'KE_CT',N'Cát tân',80000,N'm3',900,'2020-01-03',null)
insert into MatHang values(N'CC01',N'LH02',N'KE_CC',N'Cát chát',100000,N'm3',900,'2020-01-03',null)
insert into MatHang values(N'CX01',N'LH02',N'KE_CX',N'Cát xây',140000,N'm3',900,'2020-01-03',null)
insert into MatHang values(N'CD01',N'LH02',N'KE_CD',N'Cát đổ',250000,N'm3',900,'2020-01-03',null)
insert into MatHang values(N'GO01',N'LH03',N'KE_GO',N'Gạch ống',700,N'viên',900,'2020-01-03',null)
insert into MatHang values(N'GD01',N'LH03',N'KE_GD',N'Gạch đặc',1000,N'viên',900,'2020-01-03',null)
insert into MatHang values(N'SO01',N'LH04',N'KE_SO',N'Sỏi',200000,N'm3',900,'2020-01-03',null)
insert into MatHang values(N'PK01',N'LH05',N'KE_PK1',N'Bay',20000,N'cái',900,'2020-01-03',null)
insert into MatHang values(N'PK02',N'LH05',N'KE_PK2',N'Xô',20000,N'cái',900,'2020-01-03',null)
insert into MatHang values(N'PK03',N'LH05',N'KE_PK4',N'Xe rùa',150000,N'cái',900,'2020-01-03',null)
insert into MatHang values(N'PK04',N'LH05',N'KE_PK1',N'Kìm hàn',30000,N'cái',900,'2020-01-03',null)

insert into ThuocTinh values (N'Đường kính',null)
insert into ThuocTinh values (N'Dài',null)
insert into ThuocTinh values (N'Độ dày',null)
insert into ThuocTinh values (N'Màu',null) 

insert into ThuocTinhCT values (1,N'SP01',10)
insert into ThuocTinhCT values (2,N'SP01',20)
insert into ThuocTinhCT values (3,N'SP02',50)
insert into ThuocTinhCT values (4,N'SP03',N'Đỏ')
insert into ThuocTinhCT values (1,N'SP03',45)

insert into HDXuatCT values (1,3,N'SH01',null,421)
insert into HDXuatCT values (1,32,N'GO01',null,63)
insert into HDXuatCT values (2,13,N'PK02',null,6364)
insert into HDXuatCT values (3,32,N'SP04',null,856)
insert into HDXuatCT values (4,45,N'SH01',null,364)
insert into HDXuatCT values (5,12,N'CD01',null,724)
insert into HDXuatCT values (5,61,N'SH01',null,421)
insert into HDXuatCT values (5,91,N'SH01',null,421)

insert into KiemKe values (N'SH01','2020-10-01',898,1)
insert into KiemKe values (N'SH01','2020-7-01',898,1)
insert into KiemKe values (N'SP02','2020-04-01',898,1)
insert into KiemKe values (N'PK04','2020-01-01',898,1)
insert into KiemKe values (N'PK04','2019-10-01',898,1)

 ---proc hàng tồn kho
create proc HangTonKho(@year int, @fm int, @lm int)
as begin
select HDXuatCT.MaMH,MatHang.TenMH,Sum(HDNhapCT.SoLuong) as SLN,SUM(HDXuatCT.SoLuong) as SLX, KiemKe.SLHong, (Sum(HDNhapCT.SoLuong)-SUM(HDXuatCT.SoLuong)-KiemKe.SLHong) as SLTonKho from HDXuatCT
join HDXuat on HDXuat.MaHDX=HDXuatCT.MaHDX
join MatHang on MatHang.MaMH=HDXuatCT.MaMH
join HDNhapCT on MatHang.MaMH=HDNhapCT.MaMH
join HDNhap on HDNhap.MaHDN=HDNhapCT.MaHDN
join KiemKe on KiemKe.MaMH=MatHang.MaMH
where YEAR(NgayNhap) = @year and MONTH(NgayNhap) between @fm and @lm
and YEAR(NgayXuat) = @year and MONTH(NgayXuat) between @fm and @lm and HDXuat.TrangThai=1
group by HDXuatCT.MaMH,MatHang.TenMH,KiemKe.SLHong
end

/*
IF OBJECT_ID('FN_MATHANG') IS NOT NULL
DROP FUNCTION FN_MATHANG
GO

CREATE FUNCTION FN_MATHANG
(
	@MaLH NVARCHAR(10),
	@MaKe NVARCHAR(50),
	@TenMH NVARCHAR(50),
	@DonGia FLOAT,
	@DonVi NVARCHAR(10),
	@NgaySanXuat DATE,
	@Hang NVARCHAR(50)
)
RETURNS NVARCHAR(10)
BEGIN
RETURN(SELECT MaMH FROM MatHang 
WHERE 
RTRIM(MaLH)=@MaLH AND
RTRIM(MaKe)=@MaKe AND
RTRIM(TenMH)=@TenMH AND
RTRIM(DonGia)=@DonGia AND
RTRIM(DonVi)=@DonVi AND
RTRIM(DonGia)=@DonGia AND
RTRIM(Hang)=@Hang
)
END
*/
