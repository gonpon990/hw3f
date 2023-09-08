public class Main {
    public static void main(String[] args) {

        double[] numbers ={2.0,3.4,-6.2,-9.3, 5.8, 5.5,6.6,-7.7,2.2,-1.1,-3.3,-4.4,5.5,9.5,-6.6};

        double sum = 0.0;
        int bvc = 0;
        boolean tgr = false;

        for (double num :numbers) {
            if (num <0){
                tgr=true;
            } else if (tgr && num>0) {
                sum+=num;
                bvc++;
            }

        }
        System.out.println(sum/bvc);
    }
}