package uits.jv1614.oop2;

import java.util.ArrayList;
import java.util.Arrays;

public class App {
    public static void main(String[] args){
    
        Customer [] cust = new Customer[4];
        long [] interval = {3326579123456712L,  3326579123456799L};
        cust [0] = new Customer (1, "Петр" , "Петров", "Петрович", "Барабашова 32", 3326579123456712L, 3664 );
        cust [1] = new Customer (2, "Артур" , "Герасимов", "Герасимович", "Холодная гора 4", 3326579123456750L, 2345 );
        cust [2] = new Customer (3, "Иван" , "Иванов", "Иванович", "Советская 67", 3326579123456802L, 1234);
        cust [3] = new Customer (4, "Евгений" , "Жмуркин", "Андреевич", "Герое Труда 7", 3326579123456900L, 6578);
        
        for(Customer elem : cust) {
            System.out.println(elem.toString());
        }
      
        System.out.println("\n Список покупателей, отсортированный по имени:");
            Arrays.sort(cust); {
            for(Customer elem : cust) {
            System.out.println(elem.toString());
            }
         }
          cardInInterval(interval, cust);  
    }
     public static void cardInInterval(long[] interval, Customer[] cust){
         System.out.println("Cписок покупателей, у которых номер кредитной карты находится в заданном интервале:");
            ArrayList(cust);
            for(Customer elem : cust) {
                if (elem.getNumberCreditCard() >= interval[0] && elem.getNumberCreditCard() <= interval[1]) {
                System.out.println(elem.toString());
                            // System.out.println(elem.getName() + " " + elem.getSurname());
                }
            }
     }
 }


    

