/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nghich;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author ADMIN
 */
public class loopString {
      public static void main(String[] args) throws IOException{
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());
        while(--n >= 0){
            String s = bufferedReader.readLine().trim();
            char[] h = s.toCharArray();
            for(int i = 0; i < h.length ; i+=2)System.out.print(h[i]);
            System.out.print(" ");
            for(int i =1; i < h.length ; i+=2)System.out.print(h[i]);
            System.out.println();
        }
    }
}
