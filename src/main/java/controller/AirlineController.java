package controller;

import model.Hangar;
import model.HangarCalculations;
import model.entity.AirplaneAbstract;
import view.View;
import java.util.Arrays;

import java.util.Scanner;

public class AirlineController {
    Scanner scanner = new Scanner(System.in);
    View view = new View();
    Hangar hangar;
    HangarCalculations hangarCalculations;
    AirplaneAbstract planes;
    int command;

    public void process() {
        do {
            command = checkIntInput(7, "options");
        } while (command != 7);
    }
    // Handles actions with equipment
    private void processMenu(int command) {
        switch (command) {
            case 1:
                view.printMessage("Planes Capacity: " + hangarCalculations.getPlanesCapacity() + "\n");
                break;
            case 2:
                view.printMessage("Carrying Capacity: " + hangarCalculations.getPlanesCarryingCapacity() + "\n");
                break;
            case 3:
                hangarCalculations.planesRangeSort();
                view.print(hangarCalculations.getPlanes());
                break;
            case 4:
                //checkFilterInput();
                view.print(hangarCalculations.filterByRange(););
                break;
            case 5:
                break;
        }
    }



    private int checkIntInput(int n, String str) {
     String in = null;
     int num;
     while (in == null) {
            if (str.equals("options"))
                view.options();
            in = scanner.nextLine();
            try {
                num = Integer.parseInt(in);
                if (num < 1 || num > n) throw new Exception();
                return num;
            } catch (Exception e) {
                view.printInputError();
                in = null;
            }
        }
        return n;
    }
}

