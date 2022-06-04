import java.util.*;
public class Bill{

    static int item_count;
    Scanner scan=new Scanner(System.in);
    static int id=1;
    int bill_id,i,cus_id,start_purchase=0,sum,cus_sum;
    Purchase[] newpurchase= new Purchase[400];
    Main objmain=new Main();
    Bill()
    {
      bill_id=id++;
    }
    void get_purchasedetails()
    {
        System.out.println("Enter the customerid");
        cus_id=scan.nextInt();
        System.out.println("Enter the item count:");
        item_count=scan.nextInt();
        for(i=0;i<item_count;i++)
        {
            Purchase purchaseobj = new Purchase();
            purchaseobj.get_purchasedetails();
            newpurchase[start_purchase]=purchaseobj;
            start_purchase++;
        }
    } 
    void display_bill()
    {
        cus_sum=0;
        for(i=0;i<start_purchase;i++)
        {
            cus_sum=newpurchase[i].total+cus_sum;
            newpurchase[i].display_purchasedetails();
        }
        System.out.println("-------------------------------------------");
        System.out.println("                         Total Amount :"+cus_sum);
        System.out.println("-------------------------------------------");

    }
    void display_all_bill()
    {
        sum=0;
        for(i=0;i<start_purchase;i++)
        {
            sum=newpurchase[i].total+sum;
            newpurchase[i].display_purchasedetails();
        }
        objmain.calc_sum(sum);
    }
}
