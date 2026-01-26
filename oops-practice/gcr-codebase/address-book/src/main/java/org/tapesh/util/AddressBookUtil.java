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
            e.printStackTrace();
        }
        return null;
    }
}
