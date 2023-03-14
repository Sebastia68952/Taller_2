package Taller_2;

import java.io.File;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class Musica extends Thread {
    private String cancion;

    public Musica(String cancion) {
        this.cancion = cancion;
    }

    @Override
    public void run() {
        try {
            File songFile = new File(cancion);
            Clip clip = AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(songFile));
            clip.start();
            Thread.sleep(clip.getMicrosecondLength() / 1000);
        } catch (Exception e) {
            System.out.println("Error playing song: " + e.getMessage());
        }
    }
}