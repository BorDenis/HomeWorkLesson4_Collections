package borodin.tests.negative;

import borodin.categories.Negative;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import ru.digitalleague.storage_example.MsgValidator;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;


@RunWith(Parameterized.class)
@Category(Negative.class)
public class NegativeTestMsgValidatorAddTest {

    @Parameter
    public String command;
    @Parameter(1)
    public String text;
    @Parameter(2)
    public String value;

    @Parameters(name = "Negative test: {0} {1} {2}")
    public static Collection<Object[]> setDataNegative(){
        return  Arrays.asList(new Object[][]{
                {"add", "123", "5"},
                {"add", "cabbage", "carrot"},
                {"add", "orange", "@$@%"},
                {"add", "@%@%@", "2"},
                {"add", "apple", "-1"},
                {"add", "carrot", "2.44"}
        });
    }

    /**
     * Проверка с данными, не соответствующими требованиям
     */
    @Test
    public void validateAddMsg(){
        assertEquals(false, MsgValidator.validateAddMsg(new String[]{command, text, value}));
    }

}
