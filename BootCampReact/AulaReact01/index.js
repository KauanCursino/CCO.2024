var container = document.getElementById("root"); function
    Titulo(props) {
    return (
        <React.Fragment>
            <h1>{props.titulo}</h1>
            <h2>{props.descricao}</h2>
        </React.Fragment>
    );
}
function Titulos() {
    return (
        <>
            <Titulo titulo="Titulo legal" descricao="Descrição TOP" />
            <Titulo titulo="Titulo legal legal" descricao="Descrição TOP TOP" />
            <Titulo titulo="Titulo legal legal legal" descricao="Descrição TOP TOP TOP" />
        </>
    );
}
ReactDOM.createRoot(container).render(<Titulos />);