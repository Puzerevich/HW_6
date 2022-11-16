public class HomeWorkApp {
    public static void main(String[]args){

        // Task №2
        System.out.println("Task №1,2 result:");
        System.out.println(printThreeWords());

        // Task №3
        System.out.println("\nTask №3 result:");
        if(checkSumSign())
            System.out.println("Сума позитивна.");
        else
            System.out.println("Сума негативна.");

        // Task №4
        System.out.println("\nTask №4 result:");
        System.out.println(printColor(200));

        // Task №5
        System.out.println("\nTask №5 result:");
        System.out.println(compareNumbers());

        // Task №6
        System.out.println("\nTask №6 result:");
        //compareSumIntegerNumbers(4,16);
        System.out.println(compareSumIntegerNumbers(4,16));

        System.out.println("\nTask №6 (for double numbers) result:");
        //compareSumDoubleNumbers(4.50,15.50);
        System.out.println(compareSumDoubleNumbers(4.50,15.50));

        // Task №7
        System.out.println("\nTask №7 result:");
        plusOrMinus(-11);
        if(plusOrMinus(-11))
           System.out.println("Число додатнє");
        else
           System.out.println("Число від'ємне");

        // Task №8
        System.out.println("\nTask №8 result:");
        System.out.println(isMinusNumber(-1));
        System.out.println(isMinusNumber(2));


        // Task №9
        System.out.println("\nTask №9 result:");
        System.out.println(typesString("Text line", 5));

        // Task №10
        System.out.println("\nTask №10 result:");
        if(leapYear(2020))
             System.out.println("Рік високосний.");
        else
            System.out.println("Рік не високосний.");
    }

    // METHODS
//////////////////////////////////////////////////////////////////////////////////////

    // Task №2
    public static String printThreeWords(){
        Fruits[] arr = Fruits.values();
        String res="";
        for(Fruits rs: arr){
//            System.out.println(res);
            res = res + rs.name()+"\n";
        }
        return res;
    }

    // Task №3
    public static boolean checkSumSign(){
        int a = 5;
        int b = 10;
         a=a+b;

        if(a>=0)
            return true;
        else
            return false;
    }

    // Task №4
    public static String printColor(int value){
        String res="";
        if(value<0)
            res = String.valueOf(TrafficLight.RED);
        else
            if(value>100)
                res = String.valueOf(TrafficLight.GREEN);
            else
                res = String.valueOf(TrafficLight.YELLOW);
        return res;
    }

    // Task №5
    public static String compareNumbers(){
        int a=3;
        int b=2;
        if(a>=b)
            return ComparNumb.a.res;
        else
            return ComparNumb.b.res;
    }

    // Task №6
    public static boolean compareSumIntegerNumbers(int q, int w){
            return (q+w>=10 && q+w<=20);
    }
    // Task №6 (for double numbers)
    public static boolean compareSumDoubleNumbers(double q, double w) {
        double eq=0.00000001;
        return (q+w-10>=eq && q+w-20<=eq);
    }

    // Task №7
    public static boolean plusOrMinus(int n){
        // Ternary operator
        return n>=0?true:false;
    }

    // Task №8
    public static boolean isMinusNumber(int mn){
            return (mn<0);
    }

    // Task №9
    public static String typesString(String s, int count){
        String res ="";
        while(count>0){
            res = res+s+"\n";
            count--;
        }
        return res;
    }

    public static boolean leapYear(int year){
        // Ternary operator
        return (year%4==0 && year%100!=100)|| year%400==0 ? true : false;
    }
}
