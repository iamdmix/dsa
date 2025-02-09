#include <iostream>
#include <vector>

using namespace std;

int bs(vector<int>& arr, int s, int e, int t) {
    if (s <= e) {
        int mid = s + (e - s) / 2;

        if (arr[mid] == t) {
            return mid;
        } 
        else if (arr[mid] > t) {
            return bs(arr, s, mid - 1, t);
        } 
        else {
            return bs(arr, mid + 1, e, t);
        }
    }
    return -1; // Not found
}

int main() {
    int n, t;
    cout << "Enter the size of the array: ";
    cin >> n;  // Read size first

    vector<int> arr(n);  // Now declare the vector with the correct size

    cout << "Enter the elements: ";
    for (int i = 0; i < n; i++) {
        cin >> arr[i]; // Input elements
    }

    cout << "Enter the target element: ";
    cin >> t;

    int result = bs(arr, 0, n - 1, t);
    
    if (result != -1)
        cout << "Element found at index " << result << endl;
    else
        cout << "Element not found" << endl;

    return 0;
}
