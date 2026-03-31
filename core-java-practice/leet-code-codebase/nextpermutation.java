
public class nextpermutation {

    public static void swap(int num[], int i, int j) {
        int temp = num[i];
        num[i] = num[j];
        num[j] = temp;
    }

    public static void reverse(int start, int[] num) {
        int end = num.length - 1;
        int i = start;
        while (i < end) {
            swap(num, i, end);
            i++;
            end--;
        }
    }

    public static void nextPermutation(int[] nums) {
        int idx1 = -1;
        int idx2 = -1;
        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                idx1 = i;
                break;
            }
        }
        if (idx1 == -1) {
            reverse(0, nums);
        } else {
            for (int i = nums.length - 1; i >= 0; i--) {
                if (nums[i] > nums[idx1]) {
                    idx2 = i;
                    break;
                }
            }
            swap(nums, idx1, idx2);
            reverse(idx1 + 1, nums);
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        nextPermutation(nums);
        System.out.print("Output: ");
        for (int n : nums) {
            System.out.print(n + " ");
        }
    }
}
