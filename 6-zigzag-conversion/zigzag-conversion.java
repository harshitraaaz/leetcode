class Solution {
    public String convert(String s, int numRows) {
        if(numRows == 1) {
            return s;
        }

        StringBuilder result = new StringBuilder();
        int n = s.length();
        int cycle = 2 * numRows - 2;

        for(int row = 0; row < numRows; row++){

            for (int i = row; i < n; i += cycle) {
                result.append(s.charAt(i));

                int second = i + cycle - 2 * row;

                if (row != 0 && row != numRows - 1 && second < n) {


                    result.append(s.charAt(second));
                }
            }
        }
        return result.toString();
    }
}
        
    
