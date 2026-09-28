/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Student
 */
public class GamingConsoleReports {

    private static int i;
    public static void main(String[]args){
        
        //1D ARRAYS//
        String [] cities ={"Cape Town","Port Elizabeth","Pretoria"};
        String [] consoles ={"PS5","XBOX", "SWITCH"};
         
         //2D ARRAY FOR ROWS WHICHBELONGS TO THE CITIES, COLUMNS FOR CONSOLES//
         
        
         int[][] sales = {{1000, 2000,3000},  //CAPE TOWN//
                         {2000, 3000,4000},  //PE//
                         {1500,1100,1200},  //PRETORIA//
            
         };
         
         //ARRAY SHOWING THE TOTALS FOR THE CITIES//
         int [] cityTotals = new int[cities.lenght];
         
         //CALCULATING THE TOTALS FOR EACH CITY//
         
         for (int i =0;i < cities.lenght; i++){
             int total = 0;
                     for (int j=0; j< consoles.lenght; j++){
                         total +- sale[i][j];
             }
                     cityTotals[i] = total;
         }
         
         //FINDING THE CITY WITH THE HIGHEST SALES
         int maxIndex = 0;
         for int (int i =1; i< cityTotals.length;i++){
        if(cityTotals[i]> cityTotals[maxIndex]){
            maxIndex=i;
        }
    }
         //DISPLAYING THE REPORT//
         String Line = "-----------------------------------------------------";
         
         System.out.println(Line);
          System.out.println(GAMING CONSOLE REPORT);
          
          for (int j=0;j< consoles.lenght;j++){
               System.out.printf("%-10s",consoles[j]);
          }
          System.out.println();   
          
          for(int i =0;i < consoles.lengthe;i++){
            int j;
              System.out.printf("%-10d",sales[i][j]);
              
          }
          System.out.println(Line);
           System.out.println(CONSOLE SALES TOTALS FOR EACH CITY);
            System.out.println(Line);
            
            for (int i =0;i< cities.length;i++){
                System.out.printf("%-18s%d%n", cities[i], cityTotals[i]);
            }
            System.out.println();
            System.out.println("CITY WITH THE MOST SALES : "cities[maxIndex]);
            System.out.println(Line);
            
    }
    
}
