import model.Person;

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {
    public static void main(String[] args) throws Exception {


        FileOutputStream fileOutputStream = new FileOutputStream("c:\\root\\test.txt");
        XMLEncoder xmlEncoder = new XMLEncoder(fileOutputStream);
        Person person = new Person();
        person.setId(3);
        person.setName("Ahmad");
        person.setFamily("Javadi");
        person.setSalary(4000);
        Person person1 = new Person();
        person1.setId(4);
        person1.setName("Gholam");
        person1.setFamily("Asadi");
        person1.setSalary(5000);

        xmlEncoder.writeObject(person);
        xmlEncoder.writeObject(person1);

        xmlEncoder.close();
        fileOutputStream.close();




/*
        todo uncomment bellow section after running above section of code
        FileInputStream fileInputStream = new FileInputStream("c:\\root\\test.txt");
        XMLDecoder xmlDecoder = new XMLDecoder(fileInputStream);
        Person person = (Person) xmlDecoder.readObject();
        Person person1 = (Person) xmlDecoder.readObject();
        System.out.println(person.getId());
        System.out.println(person.getName());
        System.out.println(person.getFamily());
        System.out.println(person.getSalary());
        System.out.println("*******************");
        System.out.println(person1.getId());
        System.out.println(person1.getName());
        System.out.println(person1.getFamily());
        System.out.println(person1.getSalary());
*/
    }
}