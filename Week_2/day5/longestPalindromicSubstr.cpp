bool isPalindromic(string str) {
    int n = str.size();
    int i = 0;
    int j = n-1;
    while(i<=j){
        if(str[i]!=str[j]) return false ;
        i++;
        j--;
    }
    return true;
}



class Solution {
public:
    string longestPalindrome(string s) {
        int n = s.size();
        string ans="";
        int maxLen = -1;
        for(int i = 0 ; i<n ; i++ ) {
            string st = "";
            int len = 0;
            for(int j = i; j<n;j++){
                st+=s[j];
                bool val = isPalindromic(st);
                if(val== true) {
                    len = st.size();
                    if (len > maxLen) ans = st;
                    maxLen = len;
                }
            }
        }
        return ans ;
    }
};