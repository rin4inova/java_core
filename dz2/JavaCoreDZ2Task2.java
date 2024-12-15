package dz2;
// Написать функцию, возвращающую разницу между самым большим и самым маленьким
// элементами переданного не пустого массива.
public class JavaCoreDZ2Task2 {
    public static void main(String[] args) {
        int[] nums1 = {2,1,2,3,4};
        int[] nums2 = {2,2,0};
        int[] nums3 = {1,3,5};
        System.out.println(maxMinDifference(nums1));
        System.out.println(maxMinDifference(nums2));
        System.out.println(maxMinDifference(nums3));
    }

    public static int maxMinDifference(int[] nums) {
        int min = nums[0];
        int max = nums[0];

        for (int num : nums) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }

        return max - min;
    }
}

