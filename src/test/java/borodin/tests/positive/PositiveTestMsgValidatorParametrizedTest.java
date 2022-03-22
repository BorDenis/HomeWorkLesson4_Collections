package borodin.tests.positive;

import borodin.categories.Positive;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.*;
import ru.digitalleague.storage_example.MsgValidator;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertTrue;

@RunWith(Parameterized.class)
@Category(Positive.class)
public class PositiveTestMsgValidatorParametrizedTest {
    @Parameter
    public String command;
    @Parameter(1)
    public String text;

    @Parameters(name = " Negative test: {0} {1}")
    public static Collection<Object[]> setData(){
        return Arrays.asList(new Object[][]{
                {"delete", "carrot"},
        });
    }

    /**
     * Проверка с корректными данными
     */
    @Test
    public void validateParametrizedMsg(){
        assertTrue(MsgValidator.validateParametrizedMsg(new String[]{command, text}));
    }

}
