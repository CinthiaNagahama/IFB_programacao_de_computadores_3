import React, {useState} from 'react';
import {crescent} from './questao19';

export default function Ex19() {
  const [string, setString] = useState("");

  return (
    <div className="question-19 card">
      <fieldset>
        <form>
          <label htmlFor="string">Digite algo</label>         
          <input 
            type="text" 
            id="string"
            onChange={event => {setString(crescent(event.target.value))}}
          />
        </form>
      </fieldset>
      <div>
        {string}
      </div>
    </div>
  );
}

