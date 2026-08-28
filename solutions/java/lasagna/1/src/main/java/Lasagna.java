public class Lasagna {
    public static void main(String [] args){
        
    Lasagna lasagna = new Lasagna();
    
    System.out.println(lasagna.expectedMinutesInOven());
    System.out.println(lasagna.remainingMinutesInOven(30));
    System.out.println(lasagna.preparationTimeInMinutes(2));
    System.out.println(lasagna.totalTimeInMinutes(3, 20));

}
public int expectedMinutesInOven(){
        return 40;
}

public int remainingMinutesInOven(int actualMinutesInOven){
        return expectedMinutesInOven() - actualMinutesInOven;
}
public int preparationTimeInMinutes(int layers){
        return layers * 2;
}
public int totalTimeInMinutes(int layers, int minutesOven){
    return preparationTimeInMinutes(layers) + minutesOven;
}
}



