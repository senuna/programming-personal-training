package eu.senuna.ListsAndArrayLists;

import java.util.ArrayList;

/**
 * Created by senuna on 16.11.16.
 */
public class GroceryList {
    //list of objects
    private ArrayList<String> groceryList = new ArrayList<String>();
    //it's a method - so the empty Constructor will be called
    private static int[] myNumbers = new int[50];

    public void addGroceryItem(String item){
        groceryList.add(item);
    }

    public ArrayList<String> getGroceryList() {
        return groceryList;
    }

    public void printGroceryList(){
        System.out.println("You have " + groceryList.size() + " items in your list");
        for(int i=0; i<groceryList.size(); i++){
            System.out.println((i+1) + " " + groceryList.get(i)); //we call a method for getting items
        }
    }

    public void modifyGroceryItem(int position, String newItem){
        groceryList.set(position, newItem);
        System.out.println("You just changed item number: " + (position+1) + " from your list");
    }

    public void modifyGroceryItem(String currentItem, String newItem){
        int position = findItem(currentItem);
        if(position >= 0){
            modifyGroceryItem(position, newItem);
        }
    }

    public void removeGroceryItem(int position, String newItem){
        groceryList.set(position, newItem);
        System.out.println("Grocery item " + (position+1) + "has been modified.");
    }

    public void removeGroceryItem(int position){
        //TODO: change for positions
        //String theItem = groceryList.get(position);
        groceryList.remove(position);
    }

    private int findItem(String searchedItem){
        return groceryList.indexOf(searchedItem);
//        boolean exist = groceryList.contains(searchedItem); //contains() make a quick search for that item
//        int position = groceryList.indexOf(searchedItem);
//        if (position >= 0) {
//            return groceryList.get(position);
//        }
//        return null;

    }

    public boolean onFile(String searchItem){
        int position = findItem(searchItem);
        if(position >= 0){
            return true;
        }
        return false;
    }

}
