import java.util.Scanner;

public class ComboLock {
    int dial1, dial2, dial3, dial11, dial22, dial33, f = 0;
    ;

    public ComboLock(int secret1, int secret2, int secret3) {
        dial1 = secret1;
        dial2 = secret2;
        dial3 = secret3;
    }

    public void reset() {
        dial1 = 0;
        dial2 = 0;
        dial3 = 0;
    }

    public void turnLeft(int ticks) {
        dial22 = ticks;
    }

    public void turnRight(int ticks) {
        if (f == 0) {
            dial11 = ticks; f=1;
        } else if (f == 1) {
            dial33 = ticks;
        }

    }
    public boolean open(){
        if(dial1 == dial11 && dial2 == dial22 && dial3 == dial33){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        ComboLock comboLock = new ComboLock(37,12,24);

        comboLock.turnRight(34);
        comboLock.turnLeft(12);
        comboLock.turnRight(24);

        System.out.println(comboLock.open());
    }
}
