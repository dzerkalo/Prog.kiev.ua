package week2.hw;

/**
 * Создайте класс доска. Доска поделена на 4 части в каждую
 часть доски можно положить одну из фигур. У доски должны
 быть методы которые помещают и удаляют фигуру с доски.
 Также должен быть метод который выводит информацию о
 всех фигурах лежащих на доске и их суммарную площадь.
 */
public class Desk {

    private Shape[] shapesArray = new Shape[4];

    public void addShape(Shape shape){
        for (int i = 0; i < shapesArray.length; i++) {
            if(shapesArray[i] == null){
                shapesArray[i] = shape;
                return;
            }
        }
        System.out.println("The desk is full");
    }

    public void deleteShape(int number){
        number -=1;
        if(number < 0 || number > shapesArray.length){
            return;
        }else{
            shapesArray[number] = null;
        }
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < shapesArray.length; i++) {
            if(shapesArray[i] != null){
                sb.append((i + 1) + ") " + shapesArray[i] + '\n');
            }else{
                sb.append((i + 1) + ") " + "free" + '\n');
            }
        }
        return sb.toString();
    }
}
