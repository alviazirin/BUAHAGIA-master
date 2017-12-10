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
 * @author Rangora
 */
public class maset extends func {

    public maset() throws SQLException {
    }

    public int getUang(String username) throws SQLException {
        String query = "SELECT uang FROM player WHERE username = '" + username + "'";
        return getDataInt(query);
    }

    public String getIdKualitas(String kualitas) throws SQLException {
        String query = "SELECT `idKualitas` FROM `kualitas` WHERE `Kualitas` = '" + kualitas + "'";
        ResultSet hasil = con.getResult(query);
        hasil.next();
        String data = hasil.getString(1).toUpperCase();
        return data;
    }

    public int getJmlBuahAll(String username, int idBuah) throws SQLException {
        String query = "SELECT sum(JumlahBeli) from pembelianbuah a join player b on a.idPlayer = b.idPlayer "
                + "where a.idBuah='" + idBuah + "' and b.username='" + username + "'";
        System.out.println(query);
        return getDataInt(query);
    }

    public int getJmlBuah(String username, int idBuah, int idKualitas) throws SQLException {
        String query = "SELECT sum(JumlahBeli) from pembelianbuah a join player b on a.idPlayer = b.idPlayer "
                + "where a.idBuah='" + idBuah + "' and b.username='" + username + "' and "
                + "a.idKualitas='" + idKualitas + "'";
        System.out.println(query);
        return getDataInt(query);
    }

    public int getKualitasBuah(String username, int idBuah, int idKualitas) throws SQLException {
        String query = "SELECT JumlahBeli FROM player p join pembelianbuah "
                + "pb on p.idPlayer = pb.idPlayer "
                + "where pb.idBuah='" + idBuah + "' and p.username='" + username + "' and pb.idKualitas='" + idKualitas + "'";
        return getDataInt(query);
    }

    public int getJmlBahan(String username, int idBahan) throws SQLException {
        String query = "SELECT JumlahBeli from pembelianbahan a join player b on a.idPlayer = b.idPlayer "
                + "where a.idBahan='" + idBahan + "' and b.username='" + username + "'";
        return getDataInt(query);
    }

    public int getJmlProduk(String username, int idProduk, int idKualitas) throws SQLException {
        String query = "SELECT Jumlah from hasilpengolahan a join player b on a.idPlayer = b.idPlayer "
                + "where a.idProduk='" + idProduk + "' and a.idKualitas='" + idKualitas + "' and b.username='" + username + "'";
        return getDataInt(query);
    }

    public int getJmlProdukAll(String username, int idProduk) throws SQLException {
        String query = "SELECT sum(a.Jumlah) from hasilpengolahan a join player b on a.idPlayer = b.idPlayer "
                + "where a.idProduk='" + idProduk + "' and b.username='" + username + "'";
        return getDataInt(query);
    }

    public int getJus(String username) throws SQLException {
        String query = "SELECT sum(Jumlah) FROM `hasilpengolahan` join player on player.idPlayer=hasilpengolahan.idPlayer "
                + "WHERE hasilpengolahan.idProduk in (1,2,3,4,5) and player.username='" + username + "' ";
        return getDataInt(query);
    }

    public int getKripik(String username) throws SQLException {
        String query = "SELECT sum(Jumlah) FROM `hasilpengolahan` join player on player.idPlayer=hasilpengolahan.idPlayer "
                + "WHERE hasilpengolahan.idProduk in (6,7,8) and player.username='" + username + "' ";
        return getDataInt(query);
    }

    public int getSale(String username) throws SQLException {
        String query = "SELECT sum(Jumlah) FROM `hasilpengolahan` join player on player.idPlayer=hasilpengolahan.idPlayer "
                + "WHERE hasilpengolahan.idProduk=14 and player.username='" + username + "' ";
        return getDataInt(query);
    }
    public int getStatusLegend(String username) throws SQLException {
        String query = "SELECT status from penghargaan a join player b "
                + "on a.idPlayer = b.idPlayer "
                + "where a.penghargaan = 'legend' and b.username='"+username+"' ";
        return getDataInt(query);
    }

    public boolean insertAset(int idPlayer) {
        String query = "UPDATE `player` SET `uang` = 500000 WHERE `player`.`idPlayer` = '" + idPlayer + "';";
        System.out.println(query);
        return getStatusQuery(query);
    }

