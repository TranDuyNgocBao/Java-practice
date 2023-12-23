/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array_demo;

/**
 *
 * @author ADMIN
 */
public class UsingClass {
    public static void main(String[] args) {
        int choice = 0;
        do{
            System.out.println("1. Add new Experience");
            System.out.println("2. Add new Fresher");
            System.out.println("3. Find by ID");
            System.out.println("4. Update by Index");
            System.out.println("5. Remove by Index");
            System.out.println("6. Display Experience");
            System.out.println("7. Display Fresher");
            System.out.println("8. Display all");
            System.out.println("Other to quit");
            System.out.println("Input your choice: ");
            
        }while(choice <= 8);
    }
}
