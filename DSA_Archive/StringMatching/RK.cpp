#include<iostream>
#include<vector>
using namespace std;

const int d = 256;
const int q = 101;

void rk(string t, string p, vector<int> &matches, vector<int> &spurious) {
    int n = t.length();
    int m = p.length();

    if (m > n) return; // Edge case: pattern longer than text

    int h = 1, phash = 0, thash = 0;

    // Compute h = d^(m-1) % q
    for (int i = 0; i < m - 1; i++) {
        h = (d * h) % q;
    }

    // Compute initial hash values for pattern and text
    for (int i = 0; i < m; i++) {
        thash = (d * thash + t[i]) % q;
        phash = (d * phash + p[i]) % q;  // Fixed line
    }

    // Slide pattern over text
    for (int s = 0; s <= n - m; s++) {
        // Check if hashes match
        if (thash == phash) {
            if (t.substr(s, m) == p) {
                matches.push_back(s);  // True match
            } else {
                spurious.push_back(s); // False match (hash collision)
            }
        }

        // Compute rolling hash for next window
        if (s < n - m) {
            thash = (d * (thash - t[s] * h) + t[s + m]) % q;
            if (thash < 0) thash += q; // Ensure non-negative hash
        }
    }
}
