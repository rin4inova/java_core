package dz2;
// Написать метод, возвращающий количество чётных элементов массива.

// countEvens([2, 1, 2, 3, 4]) → 3
// countEvens([2, 2, 0]) → 3
// countEvens([1, 3, 5]) → 0

public class JavaCoreDZ2Task1 {

    public static void main(String[] args) {
        int[] nums1 = {2,1,2,3,4};
        int[] nums2 = {2,2,0};
        int[] nums3 = {1,3,5};

        System.out.println(countEvens(nums1));
        System.out.println(countEvens(nums2));
        System.out.println(countEvens(nums3));
    }
    public static int countEvens(int[] nums) {
        int countEvenNums = 0;
        for (int num : nums) {
            if (num % 2 == 0) {
                countEvenNums++;
            }
        }
        return countEvenNums;
    }
}
