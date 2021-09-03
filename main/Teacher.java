package main;

public class Teacher extends Patron{

    private String teacherId;
    
    public Teacher(){
    }
    public Teacher ( int id, String name, String depart, String mail, String contact, String address ) {
        super (  id, name, depart, mail, contact, address );
        this.teacherId = ""+id;
    }

    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId;
    }

    public String getTeacherId() {
        return this.teacherId;
    }

    public void showInfo() {
        System.out.println ( "\nTeacher ID: " + getTeacherId() );
        System.out.println ( "Teacher Name" + getName() );
        System.out.println ( "Teacher Credit Balance: " + getAmount() );
        System.out.println ( "Teacher Department: " + getDepartmentName() );
        System.out.println ( "Teacher Email: " + getEmail() );
        System.out.println ( "Teacher Contact: " + getContact() );
        System.out.println ( "Teacher Address: " + sgetAddress() );
    }

}