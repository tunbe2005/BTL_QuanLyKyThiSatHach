package com.QLKT.quanlykithisathach.entity;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "GiamThi")
@XmlAccessorType(XmlAccessType.FIELD)
public class GiamThiXML {
    
    private List<GiamThi> giamthi;

    public GiamThiXML() {
    }

    public List<GiamThi> getGiamThi() {
        return giamthi;
    }

    public void setGiamThi(List<GiamThi> giamthi) {
        this.giamthi = giamthi;
    }
}
