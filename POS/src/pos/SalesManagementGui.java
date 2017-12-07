/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pos;



import java.awt.*;
import java.awt.event.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
/**
 *
 * @author Ntsako
 * @student number : 211230235
 * @Project Mid-Terminator
 * @module : IRP Part Time
 */
public class SalesManagementGui 
{
    
   String categoryList[]  = {"Drinks", "Meal", "Starter"};
   ArrayList<FoodMenuItem> menuItems = new ArrayList<>();
   ArrayList<Sale> sale = new ArrayList<>(); 
   ArrayList<String> allItems = new ArrayList<>();
   int cnt[] = new int[allItems.size()]; 
   double tot[] = new double[allItems.size()]; 
   ArrayList<FoodMenuItem> report = new ArrayList<>();
 //  ArrayList<FoodMenuItem> report1 = new ArrayList<>();
   FoodMenuItem report1[] = new FoodMenuItem[report.size()+1];

    private  JPanel pnlAddItem;
    
 
     private JLabel lblCat, lblItem, lblPrice;
     private JComboBox cmbCat;
     private JTextField txtItem,txtPrice ;
     private JButton btnSave, btnClear, btnReturn, btnDelete;
     private JTextArea txtArea;
     private JTable table;
     private JScrollPane scrollPane;
     
     public void displayReport()
     {
         
         
            for(int i = 0; i < report.size(); i++)
            {
                   System.out.println(report.get(i).getFoodItem() + "\t" + report.get(i).getPrice());
            }
            
            
            double price = 0;
            String item = "";
            int quantity = 0;
            double pr = 0;
            
            int a = 0;
//            while(a < report.size())
//            {
//                item = allItems.get(a);
//                for(int i = 0; i < report.size(); i++)
//                {
//                   if(allItems.get(i).equalsIgnoreCase(item))
//                   {
//                       quantity++;
//                   
//                    //FoodMenuItem report1[] = new FoodMenuItem[allItems.size()];
//                   }
//                }
//                System.out.println(allItems.size() + "\t" + report.size() + "\t" + report1.length);
//                
//                 report1[a] = new FoodMenuItem(item, quantity, pr);
//                 a++;   
//                
//            }
//            
//            for(int i = 0; i < report1.length; i++)
//            {
//                   System.out.println(report1[i].getFoodItem() + "\t" + report1[i].getQnty() + "\t" + report1[i].getPrice());
//            }
            
            
     }
    
    public SalesManagementGui()
    {
       MenuGui menu = new MenuGui();
       show();
    }
    
    
     public void show()
    {
        menuItems.add(new FoodMenuItem("Cappuccino", "Drinks", 10.25));
        menuItems.add(new FoodMenuItem("Cheese Burger", "Meal", 11.50));
        menuItems.add(new FoodMenuItem("Coffee", "Drinks", 5.00));
        menuItems.add(new FoodMenuItem("Calamari", "Starter", 5.50));
        menuItems.add(new FoodMenuItem("Fish and Chips", "Meal", 11.50));
        menuItems.add(new FoodMenuItem("Gatsby", "Meal", 8.50));
        menuItems.add(new FoodMenuItem("Hot Wings", "Starter", 6.00));

        
        for(int i = 0; i < menuItems.size(); i++)
        {
        System.out.println(menuItems.get(i).toString());
        }
    }
    
    public void addAllItems()
    {
         allItems.clear();
        for(int i = 0; i < menuItems.size(); i++)
        {
         
        allItems.add(menuItems.get(i).getFoodItem());
        }
        
    }
    
    
    public class MenuGui implements ActionListener
    { 
        
        private  JPanel pnlMenu;   
        private  JFrame MenuFrame = new JFrame();
        
       
        private final JButton btnDelFood = new JButton("Delete Food Item");
        private final JButton btnSortListFood = new JButton("List of food item");
        private final JButton btnSaleTrans = new JButton("Sales Transaction");
        private final JButton btnsaleReport = new JButton("Sales Report");
        private final JButton btnlogout = new JButton("Logout");
        private final JButton btnExit1 = new JButton("Exit");
        private final JButton btnAddFood = new JButton("Add Food Items");
        
