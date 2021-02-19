import React, {useState} from 'react';
import {fibonacci} from './questao08';

export default function Ex08(){
  const [max, setMax] = useState();
  const [showFibonacci, setShowFibonacci] = useState();
  
  function handleQuestao(){
    setShowFibonacci(fibonacci(max));
  }

  return(
    <div className="question-08 card">
      <fieldset>
        <form onSubmit={handleQuestao}>
          <label htmlFor="max">Digite o valor máximo</label>         
          <input 
            type="text" 
            id="max"
            onChange={event => {setMax(parseInt(event.target.value))}}
          />
          <input type="submit" value="Enviar"/>
        </form>
      </fieldset>
      <div>
        {showFibonacci}
      </div>
    </div>
  );
}