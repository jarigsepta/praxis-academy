var range = function(start, end, step) {
    var arr = [];
    for (var i = start; step > 1 || step === undefined ? i <= end : i >= end; step ? i = i + step : i++)
        arr.push(i);
    return arr;
};

var sum = function(arr) {
    return arr.reduce(function(x, y) {
        return x + y;
    });
};

//tests
console.log(sum(range(1, 10)));
// → 55
console.log(range(1, 10));
// → [ 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 ]
console.log(range(5, 2, -1));
// → [5, 4, 3, 2]
console.log(range(1, 10, 2));
// → [ 1, 3, 5, 7, 9 ]