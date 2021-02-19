import React, {useState} from 'react';
import {ehMenorDeIdade} from './questao04';

export default function Ex04(){
  const [idade, setIdade] = useState();
  
  function handleQuestao() {
    ehMenorDeIdade(idade);
  }
  return(   
    <div className="question-04 card">
      <fieldset>
        <form onSubmit={handleQuestao}>
          <label htmlFor="idade">Digite sua idade</label>         
          <input 
            type="text" 
            id="idade"
            onChange={event => {setIdade(parseInt(event.target.value))}}
          />
          <input type="submit" value="Enviar"/>
        </form>
      </fieldset>
    </div>
  );
}