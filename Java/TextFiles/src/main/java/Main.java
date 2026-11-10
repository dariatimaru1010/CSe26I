import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args)  {
        List<GameResult> results = fetchResultsFromFile(new File("results.txt"));
        for(GameResult gr : results){
            printGameResult(gr);
        }




        /*
        System.out.println("hello");
        try (FileWriter fw = new FileWriter("results.txt", true)){
            fw.write("Santa\n");
        }
        catch(IOException ioe){
            // provide the user with a good reason for error and handle it
            System.out.println("Error writing to the file");
            System.out.println(ioe);
        }*/

    }

    private static List<GameResult> fetchResultsFromFile(File file) {
        List<GameResult> results = new ArrayList();
        int i = 0;
        try (Scanner scanner = new Scanner(file)){
            while(scanner.hasNextLine()){
                i++;
                String line = scanner.nextLine();
                String[] data = line.split(";");
                GameResult gr = new GameResult(i, data[0], data[1], data[2]);
                results.add(gr);
            }
        } catch (FileNotFoundException e) {
            System.out.println("No results yet");
        }
        return results;
    }

    public static void printGameResult(GameResult gr){
        System.out.println("Game #" + gr.getGameNumber());
        System.out.println("First player: " + gr.getPlayer1());
        System.out.println("Second player: "  + gr.getPlayer2());
        System.out.println("Winner: "  + gr.getWinner());
        System.out.println("##################");
    }
}
