package org.example;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindTheDifferenceOfTwoArrays {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {

        Set<Integer> nums1Set = new HashSet<>();
        Set<Integer> nums2Set = new HashSet<>();

        for (int i = 0; i < nums1.length; i++) {
            nums1Set.add(nums1[i]);
        }

        for (int j = 0; j < nums2.length; j++) {
            nums2Set.add(nums2[j]);
        }

        List<Integer> nums1Distinct = new ArrayList<>(nums1Set.size());
        for (var n : nums1Set) {
            if (!nums2Set.contains(n)) {
                nums1Distinct.add(n);
            }
        }

        List<Integer> nums2Distinct = new ArrayList<>(nums2Set.size());
        for (var n : nums2Set) {
            if (!nums1Set.contains(n)) {
                nums2Distinct.add(n);
            }
        }

        return List.of(nums1Distinct, nums2Distinct);
    }
}
