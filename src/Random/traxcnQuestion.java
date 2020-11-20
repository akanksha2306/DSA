package Random;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class traxcnQuestion {


    /**
     * Auto-generated code below aims at helping you parse
     * the standard input according to the problem statement.
     **/

    static List<String> items = new LinkedList<>();

    static int fatIngredients = 0;
    static int fiberIngredients = 0;
    static int carbIngredients = 0;

    static int totalItems = 0;

    final static String FAT = "FAT";
    final static String FIBER = "FIBER";
    final static String CARB = "CARB";

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int numberOfDays = in.nextInt();

        for (int i = 0; i < numberOfDays; i++) {
            String ingredient = in.next();


            if (ingredient.startsWith(FAT)) {

                fatIngredients++;
                items.add(ingredient);
            }

            if (ingredient.startsWith(FIBER)) {

                fiberIngredients++;
                items.add(ingredient);
            }

            if (ingredient.startsWith(CARB)) {

                carbIngredients++;
                items.add(ingredient);
            }

            totalItems++;

            if (totalItems < 4) {
                System.out.printf("-");
                continue;
            }

            if (isDishXPossible()) {

                // we need use at least 2 fat engridients, rest can be fat or fiber

                int ingredientsUsed = 0;
                int fatUsed = 0;
                int fiberUsed = 0;
                int carbUsed = 0;

                int index = 0;

                while (ingredientsUsed < 4 && index < items.size()) {
                    String nextItem = items.get(index);
                    if (nextItem.startsWith(FAT)) {

                        items.remove(index);
                        fatIngredients--;
                        totalItems--;

                        fatUsed++;
                        ingredientsUsed++;
                        continue;
                    } else if (nextItem.startsWith(FIBER)) {

                        // we can't use more than 1 fiber ingredients in X, so skip it
                        if (fiberUsed >= 2) {
                            index++;
                            continue;
                        }

                        items.remove(index);
                        fiberIngredients--;
                        totalItems--;

                        fiberUsed++;
                        ingredientsUsed++;
                        continue;
                    } else {
                        // it's carb, skip it
                        index++;
                    }
                }

                System.out.printf("X");

                /*
                if(index >= items.size() - 1 || fatUsed < 2){
                    System.out.println("(X)should never happen, remaining: fat:" + fatIngredients +
                    ", fiber: " + fiberIngredients + ", carb: " + carbIngredients);
                } else {
                    System.out.printf("X");
                }
                */
            } else if (isDishYPossible()) {

                // we need use at least 2 fat engridients, rest can be fat or fiber

                int ingredientsUsed = 0;
                int fatUsed = 0;
                int fiberUsed = 0;
                int carbUsed = 0;

                int index = 0;

                while (ingredientsUsed < 4 && index < items.size()) {
                    String nextItem = items.get(index);
                    if (nextItem.startsWith(CARB)) {

                        if (carbUsed >= 3) {
                            index++;
                            continue;
                        }

                        items.remove(index);
                        carbIngredients--;
                        totalItems--;

                        carbUsed++;
                        ingredientsUsed++;
                        continue;
                    } else if (nextItem.startsWith(FIBER)) {

                        // we can't use more than 1 fiber ingredients in X, so skip it
                        if (fiberUsed >= 3) {
                            index++;
                            continue;
                        }

                        items.remove(index);
                        fiberIngredients--;
                        totalItems--;

                        fiberUsed++;
                        ingredientsUsed++;
                        continue;
                    } else {
                        // it's fat, skip it
                        index++;
                    }
                }

                System.out.printf("Y");

                /*
                if(index >= items.size() - 1 || carbUsed < 1 || fiberUsed < 1){
                    System.out.println("(Yshould never happen, remaining: fat:" + fatIngredients +
                    ", fiber: " + fiberIngredients + ", carb: " + carbIngredients);
                    // System.out.printf("-");
                } else {
                    System.out.printf("Y");
                }
                */
            } else {
                System.out.printf("-");
            }


        }
    }

    static boolean isDishXPossible() {

        return (fatIngredients >= 2 && totalItems >= 4 && (fatIngredients + fiberIngredients >= 4));
    }

    static boolean isDishYPossible() {

        return (carbIngredients >= 1 && fiberIngredients >= 1 && totalItems >= 4 && (carbIngredients + fiberIngredients >= 4));
    }
}
