import java.util.ArrayList;

public class Adressbook {
    public ArrayList<Phonebook> pb = new ArrayList<>();
    public void Adressbook(){
        pb.add(new Phonebook("Карамелька Анна", "+79034890798","Vologda"));
        pb.add(new Phonebook("Фонарик Саймон", "+79100456785","Moscow"));
        pb.add(new Phonebook("Пивоварова Фекла", "+79000019876","Spb"));
    }
    public void showAdressBook(){
        for(Phonebook i : pb){
            System.out.println(i.getName() + " " + i.getPhone() + " " + i.getCity());
        }
    }
}
