package school.mjc.stage0.loops.task5;

public class Cross {
    public static void main(String[] args) {
        Cross cross = new Cross();
        cross.printCross(6);
    }

    public void printCross(int sideLength) {
        for (int i = 0; i < sideLength; i++) {
            for (int j = 0; j < sideLength; j++) {
                if (i == (int) Math.ceil(sideLength / 2) || j == (int) Math.ceil(sideLength / 2)) {
                    System.out.print("8");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}