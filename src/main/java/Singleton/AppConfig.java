package Singleton;

import java.util.HashMap;

public interface AppConfig {
    public void setConfig(String key, String value);
    public String getConfig(String key);
    public HashMap<String,String> getAll();
}
