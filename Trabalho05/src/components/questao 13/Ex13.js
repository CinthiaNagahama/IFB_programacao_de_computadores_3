import React, {useState} from 'react';
import {power} from './questao13';

export default function Ex13(){
  const [base, setBase] = useState();
  const [pow, setPow] = useState();

  function handleQuestion(){
    power(base, pow);
  }

  return(
    <div className="question-13 card">
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