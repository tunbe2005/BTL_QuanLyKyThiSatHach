package com.QLKT.quanlykithisathach.entity;

public class ThiSinh {
    private String maThiSinh;
    private String hoTen;
    private int tuoi;

    public ThiSinh() {
        // Constructor mặc định cần nếu dùng XML hoặc cần tạo object rỗng
    }

    public ThiSinh(String maThiSinh, String hoTen, int tuoi) {
        this.maThiSinh = maThiSinh;
        this.hoTen = hoTen;
        this.tuoi = tuoi;
    }

    public String getMaThiSinh() {
        return maThiSinh;
    }

    public void setMaThiSinh(String maThiSinh) {
        this.maThiSinh = maThiSinh;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    @Override
    public String toString() {
        return hoTen + " (Mã: " + maThiSinh + ", Tuổi: " + tuoi + ")";
    }
}
