package Prototype_And_Registry;

import java.util.HashMap;

public class EnemyRegistry {
    private HashMap<String , Enemy> registry;

    public EnemyRegistry(){
        registry= new HashMap<>();
    }
    public void setRegistry(String  key,Enemy value){
        registry.put(key, value);
    }
    public  Enemy getRegistry(String  key){
        return  registry.getOrDefault(key,null);
    }
    public void removeRegistry(String key){
        registry.remove(key);
    }


}
