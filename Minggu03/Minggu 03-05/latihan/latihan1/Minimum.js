var min = function(x, y) {
    return (x <= y) ? x : y;
};

//tests
console.log(min(0, 10));
// → 0
console.log(min(0, -10));
// → -10