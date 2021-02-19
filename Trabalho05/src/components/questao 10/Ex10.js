import React, {useState} from 'react';
import {findPrimesBetween} from './questao10';

export default function Ex10(){
  const [primesBetwees, setPrimesBetween] = useState(findPrimesBetween(0, 200));

  return(
    <div className="question-10 card">
      <span>Os primos de 0 a 200 são </span>
      <div>
        {primesBetwees.map((num, index) => {
          return(
            <span key={index}> {num} </span>
          );
        })}
      </div>
    </div>
  );
}