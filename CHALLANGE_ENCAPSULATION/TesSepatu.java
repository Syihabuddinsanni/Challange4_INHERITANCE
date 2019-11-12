package CHALLANGE_ENCAPSULATION;

import java.util.Scanner;

public class TesSepatu extends EncapSepatu {

    public static void main(String[] args) {

        int pilih;
        int p;
        int merk, jenis, kategori, harga, size, warna;
        int total;
        String pembeli;
        int plh;
        String Yg;
        boolean running = true;
        int counter = 0;

        Scanner hab = new Scanner(System.in);
        TesSepatu kuda = new TesSepatu();
        System.err.print("1 + 1 - 1 : ");
        pilih = hab.nextInt();
        if (pilih == 99);
        System.out.println("       _____\n" +
"  ║▒▒▒▒▒▒▒▒▒▒║\n" +
"  ║▒▒▒▒▒▒▒▒▒▒║\n" +
"  ║▒▒▒▒▒▒▒▒▒▒║  \n" +
" ╔════════════╗                        \n" +
" ╚════════════╝ \n" +
"  ║██████████╚╗ \n" +
"  ║██╔══╗█╔═╗█║ \n" +
"  ║██║╬╔╝█╚╗║█║ \n" +
"  ║██╚═╝█║█╚╝█║ Isi Dengan Benar _\n" +
"  ╚╗█████████═╝\n" +
"   ╚╗║╠╩╩╩╩╩╝\n" +
"    ║║┈┈┈█▐█████▒.｡oO\n" +
"    ║██╠╦╦╦╗\n" +
"    ╚╗██████ Author:Mr.Sh3Hub\n" +
"     ╚════╝Team:Moklet Mengantuk\n" +
" <════════════════X═════════════════> \n" +
"        ___________________________________________\n" +
"        |  ________________________________________/      \n" +
"        | |___ | | | ||_  |  | | | || | | || _ |\n" +
"        |___  || |_| | / /__ | |_| || | | ||  _|  \n" +
"         ___| ||  _  ||_   / |  _  || |_| || _  |\n" +
"        \\_____||_| |_|/  / ()|_| |_||___  ||___/\n" +
"                      \\/                \\/");
        System.out.print("MASUKAN NAMA PEMBELI : ");
        pembeli = hab.next();
        while (running) {
            switch (pilih) {
                default:
                    System.out.println("Ulangi Re Chapta!");
                    break;
                case 1:

                    if (pilih == 1);

                    kuda.setHarga("     \t╔══════════════════════════╗\n"
                            + "\t║         \t  -HARGA-    \t               ║\n"
                            + "\t║    [1] 910\t\t=Rp. 200,000.00        ║\n"
                            + "\t║    [2] ADIDAS\t\t=Rp. 300,000.00        ║\n"
                            + "\t║    [3] NIKE\t\t=Rp. 400,000.00        ║\n"
                            + "\t║    [4] SKECHERS\t=Rp. 500,000.00        ║\n"
                            + "\t║    [5] PUMA \t\t=Rp. 600,000.00        ║\n"
                            + "\t║    [6] REBOOK\t\t=Rp. 700,000.00        ║\n"
                            + "\t║    [7] VANS\t\t=Rp. 800,000.00        ║\n"
                            + "\t║    [8] FILA\t\t=Rp. 900,000.00        ║\n"
                            + "\t║                                             ║\n"
                            + "\t╚══════════════════════════╝");
                    System.out.println("\n\t\t == LIST HARGA ==\n" + kuda.getHarga());

                    System.out.println("\t╔═════════════════╗\n"
                            + "\t║      Beli 2 Diskon 50k      ║ \n"
                            + "\t║      Beli 3 Diskon 100k     ║\n"
                            + "\t║          Wenak Toh :)       ║\n"
                            + "\t╚═════════════════╝");
                    System.out.print("NOTE : BACA LIST HARGA DENGAN TELITI!");
                    kuda.setMerk("\n [1] 910 \n [2] ADIDAS \n [3] NIKE \n [4] SKECHERS \n [5] PUMA \n [6] REEBOK \n [7] VANS "
                            + "\n [8]FILA \n ");

                    System.out.println("Merk    : " + kuda.getMerk());
                    System.out.println("╔═════════════════╗\n"
                            + "║      JAYA BARU SPORTS       ║\n"
                            + "╚═════════════════╝");

                    System.out.print("Pilih sepatu apa ? ");
                    merk = hab.nextInt();

                    if (merk == merk);
                    System.out.println("============= JAYA LAMA SPORTS ============");
                    kuda.setJenis("[1] Cowok\n[2] Cewek");
                    System.out.println("\n --- Jenis ---\n" + kuda.getJenis()); //JENIS
                    System.out.print("Masukan Di sini : ");
                    kategori = hab.nextInt();
                    if (kategori == kategori) {
                        System.out.println("============= JAYA LAMA SPORTS ============");
                        System.out.println("\tCOWOK");
                        kuda.setKategori(" [1] Olahraga \n [2] Lari \n [3] Santuy \n [4] Kantoran");
                        System.out.println("\n --- KATEGORI ---\n" + kuda.getKategori()); //KATEGORI
                        System.out.print("Masukan Pilihan Anda : ");
                        size = hab.nextInt();
                        if (size == size);
                        System.out.println("============= JAYA LAMA SPORTS ============");

                        kuda.setUkuran("╔═════════════════╗\n"
                                + "║   TERSEDIA UKURAN 21 - 34    ║\n"
                                + "╚═════════════════╝");
                        System.out.println("\n --- Ukuran ---\n" + kuda.getUkuran()); //UKURAN
                        System.out.print("Masukan Ukuran Sepatu : ");
                        warna = hab.nextInt();

                        if (warna == warna);
                        System.out.println("============= JAYA LAMA SPORTS ============");
                        kuda.setWarna("[1] Black\n[2] White \n[3] Gold \n[4] Silver \n[5] Orange \n[6] Green"
                                + "\n[7] Yellow \n[8] Blue \n[9] Red");
                        System.out.println("\n --- WARNA ---\n" + kuda.getWarna()); //WARNA
                        System.out.print("Masukan Warna Pilihan : ");
                        harga = hab.nextInt();

                        System.out.println("\t\t-- STRUK BELANJAAN --");
                        System.out.println("\n"
                                + "|                  JAYA LAMA SPORTS                |\n"
                                + "|      Menjual Berbagai Macam Sepatu Original      |\n"
                                + "|           JL. MOBAL KABEH WES RT 01 RW 07        |\n"
                                + "|              MALANG JAWA TIMUR IBU KOTA          |\n"
                                + "|==================================================|\n"
                                + "|KASIR             : BAMBANK SUJARWO TEJO          |\n"
                                + "|Tanggal pembelian : 21 Januari 2020               |\n"
                                + "|Kode Pembelian    : S374ND K4MU                   |\n"
                                + "==================================================");

                        /*  switch (merk){
                         case 1 :
                             //merk 1
                                if (merk == 1);
                                System.out.println("MERK\t: 910");
                              
                         */
                        if (merk == 1) {
                            System.out.println("MERK\t: 910");
                        }
                        if (merk == 2) {
                            System.out.println("MERK\t: ADIDAS");
                        }
                        if (merk == 3) {
                            System.out.println("MERK\t: NIKE");
                        }
                        if (merk == 4) {
                            System.out.println("MERK\t: SKECHERS");
                        }
                        if (merk == 5) {
                            System.out.println("MERK\t: PUMA");
                        }
                        if (merk == 6) {
                            System.out.println("MERK\t: REBOOK");
                        }
                        if (merk == 7) {
                            System.out.println("MERK\t: VANS");
                        }
                        if (merk == 8) {
                            System.out.println("MERK\t: FILA");
                        }
                        System.out.println("Maaf Pilihan Ilegal");

                        if (kategori == 1) {
                            System.out.println("JENIS\t: Cowok");
                        }
                        if (kategori == 2) {
                            System.out.println("JENIS\t: Cewek");
                        }
                        //Kategori
                        if (size == 1) {
                            System.out.println("KATEGORI : Olahraga");
                        }
                        if (size == 2) {
                            System.out.println("KATEGORI : Lari");
                        }
                        if (size == 3) {
                            System.out.println("KATEGORI : Santuy");
                        }
                        if (size == 4) {
                            System.out.println("KATEGORI : Kantoran");
                        }

                        //Ukuran
                        if (warna == 21) {
                            System.out.println("WARNA\t: 21");
                        }

                        if (warna == 22) {
                            System.out.println("UKURAN\t: 22");
                        }

                        if (warna == 23) {
                            System.out.println("UKURAN\t: 23");
                        }

                        if (warna == 24) {
                            System.out.println("UKURAN\t: 24");
                        }

                        if (warna == 25) {
                            System.out.println("UKURAN\t: 25");
                        }

                        if (warna == 26) {
                            System.out.println("UKURAN\t: 26");
                        }

                        if (warna == 27) {
                            System.out.println("UKURAN\t: 27");
                        }

                        if (warna == 28) {
                            System.out.println("UKURAN\t: 28");
                        }

                        if (warna == 29) {
                            System.out.println("UKURAN\t: 29");
                        }

                        if (warna == 30) {
                            System.out.println("UKURAN\t: 30");
                        }

                        if (warna == 31) {
                            System.out.println("UKURAN\t: 31");
                        }
                        //Warna
                        if (harga == 1) {
                            System.out.println("WARNA\t: Black");
                        }
                        if (harga == 2) {
                            System.out.println("WARNA\t: White");
                        }
                        if (harga == 3) {
                            System.out.println("WARNA\t: Gold");
                        }
                        if (harga == 4) {
                            System.out.println("WARNA\t: Silver");
                        }
                        if (harga == 5) {
                            System.out.println("WARNA\t: Orange");
                        }
                        if (harga == 6) {
                            System.out.println("WARNA:\t: Green");
                        }
                        if (harga == 7) {
                            System.out.println("WARNA\t: YELLOW");
                        }
                        if (harga == 8) {
                            System.out.println("WARNA\t: BLUE");
                        }
                        if (harga == 9) {
                            System.out.println("WARA\t: RED");
                        }
                        System.out.print("Masukan Jumlah pembelian (MAX3) : ");
                        int beli;
                        beli = hab.nextInt();

                        //Deklarasi
                        int sembilansepuluh = 200000; // 1
                        int adidas = 300000; // 2
                        int nike = 400000; // 3
                        int puma = 500000; // 4
                        int skechers = 600000; // 5
                        int rebook = 700000;
                        int vans = 800000;
                        int fila = 900000;

                        switch (merk) {
                            case 1:
                                if (merk == 1);       //910                   

                                if (beli == 1) {
                                    System.out.println("\t======== 910 ========");

                                    System.out.println(" Harga Barang    :Rp " + sembilansepuluh);

                                    System.out.println(" ===========================================================");
                                    System.out.println(String.format("\n Total                                      =Rp " + sembilansepuluh));
                                    System.out.println(String.format(" Diskon                                     =Rp -"));
                                    System.out.println(String.format(" Total Pembayaran                           =Rp " + sembilansepuluh));
                                    break;
                                }

                                if (beli == 2) {
                                    int diskon = 50000;
                                    int td = (sembilansepuluh - diskon);
                                    System.out.println(" Harga Barang    :Rp " + sembilansepuluh);

                                    System.out.println(" ===========================================================");
                                    System.out.println(String.format("\n Total                                      =Rp " + sembilansepuluh));
                                    System.out.println(String.format(" Diskon                                     =Rp " + diskon));
                                    System.out.println(String.format(" Total Pembayaran                           =Rp " + td));
                                    break;
                                }

                                if (beli == 3) {

                                    int Diskon = 100000;
                                    int Td = (sembilansepuluh - Diskon);

                                    System.out.println(" Harga Barang    :Rp " + sembilansepuluh);

                                    System.out.println(" ===========================================================");
                                    System.out.println(String.format("\n Total                                      =Rp " + sembilansepuluh));
                                    System.out.println(String.format(" Diskon                                     =Rp " + Diskon));
                                    System.out.println(String.format(" Total Pembayaran                           =Rp " + Td));
                                    break;
                                }

                            case 2:
                                if (merk == 2); //adidas
                                if (beli == 1) {
                                    System.out.println("\t======== ADIDAS ========");

                                    System.out.println(" Harga Barang    :Rp " + adidas);

                                    System.out.println(" ===========================================================");
                                    System.out.println(String.format("\n Total                                      =Rp " + adidas));
                                    System.out.println(String.format(" Diskon                                     =Rp -"));
                                    System.out.println(String.format(" Total Pembayaran                           =Rp " + adidas));
                                    break;
                                }

                                if (beli == 2) {
                                    int diskon = 50000;
                                    int td = (adidas - diskon);
                                    System.out.println(" Harga Barang    :Rp " + adidas);

                                    System.out.println(" ===========================================================");
                                    System.out.println(String.format("\n Total                                      =Rp " + adidas));
                                    System.out.println(String.format(" Diskon                                     =Rp " + diskon));
                                    System.out.println(String.format(" Total Pembayaran                           =Rp " + td));
                                    break;
                                }

                                if (beli == 3) {

                                    int Diskon = 100000;
                                    int Td = (adidas - Diskon);

                                    System.out.println(" Harga Barang    :Rp " + adidas);

                                    System.out.println(" ===========================================================");
                                    System.out.println(String.format("\n Total                                      =Rp " + adidas));
                                    System.out.println(String.format(" Diskon                                     =Rp " + Diskon));
                                    System.out.println(String.format(" Total Pembayaran                           =Rp " + Td));
                                    break;
                                }
                            case 3:
                                if (merk == 3); //nike

                                if (beli == 1) {
                                    System.out.println("\t======== NIKE ========");

                                    System.out.println(" Harga Barang    :Rp " + nike);

                                    System.out.println(" ===========================================================");
                                    System.out.println(String.format("\n Total                                      =Rp " + nike));
                                    System.out.println(String.format(" Diskon                                     =Rp -"));
                                    System.out.println(String.format(" Total Pembayaran                           =Rp " + nike));
                                    break;
                                }

                                if (beli == 2) {
                                    int diskon = 50000;
                                    int td = (nike - diskon);
                                    System.out.println(" Harga Barang    :Rp " + nike);

                                    System.out.println(" ===========================================================");
                                    System.out.println(String.format("\n Total                                      =Rp " + nike));
                                    System.out.println(String.format(" Diskon                                     =Rp " + diskon));
                                    System.out.println(String.format(" Total Pembayaran                           =Rp " + td));
                                    break;
                                }

                                if (beli == 3) {

                                    int Diskon = 100000;
                                    int Td = (nike - Diskon);

                                    System.out.println(" Harga Barang    :Rp " + nike);

                                    System.out.println(" ===========================================================");
                                    System.out.println(String.format("\n Total                                      =Rp " + nike));
                                    System.out.println(String.format(" Diskon                                     =Rp " + Diskon));
                                    System.out.println(String.format(" Total Pembayaran                           =Rp " + Td));
                                    break;
                                }
                            case 4:
                                if (merk == 4); //Puma

                                if (beli == 1) {
                                    System.out.println("\t======== PUMA ========");

                                    System.out.println(" Harga Barang    :Rp " + puma);

                                    System.out.println(" ===========================================================");
                                    System.out.println(String.format("\n Total                                      =Rp " + puma));
                                    System.out.println(String.format(" Diskon                                     =Rp -"));
                                    System.out.println(String.format(" Total Pembayaran                           =Rp " + puma));
                                    break;
                                }

                                if (beli == 2) {
                                    int diskon = 50000;
                                    int td = (puma - diskon);
                                    System.out.println(" Harga Barang    :Rp " + puma);

                                    System.out.println(" ===========================================================");
                                    System.out.println(String.format("\n Total                                      =Rp " + puma));
                                    System.out.println(String.format(" Diskon                                     =Rp " + diskon));
                                    System.out.println(String.format(" Total Pembayaran                           =Rp " + td));
                                    break;
                                }

                                if (beli == 3) {

                                    int Diskon = 100000;
                                    int Td = (puma - Diskon);

                                    System.out.println(" Harga Barang    :Rp " + puma);

                                    System.out.println(" ===========================================================");
                                    System.out.println(String.format("\n Total                                      =Rp " + puma));
                                    System.out.println(String.format(" Diskon                                     =Rp " + Diskon));
                                    System.out.println(String.format(" Total Pembayaran                           =Rp " + Td));
                                    break;
                                }
                            case 5:
                                if (merk == 5); // SKEECHERS
                                if (beli == 1) {
                                    System.out.println("\t======== SKECHERS ========");

                                    System.out.println(" Harga Barang    :Rp " + skechers);

                                    System.out.println(" ===========================================================");
                                    System.out.println(String.format("\n Total                                      =Rp " + skechers));
                                    System.out.println(String.format(" Diskon                                     =Rp -"));
                                    System.out.println(String.format(" Total Pembayaran                           =Rp " + skechers));
                                    break;
                                }

                                if (beli == 2) {
                                    int diskon = 50000;
                                    int td = (skechers - diskon);
                                    System.out.println(" Harga Barang    :Rp " + skechers);

                                    System.out.println(" ===========================================================");
                                    System.out.println(String.format("\n Total                                      =Rp " + skechers));
                                    System.out.println(String.format(" Diskon                                     =Rp " + diskon));
                                    System.out.println(String.format(" Total Pembayaran                           =Rp " + td));
                                    break;
                                }

                                if (beli == 3) {

                                    int Diskon = 100000;
                                    int Td = (skechers - Diskon);

                                    System.out.println(" Harga Barang    :Rp " + skechers);

                                    System.out.println(" ===========================================================");
                                    System.out.println(String.format("\n Total                                      =Rp " + skechers));
                                    System.out.println(String.format(" Diskon                                     =Rp " + Diskon));
                                    System.out.println(String.format(" Total Pembayaran                           =Rp " + Td));
                                    break;
                                }
                            case 6:
                                if (merk == 6); //REBOOK
                                if (beli == 1) {
                                    System.out.println("\t======== REBOOK ========");

                                    System.out.println(" Harga Barang    :Rp " + rebook);

                                    System.out.println(" ===========================================================");
                                    System.out.println(String.format("\n Total                                      =Rp " + rebook));
                                    System.out.println(String.format(" Diskon                                     =Rp -"));
                                    System.out.println(String.format(" Total Pembayaran                           =Rp " + rebook));
                                    break;
                                }

                                if (beli == 2) {
                                    int diskon = 50000;
                                    int td = (rebook - diskon);
                                    System.out.println(" Harga Barang    :Rp " + rebook);

                                    System.out.println(" ===========================================================");
                                    System.out.println(String.format("\n Total                                      =Rp " + rebook));
                                    System.out.println(String.format(" Diskon                                     =Rp " + diskon));
                                    System.out.println(String.format(" Total Pembayaran                           =Rp " + td));
                                    break;
                                }

                                if (beli == 3) {

                                    int Diskon = 100000;
                                    int Td = (rebook - Diskon);

                                    System.out.println(" Harga Barang    :Rp " + rebook);

                                    System.out.println(" ===========================================================");
                                    System.out.println(String.format("\n Total                                      =Rp " + rebook));
                                    System.out.println(String.format(" Diskon                                     =Rp " + Diskon));
                                    System.out.println(String.format(" Total Pembayaran                           =Rp " + Td));
                                    break;

                                }
                            case 7:
                                if (merk == 7); //VANS
                                if (beli == 1) {
                                    System.out.println("\t======== VANS ========");

                                    System.out.println(" Harga Barang    :Rp " + vans);

                                    System.out.println(" ===========================================================");
                                    System.out.println(String.format("\n Total                                      =Rp " + vans));
                                    System.out.println(String.format(" Diskon                                     =Rp -"));
                                    System.out.println(String.format(" Total Pembayaran                           =Rp " + vans));
                                    break;
                                }

                                if (beli == 2) {
                                    int diskon = 50000;
                                    int td = (vans - diskon);
                                    System.out.println(" Harga Barang    :Rp " + vans);

                                    System.out.println(" ===========================================================");
                                    System.out.println(String.format("\n Total                                      =Rp " + vans));
                                    System.out.println(String.format(" Diskon                                     =Rp " + diskon));
                                    System.out.println(String.format(" Total Pembayaran                           =Rp " + td));
                                    break;
                                }

                                if (beli == 3) {

                                    int Diskon = 100000;
                                    int Td = (vans - Diskon);

                                    System.out.println(" Harga Barang    :Rp " + vans);

                                    System.out.println(" ===========================================================");
                                    System.out.println(String.format("\n Total                                      =Rp " + vans));
                                    System.out.println(String.format(" Diskon                                     =Rp " + Diskon));
                                    System.out.println(String.format(" Total Pembayaran                           =Rp " + Td));
                                    break;
                                }
                            case 8:
                                if (merk == 8); //FILA
                                if (beli == 1) {
                                    System.out.println("\t======== FILA ========");

                                    System.out.println(" Harga Barang    :Rp " + fila);

                                    System.out.println(" ===========================================================");
                                    System.out.println(String.format("\n Total                                      =Rp " + fila));
                                    System.out.println(String.format(" Diskon                                     =Rp -"));
                                    System.out.println(String.format(" Total Pembayaran                           =Rp " + fila));
                                    break;
                                }

                                if (beli == 2) {
                                    int diskon = 50000;
                                    int td = (fila - diskon);
                                    System.out.println(" Harga Barang    :Rp " + fila);

                                    System.out.println(" ===========================================================");
                                    System.out.println(String.format("\n Total                                      =Rp " + fila));
                                    System.out.println(String.format(" Diskon                                     =Rp " + diskon));
                                    System.out.println(String.format(" Total Pembayaran                           =Rp " + td));
                                    break;
                                }

                                if (beli == 3) {

                                    int Diskon = 100000;
                                    int Td = (fila - Diskon);

                                    System.out.println(" Harga Barang    :Rp " + fila);

                                    System.out.println(" ===========================================================");
                                    System.out.println(String.format("\n Total                                      =Rp " + fila));
                                    System.out.println(String.format(" Diskon                                     =Rp " + Diskon));
                                    System.out.println(String.format(" Total Pembayaran                           =Rp " + Td));
                                    break;
                                }
                            default:
                                System.out.println("╔════════════════════╗\n"
                                        + "║      MAAF PEMBELIAN MAX 3         ║\n"
                                        + "╚════════════════════╝");

                        }
                        System.out.println("\n");
                        System.out.println("Apakah anda Yakin ?");
                        System.out.print("Jawab [ya/gak]> ");

                        Yg = hab.next();

                        // cek jawabnnya, kalau ya maka berhenti mengulang
                        if (Yg.equalsIgnoreCase("ya")) {
                            running = false;
                            System.out.print("  ============================================================== \n" +
"    =                       TERIMAKASIH                         =\n" +
"    =                TELAH MENGGUNAKAN PROGRAM                  =\n" +
"    =                          KAMI                             =\n" +
"    =============================================================");

                            System.out.println("\n");

                        }
                        counter++;
                    }
            }
        }
    }
}
/*
    ============================================================== 
    =                       TERIMAKASIH                         =
    =                TELAH MENGGUNAKAN PROGRAM                  =
    =                          KAMI                             =
    =============================================================

*/
/*
╔════════════════════╗
║      !KESALAHAN INPUT           ║
╚════════════════════╝
 */
