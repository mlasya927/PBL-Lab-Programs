import java.io.*;
import java.util.Date;

public class SerializeEmployee {
    public static void main(String[] args) throws IOException {
        Employee emp = new Employee("Naga Lakshmi", new Date(), "IT", "Software Engineer", 60000.0);

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("data"));
        oos.writeObject(emp);
        oos.close();

        System.out.println("Employee object has been serialized to file 'data'.");
    }
}
