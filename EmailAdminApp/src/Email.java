import java.util.Scanner;

public class Email {

    //fields
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private int mailboxCapacity = 500;
    private String alternateEmail;
    private int defaultPasswordLength = 10;
    private String companySuffix = "tesla.com";
    private String email;
    private int deptchioce;

    //constructor to initialise new employee data

    public Email(String firstName,String lastName){
        this.firstName = firstName;  /// initialising fields
        this.lastName = lastName;
        System.out.println("firstname :"+firstName+" \nlastname: "+lastName);

        // call a setdept method and return to department
        this.department = setDepartment(); 
        System.out.println("your choice: "+department);

        //call for random password method
        this.password = getRandomPassword(defaultPasswordLength);
        System.out.println("your password: "+password);

        //generate email
        this.email = getEmail();
        System.out.println(email);

    }

    //ask for department
    private String setDepartment (){
        System.out.println("Enter the department code:\n1 for sales\n2 for development\n3 for accounts\n0 for more");
        Scanner sc = new Scanner(System.in);
        this.deptchioce = sc.nextInt();
        sc.close();
        if(deptchioce ==1) {return "Sales";}
        else if(deptchioce == 2){return "Development";}
        else if(deptchioce == 3){return "Accounts";}
        else if(deptchioce == 0){return "staff";}
        else return " ";
        
    }

    //generating email
    private String getEmail(){

        //creating department suffix
        String deptSuffix = " ";
        switch (deptchioce) {
            case 1: deptSuffix = "sales"; break;
            case 2: deptSuffix = "dev"; break;
            case 3: deptSuffix = "acc"; break;
            case 4: deptSuffix = "staff"; break;
            default:
                break;
        }

        return firstName.toLowerCase()+lastName.toLowerCase()+"."+deptSuffix+"@"+companySuffix;

    }

    //method for random password
    private String getRandomPassword(int length){
        String dataset = "ABCDEEFGHIJKLNMOPQRSTUVWXYZ1233456789!@#$";
        char[] password = new char[length];

        for(int i =0; i<length; i++){
            int randomNum=(int)(Math.random()*dataset.length());
            //System.out.println(randomNum);
            password[i] = dataset.charAt(randomNum);
        }
        return new String(password); // as password is char array to convert it as String
    }
    
    //set mailbox capacity
    public void setMailboxCapacity(int capacity){
        this.mailboxCapacity = capacity;
    }
    //set Alternate Email
    public void setAltEmail(String AltEmai){
        this.alternateEmail = AltEmai;
    }
    //set new password 
    public void changePassowrd(String password){
        this.password = password;
    }
    

    //get Alternate email
    public String getAltEmail(){
        return alternateEmail;
    }
    //get MailBox Capacity
    public int getMailboxCapacity(){
        return mailboxCapacity;
    }
    //get password
    public String getPassword(){
        return password;
    }
}
