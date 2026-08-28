public class Lasagna {

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



