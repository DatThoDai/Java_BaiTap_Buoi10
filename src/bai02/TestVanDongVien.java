package bai02;

import java.util.Scanner;

public class TestVanDongVien {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		QuanLyVanDongVien quanLy = new QuanLyVanDongVien();
		int choice = 0;
		
		do {
			System.out.println("\n===== MENU =====");
			System.out.println("1. Tạo dữ liệu giả");
			System.out.println("2. Nhập thông tin vận động viên");
			System.out.println("3. Hiển thị danh sách vận động viên");
			System.out.println("4. So sánh vận động viên");
			System.out.println("0. Thoát");
			System.out.print("Chọn chức năng: ");
			
			choice = scanner.nextInt();
			scanner.nextLine();
			
			switch (choice) {
				case 1:
					quanLy.taoDuLieuGia();
					System.out.println("Đã tạo dữ liệu giả thành công!");
					break;
				case 2:
					quanLy.nhapThongTinVDV(scanner);
					break;
				case 3:
					quanLy.hienThiDanhSachVDV();
					break;
				case 4:
					quanLy.soSanhVanDongVien(scanner);
					break;
				case 0:
					System.out.println("Thoát!");
					break;
				default:
					System.out.println("Lựa chọn không hợp lệ, vui lòng chọn lại!");
			}
		} while (choice != 0);
		
		scanner.close();
	}
}
