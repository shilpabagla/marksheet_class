/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Shilpa.marksheet;

import java.util.Scanner;

public class MarkSheet {

  
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        while(true){
            System.out.println("Enter your choice:");
            System.out.println("1. Enter student's name:");
            System.out.println("2. Enter subjects:");
            System.out.println("3. Enter marks:");
            System.out.println("4. Exit");
            int choice= input.nextInt();
            StudentMarks m;
            m = new StudentMarks();
            switch(choice){
                case 1:
                    m.entry();
                    break;
                case 2:
                    m.entrySubject();
                    break;
                case 3:
                    m.entryMarks();
                    break;
                case 4:
                    System.exit(0);
                    break;
            }
              System.out.println("Do you want to continue[Y/N]?");
            String ch=input.next();
            if(ch.equalsIgnoreCase("n")){
                System.exit(0);
            }
       } 
    }

    /**
     *
     */
    public static void markSheet(){
       StudentMarks m = new StudentMarks();
    m.entry();
    m.entrySubject();
    m.entryMarks();
    
    }
}
