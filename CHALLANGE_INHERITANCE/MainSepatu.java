package CHALLANGE_INHERITANCE;

import CHALLANGE_ENCAPSULATION.TesSepatu;
import java.util.Scanner;

public class MainSepatu {

    public static void main(String[] args) {
        int pilih;

        int p;
        int merk, jenis, kategori, harga, size, warna;
        int total;
        String Kupon;
        int plh;
        String Yg;
        boolean running = true;
        int counter = 0;
        String enter;
        while (running) {
            Scanner hab = new Scanner(System.in);
            TesSepatu kuda = new TesSepatu();
            System.out.println("About Creator = 99");
            System.err.print("1 + 1 - 1 : ");
            pilih = hab.nextInt();
            if (pilih == 99) {
                System.out.println("       _____\n"
                        + "  ║▒▒▒▒▒▒▒▒▒▒║\n"
                        + "  ║▒▒▒▒▒▒▒▒▒▒║\n"
                        + "  ║▒▒▒▒▒▒▒▒▒▒║  \n"
                        + " ╔════════════╗                        \n"
                        + " ╚════════════╝ \n"
                        + "  ║██████████╚╗ \n"
                        + "  ║██╔══╗█╔═╗█║ \n"
                        + "  ║██║╬╔╝█╚╗║█║ \n"
                        + "  ║██╚═╝█║█╚╝█║ GABUTS\n"
                        + "  ╚╗█████████═╝\n"
                        + "   ╚╗║╠╩╩╩╩╩╝\n"
                        + "    ║║┈┈┈█▐█████▒.｡oO\n"
                        + "    ║██╠╦╦╦╗\n"
                        + "    ╚╗██████ Author:Mr.Sh3Hub & Friends\n"
                        + "     ╚════╝Team: 10\n"
                        + " <════════════════X═════════════════> \n"
                        + "  _____          ____  _     _____ _   _       _      \n"
                        + " |_   _| __     / ___|| |__ |___ /| | | |_   _| |__   \n"
                        + "   | || '_ \\    \\___ \\| '_ \\  |_ \\| |_| | | | | '_ \\  \n"
                        + "   | || | | |_   ___) | | | |___) |  _  | |_| | |_) | \n"
                        + "   |_||_| |_(_) |____/|_| |_|____/|_| |_|\\__,_|_.__/  \n"
                        + "                                                      ");
            }
            switch (pilih) {
                default:
                    System.out.println("Ulangi Re Chapta!");
                    break;
                case 1:

                    if (pilih == 1);

                    kuda.setHarga("\t╔══════════════════════════╗\n"
                            + "\t║         \t  -HARGA-    \t             ║\n"
                            + "\t║    [1] 910\t\t=Rp. 200,000.00      ║\n"
                            + "\t║    [2] ADIDAS\t\t=Rp. 300,000.00      ║\n"
                            + "\t║    [3] NIKE\t\t=Rp. 400,000.00      ║\n"
                            + "\t║    [4] SKECHERS\t=Rp. 500,000.00      ║\n"
                            + "\t║    [5] PUMA \t\t=Rp. 600,000.00      ║\n"
                            + "\t║    [6] REBOOK\t\t=Rp. 700,000.00      ║\n"
                            + "\t║    [7] VANS\t\t=Rp. 800,000.00      ║\n"
                            + "\t║    [8] FILA\t\t=Rp. 900,000.00      ║\n"
                            + "\t║                                           ║\n"
                            + "\t╚══════════════════════════╝");
                    System.out.println("\n\t\t == LIST HARGA ==\n" + kuda.getHarga());

                    System.out.println("\t╔═════════════════╗\n"
                            + "\t║      Beli 2 Diskon 50k     ║ \n"
                            + "\t║      Beli 3 Diskon 100k    ║\n"
                            + "\t║          Wenak Toh :)      ║\n"
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
                                + "║   TERSEDIA UKURAN 21 - 34  ║\n"
                                + "╚═════════════════╝");
                        System.out.println("\n\t --- Ukuran ---\n" + kuda.getUkuran()); //UKURAN
                        System.out.print("Masukan Ukuran Sepatu : ");
                        warna = hab.nextInt();

                        if (warna == warna);
                        System.out.println("============= JAYA LAMA SPORTS ============");
                        kuda.setWarna("[1] Black\n[2] White \n[3] Gold \n[4] Silver \n[5] Orange \n[6] Green"
                                + "\n[7] Yellow \n[8] Blue \n[9] Red");
                        System.out.println("\n --- WARNA ---\n" + kuda.getWarna()); //WARNA
                        System.out.print("Masukan Warna Pilihan : ");
                        harga = hab.nextInt();

                        System.out.println("╔══════════════════════════╗");

                        /*  switch (merk){
                         case 1 :
                             //merk 1
                                if (merk == 1);
                                System.out.println("MERK\t: 910");
                              
                         */
                        if (merk == 1) {
                            System.out.println("\tMERK\t : 910");

                            if (merk == 2) {
                                System.out.println("\tMERK\t : ADIDAS");
                            }

                            if (merk == 3) {
                                System.out.println("\tMERK\t : NIKE");
                            }

                            if (merk == 4) {
                                System.out.println("\tMERK\t : SKECHERS");
                            }

                            if (merk == 5) {
                                System.out.println("\tMERK\t : PUMA");
                            }

                            if (merk == 6) {
                                System.out.println("\tMERK\t : REBOOK");
                            }

                            if (merk == 7) {
                                System.out.println("\tMERK\t : VANS");
                            }

                            if (merk == 8) {
                                System.out.println("\tMERK\t : FILA");
                            }
                        } else if (merk > 8) {
                            System.out.println("\t  Maaf Program Dihentikan \n\tPERIKSA KEMBALI INPUITAN ANDA");
                            break;
                        }

                        if (kategori == 1) {
                            System.out.println("\tJENIS\t : Cowok");
                        }
                        if (kategori == 2) {
                            System.out.println("\tJENIS\t : Cewek");
                        }

                        //Kategori
                        if (size == 1) {
                            System.out.println("\tKATEGORI : Olahraga");
                        }
                        if (size == 2) {
                            System.out.println("\tKATEGORI : Lari");
                        }
                        if (size == 3) {
                            System.out.println("\tKATEGORI : Santuy");
                        }
                        if (size == 4) {
                            System.out.println("\tKATEGORI : Kantoran");
                        }

                        //Ukuran
                        if (warna == 21) {
                            System.out.println("\tWARNA\t : 21");
                        }

                        if (warna == 22) {
                            System.out.println("\tUKURAN\t : 22");
                        }

                        if (warna == 23) {
                            System.out.println("\tUKURAN\t : 23");
                        }

                        if (warna == 24) {
                            System.out.println("\tUKURAN\t : 24");
                        }

                        if (warna == 25) {
                            System.out.println("\tUKURAN\t : 25");
                        }

                        if (warna == 26) {
                            System.out.println("\tUKURAN\t : 26");
                        }

                        if (warna == 27) {
                            System.out.println("\tUKURAN\t : 27");
                        }

                        if (warna == 28) {
                            System.out.println("\tUKURAN\t : 28");
                        }

                        if (warna == 29) {
                            System.out.println("\tUKURAN\t : 29");
                        }

                        if (warna == 30) {
                            System.out.println("\tUKURAN\t : 30");
                        }

                        if (warna == 31) {
                            System.out.println("\tUKURAN\t : 31");
                        }

                        //Warna
                        if (harga == 1) {
                            System.out.println("\tWARNA\t : Black");
                        }
                        if (harga == 2) {
                            System.out.println("\tWARNA\t : White");
                        }
                        if (harga == 3) {
                            System.out.println("\tWARNA\t : Gold");
                        }
                        if (harga == 4) {
                            System.out.println("\tWARNA\t : Silver");
                        }
                        if (harga == 5) {
                            System.out.println("\tWARNA\t : Orange");
                        }
                        if (harga == 6) {
                            System.out.println("\tWARNA:\t : Green");
                        }
                        if (harga == 7) {
                            System.out.println("\tWARNA\t : YELLOW");
                        }
                        if (harga == 8) {
                            System.out.println("\tWARNA\t : BLUE");
                        }
                        if (harga == 9) {
                            System.out.println("\tWARNA\t : RED");
                        }
                        System.out.println("╚══════════════════════════╝");
                        System.out.println("\n");
                        System.out.println("╔════════════════════╗\n"
                                + "║      APAKAH ANDA YAKIN ?        ║");
                        System.out.print("╚ Jawab [ya/gak]> : ");

                        Yg = hab.next();

                        // cek jawabnnya, kalau ya maka berhenti mengulang
                        if (Yg.equalsIgnoreCase("ya")) {
                            running = false;

                            System.out.println("╚═══════════════════╝");
                            System.out.print("Masukan Jumlah pembelian (MAX3) : ");
                            int beli;
                            beli = hab.nextInt();

                            System.out.println();
                            System.out.println("========== STRUK ==========");
                            SubSepatu mobal = new SubSepatu("", "Pak Ipin", "07 / 11 / 2019", "AXs32SdsasdAC", "081-332-124-688");
                            mobal.info();

                            //HARGA
                            int sembilansepuluh = 200000; // 1
                            int adidas = 300000; // 2
                            int nike = 400000; // 3
                            int puma = 500000; // 4
                            int skechers = 600000; // 5
                            int rebook = 700000;
                            int vans = 800000;
                            int fila = 900000;
                            int kali = 2;
                            int kali2 = 3;

                            switch (merk) {
                                case 1:
                                    if (merk == 1);       //910                   

                                    if (beli == 1) {
                                        System.out.println("\t======== 910 ========");

                                        System.out.println(" Harga Barang    :Rp " + sembilansepuluh);

                                        System.out.println("==================================================");
                                        System.out.println(String.format("\n Total                                      =Rp " + sembilansepuluh));
                                        System.out.println(String.format(" Diskon                                     =Rp -"));
                                        System.out.println(String.format(" Total Pembayaran                           =Rp " + sembilansepuluh));
                                        System.out.println("|==================================================|\n"
                                                + " =               Barang Yang Sudah Di             =\n"
                                                + " =          Beli Tidak Dapat Di Kembalikan        =\n"
                                                + " ==================================================");
                                        break;
                                    }

                                    if (beli == 2) {
                                        int diskon = 50000;
                                        int td = (sembilansepuluh * kali);
                                        int sb = (td - 50000);
                                        System.out.println(" Harga Barang    :Rp " + td);

                                        System.out.println("==================================================");
                                        System.out.println(String.format("\n Total                                      =Rp " + td));
                                        System.out.println(String.format(" Diskon                                     =Rp " + diskon));
                                        System.out.println(String.format(" Total Pembayaran                           =Rp " + sb));
                                        System.out.println("|==================================================|\n"
                                                + " =               Barang Yang Sudah Di             =\n"
                                                + " =          Beli Tidak Dapat Di Kembalikan        =\n"
                                                + " ==================================================");
                                        break;
                                    }

                                    if (beli == 3) {

                                        int Diskon = 100000;
                                        int td = (sembilansepuluh * kali2);
                                        int sb = (td - Diskon);

                                        System.out.println(" Harga Barang    :Rp " + td);

                                        System.out.println("==================================================");
                                        System.out.println(String.format("\n Total                                      =Rp " + td));
                                        System.out.println(String.format(" Diskon                                     =Rp " + Diskon));
                                        System.out.println(String.format(" Total Pembayaran                           =Rp " + sb));
                                        System.out.println("|==================================================|\n"
                                                + " =               Barang Yang Sudah Di             =\n"
                                                + " =          Beli Tidak Dapat Di Kembalikan        =\n"
                                                + " ==================================================");
                                        break;
                                    }

                                case 2:
                                    if (merk == 2); //adidas
                                    if (beli == 1) {
                                        System.out.println("\t======== ADIDAS ========");

                                        System.out.println(" Harga Barang    :Rp " + adidas);

                                        System.out.println("==================================================");
                                        System.out.println(String.format("\n Total                                      =Rp " + adidas));
                                        System.out.println(String.format(" Diskon                                     =Rp -"));
                                        System.out.println(String.format(" Total Pembayaran                           =Rp " + adidas));
                                        System.out.println("|==================================================|\n"
                                                + " =               Barang Yang Sudah Di             =\n"
                                                + " =          Beli Tidak Dapat Di Kembalikan        =\n"
                                                + " ==================================================");
                                        break;
                                    }

                                    if (beli == 2) {
                                        int diskon = 50000;
                                        int td = (adidas * kali);
                                        int sb = (td - 50000);
                                        System.out.println(" Harga Barang    :Rp " + td);

                                        System.out.println("==================================================");
                                        System.out.println(String.format("\n Total                                      =Rp " + td));
                                        System.out.println(String.format(" Diskon                                     =Rp " + diskon));
                                        System.out.println(String.format(" Total Pembayaran                           =Rp " + sb));
                                        System.out.println("|==================================================|\n"
                                                + " =               Barang Yang Sudah Di             =\n"
                                                + " =          Beli Tidak Dapat Di Kembalikan        =\n"
                                                + " ==================================================");
                                        break;
                                    }

                                    if (beli == 3) {
                                        int Diskon = 100000;
                                        int td = (sembilansepuluh * kali2);
                                        int sb = (td - Diskon);

                                        System.out.println(" Harga Barang    :Rp " + td);

                                        System.out.println("==================================================");
                                        System.out.println(String.format("\n Total                                      =Rp " + td));
                                        System.out.println(String.format(" Diskon                                     =Rp " + Diskon));
                                        System.out.println(String.format(" Total Pembayaran                           =Rp " + sb));
                                        System.out.println("|==================================================|\n"
                                                + " =               Barang Yang Sudah Di             =\n"
                                                + " =          Beli Tidak Dapat Di Kembalikan        =\n"
                                                + " ==================================================");

                                        break;
                                    }
                                case 3:
                                    if (merk == 3); //nike

                                    if (beli == 1) {
                                        System.out.println("\t======== NIKE ========");

                                        System.out.println(" Harga Barang    :Rp " + nike);

                                        System.out.println("==================================================");
                                        System.out.println(String.format("\n Total                                      =Rp " + nike));
                                        System.out.println(String.format(" Diskon                                     =Rp -"));
                                        System.out.println(String.format(" Total Pembayaran                           =Rp " + nike));

                                        System.out.println("|==================================================|\n"
                                                + " =               Barang Yang Sudah Di             =\n"
                                                + " =          Beli Tidak Dapat Di Kembalikan        =\n"
                                                + " ==================================================");
                                        break;
                                    }

                                    if (beli == 2) {
                                        int diskon = 50000;
                                        int td = (nike * kali);
                                        int sb = (td - 50000);
                                        System.out.println(" Harga Barang    :Rp " + td);

                                        System.out.println("==================================================");
                                        System.out.println(String.format("\n Total                                      =Rp " + td));
                                        System.out.println(String.format(" Diskon                                     =Rp " + diskon));
                                        System.out.println(String.format(" Total Pembayaran                           =Rp " + sb));
                                        System.out.println("|==================================================|\n"
                                                + " =               Barang Yang Sudah Di             =\n"
                                                + " =          Beli Tidak Dapat Di Kembalikan        =\n"
                                                + " ==================================================");
                                        break;
                                    }

                                    if (beli == 3) {

                                        int Diskon = 100000;
                                        int td = (sembilansepuluh * kali2);
                                        int sb = (td - Diskon);

                                        System.out.println(" Harga Barang    :Rp " + td);

                                        System.out.println("==================================================");
                                        System.out.println(String.format("\n Total                                      =Rp " + td));
                                        System.out.println(String.format(" Diskon                                     =Rp " + Diskon));
                                        System.out.println(String.format(" Total Pembayaran                           =Rp " + sb));
                                        System.out.println("|==================================================|\n"
                                                + " =               Barang Yang Sudah Di             =\n"
                                                + " =          Beli Tidak Dapat Di Kembalikan        =\n"
                                                + " ==================================================");

                                        break;
                                    }
                                case 4:
                                    if (merk == 4); //Puma

                                    if (beli == 1) {
                                        System.out.println("\t======== PUMA ========");

                                        System.out.println(" Harga Barang    :Rp " + puma);

                                        System.out.println("==================================================");
                                        System.out.println(String.format("\n Total                                      =Rp " + puma));
                                        System.out.println(String.format(" Diskon                                     =Rp -"));
                                        System.out.println(String.format(" Total Pembayaran                           =Rp " + puma));
                                        System.out.println("|==================================================|\n"
                                                + " =               Barang Yang Sudah Di             =\n"
                                                + " =          Beli Tidak Dapat Di Kembalikan        =\n"
                                                + " ==================================================");
                                        break;
                                    }

                                    if (beli == 2) {
                                        int diskon = 50000;
                                        int td = (puma * kali);
                                        int sb = (td - 50000);
                                        System.out.println(" Harga Barang    :Rp " + td);

                                        System.out.println("==================================================");
                                        System.out.println(String.format("\n Total                                      =Rp " + td));
                                        System.out.println(String.format(" Diskon                                     =Rp " + diskon));
                                        System.out.println(String.format(" Total Pembayaran                           =Rp " + sb));
                                        System.out.println("|==================================================|\n"
                                                + " =               Barang Yang Sudah Di             =\n"
                                                + " =          Beli Tidak Dapat Di Kembalikan        =\n"
                                                + " ==================================================");
                                        break;
                                    }

                                    if (beli == 3) {
                                        int Diskon = 100000;
                                        int td = (sembilansepuluh * kali2);
                                        int sb = (td - Diskon);

                                        System.out.println(" Harga Barang    :Rp " + td);

                                        System.out.println("==================================================");
                                        System.out.println(String.format("\n Total                                      =Rp " + td));
                                        System.out.println(String.format(" Diskon                                     =Rp " + Diskon));
                                        System.out.println(String.format(" Total Pembayaran                           =Rp " + sb));
                                        System.out.println("|==================================================|\n"
                                                + " =               Barang Yang Sudah Di             =\n"
                                                + " =          Beli Tidak Dapat Di Kembalikan        =\n"
                                                + " ==================================================");
                                        break;
                                    }
                                case 5:
                                    if (merk == 5); // SKEECHERS
                                    if (beli == 1) {
                                        System.out.println("\t======== SKECHERS ========");

                                        System.out.println(" Harga Barang    :Rp " + skechers);

                                        System.out.println("==================================================");
                                        System.out.println(String.format("\n Total                                      =Rp " + skechers));
                                        System.out.println(String.format(" Diskon                                     =Rp -"));
                                        System.out.println(String.format(" Total Pembayaran                           =Rp " + skechers));
                                        System.out.println("|==================================================|\n"
                                                + " =               Barang Yang Sudah Di             =\n"
                                                + " =          Beli Tidak Dapat Di Kembalikan        =\n"
                                                + " ==================================================");
                                        break;
                                    }

                                    if (beli == 2) {
                                        int diskon = 50000;
                                        int td = (skechers * kali);
                                        int sb = (td - 50000);
                                        System.out.println(" Harga Barang    :Rp " + td);

                                        System.out.println("==================================================");
                                        System.out.println(String.format("\n Total                                      =Rp " + td));
                                        System.out.println(String.format(" Diskon                                     =Rp " + diskon));
                                        System.out.println(String.format(" Total Pembayaran                           =Rp " + sb));
                                        System.out.println("|==================================================|\n"
                                                + " =               Barang Yang Sudah Di             =\n"
                                                + " =          Beli Tidak Dapat Di Kembalikan        =\n"
                                                + " ==================================================");
                                        break;
                                    }

                                    if (beli == 3) {

                                        int Diskon = 100000;
                                        int td = (sembilansepuluh * kali2);
                                        int sb = (td - Diskon);

                                        System.out.println(" Harga Barang    :Rp " + td);

                                        System.out.println("==================================================");
                                        System.out.println(String.format("\n Total                                      =Rp " + td));
                                        System.out.println(String.format(" Diskon                                     =Rp " + Diskon));
                                        System.out.println(String.format(" Total Pembayaran                           =Rp " + sb));
                                        System.out.println("|==================================================|\n"
                                                + " =               Barang Yang Sudah Di             =\n"
                                                + " =          Beli Tidak Dapat Di Kembalikan        =\n"
                                                + " ==================================================");
                                        break;
                                    }
                                case 6:
                                    if (merk == 6); //REBOOK
                                    if (beli == 1) {
                                        System.out.println("\t======== REBOOK ========");

                                        System.out.println(" Harga Barang    :Rp " + rebook);

                                        System.out.println("==================================================");
                                        System.out.println(String.format("\n Total                                      =Rp " + rebook));
                                        System.out.println(String.format(" Diskon                                     =Rp -"));
                                        System.out.println(String.format(" Total Pembayaran                           =Rp " + rebook));
                                        System.out.println("|==================================================|\n"
                                                + " =               Barang Yang Sudah Di             =\n"
                                                + " =          Beli Tidak Dapat Di Kembalikan        =\n"
                                                + " ==================================================");
                                        break;
                                    }

                                    if (beli == 2) {
                                        int diskon = 50000;
                                        int td = (rebook * kali);
                                        int sb = (td - 50000);
                                        System.out.println(" Harga Barang    :Rp " + td);

                                        System.out.println("==================================================");
                                        System.out.println(String.format("\n Total                                      =Rp " + td));
                                        System.out.println(String.format(" Diskon                                     =Rp " + diskon));
                                        System.out.println(String.format(" Total Pembayaran                           =Rp " + sb));
                                        System.out.println("|==================================================|\n"
                                                + " =               Barang Yang Sudah Di             =\n"
                                                + " =          Beli Tidak Dapat Di Kembalikan        =\n"
                                                + " ==================================================");
                                        break;
                                    }

                                    if (beli == 3) {
                                        int Diskon = 100000;
                                        int td = (sembilansepuluh * kali2);
                                        int sb = (td - Diskon);

                                        System.out.println(" Harga Barang    :Rp " + td);

                                        System.out.println("==================================================");
                                        System.out.println(String.format("\n Total                                      =Rp " + td));
                                        System.out.println(String.format(" Diskon                                     =Rp " + Diskon));
                                        System.out.println(String.format(" Total Pembayaran                           =Rp " + sb));
                                        System.out.println("|==================================================|\n"
                                                + " =               Barang Yang Sudah Di             =\n"
                                                + " =          Beli Tidak Dapat Di Kembalikan        =\n"
                                                + " ==================================================");
                                        break;

                                    }
                                case 7:
                                    if (merk == 7); //VANS
                                    if (beli == 1) {
                                        System.out.println("\t======== VANS ========");

                                        System.out.println(" Harga Barang    :Rp " + vans);

                                        System.out.println("==================================================");
                                        System.out.println(String.format("\n Total                                      =Rp " + vans));
                                        System.out.println(String.format(" Diskon                                     =Rp -"));
                                        System.out.println(String.format(" Total Pembayaran                           =Rp " + vans));
                                        System.out.println("|==================================================|\n"
                                                + " =               Barang Yang Sudah Di             =\n"
                                                + " =          Beli Tidak Dapat Di Kembalikan        =\n"
                                                + " ==================================================");
                                        break;
                                    }

                                    if (beli == 2) {
                                        int diskon = 50000;
                                        int td = (vans * kali);
                                        int sb = (td - 50000);
                                        System.out.println(" Harga Barang    :Rp " + td);

                                        System.out.println("==================================================");
                                        System.out.println(String.format("\n Total                                      =Rp " + td));
                                        System.out.println(String.format(" Diskon                                     =Rp " + diskon));
                                        System.out.println(String.format(" Total Pembayaran                           =Rp " + sb));
                                        System.out.println("|==================================================|\n"
                                                + " =               Barang Yang Sudah Di             =\n"
                                                + " =          Beli Tidak Dapat Di Kembalikan        =\n"
                                                + " ==================================================");
                                        break;
                                    }

                                    if (beli == 3) {
                                        int Diskon = 100000;
                                        int td = (sembilansepuluh * kali2);
                                        int sb = (td - Diskon);

                                        System.out.println(" Harga Barang    :Rp " + td);

                                        System.out.println("==================================================");
                                        System.out.println(String.format("\n Total                                      =Rp " + td));
                                        System.out.println(String.format(" Diskon                                     =Rp " + Diskon));
                                        System.out.println(String.format(" Total Pembayaran                           =Rp " + sb));
                                        System.out.println("|==================================================|\n"
                                                + " =               Barang Yang Sudah Di             =\n"
                                                + " =          Beli Tidak Dapat Di Kembalikan        =\n"
                                                + " ==================================================");
                                        break;

                                    }
                                case 8:
                                    if (merk == 8); //FILA
                                    if (beli == 1) {
                                        System.out.println("\t======== FILA ========");

                                        System.out.println(" Harga Barang    :Rp " + fila);

                                        System.out.println("==================================================");
                                        System.out.println(String.format("\n Total                                      =Rp " + fila));
                                        System.out.println(String.format(" Diskon                                     =Rp -"));
                                        System.out.println(String.format(" Total Pembayaran                           =Rp " + fila));
                                        System.out.println("|==================================================|\n"
                                                + " =               Barang Yang Sudah Di             =\n"
                                                + " =          Beli Tidak Dapat Di Kembalikan        =\n"
                                                + " ==================================================");
                                        break;
                                    }

                                    if (beli == 2) {
                                        int diskon = 50000;
                                        int td = (fila * kali);
                                        int sb = (td - 50000);
                                        System.out.println(" Harga Barang    :Rp " + td);

                                        System.out.println("==================================================");
                                        System.out.println(String.format("\n Total                                      =Rp " + td));
                                        System.out.println(String.format(" Diskon                                     =Rp " + diskon));
                                        System.out.println(String.format(" Total Pembayaran                           =Rp " + sb));
                                        System.out.println("|==================================================|\n"
                                                + " =               Barang Yang Sudah Di             =\n"
                                                + " =          Beli Tidak Dapat Di Kembalikan        =\n"
                                                + " ==================================================");
                                        break;
                                    }

                                    if (beli == 3) {

                                        int Diskon = 100000;
                                        int Td = (fila - Diskon);

                                        System.out.println(" Harga Barang    :Rp " + fila);

                                        System.out.println("==================================================");
                                        System.out.println(String.format("\n Total                                      =Rp " + fila));
                                        System.out.println(String.format(" Diskon                                     =Rp " + Diskon));
                                        System.out.println(String.format(" Total Pembayaran                           =Rp " + Td));
                                        System.out.println("|==================================================|\n"
                                                + " =               Barang Yang Sudah Di             =\n"
                                                + " =          Beli Tidak Dapat Di Kembalikan        =\n"
                                                + " ==================================================");
                                        break;
                                    }
                                default:
                                    System.out.println("╔════════════════════╗\n"
                                            + "║      MAAF PEMBELIAN MAX 3       ║\n"
                                            + "╚════════════════════╝");
                                    break;

                            }

                            System.out.print("    ============================================================== \n"
                                    + "    =                       TERIMAKASIH                         =\n"
                                    + "    =                TELAH MENGGUNAKAN TOOLS                    =\n"
                                    + "    =                          KAMI                             =\n"
                                    + "    =============================================================");

                            System.out.println("\n");

                        }
                        counter++;

                    }
            }
        }
    }
}


/*      |____________________________________|
        |o Nama            |  Harga          |
        |1. 910            |   Rp 200000,00  |
        |2. ADIDAS         |   Rp 300000,00  |
        |3. NIKE           |   Rp 400000,00  |
        |4. PUMA           |   Rp 500000,00  |
        |5. SKECHERS       |   Rp 600000,00  |
        |6. REBOOK         |   Rp 600000,00  |
        |7. VANS           |   Rp 600000,00  |
        |8. FILA           |   Rp 600000,00  |
        |__________________|_________________|
|==================================================|
 =               Barang Yang Sudah Di             =
 =          Beli Tidak Dapat Di Kembalikan        =
 ==================================================
 */
 /*
╔══════════════════════════════╗
║                                     ║
║                                     ║
║       Apakah                        ║
║       Anda                          ║
║       Yakin ?                       ║
║                                     ║
║                   ╔══════════╝
╚═════════[?] Pilih : 3
 */
 /*
╔════════════════════╗
║      APAKAH ANDA YAKIN?          ║
╚═════════
 */
