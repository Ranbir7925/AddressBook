import java.util.Scanner;

public class AddressBookDetails
{
    //Variables
    String firstname,lastname,address,city,state,phoneNumber;
    int zipCode;

    Scanner scan = new Scanner(System.in);

    //Method to take Name from User
    public void addName()
    {
        System.out.println("Enter First Name: ");
        this.firstname = scan.nextLine();
        System.out.println("Enter Last Name: ");
        this.lastname = scan.nextLine();
        addDetails();
    }

    //Method to take details from User
    public void addDetails()
    {
        System.out.println("Enter your Address: ");
        this.address = scan.nextLine();
        System.out.println("Enter your City: ");
        this.city = scan.nextLine();
        System.out.println("Enter your State: ");
        this.state = scan.nextLine();
        System.out.println("Enter your zipcode: ");
        this.zipCode = scan.nextInt();
        int length = (int)(Math.log10(zipCode)+1);
        while (length != 6)
        {
            System.out.println("Enter 6 digit zip code");
            this.zipCode = scan.nextInt();
            length = (int)(Math.log10(zipCode)+1);
            if(length == 6)
            {
                break;
            }
        }
        System.out.println("Enter your phone number: ");
        this.phoneNumber = scan.next();
    }


    //Method to display address book details
    public void display()
    {
        System.out.println("ADDRESS BOOK DETAILS : " );
        System.out.println("----------------------------------------------------");
        System.out.println("NAME: "+this.firstname+" "+this.lastname+"\nADDRESS: "+this.address+"\nCITY: "+this.city+"\nSTATE: "+this.state+"\nZIPCODE: "+this.zipCode+"\nPHONE NO: "+this.phoneNumber);
    }


}
