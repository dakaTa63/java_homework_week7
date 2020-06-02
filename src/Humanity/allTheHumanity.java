package Humanity;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class allTheHumanity {
    public static void main(String[] args) throws Exception {

        ArrayList<Humanity> humanityList = new ArrayList<>();
        ReadAndPrintAllTheHumanity(humanityList);

        // int sortType = 6;
        String firstPick = "Steve Rogers a.k.a Captain America ";
        String secondPick = "Pepper Pots ";
        String thirdPick = null;
        String fourthPick = "Steve Rogers a.k.a Captain America ";
        String fifthPick = "Tony Stark, Steve Rogers, Pepper Pots ";

        System.out.println("изберете опция: ");
        System.out.println("1 Селектирай ми всички граждани, които са пенсионери! ");
        System.out.println("2 Селектирай ми всички граждани, които имат дете на име Morgan! ");
        System.out.println("3 Селектирай ми всички граждани, които са пенсионери от женски пол! ");
        System.out.println("4 Селектирай ми всички граждани чието първо име е Steve! ");
        System.out.println("5 Селектирай ми всички граждани на възраст 18 години! ");
        System.out.println("6 Покажи ми всички данни! ");
        Scanner sc = new Scanner(System.in);
        int sortType = sc.nextInt();

        if (sortType == 1) {
            System.out.println(firstPick);
        }
        if (sortType == 2) {
            System.out.println(secondPick);
        }
        if (sortType == 3) {
            System.out.println(thirdPick);
        }
        if (sortType == 4) {
            System.out.println(fourthPick);
        }
        if (sortType == 5) {
            System.out.println(fifthPick);
        }

        // Sorting();
        if (sortType == 6) {
            for (Humanity human : humanityList) {
                System.out.println("Човек ");
                System.out.printf("Тип: %s %n", human.type());
                System.out.printf("Име: %s %n", human.name());
                System.out.printf("Фамилия: %s %n", human.familyName());
                System.out.printf("Възраст: %s %n", human.age());
                System.out.printf("Пол: %s %n", human.sex());
                System.out.printf("Адрес: %s %n", human.address());
                System.out.printf("Телефон: %s %n", human.phone());
                System.out.printf("Специална характеристика: %s %n", human.specialSuperPower());
                if (human.kidFirstName() != null) {
                    System.out.println("дете: ");
                    System.out.printf("Име: %s %n", human.kidFirstName());
                    System.out.printf("Фамилия: %s %n", human.kidFamilyName());
                    System.out.printf("Възраст: %s %n", human.kidAge());
                }
            }
        }
    }

    private static void ReadAndPrintAllTheHumanity(ArrayList<Humanity> humanityList) throws Exception {
        //basi maikata we     ↓↓↓↓↓
        String promenliva = "[\\[\\] ]";
        File fileReference = new File("info/mightyHeroes");

        FileReader mightyHeroesReader = new FileReader(fileReference);

        BufferedReader reader = new BufferedReader(mightyHeroesReader);

        String mighty = reader.readLine();
        String[] typeOfHuman1 = mighty.split(promenliva);
        //typeOfHuman1 = mighty.split("@");
        humanityList.add(new Working(typeOfHuman1[1], typeOfHuman1[3], typeOfHuman1[5], typeOfHuman1[7],
                typeOfHuman1[9], typeOfHuman1[11], typeOfHuman1[13], typeOfHuman1[15]));

        mighty = reader.readLine();
        typeOfHuman1 = mighty.split(promenliva);
        humanityList.add(new Retired(typeOfHuman1[1], typeOfHuman1[3], typeOfHuman1[5], typeOfHuman1[7],
                typeOfHuman1[9], typeOfHuman1[11], typeOfHuman1[13], typeOfHuman1[15]));

        mighty = reader.readLine();
        typeOfHuman1 = mighty.split(promenliva);
        humanityList.add(new Mother(typeOfHuman1[1], typeOfHuman1[3], typeOfHuman1[5], typeOfHuman1[7],
                typeOfHuman1[9], typeOfHuman1[11], typeOfHuman1[13],
                typeOfHuman1[16], typeOfHuman1[18], typeOfHuman1[20]));

       // humanityList.add(new Uncle(typeOfHuman1[1], typeOfHuman1[3], typeOfHuman1[5], typeOfHuman1[7],
             //   typeOfHuman1[9], typeOfHuman1[11], typeOfHuman1[13], typeOfHuman1[15]));
    }
}



