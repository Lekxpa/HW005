import java.util.ArrayList;

public class Adressbook {
    public ArrayList<Phonebook> pb = new ArrayList<>();
    public void Adressbook(){
        pb.add(new Phonebook("Карамелька Анна", "+79034890798","Vologda", "Work"));
        pb.add(new Phonebook("Фонарик Саймон", "+79100456785","Moscow", "Friend"));
        pb.add(new Phonebook("Пивоварова Фекла", "+79000019876","Spb", "Work"));
        pb.add(new Phonebook("Фиалкин Максим Валерьянович", "+79100045673","Moscow", "Home"));
    }
    public void showAdressBook(){
        for(Phonebook i : pb){
            System.out.println(i.getName() + " " + i.getPhone() + " " + i.getCity() + " " + i.getType());
        }
    }
}
