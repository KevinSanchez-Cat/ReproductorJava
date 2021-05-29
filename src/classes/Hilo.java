package classes;

import static java.lang.Thread.sleep;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Hilo extends Thread {

    private javax.swing.JLabel JLabel1;
    private int contador, contador2, contador3, contador4, aux;
    private String minutos, segundos, cadena;
    private int dura;

    public Hilo(int dura) {
        contador = contador2 = contador3 = contador4 = 0;
        this.dura = dura;
    }

    public Hilo(int cont, int c2, int c3, int c4, int dura, int aux) {
        this.contador = cont;
        this.contador2 = c2;
        this.contador3 = c3;
        this.contador4 = c4;
        this.dura = dura;
        this.aux = aux;
    }

    public JLabel getJLabel1() {
        return JLabel1;
    }

    public int getAux() {
        return aux;
    }

    public String getMinutos() {
        return minutos;
    }

    public String getSegundos() {
        return segundos;
    }

    public String getCadena() {
        return cadena;
    }

    public int getDura() {
        return dura;
    }

    public int getContador() {
        return contador;
    }

    public int getContador2() {
        return contador2;
    }

    public int getContador3() {
        return contador3;
    }

    public int getContador4() {
        return contador4;
    }

    @Override
    public void run() {
        while (true) {
            if (contador3 >= 10) {
                segundos = "" + contador3;
            } else {
                segundos = "0" + contador3;
            }
            if (contador2 >= 10) {
                minutos = "" + contador2;
            } else {
                minutos = "0" + contador2;
            }
            JLabel1.setText(minutos + ":" + segundos);
            cadena = minutos + segundos;
            contador3++;
            if (contador3 == 60) {
                contador3 = 0;
                contador2++;
                if (contador2 == 60) {
                    contador2 = 0;
                    contador++;
                }
            }
            if (dura == aux) {
                stop();
            }
            aux++;
            try {
                sleep(1000);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "ERROR  ", "Mensaje de Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public void recibeJLabel(javax.swing.JLabel JLabel1) {
        this.JLabel1 = JLabel1;
    }

}
