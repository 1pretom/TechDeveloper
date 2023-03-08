import { useState } from "react"

function App() {
    const [userNameInput, setUserNameInput] = useState([])
    const [userAgeInput, setUserAgeInput] = useState("")
    /* const [inputCidade, setCidade] = useState("") */
    const [listaDeUsuarios, setListaDeUsuarios] = useState([])



    function addUserList() {
        const newUser = {
            name: userNameInput,
            idade: userAgeInput
        };

        setUserNameInput([...listaDeUsuarios, newUser]);
        setInputText("")
    }

    return (
        <div>
            <h1>hello world</h1>
            {/* <h2>{inputText}</h2> */}

            <h3>{userNameInput}</h3>
            <h3>{userAgeInput}</h3>

            <input
                placeholder="Nome..."
                value={userNameInput}
                onChange={(event) => setUserNameInput(event.target.value)} />
            <input
                placeholder="Idade..."
                value={userAgeInput}
                onChange={(event) => setUserAgeInput(event.target.value)} />

            <ul>
                {listaDeUsuarios.map((item, indice) => (
                    <li key={indice}>
                        {item.name} - {item.idade}
                    </li>
                ))}
            </ul>
            <button onClick={addUserList}>Clicar</button>
        </div>
    )
};




export default App

/* const [count, setCount] = useState(0);

function incrementValue() {
    setCount(count + 1)
}

return (
    <div>
        <h1>Hello world</h1>
        <h2>{count}</h2>

        <button onClick={incrementValue}>Incrementar</button>
    </div> */