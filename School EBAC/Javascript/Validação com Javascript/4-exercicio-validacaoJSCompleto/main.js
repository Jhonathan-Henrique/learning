const form = document.getElementById('form-deposito')

function validaNome (nomeCompleto) {
    const nomeComoArray = nomeCompleto.split(' ')
    return nomeComoArray.length >= 2
}

form.addEventListener('submit', function(e){
    e.preventDefault()

    let formEValido = false

    const nomeBeneficiario = document.getElementById('nome-beneficiario')
    const numeroConta = document.getElementById('numero-conta')
    const valorDeposito = document.getElementById('valor-deposito')
    const mensagemSucesso = `Enviado com sucesso para ${nomeBeneficiario.value} - conta ${numeroConta.value} - com o valor: ${valorDeposito.value}`

    formEValido = validaNome(nomeBeneficiario.value)
    if(formEValido) {
        alert (mensagemSucesso)

        nomeBeneficiario.value = ''
        valorDeposito.value = ''
        numeroConta.value = ''

    } else {
        alert ('Seu nome nao esta completo')
    }
})