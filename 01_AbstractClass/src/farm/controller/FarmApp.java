package farm.controller;

import farm.model.*;


public class FarmApp {
    public static void main(String[] args) {
//        Animal animal = new Animal("Prototype",1,1,true);
//        System.out.println(animal.printInfo());
//        animal.voice();
//        animal.benefit();
        Cat cat = new Cat("Pushok", 3.5, 9.5, true);
        Cat cat2 = new Cat("Not Pushok", 3.5, 9.5, true);
        Cat cat3 = new Cat("Pushok", 1.5, 2.5, false);
        System.out.println(cat.printInfo());
        cat.voice();
        cat.benefit();

//        Dog dog = new Dog("Sharik", 6, 25.7, true, true) {
//        };
//        System.out.println(dog.printInfo());
//        dog.voice();
//        dog.benefit();

        ExpoDog expoDog = new ExpoDog("", 0.5, 3.3, true, true);
        System.out.println(expoDog.printInfo());
        expoDog.benefit();
        for (int i = 0; i < 30; i++) {
            System.out.println(expoDog.getPaw().getPawDescription());
        }

        ServiceDog serviceDog = new ServiceDog("Muhtar", 9.5, 33.3, true, true);
        System.out.println(serviceDog.printInfo());
        serviceDog.benefit();
        for (int i = 0; i < 30; i++) {
            System.out.println(serviceDog.getPaw().getPawDescription());
        }

        Cow cow = new Cow("Burenka", 6, 550, false, true);
        cow.benefit();
        cow.voice();
        System.out.println(cow.printInfo());
        System.out.println(cow.reactionToDanger(true));
       // Chip chip = new Chip(123456, "Ivan Smith");
        //cow.setChip(chip);
       // System.out.println(cow.getChip().getId() + " " + cow.getChip().getOwner());
        //cow.getChip().setId(1_000_000);
        //System.out.println(cow.getChip().getId() + " " + cow.getChip().getOwner());
        //System.out.println(cow.getChip());

        Horse horse = new Horse("Zarya", 7, 550, true, false);
        horse.voice();
        horse.benefit();
        System.out.println(horse.printInfo());
        System.out.println(horse.reactionToDanger(true));
        System.out.println("===============================================");

        Animal[] animals = new Animal[5];
        animals[0] = cat;
        animals[1] = serviceDog;
        animals[2] = expoDog;
        animals[3] = cow;
        animals[4] = horse;

//        Cow maybeACow = (Cow)animals[3];
//        System.out.println(maybeACow.hasHorns());
//
//        maybeACow = (Cow)animals[0];
//        System.out.println(maybeACow.hasHorns());
        long id = 1_000_000;
        for (int i = 0; i < animals.length; i++) {
            Chip chip = new Chip(id, "Ivan Smith");
            animals[i].setChip(chip);
            id++;
            animals[i].voice();
            animals[i].benefit();
            System.out.println(animals[i].printInfo());
        }
        for (int i = 0; i < animals.length; i++) {
            System.out.println(animals[i].getClass() + " " + animals[i].getChip());
        }
        System.out.println("cat equals cat");
        System.out.println(cat.equals(cat));
        System.out.println("cat equals cat2");
        System.out.println(cat.equals(cat2));
        System.out.println("cat equals cat3");
        System.out.println(cat.equals(cat3));

    }
}
