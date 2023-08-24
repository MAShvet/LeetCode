package Easy;

public class AverageValueOfEvenNumbersThatAreDivisibleByThree_2455
{
    public int averageValue (int[] nums)
    {
        int sum = 0;
        int amount = 0;
        for (int i = 0; i < nums.length; i++)
        {
            if (nums[i] % 3 == 0 && nums[i] % 2 == 0)
            {
                sum += nums[i];
                amount++;
            }
        }
        if (amount == 0)
        {
            return 0;
        }
        else
        {
            return Math.round(sum / amount);
        }
    }
}
