const form = document.getElementById('form-deposito');

function validaNome(nomeCompleto){
    const nomeComoArray = nomeCompleto.split(' ')
    return nomeComoArray.length >= 2;
}

form.addEventListener('submit', function(e){
    e.preventDefault();

    const nomeBeneficiario = document.getElementById('nome-beneficiario')
    const numeroContaBeneficiario = document.getElementById('numero-conta')
    const valorDeposito = document.getElementById('valor-deposito')
    const mensagemSucesso = `Montante de: <b>${valorDeposito.value}</b> <br> Depositado para o cliente:<b>${nomeBeneficiario.value}</b> <br> Conta:<b>${numeroContaBeneficiario.value}</b>`
    const mensagemErro = `Montante de: <b>${valorDeposito.value}</b> <br> Depositado para o cliente:<b>${nomeBeneficiario.value}</b> <br> Conta:<b>${numeroContaBeneficiario.value}</b> <br> <b>Não Foi Enviado!</b>`

    formEValido = validaNome(nomeBeneficiario.value)
    if (formEValido) {
        const containerMensagemSucesso = document.querySelector('.sucess-mensage')
        containerMensagemSucesso.innerHTML = mensagemSucesso
        containerMensagemSucesso.style.display = 'block'

        nomeBeneficiario.value = '';
        numeroContaBeneficiario.value = '';
        valorDeposito.value = '';
    } else {
        const containerMensagemError = document.querySelector('.error-mensage')
        containerMensagemError.innerHTML = mensagemErro
        containerMensagemError.style.display = 'block'
    }
})

console.log(form);