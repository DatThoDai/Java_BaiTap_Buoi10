package bai04;

import java.util.Scanner;

public class Oto extends PhuongTienGiaoThong {
	private int soChoNgoi;
	private String kieuDongCo;

	public int getSoChoNgoi() {
		return soChoNgoi;
	}

	public void setSoChoNgoi(int soChoNgoi) {
		this.soChoNgoi = soChoNgoi;
	}

	public String getKieuDongCo() {
		return kieuDongCo;
	}

	public void setKieuDongCo(String kieuDongCo) {
		this.kieuDongCo = kieuDongCo;
	}

	public Oto() {
	}

	public Oto(String hangSanXuat, String tenPhuongTien, int namSanXuat, double vanTocToiDa, int soChoNgoi,
			String kieuDongCo) {
		super(hangSanXuat, tenPhuongTien, namSanXuat, vanTocToiDa);
		this.soChoNgoi = soChoNgoi;
		this.kieuDongCo = kieuDongCo;
	}

	@Override
	public void nhap() {
		Scanner scan = new Scanner(System.in);
		super.nhap();
		System.out.print("Nhập số chỗ ngồi: ");
		this.soChoNgoi = Integer.parseInt(scan.nextLine());

		System.out.print("Nhập kiểu động cơ: ");
		this.kieuDongCo = scan.nextLine();
	}

	@Override
	public void xuat() {
		super.xuat();
		System.out.println("Số chỗ ngồi: " + soChoNgoi);
		System.out.println("Kiểu động cơ: " + kieuDongCo);
	}

}
