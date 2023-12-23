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
public class ClassB extends ClassA {

    private int number;

    // Overloading    

    public ClassB(String color) {
        super(color);
    }

    public ClassB() {
    }

    public ClassB(int number, String color) {
        super(color);
        this.number = number;
    }

    public ClassB(int number) {
        this.number = number;
    }
    
    //

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        if(number > 10)this.number = number;
    }

    public void acb() {

    }
    
    //Overriding
    public void calculateValue(String color){
        super.setColor(color);
    }

}
