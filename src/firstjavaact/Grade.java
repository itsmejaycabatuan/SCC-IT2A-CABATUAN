
package firstjavaact;

import java.text.DecimalFormat;
import java.util.Scanner;


public class Grade {
    
    public void editGrade(Grades[] grs1 , int id, int size){
      Scanner sc = new Scanner(System.in);
      for(int i = 0; i < size; i++){
          if(id == grs1[i].id){
              System.out.println("Enter new grades of Student "+grs1[i].id+":");
              System.out.print("Prelim: ");
              double p1 = sc.nextDouble();
              grs1[i].p = p1;
              System.out.print("Midterm: ");
              double m1 = sc.nextDouble();
              grs1[i].p = m1;
              System.out.print("Prefinal: ");
              double pre1 = sc.nextDouble();
              grs1[i].p = pre1;
              System.out.print("Final: ");
              double fi1 = sc.nextDouble();
              grs1[i].p = fi1;
          }
      }
    }
   public  void getGrade(){
       
       
        Scanner sc = new Scanner(System.in);
      
        Grades[] gr = new Grades[100];
        int res;
        do{
          
       System.out.println("----------------------------");
       System.out.println("- Actions - ");
       System.out.println("1. Add Records  ");
       System.out.println("2. View Records");
       System.out.println("3. Edit Records");
       System.out.println("4. Delete Records");
       System.out.println("5. Exit ");
       System.out.println("----------------------------");
      
        
       System.out.print("Enter options: ");
       int op  = sc.nextInt(); 
       int num = 0;
      
        while(op >  5){
            System.out.print("- Invalid Option , Try again -:  "); 
             op = sc.nextInt();
        }
         
        switch(op){
            case 1: 
                System.out.print("Enter number of Students: ");
                num = sc.nextInt();
                for( int i = 0; i < num; i++){
                    System.out.println("Enter details of students " +(i + 1)+ ": ");
                    System.out.print("ID: ");
                    int id = sc.nextInt();
                    System.out.print("Name: ");
                    String name = sc.next();
                    System.out.print("Prelim: ");
                    double p = sc.nextDouble();
                    System.out.print("Midterm : ");
                    double m = sc.nextDouble();
                    System.out.print("PreFinal: ");
                    double pre = sc.nextDouble();
                    System.out.print("Final: ");
                    double fin = sc.nextDouble();
                    gr[i] = new Grades();
                    gr[i].addGrades(id, name, p, m, pre, fin);
                }
                break;
            case 2: 
                  for( int i = 0; i < num; i++){
                      gr[i].viewGrades();
                  }break;
                      
            case 3:
                System.out.print("Enter ID to update: ");
                int id1 = sc.nextInt();
               editGrade(gr, id1, num);
                break;
                
        }
       
            System.out.print("Do you want to continue ? ( 1 / 0 ): ");
          
            res = sc.nextInt();
        }while(res != 0);        
        
   }
}
