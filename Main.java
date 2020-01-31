package Task6;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args ) throws IOException {
        Scanner scanner = new Scanner(System.in);
        Map<String, Person> people = new LinkedHashMap<>();
        String input = scanner.nextLine();
        Company company;
        Pokemon pokemon ;
        Parent parent ;
        Children child;
        Car car;
        while (!input.equals("End")) {
            String[] temp = input.split("\\s+");
            String name = temp[0];
            if (temp[1].equals("company")) {
                String companyName = temp[2];
                String companyDepartment = temp[3];
                String companySalary = temp[4];
                company = new Company(companyName, companyDepartment, companySalary);
            }
            if (temp[1].equals("pokemon")) {
                String pokemonName = temp[2];
                String pokemonType = temp[3];
                pokemon = new Pokemon(pokemonName, pokemonType);
            }
            if (temp[1].equals("parents")) {
                String parentName = temp[2];
                String parentBirthday = temp[3];
                parent = new Parent(parentName, parentBirthday);
            }
            if (temp[1].equals("children")) {
                String childName = temp[2];
                String childBirthday = temp[3];
                child = new Children(childName, childBirthday);
            }
            if (temp[1].equals("car")) {
                String carModel = temp[2];
                String carSpeed = temp[3];
                car = new Car(carModel, carSpeed);
            }

            if (!people.containsKey(name)) {
                people.put(name, new Person(name, company, pokemon,parent, child, car));
            }

            input = scanner.nextLine();
        }

        System.out.println();



    }
}
