package application;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Program {
    public static void main(String[] args) {

        // #Lendo arquivos com Scanner

//        File file = new File("./example-text.txt");
//        try (Scanner sc = new Scanner(file)) {
//            while (sc.hasNextLine()) {
//                System.out.println(sc.nextLine());
//            }
//        } catch (IOException e) {
//            System.out.println("Error: " + e.getMessage());
//        }

        //  #Lendo arquivos com FileReader e BufferedReader

        String path = "./example-text.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();

            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
