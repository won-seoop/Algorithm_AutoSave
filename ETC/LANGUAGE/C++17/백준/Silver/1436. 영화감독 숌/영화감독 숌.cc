#include <iostream>
#include <string>
using namespace std;

int main() {
	int cnt_input;
	string six = "666";
	int start_num = 666;	//올라가는 숫자
	cin >> cnt_input;
	int cnt = 1;
	while (1) {
		string a = to_string(start_num);
		if (a.find(six) != string::npos) {
			if (cnt == cnt_input) {
				cout << start_num;
				break;
			}
			else {
				cnt++;
			}

		}
		start_num++;
	}

}
