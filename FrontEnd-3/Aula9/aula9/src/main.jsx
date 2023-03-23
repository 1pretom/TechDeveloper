import React from 'react'
import ReactDOM from 'react-dom/client'
import App from './App'
import Header from './components/header';
/* import Card from './components/card'; */
import "./global.css";

ReactDOM.createRoot(document.getElementById('root')).render(
  <React.StrictMode>
    <Header/>
    <App />
   {/*  <ul>
      {usuarios.map((jogador) => {
        <Card key = {jogador.id} jogador = {jogador}/>
      })}
    </ul> */}

  
  </React.StrictMode>,
)
