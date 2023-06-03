package J1Kadai29;

import java.util.*;
public class JKad29X {
        static final int BLACK = 0;
        static final int WHITE = 1;
        static final int NONE = 2;
        static String[] strStones = {"��", "��", "�E"};
        static char[] Mask = new char[8];
        static Scanner in = new Scanner(System.in);
        public static void main(String[] args) {
                String[] strColor = {"��", "��"};
                int[] stoneColor = {BLACK, WHITE};
                int[] Position = new int[2];
                int[][] board = new int[8][8];
                int Player = 0;
                int color = stoneColor[Player];
                initBoard(board);
                while (true) {
                        dispBoard(board);
                        System.out.println(strColor[Player] + "�̔Ԃł��B");
                        System.out.print("�ǂ��ɐ΂�u���܂����H�i��FA0�j��");
                        String Choose = in.next();
                        if (Objects.equals(Choose, "exit")){
                                break;
                        }
                        for (int i = 0 ; i < Choose.length(); i++) {
                                Position[i] = Choose.charAt(i);
                        }
                        int x = Position[0] - 'A';
                        int y = Position[1] - '0';

                        if( turnStone(board, x, y, color) < 0 ){
                                System.out.println("�����ɐ΂͒u���܂���I");
                                continue;
                        }else {
                                board[y][x] = Player;
                                if (Player == 1) {
                                        Player = 0;
                                } else {
                                        Player++;
                                }
                        }
                }
        }
        public static void initBoard(int[][] board) {
                for(int i = 0; i < board.length; i++){
                        for(int j = 0; j < board[i].length; j++){
                                board[i][j] = NONE;
                                Mask[i] = (char)(65 + i);
                        }
                }
                board[3][3] = WHITE;
                board[4][4] = WHITE;
                board[3][4] = BLACK;
                board[4][3] = BLACK;
        }
        public static void showEng(char[] Mask) {
                for ( int i = 0; i < Mask.length;i++){
                        if (i == 0) {
                                System.out.print("\t" + Mask[i] + "\t");
                        }else{
                                System.out.print(Mask[i] + "\t");
                        }
                }
                System.out.println();
        }
        public static void dispBoard(int[][] board) {
                showEng(Mask);
                for(int i = 0; i < board.length; i++){
                        System.out.print(i + "\t");
                        for(int j = 0; j < board[i].length; j++){
                                if(board[i][j] == BLACK){
                                        System.out.print(strStones[0] + "\t");
                                }else if(board[i][j] == WHITE){
                                        System.out.print(strStones[1] + "\t");
                                }else{
                                        System.out.print(strStones[2] + "\t");
                                }
                        }
                        System.out.print(i + "\t");
                        System.out.println();
                }
                showEng(Mask);
        }
        public static boolean isInBound(int[][] board, int x, int y){
                return y <= 7 && y >= 0 && x <= 7 && x >= 0;
        }
        public static int turnStone(int[][] board, int x, int y, int color) {
                if ( board[y][x] == 2 && ( board[y+1][x] == 0 ) && ( board[y+2][x] == 1 || board[y+1][x+1] == 1 || board[y][x-1] == 1) ){
                        color = 1;
                }
                return color;
        }
}

