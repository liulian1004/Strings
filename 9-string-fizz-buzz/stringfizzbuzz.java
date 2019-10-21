public class Solution {
    /**
     * @param n: An integer
     * @return: A list of strings.
     */
    public List<String> fizzBuzz(int n) {
        // write your code here
        List listStrings = new ArrayList();
        for( int i = 1 ; i <= n ; i++ ) {
            if (i % 3 == 0 && i % 5 == 0) {
            listStrings.add("fizz buzz");
            } else if (i % 3 == 0) {
            listStrings.add("fizz");
            } else if (i % 5 == 0) {
            listStrings.add("buzz");
            }else {
            listStrings.add(""+i+"");}
    }
    return listStrings;
 }
}
