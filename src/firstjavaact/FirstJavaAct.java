
package firstjavaact;

import java.util.Scanner;


public class FirstJavaAct {
     
    
    public static void main(String[] args) {
      
      Scanner sc = new Scanner(System. in);  
        
      int res;
      int choice;
      do{
         System.out.println("-----------------");
         System.out.println("1. Grade System "); 
         System.out.println("2. Product System ");
         System.out.println("3. Account System ");
         System.out.println("-----------------");
        System.out.print("Enter choice: ");
        choice = sc.nextInt();
       
        
        switch (choice){
            case 1:
                
                 Grade grd1= new Grade();
                grd1.getGrade();
        
                break;
            case 2:
               
                   Products pr = new Products();
                   pr.getProduct();
      
      break;
            case 3:
                
            Account ac = new Account();
            ac.getAccount();
                break;
                
                
            default:
                System.out.println(" - Invalid Input - ");
                break;
        }
        
          System.out.println("");
          
          System.out.print("Do you want to proceed? ( 1 / 0 ): ");
           res = sc.nextInt();
      }while(res != 0 );
        

    }
}
       
        
        
        
        
    
    

