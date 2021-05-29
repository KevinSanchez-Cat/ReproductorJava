package classes;

import java.io.File;
import javax.swing.JOptionPane;
import javazoom.jlgui.basicplayer.BasicPlayer;

public class Music
{

    public BasicPlayer player;

    public Music()
    {
        player = new BasicPlayer();
    }

    public void Play()
    {
        try
        {
            player.play();
        } catch (Exception ex)
        {
            JOptionPane.showMessageDialog(null, "ERROR  ", "Mensaje de Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void AbrirFichero(String ruta)
    {
        try
        {
            player.open(new File(ruta));
        } catch (Exception ex)
        {
           JOptionPane.showMessageDialog(null, "ERROR  ", "Mensaje de Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void Pausa()
    {
        try
        {
            player.pause();
        } catch (Exception ex)
        {
          JOptionPane.showMessageDialog(null, "ERROR  ", "Mensaje de Error", JOptionPane.ERROR_MESSAGE);
        }

    }

    public void Continuar()
    {
        try
        {
            player.resume();
        } catch (Exception ex)
        {
          JOptionPane.showMessageDialog(null, "ERROR  ", "Mensaje de Error", JOptionPane.ERROR_MESSAGE);
        }

    }

    public void Stop()
    {
        try
        {
            player.stop();
        } catch (Exception ex)
        {
      JOptionPane.showMessageDialog(null, "ERROR  ", "Mensaje de Error", JOptionPane.ERROR_MESSAGE);
        }
    }

}
