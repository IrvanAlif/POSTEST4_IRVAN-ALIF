package com.mycompany.post_test_2.service;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Abstract class sebagai base untuk semua Service
 * Menerapkan konsep Abstraction
 * @author IRVAN
 * @param <T>
 */
public abstract class BaseService<T> {
    protected ArrayList<T> dataList;
    protected Scanner input;
    
    public BaseService() {
        this.dataList = new ArrayList<>();
        this.input = new Scanner(System.in);
    }
    
    public abstract void tambahData();
    public abstract void lihatData();
    public abstract void updateData();
    public abstract void hapusData();
    
    public boolean isDataEmpty() {
        return dataList.isEmpty();
    }
    
    public int getDataSize() {
        return dataList.size();
    }
    
    protected int validasiInputInteger(int min, int max) {
        int nilai;
        while(true) {
            try {
                nilai = input.nextInt();
                input.nextLine();
                if(nilai >= min && nilai <= max) {
                    break;
                } else {
                    System.out.print("Input harus antara " + min + " dan " + max + ". Coba lagi: ");
                }
            } catch(Exception e) {
                System.out.print("Input harus berupa angka. Coba lagi: ");
                input.nextLine();
            }
        }
        return nilai;
    }
    
    protected int validasiInputInteger(int max) {
        return validasiInputInteger(1, max);
    }
    
    protected int validasiInputInteger() {
        return validasiInputInteger(1, 10);
    }
    
    public final void prosesData(String operasi) {
        System.out.println("=== Memproses " + operasi + " ===");
        switch(operasi.toLowerCase()) {
            case "tambah":
                tambahData();
                break;
            case "lihat":
                lihatData();
                break;
            case "update":
                updateData();
                break;
            case "hapus":
                hapusData();
                break;
            default:
                System.out.println("Operasi tidak dikenal.");
        }
    }
    
    protected void displayInfo(String message) {
        System.out.println("[INFO] " + message);
    }
    
    protected void displayError(String message) {
        System.out.println("[ERROR] " + message);
    }
}