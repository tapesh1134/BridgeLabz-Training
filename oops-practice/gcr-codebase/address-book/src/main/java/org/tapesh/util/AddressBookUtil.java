package org.tapesh.util;

import org.tapesh.modal.Contact;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Scanner;

public class AddressBookUtil {
    public static Scanner scanner = new Scanner(System.in);
    public Contact createContact(){
        Contact contact = new Contact();
        try{
            Class<?> cls = Contact.class;
            Field[] fields = cls.getDeclaredFields();
            for(Field f : fields){
                System.out.printf("Enter %s: ", f.getName());
                String input = scanner.nextLine();
                String setterName = "set" + Character.toUpperCase(f.getName().charAt(0)) + f.getName().substring(1);
                Method setter = cls.getMethod(setterName,f.getType());
                if(f.getType() == int.class){
                    setter.invoke(contact,Integer.parseInt(input));
                } else if(f.getType() == long.class){
                    setter.invoke(contact,Long.parseLong(input));
                } else {
                    setter.invoke(contact,input);
                }
            }
            return  contact;
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return null;
    }

    public Contact editContact(Contact contact){
        try {
            Class<?> cls = Contact.class;
            Field[] fields = cls.getDeclaredFields();

            boolean run = true;
            while (run){
                System.out.println("\n----Edit contact----");
                System.out.println("First Name: " + contact.getFirstName());
                System.out.println("Last Name: " + contact.getLastName());
                for(int i = 2;i<fields.length;i++){
                    String getterName = "get" + Character.toUpperCase(fields[i].getName().charAt(0)) + fields[i].getName().substring(1);
                    Method getterMethod = cls.getMethod(getterName);
                    Object value = getterMethod.invoke(contact);
                    System.out.println(i-1 + ". Edit " + fields[i].getName() +": " + value);
                }
                System.out.println("0 Exit: ");
                System.out.print("Fields to update ( Separated with commas ): ");
                String[] input = scanner.nextLine().split(",");
                for(String s : input){
                    if(Integer.parseInt(s) ==0){
                        run = false;
                        break;
                    }
                    Field f = fields[Integer.parseInt(s)+1];
                    System.out.print("Update detail for " + f.getName() + ": ");
                    String setterName = "set" + Character.toUpperCase(f.getName().charAt(0)) + f.getName().substring(1);
                    Method setterMethod = cls.getMethod(setterName,f.getType());
                    String updated = scanner.nextLine();
                    if(f.getType() == int.class){
                        setterMethod.invoke(contact,Integer.parseInt(updated));
                    } else if(f.getType() == long.class){
                        setterMethod.invoke(contact,Long.parseLong(updated));
                    } else {
                        setterMethod.invoke(contact,updated);
                    }
                }
            }
            return contact;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
}
