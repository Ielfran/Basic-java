public class GeneratorTest{

    public static void main(String[] args){
        testPasswordStrength();
        testPasswordGeneration();
        testAlphabetCreation();
    }

    static void testPasswordStrength(){
        Password weakPassword=new Password("abc");
        if(weakPassword.passwordStrength()==2){
            System.out.println("Weak password test passes");
        }else{
            System.out.println("Weak Password Text Failed");
        }
        Password mediumPassword = new Password("abcABC123");
        if (mediumPassword.passwordStrength() == 4) {
            System.out.println("Medium Password Test Passed");
        } else {
            System.out.println("Medium Password Test Failed");
        }

        Password strongPassword = new Password("abcABC123!@#");
        if (strongPassword.passwordStrength() == 5) {
            System.out.println("Strong Password Test Passed");
        } else {
            System.out.println("Strong Password Test Failed");
        }

        Password veryStrongPassword = new Password("abcABC123!@#Def");
        if (veryStrongPassword.passwordStrength() == 6) {
            System.out.println("Very Strong Password Test Passed");
        } else {
            System.out.println("Very Strong Password Test Failed");
        }
    }

    static void testPasswordGeneration(){
        Generator generator=new Generator(true,true,true,true);
        Password password=generator.generatePassword(12);
        if(password!=null && password.toString().length()==12){
            System.out.println("Password Generation Test Passed");
        }else{
            System.out.println("Password Generation Test failed");           
        }
    }

     static void testAlphabetCreation() {
        Alphabet alphabet = new Alphabet(true, false, false, false);
        if (Alphabet.UPPERCASE_LETTERS.equals(alphabet.getAlphabet())) {
            System.out.println("Uppercase Alphabet Creation Test Passed");
        } else {
            System.out.println("Uppercase Alphabet Creation Test Failed");
        }

        alphabet = new Alphabet(false, true, false, false);
        if (Alphabet.LOWERCASE_LETTERS.equals(alphabet.getAlphabet())) {
            System.out.println("Lowercase Alphabet Creation Test Passed");
        } else {
            System.out.println("Lowercase Alphabet Creation Test Failed");
        }

        alphabet = new Alphabet(false, false, true, false);
        if (Alphabet.NUMBERS.equals(alphabet.getAlphabet())) {
            System.out.println("Numbers Alphabet Creation Test Passed");
        } else {
            System.out.println("Numbers Alphabet Creation Test Failed");
        }

        alphabet = new Alphabet(false, false, false, true);
        if (Alphabet.SYMBOLS.equals(alphabet.getAlphabet())) {
            System.out.println("Symbols Alphabet Creation Test Passed");
        } else {
            System.out.println("Symbols Alphabet Creation Test Failed");
        }
    }
}