import React from 'react';
import {questao02} from './questao02';

export default function Ex02(){
  function handleQuestao(){
    questao02();
  }

  return(
    <div className="question-02 card">
      <span>Clique no Botão</span>
      <div onClick={handleQuestao}>
        <span>O Botão</span>  
      </div>
    </div>
  );
}