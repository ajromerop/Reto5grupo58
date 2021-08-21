package views;

import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import java.awt.*;

public class PanelLista extends JPanel {

    private JList<String> listaReq;

    private index vistaFormulario;
    JScrollPane scroll;

    public PanelLista(index i) {
        super();
        scroll = new JScrollPane();
        scroll.setBounds(5, 112, 360, 200);
        setLayout(new GridLayout());
        vistaFormulario = i;

        listaReq = new JList<>();

        add(listaReq);
    }

    public void updateLista(String[] listado) {
        listaReq.setListData(listado);
    }

}