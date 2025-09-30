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

    public TanamanLambat(String nama, String jenis, String sistemHidroponik, 
                        String tanggalTanam, String status, String phAir, String catatan) {
        super(nama, jenis, sistemHidroponik, tanggalTanam, status, phAir, catatan);
        this.lambatTumbuh = cekApakahLambatTumbuh(jenis, sistemHidroponik);
        
        if (lambatTumbuh) {
            String catatanBaru = catatan + " (Tanaman hias sistem " + 
                                 sistemHidroponik + " - lambat tumbuh)";
            setCatatan(catatanBaru);
        }
    }

Penjelasan:

- Struktur sama dengan TanamanCepat
- Perbedaan hanya pada kondisi dan pesan yang ditambahkan

- Method cekApakahLambatTumbuh()

---

Method cekApakahLambatTumbuh()

    private boolean cekApakahLambatTumbuh(String jenis, String sistemHidroponik) {
        // Kondisi: Tanaman Hias + (Wick atau Drip) = lambat tumbuh
        if (jenis.equals("Tanaman Hias") && 
            (sistemHidroponik.equals("Wick") || sistemHidroponik.equals("Drip"))) {
            return true;
        }
        return false;
    }

Penjelasan Logika:

    Tanaman Hias + Wick → TRUE  (Lambat tumbuh)
    Tanaman Hias + Drip → TRUE  (Lambat tumbuh)
    Tanaman Hias + NFT  → FALSE (Tidak lambat tumbuh)
    Sayuran + Wick      → FALSE (Tidak lambat tumbuh)

---

Override toString()

    @Override
    public String toString() {
        String keterangan = lambatTumbuh ? 
            "HIAS+" + getSistemHidroponik() + "=LAMBAT" : 
            getJenis().toUpperCase();
        return super.toString() + " | " + keterangan;
    }

Penjelasan Detail:
Ternary Operator (? :):

    kondisi ? nilaiJikaTrue : nilaiJikaFalse

- Shorthand untuk if-else
- Jika lambatTumbuh true → "HIAS+Wick=LAMBAT"
- Jika lambatTumbuh false → "TANAMAN HIAS"

Method Chaining:

- getSistemHidroponik(): Memanggil getter dari parent class
- getJenis().toUpperCase(): Ambil jenis, lalu convert ke uppercase

super.toString():

- Memanggil method toString() dari parent class
- Mengambil format dasar dari Tanaman
- Menambahkan keterangan tambahan di akhir

Output Example:

    Anggrek | Tanaman Hias | Wick | 15/01/2025 | Tumbuh | pH:6.0 | Bagus (Tanaman hias sistem Wick - lambat tumbuh) | HIAS+Wick=LAMBAT

---

4. User.java
Model class untuk menyimpan data user yang akan login ke sistem.
Properties

        private String username;      // Username untuk login
        private String password;      // Password user
        private String role;          // Role: "admin" atau "user"
        private String namaLengkap;   // Nama lengkap user

Constructor

    public User(String username, String password, String role, String namaLengkap) {
        this.username = username;
        this.password = password;
        this.role = role;
        this.namaLengkap = namaLengkap;
    }

Penjelasan:

- Constructor sederhana untuk inisialisasi 4 properties
- Semua parameter required (tidak ada default value)

Getter Methods

    public String getUsername() { return username; }
    public String getPassword() { return password; }
    public String getRole() { return role; }
    public String getNamaLengkap() { return namaLengkap; }

Setter Methods

    public void setUsername(String username) { this.username = username; }
    public void setPassword(String password) { this.password = password; }
    public void setRole(String role) { this.role = role; }
    public void setNamaLengkap(String namaLengkap) { this.namaLengkap = namaLengkap; }

toString()

    @Override
    public String toString() {
        return namaLengkap + " (" + username + ") - " + role;
    }

Output Example:

    Administrator (admin) - admin
    Regular User (user) - user

---

Service Layer

1. TanamanService.java

Class ini berisi business logic untuk operasi CRUD (Create, Read, Update, Delete) tanaman. Ini adalah core dari aplikasi.

Properties

    private ArrayList<Tanaman> daftarTanaman;  // Menyimpan semua data tanaman
    private Scanner input;                      // Untuk membaca input user

Penjelasan ArrayList:

- ArrayList<Tanaman>: Dynamic array yang bisa menyimpan object Tanaman
- Polymorphism: Bisa menyimpan Tanaman, TanamanCepat, dan TanamanLambat
- Dynamic size: Otomatis bertambah saat menambah data
- Methods: add(), remove(), get(), size(), isEmpty()

Constructor

    public TanamanService() {
        this.daftarTanaman = new ArrayList<>();
        this.input = new Scanner(System.in);
    }

Penjelasan:

- Inisialisasi ArrayList kosong
- Membuat Scanner untuk membaca input dari console
- Constructor dipanggil saat: new TanamanService()
- 
---

