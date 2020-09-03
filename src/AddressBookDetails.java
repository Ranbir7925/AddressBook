import java.util.*;
import java.util.stream.Collectors;

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
        addressBookList = addressBookList.stream()
                .distinct()
                .collect(Collectors.toList());
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
    @Override
    public String toString()
    {
        return "NAME: "+firstname+" "+lastname+"  "+"ADDRESS: "+address+"  "+"CITY: "+city+"  "+"STATE: "+state+"  "+"ZIPCODE: "+zipCode+"  "+"PHONE NO.: "+phoneNumber;

    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AddressBookDetails that = (AddressBookDetails) o;
        return firstname.equals(that.firstname) &&
                lastname.equals(that.lastname) ;
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(firstname, lastname);
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
                            for (int num =0; num<addressBookList.size();num++)
                            {
                                addressBookList.remove(num);
                                break;
                            }
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
        Iterator details = addressBookList.iterator();
        while (details.hasNext())
        {
            System.out.println(details.next());
        }
    }

    //Method to Sort Address Book details Alphabetically
    public void sortByName()
    {
        addressBookList.sort(Comparator.comparing(AddressBookDetails::hashCode));
        this.display();
    }

}

