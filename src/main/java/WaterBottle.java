public class WaterBottle {

    private int volume;

    public WaterBottle(int volume){
        this.volume = volume;
    }

    public int getVolume(){
        return this.volume;
    }

    public void Drink(){
        this.volume -= 10;
    }

    public void Fill(){
        this.volume = 100;
    }

    public void Empty(){
        this.volume = 0;
    }
}
