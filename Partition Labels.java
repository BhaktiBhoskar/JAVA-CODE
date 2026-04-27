class Solution {
   
    public List<Integer> partitionLabels(String s) {
        // Step 1: Store the last occurrence of each character
        int[] lastOccurrence = new int[26]; // Since the input is lowercase English letters
        for (int i = 0; i < s.length(); i++) {
            lastOccurrence[s.charAt(i) - 'a'] = i;
        }

        // Step 2: Iterate through the string to determine partitions
        List<Integer> result = new ArrayList<>();
        int partitionEnd = 0;
        int partitionStart = 0;

        for (int i = 0; i < s.length(); i++) {
            partitionEnd = Math.max(partitionEnd, lastOccurrence[s.charAt(i) - 'a']);

            // When we reach the end of the current partition
            if (i == partitionEnd) {
                result.add(partitionEnd - partitionStart + 1);
                partitionStart = i + 1; // Move to the next partition
            }
        }

        return result;
    }
    
    
}
