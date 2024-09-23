class triangle{
    double area;
    int height;
    int length;

    public static void main(String[] args){
        int x=0;
        triangle[] ta=new triangle[4];
        while(x<4){
            ta[x]=new triangle();
            ta[x].height=(x+1)*2;
            ta[x].length=x+4;
            ta[x].setArea();
            System.out.print("triangle "+x+",area");
            System.out.println("="+ta[x].area);
            x=x+1;
        }
        int y=x;
        triangle t5=ta[2];
        System.out.print("y= "+t5.area);
        ta[2].area=343;
        System.out.print("y= "+y);
        System.out.println(", t5 area= "+t5.area);
    }
    void setArea(){
        area=(height*length)/2;
    }
}
