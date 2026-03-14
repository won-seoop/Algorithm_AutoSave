#include <iostream>
#include <vector>
#include <algorithm>


using namespace std;
int main() {
	
	int length = 28;
	int num = 1;
	vector<int> v(length, 0);

	for (int& i : v) {
		cin >> i;
	}
	
	for (int i = 1; i < length+3;i++) {
		if (find(v.begin(), v.end(), i) == v.end()) {
			cout << i << endl;
		}
	}


	return 0;
}