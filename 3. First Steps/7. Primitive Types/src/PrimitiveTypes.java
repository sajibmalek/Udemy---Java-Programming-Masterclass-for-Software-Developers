public class PrimitiveTypes {
    public static void main(String[] args){

        int myValue=1000;
        int minValue=Integer.MIN_VALUE;
        int maxValue=Integer.MAX_VALUE;
        float MinValue=Float.MIN_VALUE;
        float MaxValue=Float.MAX_VALUE;

        System.out.println("Integer minValue = " + minValue);

        System.out.println("Integer maxValue = " + maxValue);

        System.out.println("Busted MAX value = " + (maxValue + 1));

        System.out.println("Busted MIN value = " + (minValue - 1));

        System.out.println("Float MinValue "  + MinValue);

        System.out.println("Float MinValue "  + MaxValue);

        System.out.println((float) 3.4028235E38);



    }
}
