
//#include<iostream>
#include<bits/stdc++.h>
using namespace std;
int main()
{
    int n,x;
    cin>>n;
    int arr[n];
    for(int i=0;i<n;i++)
    {
        cin>>arr[i];
    }
    for(int i=0;i<n;i++)
    {
    for(int j=i+1;j <n;j++)
    {
        if(arr[i<arr[j])
        {
            x=arr[i];
            arr[i]=arr[j];
            arr[j]=x;


        }
    }
    cout<<"\nsecond largest element:"<<" "<<x<<'\n';
}
