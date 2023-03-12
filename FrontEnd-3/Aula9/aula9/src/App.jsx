import { useState } from "react"

function App() {

  const [disciplina, setDisciplina] = useState("");
  const [duracao, setDuracao] = useState("");
  const [listaDisciplinas, setListaDisciplinas] = useState([]);

  function addItem(event) {
    event.preventDefault();
    setListaDisciplinas([
      ...listaDisciplinas,
      {
        id: Date.now(),
        disciplina: disciplina,
        duracao,
      }

    ]);

    setDisciplina("");
    setDuracao("");

  }

  function apagarItem(id){
    alert("delete " + id)
  }


  return (
    <div className="App">
      <h1>Cadastro de disciplina</h1>

      {/* <h3>Disciplina: {disciplina}</h3>
      <h3>Duração: {duracao}</h3> */}

      <form onSubmit={addItem}>
        <input
          value={disciplina}
          onChange={(event) => setDisciplina(event.target.value)}
          placeholder="Nome da disciplina" />

        <select
          value={duracao}
          onChange={(event) => setDuracao(event.target.value)} >
          <option value="" disabled> Selecione uma opção</option>
          <option value="40">40 Horas</option>
          <option value="60">60 Horas</option>
          <option value="80">80 Horas</option>
        </select>
        <input type="submit" value="Cadastrar" />
      </form>


      {listaDisciplinas.length > 0 ? (
        <ul>
          {listaDisciplinas.map(({id, disciplina, duracao}) => (
            <li key={id} style={{border: "1px solid #9999"}}>
              <p>{id}</p>
              <p>{disciplina}</p>
              <p>{duracao}</p>

              <button onClick={()=>apagarItem(id)}>Apagar</button>
            </li>
          ))}
        </ul>
      ) : (
        <p>Nenhum item cadastrado</p>
      )}



    </div>
  )
}

export default App
