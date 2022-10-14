package ex05truthramos;

import java.util.ArrayList;

public class Store {
  private String name;
  private double earnings;
  private ArrayList<Item> itemList;
  private static ArrayList<Store> storeList = new ArrayList();

  public Store(String name){
    // Initialize name to parameter and earnings to zero
    this.name = name;
    earnings = 0;
    // Initialize itemList as a new ArrayList
    ArrayList<Item> itemList = new ArrayList();
    // add 'this' store to storeList
    storeList.add();
  }

  public String getName(){
    return name;
  }
  public double getEarnings(){
    return earnings;
  }
  public void sellItem(int index){
    // check if index is within the size of the itemList (if not, print statement that there are only x items in the store)
    if (index == itemList.size()) {
        
        // get Item at index from itemList and add its cost to earnings
        earnings = earnings + itemList.get(index).getCost();
        
        // print statement indicating the sale
        System.out.println(itemList.get(index).getName() + " has been sold for " + itemList.get(index).getCost() + " !");
        
    } else {
      System.out.println("There are only " + itemList.size() + " in the store.");
    } 
  }
  public void sellItem(String name){
    // check if Item with given name is in the itemList (you will need to loop over itemList) (if not, print statement that the store doesn't sell it)
      for (int k=0; k<(itemList.size()+1); k++) {
          if (name == itemList.get(k).getName()) {
              
            // get Item at index from itemList and add its cost to earnings
            earnings = earnings + itemList.get(k).getCost();
        
            // print statement indicating the sale
            System.out.println(itemList.get(k).getName() + " has been sold for " + itemList.get(k).getCost() + " !");              
        
          } else {
          k=(itemList.size()+1);
          System.out.println("This store does not have" + name + ".");
          }
          
      }
  }
  public void sellItem(Item i){
    // check if Item i exists in the store (there is a method that can help with this) (if not, print statement that the store doesn't sell it)
    // get Item i from itemList and add its cost to earnings
    // print statement indicating the sale
  }
  public void addItem(Item i){
    // add Item i to store's itemList
    itemList.add(i);
  }
  public void filterType(String type){
    // loop over itemList and print all items with the specified type
    System.out.print("Type selected: " + type + "\n");
    for (int j=0; j<10; j++) {
        if (type == itemList.get(j).getType()) {
            System.out.println("Name: " + itemList.get(j).getName() + "\n" + "Type: " + itemList.get(j).getType());
        }
    }
  }
  public void filterCheap(double maxCost){
    // loop over itemList and print all items with a cost lower than or equal to the specified value
    System.out.print("Maximum cost : " + maxCost + "\n");
    for (int i=0; i<(itemList.size()+1); i++) {
        if (maxCost >= itemList.get(i).getCost()) {
            System.out.println("Name: " + itemList.get(i).getName() + "\n" + "Cost: " + itemList.get(i).getCost());
        }
    }
  }
  public void filterExpensive(double minCost){
    // loop over itemList and print all items with a cost higher than or equal to the specified value
    System.out.print("Minumum cost : " + minCost + "\n");
    for (int h=0; h<(itemList.size()+1); h++) {
        if (minCost <= itemList.get(h).getCost()) {
            System.out.println("Name: " + itemList.get(h).getName() + "\n" + "Cost: " + itemList.get(h).getCost());
        }
    }
  }
  public static void printStats(){
    // loop over storeList and print the name and the earnings'Store.java'
    for (int g=0; g<(storeList.size()+1); g++) {
        System.out.print("Name: " + storeList.get(g).getName() + "\n" + "Earnings: " + storeList.get(g).getEarnings());
    }
  }
}
