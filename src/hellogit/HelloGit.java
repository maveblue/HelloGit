 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hellogit;

import java.util.Scanner;

/**
 *
 * @author bluesight
 */
public class HelloGit {

   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input your name : ");
        String name = input.nextLine();
        System.out.println("Hello "+name);
    }
    
}
