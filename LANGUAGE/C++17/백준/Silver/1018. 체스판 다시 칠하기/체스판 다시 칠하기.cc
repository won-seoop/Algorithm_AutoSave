#include <iostream>
#include <string>
#include <algorithm>
#include <utility>
using namespace std;

string WB[8] = {
        "WBWBWBWB",
        "BWBWBWBW",
        "WBWBWBWB",
        "BWBWBWBW",
        "WBWBWBWB",
        "BWBWBWBW",
        "WBWBWBWB",
        "BWBWBWBW"
};
string BW[8] = {
        "BWBWBWBW",
        "WBWBWBWB",
        "BWBWBWBW",
        "WBWBWBWB",
        "BWBWBWBW",
        "WBWBWBWB",
        "BWBWBWBW",
        "WBWBWBWB"
};

string board[50];

//들어오는거 x,y에서 그 뒤로 8개를 봐줄거다.
int check_bw(int x, int y) {
    int cnt=0;

    for (int i = 0; i < 8; i++) {
        for (int j = 0; j < 8; j++) {
            if (board[i + x][j + y] != BW[i][j]) cnt++;
        }
    }
    return cnt;
}

int check_wb(int x, int y) {
    int cnt=0;

    for (int i = 0; i < 8; i++) {
        for (int j = 0; j < 8; j++) {
            if (board[i + x][j + y] != WB[i][j]) cnt++; //i+x, j+y는 +1,+2 ㅇ런식으로 시작점부터 시작하게해준다.!
        }
    }
    return cnt;
}
//M : 세로
//N : 가로
int main(int argc, char* argv[]) {

    int min_cnt = 10000;
    int min_new = 0;
    int M, N;
    cin >> M>>N;

    for (int i = 0; i < M; i++) {
        cin >>board[i];
    }
    //시작점을 선택해라
    //시작점은 i+8햇을때 M보다 작아야한다.
    //즉, M-8  > i : 시작점!
    for (int i = 0; i <= M - 8; i++) {
        for (int j = 0; j <= N - 8; j++) {		//<=인 이유 : 만약 m이 8이면 0이되어야 하기 때문에 I 가
            min_new = min(check_bw(i, j), check_wb(i, j));
            if (min_new < min_cnt) min_cnt = min_new;
        }

    }

    cout << min_cnt;

	





}
