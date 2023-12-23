/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces_and_abstract;

/**
 *
 * @author ADMIN
 */
public abstract class ShapeAbstract {
    private String color = "red";

    public abstract void draw();

    public String getColor() {
        return color;
    }    
}
