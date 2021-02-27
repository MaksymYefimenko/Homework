package utils;

import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class AllureProperties {
    String path = "allure-results";
    Map<String, String> properties = new HashMap<String, String>();

    public void saveProps() {
        try {
            Properties props = new Properties();
            FileOutputStream fos = new FileOutputStream(path + "/environment.properties");
            for (Map.Entry<String, String> entry : properties.entrySet()) {
                try {
                    props.setProperty(entry.getKey(), entry.getValue());
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
            props.store(fos, "See https://github.com/allure-framework/allure-app/wiki/Environment");
            fos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public AllureProperties setProperty(String key, String value) {
        properties.put(key, value);
        return this;
    }
}
