import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
    private String configPath;
    public ConfigReader(String configPath){
        this.configPath = configPath;
    }

    public String getConfigPath() {
        return configPath;
    }

    public void setConfigPath(String configPath) {
        this.configPath = configPath;
    }
    public Properties readData() throws Exception {
        FileReader reader = new FileReader(configPath);
        Properties p = new Properties();
        p.load(reader);
        return p;
    }
}
