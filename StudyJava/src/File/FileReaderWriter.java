/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package File;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/**
 *
 * @author ADMIN
 */
public class FileReaderWriter {

    public static void main(String[] args) {
        String fileName = "textFile.txt";
        try {
            String content = "";
            for (int i = 0; i < 5; i++) {
                content += Utils.getStr("String " + (i + 1) + ": ")+"\n";
            }
            writeFile(fileName, content);
            readFile(fileName);
        } catch (IOException e) {
        }
    }

    public static boolean writeFile(String fileUrL, String data) throws IOException {
        boolean check = false;
        BufferedWriter bw = null;
        try {
            Writer writer = new FileWriter(fileUrL);
            bw = new BufferedWriter(writer);
            bw.write(data);
            check = true;
        } catch (IOException e) {

        } finally {
            if (bw != null) {
                bw.close();
            }
        }
        return check;
    }

    public static void readFile(String fileUrL) throws IOException {
        BufferedReader br = null;
        try {
            String line;
            br = new BufferedReader(new FileReader(fileUrL));
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {

        } finally {
            if (br != null) {
                br.close();
            }
        }
    }
}
