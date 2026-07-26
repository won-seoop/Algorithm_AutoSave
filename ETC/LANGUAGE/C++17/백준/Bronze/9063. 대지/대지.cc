#include <iostream>
#include <string>
#include <vector>
#include <algorithm>
#include <string.h>
#include <cmath>




using namespace std;
int main() {
	vector<int> v1;
	vector<int> v2;

	int x, y;
	int num;
	cin >> num;

	if (num == 1){
		cin >> x >> y;
		cout << 0;
		return 0;
	}

	else {
		for (int i = 0; i < num; i++) {
			cin >> x >> y;
			v1.push_back(x);
			v2.push_back(y);

		}
	}

	int x_max = *max_element(v1.begin(), v1.end());
	int x_min = *min_element(v1.begin(), v1.end());

	int y_max = *max_element(v2.begin(), v2.end());
	int y_min = *min_element(v2.begin(), v2.end());

	cout << (x_max - x_min) * (y_max - y_min);



}