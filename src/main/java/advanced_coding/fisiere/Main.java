package advanced_coding.fisiere;

import advanced_coding.mostenire_polimorfism.Employee;
import advanced_coding.mostenire_polimorfism.Manager;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        scriere();
        citireAngajatiDinFisier();
    }

    public static void scriere(){
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);

        try {
            FileWriter fileWriter = new FileWriter("NumeAngajati.txt");
            System.out.println("Introduceti numarul de angajati:");
            int numarAngajati = scanner.nextInt();
            int i = 0;
            while (i < numarAngajati) {
                System.out.println(i);
                System.out.println("Introduceti datele angajatului:");
                fileWriter.write(scanner1.nextLine() + "\n");
                i++;
            }
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            scanner.close();
            scanner1.close();
        }
    }

    public static void citireAngajatiDinFisier() {
        File file = new File("NumeAngajati.txt");
        Manager manager = new Manager("Alin", 2500, 5, 600);

        try {
            Scanner scannerCitire = new Scanner(file);
            while (scannerCitire.hasNextLine()) {
                List<String> dateAngajat = Arrays.stream(scannerCitire.nextLine().split(", ")).toList();
//                String[] primaLinie = scannerCitire.nextLine().split(", ");
                Employee angajatNou = new Employee(dateAngajat.get(0), Double.parseDouble(dateAngajat.get(1)), Integer.parseInt(dateAngajat.get(2)));
                manager.addEmployee(angajatNou);
//                System.out.println(angajatNou);
            }
            System.out.println(manager);
            scannerCitire.close();


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

}

