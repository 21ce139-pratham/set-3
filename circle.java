public class circle {
    double radius=1;
    circle(){
        System.out.println("Default value of radius: " +radius);
    }

    circle(double radius){
        this.radius=radius;
    }
    double getArea(){
        double area = 3.14*radius*radius;
        return area;
    }

    double getPerimeter(){
        double peri = 2*3.14*radius;
        return peri;
    }
}