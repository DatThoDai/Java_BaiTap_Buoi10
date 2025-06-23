package bai01;

import java.util.Scanner;

public class PhanSo {
	private double tuSo;
	private double mauSo;
	
	public double getTuSo() {
		return tuSo;
	}

	public void setTuSo(double tuSo) {
		this.tuSo = tuSo;
	}

	public double getMauSo() {
		return mauSo;
	}

	public void setMauSo(double mauSo) {
		this.mauSo = mauSo;
	}

	public PhanSo() {}
	
	public void nhap() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Nhập tử số: ");
		tuSo = scan.nextDouble();
		System.out.println("Nhập mẫu số: ");
		mauSo = scan.nextDouble();
	}
	
	public void xuat() {
		System.out.println("Phân số: " + tuSo + "/" + mauSo);
	}
	
	
	public void cong (PhanSo phanSo2) {
		double kq = (tuSo * phanSo2.mauSo + phanSo2.tuSo * mauSo) / (mauSo * phanSo2.mauSo);
		System.out.println("Kết quả cộng: " + kq);
	}
	
	public void tru(PhanSo phanSo2) {
		double kq = (tuSo * phanSo2.mauSo - phanSo2.tuSo * mauSo) / (mauSo * phanSo2.mauSo);
		System.out.println("Kết quả trừ: " + kq);
	}
	
	public void nhan(PhanSo phanSo2) {
		double kq = (tuSo * phanSo2.tuSo) / (mauSo * phanSo2.mauSo);
		System.out.println("Kết quả nhân: " + kq);
	}
	
	public void chia(PhanSo phanSo2) {
		double kq = (tuSo * phanSo2.mauSo) / (mauSo * phanSo2.tuSo);
		System.out.println("Kết quả chia: " + kq);
	}

}
