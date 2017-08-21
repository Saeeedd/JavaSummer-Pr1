package entities;

public enum Grade {
    O, E, A, P, D, T;
    public static Grade returnGrade(String s) {
        if (s.equals("O"))
            return O;
        else if (s.equals("E"))
            return E;
        else if (s.equals("A"))
            return A;
        else if (s.equals("P"))
            return P;
        else if (s.equals("D"))
            return D;
        else
            return T;
    }
}
