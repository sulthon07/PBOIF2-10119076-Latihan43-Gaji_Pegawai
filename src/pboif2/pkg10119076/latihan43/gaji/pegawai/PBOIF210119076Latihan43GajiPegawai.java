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
public class PBOIF210119076Latihan43GajiPegawai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Gaji gaji = new Gaji();
        System.out.println("###Data Gaji Karyawan PT. KAKUTA###");
        System.out.println("-----------------------------------");
        
        gaji.setNama("Rizki Adam Kurniawan");
        gaji.setAlamat("Jalan Semar dlm 4 No 72/66");
        gaji.setUangTransport(250000);
        gaji.setUangTunjangan(300000);
        gaji.setGajiPokok(4500000);
        gaji.totalGaji(gaji.getUangTunjangan(),gaji.getUangTransport(),gaji.getGajiPokok());
        gaji.tampilData(gaji.getNama(),gaji.getAlamat(),gaji.getUangTunjangan(),gaji.getUangTransport(),gaji.getGajiPokok(),gaji.totalGaji(gaji.getUangTunjangan(),gaji.getUangTransport(),gaji.getGajiPokok()));
    }
    
}
