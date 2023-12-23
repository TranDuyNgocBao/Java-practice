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
public class UsingShape {
    public static void main(String[] args) {
        ShapeInterfaces shape = new Rectangle();
        shape.draw();
        ShapeAbstract shape2 = new Circle();
        shape2.draw();
    }
}
