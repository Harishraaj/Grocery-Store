import java.util.*;
public class CreateItem {
    Scanner scan = new Scanner(System.in);
    static int id=1;
    int item_id,i;
    String item_name;
    int item_price;
    CreateItem()
    {
      item_id=id++;
    }
    void get_itemdetails()
    {
        System.out.println("Enter Item Name:");
        item_name=scan.next();
        System.out.println("Enter Item Cost:");
        item_price = scan.nextInt();
    } 
    void display_item()
    {
        System.out.println(""+item_id+"\t"+item_name+"\t\t"+item_price+"\t");
    }
}
