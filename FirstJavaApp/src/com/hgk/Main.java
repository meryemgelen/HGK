package com.hgk;

public class Main {

    public static void main(String[] args) {

//        Customer cust = new Customer();
//
//        cust.customerID=1;
//        cust.name="Gani";
//        cust.surName="Tombalak";
//        cust.cart=new Cart();
//        cust.cart.items= new Item[2];
//
//        Item item = new Item();
//        item.itemID=1;
//        item.desc="Gomlek";
//        item.price=49.99;
//        item.quantity=2;
//
//        cust.cart.items[0]= item;
//
//        item = new Item();
//        item.itemID=2;
//        item.desc="Pantolon";
//        item.price=59.99;
//        item.quantity=1;
//
//        cust.cart.items[1]= item;
//
//        System.out.println(cust.customerID);
//        System.out.println(cust.name);
//        System.out.println(cust.surName);
//
//        for(Item currentItem:cust.cart.items){
//            System.out.println(currentItem.itemID);
//            System.out.println(currentItem.desc);
//            System.out.println(currentItem.price);
//            System.out.println(currentItem.quantity);
//            System.out.println("--------------------------------");
//        }


//        int[] myArr= {0,1,2,3,4,5};
//
//        for(int i :myArr){
//            System.out.println(i);
//        }


        int[][] myArr = new int[5][];
        for(int i=0;i<myArr.length ;i++)
        {
            myArr[i]= new int[i+1];
        }

        System.out.println("myarr:"+myArr.length);
        for(int[] subArr:myArr)
        {
            for(int i:subArr)
            {
                System.out.print(" "+i +" ");
            }
            System.out.println();
        }

    }
}