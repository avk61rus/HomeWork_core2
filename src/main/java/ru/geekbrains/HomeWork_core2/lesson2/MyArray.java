package ru.geekbrains.HomeWork_core2.lesson2;

public class MyArray {

    public static void Array() {

        String strArray[][] = {
                {"14", "2", "56", "34"},
                {"4", "27", "41", "75"},
                {"11", "4", "78", "86"},
                {"8", "36", "92", "24"}
        };
        String[][] c = strArray;
        extracted(c);

        String strArray1[][] = {
                {"24", "2", "56", "34"},
                {"4", "27", "41", "75"},
                {"11", "4", "78", "86"/*, "54"*/},
                {"8", "36", "92", "24"},
//                {"15"}

        };
        String[][] d = strArray1;
        c=d;
        extracted(c);

        String strArray2[][] = {
                {"34", "2", "56", "34"},
                {"4", "27", "41", "75"},
                {"11", "4", "78", "86"},
                {"8", "3f", "92", "24"}
        };

        String[][] f = strArray2;
        c=f;
        extracted(c);
    }

    private static void extracted(String[][] c) {
        int sum =0;
        for (int i = 0; i < c.length; i++) {
            System.out.println();
            if (c[i].length > 4 || c.length > 4) {
                 throw new MyArraySizeException ("Формат массива не 4 х 4 !");
            } else for (int j = 0; j < c[i].length; j++) {
                try {
                    Integer m = Integer.parseInt(c[i][j]);
                    System.out.print(m + "  ");
                    sum = sum + m;
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(String.format("Неправильный формат элемента массива!" +
                            " в ячейке %d, %d ", j+1, i+1));
                    // координаты подсмотрел, но не понял почему +1
                }
            }
        }
        System.out.println("\n Sum = " + sum);
    }
}



