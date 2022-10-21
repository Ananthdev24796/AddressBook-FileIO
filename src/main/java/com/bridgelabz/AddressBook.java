package com.bridgelabz;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;

public class AddressBook {

    public static String ADDRESS_BOOK_FILE_NAME = "AddressBook-IO.txt";

    ArrayList<Contact> contactList = new ArrayList<Contact>();
    static int index=0;
    Scanner input = new Scanner(System.in);
    String firstName1;
    String lastName1;
    String address1;
    String city1;
    String state1;
    String zip1;
    String phoneNo1;
    String email1;

    public void addContacts() {
        System.out.println("Welcome to Address Book");
        System.out.print("Enter first name : ");
        firstName1 = input.nextLine();
        System.out.print("Enter last name :  ");
        lastName1 = input.nextLine();
        System.out.print("Enter address :  ");
        address1 = input.nextLine();
        System.out.print("Enter state :  ");
        state1 = input.nextLine();
        System.out.print("Enter city :  ");
        city1 = input.nextLine();
        System.out.print("Enter zip :  ");
        zip1 = input.nextLine();
        System.out.print("Enter phoneNo :  ");
        phoneNo1 = input.nextLine();
        System.out.print("Enter email :  ");
        email1 = input.nextLine();
        Contact contactPerson = new Contact(firstName1, lastName1, address1, city1, state1, zip1, phoneNo1, email1);
        if(contactList.isEmpty()) {
            contactList.add(contactPerson);
        }
        else {
            for(int i=0;i<contactList.size();i++) {
                if(contactList.get(i).firstName.equals(firstName1)&&contactList.get(i).lastName.equals(lastName1)) {
                    System.out.println("Contact already Exist");
                    break;

                }
                else {
                    contactList.add(contactPerson);

                }
            }
        }

        index++;
    }
    public void editPersonName() {
        int check=0;
        System.out.println("\nEnter current name of person to edit name");
        String currentName = input.nextLine();
        System.out.println("Enter name to update");
        String updateName = input.nextLine();

        for(int i=0; i < index; i++) {
            if(contactList.get(i).firstName.equals(currentName)) {
                contactList.get(i).firstName = updateName;
                check=1;
                System.out.println(check);
                return;
            }
        }

        if(check==0) {
            System.out.println("No record found with given name");
        }
    }
    public void displayAddressBook() {
        System.out.println("Displaying all contacts from address book");
        for(int i=0; i < contactList.size(); i++) {
            contactList.get(i).displaData();

        }
    }
    public void deleteContact() {

        System.out.println("\nEnter name of person to delete contact");
        String name = input.nextLine();
        for(int i=0; i <contactList.size(); i++) {
            if(contactList.get(i).firstName.equals(name)) {
                contactList.remove(i);
                break;
            }
        }
    }
    Dictionary<String, String> cityPerson = new Hashtable<String, String>();
    public void displayPersonInCity(String cityName) {
        for(int i=0; i <contactList.size(); i++) {
            if(contactList.get(i).city.equalsIgnoreCase(cityName)) {
                cityPerson.put(cityName, contactList.get(i).firstName);
            }
        }
        System.out.println("Number of contacts with city "+cityName+" : "+cityPerson.size()+"\n"+cityPerson);
    }

    //Search for person in state
    Dictionary<String, String> statePerson = new Hashtable<String, String>();
    public void displayPersonInState(String stateName) {

        for(int i=0; i <contactList.size(); i++) {
            if(contactList.get(i).state.equalsIgnoreCase(stateName)) {
                statePerson.put(stateName, contactList.get(i).firstName);
            }
        }
        System.out.println("Number of contacts with state "+stateName+" : "+statePerson.size()+"\n"+statePerson);
    }

    //Sort addressBook by first name

    public void sortAddressBookByFirstName() {
        System.out.println("Sorted address book by first name");
        List<Contact> sortedAddressBook =  contactList.stream().sorted(Comparator.comparing(Contact::getFirstName)).collect(Collectors.toList());
        //		List<String> sortedList = list.stream().sorted().collect(Collectors.toList());
        //comparing(Contact::getFirstName)).collect(Collectors.toList());
        sortedAddressBook.forEach(contact -> contact.displaData());
    }

    public void writeData(List<Contact> contactList) {
        StringBuffer empBuffer = new StringBuffer();
        contactList.forEach(address -> {
            String addressBookString = address.toString().concat("\n");
            empBuffer.append(addressBookString);
        });

        try {
            Files.write(Paths.get(ADDRESS_BOOK_FILE_NAME), empBuffer.toString().getBytes());
        }catch (IOException e) {
            e.printStackTrace();
        }
    }

    //Display data of file

    public void printData() {
        try {
            Files.lines(new File("AddressBook-IO.txt").toPath()).forEach(System.out::println);
        }catch(IOException e) {
            e.printStackTrace();
        }
    }






}