Method 1: tambahTanaman() - CREATE

    public void tambahTanaman() {
        // STEP 1: Input nama tanaman
        System.out.print("Nama Tanaman: ");
        String nama = input.nextLine();

Penjelasan:

- input.nextLine(): Membaca satu baris input dari user
- Menyimpan ke variable nama dengan tipe String

        // STEP 2: Input jenis tanaman dengan menu pilihan
            System.out.println("Jenis Tanaman: 1.Sayuran 2.Buah 3.Herbal 4.Tanaman Hias");
            System.out.print("Pilih jenis (1-4): ");
            int j = validasiInputInteger(1, 4);

Penjelasan:

- Tampilkan menu pilihan 1-4
- validasiInputInteger(1, 4): Method helper untuk validasi input
- Memastikan user input angka 1-4, tidak yang lain

---

    String jenis = (j==1)?"Sayuran":(j==2)?"Buah":(j==3)?"Herbal":(j==4)?"Tanaman Hias":"Belum ditentukan";

Penjelasan Nested Ternary:


    if (j == 1) {
        jenis = "Sayuran";
    } else if (j == 2) {
        jenis = "Buah";
    } else if (j == 3) {
        jenis = "Herbal";
    } else if (j == 4) {
        jenis = "Tanaman Hias";
    } else {
        jenis = "Belum ditentukan";
    }


- Nested ternary lebih singkat tapi kurang readable
- Mengkonversi input angka (1-4) menjadi String jenis

        // STEP 3: Input sistem hidroponik
            System.out.println("Sistem Hidroponik: 1.NFT 2.DWC 3.Wick 4.Drip 5.Ebb&Flow 6.Aeroponik");
            System.out.print("Pilih sistem (1-6): ");
            int s = validasiInputInteger(1, 6);
            String sistem = (s==1)?"NFT":(s==2)?"DWC":(s==3)?"Wick":(s==4)?"Drip":(s==5)?"Ebb&Flow":(s==6)?"Aeroponik":"Belum ditentukan";


Penjelasan:

- Sama seperti input jenis, tapi untuk sistem hidroponik
- Range 1-6 untuk 6 pilihan sistem

        // STEP 4: Input data lainnya
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

Penjelasan:

- Mengumpulkan semua data yang dibutuhkan untuk membuat object Tanaman
- Setiap input disimpan ke variable masing-masing

        // STEP 5: Buat instance berdasarkan kondisi (POLYMORPHISM)
            if (jenis.equals("Sayuran") && (sistem.equals("NFT") || sistem.equals("DWC"))) {
                // Kondisi 1: Sayuran + NFT/DWC = TanamanCepat
                TanamanCepat tanaman = new TanamanCepat(nama, jenis, sistem, tanggal, status, ph, ctn);
                daftarTanaman.add(tanaman);
                
            } else if (jenis.equals("Tanaman Hias") && (sistem.equals("Wick") || sistem.equals("Drip"))) {
                // Kondisi 2: Tanaman Hias + Wick/Drip = TanamanLambat
                TanamanLambat tanaman = new TanamanLambat(nama, jenis, sistem, tanggal, status, ph, ctn);
                daftarTanaman.add(tanaman);
                
            } else {
                // Kondisi 3: Lainnya = Tanaman biasa
                Tanaman tanaman = new Tanaman(nama, jenis, sistem, tanggal, status, ph, ctn);
                daftarTanaman.add(tanaman);
            }
            
            System.out.println("Tanaman berhasil ditambahkan!");
        }

Penjelasan Detail:
Decision Tree:

    ├─ Sayuran + (NFT || DWC) ?
    │  ├─ YES → TanamanCepat
    │  └─ NO  → Cek kondisi 2
    │
    ├─ Tanaman Hias + (Wick || Drip) ?
    │  ├─ YES → TanamanLambat
    │  └─ NO  → Tanaman biasa

Polymorphism:

- ArrayList<Tanaman> dapat menerima:

    - new Tanaman() (parent class)
    - new TanamanCepat() (child class)
    - new TanamanLambat() (child class)
- Semua disimpan sebagai tipe Tanaman
- Saat runtime, Java tahu object sebenarnya apa (dynamic binding)

Upcasting Otomatis:

    TanamanCepat tc = new TanamanCepat(...);  // TanamanCepat type
    daftarTanaman.add(tc);                     // Otomatis upcast ke Tanaman

Method 2: lihatTanaman() - READ

    public void lihatTanaman() {
        System.out.println("=== Daftar Tanaman ===");
        
        // Cek apakah daftar kosong
        if(daftarTanaman.isEmpty()) {
            System.out.println("Belum ada tanaman.");
        } else {
            // Loop untuk menampilkan semua tanaman
            for(int i = 0; i < daftarTanaman.size(); i++){
                System.out.println((i+1) + ". " + daftarTanaman.get(i).toString());
            }
        }
    }

Penjelasan Detail:
Method isEmpty():

- Return true jika ArrayList kosong
- Return false jika ada data
- Lebih baik dari size() == 0

For Loop Tradisional:

    for(int i = 0; i < daftarTanaman.size(); i++)

- i = 0: Mulai dari index 0
- i < daftarTanaman.size(): Loop selama i kurang dari jumlah data
- i++: Increment i setiap iterasi

Method get():

- daftarTanaman.get(i): Mengambil object di index i
- Return type: Tanaman (bisa juga TanamanCepat/TanamanLambat)

Method toString():

- Dipanggil otomatis saat print object
- Bisa juga explicit: daftarTanaman.get(i).toString()
- Jika object adalah TanamanLambat, akan pakai toString() yang di-override

Output Example:

    === Daftar Tanaman ===
    1. Selada | Sayuran | NFT | 01/01/2025 | Tumbuh | pH:6.5 | Baik (Sayuran sistem NFT - cepat tumbuh)
    2. Anggrek | Tanaman Hias | Wick | 15/01/2025 | Tumbuh | pH:6.0 | Bagus (Tanaman hias sistem Wick - lambat tumbuh) | HIAS+Wick=LAMBAT

