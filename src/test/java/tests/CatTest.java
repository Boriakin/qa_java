package tests;

import com.example.Cat;
import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static tests.base.ConstantsForTests.PREDATOR_FOOD_LIST;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {

    @Mock
    Feline feline;

    @Test
    public void getSoundTest() {
        Cat cat = new Cat(feline);
        String expected = "Мяу";
        String actual = cat.getSound();
        Assert.assertEquals("Ожидается звук издаваемый котом: " + expected,
                expected, actual);
    }

    @Test
    public void getFoodTest() throws Exception {
        Cat cat = new Cat(feline);
        Mockito.when(feline.eatMeat()).thenReturn(PREDATOR_FOOD_LIST);
        List<String> expected = PREDATOR_FOOD_LIST;
        List<String> actual = cat.getFood();
        Assert.assertEquals("Ожидается список еды хищника: " + expected,
                expected, actual);
    }
}
