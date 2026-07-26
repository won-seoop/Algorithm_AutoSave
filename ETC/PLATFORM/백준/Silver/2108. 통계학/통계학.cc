#include <iostream>
#include <deque>
#include <vector>
#include <numeric>
#include <map>
#include <algorithm>
#include <cmath>
#include <limits.h>


using namespace std;

void PrintV(vector<int> &v)
{
    for (int i : v)
    {
        cout << i <<endl;
    }
}
void backjoon()
{
    int N;
    int num;

    cin >> N;

    vector<int> nums(N);

    for (int &i : nums)
    {
        cin >> i;
    }

    // 1 : 산술평균
    
    int mean = round(double(accumulate(nums.begin(), nums.end(), 0)) / N);
    if(mean>=1){
        mean = ceil(mean);
    }
    else if( mean<=-1){
        mean = floor(mean);
    }
    else if (-1<mean &&mean < 1){
        mean=0;
    }
    cout << mean << "\n";

    // 2 : 중앙값
    sort(nums.begin(), nums.end());

     cout<<nums.at(N/2)<<"\n";
    // PrintV(nums);

    // 3 : 최빈값
    map<int, int> m;
    for (int i : nums)
    {
        m[i]++;
    }

    // for (auto k : m){
    //     cout<<"("<<k.first<<", "<<k.second<<"), ";
    // }
    int max_cnt = 0;

    vector<int> a;
    for (auto pair : m)
    {
        if (max_cnt < pair.second)
        {
            max_cnt = pair.second;
            a.clear();
            a.push_back(pair.first);
        }
        else if (pair.second == max_cnt)
        {
            a.push_back(pair.first);
        }
    }
    //cout<<"a. size : "<<a.size()<<endl;
    if(a.size()==1){
        cout<<a[0]<<"\n";
    }
    else{
        sort(a.begin(),a.end());
    cout<<a[1]<<endl;
    }

    // 4 : 범위
    int max = *max_element(nums.begin(), nums.end());
    int min = *min_element(nums.begin(), nums.end());
    cout<<max-min;
    
}

void test()
{
    float a = (float)9/(float)5;

    cout << (a);
}

int main()
{

    // bollon();
    backjoon();
    //test();
    return 0;
}