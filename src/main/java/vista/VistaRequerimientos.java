package vista;

import java.util.ArrayList;
//import java.util.Scanner;

import controlador.ControladorRequerimientos;
import modelo.vo.Requerimiento_1Vo;
import modelo.vo.Requerimiento_2Vo;

import modelo.dao.Requerimiento_1Dao;
import modelo.dao.Requerimiento_2Dao;
import modelo.dao.Requerimiento_3Dao;

public class VistaRequerimientos {
    public static Requerimiento_1Dao dao = new Requerimiento_1Dao();
    public static Requerimiento_2Dao dao2 = new Requerimiento_2Dao();
    public static Requerimiento_3Dao dao3 = new Requerimiento_3Dao();

    public static final ControladorRequerimientos controlador = new ControladorRequerimientos();

    public static void requerimiento1() {
        ArrayList<Requerimiento_1Vo> lista = null;
        Object[][] dataTable;
        try {
            lista = controlador.consultarRequerimiento1();
            dataTable = new Object[lista.size()][3];

            int cont = 0;
            for (Requerimiento_1Vo requerimiento_1Vo : lista) {
                dataTable[cont][0] = requerimiento_1Vo.getID_Lider();
                dataTable[cont][1] = requerimiento_1Vo.getSalario();
                dataTable[cont][2] = requerimiento_1Vo.getCiudad_Residencia();
                cont = cont + 1;
            }
            System.out.println("ID_Lider\tSalario\tCiudad_Residencia");
            for (Requerimiento_1Vo requerimiento_1Vo : lista) {
                System.out.println(requerimiento_1Vo.getID_Lider() + "\t\t"+ requerimiento_1Vo.getSalario() + "\t" +requerimiento_1Vo.getCiudad_Residencia());
            }

            FormularioTable ventana = new FormularioTable(dataTable);
            ventana.setVisible(true);

            

        } catch (Exception e) {
            System.out.println("Se ha producido el siguiente error:" + e.getMessage());
            e.printStackTrace();
        }
    }

    public static void requerimiento2() {
        ArrayList<Requerimiento_2Vo> lista;
        Object[][] dataTable;
        try {
            lista = controlador.consultarRequerimiento2();
            dataTable = new Object[lista.size()][3];

            int cont = 0;
            for (Requerimiento_2Vo requerimiento_2Vo : lista) {
                dataTable[cont][0] = requerimiento_2Vo.getID_Proyecto();
                dataTable[cont][1] = requerimiento_2Vo.getNombre_Material();
                dataTable[cont][2] = requerimiento_2Vo.getImportado();
                cont = cont + 1;
            }
            
            System.out.println("ID_Proyecto\tNombre_Material\tImportado");
            for (Requerimiento_2Vo requerimiento_2Vo : lista) {
                System.out.println(requerimiento_2Vo.getID_Proyecto() + "\t\t"+ requerimiento_2Vo.getNombre_Material() + "\t" +requerimiento_2Vo.getImportado());
            }
            

            FormularioTable2 ventana = new FormularioTable2(dataTable);
            ventana.setVisible(true);

        } catch (Exception e) {
            System.out.println("Se ha producido el siguiente error:" + e.getMessage());
            e.printStackTrace();
        }
    }

    public static void requerimiento3() {
        //ArrayList<Requerimiento_3Vo> lista = controlador.consultarRequerimiento3();
        //Requerimiento_3Vo lider = new Requerimiento_3Vo();
        //Scanner sc = new Scanner(System.in);
//
        //System.out.println("Ingrese el nombre: ");
        //String Nombre = sc.next();
        //System.out.println("Ingrese el primer apellido: ");
        //String Primer_Apellido = sc.next();
        //System.out.println("Ingrese el segundo apellido: ");
        //String Segundo_Apellido = sc.next();
        //System.out.println("Ingrese el salario: ");
        //Double Salario = sc.nextDouble();
        //System.out.println("Ingrese la ciudad: ");
        //String Ciudad_Residencia = sc.next();
        //System.out.println("Ingrese el cargo: ");
        //String Cargo = sc.next();
        //System.out.println("Ingrese la clasificación: ");
        //String Clasificacion = sc.next();
        //System.out.println("Ingrese el documento de identidad: ");
        //Integer Documento_Identidad = sc.nextInt();
        //System.out.println("Ingrese la fecha de nacimiento: ");
        //String Fecha_Nacimiento = sc.next();
//
        //lider.setNombre(Nombre);
        //lider.setPrimer_Apellido(Primer_Apellido);
        //lider.setSegundo_Apellido(Segundo_Apellido);
        //lider.setSalario(Salario);
        //lider.setCiudad_Residencia(Ciudad_Residencia);
        //lider.setCargo(Cargo);
        //lider.setClasificacion(Clasificacion);
        //lider.setDocumento_Identidad(Documento_Identidad);
        //lider.setFecha_Nacimiento(Fecha_Nacimiento);
//
        //try {
        //    boolean estado = controlador.consultarRequerimiento3(lider);
        //    if (estado) {
        //        System.out.println("Lider almacenado");
        //    }else{
        //        System.out.println("Lider NO almacenado");
        //    }
        //} catch (Exception e) {
        //    System.out.println("Se ha producido el siguiente error:" + e.getMessage());
        //    e.printStackTrace();
        //} finally{
        //    sc.close();
        //}        
    }
}