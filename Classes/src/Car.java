public class Car {

    private int doors;
    private int wheels;
    public String model;
    private String engine;
    public String color;

    public void setModel(String model)
    {
        String validModel = model.toLowerCase();
        if(validModel.equals("911 turbo") || validModel.equals("commodore"))
        {
            this.model = model;
        }
        else
        {
            this.model = "Unknown";
        }
    }

    public String getModel()
    {
        return this.model;
    }
}
