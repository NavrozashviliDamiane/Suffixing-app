import java.util.Properties;

public class Main {
    public static void main(String[] args) throws Exception {
        String configPath = args[0];
        ConfigReader config = new ConfigReader(configPath);

        Properties properties = config.readData();
        FileChanger fileChanger = new FileChanger(properties);

        fileChanger.change();
    }
}
