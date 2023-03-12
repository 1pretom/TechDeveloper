import { useState } from "react"

function App() {
  const [id, setId] = useState("");
  const [disciplina, setDisciplina] = useState("");
  const [duracao, setDuracao] = useState("");
  const [listaDisciplinas, setListaDisciplinas] = useState([]);


  function addItem(event) {
    event.preventDefault();

    if (disciplina === "" || duracao === "") {
      alert("Por favor, preencha todos os campos")
      return;
    }

    if (id) {
const copiaListaDisciplinas = [...listaDisciplinas];
const index = copiaListaDisciplinas.findIndex((item) => item.id ===id);
copiaListaDisciplinas[index].disciplina = disciplina;
copiaListaDisciplinas[index].duracao = duracao;
    } else {
      setListaDisciplinas([
        ...listaDisciplinas,
        {
          id: Date.now(),
          disciplina: disciplina,
          duracao,
        }
      ]);
    }

    setDisciplina("");
    setDuracao("");
setId("");
  }

  function apagarItem(id) {
    if (confirm("Pressione ok se tem certeza")) {

      const result = listaDisciplinas.filter((item) => item.id !== id);
      setListaDisciplinas(result)
    }

  }

  function preencheEstados(item) {
    setDisciplina(item.disciplina)
    setDuracao(item.duracao)
    setId(item.id)
  }


  return (
    <div className="App">
      <h1>Cadastro de disciplina</h1>

      {/* <h3>Disciplina: {disciplina}</h3>
      <h3>Duração: {duracao}</h3> */}

      <form onSubmit={addItem}>
        <input
          required
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
        <input type="submit" value={id? "Salvar" : "Cadastrar"} />
      </form>


      {listaDisciplinas.length > 0 ? (
        <ul>
          {listaDisciplinas.map((item) => (
            <li key={item.id} style={{ border: "1px solid #9999" }}>
              <p>{item.id}</p>
              <p>{item.disciplina}</p>
              <p>{item.duracao}</p>

              <button onClick={() => apagarItem(item.id)}>Apagar</button>
              <button onClick={() => preencheEstados(item)}>Editar</button>

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