Method 3: updateTanaman() - UPDATE

    public void updateTanaman() {
        // STEP 1: Cek apakah ada data
        if(daftarTanaman.isEmpty()) {
            System.out.println("Belum ada tanaman.");
            return;  // Keluar dari method
    }

Penjelasan return:

- return: Menghentikan eksekusi method dan keluar
- Tanpa return, kode di bawahnya akan tetap dijalankan
- Guard clause untuk mencegah error

        // STEP 2: Minta nomor tanaman yang akan diupdate
            System.out.print("Nomor tanaman yang ingin diupdate: ");
            int u = validasiInputInteger(1, daftarTanaman.size());

Penjelasan:

- User pilih nomor 1-N (N = jumlah tanaman)
- daftarTanaman.size(): Jumlah total tanaman
- Validasi memastikan input tidak melebihi jumlah data

        // STEP 3: Validasi nomor dan ambil object
            if(u > 0 && u <= daftarTanaman.size()){
                int idx = u - 1;  // Convert nomor tampilan ke index array
                Tanaman tanaman = daftarTanaman.get(idx);

Penjelasan Index:

- User lihat nomor: 1, 2, 3, ...
- ArrayList index: 0, 1, 2, ...
- Konversi: idx = u - 1
- Contoh: User pilih nomor 3 → Index 2

Get Reference:

- Tanaman tanaman = daftarTanaman.get(idx): Ambil referensi object
- Perubahan pada tanaman akan mengubah object di ArrayList
- Tidak membuat copy, tapi referensi ke object yang sama
        
        // STEP 4: Update setiap property menggunakan setter
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
                
                System.out.println("Tanaman berhasil diupdate!");

Penjelasan Setter:

- Menggunakan setter untuk mengubah nilai property
- tanaman.setNama(...): Ubah property nama
- Setter mengubah property private melalui public method
- Ini adalah Encapsulation dalam aksi

Flow Diagram:

    User input nomor → Ambil object → Update properties → Selesai
           ↓               ↓                 ↓
       u = 3         idx = 2          setNama(), setJenis(), ...
                    get(2)


    } else {
            System.out.println("Nomor tidak valid.");
        }
    }

