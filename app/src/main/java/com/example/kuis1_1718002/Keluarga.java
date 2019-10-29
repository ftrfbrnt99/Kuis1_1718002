package com.example.kuis1_1718002;

import android.graphics.drawable.Drawable;

class Keluarga {
    private String nama,umur,status;
    private Drawable gambar;
    public Keluarga(String nama, String umur, String status, Drawable gambar) {
        this.nama = nama;
        this.umur = umur;
        this.status = status;
        this.gambar = gambar;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getUmur() {
        return umur;
    }

    public void setUmur(String umur) {
        this.umur = umur;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Drawable getGambar() {
        return gambar;
    }

    public void setGambar(Drawable gambar) {
        this.gambar = gambar;
    }
}
