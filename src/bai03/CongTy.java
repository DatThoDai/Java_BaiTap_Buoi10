package bai03;

import java.util.ArrayList;
import java.util.List;

public class CongTy {
	private List<NhanVien> danhSachNhanVien;
	private String tenCongTy;

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

}
