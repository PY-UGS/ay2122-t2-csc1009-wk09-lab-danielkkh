import static org.junit.Assert.*;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.RepeatedTest;

import static org.junit.jupiter.api.Assertions.assertTrue;


public class RandomCharacterTest {
    static RandomCharacter randomChar = new RandomCharacter(); //create an object of class RandomCharacter
    
    @RepeatedTest(value = 15)
    public final void testGetRandomLowerCaseLetter(){
            char test = randomChar.getRandomLowerCaseLetter(); //create a char variable called test and call RandomLowerCase function
            assertTrue(test>='a' && test<='z'); //only true if value of test is between 'a' and 'z'
    }

    @RepeatedTest(value = 15)
    public final void testGetRandomUpperCaseLetter(){
            char test = randomChar.getRandomUpperCaseLetter(); //create a char variable called test and call RandomUpperCase function
            assertTrue(test>='A' && test<='Z'); //only true if value of test is between 'A' and 'Z'
    }

    @RepeatedTest(value = 15)
    public final void testGetRandomDigit(){
            char test = randomChar.getRandomDigitCharacter(); //create a char variable called test and call RandomDigitCharacter function
            assertTrue(test>='0' && test <='9'); //only true if value of test is between '0' and '9'
    }

    @RepeatedTest(value = 15)
    public final void testGetRandomCharacter(){
        char test = randomChar.getRandomCharacter(); //create a char variable called test and call RandomCharacter function
        assertTrue(test>='0' && test<='9' || test>='A' && test<='Z' || test>='a' && test<='z'); //only true if value of test is between 'a' and 'z' or 'A' and 'Z' or '0' and '9'
    }

    @RepeatedTest(value = 15) //repeat test for 15 times to obtain pass and fail results
    public final void testPrimeNumber(){
        char test = randomChar.getRandomDigitCharacter(); //create a char variable called test and call RandomDigitCharacter function
        assertTrue(test=='2' || test=='3' || test=='5'||test=='7'); //only true if value is either '2', '3', '5' or '7' as they are the only prime numbers from 0-9
        //assertFalse(test=='0'||test=='1'||test=='4'||test=='6'||test=='8'||test=='9');
    }

    @AfterAll
    public static void tearDownAfterClass() throws Exception {  
        System.out.println("Tear Down");  
    }  
}