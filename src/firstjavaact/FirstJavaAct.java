
package firstjavaact;

import java.util.Scanner;
import java.text.DecimalFormat;

public class FirstJavaAct {

    
    public static void main(String[] args) {
      
      Scanner sc = new Scanner(System. in);  
        
       Grade grd1= new Grade();
        grd1.getGrade();
        
        /*
       Product pr = new Product();
      
       System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10.5s\n",
                 "Product ID", "Name" , "Price" , "Stocks" , "Status" , "Tep");
       
       pr.AddProduct(10011, "Soap", 20, 10, 200);
       pr.viewProduct();
       
       Product pr1 = new Product();
       pr1.AddProduct(10012, "Cards", 50, 0, 0);
       pr1.viewProduct();
       
        
        
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
       
      
      
      
        
      
        
        Accounts[] acc = new Accounts[100];
       
        int no, i;

        System.out.print("Enter number of Accounts: ");
        no = sc.nextInt();

        for (i = 0; i < no; i++) {
            acc[i] = new Accounts();
         
            boolean identi;
            boolean email1;
            boolean username;
           
            System.out.println("Enter account Details " + (i + 1) + ": ");
            while (true) {
                System.out.print("Enter ID: ");
                int id = sc.nextInt();
                identi = false;

               
                for (int x = 0; x < i; x++) {
                    if (acc[x] != null && acc[x].id == id) {
                        identi = true;
                        break;
                    }
                }

                if (identi) {
                    System.out.println(" - ID already exists. Try again -");
                } else {
                   
                    acc[i].id = id;
                    break;
                }
            }
           
            System.out.print("First Name: ");
            String fname = sc.next();
            System.out.print("Last Name: ");
            String lname = sc.next();
           
             while (true) {
                System.out.print("Email: ");
                String email = sc.next();
                email1 = false;

               
                for (int x = 0; x < i; x++) {
                    if (acc[x] != null && acc[x].email.equals(email)) {
                        email1 = true;
                        break;
                    }
                }

                if (email1) {
                    System.out.println(" - Email already exists. Try again -");
                } else {
                   
                    acc[i].email = email;
                    break;
                }
            }
           
             while (true) {
                System.out.print("Username: ");
                String user = sc.next();
                username = false;

               
                for (int x = 0; x < i; x++) {
                    if (acc[x] != null && acc[x].username.equals(user)) {
                        username = true;
                        break;
                    }
                }

                if (username) {
                    System.out.println(" - Username already exists. Try again -");
                } else {
                   
                    acc[i].username = user;
                    break;
                }
            }
           
            boolean passValid = false;
           
            while (!passValid) {
                System.out.print("Password: ");
                String password = sc.next();

                if (acc[i].passwordVerify(password)) {
                    acc[i].addAccount(acc[i].id, fname, lname, acc[i].email, acc[i].username, password);
                    passValid = true;  
                } else {
                    System.out.println(" - Invalid password - , Try Again ");
                }
            }
            System.out.println("");
       

        }
        System.out.println("Account Details: ");
         System.out.printf("%-10s %-10s %-10s %-20s %-13s %-10s\n","ID", "FirstName", "LastName", "Email", "Username", "Password");
         System.out.println("---------------------------------------------------------------------------------");
        for (i = 0; i < no; i++) {
            if(acc[i] != null){
            acc[i].viewAccount();
            System.out.println("");
        }
        }
*/
    }
}
       
        
        
        
        
    
    

