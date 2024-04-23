package view.consoleView.input;

import view.consoleView.input.animalInput.AnimalInput;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.List;
import java.util.Scanner;

public class ConsoleInput implements Input {

    Scanner scanner;
    List<AnimalInput> animalInputs;

    public ConsoleInput() {
        this.scanner = new Scanner(System.in);

    }

    public Integer intInput() {
        int input = 0;
        boolean flag = false;
        while (!flag) {
            try {
                input = Integer.parseInt(scanner.nextLine());
                flag = true;
            } catch (NumberFormatException e) {
                System.out.println("Пожалуйста, введите число");
            }
        }
        return input;
    }

    public Integer rangeIntInput(Integer start, Integer end) {
        Integer output = 0;
        boolean flag = false;
        while (!flag) {
            try {
                output = Integer.parseInt(scanner.nextLine());
                if (output >= start && output <= end) {
                    flag = true;
                } else {
                    throw new IllegalArgumentException("Число должно быть в диапазоне от " + start + " до " + end);
                }
            } catch (Exception e) {
                System.out.println("Пожалуйста, введите корректное число от " + start + " до " + end);
            }
        }
        return output;
    }


    public List<String> dataInputList() {
        boolean flag = false;
        List<String> dataList = null;
        while (!flag) {
            try {
                dataList = List.of(scanner.nextLine().split(",\\s*"));
                flag = true;
            } catch (Exception e) {
                System.out.println("Пожалуйста, введите корректные данные");
            }
        }
        return dataList;
    }


    public Double doubleInput() {
        double input = 0;
        boolean flag = false;
        while (!flag) {
            try {
                input = Double.parseDouble(scanner.nextLine());
                flag = true;
            } catch (NumberFormatException e) {
                System.out.println("Пожалуйста, введите число");
            }
        }
        return input;
    }

    public String dataInput() {
        return scanner.nextLine();
    }

    public LocalDate dateInput() {
        boolean flag = false;
        LocalDate date = null;
        while (!flag) {
            try {
                DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                date = LocalDate.parse(scanner.nextLine(), dateFormat);
                flag = true;
            } catch (DateTimeParseException e) {
                System.out.println("Неверный формат даты!");
            }
        }
        return date;
    }
}


