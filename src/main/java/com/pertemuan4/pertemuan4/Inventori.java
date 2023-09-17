/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pertemuan4.pertemuan4;

/**
 *
 * @author USER
 */
public class Inventori {
    Barang[] barangs;
    
    void initBarang() {
        barangs = new Barang[2];
        barangs[0] = new Barang("001", "Baju"); 
        barangs[1] = new Barang("002", "Celana");
        barangs[0].setStok(10);
        barangs[1].setStok(20);
    }
    
    void showBarang() {
        System.out.println(barangs[0].nama_barang + "(" + barangs[0].getStok() + ")"); 
        System.out.println(barangs[1].nama_barang + "(" + barangs[1].getStok() + ")");
    }
    
    void pengadaan() {
        initBarang();
        barangs[0].tambahStok(20);
//        barangs[0].stok -= 30; //Bisa juga dikurangi dong?
//        barangs[0].stok *= 30; //dikali juga bisa dong??
        
        showBarang();
     }
        
    public static void main(String[] args) { 
        Inventori beli = new Inventori(); 
        beli.pengadaan();
    }

}