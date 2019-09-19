var board = "";
for (var y = 0; y < 8; y++) {  
  for (var x = 0; x < 8; x++) {
    if ((x + y) % 2 == 0)
      board += " ";
    else
      board += "#";
  }
  board += "\n";
}
console.log(board);