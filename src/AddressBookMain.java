import java.util.Scanner;

public class AddressBookMain
{
    AddressBookDetails addressBookDetails = new AddressBookDetails();
    Scanner scan = new Scanner(System.in);


    //Method to Select Task
    public void selectTask()
    {
        boolean value = true;
        while (value == true )
        {
            System.out.println("Select the task you want to perform\n1: Add details \n2: Display Details \n3: Edit Details \n4: Delete details \n5: Sort by Name,City,Zipcode or state\n6: Exit");
            int num = scan.nextInt();
            switch (num)
            {
                case 1:
                    addressBookDetails.addName();
                    System.out.println("==============================================================================================");
                    break;
                case 2:
                    addressBookDetails.display();
                    System.out.println("==============================================================================================");
                    break;
                case 3:
                    addressBookDetails.editOrDeleteDetails(0);
                    System.out.println("==============================================================================================");
                    break;
                case 4:
                    addressBookDetails.editOrDeleteDetails(1);
                    System.out.println("==============================================================================================");
                    break;
                case 5:
                    addressBookDetails.sortBy();
                    System.out.println("==============================================================================================");
                case 6:
                    value = false;
                    break;
                default:
                    System.out.println("Invalid Input");
                    System.out.println("==============================================================================================");
            }
        }
    }

    //Main Method
    public static void main(String[] args)
    {
        System.out.println("Welcome to Address Book Program");
        AddressBookMain addressBookMain = new AddressBookMain();
        addressBookMain.selectTask();
    }
}
