/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slot8;

/**
 *
 * @author ADMIN
 */
public class ClassA {
    /*private*/ protected String color; // property
    // private có tính đóng gói dùng trong class
    
    public void calculateValue(String color) { // parameter
        this.color=color;
    }

    public ClassA() {
        color = "White";
    }

    public ClassA(String color) {
        this.color = color;
    }
    
    public ClassA(int n){
        
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    
}
