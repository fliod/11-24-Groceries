// class to represent a grocery item
public class GroceryItem
{
  String name;
  int quantity;
  double priceperunit;
  public GroceryItem(String item, int amount, double dollaz)
  {
    name=item;
    quantity=amount;
    priceperunit=dollaz;
  }
  public double getCost()
  {
    return quantity*priceperunit;
  }
  public void setQuantity(int q)
  {
    quantity=q;
  }
  public String toString()
  {
    String s=quantity+" "+name+" @ $"+priceperunit+" = $"+this.getCost();
    return s;
  }
}
  
