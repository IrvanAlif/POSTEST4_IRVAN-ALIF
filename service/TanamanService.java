package com.mycompany.post_test_2.service;

import com.mycompany.post_test_2.model.Tanaman;
import com.mycompany.post_test_2.model.TanamanCepat;
import com.mycompany.post_test_2.model.TanamanLambat;

/**
 * Service class untuk mengelola operasi CRUD Tanaman Hidroponik
 * Extends dari BaseService (Abstract Class)
 * Menerapkan Polymorphism (Overriding)
 * @author IRVAN
 */
public class TanamanService extends BaseService<Tanaman> {
    
    // Constructor
    public TanamanService() {
        super();
    }
    
    @Override
    public void tambahData() {
        tambahTanaman();
    }
    
    @Override
    public void lihatData() {
        lihatTanaman();
    }
    
    @Override
    public void updateData() {
        updateTanaman();
    }
    
    @Override
    public void hapusData() {
        hapusTanaman();
    }
    

    public void tambahTanaman() {
        System.out.print("Nama Tanaman: ");
        String nama = input.nextLine();
        
        System.out.println("Jenis Tanaman: 1.Sayuran 2.Buah 3.Herbal 4.Tanaman Hias");
        System.out.print("Pilih jenis (1-4): ");
        int j = validasiInputInteger(1, 4);
        String jenis = (j==1)?"Sayuran":(j==2)?"Buah":(j==3)?"Herbal":(j==4)?"Tanaman Hias":"Belum ditentukan";
        
        System.out.println("Sistem Hidroponik: 1.NFT 2.DWC 3.Wick 4.Drip 5.Ebb&Flow 6.Aeroponik");
        System.out.print("Pilih sistem (1-6): ");
        int s = validasiInputInteger(1, 6);
        String sistem = (s==1)?"NFT":(s==2)?"DWC":(s==3)?"Wick":(s==4)?"Drip":(s==5)?"Ebb&Flow":(s==6)?"Aeroponik":"Belum ditentukan";
        
        System.out.print("Tanggal Tanam (dd/mm/yyyy): ");
        String tanggal = input.nextLine();
        
        System.out.println("Status Tanaman: 1.Bibit 2.Tumbuh 3.Berbunga 4.Berbuah 5.Panen 6.Mati");
        System.out.print("Pilih status (1-6): ");
        int st = validasiInputInteger(1, 6);
        String status = (st==1)?"Bibit":(st==2)?"Tumbuh":(st==3)?"Berbunga":(st==4)?"Berbuah":(st==5)?"Panen":(st==6)?"Mati":"Belum ditentukan";
        
        System.out.print("pH Air: ");
        String ph = input.nextLine();
        System.out.print("Catatan: ");
        String ctn = input.nextLine();
        
        if (jenis.equals("Sayuran") && (sistem.equals("NFT") || sistem.equals("DWC"))) {
            TanamanCepat tanaman = new TanamanCepat(nama, jenis, sistem, tanggal, status, ph, ctn);
            dataList.add(tanaman);
        } else if (jenis.equals("Tanaman Hias") && (sistem.equals("Wick") || sistem.equals("Drip"))) {
            TanamanLambat tanaman = new TanamanLambat(nama, jenis, sistem, tanggal, status, ph, ctn);
            dataList.add(tanaman);
        } else {
            Tanaman tanaman = new Tanaman(nama, jenis, sistem, tanggal, status, ph, ctn);
            dataList.add(tanaman);
        }
        displayInfo("Tanaman berhasil ditambahkan!");
    }
    
    // Method untuk melihat semua tanaman (Read)
    public void lihatTanaman() {
        System.out.println("=== Daftar Tanaman ===");
        if(dataList.isEmpty()) {
            displayError("Belum ada tanaman.");
        } else {
            for(int i = 0; i < dataList.size(); i++){
                System.out.println((i+1) + ". " + dataList.get(i).toString());
            }
        }
    }
    
    // Method Overloading - lihat tanaman dengan filter
    public void lihatTanaman(String filter) {
        System.out.println("=== Daftar Tanaman (Filter: " + filter + ") ===");
        if(dataList.isEmpty()) {
            displayError("Belum ada tanaman.");
        } else {
            int count = 0;
            for(int i = 0; i < dataList.size(); i++){
                Tanaman t = dataList.get(i);
                if(t.getJenis().equalsIgnoreCase(filter) || 
                   t.getStatus().equalsIgnoreCase(filter) ||
                   t.getSistemHidroponik().equalsIgnoreCase(filter)) {
                    System.out.println((i+1) + ". " + t.toString());
                    count++;
                }
            }
            if(count == 0) {
                displayInfo("Tidak ada tanaman dengan filter: " + filter);
            }
        }
    }
    
    // Method Overloading - lihat tanaman dengan range index
    public void lihatTanaman(int start, int end) {
        System.out.println("=== Daftar Tanaman (Index " + start + "-" + end + ") ===");
        if(dataList.isEmpty()) {
            displayError("Belum ada tanaman.");
        } else {
            for(int i = start-1; i < end && i < dataList.size(); i++){
                System.out.println((i+1) + ". " + dataList.get(i).toString());
            }
        }
    }
    
