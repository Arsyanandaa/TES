package com.Tugas.Modul1;

import java.util.Scanner;

public class Tugas1 {
public static void main(String[]args){
    Scanner Belajar = new Scanner(System.in);
    System.out.println("Pilih Jenis Login");
    System.out.println("1. Admin");
    System.out.println("2. Mahasiswa");
    System.out.println("Masukkan Pilihan Anda");

    int Choice = Belajar.nextInt();
    Belajar.nextLine();

    if (Choice == 1 ){
        System.out.println("Masukkan Username : "); 
            String Username = Belajar.nextLine();
        System.out.println("Masukkan Password : ");
            String Password = Belajar.nextLine();
        
            String validUsername="Arsya Nanda";
            String validPassword="12345678";

        if (Username.equals(validUsername) && Password.equals(validPassword)){
            System.out.println("Login Berhasil!");
        }else{
            System.out.println("Login tidak Berhasil, Password nya Salah!");
        }
        }else if (Choice == 2) {
            System.out.println("Masukkan Nama : ");
                String Nama = Belajar.nextLine();
            System.out.println("Masukkan NIM anda : ");
                String NIM = Belajar.nextLine();

            String validNama="Mahligai Arsya Nanda";
            String validNIM="2024103701100562";

        if(Nama.equals(validNama) && NIM.equals(validNIM)){
            System.out.println("Login Sebagai Mahasiswa Berhasil!");
        }else{
            System.out.println("Login Tidak Berhasil, NIM Salah");
        }
        Belajar.close();
        }
    }
}

