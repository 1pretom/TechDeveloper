import { useState } from "react";

/* ["", ""];

[
  {
    name: "",
    cidade: "",
  },
  {
    name: "",
    cidade: "",
  },
  {
    name: "",
    cidade: "",
  },
]; */

function NaAula2() {
  const [listaNomes, setListaNomes] = useState([]);
  const [inputText, setInputText] = useState("");
  const [inputCidade, setInputCidade] = useState("");

  function addName() {
    const novoItem = {
      name: inputText,
      cidade: inputCidade,
    };

    setListaNomes([...listaNomes, novoItem]);
    setInputText("");
    setInputCidade("");
  }

  return (
    <div>
      <h1>Hello World</h1>
      {/* <h2>{inputText}</h2> */}
      <ul>
        {listaNomes.map((item, indice) => (
          <li key={indice}>
            {item.name} - {item.cidade}
          </li>
        ))}
      </ul>
      <input
        placeholder="Nome..."
        value={inputText}
        onChange={(event) => setInputText(event.target.value)}
      />
      <input
        placeholder="Cidade..."
        value={inputCidade}
        onChange={(event) => setInputCidade(event.target.value)}
      />
      <button onClick={addName}>Clicar</button>
    </div>
  );
}

export default NaAula2;