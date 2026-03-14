#include <iostream>
#include <cmath>
#include <string>
#include <vector>
#include <numeric>
#include <algorithm>
#include <typeinfo>
using namespace std;





int main(int argc, char* argv[]) {

	//수 + 각 자리수 = a

	int a;
	cin >> a;
	int i = 1;
	int sum = 0;
	while (1) {
		//수
		//각 자리수;
		string str;
		str = to_string(i);							//33
		for (auto k : str)
		{
			sum += int(k) - '0';
		}		//6
		if (sum + i == a) {							//33+6=39
			cout << i;
			break;
		}
		else if (i > a) {
			cout << 0;
			break;
		}
		i++;
		sum = 0;

	}

	return 0;
}


