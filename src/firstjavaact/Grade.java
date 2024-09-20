
package firstjavaact;

import static java.lang.System.exit;

import java.util.Scanner;


public class Grade {
    
    public void editGrade(Grades[] grs1 , int id, int size){
      Scanner sc = new Scanner(System.in);
     
             
      for(int i = 0; i < size; i++){
          if(id == grs1[i].id){
              
              System.out.println("Enter new grades of Student "+grs1[i].id+":");
              System.out.print("Prelim: ");
             
              grs1[i].p = sc.nextDouble();
              System.out.print("Midterm: ");
             
              grs1[i].m = sc.nextDouble();
              System.out.print("Prefinal: ");
              
              grs1[i].pre = sc.nextDouble();
              System.out.print("Final: ");
              grs1[i].fi = sc.nextDouble();
              
              System.out.println(" - Successfully Updated the Grade !  - ");
              return;
          }else{
              System.out.println(" - ID has not Found - ");
          }
      }
    }
    public void deleteGrade(Grades[] grs1, int id, int size){
        for (int i = 0; i < size; i++){
            if(grs1[i] != null && grs1[i].id == id){
                for(int x  = i; x < size; x++){
                    grs1[x] = grs1[x + 1];
                }
                grs1[size - 1] = null;
                System.out.println("Record with ID  " + id +  " deleted succesfully ! ");
                return;
            }
        }
        System.out.println("Student ID not found");
    }
   public  void getGrade(){
       
       
        Scanner sc = new Scanner(System.in);
      
        Grades[] gr = new Grades[100];
        int res;
        int num = 0;
        int add;
        do{
            System.out.println("  - - GRADE SYSTEM - - ");
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
       
      
        while(op >  5){
            System.out.print("- Invalid Option , Try again -:  "); 
             op = sc.nextInt();
        }
        
        switch(op){
            
            case 1: 
                System.out.print("Enter number of Students: ");
                add = sc.nextInt();
                for( int i = 0; i < add; i++){
                    System.out.println("Enter details of students " +(i + 1)+ ": ");
                    boolean id2; 
                    int id;
                    do{
                    System.out.print("ID: ");
                     id = sc.nextInt();
                    id2 = false;
                      for(int x = 0; x < num; x++){
                          if(gr[x] != null && gr[x].id == id){
                              id2 = true;
                              System.out.println(" - Id already Exist, Try again - ");
                              break;
                          }
                      }
                      }while(id2);
                    
                       
                    
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
                    gr[num] = new Grades();
                    gr[num].addGrades(id, name, p, m, pre, fin);
                    num++;
                }
                break;
            case 2: 
                if( num == 0 ){
                    System.out.println("  - No records to display - ");
                }else{
                System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s %-10s %-10s %n ",
                        "ID", "Name", "Prelim", "Midterm", "Prefinal","Final","Average","Status"); 
                     for( int i = 0; i < num; i++){
                      gr[i].viewGrades();
                     }    
                 }break;
                      
            case 3:
                if(num == 0 ){
                    System.out.println(" - No record has been added - ");
                }else{
                System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s %-10s %-10s %n ",
                        "ID", "Name", "Prelim", "Midterm", "Prefinal","Final","Average","Status"); 

                 for( int i = 0; i < num; i++){
                      gr[i].viewGrades();
                     }    
                System.out.print("Enter ID to update: ");
                int id1 = sc.nextInt();
               editGrade(gr, id1, num);
                }break;
                
                
            case 4:
                if(num == 0){
                    System.out.println(" - No record has been added - ");
                }else{
                 System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s %-10s %-10s %n ",
                        "ID", "Name", "Prelim", "Midterm", "Prefinal","Final","Average","Status"); 

                 for( int i = 0; i < num; i++){
                      gr[i].viewGrades();
                     }    
                System.out.print("Enter Id to delete: ");
                int del = sc.nextInt();
                deleteGrade(gr, del, num);
                num--;
        }
                break;
            case 5:
                exit(0);
        }
            System.out.println("");
            System.out.print("Do you want to continue ? ( 1 / 0 ): ");
          
            res = sc.nextInt();
        }while(res != 0);        
        
   }
}
