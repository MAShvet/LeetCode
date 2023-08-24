package Easy;

import java.util.*;

public class SummaryRanges_228
{
    public List<String> summaryRanges (int[] nums)
    {
        List<String> list = new ArrayList<>();
        if (nums.length == 1)
        {
            list.add(String.valueOf(nums[0]));
            return list;
        }
        for (int i = 0; i < nums.length; i++)
        {
            int min = nums[i];
            while (i + 1 < nums.length && nums[i + 1] == nums[i] + 1)
            {
                i++;
            }
            if (min != nums[i])
            {
                list.add(min + "->" + nums[i]);
            }
            else
            {
                list.add(min + "");
            }
        }
        return list;
    }
}
