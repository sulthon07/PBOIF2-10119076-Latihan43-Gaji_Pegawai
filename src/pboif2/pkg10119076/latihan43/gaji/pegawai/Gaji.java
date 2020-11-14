/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119076.latihan43.gaji.pegawai;

/**
 *
 * @author ACER
 * Nama : Sulthon Naufal Akmal
 * Kelas : IF2
 * NIM : 10119076
 * Deskripsi :Gaji Pegawai
 */
public class Gaji {
    private String nama,alamat;
    private int uangTransport,uangTunjangan,gajiPokok,totalGaji;
    
    public String getNama(){
        return nama;
    }
    
    public void setNama(String nama){
        this.nama = nama;
    }
    
    public String getAlamat(){
        return alamat;
    }
    public void setAlamat(String alamat){
        this.alamat = alamat;
    }
    public int getUangTransport(){
        return uangTransport;
    }
    public void setUangTransport(int uangTransport){
        this.uangTransport = uangTransport;
    }
    public int getUangTunjangan(){
        return uangTunjangan;
    }
    public void setUangTunjangan(int uangTunjangan){
        this.uangTunjangan = uangTunjangan;
    }
    public int getGajiPokok(){
        return gajiPokok;
    }
    public void setGajiPokok(int gajiPokok){
        this.gajiPokok = gajiPokok;
    }
    public int getTotalGaji(){
        return totalGaji;
    }
    public void setTotalGaji(int totalGaji){
        this.totalGaji = totalGaji;
    }
    public int totalGaji(int uangTunjangan,int uangTransport, int gajiPokok){
        return uangTunjangan + uangTransport + gajiPokok;
    }
    public void tampilData(String nama, String alamat, int uangTunjangan,int uangTransport, int gajiPokok, int gajiTotal){
        System.out.println("Nama Karyawan : " + nama);
        System.out.println("Alamat : " + alamat);
        System.out.println("Uang Transport : Rp. " + uangTransport);
        System.out.println("Uang Tunjangan : Rp. " + uangTunjangan);
        System.out.println("Gaji Pokok : Rp. " + gajiPokok);
        System.out.println("Total Gaji : Rp. " + gajiTotal);
    }
}
