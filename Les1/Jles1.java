public class Jles1 {
    static public void main(String[] args) {
        int[] arr = {1,1,0,1,1,1};
        System.out.print(countNumberOne(arr));
    }
public static int countNumberOne(int[] arr) {
        int count = 0;
        int max = 0;
        for (int arrEl: arr){
        if (arrEl == 0){
        count = 0;
        }
        else{
        count++;
        }
        if (max <= count){
        max = count;
        }
        }
        return max;
        }
}
