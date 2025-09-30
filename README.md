## Irvan Alif
## 2409116071
## kelas B


---

Project ini bertema aplikasi manajemen data tanaman dan user sederhana berbasis console di Java. Program ini dibuat untuk latihan konsep OOP, di mana ada class untuk merepresentasikan tanaman dan user, lalu ada service untuk mengelola datanya. Semua fitur dijalankan lewat menu interaktif di console, seperti menambah, melihat, atau menghapus data. Aplikasi ini bisa jadi contoh dasar sistem manajemen data sederhana yang nantinya bisa dikembangkan lebih lanjut.

---

<img width="442" height="386" alt="image" src="https://github.com/user-attachments/assets/775313f3-1c93-4013-bbbb-6d66261025a8" />


1. com.mycompany.post_test_2.main

    Tugas: Menjadi entry point aplikasi.
    
    Isi:
  
    - Post_test_2.java – kelas utama yang memuat MenuView dan menampilkan menu utama.

2. com.mycompany.post_test_2.model
  
    Tugas: Menyimpan struktur data (Plain Old Java Object / POJO).
  
    Isi:
  
    - Tanaman.java – merepresentasikan satu tanaman hidroponik (nama, jenis, sistem, tanggal, status, pH, catatan).
    - User.java – merepresentasikan satu pengguna (username, password, role, nama lengkap).
    - TanamanCepat.java – subclass dari Tanaman, tetapi hanya berlaku jika jenisnya sayuran dan sistem hidroponiknya NFT atau DWC.
    - TanamanLambat.java – subclass dari Tanaman, tetapi hanya berlaku jika jenisnya hias dan sistem hidroponiknya Wick & Drip.

3. com.mycompany.post_test_2.service

    Tugas: Business logic / Controller.
  
    Semua proses CRUD, validasi, login, logout, statistik, dan pencarian berada di sini.
  
    Isi:
  
    - TanamanService.java – mengelola ArrayList tanaman: tambah, lihat, update, hapus, cari, statistik, validasi input.
    - UserService.java – mengelola ArrayList user: login, logout, cek role, current user.

4. com.mycompany.post_test_2.view

    Tugas: Presentation layer – interaksi konsol dengan pengguna.
  
    Isi:
  
    - MenuView.java – menampilkan menu login & utama, membaca input keyboard, lalu memanggil service yang sesuai.

---

# *OUTPUT*

---
1. Login sebagai admin

<img width="787" height="228" alt="image" src="https://github.com/user-attachments/assets/ff812087-6b04-4d60-a4c8-122dbeca322f" />

Program Sistem Manajemen Tanaman Hidroponik ini awalnya menunjukkan dua pilihan, login atau keluar. Kalau pilih login, kita diminta memasukan username sama password. Di contoh ini dipakai username admin dan password admin123. Karena bener, sistem langsung menginfokan kalau login berhasil dan menyambut kita sebagai Administrator.

---
2.Login sebagai user

<img width="601" height="204" alt="image" src="https://github.com/user-attachments/assets/4536de61-ed60-458e-96be-2835a260c408" />

Di tampilan ini, program juga menunjukkan menu awal dengan pilihan login atau keluar. Waktu memilih login, pengguna memasukkan username user sama password user123. Karena data cocok, sistem langsung menerima login dan menyapa kita sebagai Regular User.

---

### Menu utama

---
3.Tambah tanaman

<img width="908" height="726" alt="image" src="https://github.com/user-attachments/assets/7a59d47b-f7b8-4d60-af25-1d3139754995" />


Di bagian ini, pengguna berhasil login sebagai Regular User dan memilih menu Tambah Tanaman. Pengguna kemudian mengisi data tanaman baru mulai dari nama tanaman (bayam), jenis tanaman (sayuran), sistem hidroponik yang dipakai (NFT), tanggal tanam, status tanaman (bibit), pH air, sampai catatan tambahan. Karena tanaman ini termasuk kategori tanaman cepat (jenis sayuran dengan sistem hidroponik NFT), maka sistem otomatis menambahkan informasi tambahan di bagian catatan dengan format: "(Sayuran sistem NFT – cepat tumbuh)". Setelah semua data dimasukkan, sistem memberikan konfirmasi bahwa tanaman berhasil ditambahkan ke database. Contoh lain, saat pengguna menambahkan tanaman kangkung dengan sistem hidroponik Wick, data tetap berhasil disimpan, tetapi karena tidak memenuhi kriteria tanaman cepat, catatan hanya menampilkan isi yang dimasukkan pengguna tanpa tambahan otomatis.

