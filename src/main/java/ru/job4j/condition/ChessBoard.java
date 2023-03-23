package ru.job4j.condition;

public class ChessBoard {
    public static int way(int x1, int y1, int x2, int y2) {
        int rsl = 0;
        if (Math.abs(x2 - x1) == Math.abs(y2 - y1)) {
            rsl = Math.abs(x2 - x1);
        }
        return rsl;
    }

    public static void main(String[] args) {
        int way = ChessBoard.way(0, 0, 7, 7);
        System.out.println(way);
        way = ChessBoard.way(0, 7, 7, 0);
        System.out.println(way);
    }
}