Method 4: hapusTanaman() - DELETE

    public void hapusTanaman() {
        // STEP 1: Validasi data
        if(daftarTanaman.isEmpty()) {
            System.out.println("Belum ada tanaman.");
            return;
        }
        
        // STEP 2: Input nomor tanaman
        System.out.print("Nomor tanaman yang ingin dihapus: ");
        int h = validasiInputInteger(1, daftarTanaman.size());
        
        // STEP 3: Hapus dari ArrayList
        if(h > 0 && h <= daftarTanaman.size()){
            daftarTanaman.remove(h - 1);  // Remove by index
            System.out.println("Tanaman berhasil dihapus!");
        }

    Penjelasan Method remove():

remove(index): Menghapus element di index tertentu
- Return type: Object yang dihapus
- Setelah remove, semua element setelahnya bergeser ke kiri
- Size ArrayList berkurang 1

Contoh:

    Before: [Tanaman1, Tanaman2, Tanaman3, Tanaman4]
             Index: 0        1         2         3
    
    remove(1) → Hapus Tanaman2
    
    After:  [Tanaman1, Tanaman3, Tanaman4]
             Index: 0        1         2

Important Note:

- Saat remove, index berubah!
- Jangan loop dengan index dan remove di dalam loop (akan skip element)

---

    Method 5: cariTanaman() - SEARCH
    
    public void cariTanaman() {
        // STEP 1: Validasi data
        if(daftarTanaman.isEmpty()) {
            System.out.println("Belum ada tanaman.");
            return;
    }

    // STEP 2: Pilih jenis pencarian
        System.out.println("=== PENCARIAN TANAMAN ===");
        System.out.println("1. Cari berdasarkan nama");
        System.out.println("2. Cari berdasarkan jenis");
        System.out.println("3. Cari berdasarkan status");
        System.out.print("Pilih jenis pencarian: ");
        
        int jenis = validasiInputInteger(1, 3);


Penjelasan:

- User dapat memilih kriteria pencarian
- 3 pilihan: nama, jenis, atau status
- Flexible search feature

        // STEP 3: Input keyword
            System.out.print("Masukkan keyword: ");
            String keyword = input.nextLine().toLowerCase();

Penjelasan toLowerCase():

    - Konversi input ke lowercase untuk case-insensitive search
    - "SELADA" = "selada" = "Selada" (semua dianggap sama)
    - Best practice untuk pencarian
    
    // STEP 4: Loop dan filter
        System.out.println("=== Hasil Pencarian ===");
        boolean found = false;
        
        for(int i = 0; i < daftarTanaman.size(); i++){
            Tanaman t = daftarTanaman.get(i);
            boolean match = false;

Penjelasan Variable:

    - found: Track apakah ada hasil yang ditemukan
    - t: Referensi ke object tanaman saat ini
    - match: Track apakah tanaman ini cocok dengan keyword
    
    // STEP 5: Cek match berdasarkan jenis pencarian
            switch(jenis) {
                case 1: // Pencarian berdasarkan nama
                    match = t.getNama().toLowerCase().contains(keyword);
                    break;
                case 2: // Pencarian berdasarkan jenis
                    match = t.getJenis().toLowerCase().contains(keyword);
                    break;
                case 3: // Pencarian berdasarkan status
                    match = t.getStatus().toLowerCase().contains(keyword);
                    break;
            }

Penjelasan Switch-Case:

- Alternative dari if-else if-else
- Lebih clean untuk multiple conditions
- break: Keluar dari switch setelah case dijalankan

Method contains():

    "Selada Hijau".contains("lada")  → true
    "Selada Hijau".contains("merah") → false

- Return true jika substring ditemukan
- Case-sensitive, makanya pakai toLowerCase()

Partial Match:

    - User input "sel" → Match "Selada"
    - User input "say" → Match "Sayuran"
    - Lebih user-friendly dari exact match
    
    // STEP 6: Tampilkan jika match
            if(match) {
                System.out.println((i+1) + ". " + t.toString());
                found = true;
            }
    }

Penjelasan:

- Jika match, tampilkan data tanaman
- Set found = true untuk indikasi ada hasil

        // STEP 7: Pesan jika tidak ada hasil
            if(!found) {
                System.out.println("Data tidak ditemukan untuk keyword: " + keyword);
            }
        }

Penjelasan:

- !found: NOT operator (kebalikan dari found)
- Jika found = false, tampilkan pesan tidak ditemukan

Example Flow:

    User pilih: 1 (nama)
    User input: "sel"
    
    Loop through all tanaman:
      → "Selada" contains "sel"? YES → Print
      → "Kangkung" contains "sel"? NO
      → "Bayam" contains "sel"? NO
    
    Result: Found 1 tanaman

Method 6: tampilkanStatistik() - STATISTICS

    public void tampilkanStatistik() {
        // STEP 1: Validasi
        if(daftarTanaman.isEmpty()) {
            System.out.println("Belum ada tanaman.");
            return;
        }
        
        // STEP 2: Header
        System.out.println("\n=== STATISTIK TANAMAN ===");
        System.out.println("Total Tanaman: " + daftarTanaman.size());


Penjelasan:

- \n: Newline untuk spacing
- size(): Total jumlah tanaman

        // STEP 3: Hitung berdasarkan jenis
            int sayuran = 0, buah = 0, herbal = 0, hias = 0;
            
            for(Tanaman t : daftarTanaman) {
                switch(t.getJenis().toLowerCase()) {
                    case "sayuran": sayuran++; break;
                    case "buah": buah++; break;
                    case "herbal": herbal++; break;
                    case "tanaman hias": hias++; break;
                }
            }

Penjelasan Enhanced For Loop:

    for(Tanaman t : daftarTanaman)

- Alternative syntax untuk loop
- "Untuk setiap Tanaman t di dalam daftarTanaman"
- Lebih simple, tidak perlu index
- Tidak bisa modify ArrayList saat loop

Counter Pattern:

Initialize counter = 0
- Loop through data
- Increment counter jika kondisi match
- sayuran++ sama dengan sayuran = sayuran + 1

  Switch-Case untuk Counting:

          Loop 1: "Sayuran" → sayuran++ → sayuran = 1
        Loop 2: "Buah" → buah++ → buah = 1
        Loop 3: "Sayuran" → sayuran++ → sayuran = 2
        ...

          // STEP 4: Tampilkan hasil jenis
            System.out.println("\nBerdasarkan Jenis:");
            System.out.println("- Sayuran: " + sayuran);
            System.out.println("- Buah: " + buah);
            System.out.println("- Herbal: " + herbal);
            System.out.println("- Tanaman Hias: " + hias);

          // STEP 5: Hitung berdasarkan status
            int bibit = 0, tumbuh = 0, berbunga = 0, berbuah = 0, panen = 0, mati = 0;
            
            for(Tanaman t : daftarTanaman) {
                switch(t.getStatus().toLowerCase()) {
                    case "bibit": bibit++; break;
                    case "tumbuh": tumbuh++; break;
                    case "berbunga": berbunga++; break;
                    case "berbuah": berbuah++; break;
                    case "panen": panen++; break;
                    case "mati": mati++; break;
                }
            }
            
            // STEP 6: Tampilkan hasil status
            System.out.println("\nBerdasarkan Status:");
            System.out.println("- Bibit: " + bibit);
            System.out.println("- Tumbuh: " + tumbuh);
            System.out.println("- Berbunga: " + berbunga);
            System.out.println("- Berbuah: " + berbuah);
            System.out.println("- Panen: " + panen);
            System.out.println("- Mati: " + mati);
        }

  Example Output:

  Method 7: validasiInputInteger() - VALIDATION
    
      private int validasiInputInteger(int min, int max) {
        int nilai;
        
        while(true) {  // Infinite loop
            try {
                // STEP 1: Coba baca input
                nilai = input.nextInt();
                input.nextLine(); // consume newline character

Penjelasan While(true):

- Loop tak terbatas
- Akan terus loop sampai break dipanggil
- Pattern umum untuk validasi input

Try-Catch Block:

- try: Coba jalankan kode yang mungkin error
- catch: Tangkap error jika terjadi
- Exception handling untuk input validation

nextInt() Problem:

    User input: "123\n"
    nextInt() → reads "123", leaves "\n"
    nextLine() → reads "\n" (consume the leftover)

- nextInt() tidak membaca newline
- nextLine() setelahnya untuk membersihkan buffer

        // STEP 2: Validasi range
                    if(nilai >= min && nilai <= max) {
                        break;  // Keluar dari loop
                    } else {
                        System.out.print("Input harus antara " + min + " dan " + max + ". Coba lagi: ");
                    }

Penjelasan Validation:

- Cek apakah input dalam range min-max
- Jika valid: break (keluar dari loop)
- Jika tidak valid: tampilkan pesan, loop lagi

Example:

    min = 1, max = 4
    
    Input: 5 → "Input harus antara 1 dan 4"
    Input: 0 → "Input harus antara 1 dan 4"
    Input: 2 → Valid, break

        } catch(Exception e) {
                    System.out.print("Input harus berupa angka. Coba lagi: ");
                    input.nextLine(); // consume invalid input
                }
            }
            return nilai;
        }

Penjelasan Exception:

- Exception e: Variable untuk menyimpan error
- Jika nextInt() gagal (user input huruf), masuk catch block
- input.nextLine(): Buang input yang invalid

Exception Flow:

    User input: "abc"
    nextInt() → Throws InputMismatchException
    Caught by catch → Print error message
    nextLine() → Clear "abc" dari buffer
    Loop again → Minta input baru

2. UserService.java
Deskripsi
Class ini mengelola autentikasi user dan role-based access control.
Properties

        private ArrayList<User> daftarUser;  // Menyimpan semua user
        private User currentUser;            // User yang sedang login

Penjelasan:

daftarUser: Database user (in-memory)
currentUser: Track user yang sedang aktif
null = belum login

Constructor

    public UserService() {
        this.daftarUser = new ArrayList<>();
        
        // Inisialisasi user default
        daftarUser.add(new User("admin", "admin123", "admin", "Administrator"));
        daftarUser.add(new User("user", "user123", "user", "Regular User"));
        
        this.currentUser = null;  // Belum ada yang login
    }

Penjelasan:

Membuat 2 user default saat aplikasi start
Admin: Full access
User: Limited access
currentUser = null: Initial state


Method login()

    public boolean login(String username, String password) {
        // Loop through semua user
        for(User user : daftarUser) {
            // Cek username DAN password
            if(user.getUsername().equals(username) && 
               user.getPassword().equals(password)) {
                this.currentUser = user;  // Set user yang login
                return true;              // Login berhasil
            }
        }
        return false;  // Login gagal
    }

Penjelasan Detail:
Linear Search:

- Loop semua user satu per satu
- Cek apakah username DAN password cocok
- Time complexity: O(n)

Logical AND (&&):

- Kedua kondisi harus TRUE
- Short-circuit evaluation: Jika kondisi pertama FALSE, kondisi kedua tidak dievaluasi

Authentication Flow:

    Input: username="admin", password="admin123"
    
    Loop:
      User 1: username="admin", password="admin123"
        → "admin" == "admin"? YES
        → "admin123" == "admin123"? YES
        → Both TRUE → Set currentUser, return true
    
    Result: Login Success

Failed Login:

    Input: username="admin", password="wrong"
    
    Loop:
      User 1: username="admin", password="admin123"
        → "admin" == "admin"? YES
        → "wrong" == "admin123"? NO
        → FALSE → Continue loop
      
      User 2: username="user", password="user123"
        → "admin" == "user"? NO
        → Don't check password (short-circuit)
        → FALSE → Continue loop
    
    End of loop → return false

Method logout()

    public void logout() {
        this.currentUser = null;
    }

Penjelasan:

- Set currentUser ke null
- Menandakan tidak ada user yang login
- Simple tapi efektif

Method getCurrentUser()

    public User getCurrentUser() {
        return currentUser;
    }

    Penjelasan:
    
    Return object User yang sedang login
    Return null jika belum login
    Digunakan untuk mendapatkan info user (nama, role, dll)


Method isLoggedIn()

    public boolean isLoggedIn() {
        return currentUser != null;
    }

Penjelasan:

- Return true jika currentUser bukan null (ada yang login)
- Return false jika currentUser = null (belum login)
- Guard untuk cek status login

Usage:

    if(userService.isLoggedIn()) {
        // User sudah login, tampilkan menu sistem
    } else {
        // User belum login, tampilkan menu login
    }

Method isAdmin()

    public boolean isAdmin() {
        return currentUser != null && "admin".equals(currentUser.getRole());
    }

Penjelasan Detail:
Double Check:

- currentUser != null: Pastikan ada user yang login
- "admin".equals(...): Cek apakah role = "admin"

Why "admin".equals() instead of currentUser.getRole().equals("admin")?

    // Cara 1: Safer
    "admin".equals(currentUser.getRole())
    // Jika getRole() return null, tidak error
    
    // Cara 2: Risky
    currentUser.getRole().equals("admin")
    // Jika getRole() return null, NullPointerException!

Short-Circuit:

- Jika currentUser = null, kondisi kedua tidak dievaluasi
- Mencegah NullPointerException

Usage Example:

    if(userService.isAdmin()) {
        // Allow delete operation
        tanamanService.hapusTanaman();
    } else {
        // Deny access
        System.out.println("Akses ditolak! Hanya admin.");
    }

View Layer
MenuView.java
Deskripsi
Class ini adalah presentation layer yang mengatur semua interaksi dengan user (input/output).
Properties

    private final TanamanService tanamanService;
    private final UserService userService;
    private final Scanner input;

Penjelasan final:

- final: Variable tidak bisa di-assign ulang setelah inisialisasi
- Good practice untuk dependency yang tidak berubah
- Tidak bisa: tanamanService = new TanamanService()
- Bisa: tanamanService.tambahTanaman()

Constructor

    public MenuView() {
        this.tanamanService = new TanamanService();
        this.userService = new UserService();
        this.input = new Scanner(System.in);
    }

Penjelasan:

- Membuat instance service layer
- Dependency Injection pattern (manual)
- Scanner untuk input

Method tampilkanMenuUtama()

    public void tampilkanMenuUtama() {
        while (true) {  // Main application loop
            if (!userService.isLoggedIn()) {
                tampilkanMenuLogin();
            } else {
                tampilkanMenuSistem();
            }
        }
    }

Method tampilkanMenuLogin()

    private void tampilkanMenuLogin() {
        System.out.println("\n=== SISTEM MANAJEMEN TANAMAN HIDROPONIK ===");
        System.out.println("1. Login");
        System.out.println("2. Keluar");
        System.out.print("Pilih menu: ");
    
        int pilihan = validasiInputInteger(1, 2);
    
        switch (pilihan) {
            case 1:
                prosesLogin();
                break;
            case 2:
                System.out.println("Terima kasih!");
                System.exit(0);  // Terminate application
                break;
        }
    }

Penjelasan:
System.exit(0):

- Terminate seluruh aplikasi
- 0 = exit normal (success)
- Non-zero = exit dengan error

Menu Pattern:

- Tampilkan pilihan
- Validasi input
- Route ke method yang sesuai

Method prosesLogin()

    private void prosesLogin() {
        System.out.print("Username: ");
        String username = input.nextLine();
        System.out.print("Password: ");
        String password = input.nextLine();
    
        if (userService.login(username, password)) {
            System.out.println("Login berhasil! Selamat datang, "
                    + userService.getCurrentUser().getNamaLengkap());
        } else {
            System.out.println("Login gagal! Username atau password salah.");
        }
    }

Penjelasan Flow:

    1. Minta username
    2. Minta password
    3. Call userService.login()
       ├─ Success → Print welcome message
       └─ Failed → Print error message
    4. Return ke main loop

Method Chaining:

    userService.getCurrentUser().getNamaLengkap()

- userService.getCurrentUser() → Return User object
- .getNamaLengkap() → Call method pada User object
- Chain method calls untuk akses nested data

Method tampilkanMenuSistem()

    private void tampilkanMenuSistem() {
        System.out.println("\n=== SISTEM MANAJEMEN TANAMAN HIDROPONIK ===");
        System.out.println("User: " + userService.getCurrentUser().getNamaLengkap()
                + " (" + userService.getCurrentUser().getRole() + ")");
        System.out.println("1. Tambah Tanaman");
        System.out.println("2. Lihat Semua Tanaman");
        System.out.println("3. Update Tanaman");
        System.out.println("4. Hapus Tanaman");
        System.out.println("5. Cari Tanaman");
        System.out.println("6. Statistik Tanaman");
        System.out.println("7. Logout");
        System.out.print("Pilih menu: ");
    
        int maxMenu = userService.isAdmin() ? 8 : 8;
        int pilihan = validasiInputInteger(1, maxMenu);
    
        prosesMenuSistem(pilihan);
    }

Penjelasan:
User Info Display:

- Tampilkan nama dan role user yang login
- User tahu siapa yang sedang login

Dynamic Max Menu:

    int maxMenu = userService.isAdmin() ? 8 : 8;

- Ternary operator (currently sama untuk admin dan user)
- Bisa dimodifikasi untuk limit menu user biasa

Method prosesMenuSistem()

    private void prosesMenuSistem(int pilihan) {
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
                    System.out.println("Akses ditolak! Hanya admin yang dapat menghapus data.");
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
                System.out.println("Logout berhasil!");
                break;
        }
    }

