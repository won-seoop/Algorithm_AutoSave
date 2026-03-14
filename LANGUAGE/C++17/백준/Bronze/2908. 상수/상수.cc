#include <iostream>
#include <string>
#include <vector>
#include <algorithm>

using namespace std;
int main() {

	string text1, text2;
	int num1, num2;
	cin >> text1 >> text2;
	reverse(text1.begin(), text1.end());
	reverse(text2.begin(), text2.end());
	num1=stoi(text1);
	num2 = stoi(text2);

	if (num1 > num2) cout << num1;
	else if (num2 > num1) cout << num2;

	return 0;
}