
package firstjavaact;

import java.util.Scanner;
import java.text.DecimalFormat;

public class FirstJavaAct {

    
    public static void main(String[] args) {
       /*
       Grade grd1= new Grade();
        grd1.getGrade();
        */
       
       Product pr = new Product();
       
         System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10.5s\n",
                 "Product ID", "Name" , "Price" , "Stocks" , "Status" , "Tep");
       
         pr.AddProduct(10011, "Soap", 20, 10, 200);
       pr.viewProduct();
       
       Product pr1 = new Product();
       pr1.AddProduct(10012, "Cards", 50, 0, 0);
       pr1.viewProduct();
    }
    
}
