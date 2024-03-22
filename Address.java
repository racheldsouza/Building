package BuildingProject;

public class Address 
{
    private String streetNum;
    private String streetName;
    private String city;
    private String state;
    private String zip;

    public Address(String streetNum,String streetName, String city, String state, String zip)
    {
        this.streetNum = streetNum;
        this.streetName = streetName;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    public String getInfo()
    {
        return "Address:\n" + this.streetNum + " " + this.streetName + "\n" + this.city + ", " 
        + this.state + " " + this.zip + "\n";
    }
}
