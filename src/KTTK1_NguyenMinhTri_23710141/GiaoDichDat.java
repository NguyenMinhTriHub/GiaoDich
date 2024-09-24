package KTTK1_NguyenMinhTri_23710141;

import java.util.Calendar;

public class GiaoDichDat extends GiaoDich{
	private String LoaiDat;

	public String getLoaiDat() {
		return LoaiDat;
	}

	public void setLoaiDat(String loaiDat) {
		LoaiDat = loaiDat;
	}
	public GiaoDichDat() {
		
	}
	public GiaoDichDat(String maGD,Calendar ngayGiaoDich,double donGia,double dienTich,String LoaiDat) {
		this.maGD=maGD;
		NgayGiaoDich=ngayGiaoDich;
		this.donGia=donGia;
		this.dienTich=dienTich;
		this.LoaiDat=LoaiDat;
	}

	@Override
	public double getThanhTien() {
		double thanhtien;
		if(LoaiDat=LoaiDat.A) {
			thanhtien=getDienTich()*getDonGia()*1.5;
		}else {
			thanhtien=getDienTich()*getDonGia();
		}
		
	}
	@Override
	public String toString() {
		String s=String.format("%s   ,localDate().now,   %f  ,%f  ,%s   ,%f",getMaGD(),getNgayGiaoDich(),getDonGia(),getDienTich(),getLoaiDat(),getThanhTien());
		return s;
	}
	
}

