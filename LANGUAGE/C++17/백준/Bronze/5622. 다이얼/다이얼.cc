#include <iostream>
#include <string>
#include <sstream>
using namespace std;

int main(int argc, char* argv[]) {

	string text;
	int count = 0;
	cin >> text;
	
	for (char a : text) {
		if (a == 'A' || a == 'B' || a == 'C') {
			count += 2;
		}
		else if (a == 'D' || a == 'E' || a == 'F') {
			count += 3;
		}
		else if (a == 'G' || a == 'H' || a == 'I') {
			count += 4;
		}
		else if (a == 'J' || a == 'K' || a == 'L') {
			count += 5;
		}
		else if (a == 'M' || a == 'N' || a == 'O') {
			count += 6;
		}
		else if (a == 'P' || a == 'Q' || a == 'R' || a == 'S'  ) {
			count += 7;
		}
		else if ( a == 'T' || a == 'U' || a == 'V') {
			count += 8;
		}
		else if (a == 'W' || a == 'X' || a == 'Y' || a == 'Z') {
			count += 9;
		}
	}

	count += text.length();
	cout << count;
	return 0;
}