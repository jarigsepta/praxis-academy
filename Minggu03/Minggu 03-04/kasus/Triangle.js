function Latihan(length) {
    var line = "";
        for (var j = 1; j <= length; j++) {
        line += "#";
        }
        return line + "\n";
    }
     function Segitiga(length) {
     var space = "";   
      for(i=1;i<=length;i){
      space += Latihan(length--);
      }
      return space.split("").reverse().slice(1).join(""); 
    }
    console.log(Segitiga(7));
