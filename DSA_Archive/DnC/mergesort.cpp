#include <iostream>
#include <vector>

using namespace std;

void merge(vector<int>& arr, int s, int mid, int e) {
    int n1 = mid - s + 1;
    int n2 = e - mid;

    vector<int> arr1(n1);
    vector<int> arr2(n2);

    // Copy data to temporary arrays
    for (int i = 0; i < n1; i++)
        arr1[i] = arr[s + i];
    for (int j = 0; j < n2; j++)
        arr2[j] = arr[mid + 1 + j];

    int i = 0, j = 0, k = s;

    // Merge the two sorted subarrays
    while (i < n1 && j < n2) {
        if (arr1[i] <= arr2[j]) {
            arr[k] = arr1[i];
            i++;
        } else {
            arr[k] = arr2[j];
            j++;
        }
        k++;
    }

    // Copy remaining elements of arr1, if any
    while (i < n1) {
        arr[k] = arr1[i];
        i++;
        k++;
    }

    // Copy remaining elements of arr2, if any
    while (j < n2) {
        arr[k] = arr2[j];
        j++;
        k++;
    }
}

void mergesort(vector<int>& arr, int s, int e) {
    if (s < e) {
        int mid = s + (e - s) / 2;
        mergesort(arr, s, mid);
        mergesort(arr, mid + 1, e);
        merge(arr, s, mid, e);
    }
}

int main() {
    int n;
    cout << "Enter the number of elements: ";
    cin >> n;

    vector<int> arr(n);
    cout << "Enter the elements: ";
    for (int i = 0; i < n; i++) {
        cin >> arr[i];
    }

    mergesort(arr, 0, n - 1);

    cout << "Sorted array: ";
    for (int i = 0; i < n; i++) {
        cout << arr[i] << " ";
    }
    cout << endl;

    return 0;
}
