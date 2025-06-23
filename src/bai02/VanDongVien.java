package bai02;

import java.util.Scanner;

public class VanDongVien {
	private String hoten;
	private int tuoi;
	private String monthidau;
	private double cannang;
	private double chieucao;

	public String getHoten() {
		return hoten;
	}

	public void setHoten(String hoten) {
		this.hoten = hoten;
	}

	public int getTuoi() {
		return tuoi;
	}

	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}

	public String getMonthidau() {
		return monthidau;
	}

	public void setMonthidau(String monthidau) {
		this.monthidau = monthidau;
	}

	public double getCannang() {
		return cannang;
	}

	public void setCannang(double cannang) {
		this.cannang = cannang;
	}

	public double getChieucao() {
		return chieucao;
	}

	public void setChieucao(double chieucao) {
		this.chieucao = chieucao;
	}

	public VanDongVien() {
	}

	public VanDongVien(String hoten, int tuoi, String monthidau, double cannang, double chieucao) {
		this.hoten = hoten;
		this.tuoi = tuoi;
		this.monthidau = monthidau;
		this.cannang = cannang;
		this.chieucao = chieucao;
	}

	public void nhap() {
		Scanner scan = new Scanner(System.in);

		System.out.print("Nhập họ tên: ");
		this.hoten = scan.nextLine();

		System.out.print("Nhập tuổi: ");
		this.tuoi = scan.nextInt();
		scan.nextLine();

		System.out.print("Nhập môn thi đấu: ");
		this.monthidau = scan.nextLine();

		System.out.print("Nhập cân nặng: ");
		this.cannang = scan.nextDouble();

		System.out.print("Nhập chiều cao: ");
		this.chieucao = scan.nextDouble();
	}

	public void xuat() {
        System.out.println("Thông tin vận động viên");
		System.out.println("Họ tên: " + hoten);
		System.out.println("Tuổi: " + tuoi);
		System.out.println("Môn thi đấu: " + monthidau);
		System.out.println("Cân nặng: " + cannang);
		System.out.println("Chiều cao: " + chieucao);
	}

	public boolean lonHon(VanDongVien vdv) {
        if (this.chieucao > vdv.chieucao) {
            return true;
        } else if (this.chieucao == vdv.chieucao) {
            return this.cannang > vdv.cannang;
        } else {
            return false;
        }
    }

}
