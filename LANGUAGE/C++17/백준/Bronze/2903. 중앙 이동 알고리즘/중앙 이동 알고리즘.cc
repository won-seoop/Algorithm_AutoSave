#include <iostream>
using namespace std;

int main() {
    int num;
    cin >> num;

    // 정수형 연산으로 변경 (2^num 대신 1 << num 사용)
    long long result = (1 << num) + 1;
    result = result * result;  // 제곱

    cout << result << endl;  // 결과 출력
    return 0;
}
