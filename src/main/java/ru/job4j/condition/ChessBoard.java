package ru.job4j.condition;

public class ChessBoard {
    public static int way(int x1, int y1, int x2, int y2) {
        int rsl = 0;
        if (isValid(x2) && isValid(x1)
                && isValid(y2) && isValid(y1)) {
            if (Math.abs(x2 - x1) == Math.abs(y2 - y1)) {
                rsl = Math.abs(x2 - x1);
            }
        }
        return rsl;
    }

    private static boolean isValid(int coordinate) {
        return coordinate >= 0 && coordinate <= 7;
    }

    public static void main(String[] args) {
        int way = ChessBoard.way(6, 7, 1, 2);
        System.out.println(way);
        way = ChessBoard.way(7, 0, 0, 7);
        System.out.println(way);
        way = ChessBoard.way(2, 6, 4, 1);
        System.out.println(way);
        way = ChessBoard.way(-1, 6, 4, 1);
        System.out.println(way);
        way = ChessBoard.way(2, -1, 4, 1);
        System.out.println(way);
        way = ChessBoard.way(2, 6, -1, 1);
        System.out.println(way);
        way = ChessBoard.way(2, 6, 4, -1);
        System.out.println(way);
        way = ChessBoard.way(10, 6, 4, 1);
        System.out.println(way);
        way = ChessBoard.way(2, 10, 4, 1);
        System.out.println(way);
        way = ChessBoard.way(2, 6, 10, 1);
        System.out.println(way);
        way = ChessBoard.way(2, 6, 4, 10);
        System.out.println(way);
    }
}

























