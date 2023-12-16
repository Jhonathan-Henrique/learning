const form = document.getElementById('form-compra')

function validaNome(nomeCompleto) {
    const nomeComoArray = nomeCompleto.split(' ')
    return nomeComoArray.length > 2
}

form.addEventListener('submit', function (e) {
    let formEValido = false
    e.preventDefault()

    const nomeCompleto = document.getElementById('nome-completo')
    const nomeDoJogo = document.getElementById('nomeDoJogo')
    const nickDoJogo = document.getElementById('nickDoJogo')
    const diamantes = document.getElementById('diamantesComprados')
    const mensageSucess = `Jogo: <b> ${nomeDoJogo.value} </b> - Usuário: <b> ${nickDoJogo.value}  </b> - nome completo: <b> ${nomeCompleto.value} </b> - comprou <b> ${diamantes.value} </b> qtde de diamantes`


    formEValido = validaNome(nomeCompleto.value)
    if (formEValido) {
        document.querySelector('menssage-sucess').innerHTML = mensageSucess
    } else {
        alert('Seu nome não esta completo')
    }
})