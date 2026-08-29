public class JedliksToyCar {
    
    public int meters = 0;
    public int battery = 100;
    
    public static JedliksToyCar buy() {
        return new JedliksToyCar();
    }

    public String distanceDisplay() {
        return "Driven "+ meters + " meters";
    }

    public String batteryDisplay() {
        if (battery > 0){
            return "Battery at " + battery + "%";
        }
        return "Battery empty";
    }

    public void drive() {
        if (battery <= 0){
             return;
        }
        battery -= 1;
        meters += 20;
    }
}
