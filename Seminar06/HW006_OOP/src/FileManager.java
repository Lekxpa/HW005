import java.io.*;
import java.util.ArrayList;
public class FileManager {
    String FILE_PATH = "./Seminar06/HW006_OOP/src/";
    String FILE_NAME_EXPORT = "export.txt";
    String FILE_PATH_FULL = FILE_PATH+FILE_NAME_EXPORT;
    public void ExportFile(ArrayList<Phonebook> pb){
        try(FileWriter writer = new FileWriter(FILE_PATH + FILE_NAME_EXPORT, false)){
            for(Phonebook i : pb){
                String text = i.getName() + ";" + i.getPhone() + ";" + i.getCity() + ";" + i.getType();
                writer.write(text);
                writer.append('\n');
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
            FileReader fr = new FileReader(file);
            BufferedReader reader = new BufferedReader(fr);
            String line = reader.readLine();
            while (line != null) {
                String[] tmp = line.split(";");
                pb.add(new Phonebook(tmp[0], tmp[1], tmp[2], tmp[3]));
                line = reader.readLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}