Penjelasan Role-Based Access Control:
Case 4: Delete Operation

    if (userService.isAdmin()) {
        // Admin: Allow
        tanamanService.hapusTanaman();
    } else {
        // User biasa: Deny
        System.out.println("Akses ditolak!");
    }

Access Matrix:
    
    Operation          | Admin | User
    -------------------|-------|------
    Tambah Tanaman     |  ✓    |  ✓
    Lihat Tanaman      |  ✓    |  ✓
    Update Tanaman     |  ✓    |  ✓
    Hapus Tanaman      |  ✓    |  ✗
    Cari Tanaman       |  ✓    |  ✓
    Statistik          |  ✓    |  ✓
    Logout             |  ✓    |  ✓


Method validasiInputInteger()

    private int validasiInputInteger(int min, int max) {
        int nilai;
        while (true) {
            try {
                nilai = input.nextInt();
                input.nextLine(); // consume newline
                if (nilai >= min && nilai <= max) {
                    break;
                } else {
                    System.out.print("Input harus antara " + min + " dan " + max + ". Coba lagi: ");
                }
            } catch (Exception e) {
                System.out.print("Input harus berupa angka. Coba lagi: ");
                input.nextLine(); // consume invalid input
            }
        }
        return nilai;
    }

Penjelasan:

