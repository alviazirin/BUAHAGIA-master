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
public class mpembelian extends func {

    public mpembelian() throws SQLException {

    }

    public int cekIdBeliBahan() throws SQLException {
        String query = "select idBeliB from pembelianBahan where idBeliB = ";
        return checkId(query);
    }

    public int cekIdBeliBuah() throws SQLException {
        String query = "select idBeliBuah from pembelianBuah where idBeliBuah = ";
        return checkId(query);
    }

    public int getIdKualitas(String kualitas) throws SQLException {
        String query = "select idKualitas from kualitas where Kualitas = '" + kualitas + "'";
        return getDataInt(query);
    }

    public int getBahan(String username, int idBahan) throws SQLException {
        String query = "select sum(Jumlah) from belibahan b join player p on p.idPlayer=b.idPlayer "
                + "where b.idBahan = '" + idBahan + "' and p.username ='" + username + "' ";
        return getDataInt(query);
    }

    public int getBuah(String username, int idBuah) throws SQLException {
        String query = "select sum(Jumlah) from belibuah b join player p on p.idPlayer=b.idPlayer "
                + "where b.idBuah = '" + idBuah + "' and p.username ='" + username + "' ";
        return getDataInt(query);
    }

    public boolean insertBahan(int idBeli, String idPlayer, int idBahan, int stok) {
        String query = "INSERT INTO `pembelianBahan`(`idBeliB`, `idPlayer`, `idBahan`, `JumlahBeli`) VALUES ('" + idBeli + "','" + idPlayer + "','" + idBahan + "','" + stok + "')";
        System.out.println("ye");
        System.out.println(query);
        return getStatusQuery(query);
    }

    public boolean beliBahan(int idBahan, String username, int jml) { //gausamasuksequence dan kelasdig
        String query = "INSERT INTO `belibahan`(`id`,`idBahan`,`idPlayer`,`Jumlah`) "
                + "VALUES (null,'" + idBahan + "',(select idPlayer from player where username = '" + username + "'),'" + jml + "')";
        System.out.println("ye");
        System.out.println(query);
        return getStatusQuery(query);
    }

    public boolean beliBuah(int idBuah, String username, int jml) { //gausamasuksequence dan kelasdig
        String query = "INSERT INTO `belibuah`(`id`,`idBUah`,`idPlayer`,`Jumlah`) "
                + "VALUES (null,'" + idBuah + "',(select idPlayer from player where username = '" + username + "'),'" + jml + "')";
        System.out.println("ye");
        System.out.println(query);
        return getStatusQuery(query);
    }

    public boolean insertBuah(int idBeli, String idPlayer, int idBuah, int idKualitas, int harga, int stok) {
        String query = "INSERT INTO `pembelianbuah`(`idBeliBuah`, `idPlayer`, "
                + "`idBuah`, `idKualitas`, `Harga`, `JumlahBeli`) VALUES ('" + idBeli + "','" + idPlayer + "','" + idBuah + "','" + idKualitas + "','" + harga + "','" + stok + "')";
        System.out.println(query);
        return getStatusQuery(query);
    }

    public boolean insertBeliBuah(String idPlayer) {
        String query = "INSERT INTO `pembelianbuah`(`idBeliBuah`, `idPlayer`, "
                + "`idBuah`, `idKualitas`, `JumlahBeli`) "
                + "VALUES "
                + "(null,'" + idPlayer + "','1','1','0'),"
                + "(null,'" + idPlayer + "','1','2','0'),"
                + "(null,'" + idPlayer + "','1','3','0'),"
                + "(null,'" + idPlayer + "','2','1','0'),"
                + "(null,'" + idPlayer + "','2','2','0'),"
                + "(null,'" + idPlayer + "','2','3','0'),"
                + "(null,'" + idPlayer + "','3','1','0'),"
                + "(null,'" + idPlayer + "','3','2','0'),"
                + "(null,'" + idPlayer + "','3','3','0'),"
                + "(null,'" + idPlayer + "','4','1','0'),"
                + "(null,'" + idPlayer + "','4','2','0'),"
                + "(null,'" + idPlayer + "','4','3','0'),"
                + "(null,'" + idPlayer + "','5','1','0'),"
                + "(null,'" + idPlayer + "','5','2','0'),"
                + "(null,'" + idPlayer + "','5','3','0')";
        System.out.println(query);
        return getStatusQuery(query);
    }

