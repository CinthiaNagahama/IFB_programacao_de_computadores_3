import React, {useState} from 'react';
import {delta} from './questao11';

export default function Ex11(){
  const [a, setA] = useState("");
  const [b, setB] = useState("");
  const [c, setC] = useState("");

  function handleQuestao() {
    delta(a, b, c);
  }

  return(
    <div className="question-11 card">
      <fieldset>
        <form onSubmit={handleQuestao}>
          <label htmlFor="first-value">Insira o valor de a</label>            
          <input 
            type="text" 
            id="first-value"
            onChange={event => {setA(parseInt(event.target.value))}}
          />
          <label htmlFor="second-value">Insira o valor de b</label>    
          <input 
            type="text" 
            id="second-value"
            onChange={event => {setB(parseInt(event.target.value))}}  
          />
          <label htmlFor="third-value">Insira o valor de c</label>    
          <input 
            type="text" 
            id="third-value"
            onChange={event => {setC(parseInt(event.target.value))}}
          />
          <input type="submit" value="Enviar"/>
        </form>
      </fieldset>
      <span>Ex. ax^2 + bx + c</span>
    </div>
  );
}