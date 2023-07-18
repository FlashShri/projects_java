public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("~~~~~~~~~~~~~~~Email Admin App~~~~~~~~~~~~~~~~~~~~");

        // called the constructor to set initial data
        Email emp1 = new Email("Elon","Musk");
        
        //set the user define behaviour
        emp1.setAltEmail("elonmusk.dev@twitter.com");
        emp1.setMailboxCapacity(350);
        emp1.changePassowrd("elon@123");

        //get the user specific behaviour
        emp1.getAltEmail();
        emp1.getMailboxCapacity();
        emp1.getPassword();

        emp1.displayInfo();
    
    }
}
