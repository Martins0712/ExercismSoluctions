
class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public static int[] getLastWeek() {
        return new int []{0,2,5,3,7,8,4};
    }

    public int getToday() {
        if (this.birdsPerDay.length == 0) {
        return 0;
    }
        return this.birdsPerDay[this.birdsPerDay.length - 1];
    }

    public void incrementTodaysCount() {
        int ultimoIndice = this.birdsPerDay.length - 1;
        this.birdsPerDay[ultimoIndice]++;
    }

    public boolean hasDayWithoutBirds() {
         for (int count : this.birdsPerDay) {
        if (count == 0) {
            return true; 
        }
    }
        return false; 
    }

    public int getCountForFirstDays(int numberOfDays) {
        int total = 0;
        int limite = Math.min(numberOfDays, this.birdsPerDay.length);
    
        for (int i = 0; i < limite; i++) {
            total += this.birdsPerDay[i];
    }
        return total;    
    }

    public int getBusyDays() {
  int diasAgitados = 0;
    
    for (int count : this.birdsPerDay) {
        if (count >= 5) {
            diasAgitados++; 
        }
    }
    
    return diasAgitados;    }
}
