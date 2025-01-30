class Solution {
    public String finalString(String s) 
    {
        StringBuilder res = new StringBuilder();  // Making resultant string object
        for(int j = 0; j<s.length();j++)        // Iterate through the string
        {
            if(s.charAt(j) == 'i')        // if arriving 'i' in the string the reverse the whole resultant string
            {
                res.reverse();
            }
            else
            {
                res.append(s.charAt(j));  // for any other character just append it to the resultant string
            }
        }
        return res.toString();  // converting stringBuilder to string and at the end return
    }
}
