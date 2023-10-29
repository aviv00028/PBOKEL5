package Control;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.sql.ResultSet;

public class Pembeli {
    private int idUser;
    private String nama;
    private String noHP;
    private String email;
    private String password;
    private Timestamp waktuDaftar;
    
    Connector connects = new Connector();

    public Pembeli(int idUser, String nama, String noHP, String email, String password, Timestamp waktuDaftar) {
        this.idUser = idUser;
        this.nama = nama;
        this.noHP = noHP;
        this.email = email;
        this.password = password;
        this.waktuDaftar = waktuDaftar;
    }

    public Pembeli() {
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNoHP() {
        return noHP;
    }

    public void setNoHP(String noHP) {
        this.noHP = noHP;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Timestamp getWaktuDaftar() {
        return waktuDaftar;
    }

    public void setWaktuDaftar(Timestamp waktuDaftar) {
        this.waktuDaftar = waktuDaftar;
    }
    
    public void tambahPembeli(Pembeli pembeli) {
        String query = "INSERT INTO data_sdg.pembeli (idUser, nama, noHP, email, password, waktuDaftar) VALUES (?, ?, ?, ?, ?, ?)";
        try (Connection conn = this.connects.Connect();
            
            PreparedStatement preparedStatement = conn.prepareStatement(query)) {
            preparedStatement.setInt(1, pembeli.getIdUser());
            preparedStatement.setString(2, pembeli.getNama());
            preparedStatement.setString(3, pembeli.getNoHP());
            preparedStatement.setString(4, pembeli.getEmail());
            preparedStatement.setString(5, pembeli.getPassword());
            preparedStatement.setTimestamp(6, pembeli.getWaktuDaftar());

            int rowsAffected = preparedStatement.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Data berhasil dimasukkan ke tabel users.");
            } else {
                System.out.println("Gagal memasukkan data ke tabel users.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Gagal memasukkan data ke tabel users: " + e.getMessage());
        }
    }
    
    public boolean isValidPembeli(String enteredUsername, String enteredPassword) {
        String query = "SELECT * FROM data_sdg.pembeli WHERE nama = ? AND password = ?";
        try (Connection conn = this.connects.Connect();
             PreparedStatement preparedStatement = conn.prepareStatement(query)) {
            preparedStatement.setString(1, enteredUsername);
            preparedStatement.setString(2, enteredPassword);

            ResultSet resultSet = preparedStatement.executeQuery();
            return resultSet.next(); // Mengembalikan true jika data pengguna ditemukan, false jika tidak.
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Gagal memeriksa login: " + e.getMessage());
            return false;
        }
    }

    public void hapusPembeli(int idUser) {
        String query = "DELETE FROM data_sdg.pembeli WHERE idUser = ?";
        try (Connection conn = this.connects.Connect();
            PreparedStatement preparedStatement = conn.prepareStatement(query)) {
            preparedStatement.setInt(1, idUser);

            int rowsAffected = preparedStatement.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Data berhasil dihapus dari tabel users.");
            } else {
                System.out.println("Gagal menghapus data dari tabel users.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Gagal menghapus data dari tabel users: " + e.getMessage());
        }
    }
    
}
