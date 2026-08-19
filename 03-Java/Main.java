public class Main {
    public static void main(String[] args) {

        Hero myHero = new Hero();

        myHero.name = "ironMan";
        myHero.hp = 100;

        myHero.attack();

        if (args.length == 0) {
            System.out.println("No arguments provided.");

            return;
        }
        System.out.println("Hero: " + args[0]);

        System.out.println("program end");
    }
}