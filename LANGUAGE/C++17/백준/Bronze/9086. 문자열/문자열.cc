#include <iostream>
#include <string>
#include <sstream>
using namespace std;

int main(int argc, char* argv[]) {

	string text;
	int iter;

	cin >> iter;
	cin.ignore();

	for (int i = 0; i < iter; i++) {
		getline(cin, text);
		cout << text[0] << text[text.length() - 1] << endl;

	}

}