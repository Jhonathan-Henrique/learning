const form = document.getElementById('form-deposito')

function validaNome(nomeCompleto) {
    const nomeComoArray = nomeCompleto.split(' ')
    return nomeComoArray.length > 2
}

form.addEventListener('submit', function(e){
    let formEValido = false
    e.preventDefault()

    const nomeBeneficiario = document.getElementById('nome-beneficiario')
    const numeroConta = document.getElementById('numero-conta')
    const valorDeposito = document.getElementById('valor-deposito')
    const mensageSucesso = `Deposito enviado para ${nomeBeneficiario.value} - conta: ${numeroConta.value} - valor: ${valorDeposito.value}` 

    formEValido = validaNome(nomeBeneficiario.value)
    if (formEValido) {
        alert (mensageSucesso)

        nomeBeneficiario.value = ' '
        numeroConta.value = ' '
        valorDeposito.value = ' '
    } else {
        alert('O nome não está completo')
    }
})