    // Method untuk update tanaman (Update)
    public void updateTanaman() {
        if(dataList.isEmpty()) {
            displayError("Belum ada tanaman.");
            return;
        }
        
        System.out.print("Nomor tanaman yang ingin diupdate: ");
        int u = validasiInputInteger(dataList.size());
        
        if(u > 0 && u <= dataList.size()){
            int idx = u - 1;
            Tanaman tanaman = dataList.get(idx);
            
            System.out.print("Nama baru: ");
            tanaman.setNama(input.nextLine());
            System.out.print("Jenis baru: ");
            tanaman.setJenis(input.nextLine());
            System.out.print("Sistem baru: ");
            tanaman.setSistemHidroponik(input.nextLine());
            System.out.print("Tanggal baru: ");
            tanaman.setTanggalTanam(input.nextLine());
            System.out.print("Status baru: ");
            tanaman.setStatus(input.nextLine());
            System.out.print("pH baru: ");
            tanaman.setPhAir(input.nextLine());
            System.out.print("Catatan baru: ");
            tanaman.setCatatan(input.nextLine());
            
            displayInfo("Tanaman berhasil diupdate!");
        } else {
            displayError("Nomor tidak valid.");
        }
    }
    
    // Method untuk menghapus tanaman (Delete)
    public void hapusTanaman() {
        if(dataList.isEmpty()) {
            displayError("Belum ada tanaman.");
            return;
        }
        
        System.out.print("Nomor tanaman yang ingin dihapus: ");
        int h = validasiInputInteger(dataList.size());
        
        if(h > 0 && h <= dataList.size()){
            dataList.remove(h - 1);
            displayInfo("Tanaman berhasil dihapus!");
        } else {
            displayError("Nomor tidak valid.");
        }
    }
    
    // Method untuk mencari tanaman
    public void cariTanaman() {
        if(dataList.isEmpty()) {
            displayError("Belum ada tanaman.");
            return;
        }
        
        System.out.println("=== PENCARIAN TANAMAN ===");
        System.out.println("1. Cari berdasarkan nama");
        System.out.println("2. Cari berdasarkan jenis");
        System.out.println("3. Cari berdasarkan status");
        System.out.print("Pilih jenis pencarian: ");
        
        int jenis = validasiInputInteger(1, 3);
        System.out.print("Masukkan keyword: ");
        String keyword = input.nextLine().toLowerCase();
        
        System.out.println("=== Hasil Pencarian ===");
        boolean found = false;
        
        for(int i = 0; i < dataList.size(); i++){
            Tanaman t = dataList.get(i);
            boolean match = false;
            
            switch(jenis) {
                case 1:
                    match = t.getNama().toLowerCase().contains(keyword);
                    break;
                case 2:
                    match = t.getJenis().toLowerCase().contains(keyword);
                    break;
                case 3:
                    match = t.getStatus().toLowerCase().contains(keyword);
                    break;
            }
            
            if(match) {
                System.out.println((i+1) + ". " + t.toString());
                found = true;
            }
        }
        
        if(!found) {
            displayInfo("Data tidak ditemukan untuk keyword: " + keyword);
        }
    }
    
    // Method untuk menampilkan statistik
    public void tampilkanStatistik() {
        if(dataList.isEmpty()) {
            displayError("Belum ada tanaman.");
            return;
        }
        
        System.out.println("\n=== STATISTIK TANAMAN ===");
        System.out.println("Total Tanaman: " + dataList.size());
        
        int sayuran = 0, buah = 0, herbal = 0, hias = 0;
        for(Tanaman t : dataList) {
            switch(t.getJenis().toLowerCase()) {
                case "sayuran": sayuran++; break;
                case "buah": buah++; break;
                case "herbal": herbal++; break;
                case "tanaman hias": hias++; break;
            }
        }
        
        System.out.println("\nBerdasarkan Jenis:");
        System.out.println("- Sayuran: " + sayuran);
        System.out.println("- Buah: " + buah);
        System.out.println("- Herbal: " + herbal);
        System.out.println("- Tanaman Hias: " + hias);
        
        int bibit = 0, tumbuh = 0, berbunga = 0, berbuah = 0, panen = 0, mati = 0;
        for(Tanaman t : dataList) {
            switch(t.getStatus().toLowerCase()) {
                case "bibit": bibit++; break;
                case "tumbuh": tumbuh++; break;
                case "berbunga": berbunga++; break;
                case "berbuah": berbuah++; break;
                case "panen": panen++; break;
                case "mati": mati++; break;
            }
        }
        
        System.out.println("\nBerdasarkan Status:");
        System.out.println("- Bibit: " + bibit);
        System.out.println("- Tumbuh: " + tumbuh);
        System.out.println("- Berbunga: " + berbunga);
        System.out.println("- Berbuah: " + berbuah);
        System.out.println("- Panen: " + panen);
        System.out.println("- Mati: " + mati);
    }
    
    // Method validasi pH
    private boolean validasiPH(String ph) {
        try {
            double nilai = Double.parseDouble(ph);
            return nilai >= 0 && nilai <= 14;
        } catch(NumberFormatException e) {
            return false;
        }
    }
    
    // Method validasi tanggal
    private boolean validasiTanggal(String tanggal) {
        if(!tanggal.matches("\\d{2}/\\d{2}/\\d{4}")) {
            return false;
        }
        
        String[] parts = tanggal.split("/");
        try {
            int hari = Integer.parseInt(parts[0]);
            int bulan = Integer.parseInt(parts[1]);
            int tahun = Integer.parseInt(parts[2]);
            
            return hari >= 1 && hari <= 31 && 
                   bulan >= 1 && bulan <= 12 && 
                   tahun >= 1900 && tahun <= 2100;
        } catch(NumberFormatException e) {
            return false;
        }
    }
}