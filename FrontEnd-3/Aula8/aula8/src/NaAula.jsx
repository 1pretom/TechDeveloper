import { useState } from "react";

// {
//   nome:"",
//   idade:""
// }

function NaAula() {
  const [userNameInput, setUserNameInput] = useState("");
  const [userAgeInput, setUserAgeInput] = useState("");

  const [listaDeUsuarios, setListaDeUsuarios] = useState([]);

  function addUserList() {
    const newUser = {
      idade: userAgeInput,
      name: userNameInput,
    };

    // listaDeUsuarios.push(newUser)

    setListaDeUsuarios([...listaDeUsuarios, newUser]);

    // alert(userAgeInput);
  }

  console.log(listaDeUsuarios);

  return (
    <div>
      <h1>Hello World</h1>

      <h3>{userNameInput}</h3>
      <h3>{userAgeInput}</h3>

      <input
        value={userNameInput}
        onChange={(event) => setUserNameInput(event.target.value)}
      />

      <br />
      <br />

      <input
        value={userAgeInput}
        onChange={(event) => setUserAgeInput(event.target.value)}
      />
      <br />
      <br />

      {/* <p>{JSON.stringify(listaDeUsuarios)}</p> */}

      <ul>
        {listaDeUsuarios.map((item, index) => (
          <li key={index}>
            {item.name} - {item.idade}
          </li>
        ))}
      </ul>

      <button onClick={addUserList}>Add</button>
    </div>
  );
}

export default NaAula;