// case 2
/*case 2 :
                                if (merk == 2)
                                    System.out.println("MERK\t: ADIDAS");
                                int adidas = 300000;
                                 if (kategori == 1) {
                                    System.out.println("JENIS\t: Cowok");
                                }
                                if (kategori == 2) {
                                    System.out.println("JENIS\t: Cewek");
                                }
                                //Kategori
                                if (size == 1) {
                                    System.out.println("KATEGORI : Olahraga");
                                }
                                if (size == 2) {
                                    System.out.println("KATEGORI : Lari");
                                }
                                if (size == 3) {
                                    System.out.println("KATEGORI : Santuy");
                                }
                                if (size == 4) {
                                    System.out.println("KATEGORI : Kantoran");
                                }

                                //Ukuran
                                if (warna == 21) {
                                    System.out.println("WARNA\t: 21");
                                }

                                if (warna == 22) {
                                    System.out.println("UKURAN\t: 22");
                                }

                                if (warna == 23) {
                                    System.out.println("UKURAN\t: 23");
                                }

                                if (warna == 24) {
                                    System.out.println("UKURAN\t: 24");
                                }

                                if (warna == 25) {
                                    System.out.println("UKURAN\t: 25");
                                }

                                if (warna == 26) {
                                    System.out.println("UKURAN\t: 26");
                                }

                                if (warna == 27) {
                                    System.out.println("UKURAN\t: 27");
                                }

                                if (warna == 28) {
                                    System.out.println("UKURAN\t: 28");
                                }

                                if (warna == 29) {
                                    System.out.println("UKURAN\t: 29");
                                }

                                if (warna == 30) {
                                    System.out.println("UKURAN\t: 30");
                                }

                                if (warna == 31) {
                                    System.out.println("UKURAN\t: 31");
                                }
                                //Warna
                                if (harga == 1) {
                                    System.out.println("WARNA\t: Black");
                                }
                                if (harga == 2) {
                                    System.out.println("WARNA\t: White");
                                }
                                if (harga == 3) {
                                    System.out.println("WARNA\t: Gold");
                                }
                                if (harga == 4) {
                                    System.out.println("WARNA\t: Silver");
                                }
                                if (harga == 5) {
                                    System.out.println("WARNA\t: Orange");
                                }
                                if (harga == 6) {
                                    System.out.println("WARNA:\t: Green");
                                }
                                if (harga == 7) {
                                    System.out.println("WARNA\t: YELLOW");
                                }
                                if (harga == 8) {
                                    System.out.println("WARNA\t: BLUE");
                                }
                                if (harga == 9) {
                                    System.out.println("WARA\t: RED");
                                }
                                System.out.print("Masukan Jumlah pembelian (MAX3) : ");
                         
                                beli = hab.nextInt();
                                
                                switch (beli) {
                                    case 1:
                                        if (beli == 1) 
                                            System.out.println(" Harga Barang    :Rp " + adidas);
                                        
                                        System.out.println(" ===========================================================");
                                        System.out.println(String.format("\n Total                                      =Rp " + adidas));
                                        System.out.println(String.format(" Diskon                                     =Rp -"));
                                        System.out.println(String.format(" Total Pembayaran                           =Rp " + adidas));
                                        break;
                                    case 2: 
                                        int diskon = 50000;
                                        int td = (adidas - diskon);;
                                        if (beli == 2) 
                                   
                                   
                                    System.out.println(" Harga Barang    :Rp " + adidas);
                                    System.out.println(" ===========================================================");
                                    System.out.println(String.format("\n Total                                      =Rp " + adidas));
                                    System.out.println(String.format(" Diskon                                     =Rp "+diskon));
                                    System.out.println(String.format(" Total Pembayaran                           =Rp " + td));
                                    break;
                                    
                                    case 3: 
                                      
                                       int Diskon = 50000;
                                        int Td = (adidas - Diskon);;
                                        if (beli == 2) 
                                   
                                   
                                    System.out.println(" Harga Barang    :Rp " + adidas);
                                    System.out.println(" ===========================================================");
                                    System.out.println(String.format("\n Total                                      =Rp " + adidas));
                                    System.out.println(String.format(" Diskon                                     =Rp "+Diskon));
                                    System.out.println(String.format(" Total Pembayaran                           =Rp " + Td));
                                    break;
                               
                                
                                }
                                
                                
                                
                                
                                
                                
                                
                                
                                
                                
                                
                                
                                
                                if (merk == 3)
                                    int nike = 400000;
                                
                                    System.out.println("MERK\t: NIKE");
                                //Jenis
                                if (kategori == 1) {
                                    System.out.println("JENIS\t: Cowok");
                                }
                                if (kategori == 2) {
                                    System.out.println("JENIS\t: Cewek");
                                }
                                //Kategori
                                if (size == 1) {
                                    System.out.println("KATEGORI : Olahraga");
                                }
                                if (size == 2) {
                                    System.out.println("KATEGORI : Lari");
                                }
                                if (size == 3) {
                                    System.out.println("KATEGORI : Santuy");
                                }
                                if (size == 4) {
                                    System.out.println("KATEGORI : Kantoran");
                                }

                                //Ukuran
                                if (warna == 21) {
                                    System.out.println("WARNA\t: 21");
                                }

                                if (warna == 22) {
                                    System.out.println("UKURAN\t: 22");
                                }

                                if (warna == 23) {
                                    System.out.println("UKURAN\t: 23");
                                }

                                if (warna == 24) {
                                    System.out.println("UKURAN\t: 24");
                                }

                                if (warna == 25) {
                                    System.out.println("UKURAN\t: 25");
                                }

                                if (warna == 26) {
                                    System.out.println("UKURAN\t: 26");
                                }

                                if (warna == 27) {
                                    System.out.println("UKURAN\t: 27");
                                }

                                if (warna == 28) {
                                    System.out.println("UKURAN\t: 28");
                                }

                                if (warna == 29) {
                                    System.out.println("UKURAN\t: 29");
                                }

                                if (warna == 30) {
                                    System.out.println("UKURAN\t: 30");
                                }

                                if (warna == 31) {
                                    System.out.println("UKURAN\t: 31");
                                }
                                //Warna
                                if (harga == 1) {
                                    System.out.println("WARNA\t: Black");
                                }
                                if (harga == 2) {
                                    System.out.println("WARNA\t: White");
                                }
                                if (harga == 3) {
                                    System.out.println("WARNA\t: Gold");
                                }
                                if (harga == 4) {
                                    System.out.println("WARNA\t: Silver");
                                }
                                if (harga == 5) {
                                    System.out.println("WARNA\t: Orange");
                                }
                                if (harga == 6) {
                                    System.out.println("WARNA:\t: Green");
                                }
                                if (harga == 7) {
                                    System.out.println("WARNA\t: YELLOW");
                                }
                                if (harga == 8) {
                                    System.out.println("WARNA\t: BLUE");
                                }
                                if (harga == 9) {
                                    System.out.println("WARA\t: RED");
                                }
                                System.out.print("Masukan Jumlah pembelian (MAX3) : ");
                          
                                beli = hab.nextInt();
                                switch (beli) {
                                    case 1:
                                        if (beli == 1) 
                                            System.out.println(" Harga Barang    :Rp " + nike);
                                        
                                        System.out.println(" ===========================================================");
                                        System.out.println(String.format("\n Total                                      =Rp " + sembilansepuluh));
                                        System.out.println(String.format(" Diskon                                     =Rp -"));
                                        System.out.println(String.format(" Total Pembayaran                           =Rp " + sembilansepuluh));
                                        break;
                                    case 2: 
                                        int diskon = 50000;
                                        int td = (sembilansepuluh - diskon);;
                                        if (beli == 2) 
                                   
                                   
                                    System.out.println(" Harga Barang    :Rp " + sembilansepuluh);
                                    System.out.println(" ===========================================================");
                                    System.out.println(String.format("\n Total                                      =Rp " + sembilansepuluh));
                                    System.out.println(String.format(" Diskon                                     =Rp "+diskon));
                                    System.out.println(String.format(" Total Pembayaran                           =Rp " + td));
                                    break;
                                    
                                    case 3: 
                                      
                                       int Diskon = 50000;
                                        int Td = (sembilansepuluh - Diskon);;
                                        if (beli == 2) 
                                   
                                   
                                    System.out.println(" Harga Barang    :Rp " + sembilansepuluh);
                                    System.out.println(" ===========================================================");
                                    System.out.println(String.format("\n Total                                      =Rp " + sembilansepuluh));
                                    System.out.println(String.format(" Diskon                                     =Rp "+Diskon));
                                    System.out.println(String.format(" Total Pembayaran                           =Rp " + Td));
                                    break;
                                                                                                 

                       
                                if (merk == 2)
                                int adidas =  300000;
                                
                                    System.out.println("MERK\t: ADIDAS");
                                System.out.println("MERK\t: ADIDAS");
                                break;
                                

                        }

                        total = hab.nextInt();
                        System.out.println("Total\t\t:" + harga);
                        System.out.println(" ===========================================================");
                        System.out.println(String.format("\n Total                                      =Rp " + total));
                        System.out.println(String.format(" Diskon                                     =Rp -"));
                        System.out.println(String.format(" Total Pembayaran                           =Rp " + total));

                        break;
                    }//

            }
        }
    }
}

/*
                if (merk == merk); // MERK
                System.out.println("=========================");
                kuda.setJenis("[1] Cowok\n[2] Cewek");
                System.out.println("\n --- Jenis ---\n" + kuda.getJenis()); //JENIS
                System.out.print("Masukan Di sini : ");
                kategori = hab.next();
                if (kategori == kategori) {
                    System.out.println("\tCOWOK");
                    kuda.setKategori(" [1] Olahraga \n [2] Lari \n [3] Santuy \n [4] Kantoran");
                    System.out.println("\n --- KATEGORI ---\n" + kuda.getKategori()); //KATEGORI
                    System.out.print("Masukan Pilihan Anda : ");
                    size = hab.next();
                    if (size == size);

                    kuda.setUkuran("╔═════════════════╗\n"
                            + "║   TERSEDIA UKURAN 21 - 34    ║\n"
                            + "╚═════════════════╝");
                    System.out.println("\n --- Ukuran ---\n" + kuda.getUkuran()); //UKURAN
                    System.out.print("Masukan Ukuran Sepatu : ");
                    warna = hab.next();

                    if (warna == warna);
                    kuda.setWarna("[1] Black\n[2] White \n[3] Gold \n[4] Silver \n[5] Orange \n[6] Green"
                            + "\n[7] Yellow \n[8] Blue \n[9] Red");
                    System.out.println("\n --- WARNA ---\n" + kuda.getWarna()); //WARNA
                    System.out.print("Masukan Warna Pilihan : ");
                    harga = hab.next();

                    if (harga == harga);
                    kuda.setHarga("     \t╔═════════════════╗\n"
                            + "\t║           -HARGA-           ║\n"
                            + "\t║    [1]Rp. 200,000.00        ║\n"
                            + "\t║    [2]Rp. 300,000.00        ║\n"
                            + "\t║    [3]Rp. 400,000.00        ║\n"
                            + "\t║    [4]Rp. 500,000.00        ║\n"
                            + "\t║    [5]Rp. 600,000.00        ║\n"
                            + "\t║    [6]Rp. 700,000.00        ║\n"
                            + "\t║    [7]Rp. 800,000.00        ║\n"
                            + "\t║    [8]Rp. 900,000.00        ║\n"
                            + "\t║                             ║\n"
                            + "\t╚═════════════════╝");
                    System.out.println("\n\t\t == LIST HARGA ==\n" + kuda.getHarga());

                    System.out.println("\t╔═════════════════╗\n"
                            + "\t║      Beli 2 Diskon 50k      ║ \n"
                            + "\t║      Beli 3 Diskon 100k     ║\n"
                            + "\t║          Wenak Toh :)       ║\n"
                            + "\t╚═════════════════╝");
                    System.out.print("NOTE : BACA LIST HARGA DENGAN TELITI!");

                    System.out.println("\t\t-- STRUK BELANJAAN --");
                    System.out.println("\n"
                            + "|                  JAYA LAMA SPORTS                |\n"
                            + "|      Menjual Berbagai Macam Sepatu Original      |\n"
                            + "|           JL. MOBAL KABEH WES RT 01 RW 07        |\n"
                            + "|              MALANG JAWA TIMUR IBU KOTA          |\n"
                            + "|==================================================|\n"
                            + "|KASIR             : BAMBANK SUJARWO TEJO          |\n"
                            + "|Tanggal pembelian : 21 Januari 2020               |\n"
                            + "|Kode Pembelian    : S374ND K4MU                   |\n"
                            + "==================================================");

                    System.out.print("\n Jumlah Pembelian (MAX 3) : ");
                    int jb = hab.nextInt();
                    switch (jb) {
                        case 1:
                            if (jb == 1);
                            System.out.println("JUMLAH PEMBELIAN : 1");

                            System.out.println("MERK\t\t:" + merk);
                            System.out.println("JENIS\t\t:" + kategori);
                            System.out.println("KATEGORI\t:" + size);
                            System.out.println("UKURAN\t\t:" + warna);
                            System.out.println("WARNA\t\t:" + harga);
                            System.out.print(" Harga Barang    :Rp ");
                            total = hab.nextInt();
                            System.out.println("Total\t\t:" + harga);
                            System.out.println(" ===========================================================");
                            System.out.println(String.format("\n Total                                      =Rp " + total));
                            System.out.println(String.format(" Diskon                                     =Rp -"));
                            System.out.println(String.format(" Total Pembayaran                           =Rp " + total));

                            break;

                        case 2:
                            if (jb == 2);
                            System.out.println("JUMLAH PEMBELIAN : 2");
                            System.out.println("MERK\t\t:" + merk);
                            System.out.println("JENIS\t\t:" + kategori);
                            System.out.println("KATEGORI\t:" + size);
                            System.out.println("UKURAN\t\t:" + warna);
                            System.out.println("WARNA\t\t:" + harga);
                            System.out.print(" Harga Barang    :Rp ");
                            total = hab.nextInt();
                            System.out.println("Total\t\t:" + harga);
                            long diskon = 50000,
                             setdiskon;
                            setdiskon = (total - 50000);
                            System.out.println(" ===========================================================");
                            System.out.println(String.format("\n Total                                      =Rp " + total));
                            System.out.println(String.format(" Diskon                                     =Rp " + diskon));
                            System.out.println(String.format(" Total Pembayaran                           =Rp " + setdiskon));
                            break;
                        case 3:
                            if (jb == 3);
                            if (jb == 2);
                            System.out.println("JUMLAH PEMBELIAN : 2");
                            System.out.println("MERK\t\t:" + merk);
                            System.out.println("JENIS\t\t:" + kategori);
                            System.out.println("KATEGORI\t:" + size);
                            System.out.println("UKURAN\t\t:" + warna);
                            System.out.println("WARNA\t\t:" + harga);
                            System.out.print(" Harga Barang    :Rp ");
                            total = hab.nextInt();
                            System.out.println("Total\t\t:" + harga);
                            long diskons = 100000,
                             setdiskons;
                            setdiskons = (total - 50000);
                            System.out.println(" ===========================================================");
                            System.out.println(String.format("\n Total                                      =Rp " + total));
                            System.out.println(String.format(" Diskon                                     =Rp " + diskons));
                            System.out.println(String.format(" Total Pembayaran                           =Rp " + setdiskons));
                            break;

                        default://iki gae biar nek angkane sing diinputkan lebih dari case maka sout dibawah
                            System.out.print("…………(0 0)\n"
                                    + ".—oOO–(_)—–.\n"
                                    + "╔═════════════════╗\n"
                                    + "║ Maaf Bos Max 3 Jangan nafsu║\n"
                                    + "╚═════════════════╝\n"
                                    + "‘———————-oOO\n"
                                    + "……...|__|__|\n"
                                    + "……….. || ||\n"
                                    + "…….. ooO Ooo");

                            System.out.println("\n\n=============================================");
                            System.out.println(" Terima Kasih Telah Menggunakan Program Kami");
                            System.out.println("=============================================");
                            System.exit(0);

                    }

                    break;

                }

        }
    }
}

/*            case 2: // KALO MIlIH BELI 2 SEPATU
                if (pilih == 2);
                kuda.setMerk("\n [1] 910 \n [2] ADDIDAS \n [3] NIKE \n [4] SKECHERS \n [5] PUMA \n [6] REEBOK \n [7] VANS "
                        + "\n [8] CONVERSE \n [9] FILA");
                System.out.println("Merk    : " + kuda.getMerk());
                System.out.println("╔═════════════════╗\n"
                        + "║      JAYA BARU SPORTS       ║\n"
                        + "╚═════════════════╝");
                System.out.println("Silah kan pilih sesuai keinginan Anda !");
                System.out.print("Sepatu 1 :");
                p = hab.nextInt();
                System.out.print("Sepatu 2 :");
                p = hab.nextInt();

                break;

            case 3: // KALO MILIH BELI 4 SEPATU
                if (pilih == 3);
                kuda.setMerk("\n [1] 910 \n [2] ADDIDAS \n [3] NIKE \n [4] SKECHERS \n [5] PUMA \n [6] REEBOK \n [7] VANS "
                        + "\n [8] CONVERSE \n [9] FILA");
                System.out.println("Merk    : " + kuda.getMerk());
                System.out.println("╔═════════════════╗\n"
                        + "║      JAYA BARU SPORTS       ║\n"
                        + "╚═════════════════╝");
                System.out.println("Silah kan pilih sesuai keinginan Anda !");
                System.out.print("Sepatu 1 : ");
                p = hab.nextInt();
                System.out.print("Sepatu 2 : ");
                p = hab.nextInt();
                System.out.print("Sepatu 3 : ");
                p = hab.nextInt();
                switch (p) {
                    case 1:

                    default://iki gae biar nek angkane sing diinputkan lebih dari case maka sout dibawah
                        System.out.print("…………(0 0)\n"
                                + ".—oOO–(_)—–.\n"
                                + "╔═════════════════╗\n"
                                + "║      Maaf Ngisinya pake huruf ya     ║\n"
                                + "╚═════════════════╝\n"
                                + "‘———————-oOO\n"
                                + "……...|__|__|\n"
                                + "……….. || ||\n"
                                + "…….. ooO Ooo");

                }

        }
    }
}


/*



               switch (p) {
                    case 1:
                        if (p == 1) ;
                        System.out.println("\t== 910 ==");
                        kuda.setJenis("[1] Cowok\n[2] Cewek");
                        System.out.println("\n --- Jenis ---\n" + kuda.getJenis());
                        System.out.print("Masukan Di sini : ");
                        p = hab.nextInt();
                    switch (p) {
                    case 1 :
                                if (p == 1) ;
                                System.out.println("\tCOWOK");
                                kuda.setKategori(" [1] Olahraga \n [2] Lari \n [3] Santuy \n [4] Kantoran");
                                System.out.println("\n --- KATEGORI ---\n" + kuda.getKategori());
                                
                                break;
                            case 2:
                                if (p == 2) ;
                                System.out.println("\tCEWEK");
                                kuda.setKategori(" [1] Olahraga \n [2] Lari \n [3] Santuy \n [4] Kantoran");
                                System.out.println("\n --- KATEGORI ---\n" + kuda.getKategori());
                                break;
                        
                    }
                   
                    case 2 :
                        if (p == 2 );
                        System.out.println("\t== AIDAS ==");
                        kuda.setJenis("[1] Cowok\n[2] Cewek");
                        System.out.println("\n --- Jenis ---\n" + kuda.getJenis());
                        System.out.print("Masukan Di sini : ");
                        p = hab.nextInt();
                    switch (p) {
                    case 1 :
                                if (p == 1) ;
                                System.out.println("\tCOWOK");
                                kuda.setKategori(" [1] Olahraga \n [2] Lari \n [3] Santuy \n [4] Kantoran");
                                System.out.println("\n --- KATEGORI ---\n" + kuda.getKategori());
                                
                                break;
                            case 2:
                                if (p == 2) ;
                                System.out.println("\tCEWEK");
                                kuda.setKategori(" [1] Olahraga \n [2] Lari \n [3] Santuy \n [4] Kantoran");
                                System.out.println("\n --- KATEGORI ---\n" + kuda.getKategori());
                                break;
                        
                    }

                        break;
                         ________________
                        |
                        |
                        |
                        |
                        |
                        |                 |
                        |_________________|


                                 ╔═════════════════╗
                                 ║      Beli 2 Diskon 50k      ║ 
                                 ║      Beli 3 Diskon 100k     ║
                                 ║          Wenak Toh :)        ║
                                 ╚═════════════════╝
    
                                 |                  JAYA LAMA SPORTS                |
                                 |      Menjual Berbagai Macam Sepatu Original      |
                                 |           JL. MOBAL KABEH WES RT 01 RW 07        |
                                 |              MALANG JAWA TIMUR IBU KOTA          |
                                 |==================================================|
                                 |KASIR             : BAMBANK SUJARWO TEJO          |
                                 |Tanggal pembelian : 21 Januari 2020               |
                                 |Kode Pembelian    : S374ND K4MU                   |
                                  ==================================================
     System.out.print("Sepatu Rp. 200,000.00 /pcs");
                    total = hab.nextInt();
                     System.out.print("Sepatu Rp. 300,000.00 /pcs");
                    total = hab.nextInt();
                     System.out.print("Sepatu Rp. 400,000.00 /pcs");
                    total = hab.nextInt();
                     System.out.print("Sepatu Rp. 500,000.00 /pcs");
                    total = hab.nextInt();
                     System.out.print("Sepatu Rp. 600,000.00 /pcs");
                    total = hab.nextInt();
                     System.out.print("Sepatu Rp. 700,000.00 /pcs");
                    total = hab.nextInt();
                     System.out.print("Sepatu Rp. 800,000.00 /pcs");
                    total = hab.nextInt();
                     System.out.print("Sepatu Rp. 900,000.00 /pcs");
                    total = hab.nextInt();
                    
 */
