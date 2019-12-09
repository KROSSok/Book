package com.company;
import static java.lang.System.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        out.println("Hello Java");
        Game tetris = new Game(501);
        Game darts = null;
        Position myPosition = new Position(3, 4);
        out.println(tetris);
        out.println(darts);
        out.println(myPosition);
        ContactsManager myContactsManager = new ContactsManager();
        Contact mySergey = new Contact();
        mySergey.name="Sergey";
        mySergey.phoneNumber="2345";
        Contact myIgor = new Contact();
        myIgor.name="Igor";
        myIgor.phoneNumber="23111";
        Contact myOrest = new Contact();
        myOrest.name="Orest";
        myOrest.phoneNumber="23111";
        Contact myNazik = new Contact();
        myNazik.name="Nazik";
        myNazik.phoneNumber="23234111";
        Contact myTaras = new Contact();
        myTaras.name="Taras";
        myTaras.phoneNumber="11123111";
        myContactsManager.addContact(mySergey);
        myContactsManager.addContact(myIgor);
        myContactsManager.addContact(myNazik);
        myContactsManager.addContact(myOrest);
        myContactsManager.addContact(myTaras);
        out.println(myContactsManager.friendsCount);
        Contact result = myContactsManager.searchContact("Sergey");
        out.println(result.phoneNumber);
        Book book = new Book("Moto", "Honda");
        book.isBorrowed=true;
        out.println("Hello Java");
    }
}
