package acedamy.luong.io;


import acedamy.luong.domain.Student;
import org.junit.Test;

import java.io.*;
import java.util.Calendar;

public class TestSerializationWriter {


    @Test
    public void writeSerializableObjectToFile() throws IOException {
        Student student = new Student("dhluong", Calendar.getInstance().getTime());

        FileOutputStream fos = new FileOutputStream("students.txt");
        ObjectOutputStream outputStream = new ObjectOutputStream(fos);

        outputStream.writeObject(student);
        outputStream.flush();
        outputStream.close();
    }

    @Test
    public void readDeserializableObject() throws IOException, ClassNotFoundException {
        ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("students.txt"));
        Student student = (Student) inputStream.readObject();
        System.out.println(student);
        inputStream.close();
    }
}
