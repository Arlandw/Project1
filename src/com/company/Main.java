package com.company;

public class Main {
    public static void main(String[] args) {

        // ( 3 >= 3 && !(true || true) )
        boolean tricky = false;

        if(2017 < 2016) {

            System.out.println("Stuck in the past...");

        }else {

            System.out.println("Upgraded to the future!");

        }


        int subwayTrain = 5;

        switch (subwayTrain){

            case 1 : System.out.println("This is a South Ferry bound train!");
                break;
            case 5 : System.out.println("This is a Brooklyn bound train!");
                break;
            case 7 : System.out.println("This is a Queens bound train!");
                break;
            default:
                System.out.println("I'm not sure where that train goes...");

        }

    }
}
class Dog {

    int age;

    public Dog(int dogsAge) {

        age = dogsAge;

    }

    public static void main(String[] args) {

    }
}

class Beverage {

    public Beverage() {

    }

    public void isFull() {

        System.out.println("Your order is full!");

    }

    public static void main(String[] args) {

    }

}

class Coffee extends Beverage{

    public Coffee() {

    }

    public void addSugar(int cubes) {

        System.out.println("You added " + cubes + " sugar cubes.");

    }

    public static void main(String[] args) {

        Coffee myOrder = new Coffee();
        myOrder.addSugar(2);
        myOrder.isFull();


    }
}

for (int i = 0; i < weeklyTemperatures.size(), i++){}