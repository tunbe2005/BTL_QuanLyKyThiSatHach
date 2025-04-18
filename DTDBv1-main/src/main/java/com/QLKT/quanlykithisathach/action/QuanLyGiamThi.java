package com.QLKT.quanlykithisathach.action;

public class GiamThi {
    private String maGiamThi;
    private String tenGiamThi;

    public GiamThi(String maGiamThi, String tenGiamThi) {
        this.maGiamThi = maGiamThi;
        this.tenGiamThi = tenGiamThi;
    }

    @Override
    public String toString() {
        return tenGiamThi + " (Mã: " + maGiamThi + ")";
    }
}