          public MenuGui()
          {
            menu();
          }
        
        public void menu()
        {
            
                pnlMenu = new JPanel();
                pnlMenu.setBorder(BorderFactory.createTitledBorder( BorderFactory.createEtchedBorder(), "Menu"));

                ImageIcon icon;
                icon = new ImageIcon("images/image1.jpg");
                JLabel label = new JLabel("", icon, JLabel.CENTER);
              //  label.setSize(200, 300);

                ImageIcon icon1;
                icon1 = new ImageIcon("images/welcome.jpg");
                JLabel label1 = new JLabel("", icon1, JLabel.CENTER);

                MenuFrame = new JFrame("Point of Sale Menu");
                MenuFrame.setSize(400,400);
                MenuFrame.setLayout(new GridLayout(3, 1));
                MenuFrame.setResizable(false);
                MenuFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                MenuFrame.setVisible(true);

                pnlMenu.add(btnAddFood);
                pnlMenu.add(btnSortListFood);
                pnlMenu.add(btnDelFood);
                pnlMenu.add(btnSaleTrans);
                pnlMenu.add(btnsaleReport);
                pnlMenu.add(btnlogout);
                pnlMenu.add(btnExit1);


                MenuFrame.add(label1);
                MenuFrame.add(pnlMenu);
                MenuFrame.add(label);


                btnAddFood.addActionListener(this);
                btnDelFood.addActionListener(this);
                btnSortListFood.addActionListener(this);
                btnSaleTrans.addActionListener(this);
                btnsaleReport.addActionListener(this);
                btnlogout.addActionListener(this);
                btnExit1.addActionListener(this);

        }
        
            public void actionPerformed(ActionEvent e)
            {
                        if(e.getSource()== btnAddFood)
                         {
                             MenuFrame.setVisible(false);
                             AddFoodGui foodGui = new AddFoodGui();
                         }
                          else if(e.getSource()== btnSortListFood)
                         {
                             MenuFrame.setVisible(false);
                             FoodListGui foodList = new FoodListGui();
                           
                         }
                          else if(e.getSource()== btnDelFood)
                         {
                             
                            MenuFrame.setVisible(false);
                            DeleteFoodGui deleteGui = new DeleteFoodGui();
                           
                         }
                          else if(e.getSource()== btnSaleTrans)
                         {
                             MenuFrame.setVisible(false);
                             SalesGui sale = new SalesGui();
                         
                         }
                          else if(e.getSource()== btnsaleReport)
                         {
    
//                                if(sale.isEmpty())
//                                {
//                                    JOptionPane.showMessageDialog(null, "No sales transactions have been made.\nThe report is currently empty");
//                                }
//                                else if(!sale.isEmpty())
//                                {
                                 MenuFrame.setVisible(false);
                                 SaleReportGui report = new SaleReportGui();
                              //  }
                         }
                         else if(e.getSource()== btnlogout)
                         {
                             
                               int result = JOptionPane.showConfirmDialog(null,  "Are you sure you wish to logout ?",null, JOptionPane.YES_NO_OPTION);
                                    if(result == JOptionPane.YES_OPTION) 
                                    {
                                           MenuFrame.setVisible(false);
                                           LoginGui login = new LoginGui(); 
                                      
                                    }  
                             
                             
                             
                
                         }
                         else if(e.getSource()== btnExit1)
                         {
                
                             int result = JOptionPane.showConfirmDialog(null,  "Are you sure you wish to Exit the Application ?",null, JOptionPane.YES_NO_OPTION);
                                    if(result == JOptionPane.YES_OPTION) 
                                    {
                                            System.exit(0);
                                      
                                    }  
                             
                             

                         }
               

             }
    
    
    }
    
    
    public class AddFoodGui implements ActionListener
    {
        private JFrame frmAddFood;
        
        public AddFoodGui()
        {
         addFoodGui();
        }
        
