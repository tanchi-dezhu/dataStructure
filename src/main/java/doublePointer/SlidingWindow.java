package doublePointer;

public class SlidingWindow
{
	public int minSubArrayLen(int target, int[] nums)
	{
		int left = 0;
		int sum = 0;

		int result = Integer.MAX_VALUE;

		for (int right = 0; right < nums.length; right++)
		{
			sum += nums[right];
			while (sum >= target)
			{
				result = Math.min(result, right - left + 1);
				sum -= nums[left];
				left++;
			}
		}

		return result == Integer.MAX_VALUE ? 0 : result;
	}


	public static void main(String[] args)
	{
		SlidingWindow a = new SlidingWindow();

		int[] nums = new int[]{2, 3, 1, 2, 4, 3};
		System.out.println(a.minSubArrayLen(5, nums));
	}
}
