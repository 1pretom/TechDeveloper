function Footer(props) {

    return (
        <footer>
            <center>{props.title ? props.title : "Valor Default"}</center>
        </footer>
    )
    
}
export default Footer;