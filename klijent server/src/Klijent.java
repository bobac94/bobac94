import java.net.*;
import java.io.*;
import java.io.IOException;
import java.util.Scanner;


public class Klijent {


    public static void main(String[] args) {

        Socket link;
        try {
            link = new Socket("localhost", 1080);

            Scanner input = new Scanner(link.getInputStream());
            PrintWriter output = new PrintWriter(link.getOutputStream(), true);

            Scanner brKlijenta = new Scanner(System.in);

            int prviBr, drugiBr, rezultat;
            do {
                System.out.print("Ukucajte prvi broj: ");
                prviBr = brKlijenta.nextInt();
                System.out.print("Ukucajte drugi broj: ");
                drugiBr = brKlijenta.nextInt();

                output.println(prviBr);
                output.println(drugiBr);
                rezultat = input.nextInt();
                System.out.println("\n<Server> Vas rezultat je: " + rezultat);
            } while (prviBr != 0 || drugiBr != 0);

        } catch (IOException exc) {
            System.out.println(exc.getMessage());
        }


    }
}