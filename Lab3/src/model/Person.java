package model;

public class Person {
    private String name;
    private String phone_number;
    private String email_address;

    public Person(){
        this.name = "";
        this.email_address = "";
        this.phone_number = "";
    }

    public Person(String name, String phone_number, String email_adress){
        this.name = name;
        this.email_address = email_adress;
        this.phone_number = phone_number;
    }

    public String getName(){
        return this.name;
    }
    public String getPhone_number(){
        return this.phone_number;
    }

    public String getEmail_address() {
        return email_address;
    }

    public void setEmail_address(String email_address) {
        this.email_address = email_address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public String toString() {
        return "name: " + name + "\nphone number: " + phone_number + "\nemail: " + email_address;
    }
}
