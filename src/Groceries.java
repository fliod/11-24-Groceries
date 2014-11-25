// main program to run the GroceryList
public class Groceries
{
  public static void main(String[] args)
  {
    GroceryList list = new GroceryList();
    GroceryItem I1= new GroceryItem("Oreos", 3, 2.5);
    GroceryItem I2= new GroceryItem("Goldfish Crackers", 2, 1.75);
    GroceryItem I3= new GroceryItem("Apple", 8, 0.23);
    GroceryItem I4= new GroceryItem("Fruit Loops", 2, 4.32);
    GroceryItem I5= new GroceryItem("Pop Tarts", 4, 3.67);
    list.add(I1);
    list.add(I2);
    list.add(I3);
    list.add(I4);
    list.add(I5);
    System.out.println(list.toString());
  }
}
  