        public void addFoodGui()
            {
              frmAddFood = new JFrame();
              frmAddFood = new JFrame("Add Food");
              frmAddFood.setSize(350,450);
              frmAddFood.setLayout(new FlowLayout());
              frmAddFood.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
              frmAddFood.setVisible(true);
              frmAddFood.setResizable(false);

              pnlAddItem = new JPanel();
              pnlAddItem.setPreferredSize(new Dimension(300,150));
              pnlAddItem.setBorder(BorderFactory.createTitledBorder( BorderFactory.createEtchedBorder(), "Add item"));




              ImageIcon icon;
              icon = new ImageIcon("images/11.gif");
              JLabel label = new JLabel("", icon, JLabel.CENTER);  

              cmbCat = new JComboBox();
              cmbCat.setPreferredSize(new Dimension(200,20));
              lblCat = new JLabel("Category");

              for(int i = 0; i < categoryList.length; i++)
              {
                cmbCat.addItem(categoryList[i]);
              }

              lblItem = new JLabel("Item Name");
              txtItem = new JTextField(17);

              lblPrice = new JLabel("Item Price");
              txtPrice = new JTextField(17);


              btnSave = new JButton("Save");
              btnClear = new JButton("Clear");
              btnReturn = new JButton("Return to Menu");;

              frmAddFood.add(label);

              pnlAddItem.add(lblCat);
              pnlAddItem.add(cmbCat);

              pnlAddItem.add(lblItem);
              pnlAddItem.add(txtItem);

              pnlAddItem.add(lblPrice);
              pnlAddItem.add(txtPrice);

              pnlAddItem.add(btnSave);
              pnlAddItem.add(btnClear);
              pnlAddItem.add(btnReturn);

              frmAddFood.add(pnlAddItem, BorderLayout.CENTER);

             btnSave.addActionListener(this);
              btnClear.addActionListener(this);
              btnReturn.addActionListener(this);
         }
        
                    public void actionPerformed(ActionEvent e)
                    {
                           
                           if(e.getSource()== btnSave)
                            {
                             if(txtItem.getText().equalsIgnoreCase(""))
                                {
                                 JOptionPane.showMessageDialog(null, "Please Enter the Item Name.", "No Item name", JOptionPane.WARNING_MESSAGE);
                                }
                                if(txtPrice.getText().equalsIgnoreCase(""))
                                {
                                 JOptionPane.showMessageDialog(null, "Please Enter the Item Price.", "No Item Price", JOptionPane.WARNING_MESSAGE);
                                }


                                String Cat = cmbCat.getSelectedItem().toString();
                                String item = txtItem.getText();
                                String pri = txtPrice.getText();
                               
//                                for(int i = 0 ; i < menuItems.size(); i++)
//                                {
//                                    if(item.equalsIgnoreCase(menuItems.get(i).getFoodItem()))
//                                    {
//                                      JOptionPane.showMessageDialog(null, "The item you entered already exist.", "Duplicate item.", JOptionPane.WARNING_MESSAGE);
//                                      txtItem.setText("");
//                                      txtPrice.setText("");
//                                      break;
//                                    }
//                                    else
//                                    {
                                        double pr = Double.parseDouble(pri);

                                        menuItems.add(new FoodMenuItem(item,Cat, pr));

                                      //  login.salesGui();

                                        JOptionPane.showMessageDialog(null, "Food Item has been added successfully.", "New Item added", JOptionPane.INFORMATION_MESSAGE);
                                        txtItem.setText("");
                                        txtPrice.setText("");
                                     
                                    
                                    
                                
                                }
                               
                            
                            else if(e.getSource()== btnClear)
                            {
                                txtItem.setText(null);
                                txtPrice.setText(null);

                            }
                            else if(e.getSource()== btnReturn)
                            {
                                frmAddFood.setVisible(false);
                                MenuGui menu =  new MenuGui();
                                
                             
                            }
                           
                    }
   
    
    }
    
    public class FoodListGui implements ActionListener
    {
        JFrame frmListFood;
        public FoodListGui()
        {
           listFoodGui();
        }
        
