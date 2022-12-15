import java.text.CollationElementIterator;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class DanhSachSinhVien {
	private ArrayList<SinhVien> dssv;
	
	public DanhSachSinhVien() {
		this.dssv = new ArrayList<SinhVien>();
	}
	
	
	public DanhSachSinhVien(ArrayList<SinhVien> dssv) {
		this.dssv = dssv;
	}


	public ArrayList<SinhVien> getDssv() {
		return dssv;
	}


	public void setDssv(ArrayList<SinhVien> dssv) {
		this.dssv = dssv;
	}
	
	public void addSinhVien(SinhVien sv) {
		dssv.add(sv);
	}
	//In ra danh sách  sinh viên
	public void Indssv() {
		for(SinhVien sv: dssv) {
			sv.InSinhVien();
		}
	}
	
	//Kiểm tra danh sách sinh viên rỗng hay không (Empty: rỗng)
	
	public boolean KtraDanhSachSinhVien() {
		return this.dssv.isEmpty();
	}
	
	//Lấy ra số lượng sinh viên
	
	
	public int LaySoLuong() {
		return this.dssv.size();
	}
	
	//Làm rỗng danh sách sinh viên
	
	public void LamRong() {
		this.dssv.removeAll(dssv);
	}
	
	public boolean KtraSinhVienTonTai(SinhVien sv) {
		for (SinhVien sinhVien : dssv) {
			return sinhVien.equals(sv);
		}
		return false;
	}
	
	public void xoaSinhVien(SinhVien sv) {
		dssv.remove(sv);
	}
	
	
	public boolean timKiem(String tenSV) {
		for (SinhVien sinhVien : dssv) {
			if(sinhVien.getHoTen().indexOf(tenSV) >= 0) {
				return true;
			}
		}
		return false;
	}
	
	
	public void sapXep() {
		Collections.sort(this.dssv, new Comparator<SinhVien>() {

			@Override
			public int compare(SinhVien sv1, SinhVien sv2) {
				if(sv1.getDiem() > sv2.getDiem()) {
					return -1;
				} else if(sv1.getDiem() < sv2.getDiem()) {
					return 1;
				} else {
					return 0;
				}
			}
			
		});
	}
	
	
}
