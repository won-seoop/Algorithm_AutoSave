#include <iostream>
#include <string>
#include <vector>

using namespace std;
int main() {

	string text;
	bool check = false;
	int count = 1;
	getline(cin, text);
	if (text.length() == 1 && text[0] == ' ') {
		count--;
	}
	else {
		for (int i = 1; i < text.length() - 1; i++) {
			if (text[i] == ' ') count++;
		}
	}

	cout << count;

	return 0;
}