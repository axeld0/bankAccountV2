package model;

public class Client {
    private int id;
    private String name;
    private String gender;

    /**
     * CONSTRUCTORS
     */

    public Client ()
    {id = 0;
       name = "";
       gender = "";
    }
    public Client(int id, String name, String gender) {
        this.id = id;
        this.name = name;
        this.gender = gender;
    }

    /**
     * GETTERS AND SETTERS
     */

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * toString()
     */

    @Override
    public String toString() {
        return  "id : " + id +
                ", name : " + name +
                ", gender : " + gender  +
                " | \n";
    }
}
