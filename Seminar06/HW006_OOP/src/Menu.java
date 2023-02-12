import java.util.Scanner;
public class Menu {
    public static void mainMenu(){
        Scanner in = new Scanner(System.in);
        System.out.println("1 - Show Phonebook\n" +
                "2 - Import\n" +
                "3 - Export");
        System.out.println("*".repeat(25));
        FileManager fm = new FileManager();
        Adressbook phones = new Adressbook();
        Logger logger = new Logger();
        int input = in.nextInt();
        switch (input){
            case 1:
                phones.Adressbook();
                phones.showAdressBook();
                logger.LogActions("Show data of Phonebook");
                break;
            case 2:
                phones.Adressbook();
                fm.ImportFile(phones.pb);
                phones.showAdressBook();
                logger.LogActions("Import data of Phonebook");
                break;
            case 3:
                phones.Adressbook();
                fm.ExportFile(phones.pb);
                phones.showAdressBook();
                logger.LogActions("Export data of Phonebook");
                break;
        }
    }
}
