package tests;

import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mockito;

@RunWith(Parameterized.class)
public class LionManeParameterizedTest {
    private final String sex;
    private final boolean mane;
    Feline feline = Mockito.mock(Feline.class);

    public LionManeParameterizedTest(String sex, boolean mane) {
        this.sex = sex;
        this.mane = mane;
    }

    @Parameterized.Parameters
    public static Object[][] testData() {
        return new Object[][]{
                {"Самец", true},
                {"Самка", false},
        };
    }

    @Test
    public void getManeTest() throws Exception {
        Lion lion = new Lion(sex, feline);
        boolean expected = mane;
        boolean actual = lion.doesHaveMane();
        Assert.assertEquals("Ожидается пол льва", expected, actual);
    }
}
