public class Compass {
    public double angle;
    public String direction;

    public Compass(double angle) {
        this.angle = angle;
    }
    
    public String getDirection() {
        if (angle >= (360 - 22.5) && angle < 22.5) {
            direction = "N";
        } else if (angle >= 22.5 && angle < (45 + 22.5)) {
            direction = "NE";
        } else if (angle >= (45 + 22.5) && angle < (90 + 22.5)) {
            direction = "E";
        } else if (angle >= (90 + 22.5) && angle < (135 + 22.5)) {
            direction = "SE";
        } else if (angle >= (135 + 22.5) && angle < (180 + 22.5)) {
            direction = "S";
        } else if (angle >= (180 + 22.5) && angle < (225 + 22.5)) {
            direction = "SW";
        } else if (angle >= (225 + 22.5) && angle < (270 + 22.5)) {
            direction = "W";
        } else if (angle >= (270 + 22.5) && angle < (315 + 22.5)) {
            direction = "NW";
        } else if (angle >= (315 + 22.5) && angle < (360 + 22.5)) {
            direction = "N";
        }
        return direction;
    }
    
    public static void main(String[] args) {
        System.out.println(new Compass(72).getDirection());
        System.out.println(new Compass(108).getDirection());
    }
}
