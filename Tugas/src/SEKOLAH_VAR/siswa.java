/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SEKOLAH_VAR;

/**
 *
 * @author WIN10
 */
public class siswa {
    String id, nama, ttl, jk, alamat_siswa;
    
    public siswa(){}
    public siswa(String id, String nama, String ttl, String jk, String alamat_siswa){
        this.id = id;
        this.nama = nama;
        this.ttl = ttl;
        this.jk = jk;
        this. alamat_siswa = alamat_siswa;}
    
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
    
    public void inputTTL(String ttl){
        this.ttl = ttl;
    }
    
    public String ambilTTL(){
        return this.ttl;
    }
    
    public void inputJK(String jk){
        this.jk = jk;
    }
    
    public String ambilJK(){
        return this.jk;
    }
    
    public void inputALAMAT_SISWA(String alamat_siswa){
        this.alamat_siswa = alamat_siswa;
    }
    
    public String ambilALAMAT_SISWA(){
        return this.alamat_siswa;
    }
    
}
