package tests;

import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static tests.base.ConstantsForTests.DEFAULT_KITTENS_COUNT;
import static tests.base.ConstantsForTests.PREDATOR_FOOD_LIST;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {

    @Mock
    Feline feline;

    @Test
    public void getKittensTest() throws Exception {
        Lion lion = new Lion("Самец", feline);
        Mockito.when(feline.getKittens()).thenReturn(DEFAULT_KITTENS_COUNT);
        int expected = DEFAULT_KITTENS_COUNT;
        int actual = lion.getKittens();
        ;
        Assert.assertEquals("Ожидается получение " + expected + " котят.",
                expected, actual);
    }

    @Test
    public void getFoodTest() throws Exception {
        Lion lion = new Lion("Самка", feline);
        Mockito.when(feline.getFood("Хищник")).thenReturn(PREDATOR_FOOD_LIST);
        List<String> expected = PREDATOR_FOOD_LIST;
        List<String> actual = lion.getFood();
        Assert.assertEquals("Ожидается список еды льва: " + expected,
                expected, actual);
    }

    @Test
    public void getManeExceptionTest() throws Exception {
        try {
            Lion lion = new Lion("Exception", feline);
        } catch (Exception e) {
            Assert.assertEquals("Используйте допустимые значения пола животного - самей или самка", e.getMessage());
        }
    }
}
