package StreamApi;

import java.util.List;


public class Customer {

    private int id;
    private String name;
    private String location;
    private  String emailId;
    private String contactNo;
    private List<Address> address;

    // Default Constructor
    public Customer(){}

   // Parameterized Constructor
    public Customer(int id, String name, String location, String emailId, String contactNo, List<Address> address) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.emailId = emailId;
        this.contactNo = contactNo;
        this.address = address;
    }

    public String setterName(String name){
        this.name = name;
        return name;
    }

    public String getterName(){
        return name;
    }

    public String setterEmailId(String emailId){
        this.emailId = emailId;
        return emailId;
    }

    public String getterEmailId(){
        return emailId;
    }

    public String setterContactNo(String contactNo){
        this.contactNo = contactNo;
        return contactNo;
    }

    public String getterContactNo(){
        return contactNo;
    }

    public List<Address> setterAddress(List<Address> address){
        this.address = address;
        return address;
    }

    public List<Address> getterAddress(){
        return address;
    }

    @Override
   public String toString(){
       return id + " " + name + " " + location + " " + emailId + " " + contactNo + " " + address;
   }
}
