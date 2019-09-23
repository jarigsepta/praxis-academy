function Animal(name) {
    this.name = name;
}

Animal.prototype.generation = '100';

var a = new Animal( 'Dog' );

console.log( 'a.generation ==> ', a.generation );
console.log( 'has own generation ==> ', a.hasOwnProperty( 'generation' ) );