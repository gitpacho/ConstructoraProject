package vista;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class FomularioConsultarMateriales extends JFrame{
    private JLabel labelMateriales, labelResultados, labelInfo, labelInfo2;
    public FomularioConsultarMateriales() {
        setLayout(null);
        setDefaultCloseOperation(3);
        setBounds(20,20, 330, 300);
        setTitle("Consultas");
        //setResizable(false);

        labelMateriales = new JLabel("MATERIALES");
        labelResultados = new JLabel("RESULTADOS");
        labelInfo =  new JLabel("La visualización está condicionada a los proyectos");
        labelInfo2 = new JLabel("                                   1, 184, 400          ");

        labelMateriales.setBounds(120, 10, 300, 50);
        labelResultados.setBounds(20, 110, 300, 50);
        labelInfo.setBounds(20, 210, 300, 15);
        labelInfo2.setBounds(20, 225, 300, 15);

        add(labelMateriales);
        add(labelResultados);
        add(labelInfo);
        add(labelInfo2);
    }
    
}
