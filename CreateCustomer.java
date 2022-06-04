import java.util.*;
public class CreateCustomer {
    Scanner scan=new Scanner(System.in);
    static int id=1;
    int cus_id;
    String cus_name;
    String cus_phno;
    CreateCustomer()
    {
      cus_id=id++;
    }
    void get_customerdetails()
    {
        System.out.println("Enter Customer Name:");
        cus_name=scan.next();
        System.out.println("Enter Customer mobileno:");
        cus_phno = scan.next();
    } 
    void display_customer()
    {
        System.out.println(""+cus_id+"\t"+cus_name+"\t"+cus_phno+"\t");
    }
    
}
