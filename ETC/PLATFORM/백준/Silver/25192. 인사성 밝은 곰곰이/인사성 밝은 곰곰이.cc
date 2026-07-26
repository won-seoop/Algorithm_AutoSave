#include <iostream>
#include <set>
#include <string>
#include <algorithm>



using namespace std;

int backjoon(){
    set<string> v;
    int N;
    int cnt=0;
    string line;

    cin>>N;
    cin.ignore();

    while(N--){
        getline(cin,line);
        if(line=="ENTER"){
            v.clear();
            continue;
        }
        if(v.find(line)==v.end()){
            cnt++;
            v.insert(line);
        }
    }

    cout<<cnt;
    return 0;
}

int main(){

    //bollon();
    backjoon();
    return 0;
}