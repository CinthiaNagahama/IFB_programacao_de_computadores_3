import React, {useState} from 'react';
import {invert} from './questao12';

export default function Ex12(){
  const [string, setString] = useState("");

  return(
    <div className="question-12 card">
      <fieldset>
        <form>
          <label htmlFor="string">Digite algo</label>         
          <input 
            type="text" 
            id="string"
            onChange={event => {setString(invert(event.target.value))}}
          />
        </form>
      </fieldset>
      <div>
        {string}
      </div>
    </div>
  );
}