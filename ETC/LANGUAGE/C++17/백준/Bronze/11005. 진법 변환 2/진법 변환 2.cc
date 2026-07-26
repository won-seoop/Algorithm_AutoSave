#include <iostream>
#include <cmath>
#include <string>

using namespace std;
int main(int argc, char* argv[]) {
	
	
	int num;
	int qu;	// 몫
	int re; // 나머지
	string answer;

	
	cin >> num >> qu;
	if (num == 0) {
		std::cout << 0 << endl;
		exit(1);
	}
		while (1) {
			
			
			if (num >= qu) {
				re = num % qu;

				if (re >= 10) {
					answer = char(re + 55) + answer;
				}
				else {
					answer = char(re + 48) + answer;
				}
				
				num = num / qu;
				

			}
			else {
				if (num >= 10) {


					answer = char(num + 55) + answer;
				}
				else {

					answer = char(num + 48) + answer;
				}
				

				break;
			}
			
		}
		
		cout << answer;

	


	return 0;
}