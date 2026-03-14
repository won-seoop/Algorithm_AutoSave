#include <iostream>
#include <deque>
#include <vector>
#include <numeric>
#include <map>
#include <algorithm>
#include <cmath>
#include <limits.h>
#include <stdio.h>

using namespace std;

long long factorial(long long i)
{
    if (i==0){
        return 1;
    }
    if (i==1){
        return 1;
    }
    return i*factorial(i-1);
}

void backjoon()
{
    long long N;
    cin>>N;
    cout<<(factorial(N));
    
}

void test()
{

}

int main()
{

    // bollon();
    backjoon();
    //test();
    return 0;
}