/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.post_test_2.view;

import com.mycompany.post_test_2.service.TanamanService;
import com.mycompany.post_test_2.service.UserService;
import java.util.Scanner;

/**
 * View class untuk mengelola tampilan menu dan interaksi user
 * Implements IMenuView (Interface)
 * Menerapkan Polymorphism (Overriding dan Overloading)
 * @author IRVAN
 */
public class MenuView implements IMenuView {

    private final TanamanService tanamanService;
    private final UserService userService;
    private final Scanner input;

    public MenuView() {
        this.tanamanService = new TanamanService();
        this.userService = new UserService();
        this.input = new Scanner(System.in);
    }

    // Override method dari interface IMenuView
    @Override
    public void tampilkanMenuUtama() {
        while (true) {
            if (!userService.isLoggedIn()) {
                tampilkanMenuLogin();
            } else {
                tampilkanMenuSistem();
            }
        }
    }

    // Override method dari interface
    @Override
    public void tampilkanMenuLogin() {
        tampilkanHeader();
        System.out.println("1. Login");
        System.out.println("2. Keluar");
        tampilkanFooter();
        System.out.print("Pilih menu: ");

        int pilihan = validasiInputInteger(1, 2);

        switch (pilihan) {
            case 1:
                prosesLogin();
                break;
            case 2:
                System.out.println("Terima kasih!");
                System.exit(0);
                break;
        }
    }

    // Override method dari interface
    @Override
    public void prosesLogin() {
        System.out.print("Username: ");
        String username = input.nextLine();
        System.out.print("Password: ");
        String password = input.nextLine();

        if (userService.login(username, password)) {
            System.out.println("✓ Login berhasil! Selamat datang, "
                    + userService.getCurrentUser().getNamaLengkap());
        } else {
            System.out.println("✗ Login gagal! Username atau password salah.");
        }
    }

    // Override method dari interface
    @Override
    public void tampilkanMenuSistem() {
        tampilkanHeader();
        System.out.println("User: " + userService.getCurrentUser().getNamaLengkap()
                + " (" + userService.getCurrentUser().getRole() + ")");
        System.out.println("\n1. Tambah Tanaman");
        System.out.println("2. Lihat Semua Tanaman");
        System.out.println("3. Update Tanaman");
        System.out.println("4. Hapus Tanaman");
        System.out.println("5. Cari Tanaman");
        System.out.println("6. Statistik Tanaman");
        System.out.println("7. Logout");
        tampilkanFooter();
        System.out.print("Pilih menu: ");

        int pilihan = validasiInputInteger(1, 7);
        prosesMenuSistem(pilihan);
    }

    // Override method dari interface
    @Override
    public void prosesMenuSistem(int pilihan) {
        switch (pilihan) {
            case 1:
                tanamanService.tambahTanaman();
                break;
            case 2:
                tanamanService.lihatTanaman();
                break;
            case 3:
                tanamanService.updateTanaman();
                break;
            case 4:
                if (userService.isAdmin()) {
                    tanamanService.hapusTanaman();
                } else {
                    System.out.println("✗ Akses ditolak! Hanya admin yang dapat menghapus data.");
                }
                break;
            case 5:
                tanamanService.cariTanaman();
                break;
            case 6:
                tanamanService.tampilkanStatistik();
                break;
            case 7:
                userService.logout();
                System.out.println("✓ Logout berhasil!");
                break;
        }
    }

    // Override method dari interface
    @Override
    public int validasiInputInteger(int min, int max) {
        int nilai;
        while (true) {
            try {
                nilai = input.nextInt();
                input.nextLine();
                if (nilai >= min && nilai <= max) {
                    break;
                } else {
                    System.out.print("Input harus antara " + min + " dan " + max + ". Coba lagi: ");
                }
            } catch (Exception e) {
                System.out.print("Input harus berupa angka. Coba lagi: ");
                input.nextLine();
            }
        }
        return nilai;
    }
    
    // Method Overloading - versi dengan max saja
    public int validasiInputInteger(int max) {
        return validasiInputInteger(1, max);
    }
    
    // Method Overloading - versi tanpa parameter
    public int validasiInputInteger() {
        return validasiInputInteger(1, 10);
    }
    
    // Override method default dari interface dengan implementasi custom
    @Override
    public void tampilkanHeader() {
        System.out.println("\n========================================");
        System.out.println("|  SISTEM MANAJEMEN TANAMAN HIDROPONIK |");
        System.out.println("|         MVC Architecture v2.0        |");
        System.out.println("========================================");
    }
    
    // Override method default dari interface
    @Override
    public void tampilkanFooter() {
        System.out.println("=========================");
    }
}