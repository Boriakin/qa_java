package tests;

import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;
import java.util.Random;

import static tests.base.ConstantsForTests.*;

@RunWith(MockitoJUnitRunner.class)
public class FelineTest {

    @Spy
    Feline feline;

    @Test
    public void eatMeatTest() throws Exception {
        List<String> expected = PREDATOR_FOOD_LIST;
        List<String> actual = feline.eatMeat();
        Assert.assertEquals("Ожидается список еды кошачьих: " + expected,
                expected, actual);
    }

    @Test
    public void getFamilyTest() {
        String expected = FELINE_FAMILY;
        String actual = feline.getFamily();
        Assert.assertEquals("Ожидается получение семейства: " + expected,
                expected, actual);
    }

    @Test
    public void getKittenArgTest() {
        int expected = new Random().nextInt(10);
        int actual = feline.getKittens(expected);
        Assert.assertEquals("Ожидается получение " + expected + " котят.",
                expected, actual);
    }

    @Test
    public void getKittensNoArgTest() {
        feline.getKittens();
        Mockito.verify(feline, Mockito.times(1)).getKittens(DEFAULT_KITTENS_COUNT);
    }

}
