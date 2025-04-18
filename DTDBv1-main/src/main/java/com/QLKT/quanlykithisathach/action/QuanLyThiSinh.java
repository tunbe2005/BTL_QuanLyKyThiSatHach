package com.QLKT.quanlykithisathach.action;

import static java.text.Collator.getInstance;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

import com.QLKT.quanlykithisathach.entity.ThiSinh;
import com.QLKT.quanlykithisathach.entity.ThiSinhXML;
import com.QLKT.quanlykithisathach.utils.FileUtils;

public class QuanLyThiSinh {

    private static final String FILE_NAME = "thisinh.xml";
    private List<ThiSinh> danhSach;

    public QuanLyThiSinh() {
        this.danhSach = readFromFile();
        if (danhSach == null) {
            danhSach = new ArrayList<>();
        }
    }

    private List<ThiSinh> readFromFile() {
        ThiSinhXML wrapper = (ThiSinhXML) FileUtils.readXMLFile(FILE_NAME, ThiSinhXML.class);
        return (wrapper != null) ? wrapper.getThiSinh() : new ArrayList<>();
    }

    private void writeToFile() {
        ThiSinhXML wrapper = new ThiSinhXML();
        wrapper.setThiSinh(danhSach);
        FileUtils.writeXMLtoFile(FILE_NAME, wrapper);
    }

    public void themThiSinh(ThiSinh ts) {
        danhSach.add(ts);
        writeToFile();
    }

    public boolean xoaThiSinhTheoMa(String maThiSinh) {
        Iterator<ThiSinh> it = danhSach.iterator();
        while (it.hasNext()) {
            if (it.next().getMaThiSinh().equalsIgnoreCase(maThiSinh)) {
                it.remove();
                writeToFile();
                return true;
            }
        }
        return false;
    }

    public void suaThiSinh(ThiSinh tsMoi) {
        for (int i = 0; i < danhSach.size(); i++) {
            if (danhSach.get(i).getMaThiSinh().equalsIgnoreCase(tsMoi.getMaThiSinh())) {
                danhSach.set(i, tsMoi);
                break;
            }
        }
        writeToFile();
    }

    public List<ThiSinh> timKiemTheoTen(String ten) {
        List<ThiSinh> ketQua = new ArrayList<>();
        for (ThiSinh ts : danhSach) {
            if (ts.getHoTen().toLowerCase().contains(ten.toLowerCase())) {
                ketQua.add(ts);
            }
        }
        return ketQua;
    }

    public void sapXepTheoTen() {
        danhSach.sort(Comparator.comparing(ThiSinh::getHoTen, getInstance(new Locale("vi", "VN"))));
    }

    public List<ThiSinh> getDanhSach() {
        return danhSach;
    }
}
