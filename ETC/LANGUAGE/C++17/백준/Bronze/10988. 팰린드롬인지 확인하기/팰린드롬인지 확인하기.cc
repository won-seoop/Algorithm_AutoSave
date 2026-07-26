#include <iostream>
#include <string>
#include <sstream>
#include <cstring>
#include <algorithm>

using namespace std;

int main(int argc, char* argv[]) {
	string a;
	string b;
	cin >> a;
	b = a;
	reverse(b.begin(),b.end());

	if (b == a) {
		cout << 1;
	}
	else cout << 0;

	return 0;
}