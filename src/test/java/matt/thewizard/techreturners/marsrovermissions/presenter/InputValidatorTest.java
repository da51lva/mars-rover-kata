package matt.thewizard.techreturners.marsrovermissions.presenter;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static matt.thewizard.techreturners.marsrovermissions.presenter.InputValidator.isValidCreatePlateauInput;
import static matt.thewizard.techreturners.marsrovermissions.presenter.InputValidator.isValidOptionsInput;
import static org.junit.jupiter.api.Assertions.assertEquals;

class InputValidatorTest {

    @ParameterizedTest
    @CsvSource(textBlock = """
            0 0
            1 1
            5 1
            100 500
            -10 5
                4 9     
            q""")
    public void testIsValidCreatePlateauInputWithValidInputs(String input) {
        assertEquals(true, isValidCreatePlateauInput(input));
    }

    @ParameterizedTest
    @CsvSource(textBlock = """
                        
            1
            invalid
            5 a
            10 10 10
            1 1 1 1 1 1
            1 1a
            a9 10""")
    public void testIsValidCreatePlateauInputWithInvalidInputs(String input) {
        assertEquals(false, isValidCreatePlateauInput(input));
    }

    @ParameterizedTest
    @CsvSource(textBlock = """
            1
            2
            q""")
    public void testIsValidOptionsWithValidInputs(String input) {
        assertEquals(true, isValidOptionsInput(input));
    }

    @ParameterizedTest
    @CsvSource(textBlock = """
                        
                
            0
            3
            4
            a
            hello
            -1""")
    public void testIsValidOptionsWithInvalidInputs(String input) {
        assertEquals(false, isValidOptionsInput(input));
    }
}