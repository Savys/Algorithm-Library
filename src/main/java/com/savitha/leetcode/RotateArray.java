package com.savitha.leetcode;

import java.util.Arrays;

public class RotateArray {
  public void rotate(int[] nums, int k) {
    int n = 7;
    //int newnums[] = { 1, 2, 3, 4, 5, 6, 7 };

    int start = k + 1;// 4
    int end = start + 7;
    int i = 0;
    int[] newarray = new int[nums.length + nums.length];

    for (i = 0; i < nums.length; i++) {
      newarray[i] = nums[i];
    }
    //System.out.println("i:" + i);
    int index = i;
    i = 0;
    for (int z = index; z < (nums.length * 2); z++) {

      newarray[z] = nums[i];
      i++;
    }
    /*
     * for (int j = k; j < newnums.length+k; j++) {
     * System.out.println(newarray[j]); }
     */
    // int source_arr[], sourcePos, dest_arr[], destPos, len;
    System.arraycopy(newarray, 0, nums, 0, nums.length);
    System.out.println(Arrays.toString(nums));
  }

  public static void main(String[] args) {

    int input[] = { 1, 2, 3, 4, 5, 6, 7 };

    int k = 3;
    RotateArray ra = new RotateArray();
    ra.rotate(input, k);

  }

}
