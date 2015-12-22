package week2.day1;

/**
 * Created by acer on 21.12.2015.
 */
public class Bus {

    private int number;
    private Human[] humanArray = new Human[24];

    public Bus(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void addPas(Human human) {
        for (int i = 0; i < humanArray.length; i++) {
            if (humanArray[i] == null) {
                humanArray[i] = human;
                return;
            }
        }
        System.out.println("The bus is full");
    }

    public void deletePas(int number) {
        number -= 1;
        if (number < 0 || number >= humanArray.length) {
            return;
        }
        humanArray[number] = null;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Bus #" + this.number + '\n');
        for (int i = 0; i < humanArray.length; i++) {
            if(humanArray[i] != null){
                sb.append((i + 1) + ") " + humanArray[i] + '\n');
            }else{
                sb.append((i + 1) + ") " + "free" + '\n');
            }
        }
        return sb.toString();
    }
}
