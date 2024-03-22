package BuildingProject;

public class Silo extends Building
{
    private double radius;
    private double height;
    
    public Silo(double cost, String color, String owner, Address address, double radius, double height)
    {
        super(cost,color,owner,address);
        this.radius = radius;
        this.height = height;
    }

    @Override
    public double calculateVolume() 
    {
        double volume = Math.PI * Math.pow(radius, 2) * height;
        return volume;
    }

    @Override
    public String getInfo()
    {
        return super.getInfo() + "Radius: " + this.radius + "\nHeight: " + this.height + "\n";
    }
}
