package view.input;

import java.time.LocalDate;
import java.util.List;

public interface Input {
    Integer intInput();
    Double doubleInput();
    String dataInput();
    LocalDate dateInput();
    Integer rangeIntInput(Integer start, Integer end);
    List<String> dataInputList();
}