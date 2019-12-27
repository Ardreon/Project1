package view;

import model.entity.AirplaneAbstract;

public class View {

        public void print(AirplaneAbstract[] planes) {
            System.out.println("**************************************************");
            for (AirplaneAbstract plane : planes) {
                System.out.println(plane.toString());
            }
            System.out.println("**************************************************");
        }

        public void options() {
            System.out.println("Choose command:\n" +
                    "1. Get overall capacity\n" +
                    "2. Get overall carrying capacity\n" +
                    "3. Sort planes by fly range\n" +
                    "4. Enter diapason of fuel-consumption and find a plane\n" +
                    "5. Exit");
        }

        public void printMessage(String message) {
            System.out.println(message);
        }

        public void printInputError() {
            System.out.println("\u001B[31mWrong input!!!\u001B[0m\n");
        }
    }

