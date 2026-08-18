class Solution {
    public static int minEatingSpeed(int[] piles, int h) {
    int low = 1;
    int high = 0;

    for (int banana : piles) {
        if (banana > high) {
            high = banana;
        }
    }

    while (low < high) {
        int mid = low + (high - low) / 2;
        long hours = 0;

        for (int banana : piles) {
            hours += (banana + (long) mid - 1) / mid;
        }

        if (hours <= h) {
            high = mid;
        } else {
            low = mid + 1;
        }
    }

    return low;
}
}