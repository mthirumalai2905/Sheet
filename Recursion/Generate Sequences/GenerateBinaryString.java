class Solution {
  public static List<String> generateBinaryStrings(int n) {
    // code here
    ArrayList<String> res = new ArrayList<>();
    solve(n, "", res);
    return res;
  }
  public static void solve(int n, String curr, List<String> res){
      if(curr.length() == n){
          res.add(curr);
          return;
      }
      
      solve(n, curr + "0", res);
      if(curr.isEmpty() || curr.charAt(curr.length() - 1) != '1'){
          solve(n , curr + "1", res);
      }
  }
}
