#include<bits/stdc++.h>
using namespace std;
int main()
{
    int tin;
    cin>>tin;
    while(tin--)
    {
        int xin,ain,bin;
        cin>>xin>>ain>>bin;
        int tp=0;
        tp=ain+(100-xin)*bin;   
        cout<<tp*10<<endl;
    }
}
