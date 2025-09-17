public class PracticeProblem {

    public static void main(String args[]) {
        // Test the functions
        System.out.println(lettersToFive("hello lillian", 'l'));  // Should print 10
        System.out.println(lettersToFive("Whatever", 'e'));       // Should print -1
        
        System.out.println(countLetter("hello", 'l'));            // Should print 2
        System.out.println(countLetter("I don't know", 'e'));     // Should print 0
        
        System.out.println(oddSum(2, 6));                         // Should print 8
        System.out.println(oddSum(0, 10));                        // Should print 25
        System.out.println(oddSum(9, 2));                         // Should print 24
    }
    
    public static int lettersToFive(String s, char target) {
        int count = 0;
        int i = 0;
        
        while (i < s.length()) {
            if (s.charAt(i) == target) {
                count++;
                if (count == 5) {
                    return i + 1;
                }
            }
            i++;
        }
        
        return -1;
    }
    
    public static int countLetter(String s, char target) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == target) {
                count++;
            }
        }
        return count;
    }
    
    public static int oddSum(int a, int b) {
        // Figure out which number is smaller and which is bigger
        int start = Math.min(a, b);
        int end = Math.max(a, b);
        
        int total = 0;
        int current = start;
        
        while (current <= end) {
            if (current % 2 == 1) {  // Check if number is odd
                total += current;
            }
            current++;
        }
        
        return total;
    }
}