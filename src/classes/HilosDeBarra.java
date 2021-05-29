package classes;

import javax.swing.JOptionPane;
import javax.swing.JProgressBar;

public class HilosDeBarra extends Thread {

    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JLabel panelImage2;
    private int retraso;
    private boolean repe;
    private int porcent;
    private int dura;

    public HilosDeBarra() {
        retraso = 1000;
        repe = true;
        porcent = 0;
    }

    public HilosDeBarra(int pidos, int dura) {
        this.retraso = pidos;
        repe = true;
        porcent = 0;
        this.dura = dura;

    }

    public HilosDeBarra(int pidos, int dura, int porcent) {
        this.retraso = pidos;
        repe = true;
        this.porcent = porcent;
        this.dura = dura;

    }

    public HilosDeBarra(int pidos, boolean repe) {
        this.retraso = pidos;
        this.repe = repe;
        porcent = 0;
    }

    public JProgressBar getjProgressBar1() {
        return jProgressBar1;
    }

    public int getRetraso() {
        return retraso;
    }

    public boolean isRepe() {
        return repe;
    }

    public int getPorcent() {
        return porcent;
    }

    public int getDura() {
        return dura;
    }

    @Override
    public void run() {
        while (repe) {
            if (porcent == 100) {
                panelImage2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/gota.gif")));

                repe = false;
                stop();
            } else {
                porcent++;
                jProgressBar1.setValue(porcent);
            }
            try {
                sleep(retraso);
            } catch (InterruptedException ex) {
                JOptionPane.showMessageDialog(null, "ERROR  ", "Mensaje de Error", JOptionPane.ERROR_MESSAGE);
            }

        }

    }

    public void recibirBarraDeProgreso(JProgressBar jProgressBar1, javax.swing.JLabel panelImage2) {
        this.jProgressBar1 = jProgressBar1;
        this.panelImage2 = panelImage2;
        panelImage2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/abstract-sphere---002.gif")));
    }

}
