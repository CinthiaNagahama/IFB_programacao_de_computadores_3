import React from 'react';
import {questao01} from './questao01';

export default function Ex01(){
  function handleQuestao(){
    questao01();
  }

  return(
    <div onLoad={handleQuestao}></div>
  );
}