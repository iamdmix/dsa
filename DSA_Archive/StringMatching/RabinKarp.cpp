/*
Given two strings (T1 and T2) and their respective patterns (P1 and P2),
implement the Rabin-Karp algorithm to find:
1. All exact matches of P1 in T1 and P2 in T2.
2. All spurious hits where the hash matched but the substring didn’t.
3. The intersection of exact match positions from both strings.

Example:
Input:
    T1 = "abcabcabc", P1 = "abc"
    T2 = "abcababc", P2 = "abc"

Output:
    Exact Matches in T1: 0 3 6
    Exact Matches in T2: 0 4
    Common Matches: 0
    Spurious Hits in T1: 
    Spurious Hits in T2: 

Write the code to solve this problem.
*/


#include<iostream>
#include<vector>
using namespace std;

const int d = 256;
const int q = 101;

void RabinKarp(string t , string p, vector<int>&matches, vector<int>&spurious){
    int n = t.length(), m = p.length();
    int h=1, phash = 0, thash=0;

    //Compute hash
    for(int i=0; i<m-1; i++){
        h = (h * d) % q;
    }


    //Compute inital hash values
    for(int i=0; i<m; i++){
        phash = (d * phash +p[i]) % q;
        thash = (d * thash +t[i]) % q;
    }

    //Slide over pattern text
    for(int s=0; s<=n-m; s++){
        if(phash == thash){
            if(t.substr(s,m) == p){
                matches.push_back(s);
            } else{
                spurious.push_back(s);
            }
        }

        if(s<n-m){
            thash = (d * (thash - t[s] * h) + t[s + m]) % q;
            if(thash<0) thash +=q;
        }
    }
}

vector<int> findIntersection(vector<int>& list1, vector<int>& list2) {
    vector<int> intersection;
    for (int i = 0; i < list1.size(); i++) {
        for (int j = 0; j < list2.size(); j++) {
            if (list1[i] == list2[j]) {
                intersection.push_back(list1[i]);
                break;  // Avoid duplicate insertions
            }
        }
    }
    return intersection;
}


int main() {
    string T1, P1, T2, P2;
    cout << "Enter T1: "; cin >> T1;
    cout << "Enter P1: "; cin >> P1;
    cout << "Enter T2: "; cin >> T2;
    cout << "Enter P2: "; cin >> P2;

    vector<int> matches1, spurious1, matches2, spurious2;

    // Run Rabin-Karp for both text-pattern pairs
    rabinKarp(T1, P1, matches1, spurious1);
    rabinKarp(T2, P2, matches2, spurious2);

    // Find common exact matches
    vector<int> commonMatches = findIntersection(matches1, matches2);

    // Output results
    cout << "Exact Matches in T1: ";
    for (int m : matches1) cout << m << " ";
    cout << endl;

    cout << "Exact Matches in T2: ";
    for (int m : matches2) cout << m << " ";
    cout << endl;

    cout << "Common Matches: ";
    for (int cm : commonMatches) cout << cm << " ";
    cout << endl;

    cout << "Spurious Hits in T1: ";
    for (int s : spurious1) cout << s << " ";
    cout << endl;

    cout << "Spurious Hits in T2: ";
    for (int s : spurious2) cout << s << " ";
    cout << endl;

    return 0;
}
