#include <iostream>
#include <string>
#include <vector>
#include <algorithm>

using namespace std;
int main() {

	string text;
	int idx=0;
	cin >> text;		//#c=
				
	vector<string> v = { "c=","c-","dz=","d-","lj","nj","s=","z=" };

	for (string cro : v) {
		while (1) {
			idx=text.find(cro);
			if (string::npos==idx) break;
			text.replace(idx, cro.length(),"#");
		}
	}
	cout << text.length();
	return 0;
}