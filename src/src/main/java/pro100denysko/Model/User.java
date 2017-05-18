package pro100denysko.Model;

public class User {
    private String Name;
    private String Surname;
    private int id;

    public User(String name, String surname, int id) {
        Name = name;
        Surname = surname;
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getSurname() {
        return Surname;
    }

    public void setSurname(String surname) {
        Surname = surname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
