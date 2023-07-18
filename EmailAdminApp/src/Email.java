public class Email {

    //fields
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private int mailboxCapacity;
    private String alternateEmail;

    //constructor to initialise new employee data

    public Email(String firstName,String lastName){
        this.firstName = firstName;
        this.lastName = lastName;

        System.out.println("firstname :"+firstName+" \nlastname: "+lastName);
    }
    
}
