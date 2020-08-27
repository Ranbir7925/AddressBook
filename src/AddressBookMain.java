public class AddressBookMain
{
    public static void main(String[] args)
    {
        System.out.println("Welcome to Address Book Program");
        AddressBookDetails addressBookDetails=new AddressBookDetails("Ranbir","Singh","Worli","Mumbai","Maharashtra",400030,"7021377931");
        addressBookDetails.display();
    }
}
