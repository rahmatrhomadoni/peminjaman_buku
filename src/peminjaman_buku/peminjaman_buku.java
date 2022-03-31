package peminjaman_buku;

import java.util.*;

// Mahasiswa
class Mahasiswa {
    String nama;
    String npm;
    String prodi;

    // Constructor
    Mahasiswa(String nama, String npm, String prodi){
        this.nama = nama;
        this.npm = npm;
        this.prodi = prodi;
    }

    // Method
    void dataMahasiswa(){
        System.out.println(" ------ Data Mahasiswa ------ ");
        System.out.println("Nama          : " + this.nama);
        System.out.println("NPM         : " + this.npm);
        System.out.println("Program Studi     : " + this.prodi);
    }
}

// buku
class buku {
    String judul;
    String penulis;
    String penerbit;

    // Constructor
    buku (String judul, String penulis, String penerbit) {
        this.judul = judul;
        this.penulis = penulis;
        this.penerbit = penerbit;
    }

    // Method
    void dataBuku(){
        System.out.println(" ------ Data Buku ------ ");
        System.out.println ("Judul Buku : " + this.judul);
        System.out.println ("Penulis Buku : " + this.penulis);
        System.out.println ("Penerbit : " + this.penerbit);
    }
}


public class peminjaman_buku {

    public static void main(String[] args) {
        int pilihan, x = 0, y = 0;
        char alternatif;
        String nama, npm, prodi;
        String judul, penulis, penerbit;

        try (Scanner input = new Scanner(System.in)) {
            Mahasiswa[] dataMahasiswa = new Mahasiswa[1024];
            buku[] dataBuku = new buku[1024];

            do {
                System.out.print("\n");
                System.out.println(" ----- Perpustakaan Himatro ----- ");
                System.out.print("\n");
                System.out.println("1. Input Data Peminjaman");
                System.out.println("2. Data Peminjaman");
                System.out.println("3. Keluar\n ");

                System.out.print("Masukkan pilihan : ");
                pilihan = input.nextInt();
                if (pilihan == 1) {
                    x++;
                    do {
                        System.out.print("\n");
                        System.out.println(" ------ Data Mahasiswa ----- ");
                        System.out.print("Nama          : ");
                        nama = input.next();
                        System.out.print("NPM           : ");
                        npm = input.next();
                        System.out.print("Program Studi : ");
                        prodi = input.next();
                        System.out.print("\n");
                        dataMahasiswa[x] = new Mahasiswa(nama, npm, prodi);

                        System.out.println(" ------ Data Buku ----- ");
                        System.out.print("Judul Buku    : ");
                        judul = input.next();
                        System.out.print("Penulis   : ");
                        penulis = input.next();
                        System.out.print ("Penerbit : ");
                        penerbit = input.next();
                        System.out.print("\n");
                        dataBuku[x] = new buku(judul, penulis, penerbit);

                        System.out.print("Ingin Menambahkan Buku Pinjaman lagi? (y/n) ");
                        alternatif = input.next().charAt(0);
                    }while (alternatif == 'y' || alternatif == 'Y');
                     System.out.print("\n");
                    System.out.print("- Data Peminjaman Berhasil Disimpan -");
                    System.out.print("\n");
                } else if (pilihan == 2) {
                    if (x < 1) {
                        System.out.print("\n");
                        System.out.println("Data Peminjaman belum tersedia !");
                    } else {
                        while (y < x) {
                            y++;
                            System.out.print("\n");
                            System.out.println(" - Data Peminjaman Buku -");
                            System.out.print("\n");
                            dataMahasiswa[y].dataMahasiswa();
                            dataBuku[y].dataBuku();
                        }
                    }
                } else {
                    return;
                }
                System.out.print("\n");
                System.out.print("Ingin Kembali Ke Menu ? (y/n) ");
                alternatif = input.next().charAt(0);
            } while (alternatif == 'y' || alternatif == 'Y');
        }
        System.out.print("\n");
        System.out.print("~ Terimakasih Telah Menggunakan Aplikasi Ini ~");
        System.out.print("\n");
    }
}    
    
    

