package KTTK1_NguyenMinhTri_23710141;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Vector;
public class ListGD {
	List<GiaoDich> ls;
	public void ListCD() {
		ls= new Vector<>(3);
	}
	public boolean them(GiaoDich gd) {
		if(ls.contains(gd)==true) {
			return false;
		}else {
			return ls.add(gd);
		}
	}
	public boolean xoaGD(GiaoDich gd) {
		if(ls.contains(gd)==true) {
			return ls.remove(gd);
		}else {
			return false;
		}
	}
	public void SapXep() {
		Collections.sort(ls,new Comparator<GiaoDich>(){
			@Override
			public int compare(GiaoDich o1,GiaoDich o2) {
				String x=new String(o1.getMaGD());
				String y=new String(o2.getMaGD());
				return x.compareToIgnoreCase(y);
			}
		});
	}
	public List<GiaoDich> getAll() {
		return ls;
	}
}
