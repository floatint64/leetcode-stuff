package org.example;

public class RobotReturnToOrigin {
    public boolean judgeCircle(String moves) {
        int x = 0, y = 0;

        for (int i = 0; i < moves.length(); i++) {
            switch (moves.charAt(i)) {
                case 'L' -> x--;
                case 'R' -> x++;
                case 'U' -> y--;
                case 'D' -> y++;
            }
        }

        return x == 0 && y == 0;
    }
}
