package com.bridgelabz;

public class Contact {


    String firstName;
    String lastName;
    String address;
    String city;
    String state;
    String zip;
    String phoneNo;
    String email;
    public Contact(String firstName, String lastName, String address, String city, String state, String zip,
                   String phoneNumber, String emailId) {
        super();
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phoneNo = phoneNumber;
        this.email = emailId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Contact [firstName=" + firstName + ", lastName=" + lastName + ", address=" + address + ", city=" + city
                + ", state=" + state + ", zip=" + zip + ", phoneNo=" + phoneNo + ", email=" + email + "]";
    }
    public void displaData() {
        System.out.println("\nFirst Name : "+firstName);
        System.out.println("Last Name : "+lastName);
        System.out.println("Address : "+address);
        System.out.println("City : "+city);
        System.out.println("State : "+state);
        System.out.println("Zip : "+zip);
        System.out.println("Phone Number : "+phoneNo);
        System.out.println("Email Id : "+email);
    }


}
