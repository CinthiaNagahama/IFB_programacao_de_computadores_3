import React, {useState} from 'react';
import {imc} from './questao06';

export default function Ex06(){  
  const [peso, setPeso] = useState();
  const [altura, setAltura] = useState();
  
  function handleQuestao() {
    imc(altura, peso);
  }

  return(  
    <div className="question-06 card">
      <fieldset>
        <form onSubmit={handleQuestao}>
          <label htmlFor="peso">Digite seu peso</label>         
          <input 
            type="text" 
            id="peso"
            onChange={event => {setPeso(parseFloat(event.target.value))}}
          />
          <label htmlFor="altura">Digite sua altura</label>         
          <input 
            type="text" 
            id="altura"
            onChange={event => {setAltura(parseFloat(event.target.value))}}
          />
          <button type="submit">Enviar</button>
        </form>
      </fieldset>
    </div>
  );
}