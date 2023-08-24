package Easy;

public class FindTheMaximumDivisibilityScore_2644
{
    public int maxDivScore (int[] nums, int[] divisors)
    {
        int[] valueDiv = new int[divisors.length];

        int max = 0;
        for (int i = 0; i < divisors.length; i++)
        {
            int count = 0;
            for (int j = 0; j < nums.length; j++)
            {
                if (nums[j] % divisors[i] == 0)
                {
                    count++;
                }
            }
            if (max < count)
            {
                max = count;
            }
            valueDiv[i] = count;
        }
        int value = Integer.MAX_VALUE;
        for (int i = 0; i < valueDiv.length; i++)
        {
            if (max == valueDiv[i])
            {
                value = Math.min(value, divisors[i]);
            }
        }
        return value;
    }
}
