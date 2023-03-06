import "./styles.css";
import Header from "./componentes/Header";
import Footer from "./componentes/Footer";
import Card from "./componentes/Card";

function App() {
  return (
    <div className="container">
      <Header />

      <main>
        <h1 className="title">Hello</h1>
        
        <Card title="Javascript" 
        img="https://upload.wikimedia.org/wikipedia/commons/thumb/9/99/Unofficial_JavaScript_logo_2.svg/1200px-Unofficial_JavaScript_logo_2.svg.png" 
        />


        /*<button onClick={() => alert("ok")}> Clique aqui</button>*/


      </main>

      <Footer title="Olá usuário eu sou o footer" />
      <Footer title="Todos os direitos reservados" />
      <Footer />
    </div>
  )
};

export default App;