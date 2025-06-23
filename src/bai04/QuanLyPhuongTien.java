package bai04;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class QuanLyPhuongTien {
    private List<PhuongTienGiaoThong> danhSachPhuongTien;
    private Scanner scanner;
    
    public QuanLyPhuongTien() {
        danhSachPhuongTien = new ArrayList<>();
        scanner = new Scanner(System.in);
    }
    
    public void tạoDuLieuGia() {
        PhuongTienGiaoThong pt1 = new PhuongTienGiaoThong("Yamaha", "Xe máy", 2020, 120);
        danhSachPhuongTien.add(pt1);
        
        Oto oto1 = new Oto("Toyota", "Vios", 2021, 180, 5, "Xăng");
        Oto oto2 = new Oto("Honda", "Civic", 2022, 200, 5, "Xăng");
        Oto oto3 = new Oto("Ford", "Ranger", 2021, 180, 5, "Dầu");
        Oto oto4 = new Oto("Mazda", "CX-5", 2023, 200, 7, "Xăng");
        Oto oto5 = new Oto("Kia", "Cerato", 2022, 190, 5, "Xăng");
        
        danhSachPhuongTien.add(oto1);
        danhSachPhuongTien.add(oto2);
        danhSachPhuongTien.add(oto3);
        danhSachPhuongTien.add(oto4);
        danhSachPhuongTien.add(oto5);
        
        System.out.println("Đã tạo 1 phương tiện thông thường và 5 ô tô với dữ liệu giả!");
    }
    
    public void nhapPhuongTienThuong() {
        PhuongTienGiaoThong phuongTien = new PhuongTienGiaoThong();
        phuongTien.nhap();
        danhSachPhuongTien.add(phuongTien);
        System.out.println("Đã thêm phương tiện thành công!");
    }
    
    public void nhapDanhSachOto() {
        System.out.print("Nhập số lượng ô tô: ");
        int n = Integer.parseInt(scanner.nextLine());
        
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập thông tin ô tô thứ " + (i + 1) + ":");
            Oto oto = new Oto();
            oto.nhap();
            danhSachPhuongTien.add(oto);
        }
        System.out.println("Đã thêm " + n + " ô tô vào danh sách!");
    }
    
    public void xuatDanhSach() {
        if (danhSachPhuongTien.isEmpty()) {
            System.out.println("Danh sách phương tiện trống!");
            return;
        }
        
        System.out.println("\n=== DANH SÁCH PHƯƠNG TIỆN ===");
        int i = 1;
        for (PhuongTienGiaoThong item : danhSachPhuongTien) {
            System.out.println("\n--- Phương tiện " + i + " ---");
            if (item instanceof Oto) {
                Oto oto = (Oto) item;
                oto.xuat();
            } else if (item instanceof PhuongTienGiaoThong) {
                item.xuat();
            }
            i++;
        }
    }
    
    public void testOtoCungVanToc() {
        List<Oto> listOto = new ArrayList<>();
        for (PhuongTienGiaoThong item : danhSachPhuongTien) {
            if (item instanceof Oto) {
                listOto.add((Oto) item);
            }
        }

        if (listOto.size() < 2) {
            System.out.println("Không đủ ô tô để so sánh vận tốc!");
            return;
        }

        Set<Double> uniqueVanToc = new HashSet<>();
        Set<Double> duplicateVanToc = new HashSet<>();

        for (Oto oto : listOto) {
            double vanToc = oto.getVanTocToiDa();
            if (!uniqueVanToc.add(vanToc)) {
                duplicateVanToc.add(vanToc);
            }
        }

        if (duplicateVanToc.isEmpty()) {
            System.out.println("Không có ô tô nào có cùng vận tốc!");
        } else {
            System.out.println("Các ô tô có cùng vận tốc:");
            for (Double vanToc : duplicateVanToc) {
                System.out.println("\n--- Các ô tô có vận tốc: " + vanToc + " km/h ---");
                for (Oto oto : listOto) {
                    if (oto.getVanTocToiDa() == vanToc) {
                        oto.xuat();
                        System.out.println("---");
                    }
                }
            }
        }
    }
}
