package binarysearch;

public class BinarySearch
{

	public static int search(int[] array, int target)
	{
		return getTargetIndex(array, 0, array.length - 1, target);
	}

	public static int getTargetIndex(int[] array, int srouce, int length, int target)
	{
		if (srouce >= length)
		{
			return -1;
		}

		int mid = (length + srouce) / 2;

		if (array[mid] == target)
		{
			return mid;
		}

		return array[mid] < target ? getTargetIndex(array, mid + 1, length, target) :
				       getTargetIndex(array, srouce, mid - 1, target);
	}

	public static void main(String[] args)
	{
		int[] nums = new int[]{-1, 0, 3, 5, 9, 12};

		System.out.println(search(nums, 9));
	}
}
