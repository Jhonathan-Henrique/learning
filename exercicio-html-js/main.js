const form = document.getElementById('form-validacao')

function validaFormulario(){
    let campoA = document.getElementById('campoA')
    let campoB = document.getElementById('campoB')
    if (campoA.value < campoB.value) { 
        alert ('Seu formulario nao e valido')
    } else {
        alert ('Seu formulario e valido') 
    }
}

form.addEventListener('submit', function(e){
    e.preventDefault();

    validaFormulario();
})