public class HomeWorkApp {
    public static void main(String[]args){

        // Task №2
        System.out.println("Task №1,2 result:");
        fruitsPrint();

        // Task №3
        System.out.println("\nTask №3 result:");
        checkSumSign();

        // Task №4
        System.out.println("\nTask №4 result:");
        printColor();

        // Task №5
        System.out.println("\nTask №5 result:");
        compareNumbers();

        // Task №6
        System.out.println("\nTask №6 result:");
        //compareSumIntegerNumbers(4,16);
        System.out.println(compareSumIntegerNumbers(4,16));

        System.out.println("\nTask №6 (for double numbers) result:");
        //compareSumDoubleNumbers(4.50,15.50);
        System.out.println(compareSumDoubleNumbers(4.50,15.50));

        // Task №7
        System.out.println("\nTask №7 result:");
        PlusOrMinus(-11);

        // Task №8
        System.out.println("\nTask №8 result:");
        System.out.println(isMinusNumber(-1));
        System.out.println(isMinusNumber(2));


        // Task №9
        System.out.println("\nTask №9 result:");
        TypesString("Text line", 5);

        // Task №10
        System.out.println("\nTask №10 result:");
        System.out.println(leapYear(2020));

    }

    // METHODS
//////////////////////////////////////////////////////////////////////////////////////

    // Task №2
    public static void fruitsPrint(){
        Fruits[] arr = Fruits.values();
        for(Fruits res: arr){
            System.out.println(res);
        }
    }

    // Task №3
    public static void checkSumSign(){
        int a = 5;
        int b = 10;
         a=a+b;

        //if(a+b>=0)
        if(a>=0)
            System.out.println("Сума позитивна і становить "+a);
        else
            System.out.println("Сума негативна і становить "+a);
    }

    // Task №4
    public static void printColor(){
        int value = 100;
        if(value<0)
            System.out.println(trafficLight.RED);
        else
            if(value>100)
                System.out.println(trafficLight.GREEN);
            else System.out.println(trafficLight.YELLOW);
    }

    // Task №5
    public static void compareNumbers(){
        int a=3;
        int b=2;
        if(a>=b)
            System.out.println(comparNumb.a.res);
        else
            System.out.println(comparNumb.b.res);
    }

    // Task №6
    public static boolean compareSumIntegerNumbers(int q, int w){
//        System.out.println(q+w>=10 && q+w<=20);
            return (q+w>=10 && q+w<=20);
    }
    // Task №6 (for double numbers)
    public static boolean compareSumDoubleNumbers(double q, double w) {
        double eq=0.00000001;
       // System.out.println(q+w-10>=eq && q+w-20<=eq);
        return (q+w-10>=eq && q+w-20<=eq);
    }

    // Task №7
    public static void PlusOrMinus(int n){
        if(n>=0)
            System.out.println("Число додатнє");
        else
            System.out.println("Число від'ємне");
    }

    // Task №8
    public static boolean isMinusNumber(int mn){
            return !(mn>=0);
    }

    // Task №9
    public static void TypesString(String s, int count){
        while(count>0){
            System.out.println(s);
            count--;
        }
    }

    public static boolean leapYear(int year){
        if((year%4==0)&&(year%100!=0)||(year%400==0)) {
            System.out.println("Рік високосний.");
            return true;
        }
        else {
            System.out.println("Рік не високосний.");
            return false;
        }
    }
}
