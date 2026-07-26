#include <iostream>
#include <cmath>
#include <vector>
#include <numeric>
#include <algorithm>

using namespace std;

bool check(int num) {
    if (num < 2) return false;  // 0과 1은 소수가 아님
    for (int i = 2; i <= sqrt(num); i++) {
        if (num % i == 0) {
            return false;
        }
    }
    return true;
}

int main() {
    int m, n;
    cin >> m >> n;

    vector<int> v;

    for (int i = m; i <= n; i++) {
        if (check(i)) {
            v.push_back(i);
        }
    }

    if (!v.empty()) {
        long long sum = accumulate(v.begin(), v.end(), 0);
        int min = *min_element(v.begin(), v.end());
        cout << sum << endl;
        cout << min << endl;
    } else {
        cout << -1 << endl;
    }

    return 0;
}
