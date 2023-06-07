public class Permutations
{
    public static void permute(int[] nums)
    {
        generatePermutations(nums, 0);
    }

    private static void generatePermutations(int[] nums, int start)
    {
        if (start == nums.length)
        {
            printArray(nums);
        }
        else
        {
            for (int i = start; i < nums.length; i++)
            {
                swap(nums, start, i);
                generatePermutations(nums, start + 1);
                swap(nums, start, i);
            }
        }
    }

    private static void swap(int[] nums, int i, int j)
    {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    private static void printArray(int[] nums)
    {
        System.out.print("[ ");
        for (int num : nums)
        {
            System.out.print(num + " ");
        }
        System.out.println("]");
    }

    public static void main(String[] args)
    {
        int[] nums = {1, 2, 3};
        permute(nums);
    }
    }

