#include <iostream>
#include <string>
#include <vector>
#include <algorithm>
#include <string.h>
#include <cmath>




using namespace std;
int main() {
	vector<int> v;
	int x, y, z;
	cin >> x;
	cin >> y;
	cin >> z;

	if (x + y + z == 180) {
		if (x == 60 && y == 60 && z == 60) {
			cout << "Equilateral";
		}
		else {
			if (x == y || y == z || z == x) cout << "Isosceles";
			else cout << "Scalene";
		}
	}
	else cout << "Error";



}