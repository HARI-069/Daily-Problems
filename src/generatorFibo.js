const fibo = function* (limit) {
    let [prev, curr] = [0, 1];
  
    for (let i =0; i < limit; i++) {
        yield curr;
        [prev, curr] = [curr, prev + curr];
    }
}

const fiboGen = fibo(5);

for(const num of fiboGen){
    console.log(num);
}
