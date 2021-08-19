package vista;

import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class FormularioConsultarLideres extends JFrame {

    public FormularioConsultarLideres(Object[][] datos) {
        String[] columnNames = { "ID_Lider" , "Salario" , "Ciudad_Residencia" };
        //Object[][] datos = { { "Juan", 25, false }, { "Sonia", 33, true }, { "Pedro", 42, false }, };
        DefaultTableModel dtm = new DefaultTableModel(datos, columnNames);
        final JTable table = new JTable(dtm);
        table.setPreferredScrollableViewportSize(new Dimension(250, 100));
        JScrollPane scrollPane = new JScrollPane(table);
        getContentPane().add(scrollPane, BorderLayout.CENTER);
        setTitle("Consulta Lideres");
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        setBounds(840, 215, 500, 300);
        pack();

    }
}

