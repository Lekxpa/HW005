public class Phonebook {
    String Name;
    String Phone;
    String City;
    String Type;

    public Phonebook(String name, String phone, String city, String type) {
        this.Name = name;
        this.Phone = phone;
        this.City = city;
        this.Type = type;
    }

    public String getPhone() {
        return Phone;
    }

    public String getName() {
        return Name;
    }

    public String getCity() {
        return City;
    }

    public String getType() {
        return Type;
    }
}
class Friend extends Phonebook{
    public Friend(String name, String phone, String city, String type) {
        super(name, phone, city, type);
    }
    @Override
    public String getType(){ return "Friend";}
}
class Work extends Phonebook{
    public Work(String name, String phone, String city, String type) {
        super(name, phone, city, type);
    }
    @Override
    public String getType(){ return "Work";}
}
class Home extends Phonebook{
    public Home(String name, String phone, String city, String type) {
        super(name, phone, city, type);
    }
    @Override
    public String getType(){ return "Home";}
}


