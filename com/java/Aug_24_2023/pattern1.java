package com.java.Aug_24_2023;

public class pattern1 {


    public static void main(String[] args) {
        xPattern();
        System.out.println("\n");
        squarePattern();
        System.out.println("\n");

        //        Rhombus Star Pattern
        Rhombus();
        System.out.println("\n");
        TriangleStar();
        System.out.println("\n");
//        Pyramid Star Pattern

        PyramidStar();
        System.out.println("\n");
//        Half Diamond Star Pattern
        HalfDiamondStar();

        System.out.println("\n");

        DiamondStar(7);

    }

    private static void DiamondStar(int n) {

        for (int i = 1; i < n; i++) {
            for (int j = 1; j < n-i; j++) {
                System.out.print("   ");
            }
            for ( int k=1; k<=i*2-1; k++){
                System.out.print(" * ");
            }
            System.out.println();
        }

        for (int i = n-2; i >=1; i--) {
            for (int j =n-i; j >1; j--) {
                System.out.print("   ");
            }
            for ( int k=1; k<=i*2-1; k++){
                System.out.print(" * ");
            }
            System.out.println();
        }

    }

    private static void HalfDiamondStar() {

        for (int i = 1; i < 5; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i = 5; i > 1; i--) {
            for (int j = i; j > 1; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("\n");
        for (int i = 1; i < 5; i++) {
            for (int j = 1; j < 5; j++) {
                if (j > 5 - i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        for (int i = 1; i < 5; i++) {
            for (int j = 1; j < 5; j++) {
                if (j >= i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }


        System.out.println("pattern 67\n");

        for (int i = 1; i < 5; i++) {
            for (int j = 1; j < 6 - i; j++) {
                System.out.print("   ");
            }
            for (int k = 1; k <= i * 2 - 1; k++) {
                if (k == 1 || k == i * 2 - 1) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }

            }
            System.out.println();
        }
        for (int i = 3; i >= 1; i--) {
            for (int j = 3; j > i - 2; j--) {
                System.out.print("   ");
            }
            for (int k = 1; k <= i * 2 - 1; k++) {
//dadd
                if (k == 1 || k == i * 2 - 1) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
        System.out.println("line 97");
    }

    private static void PyramidStar() {

        for (int i = 1; i < 6; i++) {
            for (int j = 1; j < 6 - i; j++) {
                System.out.print("   ");
            }
            for (int k = 1; k <= (i * 2) - 1; k++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
        System.out.println("\n");


//        Inverted Pyramid Star Pattern

        for (int i = 5; i >= 1; i--) {
            for (int j = 5; j > i; j--) {
                System.out.print("   ");
            }
            for (int k = 1; k <= i * 2 - 1; k++) {

                System.out.print(" * ");

            }
            System.out.println();
        }

//        Inverted hollow Pyramid Star Pattern
        System.out.println("\n");

        for (int i = 5; i >= 1; i--) {
            for (int j = 5; j > i; j--) {
                System.out.print("   ");
            }

            for (int k = 1; k <= i * 2 - 1; k++) {
                if (i == 5 || k == 1 || k == i * 2 - 1) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }

        System.out.println("\n");

        for (int i = 1; i < 6; i++) {
            for (int j = 1; j < 6 - i; j++) {
                System.out.print("   ");
            }
            for (int k = 1; k <= i * 2 - 1; k++) {
                if (i == 1 || k == 1 || i == 5 || k == i * 2 - 1) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }


    }

    //    xxx pattern
    public static void xPattern() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == j || i + j == 4) {
                    System.out.print(i + "  ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    private static void squarePattern() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == 0 || i == 4 || j == 0 || j == 4) {
                    System.out.print(i + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

    }

    private static void Rhombus() {
        for (int i = 0; i < 5; i++) {
            for (int k = 5; k > i; k--) {
                System.out.print(" ");
            }
            for (int j = 0; j < 5; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("\n");

        for (int i = 0; i < 5; i++) {
            for (int k = 0; k < i; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 5; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    private static void TriangleStar() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("\n");

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5 - i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("\n");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i <= j) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println("\n");

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (j >= 4 - i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

}

