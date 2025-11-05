package belajar_kasir;

import java.util.Scanner;

public class Belajar_Kasir {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int pilihan, jumlah;
        double total = 0;
        String ulang;
        
        System.out.println("=== Program Kasir Sederhana ===");
        
        do {
            System.out.println("\nMenu Barang:");
            System.out.println("1. Indomie Goreng  - Rp 3500");
            System.out.println("2. Teh Botol       - Rp 5000");
            System.out.println("3. Roti Coklat     - Rp 7000");
            System.out.println("4. Susu UHT        - Rp 8000");
            System.out.println("5. Coklat SilverQueen - Rp 15000");
            System.out.print("Pilih barang (1-5): ");
            pilihan = input.nextInt();
            
            System.out.print("Masukkan jumlah: ");
            jumlah = input.nextInt();
            
            switch (pilihan) {
                case 1:
                    total += 3500 * jumlah;
                    System.out.println("Anda membeli Indomie Goreng x" + jumlah);
                    break;
                case 2:
                    total += 5000 * jumlah;
                    System.out.println("Anda membeli Teh Botol x" + jumlah);
                    break;
                case 3:
                    total += 7000 * jumlah;
                    System.out.println("Anda membeli Roti Coklat x" + jumlah);
                    break;
                case 4:
                    total += 8000 * jumlah;
                    System.out.println("Anda membeli Susu UHT x" + jumlah);
                    break;
                case 5:
                    total += 15000 * jumlah;
                    System.out.println("Anda membeli Coklat SilverQueen x" + jumlah);
                    break;
                default:
                    System.out.println("Pilihan tidak tersedia!");
                    break;
            }
            
            System.out.print("\nApakah ingin belanja lagi? (y/n): ");
            ulang = input.next();
            
        } while (ulang.equalsIgnoreCase("y"));
        
        // Diskon jika total lebih dari 50.000
        double diskon = 0;
        if (total > 50000) {
            diskon = total * 0.1; // diskon 10%
            System.out.println("\nSelamat! Anda mendapat diskon 10%");
        }
        
        double totalBayar = total - diskon;
        System.out.println("\n========== STRUK BELANJA ==========");
        System.out.println("Total harga sebelum diskon : Rp " + total);
        System.out.println("Diskon                     : Rp " + diskon);
        System.out.println("Total yang harus dibayar   : Rp " + totalBayar);
        
        System.out.print("\nMasukkan uang anda: Rp ");
        double bayar = input.nextDouble();
        
        double kembalian = bayar - totalBayar;
        if (kembalian < 0) {
            System.out.println("Uang anda kurang Rp " + Math.abs(kembalian));
        } else {
            System.out.println("Kembalian anda: Rp " + kembalian);
        }
        
        System.out.println("\nTerima kasih telah berbelanja di toko kami!");
        System.out.println("============================================");
        
        input.close();
    }
}
