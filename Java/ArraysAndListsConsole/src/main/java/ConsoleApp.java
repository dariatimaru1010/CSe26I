public class ConsoleApp {
    private final static String EMPTY = "#";
    private final static String PLAYER_1 = "X";
    private final static String PLAYER_2 = "O";

    private int[][] numbers = new int[3][3];
    public void main(String[] args){
         // double array (multi)
        printArray(numbers);
        numbers[0][1] = 1;
        numbers[1][1] = 1;
        numbers[2][1] = 1;
        printArray(numbers);
        System.out.println("Rhello!");
    }

    private void printArray(int[][] array){
        for (int r = 0; r < 3; r++) {
            for (int c = 0; c < 3; c++) {

                //System.out.println("("+c + "," + r+")");
                int currentCell = numbers[c][r];

                String player = EMPTY;
                if (currentCell==1)
                    player = PLAYER_1;
                else if (currentCell==2)
                    player = PLAYER_2;

                System.out.print(player + "|");
                //System.out.println("current: " + currentCell);
            }
            System.out.println();
        }
    }
}
