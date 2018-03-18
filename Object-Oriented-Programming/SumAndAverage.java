public class SumAndAverage {
    public static void main(String[] args){
        int NumOfNums = 0;
        int Sum = 0;
        for(int i = 1;i <= 100;i++){
            if( i % 2 == 1){
                Sum += i;
                NumOfNums++;
            }
        }
        System.out.println("The sum of the odd numbers from 1 to 100 is " + Sum + ", and their average is " + (Sum/NumOfNums) + ".");

        Sum = 0;
        NumOfNums = 0;
        int j = 1;
        while(j <= 100){
            if(j % 7 == 0){
                Sum += j;
                NumOfNums++;
            }
            j++;
        }
        System.out.println("The sum of the numbers from 1 to 100 that are divisible by 7 is " + Sum + ", and their average is " + (Sum/NumOfNums) + ".");

        Sum = 0;
        int k = 1;
        do{
            Sum += k * k;
            k++;
        }while(k <= 100);
        System.out.println("The sum of the squares of all the numbers from 1 to 100 is " + Sum + ".");
    }
}
