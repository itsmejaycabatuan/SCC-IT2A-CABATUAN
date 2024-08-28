
package firstjavaact;

import java.util.Scanner;
import java.text.DecimalFormat;

public class FirstJavaAct {

    
    public static void main(String[] args) {
      
      Scanner sc = new Scanner(System. in);  
        /*
       Grade grd1= new Grade();
        grd1.getGrade();
        
        
       Product pr = new Product();
      
       System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10.5s\n",
                 "Product ID", "Name" , "Price" , "Stocks" , "Status" , "Tep");
       
       pr.AddProduct(10011, "Soap", 20, 10, 200);
       pr.viewProduct();
       
       Product pr1 = new Product();
       pr1.AddProduct(10012, "Cards", 50, 0, 0);
       pr1.viewProduct();
       */
        
        
        Product[] pr = new Product[100];
        int i;
        int ttp =0;
        System.out.print("Enter number of products: ");
        int n = sc.nextInt();
       
        for(i = 0; i < n; i++){
            System.out.println("Enter details of product " +(i + 1)+ ": ");
            System.out.print("ID: ");
            int ide = sc.nextInt();
            System.out.print("Name: ");
            String name = sc.next();
            System.out.print("Price: ");
            int pri = sc.nextInt();
            System.out.print("Stock: ");
            int st = sc.nextInt();
            System.out.print("Sold: ");
            int sold = sc.nextInt();
            pr[i] = new Product();
            pr[i].AddProduct(pri, name, pri, st, sold);
            ttp = ttp + (pri * sold);
        }
         
        for(i = 0; i < n; i++){
            pr[i].viewProduct();
         
        }
        System.out.println("Total Profit: "+ttp);
        System.out.println("Total TEP: "+ttp);
       
    }
    
}
