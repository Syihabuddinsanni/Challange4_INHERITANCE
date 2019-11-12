/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CHALLANGE_ENCAPSULATION;

/**
 *
 * @author Asus
 */
public class EncapSepatu {
        String Merk;
    private String Ukuran;
    private String Harga;
    private String Jenis;
    private String Kategori;
    private String Warna;
   
    
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
    
    



