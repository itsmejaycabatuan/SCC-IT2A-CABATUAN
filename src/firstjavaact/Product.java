
package firstjavaact;

    


public class Product {
    
    int id;
    String name;
    int price, stocks, sold;
    int tep;
    
    public void AddProduct(int pid, String pname, int pr, int st, int sold){
    
        this.id = pid;
        this.name = pname;
        this.price = pr;
        this.stocks = st;
      
        this.sold = sold;
        
    }
    
    public void viewProduct(){
        
        double total = this.price * this.stocks;
      
        String status = ( this.stocks == 0) ? "Out of Stock " : "Available";
        
        
        System.out.printf("%-10d %-10s %-10d %-10d %-10s %-10s %n", this.id, this.name, this.price, this.stocks, this.sold, status);
    }
    
}
