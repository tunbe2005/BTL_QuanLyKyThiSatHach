package com.QLKT.quanlykithisathach.entity;

public class KetQua {
    private final ThiSinh thiSinh;
    private final boolean dat; // true nếu đạt, false nếu trượt

    public KetQua(ThiSinh thiSinh, KyThi kyThi, boolean dat) {
        this.thiSinh = thiSinh;
        this.dat = dat;
    }

    @Override
    public String toString() {
        return thiSinh.getHoTen() + " - Kết quả: " + (dat ? "Đạt" : "Trượt");
    }
}
