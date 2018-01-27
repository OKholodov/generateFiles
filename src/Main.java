import java.io.*;
import java.io.FileWriter;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        final int NUM_FILES = 10000;
        int rndOperation;
        double rndDouble;
        int rndNumOfDouble;
        Random rnd = new Random();

        for (int i=1;i<=NUM_FILES;i++) {
            try (BufferedWriter bf = new BufferedWriter(new FileWriter(new File("C:/JavaTest/test/in_"+i+".dat")))) {
                rndOperation = rnd.nextInt(3);
                rndOperation = rndOperation == 0 ? 1 : rndOperation;
                bf.write(Integer.toString(rndOperation));
                bf.newLine();

                rndNumOfDouble = rnd.nextInt(100);
                rndNumOfDouble = rndNumOfDouble == 0 ? 1 : rndNumOfDouble;

                for (int j=1;j<=rndNumOfDouble;j++) {
                    rndDouble = rnd.nextDouble() * rnd.nextInt(1000);
                    bf.write(Double.toString(rndDouble));
                    if (j!=rndNumOfDouble)
                        bf.write(" ");
                }
            } catch (java.io.IOException e) {

            }
        }
    }
}

