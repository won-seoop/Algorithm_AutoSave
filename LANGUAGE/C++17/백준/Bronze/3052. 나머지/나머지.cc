#include <iostream>
#include <vector>
#include <algorithm>


using namespace std;
int main() {
	
	vector<bool> v_check(42, false);
	vector<int> v(10, 0);
	int num_true = 0;

	for (int& i : v) {
		cin >> i;
	}

	for (int i : v) {
		int remain = i % 42;
		v_check[remain] = true;
	}

	for (int i = 0; i < v_check.size(); i++) {
		if (v_check[i] == true) {
			++num_true;
		}
	}
	
	cout << num_true;

	return 0;
}