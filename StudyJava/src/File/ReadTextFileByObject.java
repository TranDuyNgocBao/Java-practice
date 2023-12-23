/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package File;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public class ReadTextFileByObject {

    public static boolean writeFile(String fileURL) throws IOException {
        boolean check = false;
        File f = new File(fileURL);
        FileWriter fw = new FileWriter(f);
        try {
            Student st = new Student("SE150440", "Tran Duy Ngoc Bao", 20, 10);
            fw.write(st.toString());
            fw.write("\n");

            st = new Student("MyCRush", "TVDL", 20, 10);
            fw.write(st.toString());
            fw.write("\n");

            st = new Student("Yes", "I asked her", 20, 10);
            fw.write(st.toString());
            fw.write("\n");
            check = true;
        } catch (IOException e) {
        } finally {
            if (fw != null) {
                fw.close();
            }
        }
        return check;
    }
    
    public static void readFile(String fileURL) throws FileNotFoundException, IOException{
        File f = new File(fileURL);
        FileReader fr = new FileReader(f);
        BufferedReader br = new BufferedReader(fr);
        try {
            String line = "";
            List<Student> list = new ArrayList<>();
             while((line = br.readLine()) != null){
                 System.out.println(line);
                 String [] st = line.split(",");
                 list.add(new Student(st[0], st[1], Integer.parseInt(st[2]), Float.parseFloat(st[3])));
             }
             System.out.println("String list:");
             System.out.println(list.toString());
        } catch (Exception e) {
        }finally{
            if(br != null)br.close();
            if(fr != null)fr.close();
        }
    }
    
    public static void main(String[] args) throws IOException {
        String file = "output.txt";
        writeFile(file);
        readFile(file);
    }
}
