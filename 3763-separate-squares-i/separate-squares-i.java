class Solution {
    public double separateSquares(int[][] squares) {
        double low = Double.MAX_VALUE;
        double high = Double.MIN_VALUE;
        double totalArea = 0;

        for (int[] s : squares) {
            double y = s[1];
            double side = s[2];
            low = Math.min(low, y);
            high = Math.max(high, y + side);
            totalArea += side * side;
        }

        double half = totalArea / 2.0;

        for (int i = 0; i < 100; i++) { // precision loop
            double mid = (low + high) / 2.0;
            double areaBelow = 0;

            for (int[] s : squares) {
                double y = s[1];
                double side = s[2];
                double top = y + side;

                if (top <= mid) {
                    areaBelow += side * side;
                } else if (y < mid) {
                    areaBelow += side * (mid - y);
                }
            }

            if (areaBelow < half) {
                low = mid;
            } else {
                high = mid;
            }
        }
        return low;
    }
}