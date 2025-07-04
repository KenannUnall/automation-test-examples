package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
    public static Properties properties;

    static {
        String dosyaYolu = "src/configuration.properties";
        try {
            FileInputStream fis = new FileInputStream(dosyaYolu);
            // fis dosyayolunu tanimladigimiz configuration.properties dosyasini okuc
            properties = new Properties();
            properties.load(fis); // fis'in okudugu bilgileri properties'e yukledi
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getProperty(String key) {

        return properties.getProperty(key);
    }
}
