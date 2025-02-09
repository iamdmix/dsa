#include<iostream>
#include<vector>
using namespace std;

int partition(vector<int>& arr, int s, int e) {
    int pivot = arr[e];
    int i = s - 1;
    for (int j = s; j <= e - 1; j++) {
        if (arr[j] <= pivot) {
            i++;
            swap(arr[i], arr[j]);
        }
    }
    swap(arr[i + 1], arr[e]);
    return i + 1;
}

int kthLargest(vector<int>& arr, int s, int e, int k) {
    if (s <= e) {
        int pi = partition(arr, s, e);  // Get the pivot index
        
        // If the pivot index is the k-1 (zero-based), return the element at that index
        if (pi == k - 1) return arr[pi];
        
        // If the pivot index is greater than k-1, search in the left subarray
        if (pi > k - 1) return kthLargest(arr, s, pi - 1, k);
        
        // Otherwise, search in the right subarray
        return kthLargest(arr, pi + 1, e, k);
    }
    return -1;  // This case shouldn't occur if k is valid
}

int main() {
    int n;
    cout << "Enter the number of elements: ";
    cin >> n;
    
    cout << "Enter the elements: ";
    vector<int> arr(n);
    for (int i = 0; i < n; i++) {
        cin >> arr[i];
    }
    
    int k;
    cout << "Enter the value of k: ";
    cin >> k;

    cout << "The " << k << "th largest element is: " << kthLargest(arr, 0, n - 1, k) << endl;

    return 0;
}
