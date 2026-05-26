async function carregarProdutos() {
    try {
        let resposta = await fetch("http://localhost:8080/roupa") //Promisse
        console.log(resposta);
        let listaProdutos = await resposta.json();
        console.log(listaProdutos);

        let tabela = document.getElementById("tabelaProdutos")

        console.log(listaProdutos[0])
        tabela.innerHTML = ""
        listaProdutos.forEach(produto => {


            tabela.innerHTML += `
                <tr>
                    <td>${produto.id}</td>
                    <td>${produto.nome}</td>
                    <td>${produto.marca}</td>
                    <td>${produto.tamanho}</td>
                    <td>R$ ${produto.preco.toFixed(2)}</td>
                    <td>${produto.quantidade}</td>
                    <td>${(produto.quantidade * produto.preco).toFixed(2)}</td>
                    <td>
                        <button class="btn btn-dange btn-sm" title="Excluir Produto" onclick="excluirProduuto(${produto.id})"> <i class="bi bi-trash"></i></button>
                    </td>

                </tr>

            `
        })        
    } catch (erro) {
        console.erro("erro: ", erro)
    }
}

function excluirProduuto(id){
    fetch(`https://localhost:8080/roupa/${id}`, {
        method: "DELETE"
    })

    .then (response => {
        if (response.ok){
            swal.fire({
                title : "ROUPA EXCLUIDA COM SUCESSO",
                Text: "ROUPA EXCLUIDA",
                icon: "sucess"
            })
        }
    })
}


carregarProdutos()