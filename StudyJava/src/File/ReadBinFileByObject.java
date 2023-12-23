/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package File;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public class ReadBinFileByObject {

    public static void main(String[] args) throws IOException {
        String file;
        file = "myData.bin";
        writeFile(file);
        readFile(file);
    }

    public static boolean writeFile(String fileURL) throws FileNotFoundException, IOException {
        boolean check = false;
        FileOutputStream fos = new FileOutputStream(fileURL);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        try {
            Student st = new Student("SE140", "TranBao", 20, 10);
            oos.writeObject(st);
            st = new Student("SE150441", "TL", 20, 10);
            oos.writeObject(st);
            st = new Student("SE150442", "BL", 20, 10);
            oos.writeObject(st);
            check = true;
        } catch (IOException e) {
        } finally {
            if (oos != null) {
                oos.close();
            }
            if (fos != null) {
                fos.close();
            }
        }
        return check;
    }

    public static void readFile(String fileURL) throws FileNotFoundException, IOException {
        FileInputStream fis = new FileInputStream(fileURL);
        ObjectInputStream ois = new ObjectInputStream(fis);
        try {
            Student st = null;
            List<Student> list = new ArrayList<>();
            while (fis.available() > 0) {
                st = (Student) ois.readObject();
                System.out.println(st.toString());
                list.add(st);
            }
            System.out.println("Student list:");
            System.out.println(list.toString());
        } catch (IOException | ClassNotFoundException e) {
        } finally {
            if (ois != null) {
                ois.close();
            }
            if (fis != null) {
                fis.close();
            }
        }
    }
}
