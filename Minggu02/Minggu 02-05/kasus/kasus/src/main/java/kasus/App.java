package kasus;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class App {
    public boolean someLibraryMethod() {
        return true;
    }
    public static void main( String[] args ) throws SQLException {
        try (Connection conn = DriverManager.getConnection("jdbc:mariadb://localhost/persewaan", "root", null)) {
            try (Statement stmt = conn.createStatement()) {
                try (ResultSet result = stmt.executeQuery("SELECT nama from penyewa where id=1")) {
                    result.first();
                    System.out.println(result.getString("nama")+" menyewa: ");
                }
                
                try (ResultSet rs = stmt.executeQuery("SELECT movie.movie FROM `sewa` JOIN movie ON movie.id=sewa.id_movie WHERE sewa.id_penyewa=1")) {
                    while (rs.next()){
                    System.out.println(rs.getString("movie"));
                    }
                }
            }
        }
    }
}