---
4. Melihat semua tanaman dalam tabel
   
<img width="1328" height="103" alt="image" src="https://github.com/user-attachments/assets/28861ac0-ad17-4d04-9752-a179f9ced136" />


Tampilan ini menunjukkan saat pengguna memilih menu Lihat Semua Tanaman. Sistem langsung menampilkan daftar tanaman yang sudah ditambah sebelumnya, lengkap dengan detailnya. Contohnya ada tanaman bayam dengan jenis sayuran, sistem hidroponik NFT, tanggal tanam 12/2/2025, status Bibit, pH air 12, dan catatan efgggdgd. Karena tanaman ini termasuk kategori tanaman cepat (sayuran dengan sistem NFT atau DWC), maka sistem otomatis menambahkan keterangan tambahan pada catatan: "(Sayuran sistem NFT – cepat tumbuh)". Sedangkan tanaman kangkung dengan sistem hidroponik Wick tidak termasuk kategori cepat, sehingga catatannya hanya menampilkan isi yang dimasukkan pengguna, yaitu oke.

---
5. update tanaman

<img width="587" height="520" alt="image" src="https://github.com/user-attachments/assets/1dd9ef7b-9790-4e0c-b803-d6a647fabe0a" />

Tampilan ini menunjukkan saat pengguna milih menu **Update Tanaman**. Sistem minta nomor tanaman yang mau diubah, lalu pengguna memasukkan data baru untuk memperbarui informasi. Contohnya, tanaman dengan nomor 1 diupdate jadi nama **baymmmmm** dengan jenis **sayur**, sistem hidroponik **NFT**, tanggal tanam **11/9/2024**, status **tumbuh**, pH air **15**, dan catatan **okeeee**. Setelah semua data baru dimasukin, sistem menampilkan konfirmasi kalau tanaman berhasil diupdate.


---
6. Mencari tanaman

<img width="513" height="556" alt="image" src="https://github.com/user-attachments/assets/82b9f1de-56f7-4a9e-99da-b66cf12965b0" />

Tampilan ini menunjukkan saat pengguna milih menu Cari Tanaman. Sistem memberi pilihan pencarian berdasarkan nama, jenis, atau status. Pada percobaan pertama, pengguna pilih pencarian berdasarkan nama dan masukin keyword bayammm, tapi hasilnya kosong karena data dengan keyword itu nggak ditemukan. Setelah kembali ke menu utama, pengguna coba lagi cari tanaman dengan cara yang sama, kali ini keyword yang dimasukin baymmmmm. Proses ini memperlihatkan kalau sistem hanya bakal menampilkan data kalau keyword yang dimasukin sesuai persis dengan data yang tersimpan.

---
7. Statistik tanaman

<img width="533" height="590" alt="image" src="https://github.com/user-attachments/assets/6ffea3ff-d702-4e49-9fd6-746f90e5c814" />

Tampilan ini menunjukkan saat pengguna memilih menu Statistik Tanaman. Sistem langsung menampilkan jumlah total tanaman yang tercatat, yaitu 2 tanaman.

Selain total, sistem juga menyajikan rincian statistik berdasarkan:

- Jenis tanaman, yang menunjukkan ada 2 tanaman sayuran, sedangkan kategori buah, herbal, dan tanaman hias masih bernilai 0.

- Status tanaman, dengan rincian 1 tanaman berstatus Bibit dan 1 tanaman berstatus Tumbuh, sementara kategori Berbunga, Berbuah, Panen, dan Mati masih kosong (0).

Dari tampilan ini bisa disimpulkan kalau data tanaman sudah tercatat dan terklasifikasi dengan benar ke dalam jenis dan status masing-masing, sehingga pengguna bisa langsung tahu sebaran tanaman yang ada di sistem.

---
8. Menghapus tanaman di menu user

<img width="960" height="430" alt="image" src="https://github.com/user-attachments/assets/3fc83b53-b674-44ef-817c-a74f644c9072" />

Tampilan ini menunjukkan saat pengguna dengan role Regular User coba pilih menu Hapus Tanaman. Begitu opsi nomor 4 dipilih, sistem langsung menampilkan pesan Akses ditolak! Hanya admin yang dapat menghapus data. Artinya, fitur hapus tanaman dibatasi khusus untuk admin saja, sedangkan user biasa nggak punya izin untuk melakukan penghapusan data.

