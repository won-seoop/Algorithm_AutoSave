#include <iostream>
#include <algorithm>
using namespace std;

int main(int argc, char* argv[]) {

	int length, iter = 0;			
	int first, second = 0;
	cin >> length >> iter;
	int* array = new int[length];
	int num = 1;

	for (int i = 0; i < length; i++) {
		array[i] = num;
		++num;
	}

	for (int i = 0; i < iter; i++) {
		cin >> first >> second;
		int temp = 0;
		temp = array[first - 1];
		array[first - 1] = array[second - 1];
		array[second - 1] = temp;
	}

	for (int i = 0; i < length; i++) {
		cout << array[i] << " ";
	}






	delete[] array;
	return 0;
}