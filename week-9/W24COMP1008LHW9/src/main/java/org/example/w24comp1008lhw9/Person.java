package org.example.w24comp1008lhw9;

import java.time.LocalDate;
import java.time.Period;

public class Person {
    private String firstName, lastName, address;
    private LocalDate birthday;


    public Person(String firstName, String lastName, String address, LocalDate birthday) {
        setFirstName(firstName);
        setLastName(lastName);
        setAddress(address);
        setBirthday(birthday);
    }


    /**
     * Format Names to remove leading and trailing white spaes and Capitalize the first letter
     * @return
     */
    private String formatName(String name) {
        name = name.trim();
        if (name.length() > 1) {
            return name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
        }
        return name.substring(0, 1).toUpperCase();
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        firstName = formatName(firstName);
        if (firstName.length() >= 2) {
            this.firstName = firstName;
        } else {
            throw new IllegalArgumentException("First Name must be at least 2 characters long");
        }
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        lastName = formatName(lastName);
        if (lastName.length() >= 2) {
            this.lastName = lastName;
        } else {
            throw new IllegalArgumentException("Last Name must be at least 2 characters long");
        }
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        if (birthday.isBefore(LocalDate.now())) {
            this.birthday = birthday;
        } else {
            throw new IllegalArgumentException("Birthday must be in the past");
        }
    }

    /**
     * Returns the age of the person in years
     */
    public int getAge(){
        // return LocalDate.now().getYear() - this.birthday.getYear();
        return Period.between(this.birthday, LocalDate.now()).getYears();
    }

    /**
     * This method will return person's full name and age in years
     * @return
     */
    @Override
    public String toString() {
        return String.format("%s %s is %d years old", this.firstName, this.lastName, getAge());
    }
}
