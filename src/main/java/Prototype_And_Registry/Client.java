package Prototype_And_Registry;

public class Client {
    public static void main(String[] args) {
        EnemyRegistry registry= new EnemyRegistry();

        Enemy bot1 = new Bot("bot1","red","22");
        Enemy bot2 = new Bot("bot2","blue","23");
        Enemy human1 = new Human("player1","green","23",false);
        Enemy human2 = new Human("player2","pink","24",true);

       registry.setRegistry(((Bot) bot1).getName(),bot1);
       registry.setRegistry(((Bot) bot2).getName(),bot2);
       registry.setRegistry(((Human) human1).getName(),human1);
       registry.setRegistry(((Human) human2).getName(),human2);

        System.out.println(registry.getRegistry("bot1").toString());

        registry.removeRegistry("bot1");

    }
}
