//DOM - manipular o HTML

// Maneiras de selecionar o HTML

// document.getElementaryByID() - Selecionar pelo id
// by tag - selecionar pela tag
// by class - selecionar pela classe
// queryy


const form = document.querySelector("#formProduto")
form.addEventListener('submit', function(event) {
    event.preventDefault()
    const nomeProduto = document.querySelector("#nome").value
    const marca = document.querySelector("#marca").value
    const tamanho = document.querySelector("#tamanho").value
    const preco = document.querySelector("#preco").value
    const quantidade = document.querySelector("#quantidade").value

    const dados = {
        nomeProduto: nomeProduto,
        marca: marca,
        tamanho: tamanho,
        preco: parseFloat(preco),
        quantidade: parseInt(quantidade)
    }
    fetch('http://localhost:8080/roupa' , {
        method : 'POST',
        headers: {
            "Content-Type" : 'application/json'
        },

        body : JSON.stringify(dados)
    })
    .then(responde => {

        if(Response.ok){
            Swal.fire({
                title : "ROUPA CADASTRADA COM SUCESSO",
                Text :  "ROUPA CADASTRADA" ,
                icon : "success"
            })
        } else {
            Swal.fire({
                title : "ERRO AO CADASTRAR",
                Text :  "ROUPA NÃO CADASTRADA" ,
                icon : "error"
            })
        }


    })
    .catch(erro => {
        Swal.fire({
                title : "ERRO AO CADASTRAR",
                Text :  "ROUPA NÃO CADASTRADA" ,
                icon : "error"
            })
    })
    })