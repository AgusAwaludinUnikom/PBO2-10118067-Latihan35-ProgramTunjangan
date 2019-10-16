/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118067.latihan35.programtunjangan;

import java.util.Scanner;

/**
 *
 * Agus Awaludin
 * 10118067
 * PBO2
 * Latihan ini berisi tentang bagaimana menampilkan besar tunjangan dari
 * besar gaji pokok
 */
public class PBO210118067Latihan35ProgramTunjangan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Karyawan karyawan = new Karyawan();
        
        System.out.println("===========Program Tunjangan===========");
        System.out.print("Berapa gaji pokok anda perbulan?  : Rp. ");
        karyawan.setGaji(scanner.nextDouble());
        
        System.out.print("Status Anda? (Menikah/Belum)      : ");
        karyawan.setStatus(scanner.next());
        
        karyawan.tampilHasilPerhitungan();
    }
    
}
