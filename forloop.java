class forloop{
    public static boolean check(int n) {
        if (n < 25)
            return true;
        else
            return false;
    }

    public static int incrementInFibonnaciSequence(int a, int b) {
        return (a + b);
    }


    public static void main(String[] args){
        
        for(int i = 0, j = 1, t, k = 0; k <= 15; k++, t = j, j = incrementInFibonnaciSequence(i, j), i = t) {
            System.out.print(i + " ");
        }     
    }

}

// 0 1 1 2 3 5 8 13 