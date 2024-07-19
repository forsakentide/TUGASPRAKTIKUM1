package sortCollection;

import java.util.ArrayList;
import java.util.List;

public class RemoveOddNumber
{
    List<Integer> removeAndGetOdds(int[] arr)
    {
        List<Integer> removedOdds = new ArrayList<>();

        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] % 2 != 0)
            {
                removedOdds.add(arr[i]);
                arr[i] = 0; // Assuming 0 is not a valid number in the array
            }
        }

        System.out.println("Odd numbers removed:");
        for (int odd : removedOdds) {
            System.out.print(odd + " ");
        }
        System.out.println();

        return removedOdds;
    }

    public <integer> List<integer> removeAndGetOdd(int[] arr){
        return List.of();
    }
}
