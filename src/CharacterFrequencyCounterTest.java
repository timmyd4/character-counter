import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class CharacterFrequencyCounterTest
{   
    @Test
    public void testLAppearsThreeTimesInHelloWorld()
    {
        //Arrange
        CharacterFrequencyCounter counter = new CharacterFrequencyCounter("helloworld");
        //Act 
        int actualCount = counter.getFrequency('l');
        //Assert
        assertEquals(3, actualCount);
    }   

    @Test
    public void testNonOccuringCharacterPercentageIsZero()
    {   
        //Arrange
        CharacterFrequencyCounter counter = new CharacterFrequencyCounter("hi there");
        //Act
        double actualPercent = counter.getRelativePercentage('z');
        //Assert
        assertEquals(0.0, actualPercent, 0);
    }
}