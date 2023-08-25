package Easy;

import java.util.HashSet;

public class IntersectionOfTwoArrays_349
{
    public int[] intersection (int[] nums1, int[] nums2)
    {
        HashSet<Integer> set = new HashSet<>();
        for (int num1 : nums1)
        {
            if (!set.contains(num1))
            {
                for (int num2 : nums2)
                {
                    if (num1 == num2)
                    {
                        set.add(num1);
                        break;
                    }
                }
            }
        }
        int[] arr = new int[set.size()];
        int i = 0;
        for (int num : set)
        {
            arr[i++] = num;
        }
        return arr;
    }
}
