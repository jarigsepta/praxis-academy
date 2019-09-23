function Animal(name) {
    this.name = name;
    this.getName = function () {
        return 'Animal name is => ' + this.name;
    }
}

console.log( Animal.prototype );