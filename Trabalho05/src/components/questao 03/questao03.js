export function encontrarMaior(num1, num2, num3){
  if(num1 >= num2 && num1 >= num3){
    return (
      alert(num1)
    );
  }
  else if(num2 >= num1 && num2 >= num3){
    return (
      alert(num2)
    );
  }
  else {
    return (
      alert(num3)
    );
  }
}

export function encontrarMenor(num1, num2, num3){
  if(num1 <= num2 && num1 <= num3){
    return (
      alert(num1)
    );
  }
  else if(num2 <= num1 && num2 <= num3){
    return (
      alert(num2)
    );
  }
  else {
    return (
      alert(num3)
    );
  }
}