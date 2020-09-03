import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBookDetails
{
    //Variables
    String firstname,lastname,address,city,state,phoneNumber;
    int zipCode;

    Scanner scan = new Scanner(System.in);
    List<AddressBookDetails> addressBookList = new ArrayList<AddressBookDetails>();

    //Method to take Name from User
    public void addName()
    {
        AddressBookDetails addressBook = new AddressBookDetails();
        System.out.println("Enter First Name: ");
        addressBook.firstname = scan.next();
        System.out.println("Enter Last Name: ");
        addressBook.lastname = scan.next();
        addDetails(addressBook);
        addressBookList.add(addressBook);
    }

    //Method to take details from User
    public void addDetails(AddressBookDetails addressBook)
    {
        System.out.println("Enter your Address: ");
        addressBook.address = scan.next();
        System.out.println("Enter your City: ");
        addressBook.city = scan.next();
        System.out.println("Enter your State: ");
        addressBook.state = scan.next();
        System.out.println("Enter your zipcode: ");
        addressBook.zipCode = scan.nextInt();
        int length = (int)(Math.log10(addressBook.zipCode)+1);
        while (length != 6)
        {
            System.out.println("Enter 6 digit zip code");
            addressBook.zipCode = scan.nextInt();
            length = (int)(Math.log10(addressBook.zipCode)+1);
            if(length == 6)
            {
                break;
            }
        }
        System.out.println("Enter your phone number: ");
        addressBook.phoneNumber = scan.next();
    }


    //Method to Edit and Delete from address book
    public void editOrDeleteDetails(int select) {
        boolean check=true;
        System.out.println("Enter First Name: ");
        String firstName = scan.next();
        System.out.println("Enter Last Name: ");
        String lastName = scan.next();
        for (AddressBookDetails details : addressBookList)
        {
            if (details.firstname.equals(firstName))
            {
                if (details.lastname.equals(lastName))
                {
                    check=false;
                    switch (select)
                    {
                        case 0:
                            addDetails(details);
                            break;
                        case 1:
                            addressBookList.remove(details);
                            break;
                    }
                }
            }
        }
        if (check == true)
        {
            System.out.println("Record does not exist");
        }
    }

    //Method to display address book details
    public void display() {
        System.out.println("ADDRESS BOOK DETAILS : " );
        System.out.println("----------------------------------------------------");
        for (AddressBookDetails details : addressBookList) {
            System.out.println("NAME: " + details.firstname + " " + details.lastname + "\nADDRESS: " + details.address + "\nCITY: " + details.city + "\nSTATE: " + details.state + "\nZIPCODE: " + details.zipCode + "\nPHONE NO: " + details.phoneNumber);
        }
    }

}

