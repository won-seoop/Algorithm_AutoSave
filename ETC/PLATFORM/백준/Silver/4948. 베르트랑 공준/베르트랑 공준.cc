#include <iostream>
#include <cmath> // sqrt 함수 사용
using namespace std;

int main() {
    while (true) {
        int cnt = 0;
        int n;
        cin >> n;

        if (n == 0) { // 입력이 0이면 종료
            break;
        }

        for (int i = n + 1; i <= 2 * n; ++i) {
            if (i == 1) { // 1은 소수가 아니므로 건너뜀
                continue;
            }

            bool isPrime = true;
            for (int j = 2; j <= sqrt(i); ++j) {
                if (i % j == 0) { // 약수가 존재하면 소수가 아님
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                cnt++;
            }
        }

        cout << cnt << endl; // 소수 개수 출력
    }

    return 0;
}
