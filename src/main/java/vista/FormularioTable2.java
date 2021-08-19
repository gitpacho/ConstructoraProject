package vista;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class FormularioTable2 extends JFrame {

    public FormularioTable2(Object[][] datos) {
        String[] columnNames = { "ID_Proyecto", "Nombre_Material", "Importado" };
        DefaultTableModel dtm = new DefaultTableModel(datos, columnNames);
        final JTable table = new JTable(dtm);
        table.setPreferredScrollableViewportSize(new Dimension(250, 100));
        JScrollPane scrollPane = new JScrollPane(table);
        getContentPane().add(scrollPane, BorderLayout.CENTER);
        setTitle("Consulta Materiales");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        setBounds(860, 240, 330, 300);

    }

    //public static void main(String[] args) {
    //    FormularioTable2 ventana = new FormularioTable2();
    //    ventana.pack();
    //    ventana.setVisible(true);
    //    ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    //}
}

