/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pertemuan4.pertemuan4;

/**
 *
 * @author USER
 */
public class Barang {
    String kode_barang;
    String nama_barang;
    private int stok;
    
    public void setStok(int stok) {
        this.stok = stok;
    }
    
    public int getStok() {
        return this.stok;
    }
    
    public void tambahStok(int jumlah) {
        if (jumlah > 0) {
            stok += jumlah;
        } else {
            System.out.println("Jumlah penambahan stok harus lebih dari 0.");
        }
    }
    
    public Barang(String kode, String nama) { 
        kode_barang = kode;
        nama_barang = nama; 
//        stok = stk;
    }
}
