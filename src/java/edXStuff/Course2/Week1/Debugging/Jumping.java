package edXStuff.Course2.Week1.Debugging;

public class Jumping {
    public static void main(String[] args) {
        int t = (int) (Math.random() * 100) + 1;
        System.out.println("The number is: "+t);
        int result = 1;
        for(int i =t/2; i>1; i--){
            if(t%i==0) {
                result = i;
                i = 1;
            }
        }
        System.out.println("The greatest divisor is: "+result);
    }
}