    public boolean insertResep(String username, String resep) {
        String query = "INSERT INTO `resep`(`id`, `idPlayer`, `resep`) "
                + "VALUES (null, (select idPlayer from player where username = '"+username+"'),'" + resep + "')";
        System.out.println(query);
        return getStatusQuery(query);
    }

    public boolean updateUang(int uang, String username) throws SQLException {
        String query = "UPDATE `player` SET `uang` = '" + (uang + "") + "' WHERE `player`.`username` = '" + username + "'";
        System.out.println(query);
        return getStatusQuery(query);
    }

    public boolean resetUang(String username) throws SQLException {
        String query = "UPDATE `player` SET `uang` = 500000 WHERE `player`.`username` = '" + username + "';";
        System.out.println(query);
        return getStatusQuery(query);
    }

    public boolean resetPenghargaan(String idPlayer) throws SQLException {
        String query = "UPDATE `penghargaan` SET `status`= 0 WHERE idPlayer='" + idPlayer + "'";
        System.out.println(query);
        return getStatusQuery(query);
    }

    public boolean resetResep(String username) throws SQLException {
        String query = "DELETE FROM `resep` WHERE "
                + "idPlayer=(SELECT idPlayer from player where username='"+username+"' "
                + "and resep not in ('jusbuah','brownis')";
        System.out.println(query);
        return getStatusQuery(query);
    }

    public boolean updatePenghargaan(String username, String penghargaan,int status) throws SQLException {
        String query = "UPDATE `penghargaan` SET status = '"+status+"' "
                + "where penghargaan='"+penghargaan+"' "
                + "and idPlayer=(SELECT idPlayer from player where username = '"+username+"')";
        System.out.println(query);
        return getStatusQuery(query);
    }

    public boolean insertPenghargaan(String idPlayer) {
        String query = "INSERT INTO `penghargaan`(`id`, `idPlayer`, `penghargaan`,`status`) "
                + "VALUES (null,'" + idPlayer + "','simanis',0), "
                + "(null,'" + idPlayer + "','sisehat',0), "
                + "(null,'" + idPlayer + "','sigembul',0), "
                + "(null,'" + idPlayer + "','tukangblender',0), "
                + "(null,'" + idPlayer + "','kriuk',0), "
                + "(null,'" + idPlayer + "','ramerasanya',0), "
                + "(null,'" + idPlayer + "','pebisnisesbuah',0), "
                + "(null,'" + idPlayer + "','juraganroti',0), "
                + "(null,'" + idPlayer + "','pengusahasale',0), "
                + "(null,'" + idPlayer + "','maniakapel',0), "
                + "(null,'" + idPlayer + "','maniakmelon',0), "
                + "(null,'" + idPlayer + "','maniakmangga',0), "
                + "(null,'" + idPlayer + "','saudagar',0), "
                + "(null,'" + idPlayer + "','legend',0)";
        System.out.println(query);
        return getStatusQuery(query);
    }

    public boolean cekAchv(String username, String penghargaan, int stat) throws SQLException {
        String query = "SELECT `penghargaan` FROM `penghargaan` join `player` "
                + "on `player`.`idPlayer` = `penghargaan`.`idPlayer`"
                + "WHERE  `player`.`username` = '" + username + "' "
                + "and `penghargaan`.`penghargaan`='" + penghargaan + "' "
                + "and `penghargaan`.status='"+stat+"'";
        boolean status = false;
        try {
            rs = con.getResult(query);
            if (rs.next()) {
                rs.getString("penghargaan");
                status = true;
            }
        } catch (SQLException e) {
            System.out.println("penghargaan zonk");
        }
        return status;
    }

    public boolean cekResep(String username, String resep) throws SQLException {
        String query = "SELECT resep FROM resep "
                + "JOIN player on player.idPlayer=resep.idPlayer "
                + "where resep.resep ='" + resep + "' "
                + "and player.username='" + username + "'";
        boolean status = false;
        System.out.println(query);
        try {
            rs = con.getResult(query);
            if (rs.next()) {
                rs.getString("resep");
                status = true;
                System.out.println("gak zonk");
            }
        } catch (SQLException e) {
            System.out.println("penghargaan zonk");
        }
        System.out.println(query);
        return status;
    }
}