- Sama seperti validasi di TanamanService
- DRY Principle: Don't Repeat Yourself
- Bisa di-refactor ke utility class

Post_test_2.java
javapackage com.mycompany.post_test_2.main;

    import com.mycompany.post_test_2.view.MenuView;
    
    public class Post_test_2 {
        public static void main(String[] args) {
            System.out.println("Memuat Sistem Manajemen Tanaman Hidroponik...");
            System.out.println("Arsitektur: MVC (Model-View-Controller)");
            
            MenuView menuView = new MenuView();
            menuView.tampilkanMenuUtama();
        }

Penjelasan:
main() Method:

- Entry point aplikasi Java
- public static void main(String[] args) adalah signature fixed
- Dipanggil pertama kali saat aplikasi dijalankan

Application Initialization:

- Print welcome message
- Create MenuView instance
- Start main application loop

Execution Flow:

        JVM Start
          ↓
        main() called
          ↓
        Create MenuView
          ↓
        menuView.tampilkanMenuUtama()
          ↓
        Enter infinite loop
          ↓
        Application runs until System.exit(0)


---

###  1. ABSTRACTION

#### A. Abstract Class: `BaseService<T>`
**Lokasi:** `com.mycompany.post_test_2.service.BaseService`

**Fungsi:**
- Base class untuk semua service yang mengelola data
- Menyediakan template method untuk operasi CRUD
- Menerapkan Generic Type `<T>` untuk fleksibilitas

**Abstract Methods:**
```java
public abstract void tambahData();
public abstract void lihatData();
public abstract void updateData();
public abstract void hapusData();
```

**Concrete Methods:**
- `isDataEmpty()` - Mengecek apakah data kosong
- `getDataSize()` - Mendapatkan jumlah data
- `validasiInputInteger()` - Validasi input (dengan 3 overload)
- `prosesData()` - Template method pattern
- `displayInfo()` & `displayError()` - Helper untuk display

**Implementasi:**
- `TanamanService` extends `BaseService<Tanaman>`

---

#### B. Interface: `IMenuView`
**Lokasi:** `com.mycompany.post_test_2.view.IMenuView`

**Fungsi:**
- Kontrak untuk semua class yang mengelola menu/view
- Menyediakan default method untuk UI elements

**Abstract Methods:**
```java
void tampilkanMenuUtama();
void tampilkanMenuLogin();
void prosesLogin();
void tampilkanMenuSistem();
void prosesMenuSistem(int pilihan);
int validasiInputInteger(int min, int max);
```

**Default Methods:**
```java
default void tampilkanHeader()
default void tampilkanFooter()
default boolean konfirmasiAksi(String pesan)
```

**Implementasi:**
- `MenuView` implements `IMenuView`

---

###  2. POLYMORPHISM

#### A. Method Overloading (Compile-time Polymorphism)

**1. Di BaseService:**
```java
// Versi 1: dengan min dan max
protected int validasiInputInteger(int min, int max)

// Versi 2: hanya max (min default = 1)
protected int validasiInputInteger(int max)

// Versi 3: tanpa parameter (default 1-10)
protected int validasiInputInteger()
```

**2. Di TanamanService:**
```java
// Versi 1: tampilkan semua
public void lihatTanaman()

// Versi 2: dengan filter jenis/status
public void lihatTanaman(String filter)

// Versi 3: dengan range index
public void lihatTanaman(int start, int end)
```

**3. Di MenuView:**
```java
// Versi 1: dengan min dan max
public int validasiInputInteger(int min, int max)

// Versi 2: hanya max
public int validasiInputInteger(int max)

// Versi 3: tanpa parameter
public int validasiInputInteger()
```

---

#### B. Method Overriding (Runtime Polymorphism)

**1. TanamanService Override BaseService:**
```java
@Override
public void tambahData() { tambahTanaman(); }

@Override
public void lihatData() { lihatTanaman(); }

@Override
public void updateData() { updateTanaman(); }

@Override
public void hapusData() { hapusTanaman(); }
```

**2. MenuView Override IMenuView:**
```java
@Override
public void tampilkanMenuUtama()

@Override
public void tampilkanMenuLogin()

@Override
public void prosesLogin()

@Override
public void tampilkanMenuSistem()

@Override
public void prosesMenuSistem(int pilihan)

@Override
public int validasiInputInteger(int min, int max)

// Override default method dari interface
@Override
public void tampilkanHeader()

@Override
public void tampilkanFooter()
```

**3. TanamanLambat Override Tanaman:**
```java
@Override
public String toString() // Sudah ada dari versi sebelumnya
```

---

##  Manfaat Implementasi

### 1. **Abstraction Benefits:**
- **Loose Coupling:** Interface memisahkan kontrak dari implementasi
- **Code Reusability:** BaseService dapat digunakan untuk service lain (misal: UserService)
- **Maintainability:** Perubahan implementasi tidak mempengaruhi kontrak
- **Scalability:** Mudah menambah service atau view baru
- **Template Method Pattern:** Alur proses standar di BaseService

### 2. **Polymorphism Benefits:**
- **Flexibility:** Method overloading memberikan berbagai cara pemanggilan
- **Readability:** Kode lebih mudah dibaca dengan parameter yang sesuai kebutuhan
- **Dynamic Binding:** Runtime polymorphism untuk perilaku berbeda
- **Code Reduction:** Menghindari duplikasi kode

---

##  Diagram Struktur

```
┌─────────────────┐
│  BaseService<T> │ (Abstract Class)
│  (Abstract)     │
├─────────────────┤
│ + dataList      │
│ + input         │
├─────────────────┤
│ + tambahData()* │
│ + lihatData()*  │
│ + updateData()* │
│ + hapusData()*  │
│ + isDataEmpty() │
│ + getDataSize() │
└────────┬────────┘
         │ extends
         ▼
┌──────────────────┐
│ TanamanService   │
├──────────────────┤
│ Override:        │
│ + tambahData()   │
│ + lihatData()    │
│ + updateData()   │
│ + hapusData()    │
├──────────────────┤
│ Overload:        │
│ + lihatTanaman() │
│ + lihatTanaman(S)│
│ + lihatTanaman(I)│
└──────────────────┘


┌─────────────┐
│  IMenuView  │ (Interface)
├─────────────┤
│ + tampilkanMenuUtama()    │
│ + tampilkanMenuLogin()    │
│ + prosesLogin()           │
│ + tampilkanMenuSistem()   │
│ + prosesMenuSistem(int)   │
│ + validasiInputInteger()  │
│ + tampilkanHeader()       │ (default)
│ + tampilkanFooter()       │ (default)
└──────┬──────┘
       │ implements
       ▼
┌──────────────┐
│   MenuView   │
├──────────────┤
│ Override:    │
│ All methods  │
├──────────────┤
│ Overload:    │
│ + validasi() │
│ + validasi(I)│
└──────────────┘
```

---

##  Cara Penggunaan

### 1. **Kompilasi File Baru:**
```bash
# Compile abstract class
javac BaseService.java

# Compile interface
javac IMenuView.java

# Compile updated service
javac TanamanService.java

# Compile updated view
javac MenuView.java
```

### 2. **Struktur Package:**
```
com.mycompany.post_test_2/
├── main/
│   └── Post_test_2.java
├── model/
│   ├── Tanaman.java
│   ├── TanamanCepat.java
│   ├── TanamanLambat.java
│   └── User.java
├── service/
│   ├── BaseService.java         ← BARU (Abstract)
│   ├── TanamanService.java      ← UPDATED
│   └── UserService.java
└── view/
    ├── IMenuView.java           ← BARU (Interface)
    └── MenuView.java            ← UPDATED
```

---

##  Contoh Penggunaan Polymorphism

### **Method Overloading:**

```java
// Di TanamanService
tanamanService.lihatTanaman();              // Semua tanaman
tanamanService.lihatTanaman("Sayuran");     // Filter sayuran
tanamanService.lihatTanaman(1, 5);          // Index 1-5

// Validasi input
int nilai1 = validasiInputInteger(1, 10);   // Min 1, Max 10
int nilai2 = validasiInputInteger(10);      // Min 1 (default), Max 10
int nilai3 = validasiInputInteger();        // Min 1, Max 10 (default)
```

### **Method Overriding:**

```java
// BaseService (abstract)
public abstract void tambahData();

// TanamanService (concrete implementation)
@Override
public void tambahData() {
    tambahTanaman(); // Implementasi spesifik untuk tanaman
}

// Future: UserService
@Override
public void tambahData() {
    tambahUser(); // Implementasi berbeda untuk user
}
```

---

##  Nilai Tambah: Kombinasi Abstract Class & Interface

### **Mengapa Menggunakan Keduanya?**

**Abstract Class (BaseService):**
-  Menyediakan state (dataList, input)
-  Menyediakan implementasi method umum
-  Template method pattern
-  Code reuse dengan inheritance

**Interface (IMenuView):**
-  Multiple implementation contract
-  Default method untuk UI helpers
-  Loose coupling
-  Flexibility untuk implementasi berbeda

### **Kombinasi Keduanya:**
```java
// BaseService: untuk behavior dan state sharing
public abstract class BaseService<T> {
    protected ArrayList<T> dataList;  // Shared state
    public abstract void tambahData(); // Contract
    public boolean isDataEmpty() {     // Shared behavior
        return dataList.isEmpty();
    }
}

// IMenuView: untuk contract tanpa state
public interface IMenuView {
    void tampilkanMenuUtama();         // Pure contract
    default void tampilkanHeader() {   // Optional behavior
        System.out.println("=== HEADER ===");
    }
}
```

---

##  Konsep OOP yang Diterapkan

### ✅ **Checklist Lengkap:**

| Konsep | Status | Implementasi |
|--------|--------|--------------|
| **Encapsulation** | ✅ | Private properties + getter/setter |
| **Inheritance** | ✅ | TanamanCepat/Lambat extends Tanaman |
| **Polymorphism - Overloading** | ✅ | 3 versi validasiInputInteger(), lihatTanaman() |
| **Polymorphism - Overriding** | ✅ | Override abstract methods + toString() |
| **Abstraction - Abstract Class** | ✅ | BaseService<T> |
| **Abstraction - Interface** | ✅ | IMenuView |
| **Generic Type** | ✅ | BaseService<T> |
| **Template Method Pattern** | ✅ | prosesData() di BaseService |
| **Default Method (Java 8+)** | ✅ | tampilkanHeader() di interface |

---

##  Keuntungan Refactoring

### **Sebelum (Versi 1):**
```java
// TanamanService - standalone class
public class TanamanService {
    private ArrayList<Tanaman> daftarTanaman;
    public void tambahTanaman() { ... }
    public void lihatTanaman() { ... }
    // ... semua logic di satu class
}

// MenuView - standalone class
public class MenuView {
    public void tampilkanMenuUtama() { ... }
    // ... tidak ada kontrak
}
```

### **Sesudah (Versi 2):**
```java
// TanamanService - extends abstract, follows contract
public class TanamanService extends BaseService<Tanaman> {
    @Override
    public void tambahData() { tambahTanaman(); }
    // ... reuse methods dari BaseService
    // ... focus on specific logic
}

// MenuView - implements interface
public class MenuView implements IMenuView {
    @Override
    public void tampilkanMenuUtama() { ... }
    // ... follows contract
    // ... dapat diganti implementasi lain
}
```

### **Benefit:**
-  **Modular:** Setiap class punya tanggung jawab jelas
-  **Reusable:** BaseService bisa untuk service lain
-  **Pluggable:** Mudah ganti implementasi
-  **Testable:** Mudah di-mock untuk testing
-  **Readable:** Struktur lebih jelas

---

##  Testing Scenario

### **Test Polymorphism:**
```java
// Test Overloading
TanamanService service = new TanamanService();

// Call 1: lihatTanaman()
service.lihatTanaman();  
// Output: Semua tanaman

// Call 2: lihatTanaman(String)
service.lihatTanaman("Sayuran");  
// Output: Hanya sayuran

// Call 3: lihatTanaman(int, int)
service.lihatTanaman(1, 3);  
// Output: Tanaman index 1-3

// Test validasi overload
int a = service.validasiInputInteger(1, 10);  // Min-Max
int b = service.validasiInputInteger(10);      // Only Max
int c = service.validasiInputInteger();        // Default
```

### **Test Abstraction:**
```java
// Polymorphic reference
BaseService<Tanaman> service = new TanamanService();

// Call abstract method (implemented in subclass)
service.tambahData();  // Calls TanamanService.tambahData()
service.lihatData();   // Calls TanamanService.lihatData()

// Call concrete method from base class
boolean empty = service.isDataEmpty();
int size = service.getDataSize();
```

---

##  Catatan Penting

1. **Abstract Class vs Interface:**
   - Abstract class: ketika butuh share state dan behavior
   - Interface: ketika hanya butuh contract

2. **Method Overloading:**
   - Harus dalam class yang sama
   - Berbeda signature (parameter)
   - Compile-time binding

3. **Method Overriding:**
   - Harus inheritance relationship
   - Signature sama persis
   - Runtime binding

4. **Generic Type <T>:**
   - Membuat code lebih flexible
   - Type-safe at compile time
   - Reusable untuk berbagai tipe

---

##  Summary

Program ini berhasil menerapkan:
-  **1 Abstract Class** (BaseService)
-  **1 Interface** (IMenuView)
-  **3 Method Overloading** (validasiInputInteger, lihatTanaman)
-  **Multiple Method Overriding**
-  **Kombinasi Abstract + Interface** (nilai tambah!)
-  **Generic Type** (bonus!)
-  **Design Pattern** (Template Method)
