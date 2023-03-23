import axios from "axios"
import { useEffect } from "react";

function App() {
  const [products, setProducts] = useState([]);
  const [title, setTitle] = useState();
  const [date, setDate] = useState();
   async function getProducts(){
    /* const response = await fetch("http://dunnyjson.com/products")
    const data = await response.json() */

    try {
      const response = await axios.get("http://dunnyjson.com/products")
      setproducts(response.data.products);
      
    } catch (error) {
      alert("Erro ao uscar dados")
      
    }
  }

  useEffect(() => {
    getProducts();
  }, []);
}
return(
  <>
  <h1>Hello world</h1>
<ul>
  {todos.map((todo)=>(
    <div key={todo._id} style={{border: "1px solid #999", marginBottom: 5}}>

    </div>
  ))}
</ul>

  <p>{JSON.stringify(products)}</p>
  </>
)

export default App
