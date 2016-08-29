package nyc.c4q.AndresArango;

/**
 * Created by andresarango on 8/28/16.
 */
public class ProblemFive {
    public static void main(String[] args) {
        //System.out.println(chessboard(3));

    }

        public static void chessBoard(int size){
        for(int i = 0; i <= size; i++){
            for(int j = 0; j < size; j++){
                if(i % 2 == 0){
                    if(j % 2 == 0) {
                        System.out.print("#");
                    }else{
                        System.out.print(" ");
                    }
                }else{
                    if(j % 2 != 0){
                        System.out.print(" ");
                    }else{
                        System.out.print("#");
                    }

                }
            }
            System.out.print("\n");
        }
    }
    public static String chessboard(int size) {
        String board = "";

        for (int j = 0; j < size; j++) {

            if (j % 2 == 0) {
                board += " ";
            }

            for (int i = 0; i < size; i++) {
                if (j % 2 == 0 && i == (size - 1)) {
                    break;
                }

                if (i % 2 == 0) {
                    board += "#";
                } else {
                    board += " ";
                }
            }
            board += "\n";
        }

        return board;
    }

}
