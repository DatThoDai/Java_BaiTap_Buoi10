package bai03;

import java.time.LocalDate;

public class NhanVienVanPhong extends NhanVien {
	private int soNgayLamViec;

	public NhanVienVanPhong(String hoTen, LocalDate ngaySinh, double luongCanBan, int soNgayLamViec) {
		super(hoTen, ngaySinh, luongCanBan);
		this.soNgayLamViec = soNgayLamViec;
	}

	@Override
	public double tinhLuong() {
		return soNgayLamViec * 100000;
	}

	public int getSoNgayLamViec() {
		return soNgayLamViec;
	}

	public void setSoNgayLamViec(int soNgayLamViec) {
		this.soNgayLamViec = soNgayLamViec;
	}

	@Override
	public String toString() {
		return super.toString()
				+ String.format(", Số ngày làm việc: %d, Lương thực tế: %.0f VND", soNgayLamViec, tinhLuong());
	}
}