          public void listFoodGui()
          {
                    
                  
                  frmListFood = new JFrame("List of Food sorted");
                  frmListFood.setSize(550,500);
                  frmListFood.setLayout(new FlowLayout());
                  frmListFood.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                  frmListFood.setVisible(true);

                  pnlAddItem = new JPanel();
                  pnlAddItem.setPreferredSize(new Dimension(500,280));
                  pnlAddItem.setBorder(BorderFactory.createTitledBorder( BorderFactory.createEtchedBorder(), "Sales Item's list"));



                  ImageIcon icon;
                  icon = new ImageIcon("images/image2.jpg");
                  JLabel label = new JLabel("", icon, JLabel.CENTER);  
               

                  String[] columnNames = {"Item name","Item Category","Item Price"};
                 // Object[][] data = {{"Kathy", "Smith","Snowboarding"}};
                  Object[][] data = new Object[menuItems.size()][3];
                  for(int i = 0; i < menuItems.size(); i++)
                  {
                  data[i][0] = menuItems.get(i).getFoodItem();
                  data[i][1] = menuItems.get(i).getCategory();
                  data[i][2] = "R " + Double.toString(menuItems.get(i).getPrice());
                  }

                  TableModel model = new DefaultTableModel(data, columnNames);
                  table = new JTable(data, columnNames);


                  scrollPane = new JScrollPane(table);
                  scrollPane.setPreferredSize(new Dimension(450,240));
                  scrollPane.setEnabled(false);
                  scrollPane.getViewport().setViewPosition(new Point(0,0));

                  btnReturn = new JButton("Return to Main menu");
                  btnReturn.setPreferredSize(new Dimension(180,150));

                  frmListFood.add(label);
                  frmListFood.add(btnReturn);
                  pnlAddItem.add(scrollPane, BorderLayout.CENTER);
                  frmListFood.add(pnlAddItem);

                 btnReturn.addActionListener(this);
          }
          
           public void actionPerformed(ActionEvent e)
            {

                if(e.getSource()== btnReturn)
                {
                     frmListFood.setVisible(false);
                     MenuGui menu = new MenuGui();
                }
            }
    
        
        
    }
    

     public class DeleteFoodGui implements ActionListener
    {
        private JFrame frmDelFood;
        private  JPanel pnlDelItem;
        private JButton btnDelete, btnReturn;
        
        private JFrame frmAddFood;
        
        public DeleteFoodGui()
        {
         delFoodGui();
        }
        
             public void delFoodGui()
            {
              
              frmDelFood = new JFrame("Delete Food");
              frmDelFood.setSize(350,450);
              frmDelFood.setLayout(new FlowLayout());
              frmDelFood.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
              frmDelFood.setVisible(true);
              frmDelFood.setResizable(false);

              pnlAddItem = new JPanel();
              pnlAddItem.setPreferredSize(new Dimension(300,150));
              pnlAddItem.setBorder(BorderFactory.createTitledBorder( BorderFactory.createEtchedBorder(), "Delete item"));




              ImageIcon icon;
              icon = new ImageIcon("images/11.gif");
              JLabel label = new JLabel("", icon, JLabel.CENTER);  

              cmbCat = new JComboBox();
              cmbCat.setPreferredSize(new Dimension(240,50));
              lblCat = new JLabel("Item name");

              for(int i = 0; i < menuItems.size(); i++)
              {
                cmbCat.addItem(menuItems.get(i).getFoodItem());
              }

              


              btnDelete = new JButton("Delete");
              btnDelete.setPreferredSize(new Dimension(100, 50));
                      
                      
              btnReturn = new JButton("Return to Menu");;
              btnReturn.setPreferredSize(new Dimension(150, 50));

              frmDelFood.add(label);
              

              pnlAddItem.add(cmbCat);
              pnlAddItem.add(btnDelete);
              pnlAddItem.add(btnReturn);
             

              frmDelFood.add(pnlAddItem, BorderLayout.CENTER);

              btnDelete.addActionListener(this);
              btnReturn.addActionListener(this);
             
              
            
  
         }
        
