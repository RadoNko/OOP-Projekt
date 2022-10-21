package sk.stuba.fei.oop.user;

import lombok.Data;
import sk.stuba.fei.oop.insurance.DefaultInsurance;

import java.util.Set;

@Data
public class User {

    private String id;
    private String name;
    private String surname;
    private String email;
    private Address homeAddress;
    private Address postalAddress;
    private Set<DefaultInsurance> contracts;

    public User(String id, String name, String surname, String email, Address homeAddress, Address postalAddress, Set<DefaultInsurance> contracts) {
        this.id = id;
        setName(name);
        setSurname(surname);
        setEmail(email);
        this.homeAddress = homeAddress;
        this.contracts = contracts;
        if (postalAddress == null || postalAddress.toString().trim().isEmpty())
            this.postalAddress = homeAddress;
    }

    //when postal_adress not found , set it to home_adress
    public User(String id, String name, String surname, String email, Address homeAddress, Set<DefaultInsurance> contracts) {
        this.id = id;
        setName(name);
        setSurname(surname);
        setEmail(email);
        this.homeAddress = homeAddress;
        this.contracts = contracts;
        this.postalAddress = homeAddress;
    }

    public void setId(String id) {
        if (id == null || id.trim().isEmpty())
            throw new IllegalArgumentException("ID must be filled");
        this.id = id;
    }

    public void setName(String name) {
        if (name == null || name.trim().isEmpty())
            throw new IllegalArgumentException("Name must be filled");
        this.name = name;
    }

    public void setSurname(String surname) {
        if (surname == null || surname.trim().isEmpty())
            throw new IllegalArgumentException("Surname must be filled");
        this.surname = surname;
    }

    public void setEmail(String email) {
        if (email == null || email.trim().isEmpty() || !email.contains("@") || !email.contains("."))
            throw new IllegalArgumentException("Email is invalid");
        this.email = email;
    }

}
