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
public class Rectangle implements ShapeInterfaces{

    @Override
    public void draw() {
        System.out.println("Draw " + color + " Rectangle");
    }
    
}
