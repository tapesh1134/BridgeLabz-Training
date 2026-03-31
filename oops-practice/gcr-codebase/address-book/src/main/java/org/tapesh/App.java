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
        String inputName;
        Contact contact;
        AddressBookService service = new AddressBookService();
        AddressBookUtil util = new AddressBookUtil();
        while(run){
            System.out.println("\n----Enter a option----");
            System.out.println("Add Book: (1)");
            System.out.println("Fetch contact: (2)");
            System.out.println("Update contact: (3)");
            System.out.println("Exit: (-1)");

            int input = scanner.nextInt();
            scanner.nextLine();
            switch (input){
                case 1:
                    contact = util.createContact();
                    service.addContact(contact);
                    break;
                case 2:
                    System.out.println("Enter name of person: ");
                    inputName = scanner.nextLine();
                    contact = service.getContact(inputName);
                    System.out.println("\n----Details----");
                    System.out.println(contact.toString());
                    break;
                case 3:
                    System.out.println("Enter name of person: ");
                    inputName = scanner.nextLine();
                    contact = util.editContact(service.getContact(inputName));
                    System.out.println("\n----Updated Details----");
                    System.out.println(contact.toString());
                    service.addContact(contact);
                    break;
                case -1:
                    run = false;
                    break;
                default:
                    System.out.println("Invalid input.");
            }
        }
    }
}
