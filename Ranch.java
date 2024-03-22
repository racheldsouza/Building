package BuildingProject;

public class Ranch extends Building
{
    private double length;
    private double width;
    private double height;

    public Ranch(double cost, String color, String owner, Address address, double length, double width, double height)
    {
        super(cost,color,owner,address);
        this.length = length;
        this.width = width;
        this.height = height;
    }    

    @Override
    public double calculateVolume()
    {
        double volume = length * width * height;
        return volume;
    }

    @Override 
    public String getInfo()
    {
        return super.getInfo() + "Length: " + this.length + "\nWidth: " + this.width 
        + "\nHeight: " + this.height + "\n";
    }
}

