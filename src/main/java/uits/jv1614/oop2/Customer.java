package uits.jv1614.oop2;


public class Customer  implements Comparable<Customer>{
   
   private int id;
   private String SurName;
   private String Name;
   private String MiddleName;
   private String address;
   private long NumberCreditCard;
   private int NumberBankAccount;
   
    
 
    public Customer(int id, String Name, String SurName, String MiddleName, String address, long NumberCreditCard, int NumberBankAccount) {
        this.id = id;
        this.Name = Name;
        this.SurName = SurName;
        this.MiddleName = MiddleName;
        this.address = address;
        this.NumberCreditCard = NumberCreditCard;
        this.NumberBankAccount = NumberBankAccount;
        
    }
    
  public int getid() {
        return id;
    }
 
    public void setid(int id) {
        this.id = id;
    }
 
    public String getName() {
        return Name;
    }
 
    public void setName(String name) {
        this.Name = name;
    }
 
    public String getSurname() {
        return SurName;
    }
 
    public void setSurname(String surname) {
        this.SurName = surname;
    }
    public String getMiddleName() {
        return MiddleName;
    }
 
    public void setMiddleName(String surname) {
        this.MiddleName = MiddleName;
    }
     
    public String getAddress() {
        return address;
    }
 
    public void setAddress(String address) {
        this.address = address;
    }
    public int getNumberCreditCard() {
        return (int) NumberCreditCard;
    }
 
    public void setNumberCreditCard(long NumberCreditCardr) {
        this.NumberCreditCard = NumberCreditCard;
    }
    public int getNumberBankAccount() {
        return NumberBankAccount;
    }
 
    public void setNumberBankAccount(int NumberBankAccount) {
        this.NumberBankAccount = NumberBankAccount;
    }
    
    @Override
    public String toString() {
         return " id:" + id + '\n' +
                " name: " + Name + '\n' +
                " surname: " + SurName + '\n' +
                " MiddleName: " + MiddleName + '\n' +
                " address: " + address + '\n' +
                " NumberCreditCard: " + NumberCreditCard + '\n' +
                " NumberBankAccount: " + NumberBankAccount + '\n' ;
    }
   
    @Override
    public int compareTo(Customer o) {
      return this.Name.compareTo(o.Name);
    }
  }

    



