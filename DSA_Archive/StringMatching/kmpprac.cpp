#include<iostream>
#include<vector>
using namespace std;

void computeLPS(string p, vector<int> &lps){
    int len =0;
    lps[0] = 0;
    int i=1;
    int m = p.length();

    while(i<m){
        if(p[i] == p[len]){
            len++;
            lps[i]= len;
            i++;
        }
        else{
            if(len!=0){
                len = lps[len-1];
            }else{
                lps[i]=0;
                i++;
            }
        }
    }
}


void kmp(string t, string p, vector<int> &matches){
    int n = t.length();
    int m = p.length();

    vector<int> lps(m,0);
    computeLPS(p,lps);

    int i=0, j=0;
    while(i<n){
        if(t[i] == p[j]){
            i++; j++;
        }
        if(j== m){
            matches.push_back(i-j);
            j = lps[j-1];
        }
        else if(i<n && t[i] != p[j]){
            if(j!=0){
                j = lps[j-1];
            }else{
                i++;
            }
        }
    }
}