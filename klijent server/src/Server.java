import java.io.*;
import java.net.*;
import java.io.IOException;
import java.util.*;

public class Server {

    private static ServerSocket serverSocket;


    public static void main(String[] args)
    {
        System.out.println("Slusam...\n");
        try {
            serverSocket = new ServerSocket(1080);
        }
        catch (IOException ioex){
            System.out.println("Nemoguce se konektovati!");
            System.exit(1);
        }
        zaKlijenta();

    }

    private static void zaKlijenta()
    {
        Socket link;
        try {
            link = serverSocket.accept();
            Scanner input = new Scanner(link.getInputStream());
            PrintWriter output = new PrintWriter(link.getOutputStream(), true);
            int prviBr = input.nextInt();
            int drugiBr = input.nextInt();
            int answer;

            while (prviBr != 0 || drugiBr != 0)
            {
                answer = prviBr + drugiBr;
                output.println(answer);
                prviBr = input.nextInt();
                drugiBr = input.nextInt();
            }

        } catch (IOException exc) {
            System.out.println(exc.getMessage());
        }


    }
}
