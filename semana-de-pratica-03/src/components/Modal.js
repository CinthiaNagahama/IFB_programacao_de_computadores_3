import React, {useRef, useEffect, useCallback} from 'react';
import {useSpring, animated} from 'react-spring';
import {MdClose} from 'react-icons/md';
import Ex1 from './exercicios/Ex1';
import Card from './Card';
import '../styles/Modal.css'

export const Modal = ({showModal, setShowModal, exTitle, ex}) => {
  const modalRef = useRef();

  const animation = useSpring({
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

  return (
    <>
      {showModal ? (
        <div className="modal-background" ref={modalRef} onClick={closeModal}>
          <animated.div style={animation}>
            <div className="modal-wrapper" showModal={showModal}>
              <div className="modal-content">
                <Card title={exTitle}>
                  {ex === 1 ? <Ex1/> : null}
                </Card>
              </div>
              <button 
                className="modal-close-button" 
                aria-label="Close modal" 
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
