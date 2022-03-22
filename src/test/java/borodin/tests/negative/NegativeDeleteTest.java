package borodin.tests.negative;

import borodin.categories.Negative;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import ru.digitalleague.storage_example.Storage;

import static org.junit.Assert.assertFalse;

@Category(Negative.class)
public class NegativeDeleteTest {

    public static String item_1 = "potato",
                         item_2 = "carrot";

    /**
     * Добавление тестовых данных
     */
    @BeforeClass
    public static void addSomeObjects(){
        Storage.addObject(item_1, 10);
    }

    /**
     * Удаление объекта не лежащего на складе
     */
    @Test
    public void deleteNotExistObject(){
        assertFalse(Storage.removeObject(item_2));
    }
}
