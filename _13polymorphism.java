class vehicle{
    @Override
    void run(){
        System.out.println("Vehicle is running...");
    }
}
class bike extends vehicle{
    @Override
    void run(){
        System.out.println("Bike is running...");
    }
}
class car extends vehicle{
    @Override
    void run(){
        System.out.println("Car is running...");
    }
}


public class _13polymorphism {
    public static void main(String[] args){

        vehicle v = new vehicle();
        v.run();
        bike b = new bike();
        b.run();
        car c = new car();
        c.run();
        System.out.println("**********");
        //bike[] veh_arr = {v, b, c};//because we have created an array of bike type and we are trying to store vehicle and car objects in it. So, it will give error.
        //car[] veh_arr = {v, b, c};//because we have created an array of car type and we are trying to store vehicle and bike objects in it. So, it will give error.
        vehicle[] veharr = {v, b, c};//because we have created an array of vehicle type and we are trying to store vehicle, bike and car objects in it. So, it will not give error.
        for(vehicle ve : veharr){
            ve.run();
        }
    }
}
