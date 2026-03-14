#include <iostream>
#include <cmath>

using namespace std;

int* eratos(int N){
    int number=N;
    int *num=new int[number+1];
    
    for (int i=0;i<=(number);i++){
        num[i]=1;
    }

    for (int i=2;i<=sqrt(number);i++){
        if(num[i]==0) continue;
        for (int j=i+i;j<=number;j+=i){
            num[j]=0;
        }
    }

    
    return num;
}

int main(){
    int n,cnt,count=0;
    cin>>count;

    while(count--){
        cnt=0;
        cin>>n;
        int* arr=eratos(n);

        for(int i=2;i<=n/2;i++){
            int a=i;
            int b=n-i;
            if(arr[a]&&arr[b]){
                cnt++;
            }
        }
        cout<<cnt<<"\n";
        delete[] arr;

    }
    return 0;
}
