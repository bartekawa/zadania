package Zadanie1;

public class Animal {
    public static void main(String[] args) {
        interface Voice {
            void makeVoice();
        }

        class Dog extends Animal implements Voice {
            public void makeVoice() {
                System.out.println("Woof woof");
            }
        }

        class Cat extends Animal implements Voice {
            public void makeVoice() {
                System.out.println("Meow meow");
            }
        }
    }
}