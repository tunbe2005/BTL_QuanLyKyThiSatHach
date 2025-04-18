package com.QLKT.quanlykithisathach.entity;

public class GiamThi {
    private String maGiamThi;
    private String tenGiamThi;

    public GiamThi() {
        // Constructor mặc định cần thiết nếu dùng JAXB để ghi/đọc XML
    }

    public GiamThi(String maGiamThi, String tenGiamThi) {
        this.maGiamThi = maGiamThi;
        this.tenGiamThi = tenGiamThi;
    }

    public String getMaGiamThi() {
        return maGiamThi;
    }

    public void setMaGiamThi(String maGiamThi) {
        this.maGiamThi = maGiamThi;
    }

    public String getTenGiamThi() {
        return tenGiamThi;
    }

    public void setTenGiamThi(String tenGiamThi) {
        this.tenGiamThi = tenGiamThi;
    }

    @Override
    public String toString() {
        return tenGiamThi + " (Mã: " + maGiamThi + ")";
    }
}
