package doublePointer;

public class SortedSquares
{
	public int[] sortedSquares(int[] nums)
	{
		int left = 0;
		int right = nums.length - 1;

		int[] reusltArray = new int[nums.length];
		int k = nums.length - 1;
		while (k >= 0)
		{
			int leftSqures = nums[left] * nums[left];
			int rightSqures = nums[right] * nums[right];

			if (leftSqures < rightSqures)
			{
				reusltArray[k--] = rightSqures;
				right--;
			}
			else
			{
				reusltArray[k--] = leftSqures;
				left++;
			}

		}

		return reusltArray;
	}

	public static void main(String[] args)
	{
		SortedSquares a = new SortedSquares();

		int[] nums = new int[]{-7, -3, 2, 3, 11};
		for (int i : a.sortedSquares(nums))
		{
			System.out.println(i);
		}
	}
}
