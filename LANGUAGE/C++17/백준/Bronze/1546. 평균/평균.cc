#include <iostream>
#include <vector>
#include <algorithm>


using namespace std;
int main() {
	
	int num_score = 0;
	double max_score = 0;
	double  mean = 0;
	double sum=0;

	cin >> num_score;
	vector<double> v_scores(num_score, 0);

	for (double& i : v_scores) cin >> i;

	max_score = *max_element(v_scores.begin(), v_scores.end());

	for (double& i : v_scores) i = i / max_score * 100;

	for (double i : v_scores) sum += i;

	mean = sum / num_score;

	cout << mean;
	
	

	return 0;
}