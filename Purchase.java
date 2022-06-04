import java.util.*;
public class Purchase {
    Scanner scan=new Scanner(System.in);
    int itemid,qty,cost,total=0,check=0,item_cost=0;
    Main obj=new Main();
    void get_purchasedetails()
    {
        System.out.println("Enter ItemId:");
        itemid=scan.nextInt();
        System.out.println("Enter Quantity:");
        qty= scan.nextInt();
        cost =obj.getCost(itemid);
        total=cost*qty;
        item_cost=cost;
    } 
    void display_purchasedetails()
    {
        System.out.println(""+itemid+"\t"+qty+"\t"+item_cost+"\t\t"+total);
    }
}
