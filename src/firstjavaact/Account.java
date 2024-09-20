/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstjavaact;

import static java.lang.System.exit;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class Account {
    public void editAccount(Accounts[] ac, int id, int size){
     Scanner sc = new Scanner (System.in);
        for( int i = 0; i < size; i++){
            if(ac[i] != null && ac[i].id == id){
                System.out.println("Enter new ( Username / Email / Password ): ");
                System.out.print("Username: ");
                ac[i].username = sc.next();
                System.out.print("Email: ");
                ac[i].email = sc.next();
                System.out.print("Password: ");
                ac[i].pass = sc.next();
                System.out.println("");
                System.out.println(" - Updated Succesfully - ");
                return;
            }
        }
        System.out.println(" - Id not found - ");
        
    }
    public void deleteAccount(Accounts[] ac, int id , int size){
        for(int i = 0; i < size; i++){
            if(ac[i] != null && ac[i].id == id){
                for(int x = i; x < size; x++){
                    ac[x] = ac[x + 1];
                }
                ac[size - 1 ] = null;
                System.out.println("");
                System.out.println("Record with Id " + id + " deleted Succesfully ");
                return;
            }
        }
            System.out.println(" - ID not Found - ");
    }
    
  public void getAccount() {
    Scanner sc = new Scanner(System.in);
    Accounts[] acc = new Accounts[100];
    
    int no = 0; 
    int res;
    
    do {
        System.out.println(" - - ACCOUNT SYSTEM - - ");
        System.out.println("---------------------");
        System.out.println("1. Add Account ");
        System.out.println("2. View Account ");
        System.out.println("3. Edit Account ");
        System.out.println("4. Delete Account ");
        System.out.println("5. Exit ");
        System.out.println("---------------------");
        
        int choice;
        System.out.print("Enter Choice: ");
        choice = sc.nextInt();
        
        switch (choice) {
            case 1:
                System.out.print("Enter number of Accounts: ");
                int add = sc.nextInt();

                for (int i = 0; i < add; i++) {
                    acc[no] = new Accounts(); 
                    
                    boolean identi;
                    boolean email1;
                    boolean username;

                    System.out.println("Enter account Details " + (i + 1) + ": ");
                    while (true) {
                        System.out.print("Enter ID: ");
                        int id = sc.nextInt();
                        identi = false;

                       
                        for (int x = 0; x < no; x++) {
                            if (acc[x] != null && acc[x].id == id) {
                                identi = true;
                                break;
                            }
                        }

                        if (identi) {
                            System.out.println(" - ID already exists. Try again -");
                        } else {
                            acc[no].id = id; 
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

                      
                        for (int x = 0; x < no; x++) {
                            if (acc[x] != null && acc[x].email.equals(email)) {
                                email1 = true;
                                break;
                            }
                        }

                        if (email1) {
                            System.out.println(" - Email already exists. Try again -");
                        } else {
                            acc[no].email = email; 
                            break;
                        }
                    }

                    while (true) {
                        System.out.print("Username: ");
                        String user = sc.next();
                        username = false;

                        
                        for (int x = 0; x < no; x++) {
                            if (acc[x] != null && acc[x].username.equals(user)) {
                                username = true;
                                break;
                            }
                        }

                        if (username) {
                            System.out.println(" - Username already exists. Try again -");
                        } else {
                            acc[no].username = user; 
                            break;
                        }
                    }

                    boolean passValid = false;

                    while (!passValid) {
                        System.out.print("Password: ");
                        String password = sc.next();

                        if (acc[no].passwordVerify(password)) {
                          
                            acc[no].addAccount(acc[no].id, fname, lname, acc[no].email, acc[no].username, password);
                            passValid = true;  
                        } else {
                            System.out.println(" - Invalid password - , Try Again ");
                        }
                    }
                    
                    no++; 
                    System.out.println("");
                    System.out.println("Account added successfully!");
                }
                break;

            case 2:
                if(no == 0 ){
                    System.out.println(" - No account Added - ");
                }else{
                System.out.println("Account Details: ");
                System.out.printf("%-10s %-10s %-10s %-20s %-13s %-10s\n", "ID", "FirstName", "LastName", "Email", "Username", "Password");
                System.out.println("---------------------------------------------------------------------------------");
                
                
                for (int i = 0; i < no; i++) {
                    if (acc[i] != null) {
                        acc[i].viewAccount(); 
                    }
                }
                }
                break;
                
                
            case 3:
                if(no == 0){
                    System.out.println(" - No account added - ");
                }else{
              System.out.println("Account Details: ");
                System.out.printf("%-10s %-10s %-10s %-20s %-13s %-10s\n", "ID", "FirstName", "LastName", "Email", "Username", "Password");
                System.out.println("---------------------------------------------------------------------------------");
                
                
                for (int i = 0; i < no; i++) {
                    if (acc[i] != null) {
                        acc[i].viewAccount(); 
                    }
                }
                    System.out.print("Enter ID to update: ");
                int ide = sc.nextInt();
                editAccount(acc, ide, no);
                }
                break;
             
            case 4:
                
                
                if(no == 0 ){
                    System.out.println(" - No account Added ! - ");
                }else{
                     System.out.println("Account Details: ");
                System.out.printf("%-10s %-10s %-10s %-20s %-13s %-10s\n", "ID", "FirstName", "LastName", "Email", "Username", "Password");
                System.out.println("---------------------------------------------------------------------------------");
                
                
                for (int i = 0; i < no; i++) {
                    if (acc[i] != null) {
                        acc[i].viewAccount(); 
                    }
                }
                System.out.print("Enter ID to delete: ");
                int iden = sc.nextInt();
                deleteAccount(acc, iden , no);
                no--;
        }
                 break;
            
            case 5:
                exit(0);
        }
       
               System.out.println("");
        System.out.print("Do you want to continue ? ( 1 / 0 ): ");
        res = sc.nextInt();

    } while (res != 0);
}

}
