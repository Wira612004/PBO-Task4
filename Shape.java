public class Shape {

    protected double area;
    protected double Perimeter;
    protected String name;

    public void setName(String name){
        this.name = name;
    }

    public double getArea() {
        return area;
    }

    public double getPerimeter(){
        return Perimeter;

    }

    public void getInfo() {
        System.out.println("Name: "+ name);
        System.out.println("Area: "+ area);
        System.out.println("Perimeter: "+ Perimeter);

    }
}