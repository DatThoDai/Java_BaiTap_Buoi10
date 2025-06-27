package bai03;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CongTy {
	private List<NhanVien> danhSachNhanVien;
	private String tenCongTy;
	private Scanner scanner = new Scanner(System.in);

	public CongTy(String tenCongTy) {
		this.tenCongTy = tenCongTy;
		this.danhSachNhanVien = new ArrayList<>();
	}

	public void themNhanVien(NhanVien nv) {
		danhSachNhanVien.add(nv);
		System.out.println("Đã thêm nhân viên: " + nv.getHoTen());
	}

	public void hienThiDanhSachNhanVien() {
		System.out.println("\n=== DANH SÁCH NHÂN VIÊN CÔNG TY " + tenCongTy.toUpperCase() + " ===");
		if (danhSachNhanVien.isEmpty()) {
			System.out.println("Không có nhân viên nào trong danh sách.");
			return;
		}

		for (int i = 0; i < danhSachNhanVien.size(); i++) {
			System.out.println((i + 1) + ". " + danhSachNhanVien.get(i));
		}
	}

	public double tinhTongLuong() {
		double tongLuong = 0;
		for (NhanVien nv : danhSachNhanVien) {
			tongLuong += nv.tinhLuong();
		}
		return tongLuong;
	}

	public void hienThiBangLuong() {
		System.out.println("\n=== BẢNG LƯƠNG THÁNG ===");
		System.out.printf("%-20s %-15s %-20s %-15s%n", "Họ tên", "Loại NV", "Chi tiết", "Lương (VND)");
		System.out.println("--------------------------------------------------------------------------------");

		for (NhanVien nv : danhSachNhanVien) {
			String loaiNV = nv instanceof NhanVienSanXuat ? "Sản xuất" : "Văn phòng";
			String chiTiet = "";

			if (nv instanceof NhanVienSanXuat) {
				NhanVienSanXuat nvsx = (NhanVienSanXuat) nv;
				chiTiet = nvsx.getSoSanPham() + " sản phẩm";
			} else if (nv instanceof NhanVienVanPhong) {
				NhanVienVanPhong nvvp = (NhanVienVanPhong) nv;
				chiTiet = nvvp.getSoNgayLamViec() + " ngày làm";
			}

			System.out.printf("%-20s %-15s %-20s %-15.0f%n", nv.getHoTen(), loaiNV, chiTiet, nv.tinhLuong());
		}

		System.out.println("--------------------------------------------------------------------------------");
		System.out.printf("%-20s %-15s %-20s %-15.0f%n", "TỔNG CỘNG", "", "", tinhTongLuong());
	}

	public void themNhanVienMoi() {
		System.out.println("\n=== THÊM NHÂN VIÊN MỚI ===");
		System.out.print("Nhập họ tên: ");
		String hoTen = scanner.nextLine();
		
		System.out.print("Nhập ngày sinh (dd/MM/yyyy): ");
		String ngaySinhStr = scanner.nextLine();
		LocalDate ngaySinh = LocalDate.parse(ngaySinhStr, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		
		System.out.print("Nhập lương cơ bản: ");
		double luongCanBan = scanner.nextDouble();
		
		System.out.println("Chọn loại nhân viên:");
		System.out.println("1. Nhân viên sản xuất");
		System.out.println("2. Nhân viên văn phòng");
		System.out.print("Lựa chọn: ");
		int loai = scanner.nextInt();
		scanner.nextLine(); // consume newline
		
		if (loai == 1) {
			System.out.print("Nhập số sản phẩm: ");
			int soSanPham = scanner.nextInt();
			NhanVienSanXuat nvsx = new NhanVienSanXuat(hoTen, ngaySinh, luongCanBan, soSanPham);
			themNhanVien(nvsx);
		} else if (loai == 2) {
			System.out.print("Nhập số ngày làm việc: ");
			int soNgayLamViec = scanner.nextInt();
			NhanVienVanPhong nvvp = new NhanVienVanPhong(hoTen, ngaySinh, luongCanBan, soNgayLamViec);
			themNhanVien(nvvp);
		} else {
			System.out.println("Lựa chọn không hợp lệ!");
		}
	}

}
