public class CastingVar{
    public static void main(String[] args) {
        
        int MO = 75;
        int MM = 90;
        int per;
        double percentage;
        double mPer;
        per = 100* MO/MM;

        percentage = 100* MO/MM;

        mPer = (double)MO/MM * 100;

        System.out.println("Percentage marks are: "+ per);

        System.out.println("Percentage marks are to decimal: "+ percentage);

        System.out.println("Percentage marks are to decimal: "+ mPer);


    
    }
    
}