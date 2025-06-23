package bai01;

public class TestPhanSo {

	public static void main(String[] args) {
		PhanSo ps1 = new PhanSo();
		PhanSo ps2 = new PhanSo();
		
		System.out.println("Nhập phân số thứ 1: " );
		ps1.nhap();
		System.out.println("Nhập phân số thứ 2: " );
		ps2.nhap();
		ps1.xuat();
		ps2.xuat();
		
		ps1.cong(ps2);
		ps1.tru(ps2);
		ps1.nhan(ps2);
		ps1.chia(ps2);
		
		
		

	}

}