                    public void actionPerformed(ActionEvent e)
                    {

                           if(e.getSource()== btnDelete)
                            {
                                
                              String itm = cmbCat.getSelectedItem().toString();  
                              int result = JOptionPane.showConfirmDialog(null,  "Are you sure you wish to delete item : " + itm + " ?",null, JOptionPane.YES_NO_OPTION);
                                    if(result == JOptionPane.YES_OPTION) 
                                    {
                                            for(int i = 0; i < menuItems.size(); i++)
                                            {
                                                if(menuItems.get(i).getFoodItem() == itm)
                                                {
                                                menuItems.remove(i);
                                                break;                             
                                                }

                                            }
                                      
                                    }  
                                    
                                           cmbCat.removeAllItems();
                                           for(int i = 0; i < menuItems.size(); i++)
                                            {
                                              cmbCat.addItem(menuItems.get(i).getFoodItem());
                                            }
                             
                                
                            }
                           else if(e.getSource()== btnReturn)
                           {
                               
                                frmDelFood.setVisible(false);
                                 MenuGui menu = new MenuGui();
    
                           }
                           
                    }
   
    
                    
                  
    }
    
    
     
      public class SalesGui implements ActionListener
    {
        private JFrame frmSale;
        private JPanel pnlSale, pnlBtn1, pnlBtn2;
        private JButton btnAddItem, btnFinalise, btnVoid, btnClose;
        private JList lstSale;
        private JComboBox cmbCategory, cmbItem;
        private JLabel lblItem, lblPrice, lblTotal;
        private JTextField txtPrice, txtTotal;
        private DefaultListModel listModel;
        private Box box;
        
        private double tot = 0;
        private String tender = "";
        private double tend = 0;
        private double change = 0;
        int saleNum = 0;
        
        
        public SalesGui()
        {
           salesGui();
        }
        
