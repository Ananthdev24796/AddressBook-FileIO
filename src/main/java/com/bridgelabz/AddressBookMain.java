package com.bridgelabz;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBookMain {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            AddressBook addressBook = new AddressBook();
            addressBook.addContacts();
            //addressBook.writeData(addressBook.contactList);
            //addressBook.printData();

            int choice =1;
            //Store contacts to addressBook1

            while (choice!=0){
                switch (choice){
                    case 0:
                        return;
                    case 1:
                        addressBook.addContacts();
                        break;
                    case 2:
                        addressBook.editPersonName();
                        break;
                    case 3:
                        addressBook.displayAddressBook();
                        break;
                    case 4:
                        addressBook.deleteContact();
                        break;

                    case 5:
                        addressBook.writeData(addressBook.contactList);
                        break;
                    case 6:
                        addressBook.printData();
                        break;
                }

                System.out.println("Enter\n0- exit \n1- Add more contact \n2- edit contact \n3- display\n4- delete contact\n5-  Write data to file IO \n6- Read data from file");
                choice = input.nextInt();
            }


        }
    }




