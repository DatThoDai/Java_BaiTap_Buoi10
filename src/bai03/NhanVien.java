package bai03;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public abstract class NhanVien {
	protected String hoTen;
	protected LocalDate ngaySinh;
	protected double luongCanBan;

	public NhanVien() {}

	public NhanVien(String hoTen, LocalDate ngaySinh, double luongCanBan) {
		this.hoTen = hoTen;
		this.ngaySinh = ngaySinh;
		this.luongCanBan = luongCanBan;
	}
	
	public abstract double tinhLuong();

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public LocalDate getNgaySinh() {
		return ngaySinh;
	}

	public void setNgaySinh(LocalDate ngaySinh) {
		this.ngaySinh = ngaySinh;
	}

	public double getLuongCanBan() {
		return luongCanBan;
	}

	public void setLuongCanBan(double luongCanBan) {
		this.luongCanBan = luongCanBan;
	}
	
	@Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return String.format("Họ tên: %s, Ngày sinh: %s, Lương cơ bản: %.0f VND", 
                           hoTen, ngaySinh.format(formatter), luongCanBan);
    }

}
