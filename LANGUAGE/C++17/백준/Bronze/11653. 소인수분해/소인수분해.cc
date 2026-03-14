#include <iostream>
#include <cmath>
#include <string>
#include <vector>
#include <numeric>
#include <algorithm>

using namespace std;

bool check(int num) {

	if (num < 2) return false;

	for (int i = 2; i < num; i++) {
		if (num % i == 0) {
			return false;
			
		}
		
	}
	return true;
}


int main(int argc, char* argv[]) {
	
	int num = 0;
	int k = 2;
	vector<int> v;

	cin >> num;
	while (1) {
		if (num == 1)break;
		if (num%k==0&&check(k)==true){
			num /= k;
			v.push_back(k);

		}
		else {
			k++;
		}
	}

	for (int i : v) cout << i << endl;

	return 0;
}


