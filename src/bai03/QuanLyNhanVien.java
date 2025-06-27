package bai03;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class QuanLyNhanVien {
    private static Scanner scanner = new Scanner(System.in);
    private static CongTy congTy = new CongTy("ABC Technology");
    
    public static void main(String[] args) {
        int luaChon;
        do {
            hienThiMenu();
            System.out.print("Nhập lựa chọn của bạn: ");
            luaChon = scanner.nextInt();
            scanner.nextLine();
            
            switch (luaChon) {
				case 1:
					themDuLieuMau();
					break;
                case 2:
                    congTy.themNhanVienMoi();
                    break;
                case 3:
                    congTy.hienThiDanhSachNhanVien();
                    break;
                case 4:
                    congTy.hienThiBangLuong();
                    break;
                case 0:
                    System.out.println("Thoát!");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }
        } while (luaChon != 0);
    }
    
    private static void hienThiMenu() {
        System.out.println("\n=== HỆ THỐNG QUẢN LÝ NHÂN VIÊN ===");
        System.out.println("1. Tạo dữ liệu nhân viên giả");
        System.out.println("2. Thêm nhân viên mới");
        System.out.println("3. Hiển thị danh sách nhân viên");
        System.out.println("4. Hiển thị bảng lương");
        System.out.println("0. Thoát");
        System.out.println("=====================================");
    }
    
    private static void themDuLieuMau() {
        congTy.themNhanVien(new NhanVienSanXuat("Nguyễn Văn An", 
                          LocalDate.of(1990, 5, 15), 3000000, 120));
        congTy.themNhanVien(new NhanVienSanXuat("Trần Thị Bình", 
                          LocalDate.of(1988, 8, 20), 3500000, 150));
        congTy.themNhanVien(new NhanVienVanPhong("Lê Văn Cường", 
                          LocalDate.of(1985, 12, 10), 5000000, 22));
        congTy.themNhanVien(new NhanVienVanPhong("Phạm Thị Dung", 
                          LocalDate.of(1992, 3, 25), 4500000, 20));
        
        System.out.println("Đã thêm dữ liệu mẫu thành công!");
    }
}
