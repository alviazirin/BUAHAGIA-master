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
public class molah extends func {

    public molah() throws SQLException {

    }

    public int selectIdBeli(int idBuah) throws SQLException {
        String query = "select o.idBeli from olahbuah o join "
                + "pembelianbuah p on p.idBeliBuah = o.idBeli "
                + "WHERE p.idBuah ='" + idBuah + "' limit 1";
        return getDataInt(query);
    }

    public int selectIdOlahBuah(int idBuah, int idKualitas) throws SQLException {
        String query = "select o.idBeli from olahbuah o join "
                + "pembelianbuah p on p.idBeliBuah = o.idBeli "
                + "WHERE p.idBuah ='" + idBuah + "' and p.idKualitas = '" + idKualitas + "' limit 1";
        return getDataInt(query);
    }

    public int selectIdOlahBahan(int idBahan) throws SQLException {
        String query = "select o.idBeli from olahbahan o join "
                + "pembelianbahan p on p.idBeliB = o.idBeli "
                + "WHERE p.idBahan ='" + idBahan + "' limit 1";
        return getDataInt(query);
    }

    public int getProduk(String username, int id1, int id2, int id3, int id4, int id5) throws SQLException {
        String query = "select sum(Jumlah) from olahproduk b join player p on p.idPlayer=b.idPlayer "
                + "where b.idProduk in ('" + id1 + "','" + id2 + "','" + id3 + "','" + id4 + "','" + id5 + "') "
                + "and p.username ='" + username + "' ";
        return getDataInt(query);
    }

    public boolean olahProduk(int idProduk, String idPlayer, int jml) {
        String query = "INSERT INTO `olahproduk`(`id`, `idProduk`, `idPlayer`, `Jumlah`) "
                + "VALUES (null,'" + idProduk + "','" + idPlayer + "','" + jml + "')";
        System.out.println("ye");
        System.out.println(query);
        return getStatusQuery(query);
    }
//
//    public int cekIdHasilOlah() throws SQLException {
//        String query = "select idHasilOlah from hasilpengolahan where idHasilOlah = ";
//        return checkId(query);
//    }

    public int updateStok(String kualitas) throws SQLException {
        String query = "select idKualitas from kualitas where Kualitas = '" + kualitas + "'";
        return getDataInt(query);
    }

    public boolean resetHasilPengolahan(String username) throws SQLException {
        String query = "UPDATE `hasilpengolahan` SET `Jumlah` = '0' "
                + "WHERE idPlayer = (select idPlayer from player where username = '"+username+"')";
        return getStatusQuery(query);
    }

    public boolean resetOlah(String username) throws SQLException { //gausamasuk
        String query = "Delete from olahproduk WHERE idPlayer = (select idPlayer from player where username = '"+username+"')";
        return getStatusQuery(query);
    }

    public boolean insertHasilOlah(String idPlayer) {
        String query = "INSERT INTO `hasilpengolahan`(`idHasilOlah`, `idProduk`, "
                + "`idKualitas`,`idPlayer`, `Jumlah`) "
                + "VALUES "
                + "(null,'1','1','" + idPlayer + "','0'),"
                + "(null,'1','2','" + idPlayer + "','0'),"
                + "(null,'1','3','" + idPlayer + "','0'),"
                + "(null,'2','1','" + idPlayer + "','0'),"
                + "(null,'2','2','" + idPlayer + "','0'),"
                + "(null,'2','3','" + idPlayer + "','0'),"
                + "(null,'3','1','" + idPlayer + "','0'),"
                + "(null,'3','2','" + idPlayer + "','0'),"
                + "(null,'3','3','" + idPlayer + "','0'),"
                + "(null,'4','1','" + idPlayer + "','0'),"
                + "(null,'4','2','" + idPlayer + "','0'),"
                + "(null,'4','3','" + idPlayer + "','0'),"
                + "(null,'5','1','" + idPlayer + "','0'),"
                + "(null,'5','2','" + idPlayer + "','0'),"
                + "(null,'5','3','" + idPlayer + "','0'),"
                + "(null,'6','1','" + idPlayer + "','0'),"
                + "(null,'6','2','" + idPlayer + "','0'),"
                + "(null,'6','3','" + idPlayer + "','0'),"
                + "(null,'7','1','" + idPlayer + "','0'),"
                + "(null,'7','2','" + idPlayer + "','0'),"
                + "(null,'7','3','" + idPlayer + "','0'),"
                + "(null,'8','1','" + idPlayer + "','0'),"
                + "(null,'8','2','" + idPlayer + "','0'),"
                + "(null,'8','3','" + idPlayer + "','0'),"
                + "(null,'9','1','" + idPlayer + "','0'),"
                + "(null,'9','2','" + idPlayer + "','0'),"
                + "(null,'9','3','" + idPlayer + "','0'),"
                + "(null,'10','1','" + idPlayer + "','0'),"
                + "(null,'10','2','" + idPlayer + "','0'),"
                + "(null,'10','3','" + idPlayer + "','0'),"
                + "(null,'11','1','" + idPlayer + "','0'),"
                + "(null,'11','2','" + idPlayer + "','0'),"
                + "(null,'11','3','" + idPlayer + "','0'),"
                + "(null,'12','1','" + idPlayer + "','0'),"
                + "(null,'12','2','" + idPlayer + "','0'),"
                + "(null,'12','3','" + idPlayer + "','0'),"
                + "(null,'13','1','" + idPlayer + "','0'),"
                + "(null,'13','2','" + idPlayer + "','0'),"
                + "(null,'13','3','" + idPlayer + "','0'),"
                + "(null,'14','1','" + idPlayer + "','0'),"
                + "(null,'14','2','" + idPlayer + "','0'),"
                + "(null,'14','3','" + idPlayer + "','0'),"
                + "(null,'15','1','" + idPlayer + "','0'),"
                + "(null,'15','2','" + idPlayer + "','0'),"
                + "(null,'15','3','" + idPlayer + "','0'),"
                + "(null,'16','1','" + idPlayer + "','0'),"
                + "(null,'16','2','" + idPlayer + "','0'),"
                + "(null,'16','3','" + idPlayer + "','0')";
        System.out.println(query);
        return getStatusQuery(query);
    }

    public boolean updateStokBuah(String username, int idBuah, int idKualitas, int jml) throws SQLException {
        String query = "UPDATE pembelianbuah set JumlahBeli='"+jml+"' "
                + "WHERE idBuah='"+idBuah+"' and idKualitas='"+idKualitas+"' and "
                + "idPlayer=(select idPlayer from player where username = '"+username+"') ";
        return getStatusQuery(query);
    }

    public boolean updateStokBahan(String username, int idBahan, int jml) throws SQLException {
        String query = "UPDATE pembelianbahan set JumlahBeli='"+jml+"' "
                + "WHERE idBahan='"+idBahan+"' and "
                + "idPlayer=(select idPlayer from player where username = '"+username+"')";
        return getStatusQuery(query);
    }

    public boolean tambahProduk(int idProduk, int idKualitas, String username, int jml) throws SQLException {
        String query = "UPDATE `hasilpengolahan` SET `Jumlah` = '" + jml + "' WHERE `idProduk` = '" + idProduk + "'"
                + "and idKualitas='" + idKualitas + "' and "
                + "idPlayer=(select idPlayer from player where username = '"+username+"')";
        System.out.println(query);
        return getStatusQuery(query);
    }
}
