package borodin.tests.negative;

import borodin.categories.Negative;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.*;
import ru.digitalleague.storage_example.Storage;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertFalse;

@RunWith(Parameterized.class)
@Category(Negative.class)
public class NegativeStorageAddTest {
    private static String item_1 = "watermelon",
                          item_2 = "apple";
    @Parameter
    public String text;
    @Parameter (1)
    public int value;

    /**
     * Добавление тестовых данных
     */
    @BeforeClass
    public static void addSomeObjects() {
        Storage.addObject(item_1, 6);
        Storage.addObject(item_2, 10);
    }

    @Parameters(name = "Negative test: {0} {1}")
    public static Collection<Object> setData(){
        return Arrays.asList(new Object[][]{
                {item_1, -1},
                {item_2, 0}
        });
    }

    /**
     * Проверка на отсутствия возможности, добавлять нулевое или отрицательное значение
     */
    @Test
    public void addNegativeAmountToExistObject() {
        assertFalse(Storage.addObject(text, value));
    }

     /**
     * Отчистка тестовых данных
     */
    @AfterClass
    public static void deleteAll(){
        Storage.removeObject(item_1);
        Storage.removeObject(item_2);

    }

}
