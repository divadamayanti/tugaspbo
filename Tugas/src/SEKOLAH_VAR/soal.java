/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SEKOLAH_VAR;

/**
 *
 * @author WIN10
 */
public class soal {
    String id_soal, nama_soal, id_siswa;
    
    public soal(){}
    public soal(String id_soal, String nama_soal, String id_siswa){
        this.id_soal = id_soal;
        this.nama_soal = nama_soal;
        this.id_siswa = id_siswa;}
    
    public void inputID(String id){
        this.id_soal = id_soal;
    }
    
    public String ambilID_SOAL(){
        return this.id_soal;
    }
    
    public void inputNAMA_SOAL(String nama_soal){
        this.nama_soal = nama_soal;
    }
    
    public String ambilNAMA_SOAL(){
        return this.nama_soal;
    }
    
    public void inputID_SISWA(String id_siswa){
        this.id_siswa = id_siswa;
    }
    
    public String ambilID_SISWA(){
        return this.id_siswa;
    }
    
}
