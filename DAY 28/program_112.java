// Contact management system
import java.util.Scanner;
import java.util.ArrayList;
class Contact{
    private String number;
    private String name;
    private int sL;

    public Contact(int sL, String name, String number){
        this.number = number;
        this.name = name;
        this.sL = sL;
    }
    public String getNumber(){
        return number;
    }
    public String getName(){
        return name;
    }
    public int getSL(){
        return sL;
    }
    public void setNumber(String newNum){
        this.number = newNum;
    }
    public void setName(String newName){
        this.name = newName;
    }
    public void setSL(int sL){
        this.sL = sL;
    }
    public void display(){
        System.out.println("-----------------------------------");
        System.out.println(sL + " | " + name +" | "+ number);
    }
}
class ContactList{
    ArrayList<Contact> contacts = new ArrayList<>();
    public void updateContacts(){
        for(int i=0; i<contacts.size(); i++){
            contacts.get(i).setSL(i+1);
        }
    }
    public void addContact(Contact contact){
        contacts.add(contact);
        contact.setSL(contacts.size()); 
    }
    public Contact searchContact(String number){
        for(Contact ct : contacts){
            if(ct.getNumber().equals(number)){
                return ct;
            }
        }
        return null;
    }
    public void deleteContact(String number){
        Contact ct = searchContact(number);
        if(ct != null){
            contacts.remove(ct);
            System.out.println("Contact removed Successfully");
            updateContacts();
        }
        else{
            System.out.println("No such Contact");
        }
    }
    public void viewContacts(){
        if(!contacts.isEmpty()){
            System.out.println("===== Contact Details =====");
            for(Contact ct : contacts){
                ct.display();
            }
            System.out.println("-----------------------------------");
        }
        else{
            System.out.println("Empty Contacts");
        }
    }
}
public class program_112{
    public static void main(String[] args){
        ContactList ctl = new ContactList();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;
        while(running){
            System.out.println("===== CONTACTS =====");
            System.out.println("1. Add Contact");
            System.out.println("2. Delete Contact");
            System.out.println("3. View Contact list");
            System.out.println("4. Exit");
            System.out.println();
            System.out.println("Enter Choice :- ");
            int choice = scanner.nextInt();
            switch(choice){
                case 1:
                    System.out.print("Name   :- ");
                    scanner.nextLine();
                    String name = scanner.nextLine();
                    System.out.print("Number :- ");
                    String number = scanner.nextLine();
                    ctl.addContact(new Contact(0, name , number));
                    System.out.println("Contact added successfully");
                    break;
                case 2:
                    System.out.println("Number :- ");
                    scanner.nextLine();
                    String number1 = scanner.nextLine();
                    ctl.deleteContact(number1);
                    break;
                case 3:
                    ctl.viewContacts();
                    break;
                case 4:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid Input");
                    break;
            }
        }
        scanner.close();
    }
}