    public boolean insertBeliBahan(String idPlayer) {
        String query = "INSERT INTO `pembelianbahan`(`idBeliB`, `idPlayer`, "
                + "`idBahan`, `JumlahBeli`) "
                + "VALUES "
                + "(null,'" + idPlayer + "','1','0'),"
                + "(null,'" + idPlayer + "','2','0'),"
                + "(null,'" + idPlayer + "','3','0'),"
                + "(null,'" + idPlayer + "','4','0'),"
                + "(null,'" + idPlayer + "','5','0'),"
                + "(null,'" + idPlayer + "','6','0'),"
                + "(null,'" + idPlayer + "','7','0'),"
                + "(null,'" + idPlayer + "','8','0'),"
                + "(null,'" + idPlayer + "','9','0'),"
                + "(null,'" + idPlayer + "','10','0')";
        System.out.println(query);
        return getStatusQuery(query);
    }

    public boolean tambahPembelianBuah(int jml, int idBuah, int idKualitas, String username) throws SQLException {
        String query = "UPDATE `pembelianbuah` SET `JumlahBeli` = '" + jml + "' WHERE `idBuah` = '" + idBuah + "'"
                + "and idKualitas='" + idKualitas + "' and "
                + "idPlayer=(select idPlayer from player where username = '" + username + "')";
        System.out.println(query);
        return getStatusQuery(query);
    }

    public boolean tambahPembelianBahan(int jml, int idBahan, String username) throws SQLException {
        String query = "UPDATE `pembelianbahan` SET `JumlahBeli` = '" + jml + "' WHERE `idBahan` = '" + idBahan + "'"
                + "and idPlayer = (select idPlayer from player where username = '" + username + "')";
        System.out.println(query);
        return getStatusQuery(query);
    }

    public boolean resetPembelianBahan(String username) throws SQLException {
        String query = "UPDATE `pembelianbahan` SET `JumlahBeli` = '0' "
                + "WHERE idPlayer = (select idPlayer from player where username = '" + username + "')";
        return getStatusQuery(query);
    }

    public boolean resetBeliBahan(String username) throws SQLException {
        String query = "Delete from belibahan WHERE idPlayer = (select idPlayer from player where username = '" + username + "')";
        return getStatusQuery(query);
    }

    public boolean resetBeliBuah(String username) throws SQLException {
        String query = "Delete from belibuah WHERE idPlayer = (select idPlayer from player where username = '" + username + "')";
        return getStatusQuery(query);
    }

    public boolean resetPembelianBuah(String username) throws SQLException {
        String query = "UPDATE `pembelianbuah` SET `JumlahBeli` = '0' "
                + "WHERE idPlayer = (select idPlayer from player where username = '" + username + "')";
        return getStatusQuery(query);
    }

    public boolean deleteHarga() {
        String query = "DELETE FROM `harga`";
        return getStatusQuery(query);
    }

    public int getHarga(String idHarga) throws SQLException {
        String query = "select Harga from harga where idHarga = '" + idHarga + "'";
        return getDataInt(query);
    }

    public boolean insertHarga1() {
        String query = "INSERT INTO `harga` (`idHarga`, `idBuah`,`idKualitas`,`nomorkedai`, `Harga`) "
                + "VALUES ('1A1', '1', '1', '1','35000'), "
                + "('1A2', '1', '2','1', '30000'),"
                + "('1A3', '1', '3','1', '24000'),"
                + "('1P1','2','1', '1','17000'),"
                + "('1P2', '2', '2','1', '15000'),"
                + "('1P3', '2', '3','1', '13000'),"
                + "('131','3','1','1','15000'),"
                + "('132','3','2','1','14000'),"
                + "('133','3','3','1','13000'),"
                + "('1S1', '4','1','1','6000'),"
                + "('1S2','4','2','1','5000'),"
                + "('1S3','4','3','1','4000'),"
                + "('151','5','1','1','9000'),"
                + "('152','5','2','1','7000'),"
                + "('153','5','3','1','5000'), "
                + "('2A1', '1', '1','2', '34000'), "
                + "('2A2', '1', '2','2', '29000'),"
                + "('2A3', '1', '3','2', '24000'),"
                + "('2P1','2','1', '2','18000'),"
                + "('2P2', '2', '2', '2','16000'),"
                + "('2P3', '2', '3', '2','13000'),"
                + "('231','3','1','2','16000'),"
                + "('232','3','2','2','15000'),"
                + "('233','3','3','2','13000'),"
                + "('2S1', '4','1','2','7000'),"
                + "('2S2','4','2','2','6000'),"
                + "('2S3','4','3','2','4000'),"
                + "('251','5','1','2','9000'),"
                + "('252','5','2','2','8000'),"
                + "('253','5','3','2','6000')";
        System.out.println(query);
        return getStatusQuery(query);
    }

