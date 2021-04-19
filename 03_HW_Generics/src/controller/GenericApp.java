package controller;

import model.Cat;
import model.Dog;
import model.GenericModel;

public class GenericApp {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog("Sharik");

        GenericModel<Dog> dogGenericModel = new GenericModel<>(dog);
        System.out.println(dogGenericModel);
        System.out.println("========================");
        GenericModel<Cat> catGenericModel = new GenericModel<>(cat);
        System.out.println(catGenericModel);
        System.out.println("========================");

        //cat = (Cat) dog; /ошибка
        //dog = (Dog) cat;/ошибка
        //Object objectCat = new Cat();
        // dog = (Dog) objectCat;
        //dogGenericModel = new GenericModel<>(cat);/ошибка
        //dog = ((Dog) catGenericModel.getElem());/если убрать в строке 15 <> то даст объект

        GenericModel<String> stringGenericModel = new GenericModel<>("Hello world!");
        GenericModel<Integer> integerGenericModel = new GenericModel<>(123);

        GenericModel<Dog> dogGenericModel2 = new GenericModel<>(dog);
        System.out.println(dogGenericModel2.getElem().getName());

//        GenericModel <Dog> genericModel3 = new GenericModel<>(cat);/ошибка
//        System.out.println(((Dog) genericModel3.getElem().getName()));/ошибка
        //Cat  cat2 = (Cat)(dogGenericModel.getElem());/ошибка


    }
}