          public void salesGui()
          {
                    
                  
                  frmSale = new JFrame("List of Food sorted");
                  frmSale.setSize(650, 470);
                  frmSale.setLayout(new BorderLayout(1,3));
                  frmSale.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                  frmSale.setVisible(true);
                  frmSale.setResizable(false);

                  pnlSale = new JPanel();
                  pnlSale.setPreferredSize(new Dimension(122,280));
                  pnlSale.setBorder(BorderFactory.createTitledBorder( BorderFactory.createEtchedBorder(), "Sales Transaction"));



                  ImageIcon icon;
                  icon = new ImageIcon("images/image2.jpg");
                  JLabel label = new JLabel("", icon, JLabel.CENTER);  
               
                  
                  
              cmbCategory = new JComboBox();
              cmbCategory.setPreferredSize(new Dimension(120,20));
              lblCat = new JLabel("Category");

              for(int i = 0; i < categoryList.length; i++)
              {
                cmbCategory.addItem(categoryList[i]);
              }

             
              
               cmbItem = new JComboBox();
               cmbItem.setPreferredSize(new Dimension(120,20));
               lblItem = new JLabel("Item name"); 
               
               
               
               
              lblPrice = new JLabel("Item price");
              txtPrice = new JTextField(10);
              
              btnAddItem = new JButton("Add item");
              
              btnFinalise = new JButton("Finalise Sale");
              btnFinalise.setPreferredSize(new Dimension(120,30));
              btnFinalise.setEnabled(false);
              
              btnVoid = new JButton("Void Sale");
              btnVoid.setPreferredSize(new Dimension(120,30));
              btnVoid.setEnabled(false);
              
              btnClose =  new JButton("Exit");
              btnClose.setPreferredSize(new Dimension(120,30));
              
              lblTotal = new JLabel("Total Amount");
              txtTotal = new JTextField();
              txtTotal.setPreferredSize(new Dimension(120,30));
              txtTotal.setEditable(false);
              
              listModel = new DefaultListModel();
              listModel.addElement("Category                        Price                     Item");
              listModel.addElement("-------------------------------------------------------------------------");
              lstSale = new JList(listModel);
              lstSale.setPreferredSize(new Dimension(300,200));
              
              
              pnlBtn1 = new JPanel();
              pnlBtn1.setPreferredSize(new Dimension(150,200));
              pnlBtn1.setBorder(BorderFactory.createTitledBorder( BorderFactory.createEtchedBorder(), "Item Select"));
              
             
                 
              pnlBtn1.add(lblCat);
              pnlBtn1.add(cmbCategory);
              pnlBtn1.add(lblItem);
              pnlBtn1.add(cmbItem);
              pnlBtn1.add(lblPrice);
              pnlBtn1.add(txtPrice);
              pnlBtn1.add(btnAddItem);
              
              pnlBtn2  = new JPanel();
              pnlBtn2.setPreferredSize(new Dimension(150,200));
              pnlBtn2.setBorder(BorderFactory.createTitledBorder( BorderFactory.createEtchedBorder(), "Sales"));  
              
             
              pnlBtn2.add(btnFinalise);
              pnlBtn2.add(btnVoid);
              pnlBtn2.add(btnClose);
              pnlBtn2.add(lblTotal);
              pnlBtn2.add(txtTotal);
              
              
              
              
                  
                  pnlSale.add(pnlBtn1, BorderLayout.WEST);
                  pnlSale.add(lstSale, BorderLayout.CENTER);
                  pnlSale.add(pnlBtn2, BorderLayout.EAST);

                  frmSale.add(label, BorderLayout.NORTH);
                  frmSale.add(pnlSale, BorderLayout.CENTER);
                  
                 btnAddItem.addActionListener(this);
                 btnClose.addActionListener(this);
                 btnFinalise.addActionListener(this);
                 btnVoid.addActionListener(this);
                 // cmbItem.addActionListener(this);
                cmbCategory.addActionListener(
                new ActionListener()
                {
                    public void actionPerformed(ActionEvent e)
                    {
                      
                                  if(cmbCategory.getSelectedItem().toString().equalsIgnoreCase("Starter"))
                                {
                                    cmbItem.removeAllItems();
                                   // addAllItems();
                                          for(int i = 0; i < menuItems.size(); i++)
                                          {

                                              if(menuItems.get(i).getCategory().toString().equalsIgnoreCase("Starter"))
                                              {
                                                  cmbItem.addItem(menuItems.get(i).getFoodItem());
                                              }
                                          }
                                   //       itemName = cmbItem.getSelectedItem().toString();


                                }
                                else if(cmbCategory.getSelectedItem().toString().equalsIgnoreCase("Drinks"))
                                {
                                    cmbItem.removeAllItems();
                                  //  addAllItems();
                                          for(int i = 0; i < menuItems.size(); i++)
                                          {

                                              if(menuItems.get(i).getCategory().toString().equalsIgnoreCase("Drinks"))
                                              {
                                                  cmbItem.addItem(menuItems.get(i).getFoodItem());
                                              }
                                          }
                                       //   itemName = cmbItem.getSelectedItem().toString();

                                }
                                else if(cmbCategory.getSelectedItem().toString().equalsIgnoreCase("Meal"))
                                {
                                    cmbItem.removeAllItems();
                                   // addAllItems();
                                          for(int i = 0; i < menuItems.size(); i++)
                                          {

                                              if(menuItems.get(i).getCategory().toString().equalsIgnoreCase("Meal"))
                                              {
                                                  cmbItem.addItem(menuItems.get(i).getFoodItem());
                                              }
                                          }
                                        // itemName = cmbItem.getSelectedItem().toString();


                                }


                        
                    }
                });
                  
                  
                  
                cmbItem.addActionListener(
                new ActionListener()
                {
                    public void actionPerformed(ActionEvent e)
                    {
                      //  JComboBox combo = (JComboBox)e.getSource();
                        String Item = (String)cmbItem.getSelectedItem();
                        
                        for(int i = 0; i < menuItems.size(); i++)
                        {
                            if(menuItems.get(i).getFoodItem() == Item)
                            {
                                    txtPrice.setText(Double.toString(menuItems.get(i).getPrice()));
                            
                            }  

                        }
                        
                    }
                }
                );

              
          }
          
