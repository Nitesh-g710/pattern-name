import java.util.Scanner;

class a {
    int n = 5;

    void A(int i) {
        // A
        // for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            if (j == 0 && i > 0 || j == n - 1 && i > 0 || i == n / 2 || i == 0 && j > 0 && j < n - 1) {
                System.out.print("A ");
            } else {
                System.out.print("  ");
            }
            // }
            // System.out.println();
        }
    }

    void B(int i) {
        // B
        // for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            if (j == 0 || j == n - 1 && i > 0 && i < n - 1 || i == 0 && j < n - 1 || i == (n / 2) && j < n - 1
                    || i == n - 1 && j < n - 1) {
                System.out.print("B ");
            } else {
                System.out.print("  ");
            }
            // }
            // System.out.println();
        }
    }

    void C(int i) {

        // C
        // for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            if (j == 0 && i < n - 1 && i > 0 || i == 0 && j > 0 || i == n - 1 && j > 0) {
                System.out.print("C ");
            } else {
                System.out.print("  ");
            }
            // }
            // System.out.println();
        }
    }

    void D(int i) {

        // D
        // for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            if (j == 0 || i == 0 && j < n - 1 || i == n - 1 && j < n - 1 || j == n - 1 && i > 0 && i < n - 1) {
                System.out.print("D ");
            } else {
                System.out.print("  ");
            }
            // }
            // System.out.println();
        }
    }

    void E(int i) {

        // E
        // for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            if (i == 0 || i == n - 1 || i == n / 2 && j < n - 2 || j == 0) {
                System.out.print("E ");
            } else {
                System.out.print("  ");
            }
            // }
            // System.out.println();
        }
    }

    void F(int i) {

        // F
        // for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            if (i == 0 || j == 0 || i == n / 2 && j < n - 2) {
                System.out.print("F ");
            } else {
                System.out.print("  ");
            }
            // }
            // System.out.println();
        }
    }

    void G(int i) {

        // G
        // for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            if (j == 0 && i < n - 1 && i > 0 || i == 0 && j > 0 || i == n - 1 && j > 0 && j < n - 1
                    || j == n - 1 && i > n / 2 || j >= n / 2 && i == n / 2) {
                System.out.print("G ");
            } else {
                System.out.print("  ");
            }
            // }
            // System.out.println();
        }
    }

    void H(int i) {

        // H
        // for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            if (j == 0 || j == n - 1 || i == n / 2) {
                System.out.print("H ");
            } else {
                System.out.print("  ");
            }
            // }
            // System.out.println();
        }
    }

    void I(int i) {

        // I
        // for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            if (i == 0 || j == n / 2 || i == n - 1) {
                System.out.print("I ");
            } else {
                System.out.print("  ");
            }
        }
        // System.out.println();
        // }
    }

    void J(int i) {

        // J
        // for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            if (i == 0 && j < n - 1 || j == n - 2 && i < n - 1 || i == n - 1 && j < n - 1 && j > 0
                    || j == 0 && i > n / 2 && i < n - 1) {
                System.out.print("J ");
            } else {
                System.out.print("  ");
            }
            // }
            // System.out.println();
        }
    }

    void K(int i) {

        // K
        // for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            if (j == 0 || j == n - 2 - i || i == j && i >= n / 2) {
                System.out.print("K ");
            } else {
                System.out.print("  ");
            }
            // }
            // System.out.println();
        }
    }

    void L(int i) {

        // L
        // for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            if (j == 0 || i == n - 1) {
                System.out.print("L ");
            } else {
                System.out.print("  ");
            }
            // }
            // System.out.println();
        }
    }

    void M(int i) {

        // M
        // for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            if (j == 0 || j == n - 1 || i == j && i <= n / 2 || j == n - 1 - i && i < n / 2) {
                System.out.print("M ");

            } else {
                System.out.print("  ");
            }
            // }
            // System.out.println();
        }
    }

    void N(int i) {

        // N
        // for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            if (i == j || j == 0 || j == n - 1) {
                System.out.print("N ");
            } else {
                System.out.print("  ");
            }
        }
        // System.out.println();
    }

    void O(int i) {

        // O
        // for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            if (i == 0 && j < n - 1 && j > 0 || i == n - 1 && j < n - 1 && j > 0 || j == 0 && i < n - 1 && i > 0
                    || j == n - 1 && i < n - 1 && i > 0) {
                System.out.print("O ");
            } else {
                System.out.print("  ");
            }
            // }
            // System.out.println();
        }
    }

    void P(int i) {

        // P
        // for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            if (j == 0 || i == n / 2 && j < n - 1 || i == 0 && j < n - 1 || j == n - 1 && i < n / 2 && i > 0) {
                System.out.print("P ");
            } else {
                System.out.print("  ");
            }
            // }
            // System.out.println();
        }
    }

    void Q(int i) {

        // Q
        // for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            if (i == 0 && j < n - 1 && j > 0 || i == n - 1 && j < n - 1 && j > 0 || j == 0 && i < n - 1 && i > 0
                    || j == n - 1 && i < n - 1 && i > 0 || i == j && i >= n / 2 && i < n - 1) {
                System.out.print("Q ");
            } else {
                System.out.print("  ");
            }
            // }
            // System.out.println();
        }
    }

    void R(int i) {

        // R
        // for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            if (j == 0 || i == 0 && j < n - 1 || i == n / 2 && j < n - 1 || j == n - 1 && i > 0 && i < n / 2
                    || i == j && i > n / 2) {
                System.out.print("R ");
            } else {
                System.out.print("  ");
            }
            // }
            // System.out.println();
        }
    }

    void S(int i) {

        // S
        // for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            if (i == 0 && j > 0 || i == n / 2 || i == n - 1 && j < n - 1 || j == 0 && i > 0 && i <= n / 2
                    || j == n - 1 && i >= n / 2 && i < n - 1) {
                System.out.print("S ");
            } else {
                System.out.print("  ");
            }
            // }
            // System.out.println();
        }
    }

    void T(int i) {

        // T
        // for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            if (i == 0 || j == n / 2) {
                System.out.print("T ");
            } else {
                System.out.print("  ");
            }
            // }
            // System.out.println();
        }
    }

    void U(int i) {

        // U
        // for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            if (j == 0 && i < n - 1 || j == n - 1 && i < n - 1 || i == n - 1 && j > 0 && j < n - 1) {
                System.out.print("U ");
            } else {
                System.out.print("  ");
            }
            // }
            // System.out.println();
        }
    }

    void V(int i) {

        // V
        // for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            if (j == 0 && i <= n / 2 || j == n - 1 && i <= n / 2 || j == (n / 2) + 1 && i == (n - 2)
                    || j == (n / 2) - 1 && i == (n - 2) || j == n / 2 && i == n - 1) {
                System.out.print("V ");
            } else {
                System.out.print("  ");
            }
            // }
            // System.out.println();
        }
    }

    void W(int i) {

        // W
        // for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            if (j == 0 || j == n - 1 || i == j && i >= n / 2 || j == n - 1 - i && i >= n / 2) {
                System.out.print("W ");
            } else {
                System.out.print("  ");
            }
            // }
            // System.out.println();
        }
    }

    void X(int i) {

        // X
        // for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            if (i == j || j == n - 1 - i) {
                System.out.print("X ");
            } else {
                System.out.print("  ");
            }
            // }
            // System.out.println();
        }
    }

    void Y(int i) {

        // Y
        // for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            if (i == j && i <= n / 2 || j == n - 1 - i && i <= n / 2 || j == n / 2 && i >= n / 2) {
                System.out.print("Y ");
            } else {
                System.out.print("  ");
            }
            // }
            // System.out.println();
        }
    }

    void Z(int i) {

        // Z
        // for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            if (i == 0 || i == n - 1 || j == n - 1 - i) {
                System.out.print("Z ");
            } else {
                System.out.print("  ");
            }
            // }
            // System.out.println();
        }
    }

    public static void main(String[] args) {
        String alpha;
        int n = 5;
        a a1 = new a();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name");
        String name = sc.nextLine();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < name.length(); j++) {

                alpha = name.substring(j, j + 1);
                if (alpha != " ") {
                    switch (alpha) {
                        case "A":
                            a1.A(i);
                            break;
                        case "B":
                            a1.B(i);
                            break;
                        case "C":
                            a1.C(i);
                            break;
                        case "D":
                            a1.D(i);
                            break;
                        case "E":
                            a1.E(i);
                            break;
                        case "F":
                            a1.F(i);
                            break;
                        case "G":
                            a1.G(i);
                            break;
                        case "H":
                            a1.H(i);
                            break;
                        case "I":
                            a1.I(i);
                            break;
                        case "J":
                            a1.J(i);
                            break;
                        case "K":
                            a1.K(i);
                            break;
                        case "L":
                            a1.L(i);
                            break;
                        case "M":
                            a1.M(i);
                            break;
                        case "N":
                            a1.N(i);
                            break;
                        case "O":
                            a1.O(i);
                            break;
                        case "P":
                            a1.P(i);
                            break;
                        case "Q":
                            a1.Q(i);
                            break;
                        case "R":
                            a1.R(i);
                            break;
                        case "S":
                            a1.S(i);
                            break;
                        case "T":
                            a1.T(i);
                            break;
                        case "U":
                            a1.U(i);
                            break;
                        case "V":
                            a1.V(i);
                            break;
                        case "W":
                            a1.W(i);
                            break;
                        case "X":
                            a1.X(i);
                            break;
                        case "Y":
                            a1.Y(i);
                            break;
                        case "Z":
                            a1.Z(i);
                            break;
                        default:
                            break;
                    }
                } else {
                    System.out.println();
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
