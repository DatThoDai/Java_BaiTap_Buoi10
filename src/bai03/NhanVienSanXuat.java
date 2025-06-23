package bai03;

import java.time.LocalDate;

public class NhanVienSanXuat extends NhanVien {
	private int soSanPham;

	public NhanVienSanXuat() {
	}

	public NhanVienSanXuat(String hoTen, LocalDate ngaySinh, double luongCanBan, int soSanPham) {
		super(hoTen, ngaySinh, luongCanBan);
		this.soSanPham = soSanPham;
	}

	@Override
	public double tinhLuong() {
		 return luongCanBan + (soSanPham * 5000);
	}

	public int getSoSanPham() {
		return soSanPham;
	}

	public void setSoSanPham(int soSanPham) {
		this.soSanPham = soSanPham;
	}
	
	@Override
    public String toString() {
        return super.toString() + String.format(", Số sản phẩm: %d, Lương thực tế: %.0f VND", 
                                              soSanPham, tinhLuong());
    }

}
