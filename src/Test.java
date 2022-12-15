import java.util.Scanner;

public class Test {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			DanhSachSinhVien dssv = new DanhSachSinhVien();
			dssv.LamRong();
			int luaChon;
			
			do {
				System.out.println("======MENU=====");
				System.out.println("1.Thêm sinh viên");
				System.out.println("2.In danh sách sinh viên");
				System.out.println("3.Kiểm tra danh sách sinh viên rỗng hay không");
				System.out.println("4.Lấy ra số lượng sinh viên trong danh sách");
				System.out.println("5.Làm rỗng danh sách sinh viên");
				System.out.println("6.Kiểm tra sinh viên có tồn tại hay không dựa trên msv");
				System.out.println("7.Xóa sinh viên ra khỏi danh sách dựa trên msv");
				System.out.println("8.Tìm kiếm tất cả sinh viên dựa trên tên được nhập từ bàn phím");
				System.out.println("9.Xuất ra sinh viên theo danh sách có điểm từ cao đến thấp");
				luaChon = sc.nextInt();
				sc.nextLine();
				if(luaChon == 1) {
					
					System.out.println("Nhập mã sinh viên: ");
					String maSV = sc.nextLine();
					System.out.println("Nhập họ tên sinh viên: ");
					String hoTen = sc.nextLine();
					System.out.println("Nhập năm sinh: ");
					int namSinh = sc.nextInt();
					System.out.println("Nhập điểm: ");
					float diem = sc.nextFloat();
					sc.nextLine();
					
					
					SinhVien sv = new SinhVien(maSV, hoTen, namSinh, diem);
					
					dssv.addSinhVien(sv);
				} else if(luaChon == 2) {
					dssv.Indssv();
				} else if(luaChon == 3) {
					if(dssv.KtraDanhSachSinhVien()) {
						System.out.println("Danh sách sinh viên rỗng");
					} else {
						System.out.println("Danh sách tồn tại sinh viên");
					}
				} else if(luaChon == 4) {
					System.out.println("Số lượng sinh viên: "+dssv.LaySoLuong());
				} else if(luaChon == 5) {
					dssv.LamRong();
					System.out.println("Danh sách sinh viên đã được làm rỗng");
				} else if(luaChon == 6) {
					System.out.println("Nhập mã sinh viên: ");
					String maSV = sc.nextLine();
					SinhVien sv1 = new SinhVien(maSV); 
					if(dssv.KtraSinhVienTonTai(sv1)) {
						System.out.println("Tồn tại sinh viên trong danh sách");
					} else {
						System.out.println("Không tồn tại sinh viên trong danh sách");
					}
				} else if(luaChon == 7) {
					System.out.println("Nhập mã sinh viên can xóa: ");
					String maSV = sc.nextLine();
					SinhVien sv1 = new SinhVien(maSV); 
					if(dssv.KtraSinhVienTonTai(sv1)) {
						dssv.xoaSinhVien(sv1);
					} else {
						System.out.println("Không tồn tại sinh viên trong danh sách");
					}
				} else if(luaChon == 8) {
					System.out.println("Nhập tên sinh viên: ");
					String hoTen = sc.nextLine();
					if(dssv.timKiem(hoTen)) {
						dssv.Indssv();
					} else {
						System.out.println("Không tồn tại sinh viên");
					}
				} else if(luaChon == 9){
					dssv.sapXep();
					dssv.Indssv();
				}
				
			} while (luaChon != 0);
			
			System.out.println("Bạn đã thoát chương trình");
			
			
			
		}
}
