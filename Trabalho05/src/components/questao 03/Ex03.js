import React, {useState} from 'react';
import {encontrarMaior, encontrarMenor} from './questao03';

export default function Ex03(){
  const [firstValue, setFirstValue] = useState();
  const [secondValue, setSecondValue] = useState();
  const [thirdValue, setThirdValue] = useState();

  function handleQuestao(){
    encontrarMaior(firstValue, secondValue, thirdValue);
    encontrarMenor(firstValue, secondValue, thirdValue);
  }

  return(
    <div className="question-03 card">
      <fieldset>
        <form onSubmit={handleQuestao}>
          <div>
            <label>Digite três números:</label>
          </div>
          <div>            
            <input 
              type="text" 
              id="first-value"
              onChange={event => {setFirstValue(parseInt(event.target.value))}}
            />
            <input 
              type="text" 
              id="second-value"
              onChange={event => {setSecondValue(parseInt(event.target.value))}}  
            />
            <input 
              type="text" 
              id="third-value"
              onChange={event => {setThirdValue(parseInt(event.target.value))}}
            />
          </div>
          <input type="submit" value="Enviar"/>
        </form>
      </fieldset>
    </div>
  );
}