import java.util.Scanner;

/**
 * ProjectSistemMesinAtm
 */
public class SistemMesinATM7 {

    private static class Account {
        double saldoAwal; 
        int pin, nomorRekening;

        public Account(int pin, int nomorRekening, double saldoAwal){
            this.pin = pin;
            this.nomorRekening = nomorRekening;
            this.saldoAwal = saldoAwal;
        }

        }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Account[] accounts = {
            new Account(223344, 632453, 4000000.0),
    
        };

        System.out.print("Masukan PIN            : ");
        int pin = sc.nextInt();
        System.out.print("Masukan Nomor Rekening : ");
        int nomorRekening = sc.nextInt();
        Account currentAccount = null;

        for (Account account : accounts) {
            if (account.pin == pin && account.nomorRekening == nomorRekening) {
                currentAccount = account;
                break;
            }
        }

        if (currentAccount != null) {
            System.out.println("       SELAMAT DATANG");
            System.out.println("PILIH TRANSAKSI YANG DIINGINKAN");
            
            while (true) {
                System.out.println("Menu:");
                System.out.println("1. Cek Saldo");
                System.out.println("2. Tarik Tunai");
                System.out.println("3. Setor Tunai");
                System.out.println("4. Transfer");
                System.out.println("5. Keluar");
                System.out.print("Pilih menu (1/2/3/4/5): ");

                int pilihan = sc.nextInt();

                switch (pilihan) {
                    case 1:
                        System.out.println("Saldo Anda saat ini: " + currentAccount.saldoAwal);
                        break;
                    case 2:
                        System.out.print("Masukkan jumlah penarikan: ");
                        double tarikan = sc.nextDouble();
                        if (tarikan > currentAccount.saldoAwal) {
                            System.out.println("Saldo tidak mencukupi");
                        } else {
                            currentAccount.saldoAwal -= tarikan;
                            System.out.println("Penarikan berhasil. Saldo Anda sekarang: " + currentAccount.saldoAwal);
                        }
                        break;
                    case 3:
                        System.out.print("Masukkan jumlah setoran: ");
                        double setoran = sc.nextDouble();
                        currentAccount.saldoAwal += setoran;
                        System.out.println("Setoran berhasil. Saldo Anda sekarang: " + currentAccount.saldoAwal);
                        break;
                    case 4:
                        System.out.print("Masukkan nomor rekening tujuan: ");
                        sc.nextDouble();
                        System.out.print("Nominal transfer: ");
                        double transfer = sc.nextDouble();
                        if (currentAccount.saldoAwal <= transfer){
                        System.out.println("Transfer berhasil. Saldo Anda sekarang: " + currentAccount.saldoAwal);
                        } else {
                            System.out.println("Saldo Tidak mencukupi");
                        }
                        break;
                    case 5:
                        System.out.println("Terima kasih telah menggunakan ATM. Sampai jumpa!");
                        System.exit(0);
                    default:
                        System.out.println("Pilihan tidak valid. Silakan pilih menu yang benar.");
                
                }
      
            }
        } else {
            System.out.print("PIN ATAU NOMOR REKENING SALAH " + "\nANDA KELUAR DARI SISTEM");
        }
    sc.close();     
    }
}
