/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pos;

/**
 *
 * @author Ntsako
 * @student number : 211230235
 * @Project Mid-Terminator
 * @module : IRP Part Time
 */
public class FoodMenuItem 
{
    
    private String foodItem;
    private String category;
    private double price;
    private Sale saleInfo;
    private int saleCnt;
    
    
    public FoodMenuItem()
    {
    
    }
    
    public FoodMenuItem(String item, int cnt, double pr)
    {
        foodItem = item;
        price = pr;
        saleCnt = cnt;
    }
    
    public FoodMenuItem(String item, String cat, double pr, Sale s)
    {
       foodItem = item;
        category = cat;     
        price = pr;
        saleInfo = s;
    }
    
     public FoodMenuItem(String item, String cat, double pr)
    {
       foodItem = item;
        category = cat;     
        price = pr;
        
    }
     
      public FoodMenuItem(String item,  double pr)
    {
       foodItem = item;    
        price = pr;
        
    }
    
    public void setFoodItem(String item)
    {
      foodItem = item;
    }

    public void setCategory(String cat)
    {
       category = cat;  
    }
     
    public void setPrice(double pr)
    {
        price = pr;
    }
      
    public void setSale(Sale s)
    {
        saleInfo = s;
    }
    
    public int getQnty()
    {
        return saleCnt;
    }
    
    
    
    
     public String getFoodItem()
    {
      return foodItem;
    }

    public String getCategory()
    {
       return category;  
    }
     
    public double getPrice()
    {
        return price;
    }
      
    public String toString()
    {
    return String.format("%-30s%-30s%-30s", ""+getFoodItem(), getCategory(), Double.toString(getPrice()));
    }

    
}

