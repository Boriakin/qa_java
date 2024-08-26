package tests;

import com.example.Alex;
import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static tests.base.ConstantsForTests.ALEX_FRENDS_LIST;

@RunWith(MockitoJUnitRunner.class)
public class AlexTest {

    @Mock
    Feline feline;

    @Test
    public void getFriendsTest() throws Exception {
        Alex alex = new Alex(feline);
        List<String> expected = ALEX_FRENDS_LIST;
        List<String> actual = alex.getFriends();
        Assert.assertEquals("Ожидается список друзей льва Алекса: " + expected,
                expected, actual);
    }

    @Test
    public void getPlaceOFLivingTest() throws Exception {
        Alex alex = new Alex(feline);
        String expected = "Нью-Йоркский зоопарк";
        String actual = alex.getPlaceOfLiving();
        Assert.assertEquals("Ожидается место жительства льва Алекса: " + expected,
                expected, actual);
    }

    @Test
    public void getKittensTest() throws Exception {
        Alex alex = new Alex(feline);
        int expected = 0;
        int actual = alex.getKittens();
        Assert.assertEquals("Ожидается получение " + expected + " котят.",
                expected, actual);
    }
}
