package Singleton;

import java.util.HashMap;

public class AppConfigImpl implements  AppConfig{
    private static AppConfigImpl instance;
    public HashMap<String , String> repo;

    private AppConfigImpl(){
        repo=new HashMap<>();
    }

    public  static AppConfigImpl getInstance(){
          if(instance==null){
              synchronized (AppConfigImpl.class){
                  if(instance==null){
                      instance= new AppConfigImpl();
                  }
              }
          }
          return  instance;
    }

    @Override
    public void setConfig(String key, String value) {
          repo.put(key, value);
        System.out.println("Key: "+key+ " and Value: "+value+" inserted sucessfully.");
    }

    @Override
    public String getConfig(String key) {
        String value = repo.getOrDefault(key,null);
        if(value!=null){
            System.out.println("key value retrived for key: "+key);

        }else {
            System.out.println("No value for key: "+key);
        }
        return value;

    }

    @Override
    public HashMap<String, String> getAll() {
        System.out.println("Repo copy sent successfully");
        return new HashMap<>(repo);
    }
}
