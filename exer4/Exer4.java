package exer4;

public class Exer4 {
     public static void main(String[] args) {

    double P1, E1, E2, X, SUB, API, EXF, MED, MIP1, MIP2, MIP3; 

    P1 = 7;
    E1 = 7;
    E2 = 6;
    X = 0;
    SUB = 9;
    API = 8;
    EXF = 0;
    
    MIP1 = ((P1 * 0.5 + E1 * 0.2 + E2 * 0.3 + X + SUB * 0.15) * 0.5);
    
    if ((P1 * 0.5 + E1 * 0.2 + E2 * 0.3 + X + (SUB *0.15)) > 5.9) {
        MIP2 = (P1 * 0.5 + E1 * 0.2 + E2 * 0.3 + X + (SUB *0.15));
    } else {
        MIP2 = 0;
    } 

    MED = (( MIP1 + MIP2) / ((P1 * 0.5 + E1 * 0.2 + E2 * 0.3 + X + (SUB * 0.15))) * API * 0.5);

    if (MED < EXF) {
        MIP3 = EXF;
    } else {
        MIP3 = MED;
    }
    System.out.println(MIP3);

    }    
}
    