            public void actionPerformed(ActionEvent e)
            {
                int cnt = 0;
                boolean check = false;
                if(e.getSource()== btnAddItem)
                {
                  String s = cmbCategory.getSelectedItem().toString() + "                           R" + txtPrice.getText()
                            + "                      " + cmbItem.getSelectedItem().toString();
                  listModel.addElement(s);
                  
                 tot = tot +  Double.parseDouble(txtPrice.getText());
                  
                 txtTotal.setText("R" + Double.toString(tot));
                 
                 saleNum++;

                 report.add(new FoodMenuItem(cmbItem.getSelectedItem().toString(), Double.parseDouble(txtPrice.getText())));
                 
              
            
                 
                 
                 btnVoid.setEnabled(true);
                 btnFinalise.setEnabled(true);
                    
                }
                else if(e.getSource()== btnClose)
                {
                     int result = JOptionPane.showConfirmDialog(null,  "Are you sure you wish to Exit to Main menu?",null, JOptionPane.YES_NO_OPTION);
                                    if(result == JOptionPane.YES_OPTION) 
                                    {
                                        frmSale.setVisible(false);
                                        MenuGui menu = new MenuGui();
                                    }  
                    
                   //frmSale.setVisible(false);
                  // MenuGui menu = new MenuGui();
                }
                 else if(e.getSource()== btnFinalise)
                {
                   tender = JOptionPane.showInputDialog(null, "The Total to be paid by the customer is R" + Double.toString(tot) +"\nPlease enter the amount paid by the customer.", "Sales Tender amount.", JOptionPane.INFORMATION_MESSAGE);
                   tend = Double.parseDouble(tender);
                   
                        while(tend < tot)
                        {
                         tender = JOptionPane.showInputDialog(null, "The Entered amount is insufient for this transaction.\n" + "The Total to be paid by the customer is R" + Double.toString(tot) +"\nPlease enter the amount paid by the customer.", "Sales Tender amount invalid.", JOptionPane.INFORMATION_MESSAGE);
                         tend = Double.parseDouble(tender);    
                        }
                    change = tend - tot;
                    JOptionPane.showMessageDialog(null, "The Transaction has been finalised successfully\n"
                            + "Transaction amount : R" + tot
                            + "\nAmount paid : R" + tend 
                            + "\nCustomer change : R" + change);
                    
                   
                       
                    sale.add(new Sale(saleNum, tot, tend, change));
                    
                        frmSale.setVisible(false);
                        saleNum = 1;
                        tot = 0;
                        tender = "";
                        tend = 0;
                        change = 0;
                        salesGui();
                }
                else if(e.getSource()== btnVoid)
                {
                    frmSale.setVisible(false);
                    tot = 0;
                    tender = "";
                    tend = 0;
                    change = 0;
                    salesGui();
                }
                
                
               
                
                
               
            }

             
    }
    
     
      public class SaleReportGui implements ActionListener
    {
        JFrame frmListFood, frmReport;
        JButton btnReport, btnRpt;
        JLabel lblDate;
        
        public SaleReportGui()
        {
           salesReport();
        }
        
