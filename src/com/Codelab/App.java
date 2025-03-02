package com.Codelab;

import java.time.LocalDate; // Import library untuk ambil tanggal sekarang atau bisa dibilang realtime
import java.util.Scanner; // Import library supaya bisa ambil input dari user

// Kelas Person untuk menyimpan data orang
class Person {
    private String nama; // Variabel untuk nama
    private char jenisKelamin; // Variabel untuk jenis kelamin (P/L)perempuan dan laki-laki
    private int tahunLahir; // Variabel untuk tahun lahir

    // Constructor (fungsi yang otomatis dipanggil saat objek dibuat)
    public Person(String nama, char jenisKelamin, int tahunLahir) {
        this.nama = nama; // Simpan nama ke variabel dalam class
        this.jenisKelamin = jenisKelamin; // Simpan jenis kelamin
        this.tahunLahir = tahunLahir; // Simpan tahun lahir
    }

    // Method untuk mengubah jenis kelamin dari karakter jadi teks
    public String getJenisKelaminFormatted() {
        if (jenisKelamin == 'L' || jenisKelamin == 'l') // Kalau L/l, berarti Laki-Laki
            return "Laki-Laki";
        else if (jenisKelamin == 'P' || jenisKelamin == 'p') // Kalau P/p, berarti Perempuan
            return "Perempuan";
        else // Kalau bukan P atau L, kasih teks default
            return "Tidak diketahui";
    }

    // Method untuk menghitung umur
    public int hitungUmur() {
        int tahunSekarang = LocalDate.now().getYear(); // Ambil tahun sekarang
        return tahunSekarang - tahunLahir; // Hitung umur (tahun sekarang - tahun lahir)
    }

    // Method untuk menampilkan data diri
    public void tampilkanData() {
        System.out.println("\nData Diri:"); // Cetak judul
        System.out.println("Nama          : " + nama); // Cetak nama
        System.out.println("Jenis Kelamin : " + getJenisKelaminFormatted()); // Cetak jenis kelamin
        System.out.println("Umur          : " + hitungUmur() + " tahun"); // Cetak umur
    }
}

// Kelas utama (main program)
public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Scanner buat ambil input user

        // Minta user masukin data
        System.out.print("Masukkan nama: ");
        String nama = scanner.nextLine(); // Ambil input nama (String)

        System.out.print("Masukkan jenis kelamin (P/L): ");
        char jenisKelamin = scanner.next().charAt(0); // Ambil input jenis kelamin (1 karakter)

        System.out.print("Masukkan tahun lahir: ");
        int tahunLahir = scanner.nextInt(); // Ambil input tahun lahir (angka)

        scanner.close(); // Tutup scanner biar ga boros memori

        // Buat objek Person dengan data yang sudah diinput
        Person person = new Person(nama, jenisKelamin, tahunLahir);

        // Panggil method buat nampilin data diri
        person.tampilkanData();
    }
}

