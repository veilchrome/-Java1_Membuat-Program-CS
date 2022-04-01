package Berlatih_java;

import java.util.Scanner;

public class CleaningService{
    public static void main(String[] args) { 
    String pilih,nama,kend,notelp,np,merk;
    double jumlah,harga,uang,kembalian,paket1mtr,paket1mbl,paket2mtr,paket2mbl;
 

        Scanner keyboard = new Scanner(System.in); //scanner

     System.out.print("=============CUCI STEAM MOTOR MOBIL===============\n"
                        +"==================================================\n"
                        +"==============Daftar Paket Steam =================\n"
                        +"1.Paket (1) Cuci,Semir Ban,Poles Body \n"
                        +"2.Paket (2) Cuci + Semir Ban\n" 
                        +"==================================================\n"
                        +"=================Harga Paket Di atas==============\n"
                        +"Harga Paket (1) Mobil(Rp1.200.000) Motor(Rp350.000)\n"
                        +"Harga Paket (2) Mobil(Rp60.000) Motor(Rp20.000)\n" 
                        +"==================================================\n"
                        +"Masukan Pilihan Paket Anda [1/2]\n"
                        +"==================================================\n");
                pilih = keyboard.nextLine();
                System.out.print("Jenis Kendaraan Motor/Mobil :\t\n"); 
                kend = keyboard.nextLine();
     switch (pilih) {
    case "1":
    System.out.print("Nama Pelanggan    :\t");
    nama = keyboard.nextLine();
    System.out.print("NO.Telphone       :\t");
    notelp = keyboard.nextLine();
    System.out.print("Nomer Plat Kendaraan :\t");
    np = keyboard.nextLine();
    System.out.print("Merek Kendaraan :\t");
    merk = keyboard.nextLine();
        paket1mtr = 350000;
        paket1mbl = 1200000;
        if("mobil".equals(kend)) 
       { 
        System.out.print("Masukan Jumlah Kendaraan Yang Ingin Dicuci :");
        jumlah = keyboard.nextInt();   
        System.out.println("Total Harga Yang Dikeluarkan Adalah :"+jumlah*paket1mbl);  //masih eror di output ini  jumlah * paket1mbl 
        System.out.print("Uang Yang Harus Dibayarkan : \t"); //hasil uang kembalian yang ngaco kalau di (+paket1mbl *jumlah)
        uang = keyboard.nextInt();
        kembalian = uang - (jumlah*paket1mbl);
        System.out.print("Kembalian Anda Adalah :"+kembalian);   
        break;
        }
        else if("motor".equals(kend))
        {
        System.out.print("Masukan Jumlah Kendaraan Yang Ingin Dicuci :");
        jumlah = keyboard.nextDouble(); 
        System.out.println("Total Harga Yang Dikeluarkan Adalah:"+jumlah*paket1mtr);
        System.out.print("Uang Yang Harus Dibayarkan : \t");
        uang = keyboard.nextDouble();
        kembalian = uang - (jumlah*paket1mtr);
        System.out.print("Kembalian Anda Adalah :"+kembalian);
       } 
       
       break;
    case "2":
    System.out.print("Nama Pelanggan    :\t");
    nama = keyboard.nextLine();
    System.out.print("NO.Telphone       :\t");
    notelp = keyboard.nextLine();
    System.out.print("Nomer Plat Kendaraan :\t");
    np = keyboard.nextLine();
    System.out.print("Merek Kendaraan :\t");
    merk = keyboard.nextLine();
        paket2mtr = 20000;
        paket2mbl = 60000;
        if("mobil".equals(kend)) 
       { 
        System.out.print("Masukan Jumlah Kendaraan Yang Ingin Dicuci :");
        jumlah = keyboard.nextInt();   
        System.out.println("Total Harga Yang Dikeluarkan Adalah :"+jumlah*paket2mbl);
        System.out.print("Uang Yang Harus Dibayarkan : \t");
        uang = keyboard.nextInt();
        kembalian = uang - (jumlah*paket2mbl);
        System.out.print("Kembalian Anda Adalah :"+kembalian);   
        break;
        }
        else if("motor".equals(kend))
        {
         System.out.print("Masukan Jumlah Kendaraan Yang Ingin Dicuci :");
        jumlah = keyboard.nextInt();   
        System.out.println("Total Harga Yang Dikeluarkan Adalah :"+jumlah*paket2mtr);
        System.out.print("Uang Yang Harus Dibayarkan : \t");
        uang = keyboard.nextInt();
        kembalian = uang - (jumlah*paket2mtr);
        System.out.print("Kembalian Anda Adalah :"+kembalian);      
       } 
       break;
       }
       };

}

