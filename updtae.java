import java.util.Scanner;

public class updtae {
    private static class Account {
        int accountNumber;
        int pin;
        double balance;

        public Account(int accountNumber, int pin, double balance) {
            this.accountNumber = accountNumber;
            this.pin = pin;
            this.balance = balance;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Account[] accounts = {
            new Account(123456, 1111, 1000.0),
            new Account(789012, 2222, 2000.0),
            new Account(345678, 3333, 3000.0)
        };

        System.out.print("Masukkan nomor akun: ");
        int accountNumber = scanner.nextInt();
        System.out.print("Masukkan PIN: ");
        int pin = scanner.nextInt();

        Account currentAccount = null;
        for (Account account : accounts) {
            if (account.accountNumber == accountNumber && account.pin == pin) {
                currentAccount = account;
                break;
            }
        }

        if (currentAccount != null) {
            System.out.println("Selamat datang, Akun " + currentAccount.accountNumber);
            System.out.println("Saldo saat ini: $" + currentAccount.balance);
            // Tambahkan logika transaksi ATM di sini
        } else {
            System.out.println("Nomor akun atau PIN salah. Akses ditolak.");
        }

        scanner.close();
    }
}