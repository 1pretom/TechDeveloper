function Card(props) {
    return (
        <div style={{ width: 70, border: "1px solid black" }}>
            <img width={40} src={props.img} alt={props.title}
            />
            <span>{props.title}</span>
        </div>
    );
}
export default Card

