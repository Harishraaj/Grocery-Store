import java.util.*;
class Main
{
    static Scanner scan=new Scanner(System.in);
    static CreateItem[] additem= new CreateItem[200];
    static int start_item=0,sum_Amount=0;
    void calc_sum(int sum)
    {
        sum_Amount=sum_Amount+sum;
    }
    int getCost(int id)
    {
        int cost=0;
        for(int i=0;i<start_item;i++)
        {
            if(additem[i].item_id==id)
            {
                cost=additem[i].item_price;
                break;
            }
        }
        return cost; 
    }

    public static void main(String[]args) {
       // Scanner scan=new Scanner(System.in);
        int choice,i,cus_count,item_count,start_cus=0,start_bill=0,cus_bill;
        CreateCustomer[] addcus=new CreateCustomer[200];
        Bill[] addbill=new Bill[200];
        while(true)
        {
            System.out.println("------------------------------------<   GROCERY SHOP    >------------------------------------");
            System.out.println("\n1 ->  Create item\n2 ->  Create customer\n3 ->  Purchase item\n4 ->  Bill Records\n5 ->  Bill Based on Customer\n6 ->  Item Records\n7 ->  Customer Records\n8 ->  Update Cost\n");
            System.out.println("-----------------------------------------------------------------------------------------------");
            System.out.println();
            System.out.println("Enter your Choice :");
            choice=scan.nextInt();
            Bill billobj=new Bill();
            switch(choice)
            {
                case 1:
                {
                    System.out.println("Enter no of items to add :");
                    item_count=scan.nextInt();
                    for(i=0;i<item_count;i++)
                    {
                        CreateItem newitem=new CreateItem();
                        newitem.get_itemdetails();
                        additem[start_item]=newitem;
                        start_item++;
                    }
                    break;
                }
                case 2:
                {
                    System.out.println("Enter no of customers to add :");
                    cus_count=scan.nextInt();
                    for(i=0;i<cus_count;i++)
                    {
                        CreateCustomer  newcus= new CreateCustomer();
                        newcus.get_customerdetails();
                        addcus[start_cus]=newcus;
                        start_cus++;
                    }
                    break;
                }
                case 3:
                {
                    billobj.get_purchasedetails();
                    addbill[start_bill]=billobj;
                    start_bill++;
                    break;
                }
                case 4:
                {
                    System.out.println("------------------------------------------");
                    System.out.println("Itemid\tQty\tCost\tTotalcost");
                    System.out.println("------------------------------------------");
                    for(i=0;i<start_bill;i++)
                    {
                        addbill[i].display_all_bill();
                    }
                    System.out.println("-------------------------------------------");
                    System.out.println("                         Total Amount :"+sum_Amount);
                    System.out.println("-------------------------------------------");
                    System.out.println();
                    sum_Amount=0;
                    break;
                }
                case 5:
                {
                    System.out.println("Enter the CustomerID : ");
                    cus_bill=scan.nextInt();
                    System.out.println("------------------------------------------");
                    System.out.println("Item_Id\tItem_Qty\tCost\tItem_cost");
                    System.out.println("------------------------------------------");
                    for(i=0;i<start_bill;i++)
                    {
                        if(addbill[i].cus_id==cus_bill)
                        {
                            addbill[i].display_bill();
                        }
                    }
                    break;
                }
                case 6:
                { 
                    System.out.println("------------------------------------------");
                    System.out.println("Item_Id\tItem_Name\tItem_cost");
                    System.out.println("------------------------------------------");
                    for(i=0;i<start_item;i++)
                    {
                        additem[i].display_item();
                    }
                    System.out.println();
                    break;
                }
                case 7:
                {
                    System.out.println("------------------------------------------");
                    System.out.println("Cus_Id\tCus_Name\tCus_phno");
                    System.out.println("------------------------------------------");
                    for(i=0;i<start_cus;i++)
                    {
                        addcus[i].display_customer();
                    }
                    System.out.println();
                    break;
                }
                case 8:
                {
                    System.out.println("Enter the item id to update cost : ");
                    int up_itemid=scan.nextInt();
                    System.out.println("Enter the new cost : ");
                    int newcost=scan.nextInt();
                    for(i=0;i<start_item;i++)
                    {
                        if(additem[i].item_id==up_itemid)
                        {
                            additem[i].item_price=newcost;
                        }
                    }
                    break;
                }
            }

        }
        
    }
}