//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Animal lion = new Animal("feline","lion",5,true);
        Zoo myZoo = new Zoo ("eya's zoo","Paris" ,30);
        myZoo.animals[0] = lion;


        Animal elephant = new Animal("Elephantidae", "Dumbo", 10, true);
        Animal snake = new Animal("Serpent", "Kaa", 3, false);
        Animal eagle = new Animal("Accipitridae", "Aigle", 4, false);
        myZoo.animals[1] = elephant;
        myZoo.animals[2] = snake;
        myZoo.animals[3] = eagle;

        myZoo.displayZoo();

        System.out.println(myZoo);

        System.out.println(lion);
    }
}