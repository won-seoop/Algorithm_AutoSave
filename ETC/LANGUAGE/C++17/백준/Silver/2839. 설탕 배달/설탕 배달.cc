#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

int main() {
    int a;
    cin >> a;

    int cnt = 0;
    bool found = false;

    for (int i = a / 5; i >= 0; i--) {  // 5kg 봉지의 개수를 최대한 많이 사용
        int tmp = a - (i * 5);  // 남은 무게를 계산
        if (tmp % 3 == 0) {  // 남은 무게가 3으로 나누어 떨어지면
            cnt = i + (tmp / 3);  // 봉지의 개수 = 5kg 봉지 개수 + 3kg 봉지 개수
            found = true;
            break;
        }
    }

    if (found) {
        cout << cnt;
    }
    else {
        cout << -1;
    }

    return 0;
}
