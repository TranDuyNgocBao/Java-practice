/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graph;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author ADMIN
 */
public class Incident_matrix implements Graph_representation{

    private final Integer V = 100;
    private int column;
    private Integer[][]arr = new Integer[V][V];
    
    @Override
    public void loadFile(String fileURL) {
        FileReader fr = null;
        try {
            File f = new File(fileURL);
            fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);
            try {
                String line = "";
                int old_vertex = -1;
                int col = 0;
                int row = 0;
                for (int i = 0; i < V; i++) {
                    for (int j = 0; j < V; j++) {
                        arr[i][j] = 0;
                    }
                }
                while((line = br.readLine()) != null){
                    line = line.trim();
                    int vertex = Integer.parseInt(line.substring(0,1));
                    if(vertex != old_vertex){
                        old_vertex = vertex;
                        col++;
                    }
                    line = line.substring(2);
                    int data = Integer.parseInt(line);
                    arr[vertex][data] = 1;
                    arr[data][vertex] = -1;
                    if(vertex == data)arr[vertex][data] = 1; 
                    if(row < data)row = data;
                }
                if(row < col)column = col;
                else column = row;
            } catch (Exception e) {
            }finally{
                if(br != null)try {
                    br.close();
                } catch (IOException ex) {
                }
                if(fr != null)try {
                    fr.close();
                } catch (IOException ex) {
                }
            }
        } catch (FileNotFoundException ex) {
        }finally{
            try {
                fr.close();
            } catch (IOException ex) {
            }
        }
    }

    @Override
    public void representation() {
        for (int i = 0; i <= column; i++) {
            for (int j = 0; j <= column; j++) {
                if(arr[i][j] != -1)System.out.print(" ");
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("");
        }
    }

    @Override
    public void deg() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void sumBound() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void dfs_DFS(int key) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
