import java.util.Scanner;

public class AddressBookMain
{
    AddressBookDetails addressBookDetails = new AddressBookDetails();
    Scanner scan = new Scanner(System.in);


    //Method to Select Task
    public void selectTask()
    {
        boolean value = true;
        while (value)
        {
            System.out.println("Select the task you want to perform\n1: Add details \n2: Display Details \n3: Edit Details \n4: Exit\n");
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
                    addressBookDetails.editDetails();
                    System.out.println("==============================================================================================");
                    break;
                case 4:
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
