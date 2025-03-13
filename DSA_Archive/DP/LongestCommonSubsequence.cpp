//Given two strings, str1 and str2, find the length of the longest common subsequence (LCS) between them using dynamic programming.
#include<iostream>
#include<vector>
using namespace std;

int lcs(string s1, string s2, int **arr){
    

    return 1;
}

int main(){
    string s1, s2;
    cout<<"Enter the first string: ";
    cin>>s1;
    cout<<"Enter the second string: ";
    cin>>s2;

    int arr[s1.size()+1][s2.size()+1];
    for(int i=0; i<s1.size()+1; i++){
        arr[i][s1.size()+1] =0;
    }
    for(int i=0; i<s2.size()+1; i++){
        arr[s2.size()+1][i] =0;
    }
}