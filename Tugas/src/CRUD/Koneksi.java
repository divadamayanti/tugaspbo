/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CRUD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Date;

/**
 *
 * @author WIN10
 */
public class Koneksi {
    private String database = "2210010092";
    private String username = "root";
    private String password = "";
    private String lokasi = "jdbc:mysql://localhost/" + database;
    public static Connection koneksidb;
    
    public Koneksi() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            if (koneksidb == null || koneksidb.isClosed()) {
                koneksidb = DriverManager.getConnection(lokasi, username, password);
                System.out.println("Database Terkoneksi");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    //TABEL GURU START =========
    
    public void simpanGuru(String tempId, String tempNama, String tempAlamat){
        try {
            String sql = "insert into guru (id, nama, alamat) value (?,?,?)";
            PreparedStatement perintah = koneksidb.prepareStatement(sql);
            perintah.setString(1, tempId);
            perintah.setString(2, tempNama);
            perintah.setString(3, tempAlamat);
            perintah.executeUpdate();
            System.out.println("Data berhasil disimpan");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void ubahGuru(String tempId, String tempNama, String tempAlamat){
        try {
            String sql = "UPDATE guru SET id = ?, nama = ?, WHERE alamat = ?";
            PreparedStatement perintah = koneksidb.prepareStatement(sql);
            perintah.setString(1, tempId);
            perintah.setString(2, tempNama);
            perintah.setString(3, tempAlamat);
            perintah.executeUpdate();
            System.out.println("Data berhasil diubah");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void hapusGuru(String tempAlamat) {
        try {
            String sql = "DELETE FROM lokasi WHERE alamat = ?";
            PreparedStatement perintah = koneksidb.prepareStatement(sql);
            perintah.setString(1, tempAlamat);
            perintah.executeUpdate();
            System.out.println("Data berhasil dihapus");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    //TABEL GURU END ============
    
    
    //TABEL MATERI START ========
    
    public void simpanMateri(String tempId_materi, String tempNama_materi, String tempId_guru, String tempId_siswa){
        try {
            String sql = "insert into guru (id_materi, nama_materi, id_guru, id_siswa) value (?,?,?,?)";
            PreparedStatement perintah = koneksidb.prepareStatement(sql);
            perintah.setString(1, tempId_materi);
            perintah.setString(2, tempNama_materi);
            perintah.setString(3, tempId_guru);
            perintah.setString(4, tempId_siswa);
            perintah.executeUpdate();
            System.out.println("Data berhasil disimpan");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void ubahMateri(String tempId_materi, String tempNama_materi, String tempId_guru, String tempId_siswa){
        try {
            String sql = "UPDATE materi SET id_materi = ?, nama_materi = ?, id_guru = ?, WHERE id_siswa = ?";
            PreparedStatement perintah = koneksidb.prepareStatement(sql);
            perintah.setString(1, tempId_materi);
            perintah.setString(2, tempNama_materi);
            perintah.setString(3, tempId_guru);
            perintah.setString(4, tempId_siswa);
            perintah.executeUpdate();
            System.out.println("Data berhasil diubah");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void hapusMateri(String tempId_siswa) {
        try {
            String sql = "DELETE FROM lokasi WHERE id_siswa = ?";
            PreparedStatement perintah = koneksidb.prepareStatement(sql);
            perintah.setString(1, tempId_siswa);
            perintah.executeUpdate();
            System.out.println("Data berhasil dihapus");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    //TABEL MATERI END =========
    
    
    //TABEL SISWA START ========
    
    public void simpanSiswa(String tempId, String tempNama, String tempTtl, String tempJk, String tempAlamat_siswa){
        try {
            String sql = "insert into siswa (id, nama, ttl, jk, alamat_siswa) value (?,?,?,?,?)";
            PreparedStatement perintah = koneksidb.prepareStatement(sql);
            perintah.setString(1, tempId);
            perintah.setString(2, tempNama);
            perintah.setString(3, tempTtl);
            perintah.setString(4, tempJk);
            perintah.setString(5, tempAlamat_siswa);
            perintah.executeUpdate();
            System.out.println("Data berhasil disimpan");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void ubahSiswa(String tempId, String tempNama, String tempTtl, String tempJk, String tempAlamat_siswa){
        try {
            String sql = "UPDATE siswa SET id = ?, nama = ?, ttl ?, jk = ?, WHERE alamat_siswa = ?";
            PreparedStatement perintah = koneksidb.prepareStatement(sql);
            perintah.setString(1, tempId);
            perintah.setString(2, tempNama);
            perintah.setString(3, tempTtl);
            perintah.setString(4, tempJk);
            perintah.setString(5, tempAlamat_siswa);
            perintah.executeUpdate();
            System.out.println("Data berhasil diubah");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void hapusSiswa(String tempAlamat_siswa) {
        try {
            String sql = "DELETE FROM lokasi WHERE Alamat_siswa = ?";
            PreparedStatement perintah = koneksidb.prepareStatement(sql);
            perintah.setString(1, tempAlamat_siswa);
            perintah.executeUpdate();
            System.out.println("Data berhasil dihapus");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    //TABEL SISWA END ==========
    
    
    //TABEL SOAL START =========
    
    public void simpanSoal(String tempId_soal, String tempNama_soal, String tempId_siswa){
        try {
            String sql = "insert into soal (id_soal, nama_soal, id_siswa) value (?,?,?)";
            PreparedStatement perintah = koneksidb.prepareStatement(sql);
            perintah.setString(1, tempId_soal);
            perintah.setString(2, tempNama_soal);
            perintah.setString(3, tempId_siswa);
            perintah.executeUpdate();
            System.out.println("Data berhasil disimpan");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void ubahSoal(String tempId_soal, String tempNama_soal, String tempId_siswa){
        try {
            String sql = "UPDATE soal SET id_soal = ?, nama_soal = ?, WHERE id_siswa = ?";
            PreparedStatement perintah = koneksidb.prepareStatement(sql);
            perintah.setString(1, tempId_soal);
            perintah.setString(2, tempNama_soal);
            perintah.setString(3, tempId_siswa);
            perintah.executeUpdate();
            System.out.println("Data berhasil diubah");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
     
    public void hapusSoal(String tempId_siswa) {
        try {
            String sql = "DELETE FROM lokasi WHERE Id_siswa = ?";
            PreparedStatement perintah = koneksidb.prepareStatement(sql);
            perintah.setString(1, tempId_siswa);
            perintah.executeUpdate();
            System.out.println("Data berhasil dihapus");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    //TABLE SOAL END======
}

