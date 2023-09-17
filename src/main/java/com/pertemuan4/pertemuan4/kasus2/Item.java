/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pertemuan4.pertemuan4.kasus2;

/**
 *
 * @author USER
 */
public class Item {
    private String name;
    
    private Item() {
        name = "Ipin";
    }

    public Item(String name) {
        this();
        System.out.println(this.name);
    }
}
