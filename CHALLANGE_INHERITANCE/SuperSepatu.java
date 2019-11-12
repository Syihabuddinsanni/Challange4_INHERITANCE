package CHALLANGE_INHERITANCE;

import java.util.Scanner;

public class SuperSepatu {

    private String Nama;
    private String Tanggal;
 
    
    //Enkapsulasi
    private String Merk;
    private String Ukuran;
    private String Harga;
    private String Jenis;
    private String Kategori;
    private String Warna;
    
    
    String pmbl;
 Scanner hab = new Scanner (System.in);
    //Konstruktor
    public SuperSepatu(String Nama, String Tanggal) {
        this.Nama = Nama;
        this.Tanggal = Tanggal;
        System.out.print("Atas Nama Pembeli : ");
         pmbl = hab.next();
        System.out.println("\n ==================================================");
       
    }
    //Metode

    public void info() {
        System.out.println("|Pembeli           :" +pmbl+"                          ");
        System.out.println("|Tanggal           :" +this.Tanggal+"                    \n" +
"==================================================");

    }
    
    public String getMerk(){
        return Merk;
    }
    public String getJenis(){
        return Jenis;
    }
    public String getWarna(){
        return Warna;
    }
    public String getKategori(){
        return Kategori;
    }
    public String getUkuran(){
        return Ukuran;
    }
    public String getHarga(){
        return Harga;
    }
    public void setMerk(String newMerk){
        Merk = newMerk;
    }
    public void setJenis(String newJenis){
        Jenis = newJenis;
    }
    public void setWarna(String newWarna){
        Warna = newWarna;
    }
    public void setKategori(String newKategori){
        Kategori = newKategori;
    }
     public void setUkuran(String newUkuran){
        Ukuran = newUkuran;    
    }
     public void setHarga(String newHarga){
         Harga = newHarga;
     }
     
    
    }   
    
    
