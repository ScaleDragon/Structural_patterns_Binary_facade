package ru.netology;

public class BinOps {
    public String sum(String a, String b) {
    /*Переведите числа из двоичной записи в
      строках в int, сложите и переведите
      обратно в двоичную запись*/
        int aDecimal = Integer.parseInt(a, 2);
        int bDecimal = Integer.parseInt(b, 2);
        return Integer.toBinaryString(aDecimal + bDecimal);
    }

    public String mult(String a, String b) {
    /*Переведите числа из двоичной записи в
      строках в int, перемножьте и переведите
      обратно в двоичную запись*/
        int aDecimal = Integer.parseInt(a, 2);
        int bDecimal = Integer.parseInt(b, 2);
        return Integer.toBinaryString(Math.multiplyExact(aDecimal, bDecimal));
    }
}
