import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class character_shift_Test {

    character_shift CS = new character_shift();
    
    @Test
    public void testAsciiShift() {
        String expectedInput = "Test";
        String expectedOutput = "Uftu";
        
        String result = CS.shift(expectedInput);
        
        assertEquals(expectedOutput, result);
    }

}
