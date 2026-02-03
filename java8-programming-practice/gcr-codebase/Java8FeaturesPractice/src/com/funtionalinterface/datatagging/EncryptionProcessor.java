package com.funtionalinterface.datatagging;
public class EncryptionProcessor {

    public static void encryptObject(Object obj) {
        if (obj instanceof SensitiveData) {
            System.out.println("Encrypting sensitive data: " + obj);
            // Here you would implement real encryption logic
        } else {
            System.out.println("No encryption needed: " + obj);
        }
    }

    public static void main(String[] args) {
        User user = new User("Rudra", "mypassword123");
        Customer customer = new Customer("Ananya", "ananya@mail.com");

        encryptObject(user);      // encrypted
        encryptObject(customer);  // skipped
    }
}
