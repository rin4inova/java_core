package dz2;

// Написать функцию, возвращающую истину, если в переданном массиве
// есть два соседних элемента, с нулевым значением.

public class JavaCoreDZ2Task3 {
    public static void main(String[] args) {
        int[] nums1 = {2,1,2,3,4};
        int[] nums2 = {2,0,0};
        int[] nums3 = {1,3,5};
        System.out.println(hasTwoConsecutiveZeros(nums1));
        System.out.println(hasTwoConsecutiveZeros(nums2));
        System.out.println(hasTwoConsecutiveZeros(nums3));

    }
    public static boolean hasTwoConsecutiveZeros(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 0 && nums[i + 1] == 0) {
                return true;
            }
        }
        return false;
    }
}
