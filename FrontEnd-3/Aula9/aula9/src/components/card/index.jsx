import styles from "./style.module.css";

function Card(props) {


    /* const {jogador = "Usuário não passou"} = props */
/* if (!props.title){
    return null;
} */

const jogador=[
    {
        id: 1,
        nome: "Wash",
        nota: 66,
        ativo: true
    },
    {
        id: 2,
        nome: "Caio",
        nota: 68,
        ativo: false
    },
    {
        id: 3,
        nome: "Brego",
        nota: 67,
        ativo: true
    }
]
    return (
        <li className={jogador.ativo ? styles.colorBlue : styles.colorRed}>

            <h3>{props.jogador.nome}</h3>
            <p>{props.jogador.nota}</p>

        </li>

    )
}

export default Card;