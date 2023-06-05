package Util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ConfigReader {
    private static Properties properties;
    public static Properties inilialize_Properties(){
        properties=new Properties();
        try {
            String name = "C:\\Users\\testinium\\IdeaProjects\\AmazonWithCucumber\\src\\test\\resources\\config.properties";
            FileInputStream fileInputStream=new FileInputStream(name);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        return getProperties();
    }

    public static Properties getProperties(){
        return properties;
    }

}
