/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rosinante.tugasdaripakfaqih;

import com.google.firebase.database.IgnoreExtraProperties;

/**
 *
 * @author KOCHOR
 */
@IgnoreExtraProperties
public class TabelModel {

    private String data_pengeluaran;
    private String kategori;
    private String pengeluaran_date;
    private String uid;

    public TabelModel() {
    }

    public String getData_pengeluaran() {
        return data_pengeluaran;
    }

    public void setData_pengeluaran(String data_pengeluaran) {
        this.data_pengeluaran = data_pengeluaran;
    }

    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    public String getPengeluaran_date() {
        return pengeluaran_date;
    }

    public void setPengeluaran_date(String pengeluaran_date) {
        this.pengeluaran_date = pengeluaran_date;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public TabelModel(String data_pengeluaran, String kategori, String pengeluaran_date, String uid) {
        this.data_pengeluaran = data_pengeluaran;
        this.kategori = kategori;
        this.pengeluaran_date = pengeluaran_date;
        this.uid = uid;
    }

}
