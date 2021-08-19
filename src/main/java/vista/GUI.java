package vista;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.event.*;

public class GUI extends JFrame implements ActionListener{
    JButton BotonInforme1, BotonInforme2, BotonInsertarLider;
    JLabel labelConstructora, labelConsultas, labelInsertar;
    public GUI() {
        setLayout(null);
        setSize(330, 300);
        setTitle("Requerimientos");
        setDefaultCloseOperation(3);
        setResizable(false);
        setLocationRelativeTo(null);

        labelConstructora = new JLabel("ASOCIACIÓN DE CONSTRUCTORES");
        labelConstructora.setBounds(50, 10, 300, 50);
        add(labelConstructora);

        labelConsultas = new JLabel("CONSULTAS");
        BotonInforme1 = new JButton("Lideres");
        BotonInforme2 = new JButton("Materiales");
        labelConsultas.setBounds(30, 95, 100, 30);
        BotonInforme1.setBounds(160, 80, 100, 30);
        BotonInforme2.setBounds(160, 112, 100, 30);
        add(labelConsultas);
        add(BotonInforme1);
        add(BotonInforme2);
        

        labelInsertar = new JLabel("INSERTAR");
        BotonInsertarLider = new JButton("Lider");
        labelInsertar.setBounds(30, 170, 100, 30);
        BotonInsertarLider.setBounds(160, 170, 100, 30);
        add(labelInsertar);
        add(BotonInsertarLider);

        BotonInforme1.addActionListener(this);
        BotonInforme2.addActionListener(this);
        BotonInsertarLider.addActionListener(this);

    }

    public static void main(String[] args) {
        GUI ventana = new GUI();
        ventana.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == BotonInforme1) {            
            VistaRequerimientos.requerimiento1();
        }
        
        if (e.getSource() == BotonInforme2) {            
            VistaRequerimientos.requerimiento2();

        }

        if (e.getSource() == BotonInsertarLider) {
            //VistaRequerimientos.requerimiento3();
            FormularioInsertarLider ventana3 = new FormularioInsertarLider();
            ventana3.setVisible(true);
        }
    }   
}