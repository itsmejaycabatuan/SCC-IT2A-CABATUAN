
package firstjavaact;

import java.util.Arrays;


public class Accounts {
    int id;
    String fname, lname;
    String email, username;
    String pass;
   
    public  void addAccount(int id, String fname, String lname, String email, String username, String password){
       
        this.id = id;
        this.fname = fname;
        this.lname = lname;
        this.email = email;
        this.username = username;
        this.pass = password;
       
       
    }
   
    public void viewAccount(){
        
        System.out.printf("%-10d %-10s %-10s %-20s %-13s %-10s\n",this.id,this.fname,this.lname,this.email,this.username,this.pass);
    
    }
    
    public boolean passwordVerify(String password){
       
        char element = 0;
        int digit = 0;
        int x;
        int upperCase= 0;
       
        String[] compass = {"admin", "1234", "password"};
       
        if(password.length() < 8 ){
            System.out.println("Password must have 8 characters ");
            return false;
        }
        if(Arrays.asList(compass).contains(password)){
            System.out.println("Password is common");
            return false;
        }
        for( x = 0; x < password.length(); x++ ){
            element  = password.charAt(x);
       
        if(Character.isDigit(element)){
            digit++;
        }
        else if(Character.isUpperCase(element)){
            upperCase++;
        }
   }
        if(upperCase == 0 ){
            System.out.println("Must have one uppercase letter");
            return false;
            }
        if(digit == 0){
            System.out.println("Must have consist 1 number");
            return false;
        }
        if(password.matches("[a-zA-Z0-9]+")){
            System.out.println("Must have a special character");
            return false;
        }  
       
        return true;
    }
}
