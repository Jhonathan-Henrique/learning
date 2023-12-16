const form = document.getElementById('form-deposito')
const nomeBeneficiario = document.getElementById('nome-beneficiario')

function validaNome(nomeCompleto) {
    const nomeComoArray = nomeCompleto.split(' ')
    return nomeComoArray.length > 2
}

form.addEventListener('submit', function(e){
    let formEValido = false
    e.preventDefault()

    
    const numeroConta = document.getElementById('numero-conta')
    const valorDeposito = document.getElementById('valor-deposito')
    const mensageSucesso = `Deposito enviado para <b>${nomeBeneficiario.value}</b> - conta <b>${numeroConta.value}</b> com o valor: <b>${valorDeposito.value}</b>`

    formEValido = validaNome(nomeBeneficiario.value)
    if(formEValido) {
        const containerMensage = document.querySelector('.sucess-mensage')
        containerMensage.innerHTML = mensageSucesso
        containerMensage.style.display = 'block'
    } else {
        nomeBeneficiario.style.border = '2px solid red'
        const containerMensageError = document.querySelector('.error-message').style.display = 'block'
      
    }
})

nomeBeneficiario.addEventListener('change', function(e){
    console.log(e)
})