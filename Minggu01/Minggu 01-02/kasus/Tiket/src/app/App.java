package app;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //var temporary
        int tempNoId = 0;
        String tempNama = "";
        String tempAlamat = "";
        int tempKodeTiket = 0;
        int tempHarga = 0;
        String tempTujuanTiket = "";
        int tempKodeTransaksi = 0;
        int tempBanyak = 0;

        //Proses menerima masukan
        System.out.println("======================================================");
        System.out.println("          Input data penjualan Tiket                  ");
        System.out.println("======================================================");
        System.out.print("Id Pelanggan : ");
        tempNoId = sc.nextInt();

        tempNama = sc.nextLine();
        System.out.print("Nama Pelanggan : ");
        tempNama = sc.nextLine();

        System.out.print("Alamat Pelanggan : ");
        tempAlamat = sc.nextLine();
        
        System.out.print("\nKode Tiket : ");
        tempKodeTiket = sc.nextInt();
        
        tempTujuanTiket = sc.nextLine();
        System.out.print("Tiket Tujuan : ");
        tempTujuanTiket = sc.nextLine();

        System.out.print("Harga Tiket : ");
        tempHarga = sc.nextInt();

        System.out.print("\nKode Transaksi : ");
        tempKodeTransaksi = sc.nextInt();

        System.out.print("Banyak Tiket : ");
        tempBanyak = sc.nextInt();

        //eksekusi
        Transaksi t = new Transaksi(tempNoId, tempNama, tempAlamat);
        t.setTiket(tempKodeTiket, tempTujuanTiket, tempHarga);
        t.setTransaksi(tempKodeTransaksi, tempBanyak);

        //output hasil masukan dan mengeluarkan total belanja
        t.cetakStruk();
    }

}