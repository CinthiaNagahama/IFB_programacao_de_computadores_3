import React, {useRef, useEffect, useCallback, useState} from 'react';
import {useSpring, animated} from 'react-spring';
import {MdClose} from 'react-icons/md';
import {IoArrowForwardCircle, IoArrowBackCircle} from 'react-icons/io5';
import Ex1 from './exercicios/Ex1';
import Card from './Card';
import '../styles/Modal.css'
import Ex2 from './exercicios/Ex2';
import Ex3 from './exercicios/Ex3';

export const Modal = ({showModal, setShowModal, ex}) => {
  const modalRef = useRef();

  const animationFromTop = useSpring({
    config: {
      duration: 250
    },
    opacity: showModal ? 1 : 0,
    transform: showModal ? `translateY(0%)` : `translateY(-100%)` 
  });

  const closeModal = e => {
    if(modalRef.current === e.target){
      setShowModal(false);
    }
  };

  const keyPress = useCallback(e => {
    if(e.key === 'Escape' && showModal){
      setShowModal(false);
    }
  }, [setShowModal, showModal]);

  useEffect(() => {
    document.addEventListener('keydown', keyPress);
    return () => document.removeEventListener('keydown', keyPress);
  }, [keyPress]);

  const [question, SetQuestion] = useState(ex);
  const goToNextQuestion = () => {
    SetQuestion(question + 1);
  };

  const goToPreviousQuestion = () => {
    SetQuestion(question - 1);
  };

  return (
    <>
      {showModal ? (
        <div className="modal-background" ref={modalRef} onClick={closeModal}>
          <animated.div style={animationFromTop}>
            <div className="modal-wrapper" showModal={showModal}>
              <div className="modal-content">
                <Card title={`Exercício ${question < 10 ? '0' + question : question}`}>
                  {question === 1 && <Ex1/>}
                  {question === 2 && <Ex2/>}
                  {question === 3 && <Ex3/>}
                </Card>
                <div className="modal-arrow-buttons-container">
                  <button 
                    className="modal-arrow-buttons"
                    onClick={() => goToPreviousQuestion()}
                  >
                    <IoArrowBackCircle/>
                  </button>
                  <button 
                    className="modal-arrow-buttons"
                    onClick={() => goToNextQuestion()}
                  >
                    <IoArrowForwardCircle/>
                  </button>
                </div>
              </div>
              <button 
                className="modal-close-button"
                onClick={() => setShowModal(prev => !prev)} 
              >
                <MdClose/>
              </button>
            </div>
        </animated.div>
      </div>
      ) : (
        null
      )}
    </>
  );
}
