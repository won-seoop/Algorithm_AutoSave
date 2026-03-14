#include <iostream>
#include <string>
#include <vector>

using namespace std;
int main() {
	
	string alphabets = "abcdefghijklmnopqrstuvwxyz";
	string input_text;	//baekjoon
	cin >> input_text;

	for (int i = 0; i < alphabets.length(); i++) {
		cout << (int)input_text.find(alphabets[i]) << " ";
	}
	
	
}