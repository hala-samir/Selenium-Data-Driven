package data;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class LoadProperties {
    public static Properties data;
    public String path;
    private Properties pro;
    private FileInputStream stream;
    public Properties setLanguage(String language) throws IOException {
        pro = new Properties();
        if(language.equalsIgnoreCase("ar")){
            path = System.getProperty("user.dir") + "/src/properties/lang.arabic.properties";
        }
        else if (language.equalsIgnoreCase("en")) {
            path =  System.getProperty("user.dir") + "/src/properties/lang.english.properties";
        }
        else if (!language.equalsIgnoreCase("en")||!language.equalsIgnoreCase("ar")){
            System.out.println("The choosed language is not supported");
        }
        stream = new FileInputStream(path);
        pro.load(stream);
        return pro;
    }
}
