public class TimeTable {
    public static void main(String[] args){
        for(int i = -1;i <= 9;i++){
            for(int j = -1;j <= 10;j++){
                if(i == -1){
                    if(j == -1)
                        System.out.print("*");
                    if(j == 0)
                        System.out.print(" |");
                    if(j > 0 && j < 10)
                        System.out.print("\t" + j);
                    if(j == 10)
                        System.out.println();
                }
                if(i == 0){
                    if(j == -1)
                        System.out.print("-");
                    if(j == 0)
                        System.out.print("--");
                    if(j > 0 && j < 10)
                        System.out.print("----");
                    if(j == 10)
                        System.out.println();
                }
                if(i >= 1){
                    if(j == -1)
                        System.out.print(i);
                    if(j == 0)
                        System.out.print(" |");
                    if(j > 0 && j < 10)
                        System.out.print("\t" + (i * j));
                    if(j == 10)
                        System.out.println();
                }
            }
        }
    }
}
