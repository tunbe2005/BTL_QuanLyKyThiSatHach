/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.QLKT.quanlykithisathach.entity;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author PC
 */
@XmlRootElement(name = "ThiSinh")
@XmlAccessorType(XmlAccessType.FIELD)
public class ThiSinhXML {
    private List<ThiSinh> thisinh;

    public List<ThiSinh> getResidents() {
        return thisinh;
    }

    public void setResidents(List<Thisinh> thisinh) {
        this.thisinh = thisinh;
    } 

    public List<ThiSinh> getThiSinh() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void setThiSinh(List<ThiSinh> danhSach) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
