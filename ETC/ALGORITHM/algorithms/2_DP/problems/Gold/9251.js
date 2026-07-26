// const path = 'input.txt'
const path = '/dev/stdin'


const input = require('fs')
    .readFileSync(path)
    .toString()
    .trim()
    .split('\n')


const dp = Array.from({ length: input[0].length + 1 }, () => 
    Array(input[1].length + 1).fill(0))




let w1,w2
for (let i = 1; i < input[0].length + 1; i++) {
    w1 = input[0][i - 1]
    for (let j = 1; j < input[1].length + 1; j++) {
        w2 = input[1][j - 1]

        if (w1===w2){
            dp[i][j]=dp[i-1][j-1]+1
        }
        else{
            dp[i][j]=Math.max(dp[i-1][j], dp[i][j-1])
        }

    }

}

console.log(dp[input[0].length][input[1].length])