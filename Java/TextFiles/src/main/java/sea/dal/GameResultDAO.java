package sea.dal;

import sea.be.GameResult;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class GameResultDAO implements IGameResultDAO {
    private static final File file = new File("results.txt");

    @Override
    public void add(GameResult gr) {
        addGameResultToFile(gr, file);
    }

    @Override
    public List<GameResult> getResults() {
        return fetchResultsFromFile(file);
    }

    private void addGameResultToFile(GameResult gr, File file){
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

    private List<GameResult> fetchResultsFromFile(File file) {
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
/*
    // using java.nio
    private List<GameResult> fetchResultsFromFile(File file) {
        List<GameResult> results = new ArrayList();
        Path path = Path.of(file.toURI());
        try {
            List<String> lines = Files.readAllLines(path);
            int i = 0;
            for(String line : lines) {
                String[] data = line.split(";");
                GameResult gr = new GameResult(++i, data[0], data[1], data[2]);
                results.add(gr);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return results;
    }*/
}
