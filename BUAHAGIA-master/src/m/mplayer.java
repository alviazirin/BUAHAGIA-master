/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Farisya
 */
public class mplayer extends func {

    ResultSet rs;
    koneksi con;

    public mplayer() throws SQLException {
        this.con = new koneksi();
        con = new koneksi();
    }

    public int cekIdP() throws SQLException { //buat cek apakah id ada atau kosong
        String query = "select idPlayer from player where idPlayer = ";
        return checkId(query);
    }

    public boolean insertPlayer(int idPlayer, String username) {
        String query = "INSERT INTO `player` (`idPlayer`, `username`, `uang`) VALUES ('" + idPlayer + "', '" + username
                + "', '5000000')";
        return getStatusQuery(query);
    }

    public boolean getPlayer(String username) throws SQLException {
        String query = "SELECT * FROM `player` WHERE  username = '" + username + "'";
        boolean status = false;
        try {
            rs = con.getResult(query);
            if (rs.next()) {
                status = true;
            }
        } catch (SQLException e) {
            System.out.println("Salah");
        }
        return status;
    }


    public boolean cekUsername(String username) throws SQLException {
        String query = "SELECT `username` FROM `player` WHERE  `username` = '" + username + "'";
        boolean status = false;
        try {
            rs = con.getResult(query);
            if (rs.next()) {
                rs.getString("username");
                System.out.println(rs.getString("username"));
                System.out.println("anu");
                status = true;
            }
            System.out.println("rs" + rs);
            System.out.println(query);
        } catch (SQLException e) {
            System.out.println("hemmmmmmmm");
        }
        return status;
    }
}
