/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Tugas2;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.awt.FileDialog;
import java.awt.Frame;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

/**
 *
 * @author kartika
 */
public class AudioFile {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        FileDialog dialog = new FileDialog((Frame) null, "Select File to Open");
        dialog.setMode(FileDialog.LOAD);
        dialog.setVisible(true);
        String file = dialog.getDirectory() + dialog.getFile();

        InputStream in = new FileInputStream(file);
        AudioStream audio = new AudioStream(in);
        AudioPlayer.player.start(audio);

    }
}
