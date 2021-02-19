import React, {Fragment, useState} from 'react';
import {sumMatrixPairs} from './questao18';

export default function Ex18(){
  const [inputFields, setInputFields] = useState([
    {valores: ""}
  ]);
  const [res, setRes] = useState({sum: 0});

  const handleAddField = () => {
    const values = [...inputFields];
    values.push({valores: ""});
    setInputFields(values);
  }
  
  const handleRemoveField = index => {
    const values = [...inputFields];
    values.splice(index, 1);
    setInputFields(values);
  }

  const handleInputChange = (index, event) => {
    const values = [...inputFields];
    values[index].valores = event.target.value;
    setInputFields(values);
  }
  
  const handleQuestion = (e) => {
    e.preventDefault();
    setRes(sumMatrixPairs(inputFields));
  }
  return(
    

  <div className="question-18 card">
    <form onSubmit={handleQuestion}>
      {inputFields.map((linha, index) => (
        <Fragment key={`${linha}~${index}`}>
          <div>
            <label htmlFor="row">Insira os elementos da linha da matriz separados por vírgula</label>         
            <input 
              type="text" 
              id="row"
              value={linha.valores}
              onChange={event => handleInputChange(index, event)}
            />
            <button 
              type="button"
              onClick={() => handleAddField()}  
            > + </button>
            <button 
              type="button"
              onClick={() => handleRemoveField(index)}  
            > - </button>
          </div>
        </Fragment>
      ))}
      <input type="submit" value="Enviar"/>
      <br/>
    </form>
    <div>
      <span>Soma dos Pares na Matrix: {res.sum} </span>
    </div>
  </div>

  );
}