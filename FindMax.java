package com.day13.generics.pgm;

public class FindMax <T extends Comparable <T>> {
        T x, y, z;

        public FindMax(T x, T y, T z) {
            this.x = x;
            this.y = y;
            this.z = z;
        }

        public void printMax(){
            FindMax.printMax(x, y, z);

        }
        private static <T extends Comparable<T>> void printMax(T x, T y, T z) {
            if (x.compareTo(y) > 0 && x.compareTo(z) > 0) {
                System.out.println(x);
            } else if (y.compareTo(x) > 0 && y.compareTo(z) > 0) {
                System.out.println(y);
            } else {
                System.out.println(z);
            }
        }

        public static void main(String[] args) {

            new FindMax<>(3, 4, 5).printMax();
            new FindMax<>(3.43f, 5.3f, 5.5f).printMax();
            new FindMax<>("abc", "def", "ghi").printMax();

        }


}
