package main.scanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Program {
    public static void main(String[] args) throws FileNotFoundException {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter number two numbers with comma: ");
//        String i = scanner.nextLine();
//        int f = Integer.parseInt(i.split(",")[0]);
//        int s = Integer.parseInt(i.split(",")[1]);
//        System.out.println("Chastnoe =" + f/s);
//        System.out.println("Ostatok=" + f%s);
//        scanner.close();
//        Scanner scanner1 = new Scanner("Hello my bigData");
//        String ss = scanner1.next();
//        System.out.println(ss);
//        while (scanner1.hasNext()){
//            System.out.println(scanner1.next());
//        }
//        scanner1.close();
        Scanner scanner2 = new Scanner(new FileReader(new File("./src/main/scanner/testText.txt")));
        Set<String> arr = new TreeSet<>();
//        scanner2.useDelimiter("\\W");
        while (scanner2.hasNext()){
            String word = scanner2.next();
            arr.add(word);
        }
        System.out.print(arr);
        scanner2.close();
    }
}
