/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SEKOLAH_VAR;

/**
 *
 * @author WIN10
 */
public class materi {
    String id_materi, nama_materi, id_guru, id_siswa;
    
    public materi(){}
    public materi(String id_materi, String nama_materi, String id_guru, String id_siswa){
        this.id_materi = id_materi;
        this.nama_materi = nama_materi;
        this.id_guru = id_guru;
        this.id_siswa = id_siswa;}
    
    public void inputID_MATERI(String ID_MATERI){
        this.id_materi = id_materi;
    }
    
    public String ambilID_MATERI(){
        return this.id_materi;
    }
    
    public void inputNAMA_MATERI(String nama_materi){
        this.nama_materi = nama_materi;
    }
    
    public String ambilNAMA_MATERI(){
        return this.nama_materi;
    }
    
    public void inputID_GURU(String id_guru){
        this.id_guru = id_guru;
    }
    
    public String ambilID_GURU(){
        return this.id_guru;
    }
    
    public void inputID_SISWA(String id_siswa){
        this.id_siswa = id_siswa;
    }
    
    public String ambilID_SISWA(){
        return this.id_siswa;
    }
    
}

