#include <cstdio>
#include <iostream>
#include <map>
#include <cstring>
#include <iterator>
#include <ctime>
#include <string>
#include <vector>


using namespace std;

int main() {
	map<int, string> myMap1;
	map<string, int> myMap2;

	int N, M;
	char pocket_mon[21];

	int input_no = 0;


	myMap1[0] = "";
	std::cin >> N >> M;


	for (int i = 1;i < N + 1;i++) {
		cin >> pocket_mon;
		myMap1[i] = pocket_mon;
		myMap2[pocket_mon] = i;
	}

	std::vector<string> v(M);
	for (int i = 0;i < M;i++) {
		cin >> v[i];
	}

	for (int i = 0;i < M;i++) {
		

		//숫자
		if (v[i][0] < 65) {
			cout << myMap1[stoi(v[i])] << "\n";

		}
		//영어
		else {
			cout << myMap2[v[i]] << "\n";

		}

	}
}

