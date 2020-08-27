public class AddressBookDetails
{
    //Variables
    String firstname,lastname,address,city,state,phoneNumber;
    int zipCode;

    //Method to display address book details
    public void display()
    {
        System.out.println("ADDRESS BOOK DETAILS : " );
        System.out.println("----------------------------------------------------");
        System.out.println("NAME: "+this.firstname+" "+this.lastname+"\nADDRESS: "+this.address+"\nCITY: "+this.city+"\nSTATE: "+this.state+"\nZIPCODE: "+this.zipCode+"\nPHONE NO: "+this.phoneNumber);
    }

    //Constructor to initialize variables
    AddressBookDetails(String firstname,String lastname,String address,String city,String state,int zipCode,String phoneNumber)
    {
        this.firstname=firstname;
        this.lastname=lastname;
        this.address=address;
        this.city=city;
        this.state=state;
        this.zipCode=zipCode;
        this.phoneNumber=phoneNumber;
    }

}
