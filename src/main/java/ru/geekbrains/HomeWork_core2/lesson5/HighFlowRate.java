package ru.geekbrains.HomeWork_core2.lesson5;

import java.util.Arrays;

public class HighFlowRate {
    
    public static void main(String[] args) {
        double a;
        
        /*        Вариант 1                                                                                       */
        /*________________________________________________________________________________________________________*/
        loadingArr();
        a = System.currentTimeMillis();
        floatMathSin();
        System.out.println("\nВремя выполнения метода 1 floatMathSin(): " + (System.currentTimeMillis() - a) + "ms");
        
        /*         Вариант 2                                                                                        */
        /*_________________________________________________________________________________________________________*/
        a = System.currentTimeMillis();
        dividingArray();
        floatMathSin1();
        floatMathSin2();
        gluingArray();
        System.out.println("Время выполнения метода 2 floatMathSin(): " + (System.currentTimeMillis() - a) + "ms");
        comparingArray();
    }
    
    /*            Первый метод                                                                                    */
    /*------------------------------------------------------------------------------------------------------------*/
    
    static final int size = 10_000_000;
    static float[] arr0 = new float[size]; //массив с единицами;
    static float[] arr = new float[size];  //массив с вычислением по 1 методу;
    
    private static void loadingArr() {
        for (int j = 0; j < size; j++) arr0[j] = 1;
    }
    
    public static void floatMathSin() {
        for (int i = 0; i < size; i++) {
            arr[i] = (float) (arr0[i] * Math.sin(0.2f + (i / 5)) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
    }
    
    /*            Второй метод                                                                                    */
    /*------------------------------------------------------------------------------------------------------------*/
    private static int h = size / 2;
    static float[] arr1 = new float[h];      //первая половина разрезанного массива с единицами;
    static float[] arr2 = new float[h];      //вторая половина разрезанного массива с единицами;
    static float[] arr3 = new float[size];   //склеенный массив с вычислениями по 2-му методу;
    
    public static void dividingArray() {
        System.arraycopy(arr0, 0, arr1, 0, h);
        System.arraycopy(arr0, h, arr2, 0, h);
    }
    
    public static void floatMathSin1() {
        for (int i = 0; i < h; i++) {
            arr1[i] = (float) (arr1[i] * Math.sin(0.2f + (i / 5)) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
    }
    
    public static void floatMathSin2() {
        for (int i = 0; i < h; i++) {
            arr2[i] = (float) (arr2[i] * Math.sin(0.2f + ((i + h) / 5)) * Math.cos(0.2f + (i + h) / 5) * Math.cos(0.4f + (i + h) / 2));
        }
    }
    
    public static void gluingArray() {
        System.arraycopy(arr1, 0, arr3, 0, h);
        System.arraycopy(arr2, 0, arr3, h, h);
    }
    
    public static void comparingArray() {
        System.out.println("Массивы 1 и 2 варианта одинаковы? - " + Arrays.equals(arr, arr3));
    }
}










