import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args)  {
        File file = new File("results.txt");
        List<GameResult> results = fetchResultsFromFile(file);
        for(GameResult gr : results){
            printGameResult(gr);
        }

        GameResult gr = new GameResult(0, "Bob", "Pete", "draw");
        addGameResultToFile(gr, file);

        List<GameResult> results2 = fetchResultsFromFile(file);
        for(GameResult gr2 : results2){
            printGameResult(gr2);
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

    private static void addGameResultToFile(GameResult gr, File file){
        String line = gr.getPlayer1() + ";" +
                      gr.getPlayer2() + ";" +
                      gr.getWinner();
        try (FileWriter fw = new FileWriter(file, true)){
            fw.write(line + "\n");
        }
        catch(IOException ioe){
            // provide the user with a good reason for error and handle it
            System.out.println("Error writing to the file");
        }
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
