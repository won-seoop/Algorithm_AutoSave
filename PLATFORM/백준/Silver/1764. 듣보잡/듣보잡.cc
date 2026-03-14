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


	map<string, int> myMap1;

	map<string, int> ::iterator p;

	int n1;
	int n2;
	int cnt = 0;
	vector<string> v;
	cin >> n1>> n2;

	while (n1--) {
		string a;
		cin >> a;
		myMap1[a]++;
	}

	while (n2--) {
		string a;
		cin >> a;
		myMap1[a]++;
	}

	for (p = myMap1.begin();p != myMap1.end();p++) {
		if(p->second==2){
			cnt++;
			v.push_back(p->first);
		}
	}

	cout << cnt<<"\n";
	for (auto a : v) {
		cout << a << "\n";
	}



}