          public void salesReport()
          {
                    
                  
                  frmListFood = new JFrame("Sale Report");
                  frmListFood.setSize(650,500);
                  frmListFood.setLayout(new FlowLayout());
                  frmListFood.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                  frmListFood.setVisible(true);

                  pnlAddItem = new JPanel();
                  pnlAddItem.setPreferredSize(new Dimension(620,280));
                  pnlAddItem.setBorder(BorderFactory.createTitledBorder( BorderFactory.createEtchedBorder(), "Sales Report"));



                  ImageIcon icon;
                  icon = new ImageIcon("images/image2.jpg");
                  JLabel label = new JLabel("", icon, JLabel.CENTER);  
               


                  String[] columnNames = {"Sale number","Number of items","Total Cost", "Total Paid", "Customer change"};
                 // Object[][] data = {{"Kathy", "Smith","Snowboarding"}};
                  Object[][] data = new Object[sale.size()][5];
                  for(int i = 0; i < sale.size(); i++)
                  {
                  //data[i][0] = menuItems.get(i).getFoodItem();
                 // data[i][1] = menuItems.get(i).getCategory();
                 // data[i][2] = "R " + Double.toString(menuItems.get(i).getPrice());
                      data[i][0] = i+1;
                      data[i][1] = sale.get(i).getItemsSold();
                      data[i][2] = sale.get(i).getTotalSalesValue();
                      data[i][3] = sale.get(i).getTotalPaid();
                      data[i][4] = sale.get(i).getChange();
                  }

                  TableModel model = new DefaultTableModel(data, columnNames);
                  table = new JTable(data, columnNames);


                  scrollPane = new JScrollPane(table);
                  scrollPane.setPreferredSize(new Dimension(600,240));
                  scrollPane.setEnabled(false);
                  scrollPane.getViewport().setViewPosition(new Point(0,0));

                 // (new Dimension(620,280));
                  
                  btnReturn = new JButton("Return to Main menu");
                  btnReturn.setPreferredSize(new Dimension(170,170));
                  
                  btnReport = new JButton("Daily Report");
                  btnReport.setPreferredSize(new Dimension(120,170));
                  
                  frmListFood.add(btnReport, BorderLayout.WEST);
                  frmListFood.add(label, BorderLayout.CENTER);
                  frmListFood.add(btnReturn, BorderLayout.EAST);
                  pnlAddItem.add(scrollPane, BorderLayout.SOUTH);
                  frmListFood.add(pnlAddItem);

                 btnReturn.addActionListener(this);
                 btnReport.addActionListener(this);
          }
          
          
          public void dailyReport()
          {
                    
                  
                  frmReport = new JFrame("Daily Report");
                  frmReport.setSize(550,530);
                  frmReport.setLayout(new FlowLayout());
                  frmReport.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                  frmReport.setVisible(true);

                  pnlAddItem = new JPanel();
                  pnlAddItem.setPreferredSize(new Dimension(500,280));
                  pnlAddItem.setBorder(BorderFactory.createTitledBorder( BorderFactory.createEtchedBorder(), "Daily report"));

                  DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
                  Date date = new Date();
                  System.out.println(dateFormat.format(date)); //2016/11/16 12:08:43

                  String dateTime = dateFormat.format(date);
                  
                  ImageIcon icon;
                  icon = new ImageIcon("images/image2.jpg");
                  JLabel label = new JLabel("", icon, JLabel.CENTER);  
                  

                  String[] columnNames = {"Item name","Sale count","Total"};
                // report   allItems
                  addAllItems();
                  Object[][] data = new Object[menuItems.size()][3];
                 
                 
                  
                for(int i = 0; i < menuItems.size(); i++)
                {
                data[i][0] = menuItems.get(i).getFoodItem();
                data[i][1] = i;
                data[i][2] = menuItems.get(i).getPrice();
                
                }
                  
                  
                  
                  
                  
                  TableModel model = new DefaultTableModel(data, columnNames);
                  table = new JTable(data, columnNames);


                  scrollPane = new JScrollPane(table);
                  scrollPane.setPreferredSize(new Dimension(450,240));
                  scrollPane.setEnabled(false);
                  scrollPane.getViewport().setViewPosition(new Point(0,0));

                  btnRpt = new JButton("Return to Sales Report");
                  btnRpt.setPreferredSize(new Dimension(180,150));
                  
                  
                  lblDate = new JLabel("Report Date : " + dateTime);
                          
                  frmReport.add(label);
                  frmReport.add(btnRpt);
                  pnlAddItem.add(scrollPane, BorderLayout.CENTER);
                  frmReport.add(lblDate);
                  frmReport.add(pnlAddItem);

                 btnRpt.addActionListener(this);
          }
          
          
          
          
          
           public void actionPerformed(ActionEvent e)
            {

                if(e.getSource()== btnReturn)
                {
                 
                     frmListFood.setVisible(false);
                     MenuGui menu = new MenuGui();
                    
                }
                else if(e.getSource()== btnReport)
                {
                 
                     frmListFood.setVisible(false);
                     dailyReport();
                     displayReport();
                    
                }
                else if(e.getSource()== btnRpt)
                {
                 
                     frmReport.setVisible(false);
                     salesReport();
                     
                    
                }
            }
    
           
          // dailyReport()
        
        
    }
    
      
      
      
      
      
     
     
     
    }
