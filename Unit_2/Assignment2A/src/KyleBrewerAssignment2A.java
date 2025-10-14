




public class KyleBrewerAssignment2A {

    
    
    
    /*
     * A recursive method with parameter N that uses recursion to compute 1+22+32+...N2
     */
    public static int kyleBrewerMethod1(int NthNumber ) {
        if (NthNumber <= 0) {
            return 0;
        }
        return (NthNumber * NthNumber) + kyleBrewerMethod1( NthNumber - 1);
    }


    /*
     * A brute method with parameter N that uses a loop to compute 1+22+32+...N2
     */
    public static int kyleBrewerMethod2(int NthNumber) {

        if (NthNumber <= 0) {
            return 0;
        }
        int sum = 0;

        for (int i = 0; i <= NthNumber; i++) {
            sum += i * i;   
        }

        return sum;
    }


    /*
     * A mathematical method with parameter N that uses mathematic summation formula1 to 
     * compute 1+22+32+...N2
     */
    public static int kyleBrewerMethod3(int NthNumber ) {
        if (NthNumber <= 0){
            return 0;
        }

        return (NthNumber * (NthNumber + 1) * (2 * NthNumber + 1)) / 6;
    }




    /*
     * Main method 
     */
    public static void main(String[] args) {
        int Anwser1 = kyleBrewerMethod1(5);
        System.out.println(Anwser1);

        int answer2 = kyleBrewerMethod2(105);
        System.out.println(answer2);

        int answer3 = kyleBrewerMethod3(32);
        System.out.println(answer3);
        



        
    }
}