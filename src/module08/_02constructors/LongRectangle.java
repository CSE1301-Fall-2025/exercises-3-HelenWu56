package module08._02constructors;

public class LongRectangle extends Rectangle{

    public LongRectangle(){
        super();
    }

    public LongRectangle(int w){
        super(w, 2*w);
    }

     public static void main(String[] args){
        LongRectangle r = new LongRectangle();
        r.draw();
        LongRectangle s = new LongRectangle(3);
        s.draw();
     }

}
