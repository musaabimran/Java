public class Lesson14{

    public static void main(String[] args){


        Animal genericAnimal = new Animal();
        System.out.println(genericAnimal.getName());
        System.out.println(genericAnimal.favFood);


        // I create a Cat class like any other
        Cat morris = new Cat("Morris", "Tuna", "Rubber Mouse");

        // Print out the name, favFood and favToy
        System.out.println(morris.getName());
        System.out.println(morris.favFood);
        System.out.println(morris.favToy);

        Animal tabby = new Cat("Tabby", "Salmon", "Ball");

        acceptAnimal(tabby);

    }

    public static void acceptAnimal(Animal randAnimal){

        System.out.println(randAnimal.getName());
        System.out.println(randAnimal.favFood);


        randAnimal.walkAround();

        Cat tempCat = (Cat) randAnimal;

        System.out.println(tempCat.favToy);

        System.out.println(((Cat) randAnimal).favToy);

        System.out.println(randAnimal.getName() + " is a Cat");

    }

}
