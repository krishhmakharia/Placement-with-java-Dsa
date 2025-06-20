package OOPS;

public class GettersAndSetters {
    // When class member are private, then we use getter to get members and setter to modify content.
    public static void main(String arg[]){
        Car b6e = new Car();
        b6e.setDetails("Model: top");
        System.out.println(b6e.getDetails());
    }
}
class Car{
    private String car_details;

    void setDetails(String details){
        this.car_details=details;
    }
    String getDetails(){
        return this.car_details;
    }
}
