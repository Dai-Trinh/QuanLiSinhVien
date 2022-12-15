import java.util.Objects;

public class SinhVien implements Comparable<SinhVien> {
	private String maSV;
	private String hoTen;
	private int namSinh;
	private float diem;
	
	public SinhVien(String maSV) {
		this.maSV = maSV;
	}

	public SinhVien(String maSV, String hoTen, int namSinh, float diem) {
		super();
		this.maSV = maSV;
		this.hoTen = hoTen;
		this.namSinh = namSinh;
		this.diem = diem;
	}
	
	
	public String getMaSV() {
		return maSV;
	}
	
	public void setMaSV(String maSV) {
		this.maSV = maSV;
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public int getNamSinh() {
		return namSinh;
	}
	public void setNamSinh(int namSinh) {
		this.namSinh = namSinh;
	}
	public float getDiem() {
		return diem;
	}
	public void setDiem(float diem) {
		this.diem = diem;
	}
	
	
	public void InSinhVien() {
		System.out.println("Mã sinh viên: "+maSV);
		System.out.println("Họ tên: "+hoTen);
		System.out.println("Năm sinh: "+namSinh);
		System.out.println("Điểm: "+diem);
	}


	@Override
	public int hashCode() {
		return Objects.hash(maSV);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SinhVien other = (SinhVien) obj;
		return Objects.equals(maSV, other.maSV);
	}

	@Override
	public int compareTo(SinhVien o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
	
	
	
	
}
