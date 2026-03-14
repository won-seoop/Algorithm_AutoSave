#include <iostream>
#include <vector>
#include <algorithm>


int main() {

	int c;
	int num;

	std::cin >> c>>num;

	std::vector<int> v(c);

	for (auto& a : v) std::cin >> a;

	sort(v.rbegin(), v.rend());

	


	std::cout << v.at(num - 1);



	return 0;
}
