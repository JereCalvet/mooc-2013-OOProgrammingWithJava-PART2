package game;

import gameoflife.Simulator;

public class Main {

    public static void main(String[] args) {
        PersonalBoard board = new PersonalBoard(7, 5);

        board.turnToLiving(0, 1);
        board.turnToLiving(1, 0);
        board.turnToLiving(1, 2);
        board.turnToLiving(2, 2);
        board.turnToLiving(2, 1);

        System.out.println("Neighbours alive (0,0): " + board.getNumberOfLivingNeighbours(0, 0));
        System.out.println("Neighbours alive (1,1): " + board.getNumberOfLivingNeighbours(1, 1));
    }
}
