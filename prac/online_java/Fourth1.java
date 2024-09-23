public class Fourth1 {
    public static void main(String[] args) {       
        int i=1;
        while(i<=10){
            if(i==3){
                i+=2;
                continue;
            }
            System.out.println(i);
            i++;
            if((i&2)==0){
                i++;
            }
            if(i>6){
                break;
            }
        }

        int j=1;
        do{
            System.out.println(j);
            j++;
        }while(j<10);

        for(int k=1;k<10;k++){
            System.out.println(k);
        }
        int m,n;
        for(m=1,n=2;m<=9;m+=2,n+=2){
            System.out.println(m+" "+n);
        }
    }   
}
