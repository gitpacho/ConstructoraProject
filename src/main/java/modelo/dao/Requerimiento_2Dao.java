package modelo.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import modelo.vo.Requerimiento_2Vo;
import util.JDBCUtilities;

public class Requerimiento_2Dao {
    public String sql = "SELECT c.ID_Proyecto, mc.Nombre_Material , mc.Importado FROM Compra c JOIN MaterialConstruccion mc ON (c.ID_MaterialConstruccion = mc.ID_MaterialConstruccion) WHERE c.ID_Proyecto in (1,184,400) ORDER BY c.ID_Proyecto ;";
    public ArrayList<Requerimiento_2Vo> resultado = new ArrayList<Requerimiento_2Vo>();

    public ArrayList<Requerimiento_2Vo> requerimiento2() throws SQLException {
        try {
            
            Connection conexion = JDBCUtilities.getConnection();
            Statement stmt = conexion.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()){
                Requerimiento_2Vo Material = new Requerimiento_2Vo();
                Material.setID_Proyecto(rs.getInt("ID_Proyecto"));
                Material.setNombre_Material(rs.getString("Nombre_Material"));
                Material.setImportado(rs.getString("Importado"));
                resultado.add(Material);
            }
            conexion.close();
            stmt.close();
            rs.close();

        } catch (Exception e) {
            System.out.println("Error en requerimiento 2" + e.getMessage());
        } 
        return resultado;
}
}