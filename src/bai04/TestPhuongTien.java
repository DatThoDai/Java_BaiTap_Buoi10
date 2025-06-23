package bai04;

import java.util.Scanner;

public class TestPhuongTien {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		QuanLyPhuongTien quanLy = new QuanLyPhuongTien();
		int luaChon;
		
		do {
			hienThiMenu();
			System.out.print("Nhập lựa chọn của bạn: ");
			luaChon = Integer.parseInt(scanner.nextLine());
			
			switch (luaChon) {
				case 1:
					quanLy.tạoDuLieuGia();
					break;
				case 2:
					quanLy.nhapPhuongTienThuong();
					break;
				case 3:
					quanLy.nhapDanhSachOto();
					break;
				case 4:
					quanLy.xuatDanhSach();
					break;
				case 5:
					quanLy.testOtoCungVanToc();
					break;
				case 0:
					System.out.println("Thoát!");
					break;
				default:
					System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại!");
			}
			
		} while (luaChon != 0);
		
		scanner.close();
	}
	
	public static void hienThiMenu() {
		System.out.println("\n===== QUẢN LÝ PHƯƠNG TIỆN GIAO THÔNG =====");
		System.out.println("1. Tạo dữ liệu giả");
		System.out.println("2. Nhập thông tin phương tiện thường");
		System.out.println("3. Nhập danh sách ô tô");
		System.out.println("4. Xuất danh sách phương tiện");
		System.out.println("5. Kiểm tra ô tô có cùng vận tốc");
		System.out.println("0. Thoát");
	}
}
