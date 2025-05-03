//Given two strings, str1 and str2, find the length of the longest common subsequence (LCS) between them using dynamic programming.
#include<iostream>
#include<vector>
using namespace std;

int lcs(string s1, string s2, int **dp) {
    int m = s1.length();
    int n = s2.length();
    
    // Initialize dp table
    for(int i = 0; i <= m; i++) {
        dp[i][0] = 0;
    }
    for(int j = 0; j <= n; j++) {
        dp[0][j] = 0;
    }
    
    // Fill dp table
    for(int i = 1; i <= m; i++) {
        for(int j = 1; j <= n; j++) {
            if(s1[i-1] == s2[j-1]) {
                dp[i][j] = dp[i-1][j-1] + 1;
            } else {
                dp[i][j] = max(dp[i-1][j], dp[i][j-1]);
            }
        }
    }
    
    return dp[m][n];
}

int main() {
    string s1, s2;
    cout << "Enter the first string: ";
    cin >> s1;
    cout << "Enter the second string: ";
    cin >> s2;
    
    // Create dynamic 2D array
    int **dp = new int*[s1.length() + 1];
    for(int i = 0; i <= s1.length(); i++) {
        dp[i] = new int[s2.length() + 1];
    }
    
    int result = lcs(s1, s2, dp);
    cout << "Length of Longest Common Subsequence is: " << result << endl;
    
    // Free allocated memory
    for(int i = 0; i <= s1.length(); i++) {
        delete[] dp[i];
    }
    delete[] dp;
    
    return 0;
}