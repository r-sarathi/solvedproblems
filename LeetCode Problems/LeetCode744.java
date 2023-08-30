//744. Find Smallest Letter Greater Than Target
public class LeetCode744 {
    public static void main(String[] args) {
        char[] letters = {'c', 'f', 'g'};
        char target = 'a';
        char[] letters2 = {'x', 'x', 'y', 'y'};
        System.out.println(BinarySearch(letters, target));
        System.out.println(BinarySearch(letters, 'c'));
        System.out.println(BinarySearch(letters2, 'z'));
    }
    public static char BinarySearch(char[] letters, char target) {
        int start = 0;
        int end = letters.length-1;
        while(start <= end) {
            int mid = (start + end) / 2;
            if(target < letters[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return letters[start % letters.length];
    }
}
