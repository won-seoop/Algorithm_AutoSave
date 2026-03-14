#include <iostream>
#include <vector>

void print(int* array, int cnt) {
	std::cout << "(";

	for (int i = 0;i < cnt;i++) {
		if (array[i] != 0) {
			std::cout << " " << array[i];

		}

	}
	std::cout << ")\n";
}

void pop(int* array,int* top) {
	if (*top >=0) {
		array[*top] = 0;
		(*top)--;
	}
}

void append(int* array, int* top, int input) {
	(*top)++;
	array[*top] = input;
}
int main() {
	//int a[100000];	//400,000byte = 400MB
	int cnt = 0;
	int top = -1;
	int input = 0;
	int sum = 0;


	std::cin >> cnt;
	int* array = new int[cnt];
	for (int i = 0; i < cnt; ++i) {
		array[i] = 0; // 모든 요소를 0으로 초기화
	}
	
	int n = cnt;



	while (n--) {

		std::cin >> input;
		if (input == 0) {
			pop(array, &top);
			//print(array, cnt);
		}
		else {
			append(array, &top, input);
			//print(array, cnt);

		}
	}

	for (int i = 0;i < cnt;i++) {
		sum += array[i];
	}
	std::cout << sum;
}