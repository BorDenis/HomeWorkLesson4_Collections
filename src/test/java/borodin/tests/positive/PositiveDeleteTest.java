package borodin.tests.positive;

import borodin.categories.Positive;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import ru.digitalleague.storage_example.Storage;

import static org.junit.Assert.assertTrue;

@Category(Positive.class)
public class PositiveDeleteTest {
    public static String item_1 = "potato";

    /**
     * Добавление тестовых данных
     */
    @BeforeClass
    public static void addSomeObjects(){
        Storage.addObject(item_1, 10);
    }

    /**
     * Удаление объекта лежащего на складе
     */
    @Test
    public void deleteExistObject(){
        assertTrue(Storage.removeObject(item_1));
    }
}
