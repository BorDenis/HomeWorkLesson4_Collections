package borodin.tests.positive;

import borodin.categories.Positive;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import ru.digitalleague.storage_example.Storage;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

@Category(Positive.class)
public class PositiveStorageAddTest {
    public static String item_1 = "watermelon",
                         item_2 = "apple",
                         item_3 = "potato",
                         item_4 = "carrot";

    /**
     * Добавление тестовых данных
     */
    @BeforeClass
    public static void addSomeObjects(){
        Storage.addObject(item_1, 6 );
        Storage.addObject(item_2, 10);
        Storage.addObject(item_3, 1);
    }

    /**
     * Добавление количества, в имеющийся объект
     */
    @Test
    public void addAmountToExistObject(){
        assertTrue(Storage.addObject(item_1, 4));
    }

    /**
     * Добавление количества, сверх лимита
     */
    @Test
    public void addOverAmountToExistObject(){
        assertFalse(Storage.addObject(item_2, 1));
    }

    /**
     * Добавление объекта, сверх размера склада
     */
    @Test
    public void addOverStorageSize(){
        assertFalse(Storage.addObject(item_4, 5));
    }

    /**
     * Отчистка тестовых данных
     */
    @AfterClass
    public static void deleteAll(){
        Storage.removeObject(item_1);
        Storage.removeObject(item_2);
        Storage.removeObject(item_3);

    }
}
