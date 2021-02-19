export function multiplosDe3Ou5(max){
  var array = new Array();
  for(let i = 0; i <= max; i++){
    if(i % 3 || i % 5){
      array.push(i);
    }
  }
  return array;
}