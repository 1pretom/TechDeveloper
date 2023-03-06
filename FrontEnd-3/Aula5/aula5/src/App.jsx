import Card from "./components/Card"

const titulos = [
  {
    id: 1,
    titulo: "Titulo 1",
    subtitulo: "Subtitulo 1"
  }, {
    id: 2,
    titulo: "Titulo 2",
    subtitulo: "Subtitulo 2"
  }, {
    id: 3,
    titulo: "Titulo 3",
    subtitulo: "Subtitulo 3"
  }
];

function App() {
  return (
    <div>
      <h1>Hello App</h1>
      {
        titulos.map((dado) => (
          <Card key={dado.id} title={dado.titulo} subtitulo={dado.subtitulo} />
        ))
      }
      {/*<Card title = "Card1"/>
      <Card title = "Card1"/>
    <Card title = "Card1"/>*/}
    </div>
  )
}

export default App
