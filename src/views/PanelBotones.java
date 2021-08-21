package views;

import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Dimension;
import java.awt.GridLayout;

public class PanelBotones extends JPanel implements ActionListener {

    private JButton btnRequerimiento1;
    private JButton btnRequerimiento2;
    private JButton btnRequerimiento3;

    private index vistaIndex;

    public PanelBotones(index i) {
        super();
        setLayout(new GridLayout());
        vistaIndex = i;
        btnRequerimiento1 = new JButton("Requerimiento 1");
        btnRequerimiento2 = new JButton("Requerimiento 2");
        btnRequerimiento3 = new JButton("Requerimiento 3");
        setPreferredSize(new Dimension(100, 100));

        btnRequerimiento1.addActionListener(this);
        btnRequerimiento2.addActionListener(this);
        btnRequerimiento3.addActionListener(this);

        add(btnRequerimiento1);
        add(btnRequerimiento2);
        add(btnRequerimiento3);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals(btnRequerimiento1.getActionCommand())) {
            vistaIndex.updateLista1();
        }
        if (e.getActionCommand().equals(btnRequerimiento2.getActionCommand())) {
            vistaIndex.updateLista2();

        }
        if (e.getActionCommand().equals(btnRequerimiento3.getActionCommand())) {
            vistaIndex.updateLista3();
        }
    }

}