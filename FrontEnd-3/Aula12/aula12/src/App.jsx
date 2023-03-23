import { useState, useEffect } from 'react'

function App() {
  /* const [number, setNumber] = useState(0)
  const [number2, setNumber2] = useState(9000) */


  function getTemp() {
    return 30;
  }

  const [temp, setTemp] = useState(0)


  useEffect(
    () => {
      const response = getTemp();
      setTemp(response)
    }, [temp]
  )
  /* useEffect(
    () => {
      const response = getTemp();
      setTemp(response)
    }
  ) */ //Dessa forma executa com qualquer alteração fora dele

  return (
    <div>
      <h1>hello</h1>
      <h3>Temperatura de agora: {temp}</h3>
      {/* <h2>{number}</h2>
      <h2>{number2}</h2>
      <button onClick={() => setNumber(number + 1)}>Incrementar</button>
      <button onClick={() => setNumber2(number2 + 1)}>Incrementar</button> */}
    </div>
  )
}

export default App
