

#include <iostream>
#include <deque>
#include <vector>

using namespace std;

void backjoon()
{
    ios::sync_with_stdio(false);    // cin, cout 속도 개선
    cin.tie(nullptr);               // cin cout 순서 무시

    int v_size = 0;
    cin >> v_size;

    deque<int> v;
    vector<int> types(v_size);

    // types 배열 입력받기
    for (int i = 0; i < v_size; i++)
    {
        cin >> types[i];
    }

    // types[i] == 0인 경우만 큐 초기화
    for (int i = 0; i < v_size; i++)
    {
            int a;
            cin >> a;
        if (types[i] == 0)
        {
            v.push_back(a);
        }
    }

    int N = 0; // 추가 작업 수
    cin >> N;

    // N개의 추가 작업 처리
    while (N--)
    {
        int now;
        cin >> now;        // 새로운 값 입력받기
        v.push_front(now); // 덱의 앞에 추가
        cout << v.back() << " "; // 덱의 뒤 값 출력
        v.pop_back();      // 덱의 뒤 값 제거
    }
}

int main()
{
    backjoon();

   
    return 0;
}
