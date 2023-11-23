import java.util.Scanner;

public class SistemMesinATM7 {

    private static class Account {
        int saldoAwal; 
        int pin, nomorRekening;

        public Account(int pin, int nomorRekening, int saldoAwal){
            this.pin = pin;
            this.nomorRekening = nomorRekening;
            this.saldoAwal = saldoAwal;
        }

        }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Account[] accounts = {
            new Account(223344, 632453, 4000000),
            new Account(556677, 632672, 2300000),
            new Account(889911, 632649, 1000000)
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
                System.out.println("___________________________________");
                System.out.println("          Menu      ");
                System.out.println("1. Cek Saldo");
                System.out.println("2. Tarik Tunai");
                System.out.println("3. Setor Tunai");
                System.out.println("4. Transfer");
                System.out.println("5. Panduan Penggunaan");
                System.out.println("6. Laporan Permasalahan");
                System.out.println("7. Keluar");
                System.out.print("Pilih menu (1/2/3/4/5/6/7): ");

                int pilihan = sc.nextInt();

                switch (pilihan) {
                    case 1:
                        System.out.println("Saldo Anda saat ini: " + currentAccount.saldoAwal);
                        break;
                    case 2:
                        boolean jalurTidakTersedia=true;
                        while (jalurTidakTersedia){
                            System.out.println("Jalur Tarik Tunai");
                            System.out.println("1.ATM ");
                            System.out.println("2.Alfamaret");
                            System.out.println("3.Indomaret");
                            System.out.print("Pilih Jalur Penarikan Tunai : ");
                            int jalurPenarikan = sc.nextInt();
                            switch (jalurPenarikan){
                                case 1:
                                System.out.println("Anda akan melakukan transaksi melalui mesin ATM");
                                jalurTidakTersedia = false;
                                break;
                                case 2:
                                System.out.println("Anda akan melakukan transaksi melalui Alfamaret");
                                jalurTidakTersedia = false;
                                break;
                                case 3:
                                System.out.println("Anda akan melakukan transaksi melalui Indomaret");
                                jalurTidakTersedia = false;
                                break;
                                default:
                                System.out.println("Pilih jalur penarikan yang tersedia!!");
                            }
                        }
                        boolean jumlahTdkTersedia = true;
                        while( jumlahTdkTersedia){
                            System.out.println("Pilihan Nominal Penarikan");
                            System.out.println("1. Rp 10.000,00");
                            System.out.println("2. Rp 20.000,00");
                            System.out.println("3. Rp 50.000,00");
                            System.out.println("4. Rp 100.000,00");
                            System.out.println("5. Rp 200.000,00");
                            System.out.println("6. Rp 500.000,00");
                            System.out.println("7. Rp 1.000.000,00");
                            System.out.println("Pilih Nominal Penarikan(1/2/3/4/5/6/7) : ");
                            int jumlahTarikan = sc.nextInt();
                            switch (jumlahTarikan){
                                case 1:
                                currentAccount.saldoAwal -= 10000;
                                System.out.println("Penarikan berhasil. Saldo Anda sekarang: " + currentAccount.saldoAwal);
                                jumlahTdkTersedia = false;
                                break;
                                case 2:
                                currentAccount.saldoAwal -= 20000;
                                System.out.println("Penarikan berhasil. Saldo Anda sekarang: " + currentAccount.saldoAwal);
                                jumlahTdkTersedia = false;
                                break;
                                case 3:
                                currentAccount.saldoAwal -= 50000;
                                System.out.println("Penarikan berhasil. Saldo Anda sekarang: " + currentAccount.saldoAwal);
                                jumlahTdkTersedia = false;
                                break;
                                case 4:
                                currentAccount.saldoAwal -= 100000;
                                System.out.println("Penarikan berhasil. Saldo Anda sekarang: " + currentAccount.saldoAwal);
                                jumlahTdkTersedia = false;
                                break;
                                case 5:
                                currentAccount.saldoAwal -= 200000;
                                System.out.println("Penarikan berhasil. Saldo Anda sekarang: " + currentAccount.saldoAwal);
                                jumlahTdkTersedia = false;
                                break;
                                case 6:
                                currentAccount.saldoAwal -= 500000;
                                System.out.println("Penarikan berhasil. Saldo Anda sekarang: " + currentAccount.saldoAwal);
                                jumlahTdkTersedia = false;
                                break;
                                case 7:
                                currentAccount.saldoAwal -= 1000000;
                                System.out.println("Penarikan berhasil. Saldo Anda sekarang: " + currentAccount.saldoAwal);
                                jumlahTdkTersedia = false;
                                break;
                                default:
                                System.out.println("Nominal Penarikan Tidak tersedia!!");
                            }
                        }
                    break;
                        
                    case 3:
                        System.out.print("Masukkan jumlah setoran: ");
                        int setoran = sc.nextInt();
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
                        System.out.println("     PANDUAN PENGGUNAAN MESIN ATM     ");
                    case 6:
                        System.out.println("Permasalahan Apa yang Anda Alami :");
                    case 7:
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
