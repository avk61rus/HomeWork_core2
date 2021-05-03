package ru.geekbrains.HomeWork_core2.lesson5;

public class HighFlowRate {

    public static void main(String[] args) {
        double a;
/*  Вариант 1                                                                                             */
/*________________________________________________________________________________________________________*/
        loadingArr();
        a = System.currentTimeMillis();
        floatMathSin();
        System.out.println("\nВремя выполнения метода 1 floatMathSin(): " + (System.currentTimeMillis() - a) + "ms");

/*  Вариант 2                                                                                              */
//_________________________________________________________________________________________________________*/
        a = System.currentTimeMillis();
        dividingArray();
        floatMathSin1();
        floatMathSin2();
        gluingArray();
        System.out.println("Время выполнения метода 2 floatMathSin(): " + (System.currentTimeMillis() - a) + "ms");
    }

    static final int size = 10_000_000;
    static float[] arr = new float[size];

    private static void loadingArr() {
        for (int j = 0; j < size; j++) arr[j] = 1;
    }

    public static void floatMathSin() {
        for (int i = 0; i < size; i++) {
            arr[i] = (float) (arr[i] * Math.sin(0.2f + (i / 5)) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
    }

    /*         Второй метод                                                                                       */
    /*------------------------------------------------------------------------------------------------------------*/
    private static int h = size / 2;
    static float[] arr1 = new float[h];
    static float[] arr2 = new float[h];

    public static void dividingArray() {
        System.arraycopy(arr,0,arr1,0,h);
        System.arraycopy(arr,h,arr2,0,h);
    }

    public static void floatMathSin1() {
        for (int i = 0; i < h; i++) {
            arr1[i] = (float) (arr1[i] * Math.sin(0.2f + (i / 5)) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
    }
    public static void floatMathSin2() {
        for (int i = 0; i < h; i++) {
            arr2[i] = (float) (arr2[i] * Math.sin(0.2f + (i / 5)) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
    }

    public static void gluingArray() {
        System.arraycopy(arr1,0,arr,0,h);
        System.arraycopy(arr2,0,arr,h,h);
    }












}
