package CHALLANGE_INHERITANCE;

import java.util.Scanner;

    public class SubSepatu extends SuperSepatu {
        private String Kasir;
        private String Kode;
        private String Penjelas;
        Scanner hab = new Scanner (System.in);
    public SubSepatu(String Nama,String Kasir,String Tanggal, String Kode, String Penjelas) 
    {
        super(Nama, Tanggal);
        this.Kasir = Kasir;
        this.Kode = Kode;
        this.Penjelas = Penjelas;
        
    }
    

    
      //Metode
    public void info ()
    {
        System.out.println("|                  JAYA LAMA SPORTS                |\n" +
"|      Menjual Berbagai Macam Sepatu Original      |\n" +
"|           JL. MOBAL KABEH WES RT 01 RW 07        |\n" +
"|              MALANG JAWA TIMUR IBU KOTA          |\n" +
"|==================================================|\n" +
"|KASIR             : "+this.Kasir +"                      |");
        System.out.println("|Kode              : "+this.Kode+"                 |");
        System.out.println("|Report Bug        : "+this.Penjelas +"               |\n" +
" ==================================================");
        super.info();
    }
}
/*

                                 |                  JAYA LAMA SPORTS                |
                                 |      Menjual Berbagai Macam Sepatu Original      |
                                 |           JL. MOBAL KABEH WES RT 01 RW 07        |
                                 |              MALANG JAWA TIMUR IBU KOTA          |
                                 |==================================================|
                                 |Pembeli           :                               |
                                 |Tanggal           : +this.kode                    |
                                  ==================================================
*/

/*

   ███████  ╔═╗╦═╗╔═╗╔═╗╔╦╗╔═╗
 █▄█████▄█  ║  ╠╦╝║╣ ╠═╣ ║ ║╣
 █ ▼▼▼▼▼    ╚═╝╩╚═╚═╝╩ ╩ ╩ ╚═╝
 █ [O\\[========================-
 █ ▲▲▲▲▲    ╦  ╦╦╦═╗╔╦╗╔═╗═╗ ╦
 █████████  ╚╗╔╝║╠╦╝ ║ ║╣ ╔╩╦╝
 ██_██_  ╚╝ ╩╩╚═ ╩ ╚═╝╩ ╚═
▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬
[•]Author:Mr.Sh3Hub
[•]My Team: RCT PUBLIC

╔══════════════════════════════╗
║                        ║
║                        ║
║    •> {1}.Cowok        ║
║    •> {2}.Cewek        ║
║                        ║
║                        ║
║                   ╔══╝
╚═════════[?] Pilih : 
*/