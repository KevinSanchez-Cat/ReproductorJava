package classes;

import java.awt.Component;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;

public class listaC extends JLabel implements ListCellRenderer {

    final static ImageIcon l1 = new ImageIcon("");
    final static ImageIcon l2 = new ImageIcon("");

    @Override
    //Jlist list | Object value |int index | boolean isSelected |boolean cellHasFocus
    public Component getListCellRendererComponent(JList jlist, Object e, int i, boolean bln, boolean bln1) {

        String valor = e.toString();
        if (bln) {
            setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/1055007 - play.png")));
            setForeground(jlist.getSelectionForeground());
            setBackground(jlist.getSelectionBackground());
        } else {
            setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/1055020 - music.png")));
            setForeground(jlist.getForeground());
            setBackground(jlist.getBackground());
        }
        setOpaque(true);
        setEnabled(jlist.isEnabled());
        setFont(jlist.getFont());

        setText(valor);

        return this;
    }
}
