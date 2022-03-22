package borodin.tests.positive;

import borodin.categories.Positive;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import ru.digitalleague.storage_example.MsgValidator;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;


@RunWith(Parameterized.class)
@Category(Positive.class)
public class PositiveTestMsgValidatorAddTest {

    @Parameter
    public String command;
    @Parameter(1)
    public String text;
    @Parameter(2)
    public String value;


    @Parameters(name = "Positive test: {0} {1} {2}")
    public static Collection<Object[]> setDataPositive(){
        return Arrays.asList(new Object[][]{
                {"add", "potato", "1"},
                {"add", "carrot", "10"}
        });
    }

    @Test
    public void validateAddMsg(){
        assertTrue(MsgValidator.validateAddMsg(new String[]{this.command, this.text, this.value}));
    }
}
