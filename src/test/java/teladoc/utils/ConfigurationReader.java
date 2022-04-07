package teladoc.utils;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigurationReader {
    //#1- Create properties object
    private static Properties properties = new Properties();

    static {
        try {
            //#2- Load the file into FileInputStream
            FileInputStream inputStream = new FileInputStream("configuration.properties");
            //#3 load to properties object with the file
            properties.load(inputStream);

            //#4 close the file after loading to free up memory
            inputStream.close();
        } catch (Exception e) {

            System.out.println("File not found in Configuration properties.");
        }
    }

    //USE THE ABOVE CREATED LOGIC TO CREATE A RE-USABLE STATIC METHOD
    public static String getProperty(String key){
        return properties.getProperty(key);
    }
}
