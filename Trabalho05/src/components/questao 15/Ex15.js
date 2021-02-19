import React, {useState} from 'react';
import {powerStepsWithFor} from './questao15';

export default function Ex15(){
  const [base, setBase] = useState();
  const [pow, setPow] = useState();

  function handleQuestion(){
    powerStepsWithFor(base, pow);
  }

  return(
    <div className="question-15 card">
      <fieldset>
        <form onSubmit={handleQuestion}>
          <label htmlFor="base">Insira a base</label>         
          <input 
            type="text" 
            id="base"
            onChange={event => {setBase(parseInt(event.target.value))}}
          />
          <label htmlFor="pow">Insira o expoente</label>         
          <input 
            type="text" 
            id="pow"
            onChange={event => {setPow(parseInt(event.target.value))}}
          />
          <input type="submit" value="Enviar"/>
        </form>
      </fieldset>
    </div>
  );
}