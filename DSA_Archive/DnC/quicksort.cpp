//Implementing Quick Sort in cpp
#include<iostream>
#include<vector>
using namespace std;

int partition(vector<int>&arr, int s, int e){
    int pivot = arr[e];
    int i = s -1;
    for(int j=s;j<=e-1;j++){
        if(arr[j]<=pivot){
            i++;
            swap(arr[i],arr[j]);
        }
    }
    swap(arr[i+1],arr[e]);
    return(i+1);
}
void quicksort(vector<int>&arr, int s, int e){
    if(s<e){
        int pi = partition(arr,s,e);
        quicksort(arr, s, pi-1);
        quicksort(arr, pi+1,e);
    }
}
int main(){
    int n;
    cout<<"Enter the number of elements";
    cin>>n;
    vector<int>arr(n);
    for(int i=0; i<n; i++){
        cin>>arr[i];
    }
    quicksort(arr, 0, n-1);
    for(int i=0; i<n; i++){
        cout<<arr[i];
    }
    return 0;

}