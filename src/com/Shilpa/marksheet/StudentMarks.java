/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Shilpa.marksheet;

import java.util.Scanner;



public class StudentMarks {
    public StudentMarks(){
        
    }
    Scanner input= new Scanner (System.in);
    double[][] marks = new double [10][5];
    String [] students= new String[10];
    String [] subjects= new String[5];
    String result= "";
    double[] total= new double[10];
    double [] percentage= new double [10];
    int sc =1;
     public StudentMarks(String[] students, String[] subjects, double[][] marks) {
        this.students = students;
        this.subjects = subjects;
        this.marks = marks;

    }
      public void entry() {

        for (int i = 0; i < 10; i++) {
            System.out.println("Enter student's name:");
            students[i] = input.next();
            sc++;
            if (sc> 10){
                System.out.println("You can't add more student's records");
            }
        }
    }
      public void entrySubject() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter subjects name:");
            subjects[i] = input.next();
        }
    }
     public void entryMarks() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.println("Enter marks:");
            
                marks[i][j] = input.nextDouble();
                if (marks[i][j] < 32) {
                    result = "fail";
                }
                total[i] = total[i] + marks[i][j];
            }
            if (result.equals("fail")) {
                System.out.println( "you have Failed");
            } else {
                percentage[i] = total[i] / 5;
                System.out.println("Percentage of " + students[i] + " is:" + percentage[i]);
                if (percentage[i] >= 60 && total[i] < 80) {
                    System.out.println("First Div ");
                } else if (percentage[i] >= 80) {
                    System.out.println("Distinction");
                } else if (percentage[i] <= 60 && percentage[i] >= 45) {
                    System.out.println("Second Div ");
                } else if (percentage[i] <= 45 && percentage[i] >= 32) {
                    System.out.println("Third Div ");
                }
            }
        }
    }
    
}
