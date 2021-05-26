select Kho.MaKho,TenKho,ROUND(Sum(KeHang.SucChua),0)as TSC,ROUND(SUM(MatHang.SoLuong),0) as TSL,CAST(Sum(MatHang.SoLuong*MatHang.DonGia) as decimal) as TGT from Kho 
join KeHang on KeHang.MaKho=Kho.MaKho 
join MatHang on MatHang.MaKe=KeHang.MaKe
group by Kho.MaKho,TenKho


select top 5 HDXuatCT.MaMH,TenMH,ROUND(Sum(HDXuatCT.SoLuong*HDXuatCT.GiaXuat),0) as TGT  from HDXuatCT 
join MatHang on MatHang.MaMH=HDXuatCT.MaMH
group by HDXuatCT.MaMH,TenMH order by TGT desc


select MaHDX,NhanVien.TenNV,KhachHang.TenKH,KhachHang.SDT,KhachHang.DiaChi,TenLaiXe,SDTLaiXe from HDXuat 
join NhanVien on NhanVien.MaNV=HDXuat.MaNV
join KhachHang on KhachHang.MaKH=HDXuat.MaKH
where HDXuat.TrangThai=0

-- thong ke doanh thu
select Sum(HDXuatCT.SoLuong*HDXuatCT.GiaXuat) as Xuat,Sum(HDNhapCT.SoLuong*HDNhapCT.GiaNiemYet) as Nhap from HDXuat
join NhanVien on NhanVien.MaNV=HDXuat.MaNV
join HDNhap on HDNhap.MaNV=NhanVien.MaNV
join HDNhapCT on HDNhap.MaHDN=HDNhapCT.MaHDN
join HDXuatCT on HDXuat.MaHDX=HDXuatCT.MaHDX
where YEAR(NgayNhap) = 2020 and MONTH(NgayNhap) = 12
	and YEAR(NgayXuat) = 2020 and MONTH(NgayXuat) = 12

select YEAR(NgayNhap) as nam, MONTH(NgayNhap)as thang from  HDNhap
where YEAR(NgayNhap) in (select YEAR(NgayXuat) from HDXuat) and MONTH(NgayNhap) in (select MONTH(NgayXuat) from HDXuat)

-- thong ke hao hut
select MONTH(NgayKiemKe) as thang,MatHang.MaMH,TenMH,MatHang.SoLuong,SLKiemKe,(select SoLuong from HangTon where YEAR(NgayNhap)=2020) as SLTon,SLHong,(SoLuong - SLKiemKe - SLHong)as HaoHut from MatHang
join KiemKe on KiemKe.MaMH= MatHang.MaMH
where MatHang.MaMH=N'PK04' and YEAR(NgayKiemKe) = 2020

-- thong ke hang ton
select HDXuatCT.MaMH,MatHang.TenMH,Sum(HDNhapCT.SoLuong) as SLN,SUM(HDXuatCT.SoLuong) as SLX, KiemKe.SLHong, (Sum(HDNhapCT.SoLuong)-SUM(HDXuatCT.SoLuong)-KiemKe.SLHong) as SLTonKho from HDXuatCT
join HDXuat on HDXuat.MaHDX=HDXuatCT.MaHDX
join MatHang on MatHang.MaMH=HDXuatCT.MaMH
join HDNhapCT on MatHang.MaMH=HDNhapCT.MaMH
join HDNhap on HDNhap.MaHDN=HDNhapCT.MaHDN
join KiemKe on KiemKe.MaMH=MatHang.MaMH
where YEAR(NgayNhap) = 2020 and MONTH(NgayNhap) between 10 and 12
  and YEAR(NgayXuat) = 2020 and MONTH(NgayXuat) between 10 and 12 and HDXuat.TrangThai=1

group by HDXuatCT.MaMH,MatHang.TenMH,KiemKe.SLHong


 -- proc HangTonKho
go
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

exec HangTonKho 2020,10,12

select * from MatHang 