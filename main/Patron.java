package main;

public abstract class Patron{
    protected int id;
    protected String name;
    protected String departmentName;
    protected String email;
    protected String contactNo;
    protected String address;
    protected double amount = 0;

    public Patron (){
    }
    public Patron ( int id, String name, String depart, String mail, String contact, String address ){
        this.id = id;
        this.name = name;
        this.departmentName = depart;
        this.email = mail;
        this.contactNo = contact;
        this.address = address;
    }

    public void setId ( int id ){
        this.id = id;
        
    }
    public void setName ( String name ){
        this.name = name;

    }
    public void setDepartmentName ( String departmentName ){
        this.departmentName = departmentName;

    }
    public void setEmail ( String email ){
        this.email = email;

    }
    public void setContactNo ( String contactNo ){
        this.contactNo = contactNo;

    }
    public void setAddress ( String address ){
        this.address = address;

    }
    public void setAmount ( double amount ){
        this.amount = amount;

    }
    public int getId(){
        return id ;
    }
    public String getName(){
        return name;
    }
    public String getDepartmentName(){
        return departmentName;
    }
    public String getEmail(){  
        return email;
    }
    public String getContact(){
        return  contactNo;
    }
    public String getAddress(){
         return address;
     }
    public double getAmount(){
         return  amount;
     }
    public abstract void showInfo();


}