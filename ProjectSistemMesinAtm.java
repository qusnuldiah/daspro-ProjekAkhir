import java.util.Scanner;

/**
 * ProjectSistemMesinAtm
 */
public class ProjectSistemMesinAtm {

    
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double saldoAwal = 1000000.0; // Saldo awal yang dimulai

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Cek Saldo");
            System.out.println("2. Tarik Tunai");
            System.out.println("3. Setor Tunai");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu (1/2/3/4): ");

            int pilihan = sc.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.println("Saldo Anda saat ini: " + saldoAwal);
                    break;
                case 2:
                    System.out.print("Masukkan jumlah penarikan: ");
                    double tarikan = sc.nextDouble();
                    if (tarikan > saldoAwal) {
                        System.out.println("Saldo tidak mencukupi");
                    } else {
                        saldoAwal -= tarikan;
                        System.out.println("Penarikan berhasil. Saldo Anda sekarang: " + saldoAwal);
                    }
                    break;
                case 3:
                    System.out.print("Masukkan jumlah setoran: ");
                    double setoran = sc.nextDouble();
                    saldoAwal += setoran;
                    System.out.println("Setoran berhasil. Saldo Anda sekarang: " + saldoAwal);
                    break;
                case 4:
                    System.out.println("Terima kasih telah menggunakan ATM. Sampai jumpa!");
                    System.exit(0);
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih menu yang benar.");
            sc.close();
                }
            
            }
    }
}
