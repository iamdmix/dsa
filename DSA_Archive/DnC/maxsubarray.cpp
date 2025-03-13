//Find the largest contiguous subarray sum in cpp
#include<iostream>
#include<vector>
using namespace std;

int cross(vector<int>arr, int s, int mid, int e){
    int left = INT_MIN;
    int right = INT_MIN;
    int ls = 0;
    int rs = 0;
    for(int i=mid; i>=0;i--){
        ls+=arr[i];
        if(ls>left){
            left = ls;
        }
    }
    for(int i=mid+1; i<=e; i++){
        rs+=arr[i];
        if(rs>right){
            right = rs;
        }
    }
    return left+right;
}
int msa(vector<int>arr, int s, int e){
    if(s==e){
        return arr[e];
    }
    int mid = s + (e-s)/2;
    int l = msa(arr, s, mid);
    int r = msa(arr, mid+1, e);
    int c = cross(arr, s, mid, e);
    if(l>r && l>c){
        return l;
    }
    if(r>l && r>c){
        return r;
    }
    return c;
}
int main(){
    int n;
    cout<<"Enter the length of the array: ";
    cin>>n;
    vector<int> arr(n);
    for(int i=0;i<n;i++){
        cin>>arr[i];
    }
    cout<<msa(arr,0,n-1);
    return 0;
}