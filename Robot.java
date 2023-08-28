
public class Robot {
    String num;
    int left = 0, right = 0, up = 0, down = 0;


    int x = 0, y = 0;
    public void turnLeft(){
        if(left==0 && right==0 && up==0 && down==0){
            left = 1; right = 0; up = 0; down = 0;
        } else if (left==1 && right==0 && up==0 && down==0) {
            down = 1; left = 0; right = 0; up = 0;
        } else if (left==0 && right==1 && up==0 && down==0) {
            up = 1; left = 0; right = 0; down = 0;
        } else if (left==0 && right==0 && up==1 && down==0) {
            left = 1; right = 0; up = 0; down = 0;
        } else if (left==0 && right==0 && up==0 && down==1) {
            right = 1; left = 0; up = 0; down = 0;
        }

    }
    public void turnRight(){
        if(left==0 && right==0 && up==0 && down==0){
            right = 1; left = 0; up = 0; down = 0;
        } else if (left==1 && right==0 && up==0 && down==0) {
            up = 1; left = 0; right = 0; down = 0;
        } else if (left==0 && right==1 && up==0 && down==0) {
            down = 1; left = 0; right = 0; up = 0;
        } else if (left==0 && right==0 && up==1 && down==0) {
            right = 1; left = 0; up = 0; down = 0;
        } else if (left==0 && right==0 && up==0 && down==1) {
            left = 1; right = 0; up = 0; down = 0;
        }
    }
    public void move(){
        if(left==1 && right==0 && up==0 && down==0){
            x--;
        } else if (left==0 && right==1 && up==0 && down==0) {
            x++;
        }else if (left==0 && right==0 && up==1 && down==0) {
            y++;
        }else if (left==0 && right==0 && up==0 && down==1) {
            y--;
        }
    }
    public String getDirection(){
        if(left==1 && right==0 && up==0 && down==0){
            num = "S";
        }if(left==0 && right==1 && up==0 && down==0){
            num = "N";
        }if(left==0 && right==0 && up==1 && down==0){
            num = "W";
        }if(left==0 && right==0 && up==0 && down==1){
            num = "E";
        }
        return num;
    }
    public void getLocation(int right, int left){
        x = right;
        y = left;
    }


    public static void main(String[] args) {
        Robot robot = new Robot();

        robot.getLocation(3,-4);
        robot.turnRight();
        robot.turnRight();
        robot.move();
        robot.move();
        robot.turnLeft();
        robot.move();
        robot.move();
        robot.turnLeft();

        System.out.println("Direction is: " + robot.getDirection());

        System.out.println("Position is: " + robot.x + "," + robot.y);


    }
}