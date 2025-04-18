package com.QLKT.quanlykithisathach.entity;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class KyThi {
    private final String tenKyThi;
    private final LocalDate ngayToChuc;
    private TinhTrangKyThi tinhTrang;
    private final double phiDangKy;
    private final List<ThiSinh> danhSachThiSinh = new ArrayList<>();
    private final List<GiamThi> danhSachGiamThi = new ArrayList<>();

    public KyThi(String tenKyThi, LocalDate ngayToChuc, double phiDangKy) {
        this.tenKyThi = tenKyThi;
        this.ngayToChuc = ngayToChuc;
        this.phiDangKy = phiDangKy;
        this.tinhTrang = TinhTrangKyThi.CHUA_TO_CHUC;
    }

    public void themThiSinh(ThiSinh ts) {
        danhSachThiSinh.add(ts);
    }

    public void themGiamThi(GiamThi gt) {
        danhSachGiamThi.add(gt);
    }

    public void setTinhTrang(TinhTrangKyThi tinhTrang) {
        this.tinhTrang = tinhTrang;
    }

    @Override
    public String toString() {
        return "Kỳ thi: " + tenKyThi + "\nNgày tổ chức: " + ngayToChuc +
                "\nPhí đăng ký: " + phiDangKy + " VNĐ\nTình trạng: " + tinhTrang +
                "\nSố thí sinh: " + danhSachThiSinh.size() + ", Giám thị: " + danhSachGiamThi.size();
    }
}
