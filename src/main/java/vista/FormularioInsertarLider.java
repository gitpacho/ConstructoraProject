package vista;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import controlador.ControladorRequerimientos;

import modelo.dao.Requerimiento_3Dao;
import modelo.vo.Requerimiento_3Vo;

import java.awt.event.*;
import java.sql.SQLException;

public class FormularioInsertarLider extends JFrame implements ActionListener{
    private JLabel labelLider, LabelNombre, LabelPrimerApellido, LabelSegundoApellido, LabelSalario, LabelCiudadResidencia, LabelCargo, LabelClasificacion, LabelDocumentoIdentidad, LabelFechaNacimiento;
    private JTextField textNombre, textPrimerApellido, textSegundoApellido, textSalario, textCiudadResidencia, textCargo, textClasificacion, textDocumentoIdentidad, textFechaNacimiento;
    private JButton botonAgregar;

    public FormularioInsertarLider() {
        setLayout(null);
        setDefaultCloseOperation(3);
        setTitle("Insertar");
        setResizable(false);
        labelLider = new JLabel("NUEVO LIDER");
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        setBounds(880, 265, 330, 370);

        labelLider.setBounds(120, 10, 300, 50);
        LabelNombre = new JLabel("Nombre:");
        LabelPrimerApellido = new JLabel("Primer apellido:");
        LabelSegundoApellido = new JLabel("Segundo apellido:");
        LabelSalario = new JLabel("Salario: ");
        LabelCiudadResidencia = new JLabel("Ciudad residencia:");
        LabelCargo = new JLabel("Cargo: ");
        LabelClasificacion = new JLabel("Clasificación: ");
        LabelDocumentoIdentidad = new JLabel("Documento identificación: ");
        LabelFechaNacimiento = new JLabel("Fecha de nacimiento:");

        LabelNombre.setBounds(20, 45 + 10, 160, 25);
        LabelPrimerApellido.setBounds(20, 70 + 10, 160, 25);
        LabelSegundoApellido.setBounds(20, 95 + 10, 160, 25);
        LabelSalario.setBounds(20, 120 + 10, 160, 25);
        LabelCiudadResidencia.setBounds(20, 145 + 10, 160, 25);
        LabelCargo.setBounds(20, 170 + 10, 160, 25);
        LabelClasificacion.setBounds(20, 195 + 10, 160, 25);
        LabelDocumentoIdentidad.setBounds(20, 220 + 10, 160, 25);
        LabelFechaNacimiento.setBounds(20, 245 + 10, 160, 25);

        add(labelLider);
        add(LabelNombre);
        add(LabelPrimerApellido);
        add(LabelSegundoApellido);
        add(LabelSalario);
        add(LabelCiudadResidencia);
        add(LabelCargo);
        add(LabelClasificacion);
        add(LabelDocumentoIdentidad);
        add(LabelFechaNacimiento);

        textNombre = new JTextField();
        textPrimerApellido = new JTextField();
        textSegundoApellido = new JTextField();
        textSalario = new JTextField();
        textCiudadResidencia = new JTextField();
        textCargo = new JTextField();
        textClasificacion = new JTextField();
        textDocumentoIdentidad = new JTextField();
        textFechaNacimiento = new JTextField();

        textNombre.setBounds(180, 45 + 10, 110, 25);
        textPrimerApellido.setBounds(180, 70 + 10, 110, 25);
        textSegundoApellido.setBounds(180, 95 + 10, 110, 25);
        textSalario.setBounds(180, 120 + 10, 110, 25);
        textCiudadResidencia.setBounds(180, 145 + 10, 110, 25);
        textCargo.setBounds(180, 170 + 10, 110, 25);
        textClasificacion.setBounds(180, 195 + 10, 110, 25);
        textDocumentoIdentidad.setBounds(180, 220 + 10, 110, 25);
        textFechaNacimiento.setBounds(180, 245 + 10, 110, 25);

        add(textNombre);
        add(textPrimerApellido);
        add(textSegundoApellido);
        add(textSalario);
        add(textCiudadResidencia);
        add(textCargo);
        add(textClasificacion);
        add(textDocumentoIdentidad);
        add(textFechaNacimiento);


        botonAgregar = new JButton("Agregar");
        botonAgregar.setBounds(110,290, 110, 25);
        botonAgregar.addActionListener(this);
        add(botonAgregar);
        //setLocationRelativeTo(null);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == botonAgregar) {
            System.out.println("Adicionando elemento");
            
            String nombre = textNombre.getText();
            String primerApellido = textPrimerApellido.getText();
            String segundoApellido = textSegundoApellido.getText();
            Double salario = Double.parseDouble(textSalario.getText());
            String ciudadResidencia = textCiudadResidencia.getText();
            String cargo = textCargo.getText();
            String clasificacion = textClasificacion.getText();
            Integer documentoIdentidad = Integer.parseInt(textDocumentoIdentidad.getText());
            String fechaNacimiento = textFechaNacimiento.getText();
            
            
            textNombre.setText("");
            textPrimerApellido.setText("");
            textSegundoApellido.setText("");
            textSalario.setText("");
            textCiudadResidencia.setText("");
            textCargo.setText("");
            textClasificacion.setText("");
            textDocumentoIdentidad.setText("");
            textFechaNacimiento.setText("");

            Requerimiento_3Vo lider = new Requerimiento_3Vo();
            lider.setNombre(nombre);
            lider.setPrimer_Apellido(primerApellido);
            lider.setSegundo_Apellido(segundoApellido);
            lider.setSalario(salario);
            lider.setCiudad_Residencia(ciudadResidencia);
            lider.setCargo(cargo);
            lider.setClasificacion(clasificacion);
            lider.setDocumento_Identidad(documentoIdentidad);
            lider.setFecha_Nacimiento(fechaNacimiento);

            ControladorRequerimientos insertar = new ControladorRequerimientos();
            try {
                Boolean estate = insertar.consultarRequerimiento3(lider);
                if (estate == true){
                    System.out.println("Lider ingresado a la base de datos");
                    JOptionPane.showMessageDialog(null, "Lider agregado", "Mensaje INFO", JOptionPane.INFORMATION_MESSAGE);
                }else{
                    System.out.println("lider NO ingresado a la base de datos: " + estate);
                }
                

            } catch (SQLException e2) {
                System.out.println("Error en formulario insertar datos");
            }
    



        }
        
    }
    
}