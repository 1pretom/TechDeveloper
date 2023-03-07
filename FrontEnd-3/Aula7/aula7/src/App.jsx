import { useState } from "react";

function App() {
    const [number, setNumber] = useState([])
    
    

    function addNumber() {
        setNumber([...number, number.length])
        /* setNumber([...number,60,70]) */
        
        /* number++; */
      /*   const copyNumbers = [...number]
        copyNumbers.push(60)
        setNumber(copyNumbers) */
    }

    return <div>
        <h1>numbers</h1>
        <ul>
            {number.map((number,index)=>(
                <li key = {index}>{number}</li>
            ))}
        </ul>
        
        <button onClick={addNumber}>click here</button>
    </div>
}


export default App;
