// 풀이
// https://velog.io/@halo_3735/%EC%95%8C%EA%B3%A0%EB%A6%AC%EC%A6%98-%EB%B0%B1%EC%A4%80-1149-RGB-%EA%B1%B0%EB%A6%AC

// const path='input.txt'
const path='/dev/stdin'


const fs = require('fs');

const min = Math.min
// input.txt에서 읽어오기
const input = fs.readFileSync(path, 'utf-8').trim().split('\n');

const N=Number(input[0])
const dp = [[0,0,0], ...input.slice(1).map(line => line.split(' ').map(Number))]

for (let i=1;i<N+1;i++){
    dp[i][0]+=min(dp[i-1][1],dp[i-1][2])
    dp[i][1]+=min(dp[i-1][0],dp[i-1][2])
    dp[i][2]+=min(dp[i-1][0],dp[i-1][1])

}

console.log(min(...dp[N]))