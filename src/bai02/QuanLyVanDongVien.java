package bai02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuanLyVanDongVien {
    private List<VanDongVien> danhSachVDV;
    
    public QuanLyVanDongVien() {
        danhSachVDV = new ArrayList<>();
    }
    
    public void taoDuLieuGia() {
        danhSachVDV.add(new VanDongVien("Nguyễn Văn A", 25, "Bơi lội", 65.5, 175));
        danhSachVDV.add(new VanDongVien("Trần Thị B", 22, "Điền kinh", 55.0, 165));
        danhSachVDV.add(new VanDongVien("Lê Văn C", 28, "Bóng đá", 70.0, 180));
        danhSachVDV.add(new VanDongVien("Phạm Thị D", 24, "Bóng chuyền", 58.5, 170));
        danhSachVDV.add(new VanDongVien("Hoàng Văn E", 30, "Cầu lông", 62.0, 172));
    }
    
    public void nhapThongTinVDV(Scanner scanner) {
        System.out.println("\n=== Nhập thông tin vận động viên mới ===");
        VanDongVien vdv = new VanDongVien();
        vdv.nhap();
        danhSachVDV.add(vdv);
        System.out.println("Đã thêm vận động viên thành công!");
    }
    
    public void hienThiDanhSachVDV() {
        if (danhSachVDV.isEmpty()) {
            System.out.println("Danh sách vận động viên trống!");
            return;
        }
        
        System.out.println("\n=== DANH SÁCH VẬN ĐỘNG VIÊN ===");
        for (int i = 0; i < danhSachVDV.size(); i++) {
            System.out.println("\nVận động viên thứ " + (i + 1) + ":");
            danhSachVDV.get(i).xuat();
        }
    }
    
    public void soSanhVanDongVien(Scanner scanner) {
        if (danhSachVDV.size() < 2) {
            System.out.println("Cần ít nhất 2 vận động viên để so sánh!");
            return;
        }
        
        System.out.println("\n=== SO SÁNH VẬN ĐỘNG VIÊN ===");
        hienThiDanhSachVDV();
        
        System.out.print("\nChọn vận động viên thứ nhất (1-" + danhSachVDV.size() + "): ");
        int idx1 = scanner.nextInt() - 1;
        
        System.out.print("Chọn vận động viên thứ hai (1-" + danhSachVDV.size() + "): ");
        int idx2 = scanner.nextInt() - 1;
        
        if (idx1 < 0 || idx1 >= danhSachVDV.size() || idx2 < 0 || idx2 >= danhSachVDV.size()) {
            System.out.println("Lựa chọn không hợp lệ!");
            return;
        }
        
        VanDongVien vdv1 = danhSachVDV.get(idx1);
        VanDongVien vdv2 = danhSachVDV.get(idx2);
        
        System.out.println("\nKết quả so sánh:");
        if (vdv1.lonHon(vdv2)) {
            System.out.println("Vận động viên " + vdv1.getHoten() + " lớn hơn vận động viên " + vdv2.getHoten());
        } else if (vdv2.lonHon(vdv1)) {
            System.out.println("Vận động viên " + vdv2.getHoten() + " lớn hơn vận động viên " + vdv1.getHoten());
        } else {
            System.out.println("Hai vận động viên bằng nhau");
        }
    }
    
    public int getSize() {
        return danhSachVDV.size();
    }
}
