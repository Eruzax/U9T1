public class Computer
{
    private int screenSize; // in inches
    private int memory; // in gigabytes (GB)

    public Computer(int sS, int m)
    {
        screenSize = sS;
        memory = m;
    }

    public int getScreenSize()
    {
        return screenSize;
    }

    public int getMemory()
    {
        return memory;
    }

    public void installOperatingSystem()
    {
        System.out.println("installing OS...");
    }
}
