package modelo.dao;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import modelo.vo.Requerimiento_1Vo;
import util.JDBCUtilities;

public class Requerimiento_1Dao {
    public String sql = "SELECT ID_Lider , Salario , Ciudad_Residencia FROM Lider l WHERE Salario > (SELECT MIN(Salario) FROM Lider l2) AND Ciudad_Residencia = 'Barranquilla' ORDER BY Salario ;";
    public ArrayList<Requerimiento_1Vo> resultado;
    public ArrayList<Requerimiento_1Vo> requerimiento1() throws SQLException {
        resultado = new ArrayList<Requerimiento_1Vo>();
        
        System.out.println("=============" + resultado.size());
        try {
            Connection conexion = JDBCUtilities.getConnection();
            Statement stmt = conexion.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()){
                Requerimiento_1Vo lider = new Requerimiento_1Vo();
                lider.setID_Lider(rs.getInt("ID_Lider"));
                lider.setSalario(rs.getInt("Salario"));
                lider.setCiudad_Residencia(rs.getString("Ciudad_Residencia"));
                resultado.add(lider);
            }

            conexion.close();
            stmt.close();
            rs.close();

        } catch (Exception e) {
            System.out.println("Error en requerimiento 1" + e.getMessage());
        } 
        return resultado;
    }
}