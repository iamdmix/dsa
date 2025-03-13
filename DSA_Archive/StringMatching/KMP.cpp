#include <iostream>
#include <vector>
using namespace std;

// Function to compute the Longest Prefix Suffix (LPS) array
void computeLPS(string pattern, vector<int>& lps) {
    int m = pattern.length();
    int len = 0;  // Length of the previous longest prefix suffix
    lps[0] = 0;   // LPS[0] is always 0
    int i = 1;

    while (i < m) {
        if (pattern[i] == pattern[len]) {
            len++;
            lps[i] = len;
            i++;
        } else {
            if (len != 0) {
                len = lps[len - 1]; // Try the previous LPS value
            } else {
                lps[i] = 0; // No prefix suffix match
                i++;
            }
        }
    }
}

// KMP Algorithm
void KMP(string text, string pattern, vector<int>& matches) {
    int n = text.length();
    int m = pattern.length();
    
    vector<int> lps(m);  // LPS array
    computeLPS(pattern, lps);  // Compute the LPS array

    int i = 0, j = 0; // i for text, j for pattern

    while (i < n) {
        if (text[i] == pattern[j]) {
            i++;
            j++;
        }

        if (j == m) { // Full pattern matched
            matches.push_back(i - j);
            j = lps[j - 1]; // Continue searching for next match
        } else if (i < n && text[i] != pattern[j]) {
            if (j != 0) {
                j = lps[j - 1]; // Use LPS to avoid unnecessary comparisons
            } else {
                i++; // Move text pointer if no LPS fallback
            }
        }
    }
}

int main() {
    string T, P;
    cout << "Enter Text: "; cin >> T;
    cout << "Enter Pattern: "; cin >> P;

    vector<int> matches;
    KMP(T, P, matches);

    cout << "Pattern found at indices: ";
    for (int index : matches) {
        cout << index << " ";
    }
    cout << endl;

    return 0;
}
