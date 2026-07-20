import java.io.*;

public class DeserializeEmployee {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("data"));
        Employee emp = (Employee) ois.readObject();
        ois.close();

        System.out.println("Deserialized Employee object:");
        System.out.println(emp);
    }
}
