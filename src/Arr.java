
//Напишите обобщенный метод compareArrays(),
// который принимает два массива и возвращает true,
// если они одинаковые, и false в противном случае.
// Массивы могут быть любого типа данных,
// но должны иметь одинаковую длину и
// содержать элементы одного типа по парно по индексам.
public class Arr {
    public static <T> boolean compareArrays(T[] array1, T[] array2){
            if (array1==null || array2==null || array1.length != array2.length)
                return false;
        for (int i = 0; i < array1.length; i++) {
            if (array1[i]!=array2[i]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Integer[] array1 = {1,2,3,4,5};
        Integer[] array2 = {1,2,3,4,0};

        System.out.println("равны ли array1 и array2? " + compareArrays(array1, array2));
    }
}


