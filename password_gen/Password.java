public class Password {
    private final String value;
    private final int length;

    public Password(String value){
        this.value=value;
        this.length=value.length();
    } 

    private int charType(char c){
        if(Character.isUpperCase(c)) return 1;
        if(Character.isLowerCase(c)) return 2;
        if(Character.isDigit(c)) return 3;
        return 4;
    }

    public int passwordStrength(){
        boolean usedUpper=false,usedLower=false,usedNum=false,usedSym=false;
        int score=0;

        for(char c: value.toCharArray()){
            int type=charType(c);
            if(type==1) usedUpper=true;
            if(type==2) usedLower=true;
            if(type==3) usedNum=true;
            if(type==4) usedSym=true;
        }
        if(usedUpper) score++;
        if(usedLower) score++;
        if(usedNum) score++;
        if(usedSym) score++;
        if(length>=8) score++;
        if(length>=10) score++;
        return score;
    }

    public String calculateScore(){
        int score=this.passwordStrength();
        switch(score){
            case 6:
                return "This is a very good password";
            case 4,5:
                return "This is a good password";
            case 3:
                return "This is medium password";
            default:
                return "This is weak password";
        }
    }

    @Override
    public String toString(){
        return value;
    }
}
