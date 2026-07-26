#include <iostream>
#include <deque>



using namespace std;

void backjoon(){
    deque<pair<int,int>> dq;
    int N;
    int num;

    cin>> N;
    for (int i=0; i<N;i++){
        cin>> num;
        dq.push_back(make_pair(num,i+1));
    }
    
    while (!dq.empty()){
        int read = dq.front().first;
        cout<<dq.front().second<<" ";
        dq.pop_front();

        //pop 했는데 비어있으면 그만둬야함
        if(dq.empty()) break;

        if (read>0){
            for (int i=0;i<read-1;i++){
                dq.push_back(dq.front());
                dq.pop_front();
            }
        }
        else{
            for (int i=0;i<-(read);i++){
                dq.push_front(dq.back());
                dq.pop_back();
            }
        }
    }

}


int main(){

    //bollon();
    backjoon();
    return 0;
}