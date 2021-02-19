import React, {useState} from 'react';
import {multiplosDe3Ou5} from './questao07';

export default function Ex07(){
  const [max, setMax] = useState();  
  const [showMultiples, setShowMultiples] = useState([]);
  
  function handleQuestao(){
    setShowMultiples(multiplosDe3Ou5(max));
  }

  return(    
    <div className="question-07 card">
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
        {
          showMultiples.map(element => {
            return(
              <span>{element} </span>
            );
          })
        }
      </div>
    </div>
  );
}