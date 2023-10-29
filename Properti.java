/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
//import Control.Connector;


/**
 *
 * @author usama
 */
public class Properti {
    private static int lastPropertiId = 0;

    public static int getLastPropertiId() {
        return lastPropertiId;
    }

    public static void setLastPropertiId(int aLastPropertiId) {
        lastPropertiId = aLastPropertiId;
    }
    private int idProperti;
    private String nama;
    private String deskripsi;
    private String lokasi;
    private double harga;
    private double panjangRumah;
    private double lebarRumah;
    private String ketersediaan;
    //Memanggil semua fungsi pada class Connector
    Connector connects = new Connector();
    //Memanggil fungsi yang menggunakan void dalam package Control.Connector
    

    // Konstruktor
    public Properti(String nama, String deskripsi, String lokasi, double harga,
                    double panjangRumah, double lebarRumah, String ketersediaan) {
        this.idProperti = ++lastPropertiId;
        this.nama = nama;
        this.deskripsi = deskripsi;
        this.lokasi = lokasi;
        this.harga = harga;
        this.panjangRumah = panjangRumah;
        this.lebarRumah = lebarRumah;
        this.ketersediaan = ketersediaan;
    }
    
    public void display() {
        System.out.println("Nama Properti: " + nama);
        System.out.println("Lokasi: " + lokasi);
        System.out.println("Harga: " + harga);
        System.out.println("Panjang: " + panjangRumah);
        System.out.println("Lebar: " + lebarRumah);
        System.out.println("Ketersediaan: " + ketersediaan);
        System.out.println("Deskripsi: " + deskripsi);
    }

    public int getIdProperti() {
        return idProperti;
    }

    public void setIdProperti(int idProperti) {
        this.idProperti = idProperti;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public String getLokasi() {
        return lokasi;
    }

    public void setLokasi(String lokasi) {
        this.lokasi = lokasi;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public double getPanjangRumah() {
        return panjangRumah;
    }

    public void setPanjangRumah(double panjangRumah) {
        this.panjangRumah = panjangRumah;
    }

    public double getLebarRumah() {
        return lebarRumah;
    }

    public void setLebarRumah(double lebarRumah) {
        this.lebarRumah = lebarRumah;
    }

    public String getKetersediaan() {
        return ketersediaan;
    }

    public void setKetersediaan(String ketersediaan) {
        this.ketersediaan = ketersediaan;
    }
    
    public void tambahProperti(Properti properti) {
        String query = "INSERT INTO data_sdg.properti (nama, deskripsi, lokasi, harga, panjang_rumah, lebar_rumah, ketersediaan) VALUES (?, ?, ?, ?, ?, ?, ?)";
        try (Connection conn = this.connects.Connect();
            PreparedStatement preparedStatement = conn.prepareStatement(query)) {
            preparedStatement.setString(1, properti.getNama());
            preparedStatement.setString(2, properti.getDeskripsi());
            preparedStatement.setString(3, properti.getLokasi());
            preparedStatement.setDouble(4, properti.getHarga());
            preparedStatement.setDouble(5, properti.getPanjangRumah());
            preparedStatement.setDouble(6, properti.getLebarRumah());
            preparedStatement.setString(7, properti.getKetersediaan());

            int rowsAffected = preparedStatement.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Data berhasil dimasukkan ke tabel properti.");
            } else {
                System.out.println("Gagal memasukkan data ke tabel properti.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Gagal memasukkan data ke tabel properti: " + e.getMessage());
        }

    }

    public void hapusProperti(int propertiId) {
        String query = "DELETE FROM data_sdg.properti WHERE idProperti = ?";
        try (Connection conn = this.connects.Connect();
             PreparedStatement preparedStatement = conn.prepareStatement(query)) {
            preparedStatement.setInt(1, propertiId);

            int rowsAffected = preparedStatement.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Data berhasil dihapus dari tabel properti.");
            } else {
                System.out.println("Gagal menghapus data dari tabel properti.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Gagal menghapus data dari tabel properti: " + e.getMessage());
        }
    }
    
     public List<Properti> ambilSemuaProperti() {
        List<Properti> propertis = new ArrayList<>();
        String query = "SELECT * FROM data_sdg.properti";
        try (Connection conn = this.connects.Connect();
             PreparedStatement preparedStatement = conn.prepareStatement(query);
             ResultSet resultSet = preparedStatement.executeQuery()) {

            while (resultSet.next()) {
                int idProperti = resultSet.getInt("idProperti");
                String nama = resultSet.getString("nama");
                String deskripsi = resultSet.getString("deskripsi");
                String lokasi = resultSet.getString("lokasi");
                double harga = resultSet.getDouble("harga");
                double panjangRumah = resultSet.getDouble("panjang_rumah");
                double lebarRumah = resultSet.getDouble("lebar_rumah");
                String ketersediaan = resultSet.getString("ketersediaan");

                Properti properti = new Properti(nama, deskripsi, lokasi, harga, panjangRumah, lebarRumah, ketersediaan);
                properti.setIdProperti(idProperti);
                propertis.add(properti);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Gagal mengambil data properti: " + e.getMessage());
        }
        return propertis;
    }
     
     public void updateProperti(Properti properti) {
        String query = "UPDATE data_sdg.properti SET nama=?, deskripsi=?, lokasi=?, harga=?, panjang_rumah=?, lebar_rumah=?, ketersediaan=? WHERE idProperti=?";
        try (Connection conn = this.connects.Connect();
            PreparedStatement preparedStatement = conn.prepareStatement(query)) {
            preparedStatement.setString(1, properti.getNama());
            preparedStatement.setString(2, properti.getDeskripsi());
            preparedStatement.setString(3, properti.getLokasi());
            preparedStatement.setDouble(4, properti.getHarga());
            preparedStatement.setDouble(5, properti.getPanjangRumah());
            preparedStatement.setDouble(6, properti.getLebarRumah());
            preparedStatement.setString(7, properti.getKetersediaan());
            preparedStatement.setInt(8, properti.getIdProperti());

            int rowsAffected = preparedStatement.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Data properti berhasil diperbarui.");
            } else {
                System.out.println("Gagal memperbarui data properti.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Gagal memperbarui data properti: " + e.getMessage());
        }
    }
    
}
