#include <iostream>
#include <string>
#include <vector>
#include <algorithm>
#include <string.h>


using namespace std;
int main() {
	bool paper[100][100] = { false };	//전체 0으로 초기화


	int num = 0;
	int x = 0;
	int y = 0;
	int count = 0;

	cin >> num;

	for (int i = 0; i < num; i++) {
		cin >> x >> y;
		for (int j=x; j < x + 10; j++) {
			for (int k =y; k < y + 10; k++) {
				paper[j][k] = true;
			}
		}
	}

	for (int i = 0; i < 100; i++) {
		for (int j = 0; j < 100; j++) {
			if (paper[i][j] == true) count += 1;
		}
	}

	cout << count;
	return 0;
}