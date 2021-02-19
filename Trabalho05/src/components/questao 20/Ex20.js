import React, {useState} from 'react';
import {invertNative} from './questao20';

export default function Ex20(){
  const [sequence, setSequence] = useState("");

  return (
    <div className="question-20 card">
      <fieldset>
        <form>
          <label htmlFor="sequence">Digite algo</label>         
          <input 
            type="text" 
            id="sequence"
            onChange={event => {setSequence(invertNative(event.target.value))}}
          />
      </form>
      </fieldset>
      <div>
        {sequence}
      </div>
    </div>
  );
}
