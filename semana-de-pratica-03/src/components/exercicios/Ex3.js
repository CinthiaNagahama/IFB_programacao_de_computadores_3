import React, { useState } from 'react';

const re = /\d+\.\d+/

function Aluno (nr){
  this.nr = nr;
  var _nota;
  
  this.setNota = (nota) =>  {_nota = Symbol(nota)};
  this.getNota = () => (re.exec(String(_nota)));
}

var register = [];

function populateRegister(){
  for(let i = 1; i < 21; i++){
    let a = new Aluno(i.toLocaleString('pt-BR', {
      style: "decimal",
      minimumIntegerDigits: 6,
      useGrouping: false
    }));
    a.setNota((Math.random() * 100).toFixed(2));
    register.push(a);
  }
}

export default function Ex3(){
  var aprovados = 0;
  var reprovados = 0;

  const [generateTable, SetGenerateTable] = useState(false);

  const handleGenerateTable = () => {
    SetGenerateTable(prev => !prev);
    register.forEach(student => {
      parseFloat(student.getNota()) >= 60.0 ? aprovados++ : reprovados++;
    })
  }

  return (
    <div className="ex3-content" onLoad={register.length < 20 ? populateRegister() : null}>
      <p className="ex3-title">Gerar relatório para a turma de javascript</p>
      <div className="ex3-button-container">
        <button 
          type="submit" 
          className="ex3-button"
          onClick={() => handleGenerateTable()}
        >
          Gerar
        </button>
      </div>
      <table className="ex3-table-results">
        <tr>
          <th>Aluno</th>
          <th>Nota</th>
          <th>Status</th>
        </tr>
        {generateTable ? (
          register.map((student) => (
            <tr>
              <td>{student.nr}</td>
              <td>{student.getNota()}</td>
              <td>{parseFloat(student.getNota()) >= 60 ? "APROVADO" : "REPROVADO"}</td>
            </tr>
          ))
        ) : (
          null
        )}
      </table>
      <p>APROVADOS: {aprovados} ({aprovados / 20}%) | REPROVADOS: {reprovados} ({reprovados / 20}%)</p>
    </div>
  );
}