public class box1 {
     private int length,width;
    box1(int l,int w){
        length =l;
        width=w;
    }
    void setvalue(int l, int w){
        length=l;
        width=w;
    }
    int area(){
        return length*width;
    }

}
class box3d extends box1{
    private int height;
    box3d(int l,int w, int h){
        super(l,w);
        height=h;
    }
    void setvalue(int l, int w, int h){
        super.setvalue(l,w);
        height=h;
    }
    int volume(){
        return super.area()*height;
    }
}
class Main1{
    public static void main(String args[]){
        box1 d2 =new box1(30,50);
        box3d d3 =new box3d(10,20,30);
        d2.setvalue(30,50);
        System.out.println("area of box ="+d3.area());
        System.out.println("volume of box = "+d3.volume());
    }
}