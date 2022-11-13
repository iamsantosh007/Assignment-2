import java.util.Scanner;

public class Subset {
    static boolean isSubset(int arr1[], int arr2[], int m,
                            int n)
    {
        int i = 0;
        int j = 0;
        for (i = 0; i < n; i++) {
            for (j = 0; j < m; j++)
                if (arr2[i] == arr1[j])
                    break;
            if (j == m)
                return false;
        }
        return true;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the array size:-");
        int sizeOfArray=sc.nextInt();
        int[] arr1=new int[sizeOfArray];
        int[] arr2=new int[sizeOfArray];
        int n = arr1.length;
        for(int i=0;i<=n-1;i++){
            System.out.println("enter the firstArray elements");
            arr1[i]=sc.nextInt();
        }
        for(int i=0;i<=n-1;i++){
            System.out.println("enter the SecondArray elements");
            arr2[i]=sc.nextInt();
        }

        int m = arr1.length;

        if (isSubset(arr1, arr2, m, n))
            System.out.print("arr2[] is "
                    + "subset of arr1[] ");
        else
            System.out.print("arr2[] is "
                    + "not a subset of arr1[]");
    }
}
