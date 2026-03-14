#include <iostream>
#include <algorithm>
using namespace std;
int main() {

	int size = 0;
	int iter = 0;

	int start, end, num = 0;


	cin >> size >> iter;
	int* array = new int[size];


	//0으로 초기화
	for (int i = 0; i < size; i++) {
		array[i] = 0;
	}

	for (int i = 0; i < iter; i++) {
		cin >> start >> end >> num;
		for (int j = start-1; j < end; j++) {
			array[j] = num;
		}
	}

	for (int i = 0; i < size; i++) {
		cout << array[i] << " ";
	}
	
	
	
	delete[] array;

	return 0;
}