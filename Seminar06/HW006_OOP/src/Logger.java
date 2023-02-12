import java.io.FileWriter;
import java.util.Date;
public class Logger {
    public static class LogActions {
        public static String pathLog = "./Seminar06/HW006_OOP/src/log.txt";
    }
    private static String path = LogActions.pathLog;
    public Logger() {
    }
    public void LogActions(String log) {
        try (FileWriter writer = new FileWriter(path, true)) {
            writer.append(log + ", " + new Date() + "\n");
            writer.flush();
        } catch (Exception e) {
            System.out.println(e.getCause());
        }
    }
}