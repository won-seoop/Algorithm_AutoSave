

#include <iostream>
#include <deque>
#include <vector>
#include <set>
#include <algorithm>
#include <unordered_map>



using namespace std;
typedef pair<string, int> pp;

void PrintM(unordered_map<string, int>& m){
    for (auto i : m) {
        cout << "(" << i.first << ", " << i.second <<")" << endl;
    }
}

void PrintV(vector<pp>& v) {
    for (auto i : v) {
        cout <<  i.first << "\n";
    }
}

//1 자주 나오는 단어일수록 앞에



//2 : 단어 길이 길수록 앞에
//ex 2 1
//   4 3
bool com(pp& a, pp& b) {

    if (a.second == b.second) {
        if ((a.first).length() == (b.first).length()) {
            return a.first < b.first;
        }
        return (a.first).length() > (b.first).length();
    }
    return a.second > b.second;
}



void backjoon()
{
    //ios::sync_with_stdio(false);    // cin, cout 속도 개선
    //cin.tie(nullptr);               // cin cout 순서 무시

    unordered_map<string, int> m;
    int N, min_len;
    cin >> N >> min_len;
    string word;
    while (N--) {
        cin >> word;
        if (word.length() >= min_len) {
            m[word]++;
        }
    }
    vector<pp> v(m.begin(), m.end());
    sort(v.begin(), v.end(), com);



    PrintV(v);
    //PrintM(m);


}

int main()
{
    backjoon();

   
    return 0;
}
