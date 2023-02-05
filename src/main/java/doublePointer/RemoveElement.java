package doublePointer;

public class RemoveElement
{
	public int removeElement(int[] nums, int val)
	{
		int slowIndex = 0;

		for (int i = 0; i < nums.length; i++)
		{
			if (nums[i] != val)
			{
				nums[slowIndex] = nums[i];
				slowIndex++;
			}

		}

		return slowIndex;
	}


	public static void main(String[] args)
	{
		RemoveElement removeElement = new RemoveElement();

		int[] nums = new int[]{0, 1, 2, 2, 3, 0, 4, 2};

		System.out.println(removeElement.removeElement(nums, 2));

	}
}
