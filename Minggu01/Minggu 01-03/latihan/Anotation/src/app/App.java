package app;

public class App
{
    @Deprecated
    public void Display()
    {
        System.out.println("Deprecatedtest display()");
    }
   public static void main(String args[])
    {
        App d1 = new App();
        d1.Display();
    }
}