---
9. Keluar

<img width="798" height="417" alt="image" src="https://github.com/user-attachments/assets/42a6f845-5260-4f35-b04e-6a97e3668561" />

Tampilan ini menunjukkan saat pengguna dengan role Regular User milih menu Logout. Setelah memilih opsi nomor 8, sistem langsung menampilkan pesan Logout berhasil!, yang berarti sesi pengguna sudah diakhiri dan akses ke dalam sistem ditutup(tampilan ini juga sama dengan admin).

---
10. Menghapus tanaman di menu admin

<img width="843" height="456" alt="image" src="https://github.com/user-attachments/assets/64d22d49-3f76-47c2-82e3-7d3811b0d1f5" />


Tampilan ini menunjukkan saat pengguna dengan role Administrator (admin) memilih menu Hapus Tanaman. Setelah memilih opsi nomor 4, sistem minta nomor tanaman yang mau dihapus, lalu admin memasukkan angka 1. Sistem kemudian menampilkan pesan Tanaman berhasil dihapus!, yang berarti data tanaman dengan nomor tersebut sudah berhasil dihapus dari sistem. Berbeda dengan user biasa, admin punya akses penuh untuk melakukan penghapusan data.

---

1. Tanaman.java (Superclass)

Class ini adalah model dasar (superclass) untuk menyimpan data tanaman hidroponik. Menggunakan prinsip Encapsulation dengan properties private.

Properties (Attributes)

    private String nama;             
    private String jenis;             
    private String sistemHidroponik;  
    private String tanggalTanam;      
    private String status;            
    private String phAir;             
    private String catatan;    

Penjelasan Access Modifier:

- private: Properties tidak bisa diakses langsung dari luar class
- Akses hanya melalui getter (read) dan setter (write)
- Ini adalah implementasi Encapsulation untuk melindungi data

---

Constructor

    public Tanaman(String nama, String jenis, String sistemHidroponik, 
                   String tanggalTanam, String status, String phAir, String catatan) {
        this.nama = nama;
        this.jenis = jenis;
        this.sistemHidroponik = sistemHidroponik;
        this.tanggalTanam = tanggalTanam;
        this.status = status;
        this.phAir = phAir;
        this.catatan = catatan;
    }

Penjelasan:

- Constructor dipanggil saat membuat object baru: new Tanaman(...)
- Parameter constructor digunakan untuk inisialisasi properties
- this.nama = property class, nama = parameter constructor
- Constructor ini memastikan setiap object Tanaman memiliki semua data yang dibutuhkan

---

Getter Methods

    public String getNama() { 
        return nama; 
    }
    
    public String getJenis() { 
        return jenis; 
    }
    
    public String getSistemHidroponik() { 
        return sistemHidroponik; 
    }
    
    // ... getter lainnya untuk semua properties

    Penjelasan:

- Getter digunakan untuk membaca nilai property
- Return type sesuai dengan tipe data property
- Naming convention: get + NamaProperty (camelCase)
- Contoh penggunaan: String nama = tanaman.getNama();

---

Setter Methods

    public void setNama(String nama) { 
        this.nama = nama; 
    }
    
    public void setJenis(String jenis) { 
        this.jenis = jenis; 
    }
    
    public void setSistemHidroponik(String sistemHidroponik) { 
        this.sistemHidroponik = sistemHidroponik; 
    }
    
    // ... setter lainnya untuk semua properties

Penjelasan:

- Setter digunakan untuk mengubah nilai property
- Return type void karena tidak mengembalikan nilai
- Parameter adalah nilai baru yang akan di-set
- Naming convention: set + NamaProperty (camelCase)
- Contoh penggunaan: tanaman.setNama("Kangkung");

---

toString() Method

    @Override
    public String toString() {
        return nama + " | " + jenis + " | " + sistemHidroponik + " | " + 
               tanggalTanam + " | " + status + " | pH:" + phAir + " | " + catatan;
    }

Penjelasan:

- @Override: Annotation yang menunjukkan method ini meng-override method dari class Object
- toString(): Method bawaan Java untuk mengkonversi object ke String
- Digunakan saat: System.out.println(tanaman) atau tanaman.toString()
- Format output: "Selada | Sayuran | NFT | 01/01/2025 | Tumbuh | pH:6.5 | Baik"

---

2. TanamanCepat.java (Subclass)

