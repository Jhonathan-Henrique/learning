const form = document.getElementById('form-deposito')

function validaNome(nomeCompleto) {
    const nomeComoArray = nomeCompleto.split(' ')
    return nomeComoArray.length >= 2
}

form.addEventListener('submit', function(e){
    e.preventDefault()

    const nomeBeneficiario = document.getElementById('nome-beneficiario')
    if (!validaNome(nomeBeneficiario.value)) {
        alert('Seu nome não esta completo por favor complete.')
    } else {
        alert ('Esta tudo certo')
    }
})