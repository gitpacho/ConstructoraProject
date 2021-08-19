package controlador;

import java.sql.SQLException;
import java.util.ArrayList;

import modelo.dao.Requerimiento_1Dao;
import modelo.dao.Requerimiento_2Dao;
import modelo.dao.Requerimiento_3Dao;
import modelo.vo.Requerimiento_1Vo;
import modelo.vo.Requerimiento_2Vo;
import modelo.vo.Requerimiento_3Vo;

public class ControladorRequerimientos {
    public static Requerimiento_1Dao dao;
    public static Requerimiento_2Dao dao2;
    public static Requerimiento_3Dao dao3;

    public ArrayList<Requerimiento_1Vo> consultarRequerimiento1() throws SQLException {
        dao = new Requerimiento_1Dao();
        ArrayList<Requerimiento_1Vo> result = null;
        try {
            result = dao.requerimiento1();
        } catch (Exception e) {
            System.out.println("Se ha producido el siguiente error:" + e.getMessage());
            e.printStackTrace();
        }
        return result;
    }

    public ArrayList<Requerimiento_2Vo> consultarRequerimiento2() throws SQLException {
        dao2 = new Requerimiento_2Dao();
        ArrayList<Requerimiento_2Vo> lista = null;
        try {
            lista = dao2.requerimiento2();
        } catch (Exception e) {
            System.out.println("Se ha producido el siguiente error:" + e.getMessage());
            e.printStackTrace();
        }
        return lista;
    }

    public boolean consultarRequerimiento3(Requerimiento_3Vo lider) throws SQLException {
        dao3 = new Requerimiento_3Dao();
        boolean estado = false;
        try {
            estado = dao3.requerimiento3(lider);
        } catch (Exception e) {
            System.out.println("Se ha producido el siguiente error:" + e.getMessage());
            e.printStackTrace();
        }
        return estado;
    }
}
