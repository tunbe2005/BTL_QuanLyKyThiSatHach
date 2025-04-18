package com.QLKT.quanlykithisathach.entity;

public enum TinhTrangKyThi {
    CHUA_TO_CHUC,
    DANG_TO_CHUC,
    DA_HOAN_THANH;

    public static TinhTrangKyThi getDA_HOAN_THANH() {
        return DA_HOAN_THANH;
    }

    public static TinhTrangKyThi getDANG_TO_CHUC() {
        return DANG_TO_CHUC;
    }

    public static TinhTrangKyThi getCHUA_TO_CHUC() {
        return CHUA_TO_CHUC;
    }
}
