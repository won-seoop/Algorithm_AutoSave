

#include <iostream>
#include <deque>
#include <vector>
#include <set>


using namespace std;

void backjoon()
{
    //ios::sync_with_stdio(false);    // cin, cout 속도 개선
    //cin.tie(nullptr);               // cin cout 순서 무시

    set<string> s;
    string s1,s2;
    int N;
    cin >> N;

    s.insert("ChongChong");

    while (N--) {
        cin >> s1>> s2;
        if (s.count(s1) || s.count(s2)) {
            s.insert(s1);
            s.insert(s2);
        }
    }

    cout << s.size();
}

int main()
{
    backjoon();

   
    return 0;
}
