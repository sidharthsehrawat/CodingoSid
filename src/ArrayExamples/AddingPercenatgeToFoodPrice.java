package ArrayExamples;

public class AddingPercenatgeToFoodPrice {
    static void solve(double meal_cost, int tip_percent, int tax_percent) {
        double tipCost=0,taxCost=0,totalCost=0;

        tipCost=(double)meal_cost*tip_percent/100;
        taxCost=(double)meal_cost*tax_percent/100;

        totalCost=meal_cost+tipCost+taxCost;
        totalCost=Math.round(totalCost*100/100);

        String[] array=String.valueOf(totalCost).split("\\.");
        int number1=Integer.valueOf(array[1]);
        int number2=Integer.valueOf(array[0]);
        if(number1>50){
            System.out.println(number2+1);
        }else {

            if (number1 <= 50) {
                System.out.println(number2);
            }
        }

    }

    public static void main(String[] args) {
        double meal_cost=15.50;
        int tip_percent=15;
        int tax_percent=10;
        solve(meal_cost,tip_percent,tax_percent);
    }
}
