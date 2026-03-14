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
	ios_base::sync_with_stdio(false);	//iostream과 stdio.h 해제
	cin.tie(NULL);


	map<int, int> myMap1;
	map<int, int> myMap2;
	map<int, int>::iterator p;
	int n1, n2;
	int cnt = 0;
	cin >> n1 >> n2;

	while (n1--) {
		int a;
		cin >> a;
		myMap1[a] = 1;
	}

	while (n2--) {
		int a;
		cin >> a;
		myMap2[a] = 1;
	}


	for (p = myMap1.begin(); p != myMap1.end(); p++) {
		if (myMap2.find(p->first) != myMap2.end()) {

			myMap1[p->first] = 0;
			myMap2[p->first] = 0;

		}
		
	}
	for (p = myMap1.begin(); p != myMap1.end(); p++) {
		if (p->second == 1) {
			cnt++;
		}
	}
	for (p = myMap2.begin(); p != myMap2.end(); p++) {
		if (p->second == 1) {

			cnt++;
		}
	}

	cout << cnt;

	return 0;
}

