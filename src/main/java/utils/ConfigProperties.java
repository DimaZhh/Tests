package utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigProperties {

    /***
     * Get property value from `config.properties` as String
     *
     * @param property
     * @return
     * @throws IOException
     */
    public static String getProperty(String property) throws IOException {
        InputStream input =
                ConfigProperties.class.getClassLoader().getResourceAsStream("config.properties");

        Properties properties = new Properties();
        properties.load(input);
        return properties.getProperty(property);
    }

}
