import java.util.Random;

public class RandomCharacter {
    Random random = new Random();

    //generating a random number from 0-25, add to 'a', encompassing 'a - z'
    public char getRandomLowerCaseLetter(){
        char lowerCaseLetter = (char) ('a' + random.nextInt(26));
        return lowerCaseLetter;
    }

    //generate random number from 1025, add to 'A', encompassing 'A-Z'
    public char getRandomUpperCaseLetter(){
        char UpperCaseLetter = (char) ('A' + random.nextInt(26));
        return UpperCaseLetter;
    }

    //generate random number from 0-9
    public char getRandomDigitCharacter(){
        char randomDigit = (char)('0' + random.nextInt(10));
        return randomDigit;
    }


    //generate random number from 0-2, each calling a different function for alphanumerical character
    public char getRandomCharacter(){
        int randomDigit = random.nextInt(0,3);
        switch(randomDigit){
            case 0:
                return this.getRandomLowerCaseLetter(); 
            case 1:
                return this.getRandomUpperCaseLetter();
            case 2:
                return this.getRandomDigitCharacter();
            default:
                return '\0';
        }
    }

    public static void main(String[] args){
        RandomCharacter randChar = new RandomCharacter();

        System.out.print("Random Lower Case Letter:");
        //generate lowercase char from 'a' to 'z'
        for(int i=0;i<15;i++){
            System.out.print(" "+randChar.getRandomLowerCaseLetter());
        }

        //generate uppercase char from 'A' to 'Z'
        System.out.println();
        System.out.print("Random Upper Case Letter:");
        for(int i=0;i<15;i++){
            System.out.print(" "+randChar.getRandomUpperCaseLetter());
        }


        //generate random digit from '0' to '9'
        System.out.println();
        System.err.print("Random Digit from 0-9:");
        for(int i=0;i<15;i++){
            System.out.print(" "+randChar.getRandomDigitCharacter());
        }

        //generate random char from '0' to '9', 'a' to 'z' and 'A' to 'Z'
        System.out.println();
        System.out.print("Random Alphanumerical Character:");
        for(int i=0;i<15;i++){
            System.out.print(" "+randChar.getRandomCharacter());
        }
    }
}