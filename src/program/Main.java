
package program;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        BangunDatar nBangunDatar = new BangunDatar();
        int pil;
        Scanner n = new Scanner(System.in);
        System.out.println("Menghitung Luas dan Keliling Bangun Datar");
        System.out.println("");
        System.out.println("1. Persegi");
        System.out.println("2. Persegi Panjang");
        System.out.println("3. Lingkaran");
        System.out.println("4. Segitiga");
        System.out.println("5. keluar");
        System.out.println("");
        do{
        System.out.print("Pilih : ");
        pil = n.nextInt();
        switch (pil){
            case 1 :
                Persegi nPersegi = new Persegi();
                System.out.println("===Persegi===");
                nPersegi.sisi();
                nPersegi.Keliling();
                nPersegi.Luas();
            break;
            case 2 :
                PersegiPanjang nPersegiPanjang = new PersegiPanjang();
                System.out.println("===Persegi Panjang===");
                nPersegiPanjang.panjang();
                nPersegiPanjang.lebar();
                nPersegiPanjang.Keliling();
                nPersegiPanjang.Luas();
            break;
            case 3 :
                Lingkaran nLingkaran = new Lingkaran();
                System.out.println("===Lingkaran===");
                nLingkaran.jarijari();
                nLingkaran.Keliling();
                nLingkaran.Luas();
            break;
            case 4 :
                Segitiga nSegitiga = new Segitiga();
                System.out.println("===Segitiga===");
                nSegitiga.alas();
                nSegitiga.tinggi();
                nSegitiga.Keliling();
                nSegitiga.Luas();
            break;
            case 5 :
                System.exit(5);
            default :
                System.out.println("Pilihan yang anda masukkan salah");
        }
        System.out.println("============");
        System.out.println("");
    }
        while (pil<=5);
        }
    
}
