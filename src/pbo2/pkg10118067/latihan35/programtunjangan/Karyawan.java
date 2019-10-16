/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118067.latihan35.programtunjangan;

/**
 *
 * @author Kiyo
 */
public class Karyawan {
   
    private double gaji;
    private String status;

    public void setGaji(double gaji) {
        this.gaji = gaji;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    private double hitungTunjangan() {
        return status.equals("Menikah") ? gaji * 0.35 : 0;
    }
    
    private double hitungTotalGaji() {
        return gaji + hitungTunjangan();
    }
    
    public void tampilHasilPerhitungan() {
        System.out.println("========Hasil Perhitungan Gaji Anda========");
        System.out.println("Gaji Pokok      : Rp " + gaji);
        System.out.println("Tunjangan       : Rp " + hitungTunjangan());
        System.out.println("Total Gaji      : Rp " + hitungTotalGaji());
        
    }
}

    

