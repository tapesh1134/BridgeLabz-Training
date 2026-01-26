package org.tapesh;

import org.tapesh.modal.Contact;
import org.tapesh.service.AddressBookService;
import org.tapesh.util.AddressBookUtil;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        boolean run = true;
        AddressBookService service = new AddressBookService();
        AddressBookUtil util = new AddressBookUtil();
        while(run){
            System.out.println("\n----Enter a option----");
            System.out.println("Add Book: (1)");
            System.out.println("Fetch contact: (2)");
            System.out.println("Exit: (0)");

            int input = scanner.nextInt();
            scanner.nextLine();
            switch (input){
                case 1:
                    Contact contact = util.createContact();
                    service.addContact(contact);
                    break;
                case 2:
                    System.out.println("Enter name of person: ");
                    String inputName = scanner.nextLine();
                    System.out.println(service.getContact(inputName));
                    break;
                case 0:
                    run = false;
                    break;
                default:
                    System.out.println("Invalid input.");
            }
        }
    }
}
