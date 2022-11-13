import java.util.Arrays;
import java.util.Scanner;

public class duplicate {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        boolean flag=false;
        int[] arr=new int[10];
        for(int i=0;i<arr.length;i++){
            System.out.print("enter the element in "+ (i+1) +" position:-");
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        for(int i=arr[0];i<=arr[arr.length-1];i++){
            int count=0;
            for(int j=0;j<arr.length;j++){
                if(i==arr[j]){
                    count++;
                }
            }
            if(count>=2){
                System.out.println("The element "+i+" is repeated "+count+" times");
                flag=true;
            }
        }
        if(flag==false){
            System.out.println("no duplicate element is find");
        }
    }
}
