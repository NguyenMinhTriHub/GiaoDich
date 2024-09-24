package KTTK1_NguyenMinhTri_23710141;

import java.util.Calendar;

public class GiaoDichNha extends GiaoDich{
	private String loaiNha;
	private String DiaChi;
	
	public String getLoaiNha() {
		return loaiNha;
	}
	public void setLoaiNha(String loaiNha) {
		this.loaiNha = loaiNha;
	}
	public String getDiaChi() {
		return DiaChi;
	}
	public void setDiaChi(String diaChi) {
		DiaChi = diaChi;
	}
public GiaoDichNha() {
		
	}
	public GiaoDichNha(String maGD,Calendar ngayGiaoDich,double donGia,double dienTich,String loaiNha) {
		this.maGD=maGD;
		NgayGiaoDich=ngayGiaoDich;
		this.donGia=donGia;
		this.dienTich=dienTich;
		this.loaiNha=loaiNha;
	}
	@Override
	public double getThanhTien() {
		double thanhtien;
		if(loaiNha=LoaiNha.thuong) {
			thanhtien=getDienTich()*getDonGia()*0.9;
		}else {
			thanhtien=getDienTich()*getDonGia();
		}	
	}
	@Override
	public String toString() {
		String s=String.format("%s   ,localDate().now,  %f  ,%f   ,%s  ,%f",getMaGD(),getNgayGiaoDich(),getDonGia(),getDienTich(),getLoaiNha(),getThanhTien());
		return s;
	}
	
}
