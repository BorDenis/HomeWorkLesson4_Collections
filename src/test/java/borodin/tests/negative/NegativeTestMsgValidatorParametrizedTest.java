package borodin.tests.negative;

import borodin.categories.Negative;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.*;
import ru.digitalleague.storage_example.MsgValidator;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertFalse;


@RunWith(Parameterized.class)
@Category(Negative.class)
public class NegativeTestMsgValidatorParametrizedTest {
    @Parameter
    public String command;
    @Parameter(1)
    public String text;

    @Parameters(name = " Negative test: {0} {1}")
    public static Collection<Object[]> setData(){
        return Arrays.asList(new Object[][]{
                {"delete", "123"},
                {"check", "@#%^%@"}
        });
    }

    @Test
    public void validateParametrizedMsg(){
        assertFalse(MsgValidator.validateParametrizedMsg(new String[]{this.command, this.text}));
    }

}
