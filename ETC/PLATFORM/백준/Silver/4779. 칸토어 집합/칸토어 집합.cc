#include <iostream>
#include <cmath>

using namespace std;

void kantou(int N)
{
    if (N == 0)
    {
        cout << ("-");
    }
    else
    {
        kantou(N - 1);
        for (int i = 0; i < pow(3, N - 1); i++)
        {
            cout << " ";
        }
        kantou(N - 1);
    }
}
void backjoon()
{
    int N;
    while (cin>>N)
    {
        kantou(N);
        cout<<"\n";
    }
}

void test()
{
}

int main()
{

    // bollon();
    backjoon();
    // test();
    return 0;
}