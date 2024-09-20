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
public class Products {
    public void editProduct(Product[] pr1, int id, int size){
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < size; i++){
            if( id == pr1[i].id){
                System.out.println("Enter new (ID / Name / Price / Stock)"+pr1[i].id+": ");
                System.out.print("ID: ");
                pr1[i].id = sc.nextInt();
                System.out.print("Name: ");
                pr1[i].name = sc.next();
                System.out.print("Price: ");
                pr1[i].price = sc.nextInt();
                System.out.print("Stock: ");
                pr1[i].stocks = sc.nextInt();
                System.out.println(" - Successfully Updated - ");
                return;
            }else{
                System.out.println(" - Id not Found  - ");
            }
        }
    }
    public void deleteProduct(Product[] pr1, int id, int size){
        for(int i = 0; i < size; i++){
            if( pr1[i] != null && pr1[i].id == id){
            for( int x = i; x < size; x++){
                pr1[x] = pr1[x + 1];
            }
            pr1[size - 1] = null;
                System.out.println(" - Record with ID " + id + " is successfully deleted - ");
                return;
            
            }
        }
        System.out.println(" - ID not Found - ");
    }
    public void getProduct(){
    Scanner sc = new Scanner(System.in);
    Product[] pr = new Product[100];
    int res;
    int n = 0;
 int ttp =0;
    do{
        
        System.out.println(" - - PRODUCT SYSTEM - - ");
        System.out.println("----------------------------");
        System.out.println("1. Add Products ");
        System.out.println("2. View Products ");
        System.out.println("3. Edit Products ");
        System.out.println("4. Delete Products ");
        System.out.println("5. Exit ");
        System.out.println("-----------------------------");
        
        int choice;
                System.out.print("Enter choice: ");
        choice = sc.nextInt();
        
        while(choice > 5 ){
            System.out.print(" - Invalid Choice, Try again : ");
            choice = sc.nextInt();
        }
        
        int toadd;
        
        switch (choice){
            case 1:
        
        int i;
       
        System.out.print("Enter number of products: ");
         toadd = sc.nextInt();
       
        for(i = 0; i < toadd; i++){
            System.out.println("Enter details of product " +(i + 1)+ ": ");
            boolean iden;
            int ide;
            do{
            System.out.print("ID: ");
             ide = sc.nextInt();
             iden = false;
             for(int x = 0; x < n; x++){
                 if(pr[x] != null && pr[x].id == ide){
                     iden = true;
                     System.out.println(" - Id already Exist - ");
                     break;
                 }
             }
            }while(iden);
            
            System.out.print("Name: ");
            String name = sc.next();
            System.out.print("Price: ");
            int pri = sc.nextInt();
            System.out.print("Stock: ");
            int st = sc.nextInt();
            System.out.print("Sold: ");
            int sold = sc.nextInt();
            pr[n] = new Product();
          pr[n].AddProduct(ide, name, pri, st, sold);
            ttp += pri * sold;
            n++;
           
        }
          System.out.println(" - Added Succesfully - ");
        break;
        
            case 2:
                if(n == 0 ){
                    System.out.println(" - No added Record - ");
                }else{
       System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s  %n", "ID", "Name", "Price", "Stock", "Sold", "Status");
        for(i = 0; i < n; i++){
           pr[i].viewProduct();
        }
        System.out.println("Total Profit: "+ttp);
                }
        
        
          break;
          
            case 3:  
                if(n == 0 ){
                    System.out.println(" - No added Record - ");
                }else{
                      System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s  %n", "ID", "Name", "Price", "Stock", "Sold", "Status");
        for(i = 0; i < n; i++){
           pr[i].viewProduct();
        }
                System.out.print("Enter ID to Update: ");
                int id1 = sc.nextInt();
                editProduct(pr , id1, n);
                }
                break;
                
                
            case 4:
                
                if(n == 0){
                    System.out.println(" - No added Record - ");
                }else{
                    System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s  %n", "ID", "Name", "Price", "Stock", "Sold", "Status");
        for(i = 0; i < n; i++){
           pr[i].viewProduct();
        }
                System.out.print("Enter ID to delete: " );
                int id2 = sc.nextInt();
                deleteProduct(pr, id2, n );
                n--;
                }
                break;
                
                
            case 5: 
                exit(0);
                break;
                
            default:
                System.out.println(" - Invalid Choice, Error - ");
                break;
    }
        System.out.print("Do you want to continue ? ( 1 / 0 ): ");
        res = sc.nextInt();
    }while(res != 0);
    
    }
}
