package IO_Example_Of_Files_And_IO;

import java.io.*;

//Save Object in a file
public class SerializeObject {

    public static void main(String[] args) {

        ObjectOutputStream objectOutputStream = null;

        UserProfile userProfile = new UserProfile("Jamie", "Jamieto@gmail.com", "Green", "Some other data");

        // Serializable
        try {
            objectOutputStream = new ObjectOutputStream(new FileOutputStream("userProfile.txt"));
            objectOutputStream.writeObject(userProfile);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
               if (objectOutputStream != null) {
                   try {
                       objectOutputStream.close();
                   } catch (IOException e) {
                       throw new RuntimeException(e);
                   }
               }
        }

        // Deserialize
        UserProfile userProfileRestored;
        ObjectInputStream objectInputStream = null;

        try {
            objectInputStream = new ObjectInputStream(new FileInputStream("userProfile.txt"));
            userProfileRestored = (UserProfile) objectInputStream.readObject();

            System.out.println(userProfileRestored);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            if (objectInputStream != null) {
                try {
                    objectInputStream.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }

    }

}

class UserProfile implements Serializable {

    private String name, email, themeColor;
    public transient String something;

    public UserProfile(String _name, String _email, String _themeColor, String _something) {

        this.name = _name;
        this.email = _email;
        this.themeColor = _themeColor;
        this.something = _something;
    }

    @Override
    public String toString() {
        return "User: " + name +
                "\nEmail: " + email +
                "\nTheme Color: " + themeColor +
                "\nSomething (transient): " + something;
    }
}