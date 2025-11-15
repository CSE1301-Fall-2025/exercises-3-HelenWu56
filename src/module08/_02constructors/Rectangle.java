package module08._02constructors;

class Rectangle 
{
    private int length;
    private int width;

    public Rectangle()
    {  
       length = 2;
       width = 2;
    }

    public Rectangle(int l, int w) 
    {
       length = l;
       width = w;
    }

    public void draw() 
    {
      for(int i=0; i < length; i++)
      {
         for(int j=0; j < width; j++)
             System.out.print("* ");
          System.out.println();
      }
      System.out.println();
    }

}
