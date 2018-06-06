package exercise;

public class ShoppingCart{
    public static void main(String[] args) {
        // System.out.println("Welcome to Shopping Cart!");

        String customerName="Mary Smith";
        // String itemDescription="Shirt";
        // String[] items={"Shirt","Socks","Scarf","Belt"};

        double price = 29.99;
        int quantity= 2;
        double tax=1.04;
        String[] items = new String[4];
        items[0]="Shirt";
        items[1]="Belt";
        items[2]="Scarf";
        items[3]="Skirt";
        // double total;
        // total=(price*quantity)*tax;
        // boolean outOfStock=true;//false
        // String message=customerName 
        // + " wants to purchase " +quantity + " " + itemDescription;
        String message=customerName 
        + " wants to purchase " + items.length + " item";
        if(items.length>1){
            message=message+"s";
        }
        System.out.println(message);
        System.out.println("Items purchased");
        for(String item:items){
            System.out.println(item);
        }
        // System.out.println("1. item of cart is "+ items[0]);
        // System.out.println("3. item of cart is "+ items[2]);
        // if(outOfStock){
        //     System.out.println(itemDescription + " is out of stock");
        // } else {
        //     System.out.println(message);
        //     System.out.println("Total cost with tax:"+total);
        // }
    }
}