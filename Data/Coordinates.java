package ProjectGame.Data;


public class Coordinates {

    int x;
    int y;

    public Coordinates(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double calculateDistance(Coordinates target){
        return Math.sqrt(Math.pow(this.x - target.x, 2) + Math.pow(this.y - target.y,2));
    }

    public void getCoordinates(){
        System.out.println(x + "; " + y); 
    }
}
