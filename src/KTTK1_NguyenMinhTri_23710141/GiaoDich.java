package KTTK1_NguyenMinhTri_23710141;
import java.util.Calendar;
import java.util.Objects;
public abstract class GiaoDich {
	protected String maGD;
	protected Calendar NgayGiaoDich;
	protected double donGia;
	protected double dienTich;
	public String getMaGD() {
		return maGD;
	}
	public void setMaGD(String maGD) {
		this.maGD = maGD;
	}
	public Calendar getNgayGiaoDich() {
		return NgayGiaoDich;
	}
	public void setNgayGiaoDich(Calendar ngayGiaoDich) {
		NgayGiaoDich = ngayGiaoDich;
	}
	public double getDonGia() {
		return donGia;
	}
	public void setDonGia(double donGia) throws Exception {
		if(donGia>0) {
			this.donGia = donGia;
		}else {
			throw new Exception("loi");
		}
		
	}
	public double getDienTich() {
		return dienTich;
	}
	public void setDienTich(double dienTich) throws Exception {
		if(dienTich>0) {
			this.dienTich = dienTich;
		}else {
			throw new Exception("loi");
		}
		
	}
	public GiaoDich() {
		
	}
	public GiaoDich(String maGD, Calendar ngayGiaoDich, double donGia, double dienTich) {
		this.maGD = maGD;
		NgayGiaoDich = ngayGiaoDich;
		this.donGia = donGia;
		this.dienTich = dienTich;
	}
	public abstract double getThanhTien();
	@Override
	public String toString() {
		String s=String.format("%s   ,localDate().now, %f   ,%f   %f",getMaGD() ,getNgayGiaoDich(),getDonGia(),getDienTich(),getThanhTien());
		return s;
	}
	@Override
	public int hashCode() {
		final int prime=31;
		int result=1;
		result=prime*result+((maGD==null) ? 0:maGD.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		GiaoDich other = (GiaoDich) obj;
		return Objects.equals(maGD, other.maGD);
	}	
}
