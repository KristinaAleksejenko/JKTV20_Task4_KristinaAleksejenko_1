//Создать программу, которая выводит в консоль одномерный массив (new int[100]) нечетных случайных чисел 
//от 0 до 100 (выводить в консоль по десять чисел в одном ряду). Отсортировать массив и посчитать среднее арифметическое всех чисел массива.
//Загрузить код проекта на удаленный репозиторий Git.

package Task4;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author pupil
 */
public class Task4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int summa= 0;
        Random rand = new Random();
        int[] numbers = new int[100];
        int count10=0;
        for(int i=0; i<numbers.length; i++){// numbers.length количество цифр в массиве
            numbers[i]= rand.nextInt(100);
            while (numbers[i]%2!=1){
                numbers[i]= rand.nextInt(100);}
            System.out.print(numbers[i]+" ");
            count10++;
            if (count10==10){
                System.out.println("");
                count10=0;
            }
            
        
                    
        }
        Arrays.sort(numbers);// метод сортировки массива
        
        for(int i=0; i<numbers.length; i++){
            System.out.print(numbers[i]+" ");
            summa=summa+numbers[i];
            count10++;
            if (count10==10){
                System.out.println("");
                count10=0;
            }
            
    }
        double otvet=summa/numbers.length;
        System.out.println("");
        System.out.println("Среднее арифметическое массива = "+otvet);
        
        
    }
    
    
}
