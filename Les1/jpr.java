public class jpr {
    public static void main(String[] args) {
        int count=0;
        int mona=0;
        for(int i = 2; i <= 1000; i++)
        {
            for (int j = 2; j < i; j++) {
                if (i % j != 0) 
                count++;
                }
        if (count==i-2){
            System.out.printf("prime number: %d\n", i);
            mona++;
            }
            count=0;
 }
        
     }
}
