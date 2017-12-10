/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m;

import java.sql.SQLException;

/**
 *
 * @author Farisya
 */
public class mjual extends func {

    public mjual() throws SQLException {
    }

    public int cekIdPenjualan() throws SQLException {
        String query = "select idPenjualan from penjualan where idPenjualan = ";
        return checkId(query);
    }

    public int getIdKualitas(String kualitas) throws SQLException {
        String query = "select idKualitas from kualitas where Kualitas = '" + kualitas + "'";
        return getDataInt(query);
    }

    public int getProdukTerjual(int idProduk, int idKualitas, String username) throws SQLException {
        String query = "select sum(Jumlah) from penjualan where idProduk = '" + idProduk + "' "
                + "and idPlayer = (select idPlayer from player where username = '" + username + "') and idKualitas='" + idKualitas + "'";
        return getDataInt(query);
    }

    public int getProduk(String idPlayer, int id1, int id2, int id3, int id4, int id5) throws SQLException {
        String query = "select sum(Jumlah) from penjualan where idProduk in "
                + "('" + id1 + "','" + id2 + "','" + id3 + "','" + id4 + "','" + id5 + "') "
                + "and idPlayer = '" + idPlayer + "' ";
        return getDataInt(query);
    }

    public boolean updateStokProduk(int idProduk, int idKualitas, String username, int jml) throws SQLException {
        String query = "UPDATE `hasilpengolahan` SET `Jumlah` = '" + jml + "' WHERE `idProduk` = '" + idProduk + "'"
                + " and idKualitas='" + idKualitas + "' and "
                + "idPlayer=(select idPlayer from player where username = '" + username + "')";
        System.out.println(query);
        return getStatusQuery(query);
    }

    public boolean insertPenjualan(int idProduk, String username, int idKualitas, int jml) {
        String query = "INSERT INTO `penjualan`(`idPenjualan`, `idPlayer`, `idProduk`,`idKualitas`,`Jumlah`) "
                + "VALUES(null,(select idPlayer from player where username = '" + username + "'),'" + idProduk + "','" + idKualitas + "','" + jml + "')";
        System.out.println(query);
        return getStatusQuery(query);
    }

    public int getBrownisTerjual(String username) throws SQLException {
        String query = "SELECT sum(Jumlah) FROM `penjualan` join player "
                + "ON player.idPlayer=penjualan.idPlayer "
                + "WHERE player.username='" + username + "' and idProduk in(9,10,11,12,13)";
        return getDataInt(query);
    }

    public int getKripikTerjual(String username) throws SQLException {
        String query = "SELECT sum(Jumlah) FROM `penjualan` join player "
                + "ON player.idPlayer=penjualan.idPlayer "
                + "WHERE player.username='" + username + "' and idProduk in(6,7,8)";
        return getDataInt(query);
    }

    public int getSaleTerjual(String username) throws SQLException {
        String query = "SELECT sum(Jumlah) FROM `penjualan` join player "
                + "ON player.idPlayer=penjualan.idPlayer "
                + "WHERE player.username='" + username + "' and idProduk=14";
        return getDataInt(query);
    }

    public boolean resetPenjualan(String username) throws SQLException {
        String query = "DELETE FROM `penjualan` "
                + "WHERE idPlayer = (SELECT idPlayer from player where username='"+username+"')";
        return getStatusQuery(query);
    }
}
