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

    private String dataPengeluaran;
    private String kategori;

    public String getDataPengeluaran() {
        return dataPengeluaran;
    }

    public void setDataPengeluaran(String dataPengeluaran) {
        this.dataPengeluaran = dataPengeluaran;
    }

    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    public TabelModel(String dataPengeluaran, String kategori) {
        this.dataPengeluaran = dataPengeluaran;
        this.kategori = kategori;
    }

    public TabelModel() {
    }

}
