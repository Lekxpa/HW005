import java.util.ArrayList;
import java.io.*;
public class FileManager {
//    String FILE_PATH = "./";
    String FILE_PATH = "./Seminar05/Phonebook/src/";
    String FILE_NAME_EXPORT = "export.csv";
    String FILE_PATH_FULL = FILE_PATH+FILE_NAME_EXPORT;
    public void ExportFile(ArrayList<Phonebook> pb){
//        try(FileWriter writer = new FileWriter("notes3.txt", false)){
        try(FileWriter writer = new FileWriter(FILE_PATH + FILE_NAME_EXPORT, false)){
            //false - значит файл будет каждый раз перезаписываться
            // true  - файл будет дополняться новыми данными
        // запись всей строки
//        String text = "Hello Gold!";
//        writer.write(text);
//        // запись по символам
//        writer.append('\n');
//        writer.append('E');
//        writer.flush();
            for(Phonebook i : pb){
                String text = i.getName() + ";" + i.getPhone() + ";" + i.getCity();
                writer.write(text);
//        // запись по символам
                writer.append('\n');
//                writer.append('E');
             }
            writer.flush();
    }
    catch(IOException ex){
        System.out.println(ex.getMessage());
        }
    }
    public void ImportFile(ArrayList<Phonebook> pb){
        try {
            File file = new File(FILE_PATH_FULL);
//создаем объект FileReader для объекта File
            FileReader fr = new FileReader(file);
//создаем BufferedReader с существующего FileReader для построчного считывания
            BufferedReader reader = new BufferedReader(fr);
// считаем сначала первую строку
            String line = reader.readLine();
            while (line != null) {
//                System.out.println(line);
                String[] tmp = line.split(";"); // создаем массив, разделитель
                pb.add(new Phonebook(tmp[0], tmp[1], tmp[2]));
// считываем остальные строки в цикле
                line = reader.readLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}