package modelo.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import modelo.vo.Requerimiento_3Vo;
import util.JDBCUtilities;

public class Requerimiento_3Dao {
        public String sql;
        public Boolean resultado = false;
        
        public Boolean requerimiento3(Requerimiento_3Vo lider) throws SQLException {
            sql = "INSERT INTO Lider " + 
                  "(Nombre, Primer_Apellido, Segundo_Apellido, Salario, Ciudad_Residencia, Cargo, Clasificacion, Documento_Identidad, Fecha_Nacimiento) " +
                  "VALUES ('" +
                  lider.getNombre()              + "', '" + 
                  lider.getPrimer_Apellido()     + "', '" + 
                  lider.getSegundo_Apellido()    + "', " + 
                  lider.getSalario()             + ", '" + 
                  lider.getCiudad_Residencia()   + "', '" +
                  lider.getCargo()               + "', '" +
                  lider.getClasificacion()       + "', " +
                  lider.getDocumento_Identidad() + ", '" +
                  lider.getFecha_Nacimiento()    + "');";
            
            try {
                Connection conexion = JDBCUtilities.getConnection();
                Statement stmt = conexion.createStatement();
                Integer rs = stmt.executeUpdate(sql);

                if (rs != -1) {
                    resultado = true;
                }

                conexion.close();
                stmt.close();

            } catch (Exception e) {
                System.out.println("Error en requerimiento 3" + e.getMessage());
            } 
            return resultado;
            
    }
}