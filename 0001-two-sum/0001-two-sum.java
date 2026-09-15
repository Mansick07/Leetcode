class Solution {
    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();
        // Stores each number and its index for quick lookup

        for (int i = 0; i < nums.length; i++) {
            // Visit each element one by one

            int complement = target - nums[i];
            // Find the number needed to reach the target

            if (map.containsKey(complement)) {
                // Check if the required number was already seen

                return new int[] {map.get(complement), i};
                // Return the indices of the two numbers
            }

            map.put(nums[i], i);
            // Store the current number and its index
        }

        return new int[] {};
        // Return empty array if no pair is found
    }
}
