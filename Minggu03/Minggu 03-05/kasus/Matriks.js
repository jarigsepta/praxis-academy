var matriks1 = [1,2,3,4];
var matriks2 = [5,6,7,8];

var matriks = matriks1.map(function (num, idx) {
  return num + matriks2[idx];
});
console.log(matriks);