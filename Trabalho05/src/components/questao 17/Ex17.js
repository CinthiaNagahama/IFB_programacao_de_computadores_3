import React, {Fragment, useState} from 'react';
import {sumMatrixDiagonals} from './questao17';

export default function Ex17(){
  const [inputFields, setInputFields] = useState([
    {valores: ""}
  ]);
  const [res, setRes] = useState({main: 0, second: 0});

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
    setRes(sumMatrixDiagonals(inputFields));
  }

  return(
    <div className="question-17 card">
      <fieldset>
        <form onSubmit={handleQuestion}>
          <div>
            <label htmlFor="rows">Insira a quantidade de linhas</label>
            <input 
              type="text" 
              id="rows"
            />
            <label htmlFor="columns">Insira a quantidade de colunas</label>
            <input 
              type="text" 
              id="columns"
            />
            <button type="button" onClick={null}>Enviar</button>
          </div>
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
      </fieldset>
      <div>
        <span>Soma da Diagonal Principal: {res.main} </span>
        <span>Soma da Diagonal Secundária: {res.second} </span>
      </div>
    </div>
  );
}