    public boolean insertHarga2() {
        String query = "INSERT INTO `harga` (`idHarga`, `idBuah`,`idKualitas`,`nomorkedai`, `Harga`) VALUES "
                + "('1A1', '1', '1', '1','36000'),"
                + " ('1A2', '1', '2','1', '32000'),"
                + "('1A3', '1', '3','1', '25000'),"
                + "('1P1','2','1', '1','18000'),"
                + "('1P2', '2', '2','1', '16000'),"
                + "('1P3', '2', '3','1', '14000'),"
                + "('131','3','1','1','17000'),"
                + "('132','3','2','1','15000'),"
                + "('133','3','3','1','14000'),"
                + "('1S1', '4','1','1','7000'),"
                + "('1S2','4','2','1','6000'),"
                + "('1S3','4','3','1','4000'),"
                + "('151','5','1','1','10000'),"
                + "('152','5','2','1','8000'),"
                + "('153','5','3','1','7000'), "
                + "('2A1', '1', '1','2', '33000'), "
                + "('2A2', '1', '2','2', '28000'),"
                + "('2A3', '1', '3','2', '23000'),"
                + "('2P1','2','1', '2','17000'),"
                + "('2P2', '2', '2', '2','15000'),"
                + "('2P3', '2', '3', '2','13000'),"
                + "('231','3','1','2','15000'),"
                + "('232','3','2','2','14000'),"
                + "('233','3','3','2','13000'),"
                + "('2S1', '4','1','2','6000'),"
                + "('2S2','4','2','2','5000'),"
                + "('2S3','4','3','2','4000'),"
                + "('251','5','1','2','9000'),"
                + "('252','5','2','2','7000'),"
                + "('253','5','3','2','5000')";
        System.out.println(query);
        return getStatusQuery(query);
    }

    public boolean insertHarga3() {
        String query = "INSERT INTO `harga` (`idHarga`, `idBuah`,`idKualitas`, `nomorkedai`, `Harga`) VALUES "
                + "('1A1', '1', '1','1', '32000'), "
                + "('1A2', '1', '2','1', '27000'),"
                + "('1A3', '1', '3','1', '25000'),"
                + "('1P1','2','1', '1','15000'),"
                + "('1P2', '2', '2', '1','13000'),"
                + "('1P3', '2', '3', '1','12000'),"
                + "('131','3','1','1','13000'),"
                + "('132','3','2','1','12000'),"
                + "('133','3','3','1','11000'),"
                + "('1S1', '4','1','1','5000'),"
                + "('1S2','4','2','1','4000'),"
                + "('1S3','4','3','1','3000'),"
                + "('151','5','1','1','7000'),"
                + "('152','5','2','1','6000'),"
                + "('153','5','3','1','4000'),"
                + "('2A1', '1', '1', '2','35000'),"
                + " ('2A2', '1', '2','2', '30000'),"
                + "('2A3', '1', '3','2', '24000'),"
                + "('2P1','2','1', '2','17000'),"
                + "('2P2', '2', '2','2', '15000'),"
                + "('2P3', '2', '3','2', '13000'),"
                + "('231','3','1','2','15000'),"
                + "('232','3','2','2','14000'),"
                + "('233','3','3','2','13000'),"
                + "('2S1', '4','1','2','6000'),"
                + "('2S2','4','2','2','5000'),"
                + "('2S3','4','3','2','4000'),"
                + "('251','5','1','2','9000'),"
                + "('252','5','2','2','7000'),"
                + "('253','5','3','2','5000')";
        System.out.println(query);
        return getStatusQuery(query);
    }
}
