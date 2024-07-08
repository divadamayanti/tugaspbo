/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SEKOLAH_MAIN_CLASS;

import SEKOLAH_VAR.materi;
import GUI.Mainframe;
import SEKOLAH_VAR.siswa;
import CRUD.Koneksi;
import SEKOLAH_VAR.soal;
import java.sql.Date;
/**
 *
 * @author WIN10
 */
public class guru {
    private String id, nama, alamat;
    
    public guru(){}
    public guru(String id, String nama, String alamat){
        this.id = id;
        this.nama = nama;
        this.alamat = alamat;}
    
    public void inputID(String id){
        this.id = id;
    }
    
    public String ambilID(){
        return this.id;
    }
    
    public void inputNAMA(String nama){
        this.nama = nama;
    }
    
    public String ambilNAMA(){
        return this.nama;
    }
    
    public void inputALAMAT(String alamat){
        this.alamat = alamat;
    }
    
    public String ambilALAMAT(){
        return this.alamat;
    }
    
    public static void main(String[] args) {
        new Mainframe().setVisible(true);
    }
}
