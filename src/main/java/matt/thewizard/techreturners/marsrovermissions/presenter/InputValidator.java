package matt.thewizard.techreturners.marsrovermissions.presenter;

import java.util.Arrays;

import static matt.thewizard.techreturners.marsrovermissions.presenter.InputConstants.*;

/**
 * Validates user inputs
 */
public class InputValidator {

    /**
     * Returns whether an input to Create a Plateau is valid
     */
    public static boolean isValidCreatePlateauInput(String input){

        String[] split = input.split(SEPARATOR);

        if(input.equals(QUIT_CHAR)) return true;

        if(split.length != 2) return false;

        try {
            Arrays.stream(split).forEach(Integer::parseInt);
        } catch (NumberFormatException e){
            return false;
        }

        return true;

    }

    /**
     * Returns whether and input to select an option is valid
     */
    public static boolean isValidOptionsInput(String input){
        if(!input.equals(OPTION_1) && !input.equals(OPTION_2) && !input.equals(QUIT_CHAR)) return false;
        else return true;
    }

}
