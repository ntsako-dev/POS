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
public class Sale 
{
    private int itemsSold;
    private double totalSalesValue, totalPaid, change;
    
  
    
    
    public Sale(int soldItems, double saleTotal, double paidTotal, double ch)
    {
    itemsSold = soldItems;
    totalSalesValue = saleTotal;
    totalPaid = paidTotal;
    change = ch;             
    }
    
    public double getChange()
    {
      return change;
    }
    
    public double getTotalPaid()
    {
      return totalPaid;
    }
    
   
    public void incrementItemsSold()
    {
      itemsSold++;
    }
    
    
    public void incrementTotalSalesValue(double pr)
    {
      totalSalesValue += pr;
    }
    
    public int getItemsSold()
    {
     return itemsSold;
    }
    
    public double getTotalSalesValue()
    {
      return totalSalesValue;
    }
    
    public String toString()
    {
     
        return getItemsSold() + "\t" + getTotalSalesValue();
        
    }
    
    
    
}