Class ini adalah subclass dari Tanaman untuk merepresentasikan tanaman yang cepat tumbuh. Menggunakan prinsip Inheritance.
Relationship

    public class TanamanCepat extends Tanaman {
        // Mewarisi semua properties dan methods dari Tanaman
    }

Penjelasan extends:

- TanamanCepat adalah child class / subclass
- Tanaman adalah parent class / superclass
- TanamanCepat mewarisi semua properties (nama, jenis, dll) dan methods (getter/setter) dari Tanaman
- TanamanCepat dapat menambahkan properties/methods baru

---

Additional Property

    private boolean cepatTumbuh;  // true jika memenuhi kondisi cepat tumbuh

Penjelasan:

- Property tambahan yang tidak ada di superclass
- Tipe boolean: hanya bisa true atau false
- Digunakan untuk menandai apakah tanaman ini termasuk kategori cepat tumbuh

---

Constructor dengan Super

    public TanamanCepat(String nama, String jenis, String sistemHidroponik, 
                       String tanggalTanam, String status, String phAir, String catatan) {
        // 1. Panggil constructor parent class
        super(nama, jenis, sistemHidroponik, tanggalTanam, status, phAir, catatan);
        
        // 2. Inisialisasi property tambahan
        this.cepatTumbuh = cekApakahCepatTumbuh(jenis, sistemHidroponik);
        
        // 3. Modifikasi catatan jika cepat tumbuh
        if (cepatTumbuh) {
            String catatanBaru = catatan + " (Sayuran sistem " + 
                                 sistemHidroponik + " - cepat tumbuh)";
            setCatatan(catatanBaru);  // Gunakan setter dari parent class
        }
    }

Penjelasan Detail:
- Baris 1: super(...)

    super() memanggil constructor dari parent class (Tanaman)
    Harus dipanggil pertama kali di constructor subclass
    Menginisialisasi semua properties yang diwarisi dari parent
    Tanpa super(), properties dari parent tidak akan terinisialisasi

- Baris 2: this.cepatTumbuh = ...

    Inisialisasi property tambahan yang khusus untuk TanamanCepat
    Memanggil method cekApakahCepatTumbuh() untuk menentukan nilai

- Baris 3-6: Conditional Logic

    if (cepatTumbuh): Cek apakah tanaman termasuk cepat tumbuh
    Jika true, tambahkan informasi ke catatan
    setCatatan(): Menggunakan setter dari parent class (inheritance)

---

Method cekApakahCepatTumbuh()

    private boolean cekApakahCepatTumbuh(String jenis, String sistemHidroponik) {
        // Kondisi: Sayuran + (NFT atau DWC) = cepat tumbuh
        if (jenis.equals("Sayuran") && 
            (sistemHidroponik.equals("NFT") || sistemHidroponik.equals("DWC"))) {
            return true;
        }
        
        // Kondisi lain = tidak cepat tumbuh
        return false;
    }

Penjelasan Logika:
- Operator && (AND):

    Kedua kondisi harus TRUE agar hasil TRUE
    jenis.equals("Sayuran") AND (NFT atau DWC)

- Operator || (OR):

    Salah satu kondisi TRUE, hasil TRUE
    sistemHidroponik.equals("NFT") OR sistemHidroponik.equals("DWC")

  ---

Kombinasi:

    Sayuran + NFT  → TRUE  (Cepat tumbuh)
    Sayuran + DWC  → TRUE  (Cepat tumbuh)
    Sayuran + Wick → FALSE (Tidak cepat tumbuh)
    Buah + NFT     → FALSE (Tidak cepat tumbuh)

- Method .equals():

    Digunakan untuk membandingkan String di Java
    Jangan gunakan == untuk String (membandingkan referensi, bukan value)
  
---

Getter & Setter

    public boolean isCepatTumbuh() {
        return cepatTumbuh;
    }
    
    public void setCepatTumbuh(boolean cepatTumbuh) {
        this.cepatTumbuh = cepatTumbuh;
    }

Penjelasan:

- Getter untuk boolean menggunakan prefix is bukan get
- Naming: isCepatTumbuh() lebih natural dalam bahasa
- Contoh: if (tanaman.isCepatTumbuh()) { ... }

---

3. TanamanLambat.java (Subclass)

Class ini adalah subclass dari Tanaman untuk tanaman yang lambat tumbuh.

Structure

    public class TanamanLambat extends Tanaman {
        private boolean lambatTumbuh;
        
        // Constructor dengan super()
        // Method cekApakahLambatTumbuh()
        // Getter & Setter
        // Override toString()
    }

Constructor

