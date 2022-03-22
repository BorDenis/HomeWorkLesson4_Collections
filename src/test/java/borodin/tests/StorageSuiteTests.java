package borodin.tests;

import borodin.categories.Negative;
import borodin.categories.Positive;
import borodin.tests.negative.NegativeDeleteTest;
import borodin.tests.negative.NegativeStorageAddTest;
import borodin.tests.negative.NegativeTestMsgValidatorAddTest;
import borodin.tests.negative.NegativeTestMsgValidatorParametrizedTest;
import borodin.tests.positive.PositiveDeleteTest;
import borodin.tests.positive.PositiveStorageAddTest;
import borodin.tests.positive.PositiveTestMsgValidatorAddTest;
import borodin.tests.positive.PositiveTestMsgValidatorParametrizedTest;
import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Categories.class)
@Categories.IncludeCategory({Positive.class, Negative.class})
@Suite.SuiteClasses({
        PositiveTestMsgValidatorAddTest.class,
        PositiveTestMsgValidatorParametrizedTest.class,
        PositiveStorageAddTest.class,
        PositiveDeleteTest.class,
        NegativeTestMsgValidatorAddTest.class,
        NegativeTestMsgValidatorParametrizedTest.class,
        NegativeStorageAddTest.class,
        NegativeDeleteTest.class

})
public class StorageSuiteTests {
}
