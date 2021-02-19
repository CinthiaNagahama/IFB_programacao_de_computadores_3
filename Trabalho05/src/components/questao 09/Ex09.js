import React, {useState} from 'react';
import {findPrime} from './questao09';

export default function Ex09(){
  const [prime, setPrime] = useState(findPrime(1001));
  
  return(
    <div className="question-09 card">
      <span>O 1001° número primo é </span>
      <span>{prime}</span>
    </div>
  );
}