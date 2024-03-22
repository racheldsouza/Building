package BuildingProject;

public abstract class Building 
{
    private double cost;
    private String color;
    private String owner;
    private Address address;
    
    public Building(double cost, String color, String owner, Address address)
    {
        this.cost = cost;
        this.color = color;
        this.owner = owner;
        this.address = address;
    }

    public abstract double calculateVolume();

    public String getInfo()
    {
        return "Building cost: $" + this.cost + "\nBuilding color: " + this.color + 
        "\nBuilding Owner: " + this.owner + "\n" + this.address.getInfo() + "Volume:" + calculateVolume() + "\n";
    }
}
