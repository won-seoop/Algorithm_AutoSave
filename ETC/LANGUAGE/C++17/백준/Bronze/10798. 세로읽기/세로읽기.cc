#include <iostream>



char arr[5][15];
using namespace std;
int main(int argc, char* argv[]) {
	
	

	for (int i = 0; i < 5; i++) {
		cin >> arr[i];
	}
	
	for (int i = 0; i < 15; i++) {
		for (int j = 0; j < 5; j++) {
			if (arr[j][i] != NULL) cout << arr[j][i];
		}
	}


	return 0;
}