package com.mycompany.post_test_2.view;

/**
 * Interface untuk Menu View
 * Menerapkan konsep Abstraction
 * @author IRVAN
 */
public interface IMenuView {
    void tampilkanMenuUtama();
    
    void tampilkanMenuLogin();
    
    void prosesLogin();
    
    void tampilkanMenuSistem();
    
    void prosesMenuSistem(int pilihan);
    
    int validasiInputInteger(int min, int max);
    
    default void tampilkanHeader() {
        System.out.println("\n======================================");
        System.out.println("|  SISTEM MANAJEMEN TANAMAN HIDROPONIK |");
        System.out.println("========================================");
    }
    
    default void tampilkanFooter() {
        System.out.println("─────────────────────────────────────────");
    }
    
    default boolean konfirmasiAksi(String pesan) {
        System.out.print(pesan + " (y/n): ");
        return true;
    }
}