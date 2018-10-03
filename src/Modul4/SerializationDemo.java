/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas_Modul_4;

import Tugas_Modul_3.*;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;
import Tugas_Modul_4.Mahasiswa;

/**
 *
 * @author biobii
 */
public class SerializationDemo {
    
    public void serialize(List<Mahasiswa> pList, String fileName) {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(fileName))) {
            out.writeObject(pList);
        } catch (IOException ex) {
            System.out.println("a problem occured during serialization.\n" + ex.getMessage());
        }
    }
    
    public List<Mahasiswa> deserialize(String fileName) {
        List<Mahasiswa> pList = null;
        
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(fileName))) {
            pList = (List<Mahasiswa>) in.readObject();
            
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("a problem occured during deserialize %s%n" + fileName);
            System.out.println(e.getMessage());
        }
        
        return pList;
    }
    
    public byte[] des(String filename) {
        byte[] pList = null;

        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(filename))) {
            pList = (byte[]) in.readObject();

        } catch (IOException | ClassNotFoundException e) {
            System.out.println("a problem occured during deserialize %s%n" + filename);
            System.out.println(e.getMessage());
        }

        return pList;
    }
    
}
