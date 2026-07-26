#include <iostream>
#include <cmath>
#include <string>
#include <vector>

using namespace std;
int main(int argc, char* argv[]) {
	
	
	int a,b;
	vector<int> v;
	cin >> a>>b;

	v.push_back(1);
	for (int i = 2; i < a; i++) {
		if (a % i == 0) v.push_back(i);
	}
	v.push_back(a);

	if (b > v.size()) cout << 0;
	else {
		cout << v.at(b - 1);
	}

	


	return 0;
}