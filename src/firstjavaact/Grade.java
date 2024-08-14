
package firstjavaact;

import java.text.DecimalFormat;
import java.util.Scanner;


public class Grade {
   public  void getGrade(){
       Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");
        
        String name;
        int math,sci,eng,com,total;
        float ave;
        System.out.print("Enter your full name: ");
        name = sc.nextLine();
        System.out.println("Enter marks in: ");
        System.out.print("Math: ");
        math = sc.nextInt();
        System.out.print("Science: ");
        sci = sc.nextInt();
        System.out.print("English: ");
        eng = sc.nextInt();
        System.out.print("Computer: ");
        com = sc.nextInt();
        
        total = math + sci + eng + com;
        ave = (float)total / 4;
        
        String formattedAve1= df.format(ave);
        
        System.out.println("-------------------");
        System.out.println("Grade Detail: ");
        System.out.println("-------------------");

        System.out.println("Name: "+name);
        
        System.out.println("Marks: "+total);
        
        System.out.println("Total Average: "+formattedAve1);
        
        if(ave >= 75 ){
            System.out.println("Status: Passed");
        }else{
            System.out.println("Status: Failed");
        }
       
   }    
}
